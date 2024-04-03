package Methods;

import java.util.Scanner;

public class fxn_to_check_prime {
    public static void checkPrime(int n){
        int x = 0;
        for (int i = 2; i < n-1 ; i++) {
            if(n%i == 0){
                System.out.print("Not prime");
                x=1;
                return;
            }
        }
        if( x ==0){
            System.out.print("Prime");
        }

    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        checkPrime(n);

    }
}
