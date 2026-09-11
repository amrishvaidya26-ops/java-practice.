package oops;//package oops;
//
//
     class Student {

    String name;
    int rollno;
    int marks;


    //    Parametrized Constructor
    public Student(String name, int rollno, int marks) {

        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }

        public void DisplayStudent() {

            System.out.println("Name:" + name);
            System.out.println("Rollno:" + rollno);
            System.out.println("Marks:" + marks);
        }
     }
//
//        }
//
//        public static void main(String[]args) {
//            Student s1 = new Student("AmrishVaidya",26, 92);
//
//            s1.DisplayStudent();
//
//        }
//    }


//     class Student {
//
//         String name;
//         int age;
//         int marks;
//
////         paramatirized constructor
//
//         public Student(String name, int age, int marks) {
//             this.name = name;
//             this.age = age;
//             this.marks = marks;
//
//         }
//
//         public void displaystudent() {
//
//             System.out.println("Name:" + name);
//             System.out.println("Age:" + age);
//             System.out.println("Marks:" + marks);
//
//         }
//
//         public static void main(String[] args){
//
//             Student s1 = new Student("Amrish",21, 92);
//
//             Student s2 = new Student("Rahul",20,95);
//
//
//             s1.displaystudent();
//             s2.displaystudent();
//
//
//
//
//         }

//----------------------------------------------------------------------------------------------------------------

// Question no 2
//    Create a BankAccount class using
//    encapsulation with accountnumber , accountHolder, balance , deposit(),withdrow, and display balance().

//     class BankAccount {
//
//    private long accountnumber;
//    private String accountholder;               // Encapsulation
//    private double balance;
//
//

//
//    public BankAccount(long AccountNumber, String AccountHolder, double balance) {
//
//        this.accountnumber = AccountNumber;
//        this.accountholder = AccountHolder;
//        this.balance = balance;
//
//
//    }
//

//
//
//    void deposit(double amount) {
//
//        balance = balance + amount;
//
//        System.out.println("Deposited:" + amount);
//
//    }
//

//
//    void Withdraw(double amount) {
//
//        if (amount <= balance) {
//            balance = balance - amount;
////                  ex.5000 .Minus  ex.1000
//            System.out.println("Withdraw Succesful");
//
//        } else {
//
//
//
//
//                System.out.println("Not enough Money");
//            }
//        }
//

//
//
//        void displaybalance() {
//
//            System.out.println("AccountNumber:" + accountnumber);
//            System.out.println("AccountHolder:" + accountholder);
//            System.out.println("Balance:" + balance);
//
//
//        }
//    public static void main(String[] args) {
//
//      BankAccount account = new BankAccount(743678672, "Amrish", 5000);
//
//        account.deposit(2000);
//        account.Withdraw(1000);
//        account.displaybalance();
//
//
//    }
//
//}

//----------------------------------------------------------------------------------------------------------------


//class Employee {
//
//    void work() {
//        System.out.println("Employee is working");
//    }
//}
//
//

//class Developer extends Employee {
//
//    @Override
//    void work() {
//        System.out.println("Developer is writing code");
//    }
//}
//

//class Tester extends Employee {
//
//    @Override
//    void work() {
//        System.out.println("Tester is testing the software");
//    }
//}
//
//

//class Main {
//
//    public static void main(String[] args) {
//
//        Employee e1 = new Developer();
//        Employee e2 = new Tester();
//
//        e1.work();
//        e2.work();
//    }
//}
//
