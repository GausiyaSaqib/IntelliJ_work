package string;

public class append {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Gausiya");
        sb.append("nisar"); // CAN APPEND ANY STRING
        System.out.println(sb);
        sb.append(45);      // CAN APPEND INT
        System.out.println(sb);
        sb.append('$');      // CAN APPEND CHARACTER
        System.out.println(sb);
        char[] ch = {'s','a','q','i','b'};
        sb.append(ch);       // CAN APPEND CHARACTER ARRAY
        System.out.println(sb);
        int [] arr = {1,2,3,4,5};
        sb.append(arr);  // DOES NOT WORK ADDRESS APPEND OVER HERE
        System.out.println(sb);
        StringBuilder y = new StringBuilder("MOHD SAQIB");
        sb.append(y);   // CAN APPEND STRING BUILDER
        System.out.println(sb);




    }
}
