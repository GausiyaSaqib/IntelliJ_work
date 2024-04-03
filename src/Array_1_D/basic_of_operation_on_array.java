package Array_1_D;
import java.util.ArrayList;
public class basic_of_operation_on_array {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(6);//initialisation
        arr.add(0,10); //adding elements in array list
        arr.add(1,20); // INITIALISING value to this index
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);
        System.out.println( "ARRAY SIZE IS: "+arr.size());
        System.out.println(arr); // getting output of arraylist
        arr.set(1, 200);  //modify array list
        System.out.println(arr);
        arr.add(45);  // adding any now of element like this in arraylist or pushing
        // to the end of list
        System.out.println("NEW ARRAY SIZE: "+arr.size());
        System.out.println(arr);

    }
}
