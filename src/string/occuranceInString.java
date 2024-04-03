package string;
import java.util.Scanner;
public class occuranceInString {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         String s = sc.nextLine();
         int n = s.length();
         int[] freq = new int [26];
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int idx = (int)ch - 97;
            freq[idx]++;
        }
        int maxFreq= -1;
        for (int i = 0; i <freq.length ; i++) {
            maxFreq = Math.max(maxFreq, freq[i]);
        }
        for (int i = 0; i < freq.length; i++) {
            if(freq[i]==maxFreq){
                char ch = (char)(i+97);
                System.out.println(ch);

        }

        }
    }
}