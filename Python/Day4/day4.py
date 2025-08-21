items = []

def main_menu():
    print("""
    Welcome to your Best Shopping Chart...!
    List of menu....!
    1. Add items.
    2. Remove items.
    3. Show All Items
    0. Exit.
    """)
    menup = int(input("Enter your choice: "))
    match menup:
        case 1:
            newItem = input("Enter item to add: ")
            print(getAddedItems(newItem))
            main_menu()
        case 2:
            removeItem = input("Enter item to remove: ")
            print(letRemovedItems(removeItem))
            main_menu()
        case 3:
            showAllItems()
            main_menu()
        case 0:
            exit_program()
        case _:
            print("Enter valid input: ")
            main_menu()

def getAddedItems(newItem):
    if newItem not in items:
        items.append(newItem)
        return newItem + " added successfully."
    else:
        return newItem + " already exists."

def letRemovedItems(removeItem):
    if removeItem in items:
        items.remove(removeItem)
        return removeItem + " removed successfully."
    else:
        return removeItem + " Item not in the list...!"

def showAllItems():
    print("Available Items:")
    for item in items:
        print(item)

def exit():
    print("Thank You For Choosing Us")
    exit()

main_menu()
