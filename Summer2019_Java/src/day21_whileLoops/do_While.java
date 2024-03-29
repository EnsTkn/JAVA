package day21_whileLoops;

public class do_While {
	
	public static void main(String[] args) {
		
	
    /*
     * do - while:
     * do {
     *      statements;
     * } while(condition);
     * 
     * compiler executes the 'do' block first, and
     * then checks the condition, if the condition is true
     * keep executes, otherwise exits the loop
     * 
     * WHILE VS. DO-WHILE
     * 
     * do-while loop's body gets executed at least once,
     * regardless of condition
     * 
     * while loop never gets executed if the condition
     * is false
     * 
     * break: exits switch statement and loop
     */
    
    
    
    
    boolean A = false;
    
    while( A ) {
        System.out.println("Hel");
    }
    
    do {
        System.out.println("Hello");
    }while ( A ) ;
    
    /*
     * do a code that prints all EVEN numbers
     * between 1 and 100 using a DO-WHILE loop
     * 
     * any java test where you use the for loop,
     * you can do with while loop
     * 
     * we will usually use for loop and while loop
     */
   /* 
    int x = 1;
	while(x <= 100) {
		if(x%2==0) {
			System.out.print(x+" ");
		}
		
		x++;
	}
*/
 
				 int x = 1;
					do {
						if(x%2==0) {
							System.out.print(x+" ");
						}
						x++;
					}
					
					while(x <= 100);
					
					System.out.println("\n");
					
					
					do {
						System.out.print("hello world");
					
						
						// System.out.println("hello Cybertek");  
							//	it was laready bout of loop at line 49
						
					}while(false);

}
}