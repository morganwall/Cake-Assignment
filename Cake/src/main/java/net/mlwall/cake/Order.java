package net.mlwall.cake;
import java.util.*;
import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import static net.mlwall.cake.Utils.input;

public class Order
{
    public static HashMap<Integer, ArrayList> orders = new HashMap(); // Creates a new HashMap named orders.
    public static ArrayList deletedOrder = new ArrayList(); // Creates an empty ArrayList called deletedOrder.
    
    public static void newOrder()
    {
        ArrayList tempArr = new ArrayList();
        int orderID = orders.size();
        LocalDate curDate = LocalDate.now();
        
        input.nextLine(); // Catch the enter input from selecting the menu option.
        System.out.println("Name: ");
        tempArr.add(input.nextLine());
        System.out.println("Contact Number: ");
        tempArr.add(input.nextLine());
        System.out.println("Email: ");
        tempArr.add(input.nextLine());
        System.out.println("House Number: ");
        tempArr.add(input.nextLine());
        System.out.println("Post Code: ");
        tempArr.add(input.nextLine());
        System.out.println("Cake Type: ");
        tempArr.add(input.nextLine());
        System.out.println("Tin Surface Area(cm): ");
        tempArr.add(input.nextFloat());
        System.out.println("1: Round Tin | 2: Square Tin");
        switch (input.nextInt())
        {
            case 1:
            {
                tempArr.add("Round Tin");
                break;
            }
            
            case 2:
            {
                tempArr.add("Square Tin");
                break;
            }
            
            default:
            {
                System.out.println("Invalid Tin Shape!");
                break;
            }
        }
        tempArr.add(curDate);
        tempArr.add(curDate.plusDays(3)); // Delivery Date
        
        orders.put(orderID, tempArr);
        System.out.println("Order Added.");
    }
    
    public static void newOrder(String Name, String ContactNumber, String Email, int HouseNumber, String PostCode, String CakeType, float TinSurfaceArea, String TinShape)
    {
        ArrayList tempArr = new ArrayList();
        int orderID = orders.size();
        LocalDate curDate = LocalDate.now();
        
        tempArr.add(Name);
        tempArr.add(ContactNumber);
        tempArr.add(Email);
        tempArr.add(HouseNumber);
        tempArr.add(PostCode);
        tempArr.add(CakeType);
        tempArr.add(TinSurfaceArea);
        tempArr.add(TinShape);
        tempArr.add(curDate);
        tempArr.add(curDate.plusDays(3));
        
        orders.put(orderID, tempArr);
    }
    
    public static void newOrder(String Name, String ContactNumber, String Email, int HouseNumber, String PostCode, String CakeType, float TinSurfaceArea, String TinShape, LocalDate Date)
    {
        ArrayList tempArr = new ArrayList();
        int orderID = orders.size();
        LocalDate curDate = LocalDate.now();
        
        tempArr.add(Name);
        tempArr.add(ContactNumber);
        tempArr.add(Email);
        tempArr.add(HouseNumber);
        tempArr.add(PostCode);
        tempArr.add(CakeType);
        tempArr.add(TinSurfaceArea);
        tempArr.add(TinShape);
        tempArr.add(Date);
        tempArr.add(Date.plusDays(3));
        
        orders.put(orderID, tempArr);
    }
    
    public static void deleteOrder(int ID)
    {
        //orders.remove(ID);
        orders.replace(ID, orders.get(ID), deletedOrder); // Replaces the record we want to delete with a blank arraylist. This is a temp fix, done just to keep the arraylist size correct.
        // TODO: If I have time, replace this with something that changes the IDs of the orders so that we can actually make the HashMap smaller.
    }
    
    public static void printAll()
    {
        for (int i = 0; i < orders.size(); i++)
        {
            System.out.println(orders.get(i)); 
        }
    }
    
    public static void printCurrent()
    {
        ArrayList tempArr = new ArrayList();
        
        for (int i = 0; i < orders.size(); i++)
        {
            tempArr = orders.get(i);
            LocalDate curDate = LocalDate.now();
            
            if (curDate.isBefore((ChronoLocalDate) tempArr.get(9))) // Checks to see if the order date is after the current date.
            {
                System.out.println(orders.get(i));
            }
        }
    }
    
    public static void printOld()
    {
        ArrayList tempArr = new ArrayList();
        
        for (int i = 0; i < orders.size(); i++)
        {
            tempArr = orders.get(i);
            LocalDate curDate = LocalDate.now();
            
            if (curDate.isAfter((ChronoLocalDate) tempArr.get(9))) // Checks to see if the order date is before the current date.
            {
                System.out.println(orders.get(i));
            }
        }
    }
    
    public static void init()
    {
        newOrder("Josh", "07951557337", "josh@gmail.com", 12, "TS10 8JE", "Sponge Cake", 30.0f, "Square");
        newOrder("Jack", "07951757733", "jack@gmail.com", 92, "TS11 2KF", "Vanilla Party Cake", 42.0f, "Square");
        newOrder("Ben", "07952454747", "ben@gmail.com", 92, "TS10 6SD", "Sponge Cake", 28.0f, "Square");
        newOrder("Tom", "07955753712", "tom@gmail.com", 34, "TS11 5GX", "Sponge Cake", 38.5f, "Round", LocalDate.of(2022, 05, 20));
    }
}
