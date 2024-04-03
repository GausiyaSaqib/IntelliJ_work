package string;

public class indexofCompareto {
    public static void main(String[] args) {
        String s = "Gausiya Nisar";


        //  TO FIND INDEX OF A STRING

//        System.out.println(s.indexOf('N'));
//        System.out.println(s.indexOf('a'));
//        System.out.println(s.indexOf('q'));
//        System.out.println(s.lastIndexOf('a'));

        // TO COMPARE TWO STRING LEXOGRAPHIUCALLY
        String x = "Gausiya Nisar";
        System.out.println(s.compareTo(x));
        String g = "abc";
        String h = "bbc";
        System.out.println(g.compareTo(h)); // ASCII(a) - ASCII(b)
        String c = "abcdddd";
        System.out.println(c.compareTo(g));  // no of charcter after abc
        String d = "bbcddd";
        System.out.println(d.compareTo(g)); // ASCII(b) - ASCII(a)
        String e = "abcggg";
        System.out.println(g.compareTo(e)); // no of character after abc in negative






    }
}
