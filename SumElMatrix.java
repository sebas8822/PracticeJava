public class SumElMatrix {

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println(sumElements(a)); // output 136

    }


    public static int sumElements(int[][] m){
        int sum = 0;

        for (int i = 0 ; i < m.length;i++)
            for (int j = 0 ; j < m.length;j++)
                sum+=m[i][j];
        return sum;
    }


}
