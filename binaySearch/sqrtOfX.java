public static int sqrt(int x) {

    if (x == 0 || x == 1) {
        return x;
    }

    int i = 0;
    int j = x / 2;
    int ans = 0;

    while (i <= j) {

        int mid = i + (j - i) / 2;

        if ((long) mid * mid == x) {
            return mid;
        }

        if ((long) mid * mid < x) {
            ans = mid;
            i = mid + 1;
        } else {
            j = mid - 1;
        }
    }

    return ans;
}