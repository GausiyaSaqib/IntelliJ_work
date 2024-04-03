package Methods;

import java.util.Scanner;

public class fxn_to_factorial {
    public static void factorial(int n) {

        if(n<0){
            System.out.println("Invalid");
            return;
        }
        int fact =1;
        for (int i = 1; i <= n; i++) {
            fact = fact* i;
        }
        System.out.print( fact);
        return;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        factorial(n);

    }
}
