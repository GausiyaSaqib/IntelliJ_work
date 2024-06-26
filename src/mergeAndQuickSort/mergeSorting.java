package mergeAndQuickSort;

public class mergeSorting {
    public static void mergeSort(int[] a, int[] b,int[] c){
        int i = 0, j = 0 , k = 0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while(i<a.length) c[k++] = a[i++];
        while(j<b.length) c[k++] = b[j++];
    }
    public static void print(int [] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void merge(int[] arr){
        int n = arr.length;
        if(n==1) return;
        int [] a = new int[n/2];
        int [] b = new int[n-n/2];
        for (int i = 0; i < n/2; i++) {
            a[i] = arr[i];
        }
        for (int i = 0; i < n-n/2; i++) {
            b[i] = arr[i+n/2];
        }
        merge(a);
        merge(b);
        mergeSort(a,b,arr);
    }
    public static void main(String[] args) {
int [] arr = {80,30,50,20,60,70,10};
print(arr);
merge(arr);
print(arr);

    }
}
