package oops;

public class constructorCall {
    public static void change(student s){
        s.name = "xyz";
    }

    public static void main(String[] args) {
//        student x = new student( "Gausiya",  75, 97.1 );
//        System.out.println(x.name);
//        System.out.println(x.rno);
//        System.out.println(x.percent);
//        System.out.println(x.name + " "+ x.rno+" "+ x.percent);
//        student y = new student( "Saqib",  19, 99 );
//        System.out.println(y.name);
//        System.out.println(y.rno);
//        System.out.println(y.percent);

//student x = new student("Gausiya",45);
//        System.out.println(x.name);
//        System.out.println(x.rno);
//        x.percent = 99;          // CAN ADD AFTER CONSTRUCTOR ALSO
//        x.name = "Gausiya Nisar";  // CAN EASILY CHANGE NAME
//        System.out.println(x.name);
//      //  student x = new student();// if we donot initialize anything here
//                                    //  after making constructor than definitely
//                                   //  error come
//       // x.name = "xyz"             // than it donot print

       // USING OF THIS KEYWORD IN CONSTRUCTOR

        student x = new student( "Gausiya",  75, 97.1 );
        System.out.println(x.noOfStudent);
//        System.out.println(x.name);
//        System.out.println(x.rno);
//        System.out.println(x.percent);
//        System.out.println(x.name + " "+ x.rno+" "+ x.percent);
        student y = new student( "Saqib",  19, 99 );
        System.out.println(y.noOfStudent);
//        System.out.println(y.name);
//        System.out.println(y.rno);
//        System.out.println(y.percent);
//        System.out.println(x.schoolName); // cant be change even by getter and setter
        student z = new student( "Sidra",  5, 92 );
        System.out.println(z.noOfStudent);
        student w = new student( "Amna",  11, 90 );
        System.out.println(w.noOfStudent);
    }
}
