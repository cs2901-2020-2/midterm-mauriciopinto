package examen;

import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class SubjectMonitorTest {

    @Test
    public void addMonitorTest () {
        Subject testSubject = new Subject();
        Monitor testMonitor1 = new BarChartMonitor();
        Monitor testMonitor2 = new PieChartMonitor();

        Assert.assertEquals(testSubject.addMonitor(testMonitor1), 1);
        Assert.assertEquals(testSubject.addMonitor(testMonitor2), 2);

        Assert.assertFalse(testSubject.getMonitors().isEmpty());
    }

    @Test
    public void updateDataTest () {
        Subject testSubject = new Subject();
        Monitor testMonitor1 = new BarChartMonitor();
        Monitor testMonitor2 = new PieChartMonitor();

        testSubject.addMonitor(testMonitor1);
        testSubject.addMonitor(testMonitor2);

        testSubject.setValue("A", 1.00);
        Assert.assertEquals(testMonitor1.getCurrentData().get("A"), testSubject.getData().get("A"));
        Assert.assertEquals(testMonitor2.getCurrentData().get("A"), testSubject.getData().get("A"));

        testSubject.setValue("B", 3.00);
        Assert.assertEquals(testMonitor1.getCurrentData().get("B"), testSubject.getData().get("B"));
        Assert.assertEquals(testMonitor2.getCurrentData().get("B"), testSubject.getData().get("B"));
    }

    @Test
    


}
