package arr_ays;

import java.util.ArrayList;
import java.util.Collections;

public class operationinarraylist {
    public static void main(String[] args) {
         ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
    //     //arr =[10,20,30,40,50]
    //   System.out.println(arr);
    //   System.out.println( arr.get(2));
    //   arr.set(3, 51);
    //   System.out.println(arr);

    //   for(int i=0;i<arr.size();i++){
    //     System.out.print(arr.get(i) + " ");
    //   }
    //   for (int ele : arr) {
    //         System.out.print(ele + " ");        
    //   }

    //   arr.add(40);// 10,20,30,51,50,40
    //   arr.add(2, 100); // 10,20,100,30,51,50,40
    //   System.out.println(arr);
      Collections.reverse(arr);
      System.out.println(arr);
    
      ArrayList<Double> arr2= new ArrayList<>();   
    }
}
