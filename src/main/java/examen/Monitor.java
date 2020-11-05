package examen;

import java.util.HashMap;
import java.util.Map;

public class Monitor {
    Map<String, Double> data = new HashMap<>();

    void update (Object object) {
        this.data = (HashMap<String, Double>) object;
    };
    void displayData() {};
    Map<String, Double> getCurrentData () {
        return data;
    };
}
