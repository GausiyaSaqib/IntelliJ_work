package Array_1_D;
public class HW_merge_Array {
    public static void main(String[] args) {
        int[] a = {11, 33, 42, 71, 83};
        int[] b = {26, 54, 69, 81};
        int[] c = new int[b.length+a.length];
        int i = a.length-1, j = b.length-1, k =a.length+ b.length-1 ;
        while(i>=0 && j>=0) {
            if (a[i] >= b[j]) {
                c[k] = a[i];
                i--;
                k--;
            }
            else {
                c[k] = b[j];
                j--;
                k--;
            }
        }
        if(i==0) {
            while (j >= 0) {
                c[k] = b[j];
                j--;
                k--;
            }
        }
        if(j==0) {
            while (i >=0) {
                c[k] = a[i];
                i--;
                k--;
            }
        }
        for(int ele : c)
            System.out.print(ele+" ");

    }
}
