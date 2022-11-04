package Asseignements_29_30_Oct;

public class Nested_ForLoop {

	public static void main(String[] args) {
		pattern1();
		pattern2();
		
	}	
		static void pattern1() {
		for (int i=1;i<=4;i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		int n=5;
		for (int r=1; r<=5; r++) {
			for(int c=1; c<=n-r; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
			System.out.println("-----------------------------");
		}
		
		
     static void pattern2() {
		for (int r=1; r<=5 ; r++) {
			for(int s=1; s<=5-r; s++) {
				System.out.print(" ");
			}	 
			for(int c=1; c<=r ;c++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------------------------------------");
     }
}     
