package BasicProgram;
import java.util.Scanner;

//WAJP to print the factor or divisor for a given ouptput
public class PrintFactor {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Any Number : ");
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++) {
			if(input % i == 0) System.out.println(i);
		}
	}
}
