package string;

import java.util.Arrays;

public class anagram {

    // BEST RUN ON LEET CODE

    public static void main(String[] args) {
        String s = "rapep";
        String t = " paper";
        int n = s.length();
        int m = t.length();
        char[] c = s.toCharArray();
        char[] ch = t.toCharArray();
        Arrays.sort(c);
        Arrays.sort(ch);
        while(n == m) {
            for (int i = 0; i < n; i++) {
                checkAnagram(c,ch,i);
            }
        }
    }
    public static boolean checkAnagram (char[]ch, char[]c, int i){
        if (c[i] == ch[i])  return true;
            return false;
        }
    }

