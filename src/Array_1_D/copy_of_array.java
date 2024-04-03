package Array_1_D;

public class copy_of_array {
    public static void main(String[] args) {
        int[] arr = {90, 20, 130, 420};
        for (int ele : arr) {
            System.out.print(ele+" ");
        }
        System.out.println();
        int[] nums = arr; //shallow copy
        for (int x : nums) {
            System.out.print(x+" ");
        }
    }
}
