import java.util.Scanner ;

public class Arraylist {


    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

        int[] arr = new int[5];// default value for all elements are 0

        arr[0] = 30;
        arr[1] = 40;
        arr[2] = 50;
        arr[3] = 60;
        arr[4] = 70;
//       arr[5] = 80;



        for (int item : arr) {
            System.out.println(item);

        }
    }
}