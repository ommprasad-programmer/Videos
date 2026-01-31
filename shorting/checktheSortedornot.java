


public class checktheSortedornot {
  
    public static void main(String[] args) {
            int [] arr = {1,2,3,4,6,5};
            boolean sorted = true;
            for(int i = 0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                    sorted = false;
                    break;

                }
              
            }


            if (sorted == true) System.out.println("array is sorted");
            else System.out.println("array is not sorted");

           }


}