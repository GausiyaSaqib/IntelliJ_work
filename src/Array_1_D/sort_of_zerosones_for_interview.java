package Array_1_D;
////////ONE PASS SOLUTION
public class sort_of_zerosones_for_interview {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 0, 0,};
        int n = arr.length;

        int i = 0, j = n - 1;
        while (i < j) {
            if (arr[i] == 0) i++;
            if(arr[j] == 1) j--;
             if(arr[i]==1 && arr[j]==0){
//                int temp = arr[i];
//                arr[i] = arr[j];
//                arr[j] = temp;
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
            for ( int ele : arr) {
                System.out.print(ele+" ");
            }
            System.out.println();



        }
    }
}
