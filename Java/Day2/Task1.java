public class Task1{

//Test 1 
public int checkAge(int fatherAge, int sonAge){
	if(fatherAge == (2*sonAge)){
	return 0;
	}			
		
	else if (fatherAge < (2 * sonAge)){
	return (2 * sonAge) - fatherAge;	
	}	
	else return fatherAge - (2*sonAge);
	
		}
		
			
}


