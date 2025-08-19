function Task1(fatherAge, sonAge){
	if(fatherAge == (2*sonAge)){
	return 0;
	}			
		
	else if (fatherAge < (2 * sonAge)){
	return (2 * sonAge) - fatherAge;	
	}	
	else return fatherAge - (2*sonAge);
	
	}
		
			
let digit1 = 40;
let digit2 = 25;
let result = Task1(digit1, digit2);
console.log(result);