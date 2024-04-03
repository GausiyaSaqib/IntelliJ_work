package Recursion;

import java.util.Scanner;

public class mazePath{

    // METHOD FIRST

//    public static int maze(int row ,int col, int m , int n){
//        if(row == n || col ==m) return 1;
//        int rightways = maze(row,col+1,m,n);
//        int downward = maze(row+1,col,m,n);
//        return rightways + downward;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter rows: ");
//        int n = sc.nextInt();
//        System.out.print("Enter columns: ");
//        int m = sc.nextInt();
//        System.out.println(maze(1,1,m,n));

    // METHOD SECOND

    public static int maze2( int m, int n){
        if(m==1 || n==1) return 1;
        int rightways = maze2(m, n-1);
        int downward = maze2( m-1,n);
        return rightways + downward;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int m = sc.nextInt();
        System.out.print("Enter columns: ");
        int n = sc.nextInt();
        System.out.println(maze2(m,n));
    }
}
