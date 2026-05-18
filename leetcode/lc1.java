package DSA.leetcode;

public class lc1 {
    

    public static void main(String[] args) {

       System.out.println(isPalindrome(-121));
        
    }
    public static boolean isPalindrome(int x) {

        int rev = 0; int y = x;
        
        while (y>0) {

            int m = y%10;
            
            rev = (rev*10)+m;
            
            y=y/10;
            
            
            
        }
        
        System.out.println(x);
        if (rev == x) {

            return true;
            
        }
        else return false;
        
    }
}
