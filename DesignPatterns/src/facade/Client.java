package facade;

/**
 * Created by YuexingYin on 8/19/16.
 */
public class Client {
    public static void main(String [] args){
        Customer ivan = new Customer("Ivan", 10, 123,567);
        MorgageApplication application = new MorgageApplication();
        application.messageCustomer(ivan);
    }
}
