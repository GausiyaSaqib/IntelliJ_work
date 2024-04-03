package Array_1_D;

public class min_num_array {
    public static void main(String[] args) {

        int[] arr = {0, 89, 9, 96, 1};
        int n = arr.length;

        //FIRST METHOD
//        int min = arr[0];
//        for (int i = 1; i < n; i++) {
//            if(arr[i]<min){
//                min = arr[i];
//            }
//        }

        //SECOND METHOD
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < n; i++) {
//            if(arr[i]<min){
//                min = arr[i];
//            }
//        }

        // THIRD METHOD
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
           min = Math.min(min,arr[i]);
            }
        System.out.println("min value: " + min);


    }
}
