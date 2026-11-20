package BasicProgram;
import java.util.Scanner;
//find Prime Number
public class FindPrimeNumber {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number :");
		int input = sc.nextInt();
		if(isPrime(input)) System.out.println(input +" is a Prime number");
		else System.out.println(input +" is not a Prime number");
	}
	
	//find prime number
	public static boolean isPrime(int num) {
		int count = 0;
		if(num == 0 || num == 1) return false;
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) count++;
		}
		return count == 2;
	}
}
