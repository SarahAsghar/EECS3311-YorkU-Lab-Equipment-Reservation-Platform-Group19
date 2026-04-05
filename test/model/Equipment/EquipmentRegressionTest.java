package model.Equipment;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EquipmentRegressionTest {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        model.Equipment.Equipment equipment0 = new model.Equipment.Equipment();
        equipment0.setName("hi!");
        equipment0.setDescription("hi!");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        model.Equipment.Equipment equipment0 = new model.Equipment.Equipment();
        java.lang.String str1 = equipment0.getEquipmentId();
        java.lang.String str2 = equipment0.getDescription();
        boolean boolean3 = equipment0.isAvailable();
        model.Equipment.EquipmentStatus equipmentStatus4 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment0.setStatus(equipmentStatus4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Equipment status cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        model.Equipment.Equipment equipment0 = new model.Equipment.Equipment();
        equipment0.setName("hi!");
        model.Equipment.EquipmentStatus equipmentStatus3 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment0.setStatus(equipmentStatus3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Equipment status cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        model.Equipment.EquipmentStatus equipmentStatus5 = null;
        model.Equipment.Equipment equipment7 = new model.Equipment.Equipment("hi!", "hi!", "", "hi!", 10.0d, equipmentStatus5, false);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        model.Equipment.Equipment equipment0 = new model.Equipment.Equipment();
        java.lang.String str1 = equipment0.getEquipmentId();
        java.lang.String str2 = equipment0.getDescription();
        boolean boolean3 = equipment0.isAvailable();
        equipment0.markReserved();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        model.Equipment.Equipment equipment0 = new model.Equipment.Equipment();
        java.lang.String str1 = equipment0.getDescription();
        java.lang.Class<?> wildcardClass2 = equipment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        model.Equipment.Equipment equipment0 = new model.Equipment.Equipment();
        equipment0.setName("hi!");
        java.lang.String str3 = equipment0.getDescription();
        java.lang.Class<?> wildcardClass4 = equipment0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        model.Equipment.Equipment equipment0 = new model.Equipment.Equipment();
        equipment0.setName("hi!");
        java.lang.String str3 = equipment0.getDescription();
        equipment0.setEquipmentId("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        model.Equipment.Equipment equipment0 = new model.Equipment.Equipment();
        java.lang.String str1 = equipment0.getEquipmentId();
        java.lang.String str2 = equipment0.getDescription();
        java.lang.String str3 = equipment0.getEquipmentId();
        model.Equipment.EquipmentStatus equipmentStatus4 = null;
        // The following exception was thrown during execution in test generation
        try {
            equipment0.setStatus(equipmentStatus4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Equipment status cannot be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        model.Equipment.Equipment equipment0 = new model.Equipment.Equipment();
        java.lang.String str1 = equipment0.getEquipmentId();
        java.lang.String str2 = equipment0.getDescription();
        equipment0.setEquipmentId("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        model.Equipment.Equipment equipment0 = new model.Equipment.Equipment();
        java.lang.String str1 = equipment0.getDescription();
        equipment0.markInUse();
        equipment0.setName("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        model.Equipment.Equipment equipment0 = new model.Equipment.Equipment();
        java.lang.String str1 = equipment0.getDescription();
        equipment0.markInUse();
        equipment0.setHourlyFee((double) 1);
        equipment0.setName("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        model.Equipment.Equipment equipment5 = new model.Equipment.Equipment("", "hi!", "", "hi!", (double) 100L);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        model.Equipment.EquipmentStatus equipmentStatus5 = null;
        model.Equipment.Equipment equipment7 = new model.Equipment.Equipment("hi!", "", "hi!", "hi!", (double) 10.0f, equipmentStatus5, false);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        model.Equipment.Equipment equipment0 = new model.Equipment.Equipment();
        equipment0.disableEquipment();
        // The following exception was thrown during execution in test generation
        try {
            equipment0.markAvailable();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Disabled equipment cannot be made available.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        model.Equipment.Equipment equipment0 = new model.Equipment.Equipment();
        equipment0.disableEquipment();
        boolean boolean2 = equipment0.isAvailable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        model.Equipment.Equipment equipment0 = new model.Equipment.Equipment();
        java.lang.String str1 = equipment0.getEquipmentId();
        java.lang.String str2 = equipment0.getLabLocation();
        boolean boolean3 = equipment0.isReservable();
        equipment0.markInUse();
        equipment0.setLabLocation("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        model.Equipment.Equipment equipment0 = new model.Equipment.Equipment();
        java.lang.String str1 = equipment0.getDescription();
        equipment0.markInUse();
        equipment0.setHourlyFee((double) 1);
        java.lang.String str5 = equipment0.getLabLocation();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        model.Equipment.Equipment equipment0 = new model.Equipment.Equipment();
        java.lang.String str1 = equipment0.getEquipmentId();
        java.lang.String str2 = equipment0.getDescription();
        java.lang.String str3 = equipment0.getEquipmentId();
        equipment0.markUnderMaintenance();
        java.lang.String str5 = equipment0.getDescription();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        model.Equipment.Equipment equipment0 = new model.Equipment.Equipment();
        java.lang.String str1 = equipment0.getEquipmentId();
        java.lang.String str2 = equipment0.getLabLocation();
        boolean boolean3 = equipment0.isReservable();
        equipment0.markInUse();
        java.lang.String str5 = equipment0.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test21");
        model.Equipment.Equipment equipment0 = new model.Equipment.Equipment();
        java.lang.String str1 = equipment0.getEquipmentId();
        equipment0.markInUse();
        equipment0.setDescription("hi!");
        equipment0.setEnabled(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test22");
        model.Equipment.EquipmentStatus equipmentStatus5 = null;
        model.Equipment.Equipment equipment7 = new model.Equipment.Equipment("", "hi!", "", "hi!", (double) 'a', equipmentStatus5, true);
        boolean boolean8 = equipment7.isAvailable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test23");
        model.Equipment.Equipment equipment0 = new model.Equipment.Equipment();
        java.lang.String str1 = equipment0.getDescription();
        equipment0.markInUse();
        java.lang.String str3 = equipment0.getEquipmentId();
        model.Equipment.Equipment equipment4 = new model.Equipment.Equipment();
        equipment4.setName("hi!");
        java.lang.String str7 = equipment4.getDescription();
        model.Equipment.Equipment equipment8 = new model.Equipment.Equipment();
        java.lang.String str9 = equipment8.getEquipmentId();
        model.Equipment.EquipmentStatus equipmentStatus10 = equipment8.getStatus();
        equipment4.setStatus(equipmentStatus10);
        equipment0.setStatus(equipmentStatus10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + equipmentStatus10 + "' != '" + model.Equipment.EquipmentStatus.AVAILABLE + "'", equipmentStatus10.equals(model.Equipment.EquipmentStatus.AVAILABLE));
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test24");
        model.Equipment.EquipmentStatus equipmentStatus5 = null;
        model.Equipment.Equipment equipment7 = new model.Equipment.Equipment("", "hi!", "", "hi!", (double) 'a', equipmentStatus5, true);
        equipment7.enableEquipment();
        boolean boolean9 = equipment7.isReservable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test25");
        model.Equipment.Equipment equipment0 = new model.Equipment.Equipment();
        java.lang.String str1 = equipment0.getDescription();
        java.lang.String str2 = equipment0.getEquipmentId();
        equipment0.setName("");
        boolean boolean5 = equipment0.isReservable();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test26");
        model.Equipment.Equipment equipment0 = new model.Equipment.Equipment();
        java.lang.String str1 = equipment0.getEquipmentId();
        java.lang.String str2 = equipment0.getLabLocation();
        boolean boolean3 = equipment0.isReservable();
        double double4 = equipment0.getHourlyFee();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(str2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }
}

