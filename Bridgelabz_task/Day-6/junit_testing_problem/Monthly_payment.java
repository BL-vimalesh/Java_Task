package Fib;

import java.util.Scanner;

public class Monthly_payment {
	public static double interest(int P,int Y, int R) {
		int n = 12 * Y;
		double r=R/(12.0*100);
		double payment = (P * r) / (1- Math.pow(1+r, -n));
		return payment;			
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt();
		int Y = sc.nextInt();
		int R = sc.nextInt();
        double result = interest(P,Y,R);
        System.out.print(result);
	}
}
