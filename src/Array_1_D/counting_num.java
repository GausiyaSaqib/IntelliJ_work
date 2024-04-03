package Array_1_D;
public class counting_num {
    public static void main(String[] args) {
        int[] arr = {90, 20, 130, 420};
        int n = arr.length;
        int x = 190, count =0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > x) {
                count++;
            }
        }
        System.out.println(count+" ");
    }
}
