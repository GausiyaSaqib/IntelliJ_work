package patternPrinting.java;

import java.util.Scanner;

public class assignmentTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for  (int j = 1; j <= n; j++) {
            for  (int i = 1; i <= j; i++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}