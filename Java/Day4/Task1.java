import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    static ArrayList<String> items = new ArrayList<>();
    	static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
    
        		mainMenu();
    }

    public static void mainMenu() {
       String list = ("""
       			         Welcome to your Best Shopping Chart...!
                List of menu....!
            		    1. Add items.
             		   2. Remove items.
           		     3. Show All Items
       			         0. Exit.
                """);
                System.out.print(list);
        int menup = input.nextInt();
   		     switch (menup) {
      	      case 1:
      	      	System.out.print("Enter item to add: ");
      	      	  String newItem = input.next();
                	getAddedItems(newItem);
               		 mainMenu();
           		     break;
            case 2:
            	System.out.print("Enter item to remove: ");
			String removeItem = input.next();
              		  letRemovedItems(removeItem);
             		   mainMenu();
             		   break;
            case 3:
              		  showAllItems();
              		  mainMenu();
                		break;
            case 0:
            		    exit();
            		    break;
            default:
               		 System.out.print("Enter valid input: ");
            		    mainMenu();
            		    break;
        }
    }

    public static String getAddedItems(String newItem) {
        System.out.print("Enter item to add: ");
                if (!items.contains(newItem)) {
            items.add(newItem);
            return (newItem + " added successfully.");
        } else {
            return (newItem + " already exists.");
        }
    }

    public static String letRemovedItems(String removeItem) {
                      if (items.remove(removeItem)) {
            return removeItem + " removed successfully.";
        } else {
            return removeItem +" Item not in the list...!";
        }
    }

    public static void  showAllItems() {
    	
       System.out.print("Available Items:");
        for (String item : items) {
          System.out.print(item);
        }
    }

    public static void exit() {
        System.out.print("Thank You For Choosing Us");
        System.exit(0);
    }
}
