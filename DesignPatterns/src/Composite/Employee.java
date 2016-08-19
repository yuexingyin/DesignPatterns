package Composite;

/**
 * Created by YuexingYin on 8/2/16.
 */
public abstract class Employee {
    String title = "";
    String name = "";

    public void stateName(){
        System.out.println(title+" "+name);
    }
}
