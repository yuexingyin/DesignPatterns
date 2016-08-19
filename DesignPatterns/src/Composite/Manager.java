package Composite;

/**
 * Created by YuexingYin on 8/2/16.
 */
public class Manager extends Supervisor {

    String name;

    public Manager(String name){
        this.name = name;
    }

    public Manager(){
        super();
        title = "Manager";
    }

    public void stateName(){
        super.stateName();
    }
}
