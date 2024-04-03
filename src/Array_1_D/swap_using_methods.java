package Array_1_D;
public class swap_using_methods {
    public static void main(String[] args) {
        int[] arr = {20, 40, 60, 80, 100, 120, 140};
        int n = arr.length;
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();        //part of array reversing
        int i = 0, j = n - 1; //by changing this we can change if i have to swap
                              // from i = 1 to i = 5 and i want i =0 and i = 6
                              //remains same
        while (i <= j) {
            swap(arr, i, j);
            i++;
            j--;
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }
        public static void swap(int[]arr , int i ,int j ){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }


}
