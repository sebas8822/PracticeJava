import java.util.Arrays;

public class ExamQ2 {

    public static void main(String[] args) {
        char codepoint1 = '1';
        char codepoint2 = 'A';
        char codepoint3  ='@';
        boolean b1 = Character.isAlphabetic(codepoint1);
        boolean b2 = Character.isAlphabetic(codepoint2);
        boolean b3 = Character.isAlphabetic(codepoint3);
        System.out.println("The returned value for the first character is given as:"+"   "+b1);
        System.out.println("The returned value for the second character is given as:"+"  "+b2);
        System.out.println("The returned value for the third character is given as:"+"   "+b3);
    }
}
