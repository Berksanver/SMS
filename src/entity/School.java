package entity;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName;
    private String schoolAddress;
    private String schoolPhone;
    private List<Student> students;
    private List<Teacher> teachers;
    private List<Manager> managers;
    private List<Security> securities;

    public School(String schoolName, String schoolAddress, String schoolPhone ) {
        this.schoolName = schoolName;
        this.schoolAddress = schoolAddress;
        this.schoolPhone = schoolPhone;

        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.managers = new ArrayList<>();
        this.securities = new ArrayList<>();
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    public void addManager(Manager manager) {
        managers.add(manager);
    }
    public void addSecurity(Security security) {
        securities.add(security);
    }

    public void listStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }
    public void listTeachers() {
        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }
    }
    public void listManagers() {
        for (Manager manager : managers) {
            System.out.println(manager);
        }
    }
    public Student findStudentById(String Id) {
        for (Student student : students) {
            int id = 0;
            if (student.getId() == id){
                return student;
            }
        }
        return null;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }

    public String getSchoolPhone() {
        return schoolPhone;
    }

    public void setSchoolPhone(String schoolPhone) {
        this.schoolPhone = schoolPhone;
    }
    @Override
    public String toString() {
        return "School name:" + schoolName + "Address:" + schoolAddress + "Phone:" + schoolPhone;
    }
}
