package array_2D;

public class transform_to_transpose {
    public static void print(int[][] arr){
        int m = arr.length , n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] a = {{1, 8, 9}, {9, 6, 1}, {2, 3, 4}};
        int m = a.length;
        print(a);
        for (int i = 0; i < m  ; i++) {
            for (int j = 0; j < i; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        print(a);
    }
}
