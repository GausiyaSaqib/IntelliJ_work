package string;

public class maxValueOfString {
    public static void main(String[] args) {
        String[] s = {"1245","4567","9999","12211","0098"};
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < s.length ; i++) {
            int n = Integer.parseInt(s[i]);
            mx = Math.max(mx,n);
        }
        System.out.println(mx);

    }
}
