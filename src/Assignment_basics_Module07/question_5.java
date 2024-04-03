package Assignment_basics_Module07;
import java.util.Scanner;
public class question_5 {
    // Program Area Of Circle
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double r = sc.nextDouble();
        double pi = 3.14159, a;
        a = pi * r * r;
        System.out.println("Area of the Circle: " + a);


        // Program : Simple Interest

        System.out.print("Enter the principal amount: ");
        int p = sc.nextInt();
        System.out.print("Enter the rate of interest: ");
        int rate = sc.nextInt();
        System.out.print("time(in years): ");
        int t = sc.nextInt();
        double s = (p * rate * t) / 100;
        System.out.print("Simple Interest : " + s);
    }
}
