package sorting;

public class selectionSortNew {
        public static void print(int[] arr){
            for(int ele : arr) {
                System.out.print(ele + " ");
            }
        }
        public static void swap(int[] arr ,int i, int j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        public static void main(String[] args) {
            int [] arr = {3,5,2,1,4};
            int n = arr.length;
            for (int i = 0; i < n-1; i++) {
                int m = Integer.MIN_VALUE;
                int maxidx =-1;
                for (int j = i; j < n; j++) {
                    if(arr[j]> m) {
                        m = arr[j];
                        maxidx = n-j;
                    }
                }
                swap(arr,i,maxidx);
            }
            print(arr);
    }

}
