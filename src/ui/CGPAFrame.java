package ui;

import javax.swing.*;
import java.awt.*;

public class CGPAFrame extends JFrame {

    public CGPAFrame() {

        setTitle("CGPA Analysis");
        setSize(400,300);
        setLocationRelativeTo(null);

        JTextArea area = new JTextArea();

        area.setFont(new Font("Monospaced", Font.PLAIN, 14));

        area.setText(
                "Average CGPA : 7.91\n\n" +
                "CGPA Range\n\n" +
                "0-6  : 85\n" +
                "6-7  : 210\n" +
                "7-8  : 320\n" +
                "8-9  : 275\n" +
                "9-10 : 110"
        );

        add(area);

        setVisible(true);
    }
}