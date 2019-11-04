package Day19_ForLopp;

public class ForLoop {

	 
    public static void main(String[] args) {
        
        // task01
        
    //  for(int i = 1; i <= 10; i++) {
    //      System.out.println("the square of "+ i + " is: " + (i * i) );
    //  }
        
        
        // task02
        for(int i = 5; i <= 32; i++) {
            
            if(i %2 == 0) {
                System.out.print(i+" ");
            }
            
        }
        System.out.println();
        /*
        
        // task03:
        for(int i = 0; i <= 32;) {
            i++;
           // if(i %2 == 1) {
                System.out.print(i+" ");
           // } 
           
        }   
        */        
                
                int z = 5;
                for(int i2 = 5; i2>0; i2--) {
                	z+=i2;
                }
                	System.out.println(z);				// 7 + 6 + 5 + 4 + 1
                										// 5 + 4 + 3 + 2 + 1
        
        
        
        
        
    
        
        
        
    }
	
}
