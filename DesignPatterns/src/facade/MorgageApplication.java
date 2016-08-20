package facade;

/**
 * Created by YuexingYin on 8/19/16.
 */
public class MorgageApplication {
    //double amount;

    private Bank bank = new Bank();
    private Loan loan = new Loan();
    private Credit credit = new Credit();

    public boolean isEligible(Customer customer){
        if(bank.sufficientSavings(customer)){
            System.out.println("Good Savings");
            return true;
        }else if(loan.goodLoan(customer)){
            System.out.println("Good loan");
            return true;
        }else if(credit.googCredit(customer)){
            System.out.println("Good credits");
            return true;
        }

        return false;
    }

    public void messageCustomer(Customer customer){
        if(!isEligible(customer)){
            System.out.println("Sorry, you are not qualified");
        }

        System.out.println("You are good to go");
    }

}
