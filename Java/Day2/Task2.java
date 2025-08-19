public class Task2{

//Test 1 
public char scores(int score1, int score2, int score3){
	int sum = (score1 + score2 + score3);
	int average = (sum / 3) ;
	
	if(average >= 90 && average <= 100){
		return 'A'; 
	}
	else if (average >= 80 && average  < 90){
		return 'B';
	}
	else if (average  >= 70 && average < 80){
		return 'C';
	}
	else if (average >= 60 && average < 70){
		return 'D';
	}
	else return 'F';
		
	}
				
}




