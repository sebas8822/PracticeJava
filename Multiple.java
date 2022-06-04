import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {


        Scanner input_n = new Scanner(System.in);
        System.out.println("Inset Number: ");

        int num = input_n.nextInt();

        multiple(num);
    }

    public static void multiple(int n) {

        if (n % 5 == 0) {
            System.out.println("HiFive");
        }
        if (n % 2 == 0 || n % 3 == 0){
            System.out.println("Georgia");
        }


    }


}
