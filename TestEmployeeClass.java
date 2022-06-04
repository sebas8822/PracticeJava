public class TestEmployeeClass {
    public static void main(String[] args) {


        Employee emp1 = new Employee("Fred", 45000);
        Employee emp2 = new Employee("Sue", 55000);


        System.out.println("Employee " + emp1.getName() + " earn per year " + emp1.getSalary() + " tax to pay: " + (emp1.getSalary()) * 0.40);
        System.out.println("Employee " + emp2.getName() + " earn per year " + emp2.getSalary() + " tax to pay: " + (emp2.getSalary()) * 0.40);
    }
}
