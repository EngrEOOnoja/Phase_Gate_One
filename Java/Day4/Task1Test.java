import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/*javac -cp junit-platform-console-standalone-1.9.2.jar Task1.java Task1Test.java
java -jar junit-platform-console-standalone-1.9.2.jar -cp . --select-class Task1Test*/


public class Task1Test{

 @Test
    public void testAddNewItem() {
       //Arrange
       String item = "apple";
    
    	//Act
        String result = Task1.getAddedItems(item);
        
        //Assert
        assertEquals("apple added successfully.", result);
        }

    @Test
    public void testAddDuplicateItem() {
    	//Arrange
    	String item = "apple";
        Task1.items.add("apple");
        
        //Act
        String result = Task1.getAddedItems(item);
        
        //Assert
        assertEquals("apple already exists.", result);
    }

    @Test
    public void testRemoveExistingItem() {
    	//Arrange
    	String item = "banana";
        Task1.items.add("banana");
        
        //Act
        String result = Task1.letRemovedItems(item);
        
         //Assert
        assertEquals("banana removed successfully.", result);
         }

 }



























