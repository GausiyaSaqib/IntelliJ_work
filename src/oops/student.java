package oops;
// we can call this in any package or in any file java class
public class student {
      String name;
      int rno;
       //private int rno; //ab ye kahin bhi call mhi ho payega this is private
                        //access modifier after this class ie:outside{}
        double percent;
        final String schoolName = "A.M.U"; // same for all student ie why using
                                           // final keyword it never changes
        static int noOfStudent;
    // CONSTRUCTOR

//    public student(String naam, int roll, double per) {
//        name = naam;
//        rno = roll;
//        percent = per;
//    }

//    public student(String naam, int roll) {
//        name = naam;
//        rno = roll;
//    }

    public student(String name, int rno, double percent) {
        this.name = name;   // using same name using this keyword
        this.rno = rno;
       this.percent = percent;
       noOfStudent++;

   }
   public int getRno(){   // getter
    return rno;
  }
  // public void setRno(int r){   // setter
    //  rno = r;
//  }
public void setRno(int rno){   // setter using this keyword
   this.rno = rno;
  }

//



}



