package Array_1_D;

public class sum_of_element_at_odd_and_even {
    public static void main(String[] args) {
        int[]arr = {8, 7 ,5, 6, 3, 10, 6};
        int n = arr.length;
        int sum = 0, s = 0 , d = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sum = sum + arr[i];
            } else {
                s = s + arr[i];
            }
        }
            System.out.println("sum of element at even indices: "+sum+" ");
            System.out.println("sum of element at odd indices: "+s+" ");
          d = s-sum;
        System.out.println("Difference: "+d+" ");
    }
}

