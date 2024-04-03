package array_2D;

public class largest_element {
    public static void main(String[] args) {
        int[][] grid = {{100, 89, 90, 96, 189}, {20, 30, 48, 39, 190}};
        int m = grid.length;
        int n = grid[0].length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < m ; i++) {    //for rows
            for (int j = 0; j < n; j++) {  //for columns
                max = Math.max(max, grid[i][j]);
            }
        }
        System.out.print(max+" ");
    }
}
