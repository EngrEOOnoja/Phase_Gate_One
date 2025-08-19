function scoresGrade(score1,  score2, score3){
	let sum = score1 + score2 + score3;
	let average = sum / 3;
	
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
				


let digit1 = 90;
let digit2 = 90;
let digit3 = 90;
let result = scoresGrade(digit1, digit2, digit3);
console.log(result);


