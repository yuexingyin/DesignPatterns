package template;

/**
 * Created by YuexingYin on 8/19/16.
 */
public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Steep the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding the tea");
    }
}
