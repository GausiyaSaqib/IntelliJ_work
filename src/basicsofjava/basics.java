package basicsofjava;
import java.util.Scanner;
public class basics {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("ENTER 1st NUM : ");
        double x = sc.nextInt();
        System.out.print("ENTER 2nd NUM : ");
        double y = sc.nextInt();
    double z = x/y;
    System.out.print("Qoutient IS :"+z);
    }
}