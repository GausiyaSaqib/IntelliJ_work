package Array_1_D;
public class count_triplet {
    public static void main(String[] args) {
        int[] arr = {50, 20, 30, 10, 60, 70,90};
        int n = arr.length;
        int x = 120, count =0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == x) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count+" ");

    }
}
