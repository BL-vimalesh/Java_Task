package Day_1;

import java.util.Scanner;

public class palindrome_no {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int temp = n;
		int rem = 0;
		int sum = 0;
		while(n!=0) {
			sum = n % 10;
			rem = rem * 10 + sum;
			n = n / 10;
		}
		if(rem == temp) {
			System.out.print("palindrome");
		}else {
			System.out.print("not an palindrome");
		}
	}

}
