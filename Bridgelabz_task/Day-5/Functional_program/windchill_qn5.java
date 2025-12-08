package day_5;

import java.util.Scanner;

public class windchill_qn5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double t = sc.nextDouble(); 
        double v = sc.nextDouble(); 

        if (Math.abs(t) > 50 || v < 3 || v > 120) {
            System.out.println("Invalid input range.");
            return;
        }

        double windChill = 35.75 + 0.6215 + (0.4275 * t - 35.75) * Math.pow(t, 0.16); 
        System.out.print(windChill);
	}
}