package Solutions;

public class Convert1DArrayInto2DArray {
    public static int[] case1= {1,2};

    public int[][] construct2DArray(int[] original, int m, int n) {
        int[][] result = new int[0][];
        if ((m*n)!=original.length) return result;
        result = new int[m][n];
        int step=0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = original[step];
                step++;
            }
        }
        return result;
    }
}
