import entity.Manager;
import entity.School;
import entity.Student;
import entity.Teacher;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        School school = new School("School1", "Address", "+03500502350");

        System.out.println("Welcome to the " + school.getSchoolName() + " School Management System");

        while (true) {

            System.out.println("Please enter your choice");
            System.out.println("1. Add Student");
            System.out.println("2. Add Teacher");
            System.out.println("3. Add Manager");
            System.out.println("4. List Students");
            System.out.println("5. List Teachers");
            System.out.println("6. List Managers");
            System.out.println("7. Find Student by ID");
            System.out.println("0. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Enter Student ID:");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Enter First Name:");
                    String firstName = scanner.nextLine();

                    System.out.println("Enter Last Name:");
                    String lastName = scanner.nextLine();

                    System.out.println("Enter Age:");
                    int age = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Enter Grade:");
                    int grade = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Enter Student Number:");
                    String number = scanner.nextLine();

                    Student student = new Student(id, firstName, lastName, age, grade, number);
                    school.addStudent(student);

                    System.out.println("Student added successfully.");
                    break;

                case 4:
                    school.listStudents();
                    break;

                case 5:
                    school.listTeachers();
                    break;

                case 6:
                    school.listManagers();
                    break;

                case 7:
                    System.out.println("Enter Student ID:");
                    int studentID = scanner.nextInt();
                    scanner.nextLine();

                    Student foundStudent = school.findStudentById(String.valueOf(studentID));

                    if (foundStudent != null) {
                        System.out.println("Student found:");
                        System.out.println(foundStudent);
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 0:
                    System.out.println("Exiting system...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

//System.out.println("Hello and welcome!");
//      School school = new School("Scholl1","ADress","052124214512");
//      Student s1 = new Student(1,"BErk","gagasg",16,1,"111");
//      Student s2 = new Student(2,"Berk2","gagassfasgg",16,1,"222");
//
//      Teacher t1 = new Teacher(201,"Ali","ARagsa",30,1000,"gasgasg");
//      Manager m1 = new Manager(1,"Berk","gagasg",16,2000,"222");
//      school.addStudent(s1);
//      school.addStudent(s2);
//      school.addTeacher(t1);
//      school.addManager(m1);
//
//      school.listStudents();
//      school.listTeachers();
//      school.listManagers();
//
//      System.out.println("Zam &ouml;ncesi maa&#x15F;" + t1.getSalary());
//      t1.raiseSalaryByPercent(10);
//      System.out.println("Zam Sonras&#x131; maa&#x15F;"  + t1.getSalary()) ;


// School Management System
// School  adres kapasite

//Person
  // Student adi soyadi yasi

  // Employee- teacher manage - security
     // Teacher - adi o-soyadi yasi uzmanlik alani
     // Manager - adi soyadi yasi, departman
     // Security - adi soyadi yasi, g&ouml;rev kademesi