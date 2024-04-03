package patternPrinting.java;

import java.util.Scanner;

public class assignementTwenty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= m; j++) {
                if (i == j || (i+j) == (m + 1)) {
                    System.out.print(i+ " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }

    }
}
