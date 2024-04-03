package basicsofjava;
import java.util.Scanner;

public class remainderofnum {
    public static void main(String[] args) {
       Scanner sc =  new Scanner(System.in);
        System.out.print("ENTER DIVIDENT : ");//this is dividend
        int a = sc.nextInt();
        System.out.print("ENTER DIVISOR : ");
        int b = sc.nextInt();
        int d = a/b;
        System.out.println("QUOTIENT : "+d);
        int c = (a - (b*d));
        System.out.println("REMAINDER WHEN "+a+" DIVIDED BY "+b+" IS :  "+c);



    }
}
