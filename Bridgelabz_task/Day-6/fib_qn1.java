package Fib;

import java.util.Scanner;

public class fib_qn1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a=0,b=1;
		int k=0;
		System.out.println(a+""+b);
		for(int i=2;i<num;i++) {
			k = a+b;
			System.out.println(k);
			a = b;
			b = k;
		}
	}
}