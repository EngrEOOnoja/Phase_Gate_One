public class Task1{
	public static void main (String[] args){
	int [] digit = {3,4,5,9,7,62,2,0};
	int result = smallest(digit);
	System.out.print(result);
	
	}
	
public static int []  toGetTheTwoLargestNumbers(int [] number){
largest = 0;
secondLargest = 0
for(int index = 0; index < number.length; index++){
	let digit = number[index]
	if( digit > largest){
		secondLargest = largest;
		largest = digit;
		}
	if(digit > secondLargest && digit < largest && digit != largest){
	secondLargest = digit
	}
}

return [secondLargest, largest]
}


int [] number = {3,5,6,7,8,5,3};
int result = toGetTheTwoLargestNumbers(number);
System.out.print(result);
	
	
	
	
}

































public static int [] toGetTheTwoLargestNumbers(int [] number){
int largest = 0;
int secondLargest = 0
for(int index = 0; index < number.length; index++){
	int digit = number[index]
	if( digit > largest){
		secondLargest = largest;
		largest = digit;
		}
	if(digit > secondLargest && digit < largest && digit != largest){
	secondLargest = digit
	
	
	}
}

return [secondLargest, largest]
}


let number = [3,5,6,7,8,5,3]
let result = toGetTheTwoLargestNumbers(number);
console.log(result);

