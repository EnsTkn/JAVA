package Assingments;

public class Task01_GreaterNumber {

	/*
	You have 3 variables num1, num2, max

assign value of larger one into variable max

 

Ex:

if: int num1 = 20;  int num3= 30

then   int max=30;

 

if: num1 = 40;  num3 = 100;

then:  max= 100;
	
	*/
	
	public static void main(String[] args) {
		
	
	
	int num1 = 40;
	int num2 = 100;
	int max = 0;

	if (num1>num2) {
		
		max += num1;
		
	}
	
	if (num2>num1) {
		
		
		max += num2;
	}
	
	if (num1==num2) {
		
		max += num1;
				
				System.out.println("Both numbers are equal");
		
	}
	
	System.out.println("Maximum number is between " + num1 + " and " + num2 + " is " + max);
	
	}
}