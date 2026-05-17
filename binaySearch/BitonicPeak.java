package DSA.binaySearch;

public class BitonicPeak {

    public static int findPeak(int[] arr) {
        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] < arr[mid + 1]) {
                // Peak is on the right side
                low = mid + 1;
            } else {
                // Peak is on the left side or at mid
                high = mid;
            }
        }

        return arr[low]; // or arr[high]
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 12, 4, 2};
        System.out.println("Peak element: " + findPeak(arr));
    }
}