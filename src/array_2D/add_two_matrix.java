package array_2D;
public class add_two_matrix {
    public static void main(String[] args) {
        int[][] a = {{10, 8, 9}, {9, 6, 1}, {20, 30, 4}, {12, 3, 10}};
        int[][] b = {{20, 10, 9}, {10, 16, 10}, {30, 40, 4}, {12, 3, 10}};
        int m = a.length;
        int n = a[0].length;
       // int[][] c = new int[m][n];

        // IF WE WANT TO MAKE IT MORE SMALL CODE

//        System.out.println("Matrix a: ");
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }
//
      //  System.out.println("Matrix b: ");
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(b[i][j] + " ");
//            }
//            System.out.println();
//        }
//        System.out.println("sum of two matrix is: ");
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                c[i][j] = a[i][j] + b[i][j];
//                System.out.print(c[i][j] + " ");
//
//            }
//            System.out.println();
//        }

        // HW TO ADD MATRIX WDOUT MAKING NEW ARRAY

        System.out.println("sum of two matrix is: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " +(a[i][j] + b[i][j])+ " ");

            }
            System.out.println();
        }
    }
}
