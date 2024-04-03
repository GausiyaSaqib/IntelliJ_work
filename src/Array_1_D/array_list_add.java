package Array_1_D;
import java.util.ArrayList;
public class array_list_add {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //bcoz of arraylist wdout initiation we add elements to arraylist
        System.out.println(list+" "+list.size());
        list.add(60);
        System.out.println(list+" "+list.size());
        list.add(30);
        System.out.println(list+" "+list.size());
        list.add(500);
        System.out.println(list+" "+list.size());
        list.add(40);
        System.out.println(list+" "+list.size());
        list.remove(2); //using arraylist we easily remove any element also
        System.out.println(list+" "+list.size());
    }
}
