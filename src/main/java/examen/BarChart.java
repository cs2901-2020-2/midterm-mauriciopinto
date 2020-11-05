package examen;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.ui.ApplicationFrame;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import java.util.Map;

public class BarChart extends ApplicationFrame {
    public BarChart( String applicationTitle , String chartTitle, Map<String, Double> data ) {
        super( applicationTitle );
        JFreeChart barChart = ChartFactory.createBarChart(
                chartTitle,
                "Category",
                "Score",
                createDataset(data),
                PlotOrientation.VERTICAL,
                true, true, false);

        ChartPanel chartPanel = new ChartPanel( barChart );
        chartPanel.setPreferredSize(new java.awt.Dimension( 560 , 367 ) );
        setContentPane( chartPanel );
    }

    private CategoryDataset createDataset(Map<String, Double> data) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (Map.Entry<String, Double> entry : data.entrySet())
        dataset.addValue(entry.getValue() , entry.getKey() , "value" );
        return dataset;
    }
}
