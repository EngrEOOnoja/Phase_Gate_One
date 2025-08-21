function mainMenu() {
       let list = ("""
       			         Welcome to your Best Shopping Chart...!
                List of menu....!
            		    1. Add items.
             		   2. Remove items.
           		     3. Show All Items
       			         0. Exit.
                """);
               console.log(list);
        lett menup = input.nextInt();
   		     switch (menup) {
      	      case 1:
      	      	System.out.print("Enter item to add: ");
      	      	  String newItem = input.next();
                	getAddedItems(newItem);
               		 mainMenu();
           		     break;
            case 2:
            	console.log("Enter item to remove: ");
			let removeItem = input.next();
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
               		 console.log("Enter valid input: ");
            		    mainMenu();
            		    break;
        }
    }

    function getAddedItems(String newItem) {
       console.logt("Enter item to add: ");
                if (!items.contains(newItem)) {
            items.push(newItem);
            return (newItem + " added successfully.");
        } else {
            return (newItem + " already exists.");
        }
    }

 function letRemovedItems(String removeItem) {
                      if (items.pop(removeItem)) {
            return removeItem + " removed successfully.";
        } else {
            return removeItem +" Item not in the list...!";
        }
    \

   function  showAllItems() {
    	
       console.logt("Available Items:");
        for (let index = 0; index < items; index++) {
          console.log(item);
        }
    }

    public static void exit() {
        console.log("Thank You For Choosing Us");
        exit(0);
    }
}

