package Methods;

import java.util.Scanner;

public class fxn_to_tables {
    public static void tables(int n){
        int table = 1;
        for (int i = 1; i <= 10 ; i++) {
            table = n * i;
            System.out.println(table);
        }
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        tables(n);

    }
}
