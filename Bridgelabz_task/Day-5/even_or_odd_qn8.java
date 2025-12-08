package day_5;

import java.util.Scanner;

public class even_or_odd_qn8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num % 2 == 0) {
			System.out.print("even");
		}else {
			System.out.print("odd");
		}
	}
}