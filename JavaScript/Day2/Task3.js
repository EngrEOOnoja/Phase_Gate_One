function checkNames(names){
	if (names.length == 0){
		return "no one likes this";
	}	
	else if(names.length == 1){
		return names[0] + "  likes this";
	}
	else if(names.length == 2){
		return [names[0], + names[1]] + "  likes this ";
	}
	else if(names.length == 3){
		return names[0], + names[1], + "and" + names[2]  + " likes this ";
	}
	else return  names[0], + names[1] + " and 2 others likes this ";
	
	
	}
	
	
let names = ['john' ];
let result = checkNames(names);
console.log(result);