package Array_1_D;
public class largest_3_element_of_array {
    public static void main(String[] args) {
        int[] arr = {100, 89, 190, 96, 189};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int smx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] != max && arr[i]>smx) {
                smx = arr[i];
            }

        }
        int tmx = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] != max && arr[i]!=smx && arr[i]>tmx) {
                tmx = arr[i];
            }
        }
        System.out.println("largest three elements: " +max+" "+smx+" "+tmx+" ");

    }
}

