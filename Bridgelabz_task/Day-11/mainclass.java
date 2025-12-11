package day_11;

import java.util.Scanner;

public class mainclass {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

	    System.out.print("Please enter the initial balance: ");
	    Account ac = new Account(sc.nextDouble());

	    while (true) {
	        System.out.println("\nChoose an option:");
	        System.out.println("1. Debit");
	        System.out.println("2. Credit");
	        System.out.println("3. Check Balance");
	        System.out.println("4. Exit");

	        int choice = sc.nextInt();

	        switch (choice) {
	            case 1:
	                System.out.print("Enter amount to debit: ");
	                ac.debit(sc.nextDouble());
	                break;

	            case 2:
	                System.out.print("Enter amount to credit: ");
	                ac.credit(sc.nextDouble());
	                break;

	            case 3:
	                ac.getbalance();
	                break;

	            case 4:
	                System.out.println("Exiting program...");
	                return; 

	            default:
	                System.out.println("Invalid input");
	        }
	    }}}

