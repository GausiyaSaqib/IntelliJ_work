package Array_1_D;
public class first_non_repeating_element {
    public static void main(String[] args) {
        int[] arr = {1, 6, 6, 1, 5, 3, 4};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
                    if (count == 1) {
                        System.out.print(arr[i] + " ");
                        break;
                    }

                }

            }

        }





