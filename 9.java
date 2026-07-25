import java.sql.*;
import java.util.Scanner;

public class StudentDB {

    static final String URL = "jdbc:mysql://localhost:3306/studentdb";
    static final String USER = "root";
    static final String PASSWORD = "root";

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

        while (true) {

            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                // CREATE
                System.out.print("Enter Roll No: ");
                int roll = sc.nextInt();

                System.out.print("Enter Name: ");
                String name = sc.next();

                System.out.print("Enter Course: ");
                String course = sc.next();

                String sql = "INSERT INTO student VALUES (?, ?, ?)";

                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, roll);
                ps.setString(2, name);
                ps.setString(3, course);

                ps.executeUpdate();

                System.out.println("Student added successfully.");
            }

            else if (choice == 2) {
                // READ
                Statement st = con.createStatement();

                ResultSet rs = st.executeQuery(
                    "SELECT * FROM student"
                );

                while (rs.next()) {
                    System.out.println(
                        rs.getInt("roll_no") + " " +
                        rs.getString("name") + " " +
                        rs.getString("course")
                    );
                }
            }

            else if (choice == 3) {
                // UPDATE
                System.out.print("Enter Roll No: ");
                int roll = sc.nextInt();

                System.out.print("Enter New Course: ");
                String course = sc.next();

                String sql =
                    "UPDATE student SET course=? WHERE roll_no=?";

                PreparedStatement ps = con.prepareStatement(sql);

                ps.setString(1, course);
                ps.setInt(2, roll);

                ps.executeUpdate();

                System.out.println("Student updated successfully.");
            }

            else if (choice == 4) {
                // DELETE
                System.out.print("Enter Roll No: ");
                int roll = sc.nextInt();

                String sql =
                    "DELETE FROM student WHERE roll_no=?";

                PreparedStatement ps = con.prepareStatement(sql);

                ps.setInt(1, roll);

                ps.executeUpdate();

                System.out.println("Student deleted successfully.");
            }

            else if (choice == 5) {
                con.close();
                System.out.println("Program ended.");
                break;
            }

            else {
                System.out.println("Invalid choice.");
            }
        }
    }
}
