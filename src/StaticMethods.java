public class StaticMethods {
    public static void main(String[] args) {
        // Filling massive staff 3 objects type of Employee
        Employee[] staff = new Employee[3];

    }
}
class Employee {
    private static int nextId = 1;

    private String name;
    private double salary;
    private int id;

    public Employee(String n, double s) {
        name = n;
        salary = s;
        id = 0;
    }
}
