package Array_1_D;

public class deep_copy_of_array {
    public static void main(String[] args) {
        int[] arr = {90, 20, 130, 420};
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        // 1st METHOD
//        int[] brr = Arrays.copyOf(arr,arr.length);
//        brr[0] = 100;
//        for (int x : brr) {
//            System.out.print(x + " ");
//        }
//        System.out.println();
//        System.out.println(arr[0]+" ");
        //2nd METHOD
        int[] crr = new int[arr.length];
        for (int i =0;i<arr.length;i++) {
            crr[i] = arr[i];
            System.out.print(crr[i]+" ");
        }
        System.out.println();
        crr[0] = 200;
        System.out.print(crr[0]+" ");
        System.out.println();
        System.out.println(arr[0]+" ");
    }
}
