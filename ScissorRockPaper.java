import java.util.Scanner;// allows use scanner to input from keyboard

/*
Scissorrockpaper
 */
public class ScissorRockPaper {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int game = 0, gameC = 0, gameH = 0;


        while (gameH < 3 && gameC < 3) {// play until anyone have 3
            //System.out.print("Please insert Scissor(0) or Rock(1) or Paper (2) -->");
            int humanNumber = (int) (Math.random() * 3);//input.nextInt();
            int computerNumber = (int) (Math.random() * 3);
            System.out.println("Human Choice --> " + check(humanNumber) + " " + humanNumber
                    + "\nComputer Choice --> " + check(computerNumber) + " " + computerNumber);

            if (computerNumber == humanNumber)
                System.out.print("\nit is draw\n");
            else if (computerNumber == 2 && humanNumber == 1) {
                System.out.print("\nComputer win + 1\n");
                gameC++;
            } else if (computerNumber == 1 && humanNumber == 0) {
                System.out.print("\nComputer win + 1\n");
                gameC++;
            } else {
                System.out.print("\nHuman win + 1\n");
                gameH++;
            }


            System.out.println("Score Human: " + gameH + "\nScore Computer: " + gameC + "\n\n");

        }
    }


    public static String check(int n) {
        String figure;
        if (n == 0)
            figure = "Scissor";
        else if (n == 1)
            figure = "Rock";
        else
            figure = "Paper";

        return figure;

    }

}


