package examen;

import java.util.HashMap;
import java.util.Map;

public class PieChartMonitor implements Monitor{
    Map<String, Double> data;

    public PieChartMonitor () {
        this.data = new HashMap<String, Double>();
    }

    @Override
    public void update(Object object) {
        this.data = (HashMap<String, Double>) object;
    }

    @Override
    public void displayData() {

    }

    @Override
    public Map<String, Double> getCurrentData() {
        return data;
    }
}
