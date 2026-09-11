

//class Person {
//    String name;
//    int age;
//
//    void displayPerson() {
//        System.out.println("Name: " + name);
//        System.out.println("Age: " + age);
//    }
//}
//
//class Student extends Person {
//    int rollNo;
//    String course;
//
//    void displayStudent() {
//        displayPerson();
//        System.out.println("Roll No: " + rollNo);
//        System.out.println("Course: " + course);
//    }
//}
//
//class Teacher extends Person {
//    String subject;
//    double salary;
//
//    void displayTeacher() {
//        displayPerson();
//        System.out.println("Subject: " + subject);
//        System.out.println("Salary: " + salary);
//    }
//}
//
//public class CollegeManagementSystem {
//
//    public static void main(String[] args) {
//
//        Student s = new Student();
//
//        s.name = "Rahul";
//        s.age = 20;
//        s.rollNo = 56;
//        s.course = "Computer Science";
//
//        System.out.println("----- Student Details -----");
//        s.displayStudent();
//
//        Teacher t = new Teacher();
//
//        t.name = "PratapSingh";
//        t.age = 40;
//        t.subject = "Java";
//        t.salary = 45000;
//
//        System.out.println("------Teacher Details-----");
//        t.displayTeacher();
//
//    }
//}