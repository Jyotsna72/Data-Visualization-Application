package ui;

import javax.swing.*;
import java.awt.*;

public class PlacementFrame extends JFrame {

    public PlacementFrame() {

        setTitle("Placement Analysis");
        setSize(400,300);
        setLocationRelativeTo(null);

        JTextArea area = new JTextArea();

        area.setFont(new Font("Monospaced", Font.PLAIN, 14));

        area.setText(
                "Placement Statistics\n\n" +
                "Placed      : 568\n" +
                "Not Placed  : 432"
        );

        add(area);

        setVisible(true);
    }
}