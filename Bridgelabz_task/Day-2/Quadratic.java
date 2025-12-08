package Day_1;

import java.util.Scanner;

public class Quadratic {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int delta = 0;
		delta = b * b - 4*a *c;
		double quadraticpos = Math.sqrt(-b) + Math.sqrt(delta)/ 2 * a;
		double quadraticneg = Math.sqrt(-b) - Math.sqrt(delta)/ 2 * a;
        System.out.println(quadraticpos);
        System.out.print(quadraticneg);
	}
}
