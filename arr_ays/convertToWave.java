package arr_ays;

/*public class convertTowave {
    public static void main(String[] args) {
        int arr []={1,2,3,4,5,6};
        int i = 0;int j=1;
        while(j < arr.length){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i+=2;
            j+=2;
        }

        
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}*/

public class convertToWave {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < arr.length - 1; i += 2) {
            // swap adjacent elements
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

