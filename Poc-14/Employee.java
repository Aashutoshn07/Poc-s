import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee implements Comparable<Employee> {
    private int empId;
    private String firstName;
    private String lastName;
    private double salary;
    private int exp;

    public Employee(int empId, String firstName, String lastName, double salary, int exp) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.exp = exp;
    }

    public int getEmpId() {
        return empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public int getExp() {
        return exp;
    }

    @Override
    public int compareTo(Employee others) {
        int firstNameComparison = this.firstName.compareTo(others.firstName);
        if (firstNameComparison != 0) {
            return firstNameComparison;
        }
        int salaryComparision = Double.compare(this.salary, others.salary);
        if (salaryComparision != 0) {
            return salaryComparision;
        }
        return Integer.compare(this.exp, others.exp);
    }

    @Override
    public String toString() {
        return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
                + ", exp=" + exp + "]";
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(102, "Jane", "Smith", 60000, 4));
        employees.add(new Employee(103, "John", "Smith", 55000, 6));
        employees.add(new Employee(101, "Aashutosh", "Naik", 50000, 5));

        Collections.sort(employees);

        for (Employee employee : employees) {
            System.out.println(employee);
        }
        employees.sort(Comparator.comparing(Employee::getFirstName));

        System.out.println("\nSorted by Employee ID");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}