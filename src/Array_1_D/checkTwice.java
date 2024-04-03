package Array_1_D;
public class checkTwice {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 2};
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    break;
                }
                else{
                    System.out.println(arr[i]);
                }
            }
        }
        }
    }


