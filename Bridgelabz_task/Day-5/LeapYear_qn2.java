package day_5;

import java.util.Scanner;

public class LeapYear_qn2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        
        if (year < 1000 || year > 9999) {
            System.out.println("Not a proper year");
        } else if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }
    }
}
