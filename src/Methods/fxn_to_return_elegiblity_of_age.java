package Methods;
import java.util.Scanner;
public class fxn_to_return_elegiblity_of_age {
    public static int eligibity( int age){
        if(age> 18){
            System.out.println("eligible to vote");
        }
        else{
            System.out.println("not eligible to vote");
        }
     return age;
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt();
        eligibity(n);
    }
}
