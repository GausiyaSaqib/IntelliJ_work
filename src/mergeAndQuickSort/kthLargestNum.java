package mergeAndQuickSort;
public class kthLargestNum {
    static int ans;
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int[] arr, int lo, int hi) {
        int pivot = arr[lo], pivotidx = lo;
        int smallerCount = 0;
        for (int i = lo + 1; i <= hi; i++) {
            if (arr[i] <= pivot) smallerCount++;
        }
        int correctIdx = lo + smallerCount;
        swap(arr, correctIdx, pivotidx);
        // partition
        int i = lo, j = hi;
        while (i < correctIdx && j > correctIdx) {
            if (arr[i] <= pivot) i++;
            else if (arr[j] > pivot) j--;
            else if (arr[i] > pivot && arr[j] <= pivot) {
                swap(arr, i, j);
            }
        }
        return correctIdx;
    }

    public static void quickSort(int[] arr, int lo, int hi , int k) {
        if (lo >hi) return;
        if(lo == hi){
            if(lo == k-1)
                ans = arr[lo];
            return;
        }
        int idx = partition(arr, lo, hi);
        if(k-1 == idx){
            ans = arr[idx];
            return;
        }
        if(k-1<idx) quickSort(arr, lo, idx - 1,k);
       else quickSort(arr, idx + 1, hi,k);
    }

    public static void main(String[] args) {
        int[] arr = {4, 9, 7, 1, 2, 3, 6, 5, 8};
        int n = arr.length;
        int k = 2;
        ans = -1;
        print(arr);
        quickSort(arr, 0, n - 1,n-k+1);
        print(arr);
        System.out.println(ans);
    }
}
