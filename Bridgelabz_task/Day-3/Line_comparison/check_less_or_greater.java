package day_3_line_comparison;

import java.util.Scanner;

public class check_less_or_greater {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x1=sc.nextDouble();
		double x2=sc.nextDouble();
		double x3=sc.nextDouble();
		double x4=sc.nextDouble();
		double y1=sc.nextDouble();
		double y2=sc.nextDouble();
		double y3=sc.nextDouble();
		double y4=sc.nextDouble();
		double result1 = 0.0;
		double result2 = 0.0;
		result1 = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1,2));
		result2 = Math.sqrt(Math.pow(x4-x3, 2) + Math.pow(y4-y3,2));
		if(result1 == result2) {
			System.out.print("both end points are same");
		}else if(result1 > result2){
			System.out.print("result1 is greater than result2");
		}else
			System.out.print("result2 is greter than result1");
		}
	}
