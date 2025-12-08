package Day_1;

import java.util.Scanner;

public class number_display {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n == 1) {
			System.out.print("unit");
		}else if(n==10) {
			System.out.print("Ten");
		}else if(n==100) {
			System.out.print("Hundred");
		}
		else if(n == 1000) {
			System.out.print("Thousand");
		}
		else {
			System.out.print("the number 1 10 100 1000 only allowd");
	}
}}
