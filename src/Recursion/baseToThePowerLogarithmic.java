package Recursion;
import java.util.Scanner;
public class baseToThePowerLogarithmic {
    public static int power(int a, int b){
        if(a==0 && b==0) {
            System.out.println("NOT DEFINED");
            return -1;
        }
         if(b==0) return 1;
        int ans =0;
        if(b%2 != 0){
            ans = power(a,b/2);
            return a*ans*ans;
        }
         else if (b%2 == 0){
            ans = power(a,b/2);
        }
        return ans*ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        int a = sc.nextInt();
        System.out.print("Enter power: ");
        int b = sc.nextInt();
        System.out.println(power(a,b));
    }
}
