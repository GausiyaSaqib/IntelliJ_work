package patternPrinting.java;
import java.util.Scanner;
public class assignmentTwentyTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print("*" +" ");
            }
            for (int k = 1; k <= 2*i-2; k++) {
                    System.out.print(" "+" ");
                }
                for (int j = 1; j <= (n-i+1); j++) {
                    System.out.print("*"+" ");
                }
               System.out.println();
        }
            for (int i = n; i >= 1; i--) {
                for (int j = n-i+1; j >= 1; j--) {
                    System.out.print("*"+" ");
                }
                for (int k = 1;  k<= (2*i-2); k++) {
                    System.out.print(" "+" ");
                }
                for (int j = 1; j <= n-i+1; j++) {
                    System.out.print("*"+" ");
                }
                System.out.println();

            }
        }
    }
