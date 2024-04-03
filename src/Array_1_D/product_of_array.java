package Array_1_D;

public class product_of_array {
    public static void main(String[] args) {
        int[]arr = {8, 1 ,5, 3,1, 10, 6};
        int n = arr.length;
        int product = 1;
        for (int i = 0; i < n; i++) {
            product = product * arr[i];
        }
        System.out.println("product of all num: "+product);

    }
}