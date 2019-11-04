package Assingments;

public class Task04_HTTPSstatuscode {
	
	/*
	 
			 HTTP is the protocol that governs communications between web
		
		servers and web clients (i.e. browsers). Part of the protocol includes
		
		a status code returned by the server to tell the browser the status of
		
		its most recent page request. Some of the codes and their meanings are
		
		listed below:
		
		status code: 
		
		200, OK
		
		201, Created
		
		202, Accepted
		
		301, Moved Permanently
		
		303, See Other
		
		304, Not Modified
		
		307, Temporary Redirect
		
		400, Bad Request
		
		401, Unauthorized
		
		403, Forbidden
		
		404, Not Found
		
		410, Gone
		
		500, Internal Server Error
		
		503, Service Unavailable
		
		 
		
		1. declare an int variable called StatusCode
		
		2. write a if statement that prints out, on a line by itself,
		
		the appropriate label from the above list based on status.
		
		 
		
		Example:
		
		if status code = 200
		
		output:
		
		ok
		
		 
		
		if status code = 201:
		
		output:
		
		accepted 
			
			 
	 
	 
	 
	 
	 */
	
	public static void main(String[] args) {
		
	
	
	int stcode = 404;
	String result= "Not Found";
	
	if (stcode==403) {
		
		result = "Forbidden";
		System.out.println("Status code " + stcode + " " + "is " + result);
		
	if (stcode==500) {
		result = "Internal Server Error";
		System.out.println("Status code " + stcode + " " + "is " + result);		
	}
	else if (stcode==304) {
		result= "Not Modified";
		System.out.println("Status code " + stcode + " " + "is " + result);
	}
		
	else if (stcode==404) {
		result= "Not Found";
		System.out.println("Status code " + stcode + " " + "is " + result);
	}
	
	}
	
	else  {
		
		if (stcode==303) {
			result= "See Other";
			System.out.println("Status code " + stcode + " " + "is " + result);
			
		}
	}
	
	
	
	System.out.println("Status code " + stcode + " " + "is: " + result);
	
	
	
	
	
	
	}	
}

