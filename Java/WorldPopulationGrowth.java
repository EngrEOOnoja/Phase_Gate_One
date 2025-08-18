public class WorldPopulationGrowth {
    public static void main(String[] args) {
       
        double currentPopulation = 7.9;
        double growthRate = 0.009;
      
        int yearExpected = 75;
        
        
        double population = currentPopulation;
        int doublePopulationYear = 0;

           for (int year = 1; year <= yearExpected ; year++) {
            double increase = population * growthRate;
            population += increase;
           
            if (doublePopulationYear == 0 && population >= 2 * currentPopulation) {
                doublePopulationYear = year;
                
	System.out.print("The Population in year " + year + " is: " + population + ", Increase: " + increase);
        }

             }
}


}
