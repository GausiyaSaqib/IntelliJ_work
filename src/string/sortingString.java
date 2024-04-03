package string;

import java.util.Arrays;

public class sortingString {
    public static void main(String[] args) {

        // SORTING OF STRING

//        String s = "gausiya";
//
//        char[] ch = s.toCharArray(); // FXN CONVERT IT TO CHARACTER ARRAY
//
//       // char[] ch = {'z','a','g','c','b','d'};
//        for(char ele :ch){
//            System.out.print(ele+" ");
//        }
//        System.out.println();
//        Arrays.sort(ch);
//
//        for(char ele :ch){
//            System.out.print(ele+" ");
//        }
//        System.out.println();

        // SORTING OF STRING BUILDER

        StringBuilder sb = new StringBuilder("saqib");
        char [] ch = sb.toString().toCharArray();
        Arrays.sort(ch);
        for(char ele : ch) {
            System.out.print(ele);
        }

    }
}
