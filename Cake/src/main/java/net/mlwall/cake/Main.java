package net.mlwall.cake;
import java.util.*;
import static net.mlwall.cake.Utils.input;

public class Main
{
    static boolean bExit = false; // Creates a variable called bExit, with the type static boolean.
    
    public static void main(String[] args)
    {        
        Recipe.init(); // Initialises some example recipes and orders.
        Order.init();  // ^^
        
        while (!bExit) // Loops while bExit equals false.
        {
            System.out.println("1: Recipes | 2: Orders | 3: Exit");
            
            switch (input.nextInt()) // Switch statement based on user input.
            {
                case 1: // Recipes
                {
                    System.out.println("1: Add | 2: Delete | 3: View | 4: Required | 5: Exit");
                    
                    switch (input.nextInt())
                    {
                        case 1: // Add: Done
                        {
                            Recipe.newRecipe(); // Calls the newRecipe function.
                            Utils.doExit(); // Calls the doExit function.
                            break; // Breaks out of the case.
                        }
                        
                        case 2: // Delete: Done
                        {
                            System.out.println("Please Enter the Name of the Recipe You Want to Delete: ");
                            input.nextLine(); // Added due to the next input.nextLine catching the enter press.
                            Recipe.deleteRecipe(input.nextLine()); // Calls the deleteRecipe function, passing the user input.
                            Utils.doExit(); // Calls the doExit function.
                            break; // Breaks out of the case.
                        }
                        
                        case 3: // View: Done
                        {
                            System.out.println(Recipe.recipes); // Prints all the contents of the recipes HashMap.
                            Utils.doExit(); // Calls the doExit function.
                            break; // Breaks out of the case.
                        }
                        
                        case 4: // Required: Done
                        {
                            Ingredients.printTotal(); // Calls the printTotal function.
                            Utils.doExit(); // Calls the doExit function.
                            break; // Breaks out of the case.
                        }
                        
                        case 5: // Exit: Done
                        {
                            bExit = true; // Sets bExit equal to true.
                            break; // Breaks out of the case.
                        }
                        
                        default:
                        {
                            Utils.caseDef(); // Calls the caseDef function.
                        }
                    }
                    break; // Breaks out of the case.
                }
                
                case 2: // Orders
                {
                    System.out.println("1: Add | 2: Delete | 3: View All | 4: View Current | 5: View Old | 6: Exit");
                    
                    switch (input.nextInt()) // Switch statement based on user input.
                    {
                        case 1: // Add: Done
                        {
                            Order.newOrder(); // Calls the newOrder function.
                            System.out.println(Order.orders); // Prints the contents of the orders HashMap.
                            Utils.doExit(); // Calls the doExit function.
                            break; // Breaks out of the case.
                        }
                        
                        case 2: // Delete: Done
                        {
                            System.out.println("Please Enter the ID of the Order You Want to Delete: ");
                            Order.deleteOrder(input.nextInt()); // Calls the deleteOrder function, passing the user input.
                            Utils.doExit(); // Calls the doExit function.
                            break; // Breaks out of the case.
                        }
                        
                        case 3: // View All: Done
                        {
                            Order.printAll(); // Calls the printAll function.
                            Utils.doExit(); // Calls the doExit function.
                            break; // Breaks out of the case.
                        }
                        
                        case 4: // View Current: Done
                        {
                            Order.printCurrent(); // Calls the printCurrent function.
                            Utils.doExit(); // Calls the doExit function.
                            break; // Breaks out of the case.
                        }
                        
                        case 5: // View Old: Done
                        {
                            Order.printOld(); // Calls the printOld function.
                            Utils.doExit(); // Calls the doExit function.
                            break; // Breaks out of the case.
                        }
                        
                        case 6: // Exit: Done
                        {
                            bExit = true; // Sets bExit equal to true;
                            break; // Breaks out of the case.
                        }
                        
                        default:
                        {
                            Utils.caseDef(); // Calls the caseDef function.
                        }
                    }    
                    break; // Breaks out of the case.
                }
                
                case 3:
                {
                    bExit = true; // Sets bExit equal to true.
                    break; // Breaks out of the case.
                }
                 
                default:
                {
                    Utils.caseDef(); // Calls the caseDef function.
                }
            }
        }
    }
}