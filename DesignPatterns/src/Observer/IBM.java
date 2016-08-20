package Observer;

/**
 * Created by YuexingYin on 8/19/16.
 */
public class IBM extends Stock {
    private String symbol;
    private double price;

    public String getSymbol() {
        return symbol;
    }

    public double getPrice() {
        return price;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
