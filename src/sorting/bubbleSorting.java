package sorting;
public class bubbleSorting {
    public static void main(String[] args) {
        int[] arr = {5, 4,3,2,1};
        int n = arr.length;

        // METHOD FIRST

//        for (int x = 1; x <=(n-1); x++) { // (n-1) PASSES
//            for (int i = 0; i < (n-1); i++) {
//                if (arr[i] > arr[i + 1]) {
//                    int temp = arr[i];
//                    arr[i] = arr[i+1];
//                    arr[i+1] = temp;
//                }
//            }
//        }
//        for(int ele : arr) {
//            System.out.print(ele + " ");
//        }

        // METHOD SECOND

//        for (int x = 0; x <n-1; x++) { // (n-1) PASSES
//            for (int i = 0; i < (n-1-x); i++) {
//                if (arr[i] > arr[i + 1]) {
//                    int temp = arr[i];
//                    arr[i] = arr[i+1];
//                    arr[i+1] = temp;
//                }
//            }
        //       for(int ele : arr) {
//            System.out.print(ele + " ");
//        }

        // METHOD THIRD (OPTIMISED)

        //      for (int x = 0; x <n-1; x++) { // (n-1) PASSES
//            for (int i = 0; i < (n-1-x); i++) {
//                if (arr[i] > arr[i + 1]) {
//                    int temp = arr[i];
//                    arr[i] = arr[i+1];
//                    arr[i+1] = temp;
//                }
//            }
//            boolean flag = false;
//            for (int i = 0; i < n-1; i++) {
//                if(arr[i+1]>arr[i]){
//                    flag = true;
//                    break;
//                }
//                if(flag == true) break;
//            }
//        }
//        for(int ele : arr) {
//            System.out.print(ele + " ");
//        }

        //  METHOD FOURTH (MORE OPTIMISED)

        for (int x = 0; x < n - 1; x++) { // (n-1) PASSES
            boolean flag = true;
            for (int i = 0; i < (n - 1 - x); i++) {
                if (arr[i] > arr[i + 1]) {
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