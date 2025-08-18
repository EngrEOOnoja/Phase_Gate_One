import java.util.Scanner;
public class Task1{
	public static void main (String[] args){
	int [] digit = {3,4,5,9,7,62,2,0};
	int result = smallest(digit);
	System.out.print(result);
	
	}
	
	
	
	public static int  smallest(int [] array){
		int smallest = array[0];
		
		for(int count = 0; count < array.length; count++){
			if ( array[count] < smallest){
			smallest = array[count];
			}
		}
		return smallest;
	
	
	}
	
	
	
	
}


