package ui;

import model.Student;
import util.DataLoader;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class StudentTableFrame extends JFrame {

    public StudentTableFrame() {

        setTitle("Student Records");
        setSize(900,500);
        setLocationRelativeTo(null);

        ArrayList<Student> students =
                DataLoader.loadStudents();

        String[] columns = {
                "ID",
                "Name",
                "Department",
                "CGPA",
                "Gender",
                "Placed"
        };

        DefaultTableModel model =
                new DefaultTableModel(columns,0);

        for(Student s : students) {

            Object[] row = {
                    s.getId(),
                    s.getName(),
                    s.getDepartment(),
                    s.getCgpa(),
                    s.getGender(),
                    s.getPlaced()
            };

            model.addRow(row);
        }

        JTable table = new JTable(model);

        JScrollPane scrollPane =
                new JScrollPane(table);

        add(scrollPane);

        setVisible(true);
    }
}