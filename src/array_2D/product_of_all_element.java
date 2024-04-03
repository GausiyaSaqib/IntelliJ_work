package array_2D;

public class product_of_all_element {
    public static void main(String[] args) {
        int[][] grid = {{1, 2, 9, 5, 1}, {2, 3, 4, 2, 1}};
        int m = grid.length;
        int n = grid[0].length;
        int product = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                product *= grid[i][j];
            }
        }
        System.out.println(product + " ");
    }
}

