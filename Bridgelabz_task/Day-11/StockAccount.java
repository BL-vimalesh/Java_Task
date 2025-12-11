package day_11;


import java.io.*;
import java.util.*;

public class StockAccount {
    private Map<String, CompanyShares> portfolio;

    public StockAccount(String filename) {
        portfolio = new HashMap<>();
        load(filename);
    }

    public void buy(int amount, String symbol) {
        CompanyShares cs = portfolio.get(symbol);
        if (cs != null) {
            cs.setShares(cs.getShares() + amount);
        } else {
            portfolio.put(symbol, new CompanyShares(symbol, amount));
        }
        System.out.println("Bought " + amount + " shares of " + symbol);
    }

    public void sell(int amount, String symbol) {
        CompanyShares cs = portfolio.get(symbol);
        if (cs != null && cs.getShares() >= amount) {
            cs.setShares(cs.getShares() - amount);
            System.out.println("Sold " + amount + " shares of " + symbol);
        } else {
            System.out.println("Not enough shares to sell or symbol not found.");
        }
    }

    public double valueOf() {
        double total = 0;
        for (CompanyShares cs : portfolio.values()) {
            double price = getPrice(cs.getSymbol()); 
            total += cs.getValue(price);
        }
        return total;
    }

    public void printReport() {
        System.out.println("\nStock Report:");
        for (CompanyShares cs : portfolio.values()) {
            double price = getPrice(cs.getSymbol());
            System.out.printf("%s | Price: ₹%.2f | Value: ₹%.2f%n",
                              cs.toString(), price, cs.getValue(price));
        }
        System.out.printf("Total Account Value: ₹%.2f%n", valueOf());
    }

    public void save(String filename) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(filename))) {
            for (CompanyShares cs : portfolio.values()) {
                pw.println(cs.getSymbol() + "," + cs.getShares());
            }
            System.out.println("Portfolio saved to " + filename);
        } catch (IOException e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }

    private void load(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String symbol = parts[0];
                int shares = Integer.parseInt(parts[1]);
                portfolio.put(symbol, new CompanyShares(symbol, shares));
            }
            System.out.println("Portfolio loaded from " + filename);
        } catch (IOException e) {
            System.out.println("No existing file found. Starting fresh.");
        }
    }

    private double getPrice(String symbol) {
        return switch (symbol.toUpperCase()) {
            case "TCS" -> 3500.0;
            case "INFY" -> 1600.0;
            case "WIPRO" -> 450.0;
            default -> 100.0;
        };
    }
}
