package Methods;
import java.util.Scanner;
public class fxn_to_return_greatest {
    public static int greatest(int a, int b) {
        int greatestnum = 0;
        if (a < b) {
            greatestnum = b;
        }
        System.out.println("Greatest num :" + greatestnum);
        return greatestnum;
    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        greatest(n,m);

    }
}
