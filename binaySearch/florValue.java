package DSA.binaySearch;

public class florValue {
    public static void main(String[] args) {
        int arr[]={2,4,5,6,6,8,9,10};
        int x=7;
        int idx=-1;

        int low=0,hi=arr.length-1;

        while(low<=hi){
            int mid = (hi+low)/2;
            if(arr[mid]==x){

                idx = mid;
                break;

            }
            else if(arr[mid]>x){
                hi = mid-1;
            }
            else{
                idx = mid ;
                low = mid+1;
            }
            

            

                    
        }

        System.out.println(idx);
    }
}
