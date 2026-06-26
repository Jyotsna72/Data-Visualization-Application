package chart;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;

public class PlacementChart extends JFrame {

    public PlacementChart() {

        setTitle("Placement Analysis");

        DefaultPieDataset<String> dataset =
                new DefaultPieDataset<>();

        dataset.setValue("Placed", 568);
        dataset.setValue("Not Placed", 432);

        JFreeChart chart =
                ChartFactory.createPieChart(
                        "Placement Statistics",
                        dataset,
                        true,
                        true,
                        false
                );

        chart.getTitle().setFont(
                new Font("Segoe UI", Font.BOLD, 24)
        );

        PiePlot plot = (PiePlot) chart.getPlot();

        plot.setSectionPaint("Placed",
                new Color(46, 204, 113));

        plot.setSectionPaint("Not Placed",
                new Color(231, 76, 60));

        plot.setBackgroundPaint(Color.WHITE);

        ChartPanel panel = new ChartPanel(chart);

        setContentPane(panel);

        setSize(800, 600);

        setLocationRelativeTo(null);

        setVisible(true);
    }
}