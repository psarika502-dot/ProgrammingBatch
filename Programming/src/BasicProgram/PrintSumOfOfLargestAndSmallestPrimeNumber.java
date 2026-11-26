package BasicProgram;
import java.util.Scanner;

public class PrintSumOfOfLargestAndSmallestPrimeNumber {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Lower Range");
		int lowerrange = sc.nextInt();
		
		System.out.println("Enter Upper Range");
		int upperrange = sc.nextInt();
		
		System.out.println("Smallest Prime Number: "+smallestPrime(lowerrange,upperrange));
		System.out.println("Largest Prime Number: "+largestPrime(lowerrange,upperrange));
		System.out.println("Adding the lowest and smallest prime number: "+(smallestPrime(lowerrange,upperrange)+largestPrime(lowerrange,upperrange)));
	}
//	find smallest Number 
	public static int smallestPrime(int lowerNum , int upperNum) {
		int lowerRange = 0;
		for(int i = lowerNum; i <= upperNum; i++) {
			int count = 0;
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) count++;
			}
			if(count == 2) {
				lowerRange = i;
				break;
			}
		}
		return lowerRange;
	}
	public static int largestPrime(int lowerNum , int upperNum) {
		int lowerRange = 0;
		for(int i = upperNum; i >= lowerNum; i--) {
			int count = 0;
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) count++;
			}
			if(count == 2) {
				lowerRange = i;
				break;
			}
		}
		return lowerRange;
	}
	

}
