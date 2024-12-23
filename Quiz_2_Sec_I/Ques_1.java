package Quiz_2_Sec_I;

import java.util.Scanner;

class Employee {
    private final String name; 
    private int age;
    private String email;

    // Constructor
    public Employee(String name, int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Employee must be over 18 years old.");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Employee must be over 18 years old.");
        }
        this.age = age;
    }
}

public class Ques_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        Employee employee;
        try {
            employee = new Employee(name, age);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

        System.out.print("Enter employee email: ");
        String email = scanner.nextLine();
        employee.setEmail(email);

        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Email: " + employee.getEmail());

        scanner.close();
    }
}
