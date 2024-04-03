package string;
import java.util.Scanner;
public class cumulativeLengthUsingArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String arr [] = new String[size];
       int  combined = 0;
        for (int i = 0; i < size ; i++) {
            arr [i] = sc.next();
            combined += arr[i].length();
        }
        System.out.println("cumulative length is :"+combined);
    }
}
