package Methods;
import java.util.Scanner;
public class fxn_to_print_avg {
    public static void printAvg(int x, int y, int z){
        int avg = 0;
        avg = (x+y+z)/3;
        System.out.println(avg);
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        printAvg(x, y, z);
    }
}
