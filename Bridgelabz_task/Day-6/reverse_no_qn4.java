package Fib;

import java.util.Scanner;

public class reverse_no_qn4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int rem =0,sum=0;
        while(num!=0) {
        	rem = num % 10;
        	sum = sum * 10 + rem;
        	num = num / 10;
        }
        System.out.print(sum);
	}
}
