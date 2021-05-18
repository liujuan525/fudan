package HomeworkBook.Homework_4_5;

/**
 * 课后习题 4.5
 */

public class Stock {
    String symbol; // 股票代码
    String name; // 股票名称
    double previousPrice; // 股票的前一日收盘价
    double currentPrice; // 股票的当前价格

    // 构造函数
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
        double percent =
                (getCurrentPrice() - getPreviousPrice()) / getPreviousPrice();
        return percent * 100;
    }

    public static void main(String[] args) {
        Stock stockTest = new Stock("600000","浦发银行");
        stockTest.setPreviousPrice(25.50);
        stockTest.setCurrentPrice(28.60);
        double change = stockTest.getChangePercent();
        System.out.printf("价格变化百分比为：%5.2f%%", change);
    }


}