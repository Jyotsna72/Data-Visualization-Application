package ui;

import javax.swing.*;
import java.awt.*;

public class DepartmentFrame extends JFrame {

    public DepartmentFrame() {

        setTitle("Department Analysis");
        setSize(500,400);
        setLocationRelativeTo(null);

        JTextArea area = new JTextArea();

        area.setFont(new Font("Monospaced", Font.PLAIN, 14));

        area.setText(
                "Department Statistics\n\n" +
                "CSE   : 147\n" +
                "ECE   : 160\n" +
                "EEE   : 139\n" +
                "IT    : 143\n" +
                "MCA   : 138\n" +
                "MECH  : 129\n" +
                "CIVIL : 144\n"
        );

        add(new JScrollPane(area));

        setVisible(true);
    }
}