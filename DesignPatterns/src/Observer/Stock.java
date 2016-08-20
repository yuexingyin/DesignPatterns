package Observer;

import java.util.ArrayList;

/**
 * Created by YuexingYin on 8/19/16.
 */
abstract class Stock {
    protected String symbol;
    protected double price;
    protected ArrayList<IInvestor> investors = new ArrayList<>();

    public void addObserver(IInvestor investor){
        investors.add(investor);
    }
    public void deleteObserver(IInvestor investor){
        investors.remove(investor);
    }


}
