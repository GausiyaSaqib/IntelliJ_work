package Recursion;
import java.util.Scanner;
public class nthStairPath {
    public static int stairWays(int n ){
        if(n==1) return 1;
        if(n==2) return 2;
        return stairWays(n-1) + stairWays(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println(stairWays(n));
    }
}
