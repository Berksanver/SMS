package entity;

public class Employee  extends Person {
    private double salary;

    public Employee(int id, String lastName, String firstName, int age, double salary) {
        super(id, lastName, firstName, age);
        this.salary = salary;
    }
    public void raiseSalaryByPercent(double percent) {
        if(percent > 0.0){
            this.salary = this.salary * percent;
        }
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        if(salary > 0.0){
            this.salary = salary;
        }
    }
    @Override
    public String toString() {
        return super.toString() + "Teacher{" + "salary=" + salary + '}';
    }
}
