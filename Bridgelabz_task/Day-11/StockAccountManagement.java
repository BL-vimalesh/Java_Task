package day_11;

import java.util.ArrayList;
import java.util.Scanner;
class Stock {
    private String name;
    private int numberOfShares;
    private double sharePrice;

    public Stock(String name, int numberOfShares, double sharePrice) {
        this.name = name;
        this.numberOfShares = numberOfShares;
        this.sharePrice = sharePrice;
    }

    public double getStockValue() {
        return numberOfShares * sharePrice;
    }

    public void printStockReport() {
        System.out.printf("Stock: %-10s | Shares: %3d | Price: ₹%.2f | Value: ₹%.2f%n",
                          name, numberOfShares, sharePrice, getStockValue());
    }
}

class StockPortfolio {
    private ArrayList<Stock> stocks;

    public StockPortfolio() {
        stocks = new ArrayList<>();
    }

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public void printPortfolioReport() {
        double totalValue = 0;
        System.out.println("\nStock Portfolio Report:");
        for (Stock stock : stocks) {
            stock.printStockReport();
            totalValue += stock.getStockValue();
        }
        System.out.printf("Total Portfolio Value: ₹%.2f%n", totalValue);
    }
}

public class StockAccountManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StockPortfolio portfolio = new StockPortfolio();

        System.out.print("Enter number of stocks: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("\nEnter details for Stock " + i + ":");
            System.out.print("Stock Name: ");
            String name = scanner.next();
            System.out.print("Number of Shares: ");
            int shares = scanner.nextInt();
            System.out.print("Share Price: ");
            double price = scanner.nextDouble();

            Stock stock = new Stock(name, shares, price);
            portfolio.addStock(stock);
        }

        portfolio.printPortfolioReport();
        scanner.close();
    }
}

