public class SmallArray {

    public static void main(String[] args) {

        int size_array = (int) (Math.random() * 10) + 1;
        double[] a = new double[size_array];

        for (int i = 0; i <= size_array - 1; i++)
            a[i] = (int) (Math.random() * 100) + 1;

        for (int i = 0; i <= size_array - 1; i++)
            System.out.print(" " + a[i]);

        indexOfSmallestElement(a);

    }

    public static int indexOfSmallestElement(double[] array) {

        int index = 0;
        double val = array[0];


        for (int i = 0; i < array.length; i++) {
            if (array[i]<val)
                val = array[i];
                index = i;
        }

        System.out.println();
        System.out.println("val: " + val + " index: " + index );


        return index;
    }

}
