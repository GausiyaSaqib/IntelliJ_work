package Assignment_Loops;
import java.util.Scanner;
public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int table = 0;
        for (int i = 1; i <= 10; i++) {
            table = n * i;
            System.out.println(table);
        }
    }
}
