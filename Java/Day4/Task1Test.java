import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*javac -cp junit-platform-console-standalone-1.9.2.jar Task1.java Task1Test.java
java -jar junit-platform-console-standalone-1.9.2.jar -cp . --select-class Task1Test*/


public class Task1Test{

@Test
public void testgetAddedItems(){
	//Arrange
	String name = newItem + " added successfully";
			
		
	//Act
	Task1 input = new Task1();
	String result = input.getAddedItems(name);
	

	//Assert
	assertEquals(result, newItem + " added successfully");
}

}




























