package BasicProgram;
import java.util.Scanner;
//Print the prime number Range with 1 to 20 

public class PrintSmallestPrimeNumber {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		//User input
		System.out.println("Enter a Lower Range");
		int lowerrange = sc.nextInt();
		
		System.out.println("Enter a Upper Range");
		int upperrange = sc.nextInt();
		
	 //traverse the 1 to 20 -> outer loop
		for(int i = lowerrange; i <= upperrange; i++) {
			int count = 0;
			//for loop to check the given number is prime or not 
			for(int j = 1; j<=i; j++) {
				if(i % j == 0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.print(i);
				break;
			}
		}
	}

}
