package Recursion;
import java.util.Scanner;
public class countAndSay {

    //valid in leet code

    public static int printCountAndSay(String s,int i,int j,int n){
        if(n==1) return 1;
        while(j<s.length()){
            if(s.charAt(i)==s.charAt(j)){
                j++;
            }
            else {
                int len = j-i;
                printCountAndSay(s+len,i=j,j,n);
                printCountAndSay(s+s.charAt(i),i=j,j,n);
            }
        }
        return 1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        printCountAndSay("",0,0,n);
    }
}
