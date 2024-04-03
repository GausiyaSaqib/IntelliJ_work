package Array_1_D;
//////TWO PASS SOLUTION
public class sort_of_zeros_ones {
    public static void main(String[] args) {
          int[] arr = { 1,0,1,0,1,0,1,1,0,0,0,0,};
          int n = arr.length;
          int noofzeros = 0;// noofones = 0;// {if this not written
                                           // than also no probs
        for (int i = 0; i < n; i++) {
            if(arr[i]==0){
                noofzeros++;
            }
           // else noofones++;
        }
       // System.out.println(noofzeros+" "+noofones);
        for (int i = 0; i <n ; i++) {
            if(i<noofzeros) arr[i] = 0;
            else arr[i] =1;
        }
        //for (int i = noofzeros; i <n ; i++) {

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");

        }     // arr[i] = 1;
    }


    }
