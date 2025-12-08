package day_5;

import java.util.Scanner;

public class Functional_program_qn4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int delta = (int) (Math.abs(b * b - 4 * a * c));
		System.out.print(delta);
		double quadraticpos = Math.sqrt(-b) + Math.sqrt(delta)/ 2 * a;
		double quadraticneg = Math.sqrt(-b) - Math.sqrt(delta)/ 2 * a;
        System.out.println(quadraticpos);
        System.out.print(quadraticneg);
		
	}
}
