package sorting;
import java.util.Arrays;
public class basics {
    public static void main(String[] args) {
        int [] arr = {1,2,3,6,4,5,9,7,8};
        Arrays.sort(arr);
        boolean flag = true;
        for (int i = 0; i <arr.length -1; i++) {
            if(arr[i]>arr[i+1]){
                flag = false;
                break;
            }
        }
        if(flag==true){
            System.out.println("Sorted");
        } else{
            System.out.println("Unsorted");
        }

    }
}
