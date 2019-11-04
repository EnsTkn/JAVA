package Assingments;

import java.util.ArrayList;
import java.util.Arrays;

public class abc {
	
	public static void main(String[] args) {
		
		// deleteR({10, 5, 7}, 5);
		
	}
	
	 public static int[] deleteR(int[] arr,int element) {
		 
		 int[] deleteR = new int[arr.length-1];
		 
		 int x =0;
		 
		 for(int i =0; i < arr.length; i++) {
			 
			 if (arr[i]!=(element)) {
				 
				deleteR[x]=arr[i]; 
				
				x++;
				 
			 }
				 
			
			 
		 }
		 
		 
		 
		    
		return deleteR;   
	  }//end deleteR
	  

	  
	  
}