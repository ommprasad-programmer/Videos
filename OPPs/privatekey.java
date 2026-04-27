package DSA.OPPs;


class Students{
    String name;
    private int rollNo = 51;
    double cgpa;
    private int rollPrint(){
        
        return rollNo;
    }
    public void print(){
      int roll =  rollPrint();
        System.out.println(roll);
    }
    public int setroll( int roll){

        rollNo = roll;
        return rollNo;

    }
}

public class privatekey {

    public static void main(String[] args) {
        Students s1 = new Students();
     
       s1.setroll(39);
         s1.print();
       
    } 


    
}
