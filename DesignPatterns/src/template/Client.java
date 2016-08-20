package template;

/**
 * Created by YuexingYin on 8/19/16.
 */
public class Client {
    public static void main(String [] args){
        Tea tea = new Tea();
        Coffee coffee = new Coffee();
        System.out.println("Lets make some tea");
        tea.prepareReceipt();
        System.out.println("Lets make some coffee");
        coffee.prepareReceipt();
    }
}
