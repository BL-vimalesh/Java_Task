package Fib;

import java.util.Scanner;

public class temperature_conversion_qn3 {
	static double temperature(int temp, int type) {
		if(type == 1) {
			return (temp * 9.0/5.0) + 32;
		}else if(type == 2) {
			return (temp - 32) * 5.0/9.0;
		}
		System.out.print("invalid type");
		return Double.NaN;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		int type = sc.nextInt();
		double result = temperature(temp,type);
		System.out.print(result);
	}
}
