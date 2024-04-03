package conditonals;
import java.util.Scanner;
public class stardiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        int nsp = n - 1;
        int nstr = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= nstr; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
            nsp--;
            nstr += 2;
        }
        nsp = 1;
        nstr -= 4;
        for (int i = 1; i <= n-1; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= nstr; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
            nsp++;
            nstr -= 2;
        }
    }
}
