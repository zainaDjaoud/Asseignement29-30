package Asseignements_29_30_Oct;

public class ForLoop {

	public static void main(String[] args) {
		
		
		//  print the first  20 even numbers
	  for (int i = 1 ; i <=20 ; i++) {
		System.out.print( 2*i +" ");  
	  }
	
	  System.out.println(".");
	  System.out.println("-----------------------");
	  
	// Print numbers from 100 to 50 
	for (int j=100; j>=50; j--) {
		System.out.print( j + " " );	
	}
	System.out.println(" . ");
	System.out.println("----------------------");
	
	//Print the first 10 multiples of 5
	for (int k=5; k<=10*5 ; k=k+5) {
		System.out.print(k +" ");
	}
	System.out.println(".");
	System.out.println("------------------------");
	
	//The multiples of 5 in a decreasing order starting from 200 till 100
	for( int b=200 ; b>=100 ; b=b-5) {
		System.out.print(b +" ");
	}
	System.out.println(".");
	System.out.println("------------------------");
	 
	// Sum of first 100 natural numbers
	 int sum =0;
	 for (int c=1 ; c<=100; c++) {
		sum=sum+c; 	
	 }
	 System.out.println(sum +" ");
	 
	}	
	
}