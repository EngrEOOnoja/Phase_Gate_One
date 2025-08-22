/* Pseudo Code
	*  create an empty placeholder to collect number of parking space in the lots.
	*  Allot parking space to each custom at available spaces.
	* give options to display the number of available lots and the onces occupied.
	* Let the users know if thereare available spaces left in the lot or not.
	* Allow user to remove cars at request and display how many lots are left.
*/


import java.util.ArrayList;
import java.util.Scanner;

public class CarParks {
    static ArrayList<Integer> newCar = new ArrayList<>();
    	static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
    
        		mainMenu();
    }

    public static void mainMenu() {
       String list = ("""
       			         Welcome to your Best Car Parking Lot...!
                List of menu....!
            		    1. Add items.
             		   0. Remove items.
           		     99. Show All Items
       			         9. Exit.
                """);
     System.out.print(list);
      int menup = input.nextInt();
       switch (menup){
       case 1:
        	System.out.print("Enter 1 to add: ");
        	int userInput = input.nextInt();
        	addCars(userInput);
         	mainMenu();
               	break;
        case 0:
        	System.out.print("Enter 0 to unpack: ");
        	int userInput2 = input.nextInt();
        	removeCar(userInput2);
        	mainMenu();
        
        case 9: 
        	exit();
         default:
         	System.out.print("Enter valid input: ");
           	mainMenu();
            	break;
           	 }
            }


    public static void addCars(int packCar) {
      if (packCar == 1){
		newCar.add(packCar);
		System.out.print(newCar);
		}
	else System.out.print("Car Park Filled");
    }



    public static void removeCar(int unpackCar) {
                     if (unpackCar == 0){
		newCar.remove(unpackCar);
		System.out.print(newCar);
		}
	else	System.out.print("Car Space Empty");
	}
    
    

    public static void  showAllItems() {
       System.out.print("Available Items:");
        for (int car : newCar) {
      	System.out.print(car);
      	 }
    }

    public static void exit() {
        System.out.print("Thank You For Choosing Us");
        System.exit(99);
    }
}

