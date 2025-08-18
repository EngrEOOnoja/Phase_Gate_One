import java.util.Scanner;
public class Task1{
	public static void main (String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter 1st Integer : ");
	int number1 = input.nextInt();
	System.out.print("Enter 2nd Integer : ");
	int number2 = input.nextInt();
	System.out.print("Enter 3rd Integer : ");
	int number3 = input.nextInt();


    	int summation = number1 + number2 + number3;
   	int average = summation / 3;
   	int product = number1 * number2 * number3;

   	int largest = number1;
      		if( number2 > number1 && number2 > number3) largest = number2;
   		if(number3 > number1 && number3 > number2) largest = number3; 
   		
   	int smallest = number1;
   		if( number2 < number1 && number2 < number3) largest = number2;
   		if(number3 < number1 && number3 < number2) largest = number3; 


   	   	

System.out.printf(" Summation = : %d%n", summation);
System.out.printf("Average  : %d%n",  average);
System.out.printf("Product  : %d%n",  product);
System.out.printf("Largest   : %d%n", largest );
System.out.printf("Smallest : %d%n", smallest );

}
}

