package Array_1_D;

public class swap_array {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter size of array: ");
        int[] num = new int[26];
        num[0] = 100;
        num[25] = 200;
        int temp = num[25];
        num[25] = num[0];
        num[0] = temp;
        System.out.print("\n"+num[0]+" "+num[25]);


        }

    }


