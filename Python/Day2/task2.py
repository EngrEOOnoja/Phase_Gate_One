def	get_check_score(score1, score2, score3):
	sum = score1 + score2 + score3 	
	average = sum/3
	
	if(90 <= average  <= 100):
		return 'A'
	
	elif(80 <= average  < 90):
		return 'B'
	
	elif(70 <= average  < 80):
		return 'C'
	
	elif(60 <= average  < 70):
		return 'D'
	
	else:
		return 'F'
		

	
	

	


	


		

		



