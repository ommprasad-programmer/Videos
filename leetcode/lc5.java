package DSA.leetcode;

public class lc5 {

    public static void main(String[] args) {

        int arr[] = {1,2,3,2,4,5}; int brr[]={};

       int n = arr.length; int val =2;

       for(int i =0;i<n-1;i++){
         

        if(arr[i]!=val){
            arr[i]=brr[i];
        }
        
        if(arr[i]==val){
            continue;
         }
       }

       print(brr);
        
    }

  public static void print (int []arr){

    for(int i=0;i<=arr.length-1;i++){
        System.out.println(arr[i]);
    }

  }

    
}
