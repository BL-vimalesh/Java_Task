package day_5;
import java.util.Scanner;
public class power_of_2_qn3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=0;i<num;i++) {
			int value =(int) Math.pow(2, i);
			System.out.println("2^"+i +" = "+value);
		}
	}
}
