import java.util.Scanner;
public class Task1{
	public static void main (String[] args){
	int number = 5;
	int factorial = 1;
	for (int index = 1; index <= number; index++){
		factorial *= index; 	
	}
	System.out.print(factorial);
		
	}
}