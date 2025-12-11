package day_11;

import java.time.LocalDateTime;

public class CompanyShares {
    private String symbol;
    private int shares;
    private LocalDateTime dateTime;

    public CompanyShares(String symbol, int shares) {
        this.symbol = symbol;
        this.shares = shares;
        this.dateTime = LocalDateTime.now();
    }

    public String getSymbol() {
        return symbol;
    }

    public int getShares() {
        return shares;
    }

    public void setShares(int shares) {
        this.shares = shares;
        this.dateTime = LocalDateTime.now();
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public double getValue(double pricePerShare) {
        return shares * pricePerShare;
    }

    @Override
    public String toString() {
        return String.format("Symbol: %s | Shares: %d | Last Transaction: %s",
                             symbol, shares, dateTime.toString());
    }
}
