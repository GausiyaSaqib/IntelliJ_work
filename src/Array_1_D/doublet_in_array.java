package Array_1_D;

public class doublet_in_array {
    public static void main(String[] args) {
        int[] arr = {2, 6, 5, 9, 3};
        int x = 12;
        for (int i = 0; i < arr.length; i++) {// moves to whole loop
            for (int j = i + 1; j < arr.length; j++) {
                // from second ele to last checking
                if (arr[j] + arr[i] == x) {
                    System.out.println(arr[i]+" "+arr[j]);
                }

            }
        }
    }
}
