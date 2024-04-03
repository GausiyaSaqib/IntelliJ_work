package patternPrinting.java;
import java.util.Scanner;
public class assignmentNineteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                if (i == 1 || j == 1||j==2*i-1) {
                    System.out.print(i+ " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }

    }

