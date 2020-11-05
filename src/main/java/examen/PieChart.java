package examen;

import javafx.util.Pair;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.ui.ApplicationFrame;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

import javax.swing.*;
import java.util.Map;

public class PieChart extends ApplicationFrame {
    public PieChart(String title) {
        super(title);
    }

    public static PieDataset createDataset (Map<String, Double> data) {
        DefaultPieDataset dataset = new DefaultPieDataset();
        for (Map.Entry<String, Double> entry : data.entrySet()) {
            dataset.setValue(entry.getKey(), entry.getValue());
        }
        return dataset;
    }
    private static JFreeChart createChart(PieDataset dataset ) {
        JFreeChart chart = ChartFactory.createPieChart(
                "Data",   // chart title
                dataset,          // data
                true,             // include legend
                true,
                false);

        return chart;
    }

    public static JPanel createDemoPanel(Map<String, Double> data) {
        JFreeChart chart = createChart(createDataset(data));
        return new ChartPanel(chart);
    }
}
