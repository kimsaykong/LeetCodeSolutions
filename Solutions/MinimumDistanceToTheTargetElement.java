package Solutions;

public class MinimumDistanceToTheTargetElement {
    public static int[] case1 = {1,2,3,4,5};
    public static int[] case2 = {1};
    public static int[] case3 = {1,1,1,1,1,1,1,1,1,1};
    public int getMinDistance(int[] nums, int target, int start) {
        int store = Integer.MAX_VALUE, min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) store = i;
            min = Math.min(min, Math.abs(store - start));
        }
        return min;
    }
}
