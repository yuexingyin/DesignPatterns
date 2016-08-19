package Decorator;

/**
 * Created by YuexingYin on 7/26/16.
 */
public class Shirts extends Clothes {

    public Shirts(Person person) {
        super(person);
    }

    @Override
    public void wear() {
        person.wear();
        System.out.println("shirt");
    }
}
