package varibables;

import java.util.Scanner;

public class ent {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        int age;
        double price;
        char grade;
        boolean itswindy;
        String name;

        System.out.println("Enter Student Name : ");
        name = scan.nextLine();

        System.out.println("Enter Age :");
        age = scan.nextInt();

        System.out.println("Enter Grade:");
        grade = scan.next().charAt(0);

        System.out.println("Enter the price:");
        price = scan.nextDouble();


        System.out.println("Student information");
        System.out.println("Name :+" + name);
        System.out.println("Age :+" + age);
        System.out.println("Price :+"+price);
        System.out.println("Grade :+"+grade);


    }
}


