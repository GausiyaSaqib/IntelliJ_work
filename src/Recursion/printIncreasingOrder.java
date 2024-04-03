package Recursion;
import java.util.Scanner;
public class printIncreasingOrder {

    // FIRST METHOD(GLOBAL N METHOD)

//    static int n;  // GLOBAL n
//    public static void print(int x){
//        if(x>n) return;   // base case
//        System.out.println(x);  // work
//        print(x+1);            // call
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n: ");
//         n = sc.nextInt();
//        print(1);

    // SECOND METHOD(EXTRA PARAMETER METHOD)

//        public static void print(int x , int n){
//            if(x>n) return;   // base case
//            System.out.println(x);  // work
//            print(x+1,n);            // call
//        }
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            System.out.print("Enter n: ");
//            int n = sc.nextInt();
//            print(1,n);

    // RECURSION METHOD

    public static void print(int x){
        if(x==0) return;   // base case
        print(x-1);            // call
        System.out.println(x);  // work
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        print(n);
//
    }
}
