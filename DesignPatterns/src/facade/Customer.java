package facade;

/**
 * Created by YuexingYin on 8/19/16.
 */
public class Customer {
    String name;
    double savings, loan, credits;

    public Customer(String name, double savings, double loan, double credits) {
        this.name = name;
        this.savings = savings;
        this.loan = loan;
        this.credits = credits;
    }

    public String getName() {
        return name;
    }

    public double getSavings() {
        return savings;
    }

    public double getLoan() {
        return loan;
    }

    public double getCredits() {
        return credits;
    }
}
