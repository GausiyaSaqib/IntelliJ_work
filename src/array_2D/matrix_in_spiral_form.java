package array_2D;
public class matrix_in_spiral_form {
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
        int[][] a = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10},{11, 12, 13, 14, 15},{16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}, {26, 27, 28, 29, 30}};
        int m = a.length;
        int n = a[0].length;
        int minr = 0, maxr = m - 1, minc = 0, maxc = n - 1;
        while (minr <= maxr && minc <= maxc) {
            for (int j = minc; j <= maxc; j++) {  //LEFT TO RIGHT
                System.out.print(a[minr][j] + " ");
            }
            minr++;
            if(minr>maxr || minc> maxc) break; // FOR COUNTER CHECK WHILE LOOP
            for (int i = minr; i <= maxr; i++) {  // TOP TO BOTTOM
                System.out.print(a[i][maxc] + " ");
            }
            maxc--;
            if(minr>maxr || minc> maxc) break;
            for (int j = maxc; j >= minc; j--) {  //RIGHT TO LEFT
                System.out.print(a[maxr][j] + " ");
            }
            maxr--;
            if(minr>maxr || minc> maxc) break;
            for (int i = maxr; i >= minr; i--) {   //BOTTOM TO TOP
                System.out.print(a[i][minc] + " ");
            }
                minc++;
        }
    }
}

