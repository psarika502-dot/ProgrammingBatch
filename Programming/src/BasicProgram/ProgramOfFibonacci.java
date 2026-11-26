package BasicProgram;
import java.util.Scanner;

public class ProgramOfFibonacci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		System.out.println("a: "+printfibonacci(num));
	}
//	fibonacci series
//	  0 + 1 => 1
//    1 + 1 => 2
//    1 + 2 => 3
//    2 + 3 => 5
//    3 + 5 => 8
//    5 + 8 => 13
	public static int printfibonacci(int num) {
		int a = 0;
		int b = 1;
		
		for(int i = 1; i <= num; i++) {
			int sum = a + b;
			a = b;
			b = sum;
		}
		return a;
	}

}
