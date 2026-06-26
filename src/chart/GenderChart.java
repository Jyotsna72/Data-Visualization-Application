package chart;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

public class GenderChart extends JFrame {

    public GenderChart() {

        setTitle("Gender Analysis");

        DefaultPieDataset<String> dataset =
                new DefaultPieDataset<>();

        dataset.setValue("Male", 495);
        dataset.setValue("Female", 505);

        JFreeChart chart =
                ChartFactory.createPieChart(
                        "Gender Distribution",
                        dataset,
                        true,
                        true,
                        false
                );

        chart.getTitle().setFont(
                new Font("Segoe UI", Font.BOLD, 24)
        );

        PiePlot plot = (PiePlot) chart.getPlot();

        plot.setSectionPaint("Male",
                new Color(52, 152, 219));

        plot.setSectionPaint("Female",
                new Color(231, 76, 60));

        plot.setBackgroundPaint(Color.WHITE);

        ChartPanel panel = new ChartPanel(chart);

        setContentPane(panel);

        setSize(800, 600);

        setLocationRelativeTo(null);

        setVisible(true);
    }
}