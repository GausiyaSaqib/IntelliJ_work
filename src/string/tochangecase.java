package string;

public class tochangecase {
    public static void main(String[] args) {
        String s = "Gausiya Nisar is 25 Years Old";

        // METHOD FIRST

        // s.toLowerCase();   // here it do  not work

         // METHOD SECOND

       // System.out.println(s.toLowerCase()); // here it work

        // METHOD THIRD

      //  String a = s.toLowerCase();
      //  System.out.println(a);

        // METHOD FOURTH

        s = s.toLowerCase();
        System.out.println(s);

        String  a = s.toUpperCase();
        System.out.println(a);




    }
}
