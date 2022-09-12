package main;

public class Calculation extends CalculationMethods { // Create class named Calculation and inherited by CalculationMethods class
	public void division(int var1, int var2) {		  	
		result = var1/var2;
		System.out.println("Divison of two numbers is : " + result); 
	}
	public static void main (String[] args) { 		  // Create main method of class
		Calculation calculation = new Calculation();  // Create object for Calculation class.
		calculation.addition(23, 45);				  // Call the function and send the parameter values from object.
		calculation.subraction(67, 32);
		calculation.multiplication(18, 12);
		calculation.division(65, 3);
	}

}
