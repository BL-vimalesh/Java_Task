package day_5;

import java.util.Scanner;

public class vowels_or_consonent_qn9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || 
				ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.print("the character is vowels");
		}else {
			System.out.print("the character is consonent");
		}
	}
}
