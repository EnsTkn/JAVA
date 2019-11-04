package Assingments;

import java.util.Scanner;

public class MiddleChracter {
	
	public static void main(String[] args) {
		

	Scanner input = new Scanner(System.in);
	
	String word = input.nextLine();
	
	int l = word.length();
	
	String md = ""+word.charAt(l/2);
	String md2 =""+word.charAt((l/2)-1);
	String md3 =""+word.charAt((l/2));
	
	
	switch (l%2) {
	case 0 :
		System.out.println("The middle character in the string: "+md2+md3 );
		break; 
	case 1:
		System.out.println("The middle character in the string: "+ md );
		break;
		
		//System.out.println(word ?);
	}
	
	
}
}