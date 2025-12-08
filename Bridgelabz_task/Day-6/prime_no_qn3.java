package Fib;
import java.util.Scanner;
public class prime_no_qn3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int prime_no = sc.nextInt();
		int count=0;
		if(prime_no <= 1) {
			System.out.print("not an prime no");
		}else if(prime_no == 2) {
			System.out.print("prime no");
		}else {
			for(int i=2;i<prime_no;i++) {
				if(prime_no % i == 0) {
					count++;
				}
			}
		}
		if(count>=1) {
			System.out.print("not an prime no");
		}else{
			System.out.print("prime no");
		}  
	}
}
