package facade;

/**
 * Created by YuexingYin on 8/19/16.
 */
public class Credit {
    public boolean googCredit(Customer customer){
        if(customer.getCredits() > 200){
            return true;
        }
        return false;
    }
}
