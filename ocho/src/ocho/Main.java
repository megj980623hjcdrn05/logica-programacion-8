package ocho;

import java.util.Scanner;

public class Main {
				
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			 	
			    int[] primo = new int[10];
			    int[] noPrimo = new int[10];
			    int i;
			    int j;
			    int primos = 0;
			    int noPrimos = 0;
			    boolean esPrimo = false;
			    
			    int arr[]=new int[10];
			    Scanner scanner= new Scanner(System.in);
			    for (i = 0; i <10; i++) {
			      System.out.println("dame el numero "+i);
			      arr[i]=scanner.nextInt();
			    
			      
			      
			      esPrimo = true;
			      for (j = 2; j < arr[i]-1; j++) {
			        if (arr[i]%j == 0) {
			          esPrimo = false;
			        }
			      }
			      
		
			      if (esPrimo) {
			        primo[primos++] = arr[i];
			      } else {
			        noPrimo[noPrimos++] = arr[i];
			      }
			    }
			    
		
			    for (i = 0; i < 10; i++) {
			      System.out.print(i);
			   System.out.printf("-%1d",arr[i]);
				      System.out.println("\n");
				    
			    }
		
			  
			    
	
			    for (i = 0; i < primos; i++) {
			      arr[i] = primo[i];
			    }
			    
	
			    for (i = primos; i < primos + noPrimos; i++) {
			      arr[i] = noPrimo[i - primos];
			    }


			    System.out.println("\n-------------------------------------------------");
			    for (i = 0; i < 10; i++) {
			   
			    	System.out.print(i);
			      System.out.printf("-%1d",arr[i]);
		    	  System.out.println("\n");
			    }
			   
			
			   
			    	 
			   
			   
			  }
}