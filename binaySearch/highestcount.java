package DSA.binaySearch;

public class highestcount {
    public static void main(String[] args) {
        int arr[] = {-5,-4,-3,-2,0,0,0,0,0,1,2,3,4};
        int n = arr.length;

        int firstZero = firstOccurrence(arr, 0);
        int lastZero = lastOccurrence(arr, 0);
        int firstPositive = firstGreaterThanZero(arr);

        int negcount, zerocount, poscount;

        
        if (firstZero != -1) {
            zerocount = lastZero - firstZero + 1;
            negcount = firstZero;
        } else {
            zerocount = 0;
            negcount = (firstPositive == -1) ? n : firstPositive;
        }

       
        poscount = (firstPositive == -1) ? 0 : n - firstPositive;

       
        if (negcount >= zerocount && negcount >= poscount) {
            System.out.println("Negative numbers are highest: " + negcount);
        } 
        else if (zerocount >= negcount && zerocount >= poscount) {
            System.out.println("Zeroes are highest: " + zerocount);
        } 
        else {
            System.out.println("Positive numbers are highest: " + poscount);
        }
    }

    
    static int firstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                ans = mid;
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    
    static int lastOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                ans = mid;
                left = mid + 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    
    static int firstGreaterThanZero(int[] arr) {
        int left = 0, right = arr.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] > 0) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}