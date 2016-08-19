package strategy;

/**
 * Created by YuexingYin on 7/26/16.
 */
public class Client {
    public static void main(String [] args){
        int nums[] = {1,2,3,4,5,6};
        Context context = new Context();
        System.out.println(context.sortingContext(nums));
    }
}
