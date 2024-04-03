package string;

import java.util.Scanner;

public class stringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         StringBuilder sb = new StringBuilder ("Gausiya");
        sb.setCharAt(0,'F');
        sb.setCharAt(3,'z');
        System.out.println(sb);







        // METHOD FIRST  ( FOR TAKING INPUT)

//        String s = sc.nextLine();
//        StringBuilder sb = new StringBuilder(s);
//        System.out.println(sb);
//
        // METHOD SECOND

//        StringBuilder x = new StringBuilder(sc.nextLine());
//        System.out.println(x);



        // LENGTH AND CAPACITY OF STRINGBUILDER

//        StringBuilder sb = new StringBuilder("Gausiya nisar");
//        System.out.println(sb);
//        StringBuilder y = new StringBuilder();
//        System.out.println(y);
//        StringBuilder z = new StringBuilder(10);
//        System.out.println(z.length());  // its length not capacity
//        System.out.println(z.capacity()); // CAPACITY IS 10
//        StringBuilder x = new StringBuilder("");
//        System.out.println(x.length());
//        StringBuilder w = new StringBuilder();
//        System.out.println(w.capacity()); // CAPACITY OF EMPTY IS 16

    }
}
