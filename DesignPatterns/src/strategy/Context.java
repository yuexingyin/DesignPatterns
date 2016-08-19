package strategy;

/**
 * Created by YuexingYin on 7/26/16.
 */
public class Context {


    public String sortingContext(int nums[]){
        if(nums.length < 10){
             return new BubbleSort().sort(nums);
        }else{
            return new InsertionSort().sort(nums);
        }
    }
}
