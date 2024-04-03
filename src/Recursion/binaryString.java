package Recursion;
import java.util.Scanner;
public class binaryString {
    public static void printString(String s,int n){
        if(s.length()==n) {
            System.out.println(s);
            return;
        }

        if(s.length()==0 || s.charAt(s.length()-1) =='0'){
            printString(s+0,n);
            printString(s+1,n);
        }
        else  printString(s+0,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        printString("",n);
    }
}
