package day04_Variables2;

public class PrimitiveDataTypes2 {

/*
	Primitives:  byte, short, int, long, float, double, boolean , char
	 
	 	boolean: takes either True or False boolean expressions
	 	
	 	char: declared with in the single quote '';  single character only.
	 			'' is a MUST when you give character as value
*/	 		
	 	
	 
	 
	public static void main(String[] args) {
		
		//	boolean result = Earch is Flat;
		//	boolean num1 = 100;  boolean only takes true or false results
		
		boolean result = true; 
		boolean result2 = false; 
		boolean result3 =   9 > 3 ;
		
		
		System.out.println(result);  // true
		System.out.println(result2);  // false
		System.out.println(result3);   // true
		
		
		// char:
		
		char char1 ='a';
		
		System.out.println(char1);
		
		char char2 = '9';
		char char3 = '#';
		System.out.println("\n\n");
		
		// char with numbers
		char char4 = 67;  // only time we use '' for char is when we are declaring single character
				// prints the character that's corresponding to 67 from ASCII table
		
		System.out.println( char4 );
		
		
		char char5 ='C';  // prints the character as it's
		System.out.println(char5);  
		
		char char6 = '{';
		System.out.println(char6);
		
		char char7 = 123 ;
		System.out.println(char7);  // prints the chracter that has the number of 123 from ASCII Table
		
		
		// initializing char to other primitives: byte, short, int, long, float, double
			char MyChar1 = 'b';
			
			int MyInt = MyChar1;  // the number that represents b is initalized to the int
		
			System.out.println( MyInt);  //98
			
			
	//		byte MyByte =  MyChar1 ;  // char's memory is 2byte, byte' memory is 1 bytes
			byte MyByte2 = 'b';   // b's corresponding number is 98 from ASCII table
			System.out.println( MyByte2 );
			
			
	//		short ShortNum = MyChar1;  // char' memory is could be bigger than short, range is greatr than short
			short ShortNum2 = 'b';  // b's corresponding number is 98 from ASKCII table
			System.out.println(ShortNum2); 
			
			
			long LongNum = MyChar1;  // long's memory is 8 bytes
			long LongNum2 = 'b';  //98
			System.out.println(LongNum);
			
			float floatNum = MyChar1;
			float floatNum2 = 'b';
			System.out.println(floatNum2);
			
			double doubleNum = MyChar1;
			double doubleNum2 = 'b';
			System.out.println(doubleNum2);  //98.0
			
			// Java is case sensitive: A does not equal to a.
			
			//char MyChar1 = 1429;
			//System.out.println( MyChar1 ); 
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			
		char m0 = 69;
		char m1 = 110;
		char m2 = 101;
		char m3 = 115;
		char m4 = 84;
		char m5 = 69;
		char m6 = 75;
		char m7 = 73;
		char m8 = 78;
		
		System.out.print(m0);
		System.out.print(m1);
		System.out.print(m2);
		System.out.print(m3);
		System.out.println();
		System.out.println();
		System.out.print(m4);
		System.out.print(m5);
		System.out.print(m6);
		System.out.print(m7);
		System.out.print(m8);
		
		
		
		
	}

	
	
}



