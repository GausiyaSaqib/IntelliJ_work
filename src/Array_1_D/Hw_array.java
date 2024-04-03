package Array_1_D;

public class Hw_array {
    public static void main(String[] args) {
        int[]arr = {8, 17 ,5, 6, 3, 100, 60};
        int n = arr.length;
        int product = 1;
        for (int i = 0; i < n; i++) {
            product = product * arr[i];
        }
        System.out.println("product of all num: "+product);

    }
}

