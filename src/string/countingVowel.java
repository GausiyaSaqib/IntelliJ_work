package string;
import java.util.Scanner;
public class countingVowel {
    public static boolean isvowel(char ch) {  // methods
        if (ch=='a'||ch=='A') return true;
        if (ch=='e'||ch=='E') return true;
        if (ch=='i'||ch=='I') return true;
        if (ch=='o'||ch=='O') return true;
        if (ch=='u'||ch=='U') return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        int n = s.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
//            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
//                count++;
//            }
            if(isvowel(ch)==true ){
                count++;
            }
        }
        System.out.println("Number of vowels in this sentence is: "+count);

    }
}
