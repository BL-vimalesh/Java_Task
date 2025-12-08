package Day_1;

import java.util.Scanner;

public class Check_Vowel_or_Consonant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c =sc.next().charAt(0);
		switch(c) {
		case 'A':
			System.out.print("vowels");
			break;
		case 'E':
			System.out.print("vowels");
			break;
		case 'I':
			System.out.print("vowels");
			break;
		case 'O':
			System.out.print("vowels");
			break;
		case 'U':
			System.out.print("vowels");
			break;
		case 'a':
			System.out.print("vowels");
			break;
		case 'e':
			System.out.print("vowels");
			break;
		case 'i':
			System.out.print("vowels");
			break;
		case 'o':
			System.out.print("vowels");
			break;
		case 'u':
			System.out.print("vowels");
			break;
		default:
			System.out.println("Consonant");	
		}
	}
}
