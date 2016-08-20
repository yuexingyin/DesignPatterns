package Observer;

/**
 * Created by YuexingYin on 8/19/16.
 */
public class Investor implements IInvestor {

    private String name;
    private Stock stock;

    public Investor(String name){
        this.name = name;
    }

    @Override
    public void update(double price) {
        System.out.println(price);
    }
}
