package Fib;

import java.util.Scanner;

public class vending_machine_qn1 {
	
	static int[] vending = {1000,500,100,50,10,5,2,1};
	static int count = 0;
	
	public static void machine(int num) {
		int sum = 0;
		while(num!=0) {
		for(int i=0;i<vending.length;i++) {
			while(num>=vending[i]) {
				count++;
				num = num - vending[i];
				System.out.println("$"+ vending[i]);
			}
		}
	}}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		machine(num);
        System.out.print(count);
	}

}
