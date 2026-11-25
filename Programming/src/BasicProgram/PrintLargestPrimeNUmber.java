package BasicProgram;
import java.util.Scanner;

public class PrintLargestPrimeNUmber {
	public static void main(String []agrs) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Lower Range");
		int lowerrange = sc.nextInt();
		
		System.out.println("Enter Upper Range");
		int upperrange = sc.nextInt();
		
		//finding the largest prime number
		for(int i = upperrange; i >= lowerrange; i--) {
			int count = 0;
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) count++;
			}
			if(count == 2) {
				System.out.println("Largest prime number is: "+i);
				break;
			}
		}
		
	}
}
