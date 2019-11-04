package day16_Recap;

import java.util.Scanner;

public class next_VS_nextLine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name");
			String f = scan.next();
			scan.nextLine();
		System.out.println("Enter the last name");
			String L = scan.nextLine();
			
			System.out.println("Your first name is "+f);
			System.out.println("Your last name is "+L);
			
			
			String s1 ="abc";
			String s2 ="abc";
			
			System.out.println("s1==s2: " + s1==s2);
		

}
}