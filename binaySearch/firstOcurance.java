package DSA.binaySearch;

public class firstOcurance {

    public static void main(String[] args) {
        
       int arr[] = {1,2,3,3,3,5};
        int tar = 4;
        int n = arr.length;
        System.out.println(n);

        int i =0,j=n-1,index=-1;

        while (i<=j) {


            int m = (i+j)/2;

            if (arr[m]>tar) {

                j = m-1;
            }
          
            else if (arr[m]<tar){
                i=m+1;
            }

            else index = m;
                
            j=m-1;

            
        }

        System.out.println("the index is present at index : "+ index);

    }

    

    
     
   
    
    

   



    
}
