import java.io.*;
import java.util.*;

public class StudentMarks {

    static String file = "students.txt";

    // Store student marks
    static void addStudent() throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        FileWriter fw = new FileWriter(file, true);
        fw.write(id + "," + name + "," + marks + "\n");
        fw.close();

        System.out.println("Student details saved successfully.");
    }

    // Retrieve student marks
    static void viewStudents() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));

        String line;
        System.out.println("\nStudent Details:");

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }

    // Update student marks
    static void updateMarks() throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student ID to update: ");
        String id = sc.nextLine();

        System.out.print("Enter New Marks: ");
        int newMarks = sc.nextInt();

        File inputFile = new File(file);
        File tempFile = new File("temp.txt");

        BufferedReader br = new BufferedReader(new FileReader(inputFile));
        FileWriter fw = new FileWriter(tempFile);

        String line;

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");

            if (data[0].equals(id)) {
                fw.write(data[0] + "," + data[1] + "," + newMarks + "\n");
            } else {
                fw.write(line + "\n");
            }
        }

        br.close();
        fw.close();

        inputFile.delete();
        tempFile.renameTo(inputFile);

        System.out.println("Marks updated successfully.");
    }

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Marks");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    updateMarks();
                    break;

                case 4:
                    System.out.println("Program ended.");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
