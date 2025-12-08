package Fib;

import java.util.Scanner;

public class sqrt_qn5 {
	public static double sqrt(double c) {
        if (c < 0) 
             return Double.NaN; 
        double epsilon = 1e-15;       
        double t = c;                 
        while (Math.abs(t - c/t) > epsilon * t) {
            t = (t + c/t) / 2.0;      
        }
        return t;
    }
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        System.out.println("Square root: " + sqrt(num));
    }
}