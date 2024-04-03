package Recursion;

public class removingAFromString {
    public static void remove(int i,String s){
        if(i==s.length()) return;
        String ans ="";
        if(s.charAt(i) != 'a') {
            ans = ans + s.charAt(i);
            System.out.print(ans);
        }
        remove(i + 1, s);
    }
    public static void main(String[] args) {
        String s = "Gausiya Nisar";
        remove(0,s);
    }
}
