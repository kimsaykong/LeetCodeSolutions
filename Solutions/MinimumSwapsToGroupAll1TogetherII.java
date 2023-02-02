package Solutions;
import java.util.Arrays;

public class MinimumSwapsToGroupAll1TogetherII {
    public static int[] case1 = {0,1,0,1,1,0,0};
    public static int[] case2 = {0,1,1,1,0,0,1,1,0};
    public static int[] case3 = {1,1,0,0,1};

    public int minSwaps(int[] nums) {
        int swapNum=0;
        int totalOne = Arrays.stream(nums).sum();
        if (nums.length==totalOne||totalOne==0) return 0;

        return swapNum;
    }
}
