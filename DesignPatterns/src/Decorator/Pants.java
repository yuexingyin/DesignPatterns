package Decorator;

/**
 * Created by YuexingYin on 7/26/16.
 */
public class Pants extends Clothes {

    public Pants(Person person) {
        super(person);
    }

    @Override
    public void wear() {
        person.wear();
        System.out.println("I just put on pants");
    }
}
