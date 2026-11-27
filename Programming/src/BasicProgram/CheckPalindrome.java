package BasicProgram;

public class CheckPalindrome {
	public static void main(String [] agrs) {
		int num = 121;
		System.out.println(isPrime(num));
	}
	//to check the given number is palindrome or not ex: 121 -> o/p 121
	public static boolean isPrime(int num) {
		int temp = num;
		int rev = 0;
		while(temp != 0) {
			int rem = temp % 10;
			rev = rev *10 + rem;
			System.out.println(rev);
			temp /= 10;
		}
		return num == rev;
	}
}
