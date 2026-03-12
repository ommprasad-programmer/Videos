package binaySearch;

public class binarySearch {

    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,8,9,10};
         int tar = 2;

         int n = arr.length ;

         
         
         int i =0; int j = n-1;

         while (i<j) {

            int m = (i+j)/2;

            if (arr[m]>tar) {

                j = m-1;
            }
          
            else if (arr[m]<tar){
                i=m+1;
            }

            else {System.out.println("Target found: " + tar);
                return;}
            
         }

         System.out.println("element not found");


            
        
    }
    
}
