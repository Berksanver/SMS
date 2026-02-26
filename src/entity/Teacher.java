package entity;

public class Teacher extends Employee {
    private String branch;

    public Teacher(int id, String lastName, String firstName, int age, double salary, String branch) {
        super(id, lastName, firstName, age, salary);
        this.branch = branch;
    }

    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    @Override
    public String toString() {
        return super.toString() + "Teacher{" + "branch=" + branch + '}';
    }
}
