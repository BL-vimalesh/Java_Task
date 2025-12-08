package day_5;

import java.util.Scanner;

public class Harmonic_number_qn4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double value=0.0;
		int num = sc.nextInt();
		for(int i=1;i<=num;i++) {
			value = value + 1.0/i; 
		}
		System.out.print(value);
	}
}
