public class Student {
    private String studentName;
    private int averageMark;

    public Student() {
        this.studentName = "unknown";
        this.averageMark = 0;
    }

    public Student(String studentName, int averageMark) {
        this.studentName = studentName;
        setAverageMark(averageMark);
    }

    public String getStudentName() {
        return studentName;
    }

    public int getAverageMark() {
        return averageMark;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setAverageMark(int averageMark) {
        if (averageMark<= 100 && averageMark >=0)
            this.averageMark = averageMark;
        else{
            System.out.println("AverageMark no accepted set it 0");
            this.averageMark = 0;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", averageMark=" + averageMark +
                '}';
    }
}
