package chapter4.practise5;

// 4-5
public class Stock {
    String symbol;
    String name;
    double previousPrice;
    double currentPrice;

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public void setPreviousPrice(double previousPrice) {
        this.previousPrice = previousPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getPreviousPrice() {
        return previousPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public double getChangePercent() {
        double percent = (getCurrentPrice() - getPreviousPrice()) / getPreviousPrice();
        return percent * 100;
    }

    public static void main(String[] args) {
        Stock pfyh = new Stock("600000","浦发银行");
        pfyh.setPreviousPrice(25.50);
        pfyh.setCurrentPrice(28.60);
        double change = pfyh.getChangePercent();
        System.out.printf("价格变化百分比为：%5.2f%%", change);
    }

}
