package Recursion;
import java.util.ArrayList;
public class addingSubsetsInArrayList {
    static ArrayList<String> arr = new ArrayList<>(); //GLOBAL ARRAY LIST
    public static void subset(int i, String s, String ans) {
        if (i == s.length()) {
            arr.add(ans); // adding elements in array list
            return;
        }
        char ch = s.charAt(i);
        subset(i + 1, s, ans);         // SKIP
        subset(i + 1, s, ans + ch); // TAKE

    }

    public static void main(String[] args) {
        String s = "abc";
        arr = new ArrayList<>();  // Reset
        subset(0, s, " ");
        System.out.print(arr);
    }
}
