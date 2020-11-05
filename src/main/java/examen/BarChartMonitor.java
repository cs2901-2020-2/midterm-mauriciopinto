package examen;

public class BarChartMonitor extends Monitor {
    private BarChart chart;
    public BarChartMonitor () {}

    @Override
    public void displayData() {
        chart = new BarChart("data", "data", data);
        chart.setSize(560, 367);
        chart.setVisible(true);
    }
}
