package Assignment_basics_Module07;
import java.util.Scanner;
public class question_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = 0;
        if (a > b || a == b) {
            System.out.print("false");
            x = 1;
        }
        if (x == 0) System.out.print("true");
    }
}
