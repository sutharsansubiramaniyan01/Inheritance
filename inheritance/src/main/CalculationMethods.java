package main;

public class CalculationMethods {
  int result; // declare a local default variable.
  public void addition (int var1, int var2) { // Create public void method with two parameter values.
	  result = var1 + var2;					  // Add integer values using + operator and store into local variable.
	  System.out.println("Sum of two value is : " + result); // Print the variable result. 
  }
  public void subraction (int var1, int var2) {
	  result = var1 - var2;
	  System.out.println("Subraction of two value is : " + result);
  }
  public void multiplication (int var1, int var2) {
	  result = var1 * var2;
	  System.out.println("Multiplication of two value is : " + result);
  }
} 
