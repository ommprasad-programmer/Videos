package DSA.binaySearch;

public class firstAndLastOcurance {
    public static void main(String[] args) {
        int arr[] = {2,4,5,5,5,5,5,6,7};
        int target = 5;

        int firstidx = findFirst(arr, target);
        int lastidx = findLast(arr, target);

        System.out.println("First Index: " + firstidx);
        System.out.println("Last Index: " + lastidx);
    }

 
    static int findFirst(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                ans = mid;
                high = mid - 1; 
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    
    static int findLast(int[] arr, int target) {
        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                ans = mid;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}