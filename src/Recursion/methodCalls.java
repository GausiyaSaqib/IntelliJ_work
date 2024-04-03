package Recursion;

public class methodCalls {
    public static void mango(){
        System.out.println("hi i am in mango");
    }
    public static void banana(){
        mango();
        System.out.println("hi i am in banana");
    }
    public static void apple(){
        banana();
        System.out.println("hi i am in apple");
        mango();
    }
    public static void main(String[] args) {
        System.out.println("hi i am in main");
        apple();
    }
}
