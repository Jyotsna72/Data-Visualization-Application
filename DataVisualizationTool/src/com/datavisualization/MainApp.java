  package com.datavisualization;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.ChartMouseEvent;
import org.jfree.chart.ChartMouseListener;

import javax.swing.JFrame;
import java.io.File;
import java.io.IOException;

public class MainApp {
    public static void main(String[] args) {
       
        JFrame frame = new JFrame("Data Visualization Tool");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ChartPanel chartPanel = createChartPanel(); // Create chart panel with interactivity
        frame.add(chartPanel);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

       
        try {
            File chartFile = new File("chart.png");
            JFreeChart chart = chartPanel.getChart(); // Get the chart from the panel
            ChartUtilities.saveChartAsPNG(chartFile, chart, 800, 600);
            System.out.println("Chart exported to " + chartFile.getAbsolutePath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static ChartPanel createChartPanel() {
        String chartTitle = "Sample Chart";
        String categoryAxisLabel = "Category";
        String valueAxisLabel = "Value";

      
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.addValue(1, "Series1", "Category1");
        dataset.addValue(4, "Series1", "Category2");
        dataset.addValue(3, "Series1", "Category3");

        
        JFreeChart chart = ChartFactory.createBarChart(
            chartTitle,
            categoryAxisLabel,
            valueAxisLabel,
            dataset,
            PlotOrientation.VERTICAL,
            true, 
            true, 
            false         );

       
        chart.getCategoryPlot().setDomainGridlinesVisible(true);
        chart.getCategoryPlot().setRangeGridlinesVisible(true);

       
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setMouseWheelEnabled(true); 
        chartPanel.setPreferredSize(new java.awt.Dimension(800, 600));
        
       
        chartPanel.addChartMouseListener(new ChartMouseListener() {
            @Override
            public void chartMouseClicked(ChartMouseEvent e) {
               
            }

            @Override
            public void chartMouseMoved(ChartMouseEvent e) {
               
            }
        });

        return chartPanel;
    }
}
