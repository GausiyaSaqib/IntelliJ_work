package string;

public class insertanddeletechar {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Afreen");
        System.out.println(sb);
        sb.deleteCharAt(3); // DELETE ONE CHARACTER ONLY
        sb.append("nisar");
        System.out.println(sb);
        sb.delete(2,5);  // DELETE STRING FROM 2 TO 4
        System.out.println(sb);

        sb.insert(2 , 'r');  // INSERTING CHARACTER
        System.out.println(sb);
        sb.insert(2 , 45);  // INSERTING INTEGER
        System.out.println(sb);
        sb.insert(2 ,  true); // INSERTING BOOLEAN
        System.out.println(sb);
        sb.insert(2 , "bush"); // INSERTING STRING
        System.out.println(sb);

    }
}
