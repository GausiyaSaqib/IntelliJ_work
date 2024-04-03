package Array_1_D;
import java.util.Arrays;

public class array_list {
    public static void main(String[] args) {
        int[] arr = {90, 20, 130, 420};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        Arrays.sort(arr);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}