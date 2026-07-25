import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StudentRegistration extends JFrame implements ActionListener {

    JTextField name, rollNo;
    JComboBox<String> course;
    JButton submit;

    StudentRegistration() {

        setTitle("Student Registration Form");
        setSize(400, 300);
        setLayout(new FlowLayout());

        JLabel l1 = new JLabel("Name:");
        name = new JTextField(20);

        JLabel l2 = new JLabel("Roll Number:");
        rollNo = new JTextField(20);

        JLabel l3 = new JLabel("Course:");

        String courses[] = {"CSE", "ECE", "EEE", "MECH", "CIVIL"};
        course = new JComboBox<>(courses);

        submit = new JButton("Register");

        add(l1);
        add(name);

        add(l2);
        add(rollNo);

        add(l3);
        add(course);

        add(submit);

        submit.addActionListener(this);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {

        String n = name.getText();
        String r = rollNo.getText();
        String c = (String) course.getSelectedItem();

        JOptionPane.showMessageDialog(this,
                "Registration Successful!\n" +
                "Name: " + n + "\n" +
                "Roll Number: " + r + "\n" +
                "Course: " + c);
    }

    public static void main(String[] args) {
        new StudentRegistration();
    }
}
