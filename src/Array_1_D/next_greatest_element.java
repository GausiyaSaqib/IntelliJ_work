package Array_1_D;
public class next_greatest_element {
    public static void main(String[] args) {
        int[] arr = {12, 60, 41, 37, 22, 35, 23};
        int n = arr.length;
        int[] ans = new int[n];
        ans[n - 1] = -1;

        //METHOD FIRST : BRUTE FORCE

//        for (int i = 0; i < n-1; i++) {
//            int mx = Integer.MIN_VALUE;
//            for (int j = i + 1; j < n; j++) {
//                mx = Math.max(mx, arr[j]);
//            }
//           ans[i] = mx;
//            }

       // METHOD SECOND OPTIMISE


        int nge = arr[n-1];
        for (int i = n-2; i>=0; i--) {
            ans[i] = nge;
            nge = Math.max(nge, arr[i]);
        }

        for(int ele:arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
            for(int a : ans){
                System.out.print(a+" ");
            }
        }
    }

