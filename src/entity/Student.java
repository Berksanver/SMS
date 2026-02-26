package entity;

public class Student extends Person {

    private int grade;
    private String studentNumber;

    public Student(int id, String firstName, String lastName, int age, int grade, String studentNumber) {
        super(id, firstName, lastName, age);
        setGrade(grade);
        setStudentNumber(studentNumber);
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade <= 0) {
            throw new IllegalArgumentException("Grade must be greater than 0.");
        }
        this.grade = grade;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        if (studentNumber == null || studentNumber.trim().isEmpty()) {
            throw new IllegalArgumentException("Student number cannot be empty.");
        }
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return super.toString() +
                String.format(", Grade: %d, Student Number: %s",
                        grade, studentNumber);
    }
}