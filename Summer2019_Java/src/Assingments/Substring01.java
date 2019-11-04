package Assingments;

import java.util.Scanner;

public class Substring01 {
	
	
	
	/*	Ask user to enter a word. If the work contains starts with x, print the word without x.

		Input:
		
		xcode
		
		Output:
		
		code
	 */

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String word = input.next();
		
		boolean a= word.startsWith("x");
		
		System.out.println((a) ? word.substring(1) : word);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
