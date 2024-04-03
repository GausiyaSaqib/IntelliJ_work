package string;

public class totalNumOfDigits {
    public static void main(String[] args) {
        int n = 123456789;
//        String s = ""+n;  // conversion to string

        // using in built function

        String s = Integer.toString(n);

        System.out.println(s.length());
    }
}
