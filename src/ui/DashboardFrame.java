package ui;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import analytics.AnalyticsService;
import chart.CGPAChart;
import chart.DepartmentChart;
import chart.GenderChart;
import chart.PlacementChart;
import model.Student;
import util.DataLoader;

public class DashboardFrame extends JFrame {

    public DashboardFrame() {

        ArrayList<Student> students =
                DataLoader.loadStudents();

        setTitle("Student Analytics Dashboard");
        setSize(850,550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(null);

        JLabel title = new JLabel("Student Analytics Dashboard");
        title.setFont(new Font("Segoe UI", Font.BOLD, 30));
        title.setBounds(180, 20, 450, 40);

        JLabel total = new JLabel(
                "Total Students : "
                + AnalyticsService.totalStudents(students)
        );
        total.setBounds(50, 100, 300, 30);

        JLabel gender = new JLabel(
                "Male : "
                + AnalyticsService.maleCount(students)
                + "    Female : "
                + AnalyticsService.femaleCount(students)
        );
        gender.setBounds(50, 150, 300, 30);

        JLabel placement = new JLabel(
                "Placed : "
                + AnalyticsService.placedCount(students)
                + "    Not Placed : "
                + AnalyticsService.notPlacedCount(students)
        );
        placement.setBounds(50, 200, 350, 30);

        JLabel cgpa = new JLabel(
                String.format(
                        "Average CGPA : %.2f",
                        AnalyticsService.averageCGPA(students)
                )
        );
        cgpa.setBounds(50, 250, 250, 30);

        Font labelFont =
                new Font("Segoe UI", Font.BOLD, 16);

        total.setFont(labelFont);
        gender.setFont(labelFont);
        placement.setFont(labelFont);
        cgpa.setFont(labelFont);

        JButton viewBtn =
                new JButton("View Students");
        viewBtn.setBounds(550, 80, 220, 40);

        JButton deptBtn =
                new JButton("Department Analysis");
        deptBtn.setBounds(550, 140, 220, 40);

        JButton genderBtn =
                new JButton("Gender Analysis");
        genderBtn.setBounds(550, 200, 220, 40);

        JButton placementBtn =
                new JButton("Placement Analysis");
        placementBtn.setBounds(550, 260, 220, 40);

        JButton cgpaBtn =
                new JButton("CGPA Analysis");
        cgpaBtn.setBounds(550, 320, 220, 40);

        JButton exitBtn =
                new JButton("Exit");
        exitBtn.setBounds(550, 380, 220, 40);

        viewBtn.addActionListener(e ->
                new StudentTableFrame());

        deptBtn.addActionListener(e ->
                new DepartmentChart());

        genderBtn.addActionListener(e ->
                new GenderChart());

        placementBtn.addActionListener(e ->
                new PlacementChart());

        cgpaBtn.addActionListener(e ->
                new CGPAChart());

        exitBtn.addActionListener(e ->
                System.exit(0));

        panel.add(title);
        panel.add(total);
        panel.add(gender);
        panel.add(placement);
        panel.add(cgpa);

        panel.add(viewBtn);
        panel.add(deptBtn);
        panel.add(genderBtn);
        panel.add(placementBtn);
        panel.add(cgpaBtn);
        panel.add(exitBtn);

        add(panel);

        setVisible(true);
    }
}