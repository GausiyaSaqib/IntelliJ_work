package Recursion;
import java.util.Scanner;
public class sumRecurssion {
    public static int sum(int n){
        if(n==1 || n==0) return n;
        int ans = n+sum(n-1);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println(sum(n));



//        public static void sum(int n,int s){
//            if(n==0) {
//                System.out.println(s);
//                return;
//            }
//            sum(n-1,s+n);
//        }
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            System.out.print("Enter n: ");
//            int n = sc.nextInt();
//            sum(n,0);
        }
    }
