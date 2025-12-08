package day_5;

import java.util.Scanner;

public class Distance_qn3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		double output = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		System.out.println(output);
	}
}
