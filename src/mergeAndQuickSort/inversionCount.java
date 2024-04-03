package mergeAndQuickSort;

public class inversionCount {
    static int count;

    // METHOD FIRST

//    public static void inversion(int[] a, int[] b){
//        int i = 0, j = 0;
//        while(i<a.length && j<b.length){
//            if(a[i]>b[j]){
//                count += (a.length-i);
//                j++;
//            }
//            else i++;
//        }
//    }
//    public static void mergeSort(int[] a, int[] b,int[] c){
//        int i = 0, j = 0 , k = 0;
//        while(i<a.length && j<b.length){
//            if(a[i]<=b[j]) c[k++] = a[i++];
//            else c[k++] = b[j++];
//        }
//        while(i<a.length) c[k++] = a[i++];
//        while(j<b.length) c[k++] = b[j++];
//    }
//    public static void print(int [] arr){
//        for(int ele : arr){
//            System.out.print(ele+" ");
//        }
//        System.out.println();
//    }
//    public static void merge(int[] arr){
//        int n = arr.length;
//        if(n==1) return;
//        int [] a = new int[n/2];
//        int [] b = new int[n-n/2];
//        for (int i = 0; i < n/2; i++) {
//            a[i] = arr[i];
//        }
//        for (int i = 0; i < n-n/2; i++) {
//            b[i] = arr[i+n/2];
//        }
//        merge(a);
//        merge(b);
//        inversion(a,b);
//        mergeSort(a,b,arr);
//    }
//    public static void main(String[] args) {
//        int [] arr = {109,33,89,27,60,10,70};
//        print(arr);
//        merge(arr);
//        print(arr);
//        System.out.println(count);

    // METHOD SECOND


    public static void mergeSort(int[] a, int[] b,int[] c){
        int i = 0, j = 0 , k = 0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]) c[k++] = a[i++];
            else { // else means a[i]>b[j]
                count += a.length - i;
                c[k++] = b[j++];
            }
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
        int [] arr = {109,33,89,27,60,10,70};
        print(arr);
        merge(arr);
        print(arr);
        System.out.println(count);
    }
}
