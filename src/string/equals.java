package string;

public class equals {
    public static void main(String[] args) {
        String s = "abcxyz";
        String a = "abcxyz";
        String b = new String(s);  // new string forms
        String c = "abc";          // here also new string form
        c = c+"xyz";
//        System.out.println(s==a);  // output is true
//        System.out.println(s==b);   // output is false
//        System.out.println(s==c);   // output is false

        System.out.println(s.equals(a)); // true
        System.out.println(s.equals(b)); //true
        System.out.println(s.equals(c));   // true
    }
}
