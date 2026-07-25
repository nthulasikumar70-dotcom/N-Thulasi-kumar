import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener {

    TextField t1, t2, result;
    Button add, sub, mul, div;

    Calculator() {

        setLayout(new FlowLayout());

        t1 = new TextField(10);
        t2 = new TextField(10);
        result = new TextField(10);

        add = new Button("+");
        sub = new Button("-");
        mul = new Button("*");
        div = new Button("/");

        add(new Label("Number 1:"));
        add(t1);

        add(new Label("Number 2:"));
        add(t2);

        add(add);
        add(sub);
        add(mul);
        add(div);

        add(new Label("Result:"));
        add(result);

        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);

        setTitle("Simple Calculator");
        setSize(400, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        double a = Double.parseDouble(t1.getText());
        double b = Double.parseDouble(t2.getText());
        double c = 0;

        if (e.getSource() == add)
            c = a + b;
        else if (e.getSource() == sub)
            c = a - b;
        else if (e.getSource() == mul)
            c = a * b;
        else if (e.getSource() == div)
            c = a / b;

        result.setText(String.valueOf(c));
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
