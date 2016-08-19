package strategy;

/**
 * Created by YuexingYin on 7/26/16.
 */
public class BubbleSort implements Strategy {

    @Override
    public String sort(int[] nums) {
        return nums.length + " so bubble";
    }

}
