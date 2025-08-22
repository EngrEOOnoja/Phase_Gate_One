import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*javac -cp junit-platform-console-standalone-1.9.2.jar Task1.java Task5Test.java
java -jar junit-platform-console-standalone-1.9.2.jar -cp . --select-class Task5Test*/


public class Task5Test{

 @Test
    public void testAddNewItem() {
       //Arrange
       int item = 1;
    
    	//Act
        int result = Task5.getAddedItems(1);
        
        //Assert
        assertEquals(1, result);
        }

    @Test
    public void testAddDuplicateItem() {
    	//Arrange
    	int item = 0;
        Task5.items.add(0);
        
        //Act
        int result = Task5.getAddedItems(0);
        
        //Assert
        assertEquals(0, result);
    }

    @Test
    public void testRemoveExistingItem() {
    	//Arrange
    	int item = 2;
        Task1.items.add(2);
        
        //Act
        int result = Task5.letRemovedItems(2);
        
         //Assert
        assertEquals(2, result);
         }

 }




























