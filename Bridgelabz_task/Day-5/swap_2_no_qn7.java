package day_5;

import java.util.Scanner;

public class swap_2_no_qn7 {

	public static void main(String[] args) {
	     Scanner sc = new Scanner(System.in);
	     int a = sc.nextInt();
	     int b = sc.nextInt();
	     a = a + b;
	     b = a -b;
	     a = a - b;
	     System.out.println(a);
	     System.out.println(b);
	}
}
