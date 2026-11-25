package BasicProgram;
import java.util.Scanner;

public class tofFindPrimeNoGivenRange {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		 System.out.print("Enter Lower Range: ");
		 int lowerrange = sc.nextInt();
		 
		 System.out.print("Enter Upper Range: ");
		 int upperrange = sc.nextInt();
		 
		 
		 //find the range
		 for(int i = lowerrange; i <= upperrange; i++) {
			 int count = 0;
			 for(int j = 1; j <= i; j++) {
				 if(i % j == 0) {
					 count++;
				 }
				 }
			 if(count == 2) System.out.println(i);
		 }
		 
	}
	
	

}
