package net.mlwall.cake;
import java.util.*;
import static net.mlwall.cake.Main.bExit;

public class Utils {
    static Scanner input = new Scanner(System.in);
    
    public static void CLS() // Clears console. Tried several things to mimic cls though couldn't get any of them to actually work in the NetBeans console.
    {                        // This kinda works, though it's ugly.
        for(int i = 0; i < 500; i++)
        {
            System.out.println("\b");
        }
    }
    
    public static void doExit()
    {
        System.out.println("1: Back | 2: Exit");
        
        switch (input.nextInt())
        {
            case 1:
                Utils.CLS();
                break;
            case 2:
                bExit = true;
                break;
        }
    }
    
    public static void caseDef()
    {
        System.out.println("Invalid Option! Please enter a valid option.");
        try
            {
                Thread.sleep(3000); // Sleeps for 3000 milliseconds.
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            CLS();
    }
}
