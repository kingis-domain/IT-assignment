import java.util.Scanner;

class Employee {
    String name;
    double salary;

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

class Lecturer extends Employee {
    String department;

    // Overriding method
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
    }
}

public class UniversityApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Lecturer lecturer = new Lecturer();

        System.out.print("Enter name: ");
        lecturer.name = input.nextLine();

        System.out.print("Enter salary: ");
        lecturer.salary = input.nextDouble();
        input.nextLine(); // clear buffer

        System.out.print("Enter department: ");
        lecturer.department = input.nextLine();

        lecturer.displayInfo();
    }
}
