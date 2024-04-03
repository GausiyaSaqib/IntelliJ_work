package Array_1_D;
import java.util.Arrays;
public class assignment_sort{
    public static void main(String[] args) {
        int[] nums1 = {20, 90, 40, 10, 50, 30};
        int [] nums2 = {100, 70, 60, 80, 120, 110};
        int m = nums1.length;
        int n = nums2.length;
        int[] x = new int[n+m];
        int i =0, j=0, k=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                x[k] = nums1[i];
                i++;
                k++;
            } else{
                x[k] = nums2[j];
                k++;
                j++;
            }
        }
        if(i==m){
            while(j<n){
                x[k] = nums2[j];
                j++;
                k++;
            }
        }
        if(j==n){
            while(i<m){
                x[k] = nums1[i];
                i++;
                k++;
            }
        }
        for(int ele : x){
            System.out.print(ele+" ");
        }
    }
}