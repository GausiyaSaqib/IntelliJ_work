package conditonals;
import java.util.Scanner;
public class numberbridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n : ");
        int n = sc.nextInt();
        for (int j = 1; j <= 2*n-1; j++) {
            System.out.print(j+ " ");
        }
        System.out.println();
        for (int i = 1; i <= n; i++) {
            int a = 1;
            for (int j = 1; j <= n-i; j++) {
                System.out.print((a++) + " ");
            }
            for (int j = 1; j <=((2* i)-1); j++) {
                System.out.print(" " + " ");
                a++;
            }
            for (int j = 1; j <= n-i; j++) {
                System.out.print((a++) + " ");
            }
            System.out.println();
        }

    }
}


