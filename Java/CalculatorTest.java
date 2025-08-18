import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*javac -cp junit-platform-console-standalone-1.9.2.jar Calculator.java CalculatorTest.java
java -jar junit-platform-console-standalone-1.9.2.jar -cp . --select-class CalculatorTest*/


public class CalculatorTest{

@Test
public void testTwoMultiplyTwoNumbers(){
	//Arrange
	int firstNumber = 5;
	int secondNumber = 4;
		
		
	//Act
	Calculator calculator = new Calculator();
	int result = calculator.multiply(firstNumber, secondNumber);
	//Assert
	assertEquals(result, 20);
}

@Test
public void testCheckMultiplyNoNegativeNumbers(){
	//Arrange
	int firstNumber = -5;
	int secondNumber = 5;
	
	
	//Act
	Calculator calculator = new Calculator();
	int result = calculator.multiply(firstNumber, secondNumber);

	
	//Assert
	assertEquals(result, 0);
}


@Test
public void testSubtractNumbers(){
	//Arrange
	int firstNumber = 10;
	int secondNumber = 2;
	
	
	//Act
	Calculator calculator = new Calculator();
	int result = calculator.subtract(firstNumber, secondNumber);

	
	//Assert
	assertEquals(result, 8);
}


@Test
public void testAddNumbers(){
	//Arrange
	int firstNumber = 10;
	int secondNumber = 5;
	
	
	//Act
	Calculator calculator = new Calculator();
	int result = calculator.add(firstNumber, secondNumber);

	
	//Assert
	assertEquals(result, 15);
}


@Test
public void testAddfirstNumberisPositive(){
	//Arrange
	int firstNumber = 10;
	int secondNumber = -5;
	
	
	//Act
	Calculator calculator = new Calculator();
	int result = calculator.add(firstNumber, secondNumber);

	
	//Assert
	assertEquals(result, 0);
}

@Test
public void testAddsecondNumberisPositive(){
	//Arrange
	int firstNumber = -10;
	int secondNumber = 5;
	
	
	//Act
	Calculator calculator = new Calculator();
	int result = calculator.add(firstNumber, secondNumber);

	
	//Assert
	assertEquals(result, 0);
}


}


