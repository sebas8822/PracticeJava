public class OddNum {
    public static void main(String[] args) {

        System.out.print("Even Numbers: ");
        for (int i = 0; i < 50; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print("\nOdd Numbers: ");
        for (int i = 0; i < 50; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }

}
