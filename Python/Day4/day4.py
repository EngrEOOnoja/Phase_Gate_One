import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    static ArrayList<String> items = new ArrayList<>();
    	static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
    
        		mainMenu();
    }
def main_enu():
	list = ("""
       	Welcome to your Best Shopping Chart...!
        List of menu....!
        1. Add items.
         2. Remove items.
        3. Show All Items
       	 0. Exit.
        """);
         print(list);
        menup = input.nextInt();
   	match (menup):
      		case 1:
      	        	print("Enter item to add: ");
      	      		newItem = input.next();
                	getAddedItems(newItem);
               		mainMenu();
           		break
           	case 2:
            		print("Enter item to remove: ")
			removeItem = input.next()
			letRemovedItems(removeItem)
			mainMenu();
             		break
             	case 3:
             		showAllItems()
              		mainMenu()
                	break
            case 0:
            		exit()
            		break
            default:
               		print("Enter valid input: ")
            		mainMenu()
            		break
        
        
        
	def getAddedItems(String newItem):
		print("Enter item to add: ")
                if (!items.contains(newItem)):
			items.add(newItem)
                	return (newItem + " added successfully.");
		else:
                return (newItem + " already exists.")
        
    

def letRemovedItems(String removeItem):
	if (items.remove(removeItem)):
            return removeItem + " removed successfully."
        else:
        	return removeItem +" Item not in the list...!"
        
    

def  showAllItems():
	System.out.print("Available Items:")
	for (String item : items):
		System.out.print(item)
        

def exit():
	System.out.print("Thank You For Choosing Us")
	System.exit(0)
    


