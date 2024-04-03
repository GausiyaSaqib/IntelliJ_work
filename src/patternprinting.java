import java.util.Scanner;

public class patternprinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int n = sc.nextInt();
        for(int i = 1 ; i<= n ; i++){
            int a = 1;
            for(int j = 1 ; j<=n; j++){
                if((i+j) >n) {
                    System.out.print(a+" ");
                    a += 1;
                }
                else System.out.print(" "+ " ");
            }
            System.out.println();
        }
    }
}
