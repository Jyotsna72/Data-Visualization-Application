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

public class CGPAChart extends JFrame {

    public CGPAChart() {

        setTitle("CGPA Analysis");

        DefaultCategoryDataset dataset =
                new DefaultCategoryDataset();

        dataset.setValue(85, "Students", "0-6");
        dataset.setValue(210, "Students", "6-7");
        dataset.setValue(320, "Students", "7-8");
        dataset.setValue(275, "Students", "8-9");
        dataset.setValue(110, "Students", "9-10");

        JFreeChart chart =
                ChartFactory.createBarChart(
                        "CGPA Distribution",
                        "CGPA Range",
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

        BarRenderer renderer =
                (BarRenderer) plot.getRenderer();

        renderer.setSeriesPaint(
                0,
                new Color(46, 204, 113)
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