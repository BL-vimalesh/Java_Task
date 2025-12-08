package day_5;

import java.util.Scanner;

public class Quotient_remainter_qn6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int Quotient = num % 10;
		int remainter = num / 10;
		
		System.out.println(Quotient);
		System.out.println(remainter);
	}
}
