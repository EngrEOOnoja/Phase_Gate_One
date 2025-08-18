import java.util.Scanner;
public class Task1{
	public static void main (String[] args){
	int [] digit = {3,4,5,9,7,62,2};
	int [] result = reversed(digit);
	System.out.print(result);
	
	}
	
	
	
	public static int []  reversed(int [] array){
		int smallest = array[0];
		int [] newArray = {};
		for(int count = 0 ; count < array.length-1 ; count++){
			if ( array[count] < smallest){
				smallest = array[count];
			}
			newArray[count++] = smallest;

		}
		return newArray;
	
	
	}
	
	
	
	
}


