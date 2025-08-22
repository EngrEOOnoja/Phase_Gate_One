const prompt = require('prompt-sync')();	
new_car = [];

function main_menu(){
    console.log(`
    Welcome to your Best Car Park...!
    List of menu....!
    1. Add Cars
    0. Remove Cars.
    99. Show All Car Space.
    9. Exit.
      `)
      
    let menup = prompt("Enter your choice: ");
    switch (menup){
    	case '1':
        	let  pack_car = prompt("Enter 1 to add: ");
        	console.log(addCars(pack_car));
         	main_menu();
         	break;
        case '0':
        	let unpack_car = prompt("Enter 0 to unpack: ");
        	console.log(remove_car(unpack_car));
        	main_menu();
        
        case '9': 
        	exit_program();
         default:
         	console.log("Enter valid input: ");
           	mainMenu();
            	break;
            }
            }
 

function addCars(pack_car){
	if (pack_car == 1){
		new_car.push(pack_car).join
		return new_car;
		}
	else return "Car Park Filled  ";
	
	}
	
	
function remove_car(unpack_car){
	if (unpack_car == 0){
		new_car.pop(unpack_car).join
		return new_car;
		}
	else	return "Car Space Empty";
	}
	
function showSpace() {
    	console.log("Available Slots:");
    	for (let index = 0; index < new_car.length; index++) {
      	let output =  console.log(new_car[index]);
    }

}

		
function exit(){
    print("Thank You For Choosing Us")
    exit()
	}

	
main_menu();
