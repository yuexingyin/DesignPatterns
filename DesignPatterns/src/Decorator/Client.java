package Decorator;

/**
 * Created by YuexingYin on 7/26/16.
 */
public class Client {
    public static void main(String [] args ){
        Person man = new Person("Ivan");
        Shirts shirts = new Shirts(man);
        Pants pants = new Pants(man);
        shirts.wear();
        pants.wear();
    }
}
