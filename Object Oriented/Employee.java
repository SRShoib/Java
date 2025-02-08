package LabTask;

class Employee {
    private String name;
    private String id;
    private int age;
    private String designation;
    private double salary;

    public Employee() {

    }

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public Employee(String name, String id, int age, String designation, double salary) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.designation = designation;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Age: " + this.age);
        System.out.println("Designation: " + this.designation);
        System.out.println("Salary: " + this.salary);
    }
}

public class Main2 {
    public static void main(String[] args) {

        Employee e1 = new Employee();
        Employee e2 = new Employee("John", "E101");
        Employee e3 = new Employee("Jane", "E102", 30, "Manager", 50000.0);

        e1.setSalary(25000.0);

        System.out.println("Employee 1:");
        e1.display();

        System.out.println("\nEmployee 2:");
        e2.display();

        System.out.println("\nEmployee 3:");
        e3.display();
    }
}
