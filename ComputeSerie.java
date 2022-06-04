public class ComputeSerie {

    public static void main(String[] args) {

        int n = 20;
        //System.out.println(computeSerie(input));

        System.out.println("--------------------");
        System.out.println(" i          m(i)    ");
        for (int i = 1; i <= n; i++)
            System.out.println(" " + i + "\t\t\t" + (String.format("%,.4f", m(i))));


    }


    public static double m(int t) {
        double sum = 0.0;

        for (int i = 1; i <= t; i++)
            sum += (i / ((2.0 * i) + 1.0));

        return sum;
    }


}
