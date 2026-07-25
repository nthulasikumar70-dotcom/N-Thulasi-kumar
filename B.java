import java.util.*;
import java.util.stream.*;

class Employee {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String toString() {
        return id + " " + name + " " + department + " " + salary;
    }
}

public class EmployeeAnalytics {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee(101, "Thulasi", "CSE", 60000),
            new Employee(102, "Rahul", "ECE", 45000),
            new Employee(103, "Priya", "CSE", 70000),
            new Employee(104, "Arun", "EEE", 40000),
            new Employee(105, "Kumar", "ECE", 55000)
        );

        // 1. Filter employees with salary greater than 50000
        System.out.println("Employees with salary > 50000:");

        employees.stream()
            .filter(e -> e.salary > 50000)
            .forEach(System.out::println);

        // 2. Sort employees by salary
        System.out.println("\nEmployees sorted by salary:");

        employees.stream()
            .sorted((e1, e2) -> Double.compare(e1.salary, e2.salary))
            .forEach(System.out::println);

        // 3. Group employees by department
        System.out.println("\nEmployees grouped by department:");

        Map<String, List<Employee>> groups =
            employees.stream()
            .collect(Collectors.groupingBy(e -> e.department));

        groups.forEach((dept, list) -> {
            System.out.println(dept + " : " + list);
        });

        // 4. Calculate average salary
        double average =
            employees.stream()
            .mapToDouble(e -> e.salary)
            .average()
            .orElse(0);

        System.out.println("\nAverage Salary = " + average);

        // 5. Find highest salary
        Employee highest =
            employees.stream()
            .max((e1, e2) -> Double.compare(e1.salary, e2.salary))
            .orElse(null);

        System.out.println("Highest Salary Employee = " + highest);
    }
}
