package examen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Subject {
    private List<Monitor> monitors;
    private Map<String, Double> data;

    public Subject () {
        monitors = new ArrayList<>();
        data = new HashMap<>();
    }

    public int addMonitor (Monitor newMonitor) {
        monitors.add(newMonitor);
        return monitors.size();
    }

    public int removeMonitor (Monitor removingMonitor) {
        monitors.remove(removingMonitor);
        return monitors.size();
    }

    public void setValue (String key, Double value) {
        data.put(key, value);
        notifyMonitors ();
    }

    public List<Monitor> getMonitors () {
        return monitors;
    }

    private void notifyMonitors () {
        for (Monitor iterMonitors : monitors)
            iterMonitors.update(data);
    }

    public Map<String, Double> getData () {return data;}
}
