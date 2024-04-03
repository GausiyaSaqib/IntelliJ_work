package patternPrinting.java;

import java.util.Scanner;

public class assignmentFifteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int j = 1; j <=2*n-1; j++) {
            System.out.print((char)(j+64)+" ");
        }
        System.out.println();

        for (int i = 1; i <=n ; i++) {
            char a =(char)(1+64);
            for (int j = 1; j <=n-i; j++) {
                System.out.print((a++)+" ");
            }
            for (int j = 1; j <=(2*i)-1 ; j++) {
                System.out.print(" "+" ");
                a++;
            }
            for (int j = 1; j <=n-i ; j++) {
                System.out.print((a++)+" ");
            }
            System.out.println();
        }
    }
    }
