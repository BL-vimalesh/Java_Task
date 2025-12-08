package Day_1;

import java.util.Scanner;

public class reverse_no {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int sum = 0;
		int rem = 0;
		while(n!=0) {
			sum = n % 10;
			rem = rem * 10 + sum;
			n = n / 10;
		}
		System.out.println(rem);

	}

}
