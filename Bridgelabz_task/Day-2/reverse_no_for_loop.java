package Day_1;

import java.util.Scanner;

public class reverse_no_for_loop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int rem = 0;
		for(;n!=0;n = n / 10) {
			int sum=n % 10;
			rem = rem * 10 + sum;
		}
       System.out.print(rem);
	}

}
