package Assignment_Loops;
import java.util.Scanner;
public class checkPalindrome {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter word: ");
            String x= sc.next();
            int n = x.length();
            String z = x.toLowerCase();
            for (int i = 0; i <= n/2; i++) {
                if(z.charAt(i) != z.charAt(n-1-i)) {
                    System.out.println("Not a palindrome");
                    return;
                }
            }
            System.out.println("Palindrome");
        }
    }
