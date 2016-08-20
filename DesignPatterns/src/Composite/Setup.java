package Composite;

/**
 * Created by YuexingYin on 8/2/16.
 */
public class Setup {
    public static void main(String []args) {
        Clerk lucy = new Clerk("Lucy");
        Manager bosh = new Manager("Bosh");
        bosh.add(lucy);

        Clerk jerry = new Clerk("Jerry");
        Manager wayne = new Manager("Wayne");
        wayne.add(jerry);

        President ivan = new President("Ivan");
        ivan.add(bosh);
        ivan.add(wayne);
    }

}
