import java.util.Scanner;
public class EncryptedPasskey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 4-digit passkey: ");
        int number = scanner.nextInt();
       
              
        int digit1 = ((number / 1000) + 10) -7 ;
        if (digit1 > 10){
        digit1 = digit1 % 10;
        }
        int digit2 = (((number % 1000) / 100)  + 10) -7;
        if (digit1 > 10){
        digit1 = digit1 % 10;
        }
        int digit3 = (((number % 100) / 10) + 10) -7;   
        if (digit1 > 10){
        digit1 = digit1 % 10;
        }  
        int digit4 = (((number % 10) / 1) + 10) -7;
        if (digit1 > 10){
        digit1 = digit1 % 10;
        }
        
        
        int temp1 = digit3;
        digit3 = digit1;
        digit1 = temp1;
        int temp2 = digit4;
        digit4 = digit2;
        digit2 = temp2;
        
	if (number > 10000) {
         System.out.println("Wrong, sorry input 4 digit");
          }
        if (number < 1000) {
         System.out.println("Wrong, sorry input 5 digit");
          }
        if (number > 999 && number < 10000) {
          System.out.println(digit1 + "   " + digit2 + "   " + digit3 + "   " + digit4);
         }
    }
}

