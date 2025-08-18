import java.util.Scanner;
public class Task1{
	public static void main (String[] args){
	int [] digit = {3,4,5,9,7,2};
	int result = summation(digit);
	System.out.print(result);
	
	}
	
	
	
	public static int  summation(int [] array){
		int summation = 0;
	
		for(int count = 0; count < array.length; count++){
			summation += array[count];
					}
		return summation;
	
	
	}
	
	
}


