package string;
import java.util.Scanner;
public class cumulativeLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstname = sc.next();
        String secondname = sc.next();
        String  combined = firstname + secondname;
        System.out.println("total length of string: "+combined.length());


    }
}
