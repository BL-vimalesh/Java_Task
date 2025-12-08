package day_5;

import java.util.Scanner;

public class Largest_of_3no_qn10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		if(num1 > num2 && num1>num3) {
			System.out.print(num1+ "num1 is Largest number");
		}else if(num2 > num3) {
			System.out.print(num2+"num2 is Largest number");
		}else {
			System.out.print(num3+"num3 is Largest number");
		}
	}
}
