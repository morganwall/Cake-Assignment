package net.mlwall.cake;
import java.util.*;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import static net.mlwall.cake.Utils.input;

public class Ingredients
{   
    public static void printTotal()
    {
        ArrayList tempArr = new ArrayList();
        ArrayList currentOrders = new ArrayList(); // Will be used to store all the current order cake types.
        int[] totalIngredients = new int[6]; // Butter, Sugar, Egg, Flour, Vanilla, srFlour
        
        for (int i = 0; i < Order.orders.size(); i++) // Loop through the orders HashMap.
        {
            LocalDate curDate = LocalDate.now(); // Gets the current date.
            tempArr = Order.orders.get(i); // Gets current order.
            String cakeType = tempArr.get(5).toString(); // Gets the cake type, and converts it to a string.
            
            if (curDate.isBefore((ChronoLocalDate) tempArr.get(9))) // Checks to see if the order isn't old.
            {
                currentOrders.add(cakeType); // Adds the cake type to the currentOrders arraylist.
            }
        }
        tempArr.clear();
        
        for (int i = 0; i < currentOrders.size(); i++)
        {
            tempArr = Recipe.recipes.get(currentOrders.get(i)); // Gets the HashMap entity with the key from currentOrders.
            
            int k = -1;
            for (int j = 1; j < 7; j++) // Manually setting the size as it was crashing before. Should replace this as it'd have to be manually changed if we ->
            {                           // -> wanted to parse more elements, which is stupid. Works for now though and what I need it to do :)
                k++;
                totalIngredients[k] += Integer.parseInt(tempArr.get(j).toString());
            }
        }
        
        System.out.println("Butter: " + totalIngredients[0] + "g");
        System.out.println("Sugar: " + totalIngredients[1] + "g");
        System.out.println("Eggs: " + totalIngredients[2]);
        System.out.println("Flour: " + totalIngredients[3] + "g");
        System.out.println("Vanilla: " + totalIngredients[4] + "tsp");
        System.out.println("Self-Raising Flour: " + totalIngredients[5] + "g");
    }
}
