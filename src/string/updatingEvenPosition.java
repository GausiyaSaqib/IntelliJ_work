package string;

public class updatingEvenPosition {
    public static void main(String[] args) {
        String s = "Gausiya Nisar";
        int n = s.length();
        String str = "";
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                str += 'j';
            } else {
                str += s.charAt(i);
            }
        }
        System.out.print(str);
    }
}

