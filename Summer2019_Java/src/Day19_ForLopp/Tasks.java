package Day19_ForLopp;

public class Tasks {
	
	public static void main(String[] args) {
		
	
	
	  
    // task01
    
	for(int i = 1; i <= 10; i++) {
//      System.out.println("the square of "+ i + " is: " + (i * i) );
//  }
    
    
    // task02
    for(int i2 = 1; i2 <= 32; i2++) {
        
        if(i2 %2 == 0) {
            System.out.print(i2+" ");
        }
        
    }
    System.out.println();
    
    
    // task03:
    for(int ii = 1; ii <= 32; ii++) {
        
        if(ii %2 == 1) {
            System.out.print(ii+" ");
        } 
        
    }
    System.out.println();
    
   // ==============
    
    
    String str = "Cybertek";
    //            01234567
    //  "avaJ"
    String Rev =""+str.charAt(3)+str.charAt(2)+str.charAt(1)+str.charAt(0);
    
    String Reversed ="";
    for(int i1 = str.length()-1 ; i1 >= 0; i1--) {
       Reversed += str.charAt(i1);
    }
    
    System.out.println(Reversed);

    
    
    
	}

	
	
	
	
}
}
