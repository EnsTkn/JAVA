package Assingments;

import java.util.Scanner;

public class StartEndWords {

	/*
	 * 
		 * Write a program StartEndWords:
	you have 2 words that must be 5 characters, and check if last letter of first word 
	and first letter of second work are same.
	if either one not 5 chars length:    print "need to be exactly 5 chars length"
	if last letter of 1st word and first letter of 2nd word match:  print "Fizz"
	if they do not match:  print "Buzz - did not match"


	 */
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String word1 = input.nextLine();
		String word2 = input.nextLine();
		
		System.out.println((""+word1.charAt(0)==word2.charAt(4)+"") ? "Same" : "Not same");
		
		int l1 = word1.length();
		int l2 = word2.length();
		int l11 = word1.length()-1;
		
		
		if (l1!=5||l2!=5) {
			
			System.out.println("need to be exactly 5 chars length");
			
		}
		else {
			System.out.println("");
		}
		
		
		if ((word1.charAt(l11))==(word2.charAt(0))) {
			
			System.out.println("Fizz");
		}
			
		else {
				System.out.println("Buzz - did not match");
			}
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}	
}
