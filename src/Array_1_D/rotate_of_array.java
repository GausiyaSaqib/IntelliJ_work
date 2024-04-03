package Array_1_D;

public class rotate_of_array {
    public static void rotate(int[]arr , int i ,int j ){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int n = arr.length;
        int k = 3;
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        int i = 0, j = n - k-1;
        while (i <= j) {
            rotate(arr, i,j);
            i++;
            j--;
        }

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        i = n - k ;
        j = n - 1;
        while (i <= j) {
            rotate(arr, i,j);
            i++;
            j--;
        }

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        i = 0;
        j = n - 1;
        while (i <= j) {
            rotate(arr, i,j);
            i++;
            j--;
        }

        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
}
