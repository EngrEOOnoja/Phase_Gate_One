import java.util.Scanner;
public class Task1{
	public static void main (String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter 1st Integer : ");
	int number1 = input.nextInt();
	System.out.print("Enter 2nd Integer : ");
	int number2 = input.nextInt();

    	int numberOneSquared = number1 * number1;
   	int numberTwoSquared = number2 * number2;
   	
   	int differenceOfBothSquared = numberOneSquared - numberTwoSquared ;
   	

System.out.printf(" Number One Squared  : %d%n", numberOneSquared);
System.out.printf("Number Two Squared  : %d%n",  numberTwoSquared);
System.out.printf("Difference Of Both Squares   : %d%n", differenceOfBothSquared );

}
}
