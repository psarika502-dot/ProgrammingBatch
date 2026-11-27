package BasicProgram;

public class PrintReverseNum {
	public static void main(String[]args) {
		int num = 23483;
		printReverseNum(num);
	}
	//Extract the digits
	public static void printReverseNum(int num) {
		while(num != 0 ) {
			int rem = num % 10;
			System.out.print(rem);
			num/=10;
		}
	}
}
