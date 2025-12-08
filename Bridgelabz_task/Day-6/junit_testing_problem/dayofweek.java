package Fib;

import java.util.Scanner;

public class dayofweek {
	static int days(int d, int m, int y) {
		int y0 = y - (14 - m) / 12;
		int x = y0 + y0/4 - y0/100 + y0/400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + 31*m0/12) % 7;
		if(d0 == 0) {
			System.out.print("sunday");
		}else if(d0==1) {
			System.out.print("Monday");
		}else if(d0==2) {
			System.out.print("Tuesday");
		}else if(d0==3) {
			System.out.print("Wednesday");
		}else if(d0==4) {
			System.out.print("Thursday");
		}else if(d0==5) {
			System.out.print("Friday");
		}else if(d0==1) {
			System.out.print("Saturday");
		}
		System.out.print(d0);
		return d0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int m = sc.nextInt();
		int y = sc.nextInt();
		days(d,m,y);
	}
}
