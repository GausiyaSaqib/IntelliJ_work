package sorting;

public class pushingElementToLast {
    public static void main(String[] args) {
        int [] arr = {0,1,0,3,12};
        int n = arr.length;
        int noz =0;
        for(int z : arr){
            if(z == 0) noz++;
        }
        for (int x = 0; x < noz; x++){
            for (int i = 0; i < n-1-x; i++) {
                if (arr[i] == 0) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
