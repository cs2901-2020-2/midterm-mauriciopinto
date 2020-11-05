package examen;

public class BarChartMonitor extends Monitor {
    private BarChart chart;
    public BarChartMonitor () {}

    @Override
    public void displayData() {
        chart = new BarChart()
        chart.setSize(560, 367);
        chart.setVisible(true);
    }
}
