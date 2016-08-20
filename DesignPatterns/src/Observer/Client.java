package Observer;

/**
 * Created by YuexingYin on 8/19/16.
 */
public class Client {
    public static void main(String []args){
        Investor lucy =new Investor("Lucy");
        Investor jack = new Investor("Jack");

        IBM ibm = new IBM();

        ibm.addObserver(lucy);
        ibm.addObserver(jack);
        ibm.setPrice(1000);

        lucy.update(10);
    }
}
