package Day_1;

import java.util.Scanner;

public class operator_program_1 {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int a = sc.nextInt();
    	int b = sc.nextInt();
    	int c = sc.nextInt();
    	int new1,new2,new3,new4=0;
    	new1 = a + b * c;
    	new2 = c + a / b;
    	new3 = a % b + c;
    	new4 = a * b + c;
    	int max1 = Math.max(new1,new2);
    	int max2 = Math.max(new3,new4);
    	int mainmax = Math.max(max2, max1);
    	int min1 = Math.min(new1,new2);
    	int min2 = Math.min(new3,new4);
    	int mainmin = Math.min(max2, max1);
    	System.out.print(mainmax+" "+mainmin);
    }
}
