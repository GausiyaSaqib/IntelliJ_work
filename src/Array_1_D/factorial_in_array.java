package Array_1_D;
public class factorial_in_array {
    public static void main(String[] args) {
        int[] arr = {4, 6, 5, 8, 7};
        int[] brr = new int[arr.length];
        int n = arr.length;
        int f, m;
        for (int i = 0; i < n; i++) {
            m = arr[i];
            f = 1;
            for (int j = 1; j <= m; j++) {
                f = f * j;
            }
            brr[i] = f;
        }
            for(int ele : brr){
                System.out.print(ele+" ");
            }

        }

    }