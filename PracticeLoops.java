/*


Write a program that reads the mark. It will display the grade according to the mark
bsed on the grading scale as follows:
High Distinction: 85% - 100% Distinction: 75% - 84% Credit: 65% - 74% Pass: 50% - 64% Fail: 0 - 49%
Hint: You need to use the if‐else if‐ else statement.
*
*
* */

import java.util.Scanner;// allows use scanner to input from keyboard

public class PracticeLoops {

    /*Main Method*/
    public static void main(String[] args) {
        // Declare and inicialize vareables
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter two integers
        System.out.print("Enter the mark in percentage 0-100% ");
        int mark = input.nextInt();
        if (mark >= 85)
            System.out.println("High Distinction");
        else if (mark >= 75 && mark <= 84)
            System.out.println("Distinction");
        else if (mark >= 65 && mark <= 74)
            System.out.println("Credit");
        else if (mark >= 50 && mark <= 65)
            System.out.println("Pass");
        else
            System.out.println("Fail");


    }
}










