package DSA.binaySearch;

public class floar_sqrt {

    public static int floorSqrt(int n) {
        if (n == 0 || n == 1) return n;

        int low = 1, high = n, ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

          
            if (mid <= n / mid) {
                ans = mid;        
                low = mid + 1;    
            } else {
                high = mid - 1;   
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println(floorSqrt(n)); 
    }
}