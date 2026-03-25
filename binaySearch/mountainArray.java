package binaySearch;

public class mountainArray {
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,7,9,20,9,8,7};
        int i;
       for(i=0;i<arr.length-1;i++){
          
            if(arr[i]>arr[i+1]&&arr[i]>arr[i-1]){
                System.out.println(arr[i]);
            }

        }
    }
}
 