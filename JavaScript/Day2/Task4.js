function  checkMilesPerGallon( distanceToCOver = 50, distance1GallonFuelCanCover = 25, fuelRemainInTank= 2){
	
		
	let product = fuelRemainInTank * distance1GallonFuelCanCover;
	if(product < distanceToCOver){
		return false;
	}
	
	
	else return true;
		
	
	}
	
let result = checkMilesPerGallon();
console.log(result)






