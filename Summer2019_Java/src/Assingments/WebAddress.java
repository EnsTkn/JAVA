package Assingments;

import java.util.Scanner;

public class WebAddress {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter your domain:");
		String domain = s.nextLine();
		
		
	System.out.println("Enter your extension:");
	String extension = s.nextLine();
		
	System.out.println("Domain: "+domain+"\n"+"Extension: "+ extension);
	
	
	String url = domain+ "." +extension;
	System.out.println(url.startsWith("www."));
	System.out.println(url.contains("."+extension));
	
	
	
		
		


	}
}
		