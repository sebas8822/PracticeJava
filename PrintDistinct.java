import java.util.ArrayList;
import java.util.Arrays;

public class PrintDistinct {
    public static void main(String[] args) {
        boolean flag = false;


        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            array.add((int) (Math.random() * 10));


        }
        System.out.println("array 1: " + array );


        for (int element : array) {
            array2.add(element);
        }
        System.out.println("array 2: " + array2 );
        for (int element : array) {
            while(check(array2,element)){
                array2.remove(array2.indexOf(element));
                //System.out.println("array 2: " + array2 );
            }
        }
        System.out.println("array 2: " + array2 );


    }

    private static boolean check(ArrayList<Integer> arr, int toCheckValue) {

        int count = 0;
        for (int element : arr) {
            if (toCheckValue == element) {
                count++;
            }
        }
        if (count > 1) {
            //System.out.println(count);
            return true;
        }

        return false;

    }


}

