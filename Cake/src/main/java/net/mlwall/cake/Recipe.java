package net.mlwall.cake;
import java.util.*;
import static net.mlwall.cake.Utils.input;

public class Recipe
{   
    public static HashMap<String, ArrayList> recipes = new HashMap();
    
    public static void newRecipe()
    {
        ArrayList tempArr = new ArrayList();
        
        System.out.println("Enter Recipe Name: ");
        input.nextLine();
        String Name = input.nextLine(); // The name input will be used later for the Key.
        tempArr.add(Name);
        System.out.println("Enter Butter(g): ");
        tempArr.add(input.nextInt());
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
        
        recipes.put(Name, tempArr);
    }
    
    public static void newRecipe(String Name, int Butter, int Sugar, int Egg, int Flour, int Vanilla, int srFlour)
    {
        ArrayList tempArr = new ArrayList();
        
        tempArr.add(Name);
        tempArr.add(Butter);
        tempArr.add(Sugar);
        tempArr.add(Egg);
        tempArr.add(Flour);
        tempArr.add(Vanilla);
        tempArr.add(srFlour);
        
        recipes.put(Name, tempArr);
    }
    
    public static void deleteRecipe(String Name)
    {
        recipes.remove(Name);
    }
    
    public static void printRecipe(String Name)
    {
        ArrayList<Integer> tempArr = new ArrayList();
        tempArr = recipes.get(Name);
        int[] tempIntArr = new int[tempArr.size()];
        
        for (int i = 0; i < tempArr.size(); i++)
        {
            tempIntArr[i] = tempArr.get(i);
        }
        
        System.out.println("Name: " + tempIntArr[0]);
        System.out.println("Butter: " + tempIntArr[1] + "g");
        System.out.println("Sugar: " + tempIntArr[2] + "g");
        System.out.println("Eggs: " + tempIntArr[3]);
        System.out.println("Flour: " + tempIntArr[4] + "g");
        System.out.println("Vanilla: " + tempIntArr[5] + "tsp");
        System.out.println("Self-Raising Flour: " + tempIntArr[6] + "g");
    }
    
    public static void init()
    {
        newRecipe("Sponge Cake", 225, 225, 4, 225, 1, 225);
        newRecipe("Vanilla Party Cake", 225, 350, 5, 325, 1, 0);
    }
}