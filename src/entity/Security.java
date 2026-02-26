package entity;

public class Security extends Employee {
    private String area;

    public Security(int id, String lastName, String firstName, int age, double salary,String area) {
        super(id, lastName, firstName, age, salary);
        this.area = area;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    @Override
    public String toString() {
        return super.toString() + "Security{" + "area=" + area + '}';
    }
}
