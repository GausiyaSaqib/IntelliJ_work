package Array_1_D;

public class second_largest_num {
    public static void main(String[] args) {
//
        int[] arr = {100, 89, 190, 96, 189};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("max value: " + max);

        int smx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] != max && arr[i]>smx) {
                smx = arr[i];
            }

        }
        System.out.println("second max value: " + smx);

    }
}


