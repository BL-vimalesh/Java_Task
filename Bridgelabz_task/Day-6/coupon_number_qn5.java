package Fib;

import java.util.*;
import java.util.Scanner;

public class coupon_number_qn5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int coupon_number = sc.nextInt();
		Set<Integer> set = new HashSet();
		int count=0;
		while(true) {
		int generate_random = (int) (Math.floor(Math.random() * coupon_number));
		count++;
        set.add(generate_random);
        System.out.println(generate_random);
        if(set.size() == coupon_number) {
        	System.out.println(count);
        	System.out.println(set);
        	break;
        }
	}
}}
