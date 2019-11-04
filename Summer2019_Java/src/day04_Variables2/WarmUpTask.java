package day04_Variables2;

public class WarmUpTask {

	/*
	  1. Cucumber   		=> 2.5$    => float, double
	  2. Onion				=> 1.5$    => float, double
	  3. Green Pepper		=> 2$      => byte, short, int, long , float, double
	  4. Tomato				=> 3$   
	  5. Carrots			=> 4$
	 
	 */
	
	
	
	
		public static void main(String[] args) {
			// Cucumber:
	//		int Cucumber = 2.5; // we can only assign whole numbers to int, byte, short, long
			
		//	float Cucumber = 2.5;  // float cannot contain double
			float Cucumber = 2.5f;
			double  Cucumber2 = 2.5f;  // double can contain float
			double Cucumber3 = 2.5;
			
			
			//Onion: 1.5
			float Onion = 1.5F;
			double Onion2 = 1.5;
			
			
			// Green Pepper: 2$
			byte GreenPepper = 2;
			short GreenPepper2 = 2;
			int GreenPepper3 = 2;
			long GreenPepper4 = 2L;
			
			float GreenPepper5 = 2; //only time we add f or F is, when are assigning deciamls
			double GreenPepper6 = 2;
			
			byte tomato = 3;
			int carrots = 4;
			int tomato2 = tomato;
			long carrots2 = 4L;
			
			System.out.println( GreenPepper );
			System.out.println( GreenPepper2 );
			System.out.println( GreenPepper3 );
			System.out.println(GreenPepper4);
			System.out.println(GreenPepper5);  // double and float converts the whole numbers to decimals
			System.out.println(GreenPepper6);
			System.out.println();
			System.out.println(tomato);
			System.out.println(carrots);
			
			
			
			
			double l1 = 787;
			System.out.println(l1);
			
			main(args);
			
			
			
		}
	

	
	
	
	
	
	
	
}
