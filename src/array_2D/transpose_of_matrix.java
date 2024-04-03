package array_2D;
import java.util.Scanner;
public class transpose_of_matrix {
    public static void main(String[] args) {

        // METHOD FIRST

        int[][] a = {{1, 8, 9}, {9, 6, 1}, {2, 3, 4}, {1, 3, 1}};
        int m = a.length;
        int n = a[0].length;
        int[][] transpose = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpose[i][j] =a[j][i];
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }

        //  METHOD SECOND

//        Scanner sc = new Scanner(System.in);
//        System.out.println("ENTER NO OF ROWS: ");
//        int m = sc.nextInt();
//        System.out.println("ENTER NO OF COLS: ");
//        int n = sc.nextInt();
//        int[][] a = new int[m][n];
//        for (int i= 0; i <m ; i++) {
//            for (int j = 0; j< n; j++) {
//                a[i][j] = sc.nextInt();
//            }
//        }
//            for (int j = 0; j < n; j++) {
//                for (int i = 0; i < m; i++) {
//                    System.out.print(a[i][j]+" ");
//                }
//            System.out.println();
//        }
    }
}

