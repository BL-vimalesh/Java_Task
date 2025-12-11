package day_11;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StockAccount account = new StockAccount("portfolio.txt");

        while (true) {
            System.out.println("\n1. Buy Shares\n2. Sell Shares\n3. View Report\n4. Save & Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter symbol: ");
                    String symbol = sc.next();
                    System.out.print("Enter amount: ");
                    int amount = sc.nextInt();
                    account.buy(amount, symbol);
                }
                case 2 -> {
                    System.out.print("Enter symbol: ");
                    String symbol = sc.next();
                    System.out.print("Enter amount: ");
                    int amount = sc.nextInt();
                    account.sell(amount, symbol);
                }
                case 3 -> account.printReport();
                case 4 -> {
                    account.save("portfolio.txt");
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}
