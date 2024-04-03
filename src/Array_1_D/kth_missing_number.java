package Array_1_D;
import java.util.Arrays;
public class kth_missing_number {
    public static void main(String[] args) {
        int [] arr = {6, 5 ,3, 2, 7, 11 };
        int n = arr.length;
        int k = 1;
        Arrays.sort(arr);
        for (int i = 0; i < n ; i++) {
            if(arr[i]< k){
                k++;
            } else{
                break;
            }
            System.out.println(k);
        }

    }
}
