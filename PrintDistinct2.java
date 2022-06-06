import java.util.ArrayList;
import java.util.Arrays;

public class PrintDistinct2 {
    public static void main(String[] args) {
        boolean flag = false;


        ArrayList<Integer> array = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        int val = 0;
        int count = 0;
        for (int i = 0; i < 20; i++) {
            val = (int) (Math.random() * 10);
            System.out.print(" " + val);
            for (int element : array) {
                if (val == element) {
                    count++;
                }
            }
            if (count == 0) {
                array.add(val);
            }
            count = 0;

        }
    }
}
