package Decorator;

/**
 * Created by YuexingYin on 7/26/16.
 */
abstract class Person {
    private String name;
    public String getName(){return name;}
    public void setName(String name){this.name = name;}
    public abstract void wear();
}
