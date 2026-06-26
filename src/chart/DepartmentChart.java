package chart;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.labels.StandardCategoryItemLabelGenerator;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

public class DepartmentChart extends JFrame {

    public DepartmentChart() {

        setTitle("Department Analysis");

        DefaultCategoryDataset dataset =
                new DefaultCategoryDataset();

        dataset.setValue(147, "Students", "CSE");
        dataset.setValue(160, "Students", "ECE");
        dataset.setValue(139, "Students", "EEE");
        dataset.setValue(143, "Students", "IT");
        dataset.setValue(138, "Students", "MCA");
        dataset.setValue(129, "Students", "MECH");
        dataset.setValue(144, "Students", "CIVIL");

        JFreeChart chart =
                ChartFactory.createBarChart(
                        "Department Wise Students",
                        "Department",
                        "Number of Students",
                        dataset
                );

        chart.setBackgroundPaint(Color.WHITE);

        chart.getTitle().setFont(
                new Font("Segoe UI", Font.BOLD, 24)
        );

        CategoryPlot plot = chart.getCategoryPlot();

        plot.setBackgroundPaint(Color.WHITE);

        plot.setRangeGridlinePaint(Color.LIGHT_GRAY);

        plot.getDomainAxis().setLabelFont(
                new Font("Segoe UI", Font.BOLD, 16)
        );

        plot.getRangeAxis().setLabelFont(
                new Font("Segoe UI", Font.BOLD, 16)
        );

        plot.getDomainAxis().setTickLabelFont(
                new Font("Segoe UI", Font.PLAIN, 14)
        );

        plot.getRangeAxis().setTickLabelFont(
                new Font("Segoe UI", Font.PLAIN, 13)
        );

        BarRenderer renderer =
                (BarRenderer) plot.getRenderer();

        renderer.setSeriesPaint(
                0,
                new Color(41, 128, 185)
        );

        renderer.setDefaultItemLabelGenerator(
                new StandardCategoryItemLabelGenerator()
        );

        renderer.setDefaultItemLabelsVisible(true);

        ChartPanel panel = new ChartPanel(chart);

        setContentPane(panel);

        setSize(900, 600);

        setLocationRelativeTo(null);

        setVisible(true);
    }
}