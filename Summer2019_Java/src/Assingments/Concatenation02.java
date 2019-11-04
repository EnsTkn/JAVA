package Assingments;

import java.util.Scanner;

public class Concatenation02 {

	public static void main(String[] args) {
		
	/* 
		  Ask user to enter two words. Then add them together and print. 
		  But if the last letter of the first word and the first letter of the last letter is the same,
		   print that character once.
	
		Input:
			
		one
			
		eight
			
		Output:
			
		oneight
	*/
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter two words:");
		
		String word1 = input.nextLine();
		String word2 = input.nextLine();
		
		int l1 = word1.length()-1;
		
		String a1 =word1.charAt(l1)+"";
		String a2 ="" + word2.charAt(0);
		
		boolean a = a1.equals(a2);
		
		//System.out.println(a1);
		//System.out.println(a2);
		
		
		// System.out.println((a1==a2) ? a2 : word1+word2);
		
		if (a) {
			
			System.out.println(a1+"\n"+word1+word2);
		}
		else {
			System.out.println(word1+word2);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
