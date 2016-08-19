package Decorator;

/**
 * Created by YuexingYin on 7/26/16.
 */
public class Person {
    private String name;
    public Person(String name){
        this.name = name;
        System.out.println(name);
    }
    public void wear(){};
}
