public class MaxSubarrayWithOneDeletion {

    public static int maximumSum(int[] arr) {
        int n = arr.length;

        int noDeletion = arr[0];   // max sum without deletion
        int oneDeletion = 0;       // max sum with one deletion
        int result = arr[0];

        for (int i = 1; i < n; i++) {

            // either delete current element OR extend previous deletion
            oneDeletion = Math.max(noDeletion, oneDeletion + arr[i]);

            // normal Kadane
            noDeletion = Math.max(arr[i], noDeletion + arr[i]);

            // update result
            result = Math.max(result, Math.max(noDeletion, oneDeletion));
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 0, 3};
        System.out.println(maximumSum(arr));  // Output: 4
    }
}