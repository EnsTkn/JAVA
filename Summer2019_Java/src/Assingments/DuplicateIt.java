package Assingments;

import java.util.Scanner;

public class DuplicateIt {
	
	/*
				 * Ask user to enter two words. 
				 * Print the first word, second word, second word, first word
			
				Input:
			
				one
			
				two
			
				Output:
			
				onetwotwoone
	 * 
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
	
		System.out.println("Enter two words:");
		
		String word1 = input.next();
		String word2 = input.next();
		
		
		System.out.println(word1+word2+word2+word1);
		
		
		
		
		
		
	}
}
