package shorting;

public class bubbleShorting {
    public static void main(String[] args) {
        int [] arr = {1,4,5,3,7,2};
        int i ; int j ;
       for (i=0;i<arr.length-1;i++){
        for (j=0;j<arr.length-1-i;j++){
            if (arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }

        }

       }

        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }


    
}
