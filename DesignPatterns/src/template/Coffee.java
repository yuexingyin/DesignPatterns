package template;

/**
 * Created by YuexingYin on 8/19/16.
 */
public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Steep coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding coffee");
    }
}
