package DSA.leetcode;

public class lc5 {

    public static void main(String[] args) {

       int[] arr = {1,2,3,2,4,5};
int val = 2;

int k = 0;

for (int i = 0; i < arr.length; i++) {
    if (arr[i] != val) {
        arr[k] = arr[i];
        k++;
    }
}

System.out.println("k = " + k);



 
    
}

}