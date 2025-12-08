package day_3_line_comparison;

import java.util.Scanner;

public class cartesian_problem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1=sc.nextDouble();
		double x2=sc.nextDouble();
		double y1=sc.nextDouble();
		double y2=sc.nextDouble();
		double result = 0.0;
		
		result = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		System.out.print(result);
	}

}
