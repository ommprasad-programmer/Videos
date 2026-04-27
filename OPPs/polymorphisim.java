package DSA.OPPs;

  class dog{
    
      void speak() {
           
         System.out.println("Bhau");
      }

      
  }
  class cat {
    void speak(){
        System.out.println("mai kya ji ladle meow ghop ghop");
    }
  }

  class omm {
    void speak(){
        System.out.println("nothing to say");
    }
  }

public class polymorphisim {

    public static void main(String[] args) {

        dog d1 = new dog();
        d1.speak();
        cat m1 = new cat();
        m1.speak();
    }
    
}
