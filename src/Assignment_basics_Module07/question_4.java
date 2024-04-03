package Assignment_basics_Module07;

public class question_4 {
    public static void main (String[]args){
        int x = 10 , y =3 , z;
        System.out.println("Original Value: "+x);
       x++;
        System.out.println("After Increement: "+(x++));
        x--;
        System.out.println("After Decreement"+(x--));
        z = x % y;
        System.out.println("Remainder is: "+z);
    }
}

