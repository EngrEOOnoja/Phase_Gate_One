public class Task1{
		
public static int []  toGetTheTwoLargestNumbers(int [] number){
largest = 0;
secondLargest = 0
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
