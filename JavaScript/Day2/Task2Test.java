import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*javac -cp junit-platform-console-standalone-1.9.2.jar Task2.java Task2Test.java
java -jar junit-platform-console-standalone-1.9.2.jar -cp . --select-class Task2Test*/

public class Task2Test{

@Test
public void testscores(){
	//Arrange
	int firstNumber = 100;
	int secondNumber = 90;
	int  thirdNumber = 100;
		
	//Act
	Task2 input = new Task2();
	int result = input.scores(firstNumber, secondNumber, thirdNumber);
	
	
	//Assert
	assertEquals(result, 90);
}
/*
@Test
public void testcheckScore1(){
	//Arrange
	int firstNumber = 80;
	int secondNumber = 85;
	int  thirdNumber = 80;	
		
	//Act
	Task2 input = new Task2();
	int result = input.scores(firstNumber, secondNumber,  thirdNumber);
	
	
	//Assert
	assertEquals(result, 70);
}


@Test
public void testcheckScore2(){
	//Arrange
	int firstNumber = 80;
	int secondNumber = 70;
	int  thirdNumber = 70;	
		
	//Act
	Task2 input = new Task2();
	int result = input.scores(firstNumber, secondNumber,  thirdNumber);
	
	
	//Assert
	assertEquals(result, 70);
}


@Test
public void testcheckScore3(){
	//Arrange
	int firstNumber = 69;
	int secondNumber = 60;
	int  thirdNumber = 55;	
		
	//Act
	Task2 input = new Task2();
	int result = input.scores(firstNumber, secondNumber,  thirdNumber);
	
	
	//Assert
	assertEquals(result, 80);
}


@Test
public void testcheckScore4(){
	//Arrange
	int firstNumber = 50;
	int secondNumber = 50;
	int  thirdNumber = 50;	
		
	//Act
	Task2 input = new Task2();
	int result = input.scores(firstNumber, secondNumber,  thirdNumber);
	
	//Assert
	assertEquals(result, 50);
}

*/
}



