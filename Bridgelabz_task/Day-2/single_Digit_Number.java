package Day_1;
import java.util.Scanner;
public class single_Digit_Number {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
    	if(n==1) {
    		System.out.print("one");
    	}else if(n == 2) {
		    System.out.print("Two");
    	}else if(n == 3) {
	        System.out.print("three");
    	}else if(n == 4) {
	        System.out.print("Four");
    	}else if(n == 5) {
        	System.out.print("Five");
    	}else if(n == 6) {
	       System.out.print("six");
    	}else if(n == 7) {
	       System.out.print("Seven");
    	}else if(n == 8) {
	      System.out.print("Eight");
    	}else if(n == 9) {
  	      System.out.print("Nine");
    	}else if(n == 10) {
  	      System.out.print("Ten");
    	}else {
  	      System.out.print("Not a single digit number!"); 
}}}