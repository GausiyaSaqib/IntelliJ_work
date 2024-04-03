package basicsofjava;
import java.util.Scanner;
public class sum_of_natural {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if(i%1 ==0 && i%i ==0){
                System.out.println("prime");
            }
            else{
                System.out.println("not prime");
            }
            }

        }


    }
