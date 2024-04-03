package Methods;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class fxn_to_count_pos_neg_zero {
    public static int numbers(int a) {
        if (a < 0) {
            System.out.println("its negative num");
        } else if (a == 0){
            System.out.println(" its zero");
        }
        else{
            System.out.println("its positive num");
        }
        return a;

    }

    public static void main(String[] args) {
            Scanner sc =  new Scanner(System.in);
            int a = sc.nextInt();
        numbers(a);
        }

    }
