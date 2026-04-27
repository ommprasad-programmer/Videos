package DSA.OPPs;
 
 class student{
    String name;
    int roll;
    double cgpa;
    void print(){
        System.out.println(name +" "+roll+" "+cgpa);
    }
 }



public class understandingOpps {

    public static void main(String[] args) {
        student s1 = new student();
        s1.cgpa=8.5;
        s1.name="Omm Prasad Nath";
        s1.roll=39;

         student s2 = new student();
        s2.cgpa=7.2;
        s2.name="Reetika";
        s2.roll=51;

         student s3 = new student();
        s3.cgpa=8;
        s3.name="No one";
        s3.roll=100;

        s1.print();
        s2.print();
        s3.print();
        // print(s3);
        // print(s2);
        // print(s1);

    }

    public static void print(student s) {
             
        System.out.println(s.cgpa+" "+s.name + " "+s.roll);

    }

    

    
}
