import java.util.Scanner;

public class TestStudent {

    public static void main(String[] args) {


        Student student1 = new Student();

        System.out.println(student1);
        Student student2 = new Student("Jamie",65);
        System.out.println(student2);
        student1.setStudentName("Jack");
        student1.setAverageMark(57);
        System.out.println(student1);

        Scanner input_a = new Scanner(System.in);
        System.out.println("Inset Stundet Name: ");
        String std_name = input_a.nextLine();
        System.out.println("Inset Average mark: ");
        int ave_mark = input_a.nextInt();
        Student student3 = new Student(std_name,ave_mark);
        System.out.println(student3);








    }

}
