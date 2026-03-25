package binaySearch;

public class searchindecending {
    public static void main(String[] args) {
        int arr[] = {20,18,15,12,10,9,5};
        int low = 0;
        int hi = arr.length - 1;
        int target = 12;
        int idx = -1;

        while (low < hi) {
            int mid = (low + hi) / 2;

            if (arr[mid] == target) {
                idx = mid;
                break;
            }

           
            if (arr[mid] > target) {
                low = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        System.out.println(idx);
    }
}
