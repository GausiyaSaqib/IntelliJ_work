package Array_1_D;
import java.util.Scanner;
public class linear_search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target :");
        int x = sc.nextInt();
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        System.out.print("Enter the element of array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
              flag = true;
                break;
            }
        }
        if(flag == true){
            System.out.println("Element found");
        }
        else System.out.println("Element not found");
    }
}
