package BasicProgram;
import java.util.Scanner;

//WAJP to count the divisor of factor for a given input
public class CountFactor {
	public static void main(String []agrs) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number: ");
		
		int input = sc.nextInt();
		System.out.println(countFactors(input));
		
	}
	
	public static int countFactors(int num) {
		int count = 0;
		for(int i = 1; i <= num; i++) {
			if(num % i == 0) {
				count++;
			}
		}
		return count;
	}
}
