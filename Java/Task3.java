import java.util.Scanner;
public class Task1{
	public static void main (String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter 1st Integer : ");
	int number = input.nextInt();
	
    	if(number % 3 == 0){
    	System.out.printf(" Number is Divisible by Three : %d%n", number);
	}
    	else{
    		System.out.printf("Number is not divisible by Three : %d%n",   number);  
    		}
    		

	}
}

