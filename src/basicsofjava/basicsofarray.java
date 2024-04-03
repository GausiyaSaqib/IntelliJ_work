package basicsofjava;
import java.util.Scanner;
public class basicsofarray
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];
        for(int i =1; i<=6;i++){
            arr[i] = sc.nextInt();
        }
        for(int i =1; i<=6;i++) {
            System.out.print(arr[i] + " ");

        }

    }
}

