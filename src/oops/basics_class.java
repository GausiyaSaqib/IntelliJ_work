package oops;
public class basics_class {
    //creating a new data type(student) (no need to define new data type
    //seperately of string int and all)
    public static class students{    // creating new class
        String name;//properties of student
        int rno;
        double percent;
    }
    public static void main(String[] args) {
        //here x & y are objects of same class student

        students x = new students();  //Declaration
        //memory m x naam se ek box bangya//student data type k storing
        //name, rno, percent using dot operater
        x.name = "Gausiya Nisar";   //initialisation
        x.rno = 375;
        x.percent = 99.9;
        System.out.println(x.name);
        System.out.println(x.rno);
        System.out.println(x.percent+0.1);
        students y = new students(); // DECLARATION
        y.name = "Mohd Saqib";
        y.rno = 319;
        y.percent = 92.9;
        System.out.println(y.name);



    }
}
