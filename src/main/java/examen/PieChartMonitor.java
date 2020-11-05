package examen;

public class PieChartMonitor extends Monitor {
    public PieChartMonitor () {};
    private PieChart chart = new PieChart("Data");

    @Override
    public void displayData() {
        chart.setSize(560, 367);
        chart.setVisible(true);
    }
}
