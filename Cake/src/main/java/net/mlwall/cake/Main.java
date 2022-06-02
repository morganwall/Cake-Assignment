package net.mlwall.cake;
import java.util.*;
import static net.mlwall.cake.Utils.input;

public class Main
{
    static boolean bExit = false;
    
    public static void main(String[] args)
    {        
        Recipe.init();
        Order.init();
        
        while (!bExit)
        {
            System.out.println("1: Recipes | 2: Orders | 3: Exit");
            
            switch (input.nextInt())
            {
                case 1: // Recipes
                {
                    System.out.println("1: Add | 2: Delete | 3: View | 4: Required | 5: Exit");
                    
                    switch (input.nextInt())
                    {
                        case 1: // Add: Done
                        {
                            Recipe.newRecipe();
                            Utils.doExit();
                            break;
                        }
                        
                        case 2: // Delete: Done
                        {
                            System.out.println("Please Enter the Name of the Recipe You Want to Delete: ");
                            input.nextLine(); // Added due to the next input.nextLine catching the enter press.
                            Recipe.deleteRecipe(input.nextLine());
                            Utils.doExit();
                            break;
                        }
                        
                        case 3: // View: Done
                        {
                            System.out.println(Recipe.recipes);
                            Utils.doExit();
                            break;
                        }
                        
                        case 4: // Required: Done
                        {
                            Ingredients.printTotal();
                            Utils.doExit();
                            break;
                        }
                        
                        case 5: // Exit: Done
                        {
                            bExit = true;
                            break;
                        }
                        
                        default:
                        {
                            Utils.caseDef();
                        }
                    }
                    break;
                }
                
                case 2: // Orders
                {
                    System.out.println("1: Add | 2: Delete | 3: View All | 4: View Current | 5: View Old | 6: Exit");
                    
                    switch (input.nextInt())
                    {
                        case 1: // Add: Done
                        {
                            Order.newOrder();
                            System.out.println(Order.orders);
                            Utils.doExit();
                            break;
                        }
                        
                        case 2: // Delete: Done
                        {
                            System.out.println("Please Enter the ID of the Order You Want to Delete: ");
                            Order.deleteOrder(input.nextInt());
                            Utils.doExit();
                            break;
                        }
                        
                        case 3: // View All: Done
                        {
                            Order.printAll();
                            Utils.doExit();
                            break;
                        }
                        
                        case 4: // View Current: Done
                        {
                            Order.printCurrent();
                            Utils.doExit();
                            break;
                        }
                        
                        case 5: // View Old: Done
                        {
                            Order.printOld();
                            Utils.doExit();
                            break;
                        }
                        
                        case 6: // Exit: Done
                        {
                            bExit = true;
                            break;
                        }
                        
                        default:
                        {
                            Utils.caseDef();  
                        }
                    }    
                    break;
                }
                
                case 3:
                {
                    bExit = true;
                    break;
                }
                 
                default:
                {
                    Utils.caseDef();
                }
            }
        }
    }
}