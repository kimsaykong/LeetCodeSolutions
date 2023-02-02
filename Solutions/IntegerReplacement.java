package Solutions;
// Given a positive integer n, you can apply one of the following operations:
// If n is even, replace n with n / 2.
// If n is odd, replace n with either n + 1 or n - 1.
// Return the minimum number of operations needed for n to become 1.
public class IntegerReplacement {
    public int integerReplacement(int n) {
        int step = 0;
        if (n == 2147483647) {
            n = 1073741824;
            step = 2;
        }
        while (n!=1){
            if (n%2==0){
                n = n/2;
                step++;
            }else {
                if (((n-1)/2)%2==0 || n == 3 ) n = n-1;
                else n=n+1;
                step++;
            }
        }
        return step;
    }
}
