package array_2D;

public class sum_of_all_element {
    public static void main(String[] args) {
        int[][] grid = {{10, 89, 9, 6, 1}, {20, 30, 4, 3, 10}};
        int m = grid.length;
        int n = grid[0].length;
        int sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sum += grid[i][j];
            }
        }
        System.out.println(sum + " ");
    }
}
