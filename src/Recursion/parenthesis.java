package Recursion;
import java.util.Scanner;
public class parenthesis {
    public static void printParenthesis(String s,int n ,int noo, int noc){
        if(s.length()==2*n){
            System.out.println(s);
            return;
        }
        if(noo < n ) printParenthesis(s+"(",n,noo+1,noc);
        if(noo > noc) printParenthesis(s+")",n,noo,noc+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        printParenthesis("",n,0,0);
    }
}
