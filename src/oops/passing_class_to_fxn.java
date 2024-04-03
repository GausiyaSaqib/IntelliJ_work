package oops;

public class passing_class_to_fxn {
    public static class students{
        String name;
        int rno;
        double percent;
    }
    public static void fxn(students x){
        System.out.print(x.name);
    }
    public static void change(students x){  //pass by referece
        x.name = "Amna";
    }
    public static void main(String[] args) {
        students x = new students();
        x.name = "Gausiya Nisar";
        x.rno = 375;
        x.percent = 99.9;
        fxn(x);
        System.out.println();
        change(x);
        fxn(x);
    }
}
