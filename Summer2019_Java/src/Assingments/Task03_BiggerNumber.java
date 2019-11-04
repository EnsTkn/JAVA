package Assingments;

public class Task03_BiggerNumber {
	
	/*

		write a program that checks for the bigger of 3 numbers.

	you get 3 int variables: n1 , n2 and n3

	if n1 is biggest output: "n1 is bigger"

	if n2 is biggest output: "n2 is bigger"

	if n3 is biggest output: "n3 is bigger"

 

 

	for example:

	n1 = 1

	n2  = 2
	
	n3  = 1

	output: "n2 is bigger"

 

	n1 = 3

	n2  = 2

	n3  = 1

	output: "n1 is bigger"

 

	n1 = 3

	n2  = 2

	n3  = 30

	output: "n3 is bigger"



	*/
	
	public static void main(String[] args) {
		
		int n1 = 100;
		int n2 = 200;
		int n3 = 300;
		int max = 0;
		
		if (n1>n2 && n1>n3) {
			
			max = n1;
		
		if (n2>n1 && n2>n3) {
			max = n2;		
			
		}
		
		}
		
		else {  
			
			if (n3>n1 && n3>n2) {
			max= n3; 
			 
		 }
		}
			
			
		String result = "Maximum number is between " + n1 + ", "+ n2 + ", " + n3 + "is " + max;
		
		System.out.println(max);
	
	
	
	
	
	
	}
		
				
	}
	

