package Assingments;

import java.util.Scanner;

public class CheckWords {
	
	public static void main(String[] args) {
		
	/*	
			Write a program CheckWords:
		
		Program accepts 3 words and :
		- if they are same length:      print "All words are same length"
		- if some same length and others not:    print "Not Same nor Different lengths"
		- if all different length :  print "All different length"
				
		
	*/	
	Scanner input = new Scanner(System.in);
	
	String word = input.next();
	String word2 = input.next();
	String word3 = input.next();
	
	int l1 = word.length();
	int l2 = word2.length();
	int l3 = word3.length();
	
	System.out.println((l1==l2)&&(l1==3)&&(l2==l3) ? "All words are same length" 
						: ((l1==l2)&&(l1!=l3)||(l1!=l2)&&(l1==l3))||(l2==l3&&l2!=l1) ? "Not Same nor Different lengths"
						: (l1!=l2)&&(l1!=l3) ? "All different length" : "");
	
	
	
	
	
	
	
	}
}
