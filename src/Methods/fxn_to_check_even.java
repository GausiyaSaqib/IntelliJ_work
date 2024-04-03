package Methods;

import java.util.Scanner;

public class fxn_to_check_even {
    public static void checkEven(int n){
        if(n%2 == 0){
            System.out.print("EVEN");
        }
        else{
            System.out.print("ODD");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        checkEven(n);
    }
}
