package array_2D;
import java.util.Scanner;
public class basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] grid = new int[4][3];
        // declaration & memory allocation
        int m = grid.length;  //no of rows
        System.out.println(m);
        int n = grid[0].length; //no of columns or length of zeroth length
        System.out.println(n);
        //INPUT OF 2D ARRAY

        for (int i=0; i<m ; i++) {    //for rows
            for (int j=0; j<n; j++) {  //for columns
                grid[i][j] = sc.nextInt();
            }
        }

        //OUTPUT OF 2D ARRAY

        for (int i=0; i<m ; i++) {    //for rows
            for (int j=0; j<n; j++) {  //for columns
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();

        }

            }

        }

