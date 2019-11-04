package Assingments;

import java.util.Scanner;

public class Concetenation01 {

	/*
	 * 	Ask user to enter two words. Then add them together and print.

		Input:

		one

		eight

		Output:	

		oneeight:
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		String word1 = input.next();
		String word2 = input.next();
		
		String word = word1.concat(word2);
		
		System.out.println(word);
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
