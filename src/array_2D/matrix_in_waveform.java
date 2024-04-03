package array_2D;
public class matrix_in_waveform {
    public static void print(int[][] a) {
        int m = a.length, n = a[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9},{6,4,2},{8,4,2}};
        int m = a.length;
        int n = a[0].length;
        int[][] b = new int[m][n];
        print(a);
        //METHOD FIRST
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if (i % 2 == 0) {
//                    b[i][j] = a[i][j];
//                } else {
//                    int s = 0, t = m - 1;
//                    while (s < t) {
//                        int g = a[i][s];
//                        a[i][s] = a[i][t];
//                        a[i][t] = g;
//                        s++;{

//                        t--;
//                    }
//                }
//            }
//        }
        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }
            else {
                for (int j = n-1; j >= 0; j--) {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println();
            }

        }

    }
}
