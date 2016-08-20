package Composite;

/**
 * Created by YuexingYin on 8/19/16.
 */
public class Clerk extends Employee {
    String name;
    public Clerk(String name){
        this.name = name;
    }

    public Clerk(){
        title = "Clerk";
    }

    @Override
    public void stateName() {
        super.stateName();
    }
}
