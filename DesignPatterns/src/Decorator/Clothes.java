package Decorator;

/**
 * Created by YuexingYin on 7/26/16.
 */
abstract class Clothes {
    protected Person person;
    public Clothes(Person person){
        this.person = person;
    }
    public void wear(){
        person.wear();
    };
}
