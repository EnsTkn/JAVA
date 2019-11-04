package day14_Scanner;

public class Ternary {
    /*
     in Ternary:
         if(condition)       ==> (Condition)?
         else                ==>    :
         else if(Condition)  ==> :(Condition)?
     */
    
    public static void main(String[] args) {
        int num = 0;
        
        if(false) {
            num = 100;
        }else {
            num = 50;
        }
            
    int n = true ? 100 : 50 ;   // ternary returns a Value
    
    int y = false ? 100 : true ? 70 : 50;  
                System.out.println(50 );
    
    System.out.println(num);  // 50
    System.out.println(n);  // 50
    System.out.println(y);
    
    
        String Schoolname ="abc";
        boolean Batch12 = false; 
        boolean batch13 = false;
        boolean batch14	= true;
        boolean batch15 = false;
       /* 
        if(Batch12) {
            Schoolname ="Cybertek";
        } else {
            Schoolname ="Invalid";
        }
        
        */
        
        
        
    System.out.println( Batch12 ? "Cybertek" 
    					:  batch13 ? "Invalid"
    					:  batch14 ? "enes"
    					:  batch15 ? "omer"
    					: "tekin" );
        
   // String BestSchool = Batch12 ? "Cybertek" : "Invalid"; 
    
  //  System.out.println(BestSchool);
    
    
    
        
            double d = 10;
            if(true) {
                d= 10.5;
            }
    
        double z = true ? 10.5 : 0;
        // in ternary, total number of ? and :  has to be equal
    
    
        double interestRate = 0;
        boolean GoodCredit = true;
    
        interestRate = GoodCredit == true ? 0.5 : 0.9 ;
        System.out.println(interestRate);
        
        
        
        
        
        
        int score =80;
        char Finals =' ';
        
              	
        	
        	Finals = (score>=90 && score<=100) ? 'A' 
        			:(score>=80 && score<=89) ? 'B'
        			:(score>=70 && score<=79) ? 'C'
        			:(score>=60 && score<=69) ? 'D'
        			:(score>=0 && score<=59) ? 'F'
        			: ' ';
        	
        	System.out.println(Finals);
        
    }
}
