package oops;
public class passingClassToFxn {
  public static  class students {    // creating new class
        String name;//properties of student
        int rno;
        double percent;
    }
    public static void change(students x){
      x.name = "Gausiya Nisar";
    }
    public static void print(students x){
        System.out.println(x.rno);
    }
    public static void main(String[] args) {
        students x = new students();
        x.name = "Gausiya ";
        x.rno = 45;
        x.percent = 95.2;
        System.out.println(x.name);
        x.name = "Saqib";   // UPDATION
        System.out.println(x.name);
        print(x);    // CALL OF FXN PRINT
      //  System.out.println(x.name);  // here change in saqib name
        change(x);    // CALL BY REFERENCE
        System.out.println(x.name);
    }
}
