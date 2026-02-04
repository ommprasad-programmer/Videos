public class selectionSort {
    public static void main(String[] args) {
       
        int [] arr = {1,4,-3,5,2,-5};
        int n = arr.length;
         for (int i = 0 ; i < n ; i++){
            int j; int min = Integer.MAX_VALUE; 
            int minIndex = 0;
            for(j=i;j<n;j++){
                if(arr[j]<min){
                    min = arr[j];
                    minIndex = j;

                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];   
             arr[i] = temp;
         }

         System.out.print("sorted array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
