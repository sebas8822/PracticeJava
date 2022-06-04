import java.lang.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Password {
    public static final int PASS_LENGHT = 8;


    public static void main(String[] args) {
        String password1 = "h0l4mund0"; // 8 characters
        String password2 = "h0l4mun#j"; // 8 character with special character
        String password3 = "h0l4mun#"; // 7 characters


        valid_pass(password1);
        valid_pass(password2);
        valid_pass(password3);

        Scanner input = new Scanner(System.in);
        System.out.println("Enter username: ");

        String password4 = input.nextLine();

        valid_pass(password4);
        //System.out.println();
        //System.out.println(valid_pass(password1);
    }

    public static void valid_pass(String pass) {

        ArrayList<Character> digits = new ArrayList<>();
        ArrayList<Character> letter = new ArrayList<>();
        ArrayList<Character> spCh = new ArrayList<>();
        int countdigit = 0;
        int countletter = 0;
        int countSpCh = 0;
        for (int i = 0; i < pass.length(); i++) {
            char ch = pass.charAt(i);
            if (Character.isDigit(ch)) {
                countdigit++;
                digits.add(ch);
            }
            if (Character.isLetter(ch)) {
                countletter++;
                letter.add(ch);
            }
            if (!Character.isDigit(ch) && !Character.isLetter(ch)) {
                countSpCh++;
                spCh.add(ch);
            }

        }

        System.out.println(digits);
        System.out.println(letter);
        System.out.println(spCh);


        if (pass.length() > PASS_LENGHT) {
            if (countdigit >= 2 && countSpCh == 0) {
                System.out.println("Valid Password");
            } else {
                System.out.println("Invalid Password");
            }
        } else {
            System.out.println("Invalid Password");
        }


    }


}
