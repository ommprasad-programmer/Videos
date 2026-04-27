package DSA.binaySearch;

public class mountainArray {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 4, 5, 7, 9, 20, 9, 8, 7 };
        int hi = arr.length - 2;
        int low = 1;

        while (hi > low) {

            int mid = (low + hi) / 2;

            if (arr[mid] > arr[mid + 1] && arr[mid] > arr[mid - 1]) {

                System.out.println(mid);
                break;
            }

            else if (arr[mid - 1] < arr[mid] && arr[mid + 1] > arr[mid]) {

                low = mid + 1;

            } else
                hi = mid - 1;

        }

    }
}
