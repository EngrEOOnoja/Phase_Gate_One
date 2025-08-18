import java.util.Scanner;
public class Task1{
	public static void main (String[] args){
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter  Integer : ");
	int number = input.nextInt();
	
	if (number < 0){
	System.out.printf(" Number Is Negative  : %d%n", number);
	}
	else{
	System.out.printf("Number Is Positive   : %d%n",  number);
	}

}
}

