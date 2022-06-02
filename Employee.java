public class Employee {
    private String name;
    private double salary;

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
        this.salary = 0.0;
    }


    public Employee(String name, double salary) {
        this.name = name;
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }



    public double setSalary(double new_salary) {

        if (salary >= 0 && salary <= 100000){
            this.salary = new_salary;
            return salary;
        }
        else{
            System.out.println("Salary Outside of range.");
            return salary;
        }

    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
