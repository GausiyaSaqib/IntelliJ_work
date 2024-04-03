package string;

public class printAlltheSubstringofString {
    public static void main(String[] args) {
        String s = "abcd";
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String a = s.substring(i, j);
                System.out.print(a + " ");
            }

            System.out.println();
        }
        }

}
