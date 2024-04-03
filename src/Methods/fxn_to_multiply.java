package Methods;
import java.util.Scanner;
public class fxn_to_multiply {
    public static int mulTwoNum(int a, int b){
        int product = a*b;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc. nextInt();
        int prod = mulTwoNum(a, b);
        System.out.println(prod);

    }
}
