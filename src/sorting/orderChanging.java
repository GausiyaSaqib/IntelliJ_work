package sorting;

public class orderChanging {
    public static void main(String[] args) {
        int [] arr = {54,11,28,47,91,63};
        int n = arr.length;
        int x = 0;
        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            int minidx = -1;
            for (int j = 0; j < n; j++) {
                if (arr[j] < min && arr[j] > 0) {
                    min = arr[j];
                    minidx = j;
                }
            }
            arr[minidx] = x;
            x--;
        }
        for(int ele : arr){
            System.out.print((-1*ele)+" ");
        }
    }
}
