import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {

        int[] arr = {1, -3, 22, 13, 17, 20};
        int target = 23;

        Arrays.sort(arr);   
        int n = arr.length;

        int i = 0;
        int j = n - 1;      
        boolean twosum = false;

        while (i < j) {
            int sum = arr[i] + arr[j];

            if (sum == target) {
                twosum = true;
                break;
            } 
            else if (sum > target) {
                j--;
            } 
            else if (sum < target) {
                i++;
            } 
        
            
        }

        if (twosum == true ){
             System.out.println("Indexes: [" + i + ", " + j + "]");
             System.out.println("Values: [" + arr[i] + ", " + arr[j] + "]");
        }
        else System.out.println("There is no elements exist");
    }
}
