package array_2D;
public class rotate_90_clw {
    public static void print(int[][] arr){
    int m = arr.length , n = arr[0].length;
        for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
        System.out.println();
}
    public static void main(String[] args) {
        int[][] a = {{1, 8, 9}, {9, 6, 1}, {2, 3, 4}};
        int m = a.length;
        print(a);
        for (int i = 0; i < m; i++) {   //transpose of matrix
            for (int j = 0; j < i; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        print(a);
        for (int i = 0; i < m; i++) {  //reverse of each row
            int s = 0, t = m-1;
            while(s<t) {
                int g = a[i][s];
                a[i][s] = a[i][t];
                a[i][t] = g;
                s++;
                t--;
            }
        }
        print(a);
    }
}


