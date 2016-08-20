package facade;

/**
 * Created by YuexingYin on 8/19/16.
 */
public class Bank {

    public boolean sufficientSavings(Customer customer){
        if(customer.getSavings() > 100){
            return true;
        }
        return false;
    }

}
