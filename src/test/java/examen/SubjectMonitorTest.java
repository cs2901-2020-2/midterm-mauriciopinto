package examen;

import jdk.internal.loader.AbstractClassLoaderValue;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class SubjectMonitorTest {

    @Test
    public void addMonitorTest () {
        Subject testSubject = new Subject();
        Monitor testMonitor1 = new BarChartMonitor();
        Monitor testMonitor2 = new PieChartMonitor();

        Assert.assertEquals(1, testSubject.addMonitor(testMonitor1));
        Assert.assertEquals(2, testSubject.addMonitor(testMonitor2));
    }
}
