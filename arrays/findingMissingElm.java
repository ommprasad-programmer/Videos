package arrays;

public class findingMissingElm {
    public static void main(String[] args) {
        // int[] arr = {1, 2, 4, 5, 6, 7, 8};
        // int n = arr.length + 1;

        // int missing = -1;

        // for (int i = 1; i <= n; i++) {
        //     boolean found = false;

        //     for (int j = 0; j < arr.length; j++) {
        //         if (i == arr[j]) {
        //             found = true;
        //             break;
        //         }
        //     }

        //     if (!found) {
        //         missing = i;
        //         break;
        //     }
        // }

        // if (missing != -1)
        //     System.out.println("Missing element: " + missing);
        // else
        //     System.out.println("Nothing is missing");

        int arr [] = {1,2,4,5,6,7};
        int n= arr.length+1;
        
        int sum1 = n*(n+1)/2;
        int sum2 = 0;
        for(int i=0;i<arr.length;i++){
            sum2+=arr[i];
        }
        int miss = sum1-sum2;
        if ( miss != 0) {
            System.err.println("missing element is : " + miss);
            
        }
        else System.out.println("nothing is missing");
        
    }
}
