package sorting;

public class majorityElement {
        public static void print(int[] arr){
           // for( i = 0; i<arr.length;i++) {
                System.out.print(arr[arr.length/2] + " ");
            }

        public static void swap(int[] arr ,int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        public static void main(String[] args) {
            int [] arr = {2,2,2,1,3   ,1,2};
            int n = arr.length;
            for (int i = 1; i < n; i++) {
                for (int j = i; j >= 1; j--) {
                    if (arr[j] < arr[j - 1]) {
                        swap(arr, j, j - 1);
                    } else break;
                }
            }
            print(arr);
    }
}
