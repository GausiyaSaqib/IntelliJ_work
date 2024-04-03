package Array_1_D;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int[] arr = {1,2,3,2,1};
        int n = arr.length;
        for (int i = 0; i <= n/2 ; i++) {
            if(arr[i] != arr[n-i-1]){
                System.out.println("Not a palindrome");
                return;
            }
        }
        System.out.println("palindrome");
    }
}
