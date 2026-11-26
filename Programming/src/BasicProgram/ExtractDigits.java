package BasicProgram;
import java.util.Scanner;

public class ExtractDigits {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = sc.nextInt();
		extractDigits(num);
	}
	//for extracting a digits
	public static void extractDigits(int num) {
		int rem = 0;
		while(num != 0) {
			 rem = num % 10;
			 System.out.print(rem);
			num /= 10;
		}
	}

}
