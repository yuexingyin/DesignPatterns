package Composite;

/**
 * Created by YuexingYin on 8/19/16.
 */
public class President extends Supervisor {
    String name;

    public President(String name){
        this.name = name;
    }

    public President(){
        title = "President";
    }

    @Override
    public void stateName() {
        super.stateName();
    }
}
