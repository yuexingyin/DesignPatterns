package template;

/**
 * Created by YuexingYin on 8/19/16.
 */
abstract class CaffeineBeverage {

    public void prepareReceipt(){
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public void boilWater(){
        System.out.println("Boiling water");
    }
    abstract void brew();
    void pourInCup(){
        System.out.println("Pouring into cup");
    }
    abstract void addCondiments();
}
