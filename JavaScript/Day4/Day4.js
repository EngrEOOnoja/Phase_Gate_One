const prompt = require('prompt-sync')();
let items = [];

function mainMenu() {
    console.log(`Welcome to your Best Shopping Chart...! 
    List of menu....! 
    1. Add items. 
    2. Remove items.  
    0. Exit.
    
     `);
    let menup = prompt('Enter your choice: ');
    switch (menup) {
        case '1':
            let newItem = prompt("Enter item to add: ");
            console.log(getAddedItems(newItem));
            mainMenu();
            break;
        case '2':
            let removeItem = prompt("Enter item to remove: ");
            console.log(letRemovedItems(removeItem));
            mainMenu();
            break;
        case '3':
            showAllItems();
            mainMenu();
            break;
        case '0':
            exit();
            break;
        default:
            console.log("Enter valid input: ");
            mainMenu();
            break;
    }
}
/*
function getAddedItems(newItem) {
    if (!items.includes(newItem)) {
        items.push(newItem);
        return newItem + " added successfully.";
    } else {
        return newItem + " already exists.";
    }
}

function letRemovedItems(removeItem) {
    let index = items.indexOf(removeItem);
    if (index !== -1) {
        items.splice(index, 1);
        return removeItem + " removed successfully.";
    } else {
        return removeItem + " Item not in the list...!";
    }
}

function showAllItems() {
    console.log("Available Items:");
    for (let index = 0; index < items.length; index++) {
        console.log(items[index]);
    }
}

function exit() {
    console.log("Thank You For Choosing Us");
    process.exit(0);
}

*/

mainMenu();

