package array_2D;

public class hw2_of_waveform {
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
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int m = a.length;
        int n = a[0].length;
        int[][] b = new int[m][n];
        print(a);
        for (int j = 0; j < n; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < n; i++) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            } else {
                for (int i = n - 1; i >= 0; i--) {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
