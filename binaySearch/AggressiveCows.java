import java.util.Arrays;

public class AggressiveCows {

    /**
     * Helper method to check if we can place 'k' cows with 
     * at least 'minDist' distance between them.
     */
    private static boolean isFeasible(int[] stalls, int k, int minDist) {
        int count = 1; // Place first cow at the first stall
        int lastPosition = stalls[0];

        for (int i = 1; i < stalls.length; i++) {
            if (stalls[i] - lastPosition >= minDist) {
                count++;
                lastPosition = stalls[i];
                
                // If we've placed all cows, this distance is feasible
                if (count >= k) return true;
            }
        }
        return false;
    }

    public static int largestMinDistance(int[] stalls, int k) {
        // Step 1: Sort the stall positions
        Arrays.sort(stalls);

        int low = 1;
        int high = stalls[stalls.length - 1] - stalls[0];
        int result = 0;

        // Step 2: Binary Search on the distance value
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isFeasible(stalls, k, mid)) {
                // If mid is possible, try for a larger distance
                result = mid;
                low = mid + 1;
            } else {
                // Distance is too large, try smaller values
                high = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] stalls = {1, 2, 8, 4, 9};
        int k = 3;
        
        int output = largestMinDistance(stalls, k);
        System.out.println("The largest possible minimum distance is: " + output);
    }
}