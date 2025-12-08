package Day_1;

import java.util.Scanner;

public class sum_of_natural_no {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int k=0;
		int i=1;
		while(i<=n) {
			k = k + i;
			i++;
		}
		System.out.print(k);

	}

}
