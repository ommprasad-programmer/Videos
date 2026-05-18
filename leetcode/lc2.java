package DSA.leetcode;

public class lc2 {

    public static void main(String[] args) {

        System.out.println(myPow(-2, 9));   // -512.0
        System.out.println(myPow(2, -3));   // 0.125
        System.out.println(myPow(2, 0));    // 1.0

    }

    public static double myPow(double x, int n) {

        long N = n; 

        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double result = 1;

        for (long i = 0; i < N; i++) {
            result *= x;
        }

        return result;
    }
}