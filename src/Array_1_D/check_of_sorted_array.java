package Array_1_D;
import java.util.Arrays;
public class check_of_sorted_array {
    public static void main(String[] args) {
        int[] arr = {90, 20, 30, 50, 10};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        Arrays.sort(arr);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        boolean flag = false;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i-1]) {
                flag = true;
                break;
            }
        }
        if(flag == true){
            System.out.println("Element sorted");
        }
        else System.out.println("Element not sorted");
    }
}

