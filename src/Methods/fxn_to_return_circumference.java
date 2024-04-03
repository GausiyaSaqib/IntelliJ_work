package Methods;
import java.util.Scanner;
public class fxn_to_return_circumference {
    public static double circumference(double r){
        double c = 0;
        double pi = 3.14;
        c = 2*pi*r;
        System.out.println("circumference is:"+c);
        return c;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        double n = sc.nextDouble();
        circumference(n);
    }
}
