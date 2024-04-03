package sorting;

public class bubbleSortingDecreasingOrder {
    public static void main(String[] args) {
        int [] arr = {3,4,5,2,1};
        int n = arr.length;
        for (int x = 0; x < n - 1; x++) { // (n-1) PASSES
            boolean flag = true ;
            for (int i = 0; i < (n - 1 - x); i++) {
                if (arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                   flag = false;
                }
              if (flag == true) break;
            }
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }


    }

}
