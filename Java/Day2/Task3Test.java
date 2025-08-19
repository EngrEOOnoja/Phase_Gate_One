import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*javac -cp junit-platform-console-standalone-1.9.2.jar Task3.java Task3Test.java
java -jar junit-platform-console-standalone-1.9.2.jar -cp . --select-class Task3Test*/

public class Task3Test{

@Test
public void checkNames(){
	//Arrange
	String [] names = {"john"};
			
		
	//Act
	Task3 input = new Task3();
	String result = input.checkNames(names);
	
	
	//Assert
	assertEquals(result, "john likes this");
}
@Test
public void checkNames(){
	//Arrange
	String [] names = {"john", "Sam" };
			
		
	//Act
	Task3 input = new Task3();
	String result = input.checkNames(names);
	
	
	//Assert
	assertEquals(result, "john", "Sam" likes this.);
}


	}

