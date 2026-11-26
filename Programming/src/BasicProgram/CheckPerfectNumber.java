package BasicProgram;
import java.util.Scanner;

public class CheckPerfectNumber {
	public static void main(String[]agrs) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		System.out.println(num +" perfect number is "+isPerfect(num));
	}
	//create method to check the perfect number or not
	public static boolean isPerfect(int num) {
		int sum = 0;
		for(int i = 1; i <= num/2; i++) {
			if(num % i == 0) {
				sum += i;
			}
		}
		return num == sum;
	}

}
