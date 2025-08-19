def  checkMilesPerGallon( distanceToCOver = 50, distance1GallonFuelCanCover = 15, fuelRemainInTank= 2):
	let product = fuelRemainInTank * distance1GallonFuelCanCover;
	if(product < distanceToCOver):
		return false;
	else:
		 return true
		
	
result = checkMilesPerGallon();
print(result)







