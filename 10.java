import java.util.*;

public class StudentRecord {

    static ArrayList<Student> list = new ArrayList<>();
    static HashMap<Integer, Student> map = new HashMap<>();

    // Add Student
    static void addStudent(int roll, String name, String course) {
        Student s = new Student(roll, name, course);

        list.add(s);
        map.put(roll, s);

        System.out.println("Student added successfully.");
    }

    // Search Student
    static void searchStudent(int roll) {
        Student s = map.get(roll);

        if (s != null)
            System.out.println(s);
        else
            System.out.println("Student not found.");
    }

    // Update Student
    static void updateStudent(int roll, String name, String course) {
        Student s = map.get(roll);

        if (s != null) {
            s.name = name;
            s.course = course;
            System.out.println("Student updated successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    // Delete Student
    static void deleteStudent(int roll) {
        Student s = map.remove(roll);

        if (s != null) {
            list.remove(s);
            System.out.println("Student deleted successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    // Display Students
    static void displayStudents() {
        for (Student s : list) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {

        addStudent(101, "Thulasi", "CSE");
        addStudent(102, "Rahul", "ECE");

        System.out.println("\nStudent Records:");
        displayStudents();

        System.out.println("\nSearch Student:");
        searchStudent(101);

        System.out.println("\nUpdate Student:");
        updateStudent(101, "Thulasi Kumar", "CSE");
        searchStudent(101);

        System.out.println("\nDelete Student:");
        deleteStudent(102);

        System.out.println("\nFinal Student Records:");
        displayStudents();
    }
}

class Student {

    int roll;
    String name;
    String course;

    Student(int roll, String name, String course) {
        this.roll = roll;
        this.name = name;
        this.course = course;
    }

    public String toString() {
        return "Roll No: " + roll +
               ", Name: " + name +
               ", Course: " + course;
    }
}
