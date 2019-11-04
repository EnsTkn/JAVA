package Assingments;

public class SwitchStatementTasks {

	/*
	 * Task01: Write a program that lets user to enter apple,dell,acer laptop models
	 * If it is apple show “Apple-no virus” If it is dell show “Tough one” If it is
	 * acer show “Cheap one” Else “do not buy that one!”
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		String c1 = "apple";
		String c2 = "dell";
		String c3 = "acer";

		switch ("lenova") {

		case "apple":
			System.out.println("Apple-no virus");
			break;

		case "dell":
			System.out.println("Tough one");
			break;
		case "acer":
			System.out.println("Cheap one");
			break;
		default:
			System.out.println("Do not buy that one!");
			break;

		}

		/*
		 * Task02:
		 * 
		 * Write a program to display days: 1-Monday 2-Tuesday 3- Wednesday 4-Thursday
		 * 5-Friday 6-Saturday
		 * 
		 */

		String d1 = "Monday";
		String d2 = "Tuesday";
		String d3 = "Wednesday";
		String d4 = "Thursday";
		String d5 = "Friday";
		String d6 = "Saturday";
		
		switch (d6) {
		
		
		case "Monday":
			System.out.println("Monday");
			break;
		case "Tuesday": 
			System.out.println("Tuesday");
			break;
		case "Wednesday":
			System.out.println("Wednesday");
			break;
		case "Thursday":
			System.out.println("Thursday");
			break;
		case "Friday":
			System.out.println("Friday");
			break;
		case "Saturday":
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Sunday");
			
		}
			
		
		/*Task03:
		 * a. Create a new switch statement using char instead of int.
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
			
	//a.
			int age = 26;
			char ch1 = 'A';
			char ch2 = 5054;
			char ch3 = 'G';
			char ch4 = 'b';
			
		switch (ch2) {
		
		case 'A':
			System.out.println("That's wrong choice");
			break;
		case 5054:
			System.out.println("That's your age ! Congts. ");
			break;
		case 'G':
			System.out.println("That's too big for you");
			break;
		default:
			System.out.println("None");
	
		}
			
			
		//b.
		
		char s1 = 65;
		char s2 = 66;
		char s3 = 67;
		char s4 = 68;
		char s5 = 69;
		char s6 = 70;
		char s7= 97;
		char s8 = 98;
		char s9 = 99;
		
		switch (86) {
		
		case 65:
			System.out.println(s1);
			break;
		case 66:
			System.out.println(s2);
			break;
		case 67:
			System.out.println(s3);
			break;
		case 68:
			System.out.println(s4);
			break;
		case 69:
			System.out.println(s5);
			break;
		case 70:
			System.out.println(s6);
			break;
		default:
			System.out.println("Not found chracter");
		
		}
		
		
		
		
		
		
		
		
		
		
	}

}
