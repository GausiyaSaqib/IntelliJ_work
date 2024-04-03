package patternPrinting.java;

import java.util.Scanner;

public class assignmentTwenty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int m = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i == n) || (j == n) || (i + j == n + 1)) {
                    System.out.print("*" + " ");
                } else System.out.print(" " + " ");
            }
            System.out.println();
        }
            for (int i = 1; i <=n; i++) {
            for (int j = n+i; j <=2*i-1; j++) {
                if((j==n)||(i==n)||(i==j)){
                    System.out.print("*"+" ");
                }
                else System.out.print(" "+" ");
            }
            System.out.println();
        }

    }
}
