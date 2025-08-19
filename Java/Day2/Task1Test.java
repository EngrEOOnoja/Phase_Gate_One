import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*javac -cp junit-platform-console-standalone-1.9.2.jar Task1.java Task1Test.java
java -jar junit-platform-console-standalone-1.9.2.jar -cp . --select-class Task1Test*/

public class Task1Test{

@Test
public void testcheckAge(){
	//Arrange
	int firstNumber = 50;
	int secondNumber = 25;
		
		
	//Act
	Task1 input = new Task1();
	int result = input.checkAge(firstNumber, secondNumber);
	
	
	//Assert
	assertEquals(result, 0);
}

@Test
public void testcheckAgeAbove(){
	//Arrange
	int firstNumber = 70;
	int secondNumber = 25;
		
		
	//Act
	Task1 input = new Task1();
	int result = input.checkAge(firstNumber, secondNumber);
	
	
	//Assert
	assertEquals(result, 20);
}


@Test
public void testcheckAgeBelow2(){
	//Arrange
	int firstNumber = 40;
	int secondNumber = 25;
		
		
	//Act
	Task1 input = new Task1();
	int result = input.checkAge(firstNumber, secondNumber);
	
	
	//Assert
	assertEquals(result, 10);
}


}


