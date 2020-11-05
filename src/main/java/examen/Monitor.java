package examen;

import java.util.Map;

public interface Monitor {
    void update (Object object);
    void displayData ();
    Map<String, Double> getCurrentData ();
}
