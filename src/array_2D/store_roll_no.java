package array_2D;
import java.util.Scanner;
public class store_roll_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] grid = new int[4][2] ;
        for (int i = 0; i < 4; i++) {    //for rows
            for (int j = 0; j < 2; j++) {  //for columns
                grid[i][j] = sc.nextInt(); // for taking input
            }
        }
        for (int i = 0; i < 4; i++) {    //for rows
            for (int j = 0; j < 2; j++) {  //for columns
                System.out.print(grid[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
