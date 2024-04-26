import java.util.*;

class EmployeeReverse implements Comparable<EmployeeReverse> {
    private int employeeId;
    private String firstName;
    private String lastName;
    private double salary;
    private int experience;

    public EmployeeReverse(int employeeId, String firstName, String lastName, double salary, int experience) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.experience = experience;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public int compareTo(EmployeeReverse other) {
        return Integer.compare(other.employeeId, this.employeeId);
    }

    @Override
    public String toString() {
        return "EmployeeReverse{" +
                "employeeId=" + employeeId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", experience=" + experience +
                '}';
    }

    public static void main(String[] args) {
        List<EmployeeReverse> employees = new ArrayList<>();
        employees.add(new EmployeeReverse(101, "John", "Doe", 50000, 5));
        employees.add(new EmployeeReverse(102, "Jane", "Smith", 60000, 4));
        employees.add(new EmployeeReverse(103, "John", "Smith", 55000, 6));
        // Add more employees as needed

        // Sort based on employee ID (reverse order)
        Collections.sort(employees);

        // Print sorted employees by ID in reverse order
        System.out.println("Sorted by Employee ID (Reverse Order):");
        for (EmployeeReverse employee : employees) {
            System.out.println(employee);
        }
    }
}
