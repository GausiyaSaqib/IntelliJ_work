package binarySearch;

public class basics {
    public static void main(String[] args) {
        int [] arr = {10,15,21,34,81,105,180,500,615};
        int n = arr.length;
         int target = 34;
        int lo = 0,hi = n-1;
        boolean flag = false;
         while(lo<=hi){
             int mid = (lo+hi)/2;
             if(arr[mid]==target) {
                 flag = true;
                 break;
             }
             else if(arr[mid]<target) lo = mid +1;
             else if(arr[mid]>target) hi = mid -1;
         }
         if(flag == true) {
             System.out.print("Target found");
         }
             else {
             System.out.print("Target not found");

             }
         }

    }
