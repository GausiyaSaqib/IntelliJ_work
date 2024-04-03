package Recursion;

public class subsets{
    public static void subset(int i , String s, String ans){
        if(i==s.length()){
            System.out.println(ans);
            return;
        }
        char ch =s.charAt(i);
        subset(i+1,s,ans);         // SKIP
        subset(i+1,s,ans+ch); // TAKE

    }
    public static void main(String[] args) {
        String s = "abcd";
        subset(0,s," ");
    }
}
