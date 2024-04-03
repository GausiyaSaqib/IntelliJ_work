package Recursion;

public class permutation {
    public static void stringpermutation(String ans, String s){
        if(s.length() == 0){
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < s.length() ; i++) {
            char ch = s.charAt(i);
            String left = s.substring(0,i);
            String right = s.substring(i+1);
            stringpermutation(ans+ch,left+right);
        }
    }
    public static void main(String[] args) {
        String s = "abcd";
        stringpermutation("",s);
    }
}