package array_2D;

public class arrays_of_array {
    public static void main(String[] args) {
        int[][] g = {{10, 20, 30}, {30, 40, 50}, {60, 70, 80}};
        int m = g.length;
        int n = g[0].length;
//        for (int i = 0; i <m ; i++) {
//            for (int j = 0; j <n; j++) {
//                System.out.print(g[i][j]+" ");

        // for each loop

        for (int[] ele : g) {
            for (int x : ele) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}