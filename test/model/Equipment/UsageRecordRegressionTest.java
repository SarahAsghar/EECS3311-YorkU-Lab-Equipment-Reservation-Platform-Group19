package model.Equipment;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class  UsageRecordRegressionTest {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Equipment.UsageRecord usageRecord5 = new model.Equipment.UsageRecord("hi!", "", localDateTime2, localDateTime3, "hi!");
        java.lang.Class<?> wildcardClass6 = usageRecord5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Equipment.UsageRecord usageRecord5 = new model.Equipment.UsageRecord("hi!", "", localDateTime2, localDateTime3, "hi!");
        usageRecord5.setRecordId("hi!");
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        java.time.LocalDateTime localDateTime2 = null;
        java.time.LocalDateTime localDateTime3 = null;
        model.Equipment.UsageRecord usageRecord5 = new model.Equipment.UsageRecord("hi!", "", localDateTime2, localDateTime3, "hi!");
        java.lang.String str6 = usageRecord5.getStatusUpdate();
        java.lang.String str7 = usageRecord5.toString();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "UsageRecord{recordId='hi!', equipmentId='', startUsage=null, endUsage=null, statusUpdate='hi!'}" + "'", str7.equals("UsageRecord{recordId='hi!', equipmentId='', startUsage=null, endUsage=null, statusUpdate='hi!'}"));
    }
}

