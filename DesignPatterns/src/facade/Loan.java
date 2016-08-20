package facade;

/**
 * Created by YuexingYin on 8/19/16.
 */
public class Loan {

    public boolean goodLoan(Customer customer){
        if(customer.getLoan()<100){
            return true;
        }

        return false;
    }
}
