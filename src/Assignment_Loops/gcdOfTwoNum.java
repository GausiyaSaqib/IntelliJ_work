package Assignment_Loops;
import java.util.Scanner;
public class gcdOfTwoNum {
    public static void main(String[] args) {
        int gcd=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter m: ");
        int m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && m % i == 0) {
                gcd=i;
            }
        }
        System.out.println("GCD IS: " +gcd);
    }
}

