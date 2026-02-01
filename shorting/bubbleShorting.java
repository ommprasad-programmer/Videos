public class bubbleShorting {

    public static void main(String[] args) {

        int[] arr = {1, 4, 5, 3, 7, 2};
        int n = arr.length;

        boolean swapped;

        // Bubble Sort logic
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {

                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

           
            if (!swapped) {
                break;
            }
        }

        System.out.print("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
