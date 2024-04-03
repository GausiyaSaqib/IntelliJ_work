package Recursion;
import java.util.Scanner;
public class preInPost {
    public static void pip(int n){
        if(n==0) return;
        System.out.print(n); // PRE
        pip(n-1);
        System.out.print(n); // IN
        pip(n-1);
        System.out.print(n);  // POST
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        pip(n);
    }
}
