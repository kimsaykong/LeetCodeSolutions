package Solutions;

public class TwoFurthestHousesWithDifferentColors {
    public static int[] case1 = {1,1,1,6,1,1,1};
    public static int[] case2 = {1,8,3,8,3};
    public static int[] case3 = {0,1};
    public int maxDistance(int[] colors) {
        int res = 0;
        for (int i = 0; i < colors.length; ++i) {
            if (colors[i] != colors[0])
                res = Math.max(res, i);
            if (colors[i] != colors[colors.length - 1])
                res = Math.max(res, colors.length - 1 - i);
        }
        return res;
    }
}
