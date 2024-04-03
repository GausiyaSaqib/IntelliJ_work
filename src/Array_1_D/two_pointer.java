package Array_1_D;

public class two_pointer {
    public static void main(String[] args) {
        int[] arr = {20, 40, 60, 80, 100, 120, 140};
        int n = arr.length;
        for(int ele : arr ){
            System.out.print(ele+" ");
        }
        System.out.println();
        int i =0, j = n-1;
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int ele : arr ){
            System.out.print(ele+" ");
        }
    }
}
