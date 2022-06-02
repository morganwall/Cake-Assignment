package net.mlwall.cake;
import java.util.*;
import static net.mlwall.cake.Utils.input;

public class Recipe
{   
    public static HashMap<String, ArrayList> recipes = new HashMap(); // Creates a HashMap named recipes, which takes in strings for the keys and arraylists.
    
    public static void newRecipe()
    {
        ArrayList tempArr = new ArrayList(); // Creates a new ArrayList named tempArr.
        
        System.out.println("Enter Recipe Name: ");
        input.nextLine();
        String Name = input.nextLine(); // The name input will be used later for the Key.
        tempArr.add(Name);
        System.out.println("Enter Butter(g): ");
        tempArr.add(input.nextInt()); // Adds the user's input to the array list.
        System.out.println("Enter Sugar(g): ");
        tempArr.add(input.nextInt());
        System.out.println("Enter Eggs: ");
        tempArr.add(input.nextInt());
        System.out.println("Enter Flour(g): ");
        tempArr.add(input.nextInt());
        System.out.println("Enter Vanilla(tsp): ");
        tempArr.add(input.nextInt());
        System.out.println("Enter Self-Raising Flour(g): ");
        tempArr.add(input.nextInt());
        System.out.println("Enter Cooking Time(m): ");
        tempArr.add(input.nextInt());
        System.out.println("Enter Cooking Temperature(C): ");
        tempArr.add(input.nextInt());
        input.nextLine(); // Added due to the next input.nextLine catching the enter press.
        System.out.println("Enter Cooking Method: ");
        tempArr.add(input.nextLine());
        
        recipes.put(Name, tempArr); // Adds the ArrayList to the HashMap, using the Name String variable as the key.
    }
    
    public static void newRecipe(String Name, int Butter, int Sugar, int Egg, int Flour, int Vanilla, int srFlour, int time, int temp, String method)
    {
        ArrayList tempArr = new ArrayList();
        
        tempArr.add(Name);
        tempArr.add(Butter);
        tempArr.add(Sugar);
        tempArr.add(Egg);
        tempArr.add(Flour);
        tempArr.add(Vanilla);
        tempArr.add(srFlour);
        tempArr.add(time);
        tempArr.add(temp);
        tempArr.add(method);
        
        recipes.put(Name, tempArr);
    }
    
    public static void deleteRecipe(String Name)
    {
        recipes.remove(Name); // Removes the HashMap entry coresponding to the key Name.
    }
    
    public static void printRecipe(String Name)
    {
        ArrayList<Integer> tempArr = new ArrayList(); // Creates a new ArrayList named tempArr.
        tempArr = recipes.get(Name); // Takes the data from the HashMap entry that corresponds with Name and puts it in tempArr.
        int[] tempIntArr = new int[tempArr.size()]; // Creates an int array, named tempIntArr, with the size of tempArr.
        
        for (int i = 0; i < tempArr.size(); i++) // Loops through tempArr, storing the data in tempIntArr, until i equals the same as the size of tempArr.
        {
            tempIntArr[i] = tempArr.get(i);
        }
        
        // Prints all the data in tempIntArr in a formatted manner.
        System.out.println("Name: " + tempIntArr[0]);
        System.out.println("Butter: " + tempIntArr[1] + "g");
        System.out.println("Sugar: " + tempIntArr[2] + "g");
        System.out.println("Eggs: " + tempIntArr[3]);
        System.out.println("Flour: " + tempIntArr[4] + "g");
        System.out.println("Vanilla: " + tempIntArr[5] + "tsp");
        System.out.println("Self-Raising Flour: " + tempIntArr[6] + "g");
        System.out.println("Cooking Time: " + tempIntArr[7] + "m");
        System.out.println("Cooking Temperature: " + tempIntArr[8] + "C");
        System.out.println("Cooking Method: " + tempIntArr[9]);
    }
    
    public static void init()
    {
        newRecipe("Sponge Cake", 225, 225, 4, 225, 1, 225, 30, 180, "Bake in centre of oven.");      // Creates a new recipe.
        newRecipe("Vanilla Party Cake", 225, 350, 5, 325, 1, 0, 40, 180, "Bake in centre of oven."); // ^^
    }
}