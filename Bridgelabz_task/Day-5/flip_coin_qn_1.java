package day_5;

import java.util.Scanner;

public class flip_coin_qn_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int head =0,tail=0;
        for(int i=0;i<num;i++) {
           int random = (int)(Math.floor(Math.random() * 2));	
        if(random < 0.5) {
        	tail++;
//        	System.out.print("tails");
        }else {
        	head++;
//        	System.out.print("head");
        }
	}
        head = head * num;
        tail = tail * num;
        System.out.println("percentages of head"+ head+"percentages");
        System.out.println("percentages of tail"+ tail+"percentages");
	}
}
