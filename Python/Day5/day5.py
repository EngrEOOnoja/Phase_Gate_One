#/* Pseudo Code
#	*  create an empty placeholder to collect number of parking space in the lots.
#	*  Allot parking space to each custom at available spaces.
#	* give options to display the number of available lots and the onces occupied.
#	* Let the users know if thereare available spaces left in the lot or not.
#	* Allow user to remove cars at request and display how many lots are left.
#*/

new_car = []
def main_menu():
    print("""
    Welcome to your Best CarPark...!
    List of menu....!
    1. Add Cars
    2. Show Available Car Space.
    0. Remove Cars.
    9. Exit.
      """)
    menup = int(input("Enter your choice: "))
    match menup:
        case 1:
            pack_car = input("Enter index to add: ")
            print(addCars(pack_car))
            main_menu()
        case 0:
            unpack_car = input("Enter index to unpack: ")
            print(remove_car(unpack_car))
            main_menu()
        case 9: 
        	exit_program()
        case _:
            print("Enter valid input: ")
            main_menu()


 

def addCars(pack_car):
	if (len(new_car) < 20):
		new_car.append(pack_car)
		return new_car
	else:
		return "Car Park Filled"
	
	
	
def remove_car(unpack_car):
	if (0 > len(new_car) > 21):
		new_car.remove(unpack_car)
		return new_car
	else:
		return "Car Space Empty"
		
	
		
def exit():
    print("Thank You For Choosing Us")
    exit()

main_menu()



 
	
	
	
