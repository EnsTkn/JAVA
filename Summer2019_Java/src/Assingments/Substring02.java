package Assingments;

import java.util.Scanner;

public class Substring02 {
	
	/* Ask user to enter a word. If the first or second or both letter of the word is x, print the word without x(s). 
	 * If x is the third letter it should be printed. If the first and second are x, both should be ignored.

		Input:
		
		xxode
		
		Output:
		
		ode
		
		 
		
		Input:
		
		oxidex
		
		Output:
		
		oidex
	 */
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String word = input.nextLine();
		
		String a = word.substring(0,1);							
		String b = word.substring(1, 2);
		String c = word.substring(2, 3);
		String x1 = word.substring(1);
		String x2 = word.substring(2);
		String x3 = word.substring(3);
		
		boolean s1 = a.equals("x");
		boolean s2 = b.equals("x");
		boolean s3 = c.equals("x");
		
		
		if (s1&&s2){
	           System.out.println(x2);
	       }
	       else if (s1) {
	           System.out.println(x1);
	       }
	       else if (s2) {
	           word.replaceFirst("x", "");
	           System.out.println(word);
	       }
	       else {
	           System.out.println(word);
	       }
		
		
		
		
		
		
		
		
		
		
	
	}
}
