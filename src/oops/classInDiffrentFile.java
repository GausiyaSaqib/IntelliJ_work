package oops;

public class classInDiffrentFile {
    public static void main(String[] args) {
         class students{    // creating new class
            String name;//properties of student
            int rno;
            double percent;
        }
        students x = new students();
         x.name = "Gausiya ";
         x.rno = 45;
         x.percent = 95.2;
        System.out.println(x.name);

    }
}
