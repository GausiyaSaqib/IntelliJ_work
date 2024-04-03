package Array_1_D;
public class dutch_flag_algo {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1, 0, 2, 1, 0, 2, 0, 2,};
        int n = arr.length;
        int low = 0 , mid = 0 , high = n-1;
        while (mid<high){
            if(arr[mid]==0){
               int temp = arr[mid];
               arr[mid] = arr[low];
               arr[low] = temp;
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else {
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        for (int i = 0; i < n ; i++) {
           System.out.print(arr[i]+" ");
        }
    }
}
