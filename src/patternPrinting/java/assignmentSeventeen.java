package patternPrinting.java;
import java.util.Scanner;
public class assignmentSeventeen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                if (i == 1 || j == 1||j==2*i-1) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}
