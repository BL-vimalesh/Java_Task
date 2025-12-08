package Day_1;

import java.util.Scanner;

public class natural_no_for_loop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int rem = 0;
		
		for(int i=1;i<=n;i++) {
			System.out.print(i);
			rem = rem + i;
		}
		System.out.print(rem);
	}

}
