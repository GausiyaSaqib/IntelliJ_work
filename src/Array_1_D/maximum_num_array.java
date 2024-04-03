package Array_1_D;
public class maximum_num_array {
    public static void main(String[] args) {
        int[] arr = {100 , 89 , 90 , 96  ,189};
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
                max = Math.max(max,arr[i]);
            }
        System.out.println("max value: "+max);
    }

    }

