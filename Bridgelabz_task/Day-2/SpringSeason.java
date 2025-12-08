package Day_1;

import java.util.Scanner;

public class SpringSeason {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int m = sc.nextInt();
		if(m>=3 && m<=6) {
				if(m==3 && d<20) {
					System.out.print(false);
			}else if(m==6 && d>20) {
				System.out.print(false);
			}else {
				System.out.print(true);
			}
		}else {
			System.out.print(false);
		}
	}

}
