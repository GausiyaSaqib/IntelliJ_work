package Array_1_D;
public class changes_in_even_and_odd {
    public static void main(String[] args) {
        int[] a = {8, 7, 5, 6, 3, 10, 6};
        int n = a.length;
        int x = 2, y = 10;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                a[i] = x * a[i];
            } else {
                a[i] = y + a[i];
            }
        }
        for (int ele : a)
            System.out.print(ele + " ");

    }
}
