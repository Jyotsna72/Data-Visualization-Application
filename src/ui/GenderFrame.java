package ui;

import javax.swing.*;
import java.awt.*;

public class GenderFrame extends JFrame {

    public GenderFrame() {

        setTitle("Gender Analysis");
        setSize(400,300);
        setLocationRelativeTo(null);

        JTextArea area = new JTextArea();

        area.setFont(new Font("Monospaced", Font.PLAIN, 14));

        area.setText(
                "Gender Statistics\n\n" +
                "Male   : 495\n" +
                "Female : 505"
        );

        add(area);

        setVisible(true);
    }
}