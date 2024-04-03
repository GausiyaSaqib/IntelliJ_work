package patternPrinting.java;

import java.util.Scanner;

public class assignmentSixteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int j = 1; j <= 2 * n - 1; j++) {
            System.out.print(j + " ");
        }
        System.out.println();

        for (int i = 1; i <= n; i++) {
            int a = 1;
            int b= 3;
            for (int j = 1; j <= n - i; j++) {
                System.out.print((a++) + " ");
            }
            for (int j = 1; j <=(2*i)-1 ; j++) {
                System.out.print(" "+" ");
                a++;
            }
            for (int j = n-i; j >= 1; j--) {
                System.out.print(b+" ");
                b--;
            }
            System.out.println();
        }

    }
}

