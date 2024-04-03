package Methods;

import java.util.Scanner;

public class fxn_to_return_raised_to_power {
    public static int raisedPowerNum(int a , int b ) {

        int exponent = 1;
        while (b > 0) {
            exponent *= a;
            b--;
        }
        System.out.println(exponent);
        return exponent;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        raisedPowerNum(a, b);



    }
}
