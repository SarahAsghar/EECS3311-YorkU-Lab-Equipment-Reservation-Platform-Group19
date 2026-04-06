package model.controller;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EquipmentControllerRegressionTest {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        model.Equipment.EquipmentStatus equipmentStatus1 = null;
        boolean boolean2 = controller.EquipmentController.updateEquipmentStatus("", equipmentStatus1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        model.Equipment.EquipmentStatus equipmentStatus1 = null;
        boolean boolean2 = controller.EquipmentController.updateEquipmentStatus("hi!", equipmentStatus1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.Class<?> wildcardClass1 = equipmentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.lang.Class<?> wildcardClass7 = equipmentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment7 = equipmentController0.getEquipment("");
        java.lang.String str9 = equipmentController0.removeEquipment("");
        java.lang.String str11 = equipmentController0.markMaintenance("Equipment not found");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Equipment not found" + "'", str11.equals("Equipment not found"));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("Equipment removed successfully!");
        java.lang.Class<?> wildcardClass7 = equipmentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "DISABLED" + "'", str6.equals("DISABLED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str10 = equipmentController0.markAvailable("Equipment not found");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment not found" + "'", str8.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment not found" + "'", str10.equals("Equipment not found"));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        model.Equipment.EquipmentStatus equipmentStatus1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = controller.EquipmentController.updateEquipmentStatus("Equipment added successfully!", equipmentStatus1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Equipment.EquipmentStatus.ordinal()\" because \"newStatus\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("hi!");
        model.Equipment.Equipment equipment6 = equipmentController0.getEquipment("Equipment ID already exists");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "AVAILABLE" + "'", str2.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment6);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList7 = equipmentController0.getAllEquipment();
        java.lang.String str9 = equipmentController0.disableEquipment("hi!");
        java.lang.String str11 = equipmentController0.removeEquipment("Equipment not found");
        java.lang.Class<?> wildcardClass12 = equipmentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Equipment not found" + "'", str11.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment7 = equipmentController0.getEquipment("");
        java.lang.String str9 = equipmentController0.removeEquipment("");
        java.lang.String str11 = equipmentController0.enableEquipment("Equipment not found");
        java.lang.String str13 = equipmentController0.markAvailable("Equipment marked available");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "AVAILABLE" + "'", str2.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment enabled successfully!" + "'", str4.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment removed successfully!" + "'", str9.equals("Equipment removed successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Equipment not found" + "'", str11.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Equipment not found" + "'", str13.equals("Equipment not found"));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.disableEquipment("Equipment removed successfully!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList7 = equipmentController0.getAllEquipment();
        java.lang.Class<?> wildcardClass8 = equipmentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment disabled successfully!" + "'", str6.equals("Equipment disabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        model.Equipment.EquipmentStatus equipmentStatus1 = null;
        boolean boolean2 = controller.EquipmentController.updateEquipmentStatus("DISABLED", equipmentStatus1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("hi!");
        java.lang.String str8 = equipmentController0.markAvailable("hi!");
        java.lang.String str10 = equipmentController0.getEquipmentStatus("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment not found" + "'", str8.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment not found" + "'", str10.equals("Equipment not found"));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.disableEquipment("Equipment marked available");
        java.lang.String str8 = equipmentController0.addEquipment("DISABLED", "hi!", "Equipment disabled successfully!", "", (double) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment added successfully!" + "'", str8.equals("Equipment added successfully!"));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        model.Equipment.EquipmentStatus equipmentStatus1 = null;
        boolean boolean2 = controller.EquipmentController.updateEquipmentStatus("Equipment ID already exists", equipmentStatus1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.removeEquipment("hi!");
        java.lang.String str4 = equipmentController0.markAvailable("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.disableEquipment("Equipment marked available");
        java.lang.String str4 = equipmentController0.markAvailable("Equipment marked available");
        java.lang.String str6 = equipmentController0.removeEquipment("Equipment disabled successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        model.Equipment.EquipmentStatus equipmentStatus1 = null;
        boolean boolean2 = controller.EquipmentController.updateEquipmentStatus("AVAILABLE", equipmentStatus1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment7 = equipmentController0.getEquipment("");
        java.lang.String str9 = equipmentController0.removeEquipment("");
        java.lang.String str11 = equipmentController0.enableEquipment("Equipment marked available");
        java.lang.String str13 = equipmentController0.removeEquipment("AVAILABLE");
        java.lang.String str15 = equipmentController0.disableEquipment("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Equipment not found" + "'", str11.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Equipment not found" + "'", str13.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Equipment not found" + "'", str15.equals("Equipment not found"));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str10 = equipmentController0.enableEquipment("Equipment removed successfully!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList11 = equipmentController0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "AVAILABLE" + "'", str8.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment not found" + "'", str10.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList11);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("Equipment removed successfully!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment marked available");
        java.lang.Class<?> wildcardClass9 = equipmentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment not found" + "'", str8.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        model.Equipment.EquipmentStatus equipmentStatus1 = null;
        boolean boolean2 = controller.EquipmentController.updateEquipmentStatus("Equipment enabled successfully!", equipmentStatus1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str10 = equipmentController0.enableEquipment("Equipment removed successfully!");
        model.Equipment.Equipment equipment12 = equipmentController0.getEquipment("Equipment not found");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "AVAILABLE" + "'", str8.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment not found" + "'", str10.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment12);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.removeEquipment("hi!");
        java.lang.Class<?> wildcardClass3 = equipmentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList3 = equipmentController0.getAllEquipment();
        java.lang.String str5 = equipmentController0.removeEquipment("Equipment removed successfully!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList6 = equipmentController0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Equipment removed successfully!" + "'", str5.equals("Equipment removed successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList6);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList7 = equipmentController0.getAllEquipment();
        java.lang.String str9 = equipmentController0.disableEquipment("hi!");
        java.lang.String str11 = equipmentController0.removeEquipment("Equipment not found");
        java.lang.String str13 = equipmentController0.getEquipmentStatus("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Equipment not found" + "'", str11.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Equipment not found" + "'", str13.equals("Equipment not found"));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        model.Equipment.Equipment equipment10 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str12 = equipmentController0.disableEquipment("");
        java.lang.String str18 = equipmentController0.addEquipment("Equipment added successfully!", "Equipment marked available", "", "Equipment disabled successfully!", (double) (short) 10);
        model.Equipment.Equipment equipment20 = equipmentController0.getEquipment("Equipment marked available");
        java.lang.Class<?> wildcardClass21 = equipment20.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment not found" + "'", str8.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment not found" + "'", str12.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Equipment ID already exists" + "'", str18.equals("Equipment ID already exists"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.removeEquipment("hi!");
        java.lang.String str4 = equipmentController0.removeEquipment("hi!");
        java.lang.String str6 = equipmentController0.enableEquipment("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.disableEquipment("Equipment marked available");
        java.lang.String str6 = equipmentController0.enableEquipment("Equipment marked for maintenance");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment disabled successfully!" + "'", str4.equals("Equipment disabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.disableEquipment("Equipment marked available");
        java.lang.String str6 = equipmentController0.markMaintenance("Equipment marked for maintenance");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment disabled successfully!" + "'", str4.equals("Equipment disabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment7 = equipmentController0.getEquipment("");
        java.lang.String str9 = equipmentController0.removeEquipment("");
        java.lang.String str11 = equipmentController0.enableEquipment("Equipment not found");
        java.lang.String str13 = equipmentController0.removeEquipment("hi!");
        java.lang.String str15 = equipmentController0.disableEquipment("hi!");
        java.lang.String str17 = equipmentController0.enableEquipment("Equipment marked available");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Equipment not found" + "'", str11.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Equipment not found" + "'", str13.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Equipment not found" + "'", str15.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Equipment enabled successfully!" + "'", str17.equals("Equipment enabled successfully!"));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment7 = equipmentController0.getEquipment("");
        java.lang.String str9 = equipmentController0.disableEquipment("Equipment marked available");
        java.lang.String str15 = equipmentController0.addEquipment("DISABLED", "Equipment enabled successfully!", "hi!", "Equipment added successfully!", (double) 100L);
        java.lang.String str17 = equipmentController0.enableEquipment("Equipment added successfully!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList18 = equipmentController0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment disabled successfully!" + "'", str9.equals("Equipment disabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Equipment ID already exists" + "'", str15.equals("Equipment ID already exists"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Equipment enabled successfully!" + "'", str17.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList18);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str10 = equipmentController0.markAvailable("Equipment added successfully!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList11 = equipmentController0.getAllEquipment();
        java.lang.Class<?> wildcardClass12 = equipmentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment not found" + "'", str8.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment not found" + "'", str10.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        model.Equipment.EquipmentStatus equipmentStatus1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = controller.EquipmentController.updateEquipmentStatus("Equipment removed successfully!", equipmentStatus1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Equipment.EquipmentStatus.ordinal()\" because \"newStatus\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList3 = equipmentController0.getAllEquipment();
        java.lang.String str5 = equipmentController0.removeEquipment("Equipment removed successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Equipment removed successfully!" + "'", str5.equals("Equipment removed successfully!"));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        model.Equipment.EquipmentStatus equipmentStatus1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = controller.EquipmentController.updateEquipmentStatus("Equipment not found", equipmentStatus1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Equipment.EquipmentStatus.ordinal()\" because \"newStatus\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.removeEquipment("hi!");
        java.lang.String str4 = equipmentController0.markAvailable("");
        java.lang.String str6 = equipmentController0.markMaintenance("Equipment disabled successfully!");
        java.lang.Class<?> wildcardClass7 = equipmentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment marked for maintenance" + "'", str6.equals("Equipment marked for maintenance"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.removeEquipment("hi!");
        java.lang.String str4 = equipmentController0.removeEquipment("hi!");
        java.lang.String str6 = equipmentController0.disableEquipment("hi!");
        java.lang.Class<?> wildcardClass7 = equipmentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.disableEquipment("Equipment removed successfully!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList7 = equipmentController0.getAllEquipment();
        java.lang.String str9 = equipmentController0.disableEquipment("Equipment marked for maintenance");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment7 = equipmentController0.getEquipment("");
        java.lang.String str9 = equipmentController0.removeEquipment("");
        java.lang.String str11 = equipmentController0.enableEquipment("Equipment marked available");
        java.lang.String str13 = equipmentController0.removeEquipment("Equipment ID already exists");
        java.lang.Class<?> wildcardClass14 = equipmentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Equipment enabled successfully!" + "'", str11.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Equipment not found" + "'", str13.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str10 = equipmentController0.markAvailable("Equipment added successfully!");
        java.lang.String str12 = equipmentController0.markAvailable("DISABLED");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment not found" + "'", str8.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment marked available" + "'", str10.equals("Equipment marked available"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment marked available" + "'", str12.equals("Equipment marked available"));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.removeEquipment("hi!");
        java.lang.String str4 = equipmentController0.markAvailable("");
        java.lang.String str6 = equipmentController0.markMaintenance("Equipment disabled successfully!");
        java.lang.String str8 = equipmentController0.markMaintenance("AVAILABLE");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment marked for maintenance" + "'", str6.equals("Equipment marked for maintenance"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment not found" + "'", str8.equals("Equipment not found"));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("DISABLED");
        model.Equipment.Equipment equipment6 = equipmentController0.getEquipment("Equipment enabled successfully!");
        java.lang.Class<?> wildcardClass7 = equipmentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("DISABLED");
        java.lang.Class<?> wildcardClass5 = equipmentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList7 = equipmentController0.getAllEquipment();
        java.lang.String str9 = equipmentController0.disableEquipment("hi!");
        java.lang.String str11 = equipmentController0.removeEquipment("Equipment not found");
        java.lang.String str17 = equipmentController0.addEquipment("", "Equipment marked available", "Equipment not found", "Equipment disabled successfully!", (double) 10);
        model.Equipment.Equipment equipment19 = equipmentController0.getEquipment("Equipment removed successfully!");
        java.lang.Class<?> wildcardClass20 = equipmentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Equipment not found" + "'", str11.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Equipment added successfully!" + "'", str17.equals("Equipment added successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList7 = equipmentController0.getAllEquipment();
        java.lang.String str9 = equipmentController0.disableEquipment("hi!");
        java.lang.String str11 = equipmentController0.removeEquipment("Equipment not found");
        java.lang.String str13 = equipmentController0.enableEquipment("Equipment not found");
        java.lang.String str15 = equipmentController0.markMaintenance("Equipment not found");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Equipment not found" + "'", str11.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Equipment not found" + "'", str13.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Equipment not found" + "'", str15.equals("Equipment not found"));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment7 = equipmentController0.getEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList8 = equipmentController0.getAllEquipment();
        java.lang.String str10 = equipmentController0.getEquipmentStatus("AVAILABLE");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "DISABLED" + "'", str2.equals("DISABLED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment enabled successfully!" + "'", str4.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment not found" + "'", str10.equals("Equipment not found"));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.markAvailable("");
        model.Equipment.Equipment equipment8 = equipmentController0.getEquipment("");
        java.lang.String str10 = equipmentController0.disableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList11 = equipmentController0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment marked available" + "'", str6.equals("Equipment marked available"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment disabled successfully!" + "'", str10.equals("Equipment disabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList11);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.enableEquipment("hi!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        java.lang.Class<?> wildcardClass6 = equipmentList5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("Equipment removed successfully!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str10 = equipmentController0.removeEquipment("Equipment added successfully!");
        java.lang.String str12 = equipmentController0.removeEquipment("");
        java.lang.String str18 = equipmentController0.addEquipment("Equipment marked available", "Equipment enabled successfully!", "Equipment removed successfully!", "Equipment enabled successfully!", (double) (byte) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "DISABLED" + "'", str6.equals("DISABLED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "AVAILABLE" + "'", str8.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment not found" + "'", str10.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment not found" + "'", str12.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Equipment ID already exists" + "'", str18.equals("Equipment ID already exists"));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        model.Equipment.Equipment equipment6 = equipmentController0.getEquipment("AVAILABLE");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass7 = equipment6.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment6);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList7 = equipmentController0.getAllEquipment();
        java.lang.String str13 = equipmentController0.addEquipment("Equipment removed successfully!", "AVAILABLE", "Equipment not found", "", (double) (short) 10);
        java.lang.String str19 = equipmentController0.addEquipment("Equipment disabled successfully!", "Equipment added successfully!", "AVAILABLE", "Equipment disabled successfully!", (double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Equipment ID already exists" + "'", str13.equals("Equipment ID already exists"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Equipment ID already exists" + "'", str19.equals("Equipment ID already exists"));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("Equipment removed successfully!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.Class<?> wildcardClass9 = equipmentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "DISABLED" + "'", str6.equals("DISABLED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "AVAILABLE" + "'", str8.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("Equipment removed successfully!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str10 = equipmentController0.removeEquipment("Equipment added successfully!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList11 = equipmentController0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "DISABLED" + "'", str6.equals("DISABLED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "AVAILABLE" + "'", str8.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment not found" + "'", str10.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList11);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.disableEquipment("Equipment marked available");
        java.lang.String str4 = equipmentController0.enableEquipment("AVAILABLE");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment disabled successfully!" + "'", str2.equals("Equipment disabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.Class<?> wildcardClass5 = equipmentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("hi!");
        java.lang.String str6 = equipmentController0.markMaintenance("AVAILABLE");
        java.lang.String str8 = equipmentController0.markMaintenance("AVAILABLE");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment not found" + "'", str8.equals("Equipment not found"));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("Equipment removed successfully!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str10 = equipmentController0.removeEquipment("Equipment added successfully!");
        java.lang.String str12 = equipmentController0.enableEquipment("Equipment not found");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "AVAILABLE" + "'", str8.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment removed successfully!" + "'", str10.equals("Equipment removed successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment enabled successfully!" + "'", str12.equals("Equipment enabled successfully!"));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        model.Equipment.EquipmentStatus equipmentStatus1 = null;
        boolean boolean2 = controller.EquipmentController.updateEquipmentStatus("Equipment marked for maintenance", equipmentStatus1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList7 = equipmentController0.getAllEquipment();
        java.lang.String str13 = equipmentController0.addEquipment("Equipment removed successfully!", "AVAILABLE", "Equipment not found", "", (double) (short) 10);
        java.lang.String str15 = equipmentController0.removeEquipment("Equipment disabled successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Equipment added successfully!" + "'", str13.equals("Equipment added successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Equipment removed successfully!" + "'", str15.equals("Equipment removed successfully!"));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        model.Equipment.Equipment equipment10 = equipmentController0.getEquipment("Equipment not found");
        model.Equipment.Equipment equipment12 = equipmentController0.getEquipment("DISABLED");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList13 = equipmentController0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "AVAILABLE" + "'", str8.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList13);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("hi!");
        model.Equipment.Equipment equipment8 = equipmentController0.getEquipment("Equipment added successfully!");
        java.lang.String str10 = equipmentController0.markMaintenance("Equipment marked for maintenance");
        java.lang.String str12 = equipmentController0.markMaintenance("Equipment marked for maintenance");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment not found" + "'", str10.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment not found" + "'", str12.equals("Equipment not found"));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment7 = equipmentController0.getEquipment("");
        java.lang.String str9 = equipmentController0.removeEquipment("");
        model.Equipment.Equipment equipment11 = equipmentController0.getEquipment("Equipment enabled successfully!");
        java.lang.String str13 = equipmentController0.markMaintenance("Equipment ID already exists");
        java.lang.String str15 = equipmentController0.markMaintenance("DISABLED");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Equipment not found" + "'", str13.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Equipment marked for maintenance" + "'", str15.equals("Equipment marked for maintenance"));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("DISABLED");
        model.Equipment.Equipment equipment6 = equipmentController0.getEquipment("Equipment enabled successfully!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment marked available");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MAINTENANCE" + "'", str4.equals("MAINTENANCE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "MAINTENANCE" + "'", str8.equals("MAINTENANCE"));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList7 = equipmentController0.getAllEquipment();
        java.lang.String str9 = equipmentController0.disableEquipment("hi!");
        model.Equipment.Equipment equipment11 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str13 = equipmentController0.enableEquipment("Equipment disabled successfully!");
        java.lang.String str15 = equipmentController0.removeEquipment("Equipment enabled successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Equipment not found" + "'", str13.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Equipment removed successfully!" + "'", str15.equals("Equipment removed successfully!"));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.disableEquipment("Equipment removed successfully!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment marked for maintenance");
        java.lang.String str10 = equipmentController0.getEquipmentStatus("Equipment disabled successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment disabled successfully!" + "'", str6.equals("Equipment disabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment not found" + "'", str8.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment not found" + "'", str10.equals("Equipment not found"));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList7 = equipmentController0.getAllEquipment();
        java.lang.String str9 = equipmentController0.disableEquipment("hi!");
        java.lang.Class<?> wildcardClass10 = equipmentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList7 = equipmentController0.getAllEquipment();
        java.lang.String str9 = equipmentController0.disableEquipment("hi!");
        java.lang.String str11 = equipmentController0.removeEquipment("Equipment not found");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList12 = equipmentController0.getAllEquipment();
        java.lang.String str14 = equipmentController0.getEquipmentStatus("Equipment removed successfully!");
        java.lang.Class<?> wildcardClass15 = equipmentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Equipment not found" + "'", str11.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "DISABLED" + "'", str14.equals("DISABLED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("hi!");
        model.Equipment.Equipment equipment8 = equipmentController0.getEquipment("Equipment added successfully!");
        java.lang.String str14 = equipmentController0.addEquipment("DISABLED", "", "Equipment added successfully!", "MAINTENANCE", (double) 1.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Equipment ID already exists" + "'", str14.equals("Equipment ID already exists"));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.markAvailable("");
        java.lang.String str8 = equipmentController0.enableEquipment("Equipment not found");
        java.lang.String str14 = equipmentController0.addEquipment("", "AVAILABLE", "Equipment marked available", "", 10.0d);
        java.lang.String str16 = equipmentController0.disableEquipment("Equipment marked available");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment enabled successfully!" + "'", str8.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Equipment added successfully!" + "'", str14.equals("Equipment added successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Equipment disabled successfully!" + "'", str16.equals("Equipment disabled successfully!"));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("hi!");
        java.lang.String str8 = equipmentController0.removeEquipment("Equipment disabled successfully!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList9 = equipmentController0.getAllEquipment();
        java.lang.String str11 = equipmentController0.markMaintenance("Equipment enabled successfully!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList12 = equipmentController0.getAllEquipment();
        java.lang.String str18 = equipmentController0.addEquipment("Equipment disabled successfully!", "Equipment not found", "AVAILABLE", "DISABLED", (double) '4');
        java.lang.String str20 = equipmentController0.disableEquipment("Equipment marked available");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment not found" + "'", str8.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Equipment not found" + "'", str11.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Equipment added successfully!" + "'", str18.equals("Equipment added successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Equipment disabled successfully!" + "'", str20.equals("Equipment disabled successfully!"));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        model.Equipment.Equipment equipment10 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str12 = equipmentController0.removeEquipment("Equipment enabled successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "AVAILABLE" + "'", str8.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment not found" + "'", str12.equals("Equipment not found"));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList7 = equipmentController0.getAllEquipment();
        java.lang.String str9 = equipmentController0.disableEquipment("hi!");
        java.lang.String str11 = equipmentController0.removeEquipment("Equipment not found");
        java.lang.String str17 = equipmentController0.addEquipment("", "Equipment marked available", "Equipment not found", "Equipment disabled successfully!", (double) 10);
        java.lang.String str19 = equipmentController0.enableEquipment("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Equipment removed successfully!" + "'", str11.equals("Equipment removed successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Equipment ID already exists" + "'", str17.equals("Equipment ID already exists"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Equipment enabled successfully!" + "'", str19.equals("Equipment enabled successfully!"));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment7 = equipmentController0.getEquipment("");
        java.lang.String str9 = equipmentController0.removeEquipment("");
        model.Equipment.Equipment equipment11 = equipmentController0.getEquipment("Equipment enabled successfully!");
        java.lang.String str13 = equipmentController0.markMaintenance("Equipment ID already exists");
        model.Equipment.Equipment equipment15 = equipmentController0.getEquipment("AVAILABLE");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Equipment marked for maintenance" + "'", str13.equals("Equipment marked for maintenance"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment15);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment7 = equipmentController0.getEquipment("");
        java.lang.String str9 = equipmentController0.removeEquipment("");
        model.Equipment.Equipment equipment11 = equipmentController0.getEquipment("Equipment enabled successfully!");
        java.lang.String str13 = equipmentController0.markMaintenance("Equipment ID already exists");
        java.lang.String str15 = equipmentController0.removeEquipment("AVAILABLE");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Equipment marked for maintenance" + "'", str13.equals("Equipment marked for maintenance"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Equipment not found" + "'", str15.equals("Equipment not found"));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.lang.String str8 = equipmentController0.disableEquipment("Equipment added successfully!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList9 = equipmentController0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment not found" + "'", str8.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList9);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList7 = equipmentController0.getAllEquipment();
        java.lang.String str9 = equipmentController0.disableEquipment("hi!");
        java.lang.String str11 = equipmentController0.removeEquipment("Equipment not found");
        java.lang.String str17 = equipmentController0.addEquipment("", "Equipment marked available", "Equipment not found", "Equipment disabled successfully!", (double) 10);
        model.Equipment.Equipment equipment19 = equipmentController0.getEquipment("Equipment removed successfully!");
        java.lang.String str25 = equipmentController0.addEquipment("Equipment marked available", "", "", "", (double) (-1L));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Equipment not found" + "'", str11.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Equipment added successfully!" + "'", str17.equals("Equipment added successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Equipment added successfully!" + "'", str25.equals("Equipment added successfully!"));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        model.Equipment.EquipmentStatus equipmentStatus1 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = controller.EquipmentController.updateEquipmentStatus("Equipment marked available", equipmentStatus1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"model.Equipment.EquipmentStatus.ordinal()\" because \"newStatus\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.lang.String str8 = equipmentController0.disableEquipment("Equipment added successfully!");
        java.lang.String str14 = equipmentController0.addEquipment("Equipment added successfully!", "Equipment not found", "Equipment ID already exists", "MAINTENANCE", (double) ' ');
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment not found" + "'", str8.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Equipment added successfully!" + "'", str14.equals("Equipment added successfully!"));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("hi!");
        java.lang.String str6 = equipmentController0.markAvailable("Equipment disabled successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        model.Equipment.EquipmentStatus equipmentStatus1 = null;
        boolean boolean2 = controller.EquipmentController.updateEquipmentStatus("MAINTENANCE", equipmentStatus1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("Equipment removed successfully!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str10 = equipmentController0.removeEquipment("Equipment added successfully!");
        java.lang.String str12 = equipmentController0.removeEquipment("");
        java.lang.String str14 = equipmentController0.disableEquipment("Equipment ID already exists");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "DISABLED" + "'", str6.equals("DISABLED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment not found" + "'", str8.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment removed successfully!" + "'", str10.equals("Equipment removed successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment not found" + "'", str12.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Equipment disabled successfully!" + "'", str14.equals("Equipment disabled successfully!"));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("hi!");
        java.lang.String str8 = equipmentController0.removeEquipment("Equipment disabled successfully!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList9 = equipmentController0.getAllEquipment();
        java.lang.String str11 = equipmentController0.markMaintenance("Equipment enabled successfully!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList12 = equipmentController0.getAllEquipment();
        java.lang.String str14 = equipmentController0.removeEquipment("MAINTENANCE");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment not found" + "'", str8.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Equipment marked for maintenance" + "'", str11.equals("Equipment marked for maintenance"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Equipment not found" + "'", str14.equals("Equipment not found"));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment7 = equipmentController0.getEquipment("");
        java.lang.String str9 = equipmentController0.disableEquipment("Equipment marked available");
        java.lang.String str15 = equipmentController0.addEquipment("DISABLED", "Equipment enabled successfully!", "hi!", "Equipment added successfully!", (double) 100L);
        java.lang.String str17 = equipmentController0.removeEquipment("Equipment removed successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment disabled successfully!" + "'", str9.equals("Equipment disabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Equipment ID already exists" + "'", str15.equals("Equipment ID already exists"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Equipment removed successfully!" + "'", str17.equals("Equipment removed successfully!"));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = equipmentController0.markAvailable("Equipment ID already exists");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Disabled equipment cannot be made available.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.removeEquipment("hi!");
        java.lang.String str4 = equipmentController0.markAvailable("");
        java.lang.String str6 = equipmentController0.markAvailable("DISABLED");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment marked available" + "'", str4.equals("Equipment marked available"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment marked available" + "'", str6.equals("Equipment marked available"));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("hi!");
        java.lang.String str8 = equipmentController0.removeEquipment("Equipment disabled successfully!");
        java.lang.String str10 = equipmentController0.removeEquipment("Equipment marked for maintenance");
        java.lang.String str12 = equipmentController0.markMaintenance("hi!");
        java.lang.String str14 = equipmentController0.markAvailable("Equipment marked for maintenance");
        java.lang.String str16 = equipmentController0.getEquipmentStatus("Equipment disabled successfully!");
        model.Equipment.Equipment equipment18 = equipmentController0.getEquipment("MAINTENANCE");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment removed successfully!" + "'", str8.equals("Equipment removed successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment not found" + "'", str10.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment not found" + "'", str12.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Equipment not found" + "'", str14.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Equipment not found" + "'", str16.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment18);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList3 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment5 = equipmentController0.getEquipment("Equipment enabled successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "AVAILABLE" + "'", str2.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment5);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("hi!");
        java.lang.String str8 = equipmentController0.removeEquipment("Equipment disabled successfully!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList9 = equipmentController0.getAllEquipment();
        java.lang.String str15 = equipmentController0.addEquipment("Equipment disabled successfully!", "Equipment ID already exists", "", "Equipment enabled successfully!", 1.0d);
        java.lang.String str17 = equipmentController0.removeEquipment("Equipment ID already exists");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment not found" + "'", str8.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Equipment added successfully!" + "'", str15.equals("Equipment added successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Equipment not found" + "'", str17.equals("Equipment not found"));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("Equipment removed successfully!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList7 = equipmentController0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "AVAILABLE" + "'", str6.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList7);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.markAvailable("");
        java.lang.String str8 = equipmentController0.enableEquipment("Equipment not found");
        java.lang.String str10 = equipmentController0.markMaintenance("Equipment marked available");
        java.lang.String str12 = equipmentController0.removeEquipment("AVAILABLE");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment enabled successfully!" + "'", str8.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment marked for maintenance" + "'", str10.equals("Equipment marked for maintenance"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment not found" + "'", str12.equals("Equipment not found"));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.removeEquipment("hi!");
        java.lang.String str4 = equipmentController0.removeEquipment("hi!");
        java.lang.String str6 = equipmentController0.disableEquipment("hi!");
        java.lang.String str8 = equipmentController0.markAvailable("Equipment not found");
        java.lang.String str14 = equipmentController0.addEquipment("Equipment added successfully!", "Equipment marked available", "AVAILABLE", "hi!", (double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment marked available" + "'", str8.equals("Equipment marked available"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Equipment ID already exists" + "'", str14.equals("Equipment ID already exists"));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        model.Equipment.Equipment equipment10 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str12 = equipmentController0.markAvailable("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "AVAILABLE" + "'", str8.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment not found" + "'", str12.equals("Equipment not found"));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str10 = equipmentController0.markAvailable("Equipment added successfully!");
        java.lang.String str12 = equipmentController0.removeEquipment("Equipment ID already exists");
        java.lang.String str14 = equipmentController0.markAvailable("Equipment ID already exists");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "AVAILABLE" + "'", str8.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment marked available" + "'", str10.equals("Equipment marked available"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment not found" + "'", str12.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Equipment not found" + "'", str14.equals("Equipment not found"));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str10 = equipmentController0.markAvailable("Equipment added successfully!");
        java.lang.String str12 = equipmentController0.removeEquipment("Equipment ID already exists");
        model.Equipment.Equipment equipment14 = equipmentController0.getEquipment("Equipment ID already exists");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "AVAILABLE" + "'", str8.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment marked available" + "'", str10.equals("Equipment marked available"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment not found" + "'", str12.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment14);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        model.Equipment.Equipment equipment10 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str12 = equipmentController0.disableEquipment("");
        java.lang.String str14 = equipmentController0.enableEquipment("Equipment added successfully!");
        java.lang.String str16 = equipmentController0.getEquipmentStatus("AVAILABLE");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "AVAILABLE" + "'", str8.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment not found" + "'", str12.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Equipment enabled successfully!" + "'", str14.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Equipment not found" + "'", str16.equals("Equipment not found"));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment7 = equipmentController0.getEquipment("");
        java.lang.String str9 = equipmentController0.removeEquipment("");
        java.lang.String str11 = equipmentController0.enableEquipment("Equipment marked available");
        java.lang.String str13 = equipmentController0.removeEquipment("AVAILABLE");
        java.lang.String str19 = equipmentController0.addEquipment("Equipment removed successfully!", "hi!", "Equipment marked available", "", (double) 100);
        java.lang.String str21 = equipmentController0.disableEquipment("");
        java.lang.String str23 = equipmentController0.markAvailable("Equipment not found");
        java.lang.String str25 = equipmentController0.markMaintenance("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Equipment not found" + "'", str11.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Equipment not found" + "'", str13.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Equipment ID already exists" + "'", str19.equals("Equipment ID already exists"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Equipment not found" + "'", str21.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Equipment marked available" + "'", str23.equals("Equipment marked available"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Equipment not found" + "'", str25.equals("Equipment not found"));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.lang.String str8 = equipmentController0.disableEquipment("Equipment added successfully!");
        java.lang.String str10 = equipmentController0.disableEquipment("DISABLED");
        java.lang.String str12 = equipmentController0.enableEquipment("Equipment removed successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment disabled successfully!" + "'", str8.equals("Equipment disabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment disabled successfully!" + "'", str10.equals("Equipment disabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment enabled successfully!" + "'", str12.equals("Equipment enabled successfully!"));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.markAvailable("");
        model.Equipment.Equipment equipment8 = equipmentController0.getEquipment("");
        model.Equipment.Equipment equipment10 = equipmentController0.getEquipment("DISABLED");
        java.lang.String str12 = equipmentController0.markMaintenance("Equipment marked available");
        java.lang.String str14 = equipmentController0.disableEquipment("Equipment disabled successfully!");
        java.lang.String str16 = equipmentController0.getEquipmentStatus("");
        java.lang.String str22 = equipmentController0.addEquipment("Equipment enabled successfully!", "Equipment added successfully!", "Equipment removed successfully!", "Equipment removed successfully!", 0.0d);
        java.lang.String str24 = equipmentController0.getEquipmentStatus("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment not found" + "'", str12.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Equipment disabled successfully!" + "'", str14.equals("Equipment disabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Equipment not found" + "'", str16.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Equipment ID already exists" + "'", str22.equals("Equipment ID already exists"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Equipment not found" + "'", str24.equals("Equipment not found"));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        model.Equipment.Equipment equipment10 = equipmentController0.getEquipment("Equipment not found");
        model.Equipment.Equipment equipment12 = equipmentController0.getEquipment("DISABLED");
        java.lang.String str18 = equipmentController0.addEquipment("Equipment disabled successfully!", "hi!", "Equipment not found", "AVAILABLE", (double) 0.0f);
        java.lang.Class<?> wildcardClass19 = equipmentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "AVAILABLE" + "'", str8.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Equipment ID already exists" + "'", str18.equals("Equipment ID already exists"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment7 = equipmentController0.getEquipment("");
        java.lang.String str9 = equipmentController0.removeEquipment("");
        java.lang.String str15 = equipmentController0.addEquipment("Equipment not found", "hi!", "", "", (double) 1L);
        model.Equipment.Equipment equipment17 = equipmentController0.getEquipment("Equipment removed successfully!");
        java.lang.String str23 = equipmentController0.addEquipment("Equipment removed successfully!", "AVAILABLE", "Equipment enabled successfully!", "Equipment marked available", (double) (byte) 10);
        java.lang.String str25 = equipmentController0.getEquipmentStatus("AVAILABLE");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Equipment ID already exists" + "'", str15.equals("Equipment ID already exists"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Equipment ID already exists" + "'", str23.equals("Equipment ID already exists"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Equipment not found" + "'", str25.equals("Equipment not found"));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment7 = equipmentController0.getEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList8 = equipmentController0.getAllEquipment();
        java.lang.String str10 = equipmentController0.removeEquipment("Equipment not found");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "AVAILABLE" + "'", str2.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment enabled successfully!" + "'", str4.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment removed successfully!" + "'", str10.equals("Equipment removed successfully!"));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.markAvailable("");
        model.Equipment.Equipment equipment8 = equipmentController0.getEquipment("");
        model.Equipment.Equipment equipment10 = equipmentController0.getEquipment("DISABLED");
        model.Equipment.Equipment equipment12 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str14 = equipmentController0.markMaintenance("AVAILABLE");
        java.lang.String str16 = equipmentController0.markMaintenance("Equipment disabled successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment marked available" + "'", str6.equals("Equipment marked available"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Equipment not found" + "'", str14.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Equipment marked for maintenance" + "'", str16.equals("Equipment marked for maintenance"));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        model.Equipment.Equipment equipment10 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str12 = equipmentController0.disableEquipment("");
        java.lang.String str18 = equipmentController0.addEquipment("Equipment added successfully!", "Equipment marked available", "", "Equipment disabled successfully!", (double) (short) 10);
        model.Equipment.Equipment equipment20 = equipmentController0.getEquipment("Equipment marked available");
        java.lang.String str26 = equipmentController0.addEquipment("Equipment marked available", "hi!", "Equipment enabled successfully!", "Equipment not found", 100.0d);
        java.lang.String str28 = equipmentController0.markMaintenance("Equipment ID already exists");
        java.lang.String str30 = equipmentController0.disableEquipment("DISABLED");
        java.lang.String str32 = equipmentController0.removeEquipment("Equipment removed successfully!");
        java.lang.String str34 = equipmentController0.disableEquipment("Equipment disabled successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment not found" + "'", str8.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment disabled successfully!" + "'", str12.equals("Equipment disabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Equipment ID already exists" + "'", str18.equals("Equipment ID already exists"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Equipment added successfully!" + "'", str26.equals("Equipment added successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Equipment not found" + "'", str28.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Equipment disabled successfully!" + "'", str30.equals("Equipment disabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Equipment removed successfully!" + "'", str32.equals("Equipment removed successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "Equipment disabled successfully!" + "'", str34.equals("Equipment disabled successfully!"));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("hi!");
        java.lang.String str8 = equipmentController0.markAvailable("Equipment not found");
        model.Equipment.Equipment equipment10 = equipmentController0.getEquipment("AVAILABLE");
        java.lang.String str16 = equipmentController0.addEquipment("Equipment added successfully!", "Equipment not found", "", "AVAILABLE", 100.0d);
        java.lang.String str18 = equipmentController0.markAvailable("Equipment removed successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment not found" + "'", str8.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Equipment ID already exists" + "'", str16.equals("Equipment ID already exists"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Equipment not found" + "'", str18.equals("Equipment not found"));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.lang.String str8 = equipmentController0.disableEquipment("Equipment disabled successfully!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList9 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment11 = equipmentController0.getEquipment("Equipment enabled successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment disabled successfully!" + "'", str8.equals("Equipment disabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment11);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("hi!");
        java.lang.String str8 = equipmentController0.removeEquipment("Equipment disabled successfully!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList9 = equipmentController0.getAllEquipment();
        java.lang.String str11 = equipmentController0.markMaintenance("Equipment enabled successfully!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList12 = equipmentController0.getAllEquipment();
        java.lang.String str14 = equipmentController0.markAvailable("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment removed successfully!" + "'", str8.equals("Equipment removed successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Equipment marked for maintenance" + "'", str11.equals("Equipment marked for maintenance"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Equipment marked available" + "'", str14.equals("Equipment marked available"));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.markAvailable("");
        model.Equipment.Equipment equipment8 = equipmentController0.getEquipment("");
        model.Equipment.Equipment equipment10 = equipmentController0.getEquipment("DISABLED");
        model.Equipment.Equipment equipment12 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str14 = equipmentController0.markMaintenance("AVAILABLE");
        java.lang.String str16 = equipmentController0.removeEquipment("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Equipment not found" + "'", str14.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Equipment not found" + "'", str16.equals("Equipment not found"));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList7 = equipmentController0.getAllEquipment();
        java.lang.String str9 = equipmentController0.disableEquipment("hi!");
        java.lang.String str11 = equipmentController0.removeEquipment("Equipment not found");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList12 = equipmentController0.getAllEquipment();
        java.lang.String str14 = equipmentController0.getEquipmentStatus("Equipment removed successfully!");
        java.lang.String str16 = equipmentController0.markMaintenance("Equipment removed successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Equipment removed successfully!" + "'", str11.equals("Equipment removed successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Equipment not found" + "'", str14.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Equipment not found" + "'", str16.equals("Equipment not found"));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.removeEquipment("hi!");
        java.lang.String str4 = equipmentController0.markAvailable("");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("Equipment disabled successfully!");
        java.lang.String str8 = equipmentController0.removeEquipment("AVAILABLE");
        java.lang.String str10 = equipmentController0.getEquipmentStatus("hi!");
        java.lang.String str16 = equipmentController0.addEquipment("MAINTENANCE", "MAINTENANCE", "Equipment disabled successfully!", "Equipment enabled successfully!", (double) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment not found" + "'", str8.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment not found" + "'", str10.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Equipment ID already exists" + "'", str16.equals("Equipment ID already exists"));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.enableEquipment("hi!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        java.lang.String str7 = equipmentController0.removeEquipment("Equipment marked available");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Equipment removed successfully!" + "'", str7.equals("Equipment removed successfully!"));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment7 = equipmentController0.getEquipment("");
        java.lang.String str9 = equipmentController0.removeEquipment("");
        model.Equipment.Equipment equipment11 = equipmentController0.getEquipment("Equipment enabled successfully!");
        java.lang.String str13 = equipmentController0.disableEquipment("Equipment added successfully!");
        java.lang.String str15 = equipmentController0.disableEquipment("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Equipment disabled successfully!" + "'", str13.equals("Equipment disabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Equipment not found" + "'", str15.equals("Equipment not found"));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("Equipment removed successfully!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment marked available");
        java.lang.String str14 = equipmentController0.addEquipment("hi!", "Equipment added successfully!", "Equipment ID already exists", "", (double) (byte) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment not found" + "'", str8.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Equipment added successfully!" + "'", str14.equals("Equipment added successfully!"));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        model.Equipment.Equipment equipment10 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str12 = equipmentController0.disableEquipment("");
        java.lang.String str18 = equipmentController0.addEquipment("Equipment added successfully!", "Equipment marked available", "", "Equipment disabled successfully!", (double) (short) 10);
        java.lang.String str20 = equipmentController0.getEquipmentStatus("Equipment added successfully!");
        java.lang.String str22 = equipmentController0.disableEquipment("hi!");
        java.lang.String str24 = equipmentController0.enableEquipment("Equipment marked available");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment enabled successfully!" + "'", str6.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment not found" + "'", str8.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment not found" + "'", str12.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Equipment ID already exists" + "'", str18.equals("Equipment ID already exists"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "DISABLED" + "'", str20.equals("DISABLED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Equipment disabled successfully!" + "'", str22.equals("Equipment disabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Equipment not found" + "'", str24.equals("Equipment not found"));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        model.Equipment.Equipment equipment10 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str12 = equipmentController0.disableEquipment("");
        java.lang.String str18 = equipmentController0.addEquipment("Equipment added successfully!", "Equipment marked available", "", "Equipment disabled successfully!", (double) (short) 10);
        model.Equipment.Equipment equipment20 = equipmentController0.getEquipment("Equipment marked available");
        java.lang.String str26 = equipmentController0.addEquipment("Equipment marked available", "hi!", "Equipment enabled successfully!", "Equipment not found", 100.0d);
        java.lang.String str28 = equipmentController0.enableEquipment("Equipment added successfully!");
        java.lang.String str30 = equipmentController0.removeEquipment("Equipment removed successfully!");
        java.lang.String str32 = equipmentController0.markMaintenance("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment enabled successfully!" + "'", str6.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment not found" + "'", str8.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment not found" + "'", str12.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Equipment ID already exists" + "'", str18.equals("Equipment ID already exists"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Equipment added successfully!" + "'", str26.equals("Equipment added successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Equipment enabled successfully!" + "'", str28.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Equipment not found" + "'", str30.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Equipment marked for maintenance" + "'", str32.equals("Equipment marked for maintenance"));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("hi!");
        model.Equipment.Equipment equipment8 = equipmentController0.getEquipment("Equipment added successfully!");
        java.lang.String str10 = equipmentController0.markMaintenance("Equipment marked for maintenance");
        java.lang.Class<?> wildcardClass11 = equipmentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "MAINTENANCE" + "'", str6.equals("MAINTENANCE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment not found" + "'", str10.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment7 = equipmentController0.getEquipment("");
        java.lang.String str9 = equipmentController0.removeEquipment("");
        java.lang.String str15 = equipmentController0.addEquipment("Equipment removed successfully!", "hi!", "Equipment added successfully!", "Equipment marked available", 10.0d);
        java.lang.String str17 = equipmentController0.markMaintenance("MAINTENANCE");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Equipment added successfully!" + "'", str15.equals("Equipment added successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Equipment marked for maintenance" + "'", str17.equals("Equipment marked for maintenance"));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList7 = equipmentController0.getAllEquipment();
        java.lang.String str9 = equipmentController0.disableEquipment("hi!");
        model.Equipment.Equipment equipment11 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str13 = equipmentController0.disableEquipment("Equipment ID already exists");
        java.lang.String str15 = equipmentController0.disableEquipment("Equipment marked available");
        java.lang.String str17 = equipmentController0.disableEquipment("Equipment added successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment enabled successfully!" + "'", str6.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment disabled successfully!" + "'", str9.equals("Equipment disabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Equipment not found" + "'", str13.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Equipment disabled successfully!" + "'", str15.equals("Equipment disabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Equipment disabled successfully!" + "'", str17.equals("Equipment disabled successfully!"));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment7 = equipmentController0.getEquipment("");
        java.lang.String str9 = equipmentController0.removeEquipment("");
        java.lang.String str15 = equipmentController0.addEquipment("Equipment not found", "hi!", "", "", (double) 1L);
        java.lang.String str17 = equipmentController0.enableEquipment("Equipment added successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Equipment added successfully!" + "'", str15.equals("Equipment added successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Equipment enabled successfully!" + "'", str17.equals("Equipment enabled successfully!"));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("DISABLED");
        model.Equipment.Equipment equipment6 = equipmentController0.getEquipment("Equipment enabled successfully!");
        java.lang.String str8 = equipmentController0.markMaintenance("Equipment removed successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "DISABLED" + "'", str4.equals("DISABLED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment marked for maintenance" + "'", str8.equals("Equipment marked for maintenance"));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.removeEquipment("hi!");
        java.lang.String str4 = equipmentController0.removeEquipment("hi!");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("Equipment removed successfully!");
        java.lang.String str8 = equipmentController0.markMaintenance("DISABLED");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment removed successfully!" + "'", str2.equals("Equipment removed successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "MAINTENANCE" + "'", str6.equals("MAINTENANCE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment marked for maintenance" + "'", str8.equals("Equipment marked for maintenance"));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.removeEquipment("hi!");
        java.lang.String str4 = equipmentController0.markAvailable("");
        java.lang.String str6 = equipmentController0.markMaintenance("AVAILABLE");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment7 = equipmentController0.getEquipment("");
        java.lang.String str9 = equipmentController0.disableEquipment("Equipment marked available");
        java.lang.String str15 = equipmentController0.addEquipment("DISABLED", "Equipment enabled successfully!", "hi!", "Equipment added successfully!", (double) 100L);
        java.lang.String str17 = equipmentController0.enableEquipment("Equipment added successfully!");
        java.lang.String str19 = equipmentController0.enableEquipment("DISABLED");
        java.lang.String str21 = equipmentController0.markMaintenance("");
        java.lang.Class<?> wildcardClass22 = equipmentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment disabled successfully!" + "'", str9.equals("Equipment disabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Equipment ID already exists" + "'", str15.equals("Equipment ID already exists"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Equipment enabled successfully!" + "'", str17.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Equipment enabled successfully!" + "'", str19.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Equipment not found" + "'", str21.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("hi!");
        java.lang.String str8 = equipmentController0.removeEquipment("Equipment disabled successfully!");
        java.lang.String str10 = equipmentController0.removeEquipment("Equipment marked for maintenance");
        java.lang.String str12 = equipmentController0.markMaintenance("hi!");
        java.lang.String str14 = equipmentController0.markAvailable("DISABLED");
        java.lang.String str16 = equipmentController0.markAvailable("Equipment enabled successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment not found" + "'", str8.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment not found" + "'", str10.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment not found" + "'", str12.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Equipment marked available" + "'", str14.equals("Equipment marked available"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Equipment marked available" + "'", str16.equals("Equipment marked available"));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList7 = equipmentController0.getAllEquipment();
        java.lang.String str9 = equipmentController0.disableEquipment("hi!");
        java.lang.String str15 = equipmentController0.addEquipment("Equipment not found", "hi!", "Equipment marked available", "AVAILABLE", (double) (short) 1);
        java.lang.String str17 = equipmentController0.markMaintenance("");
        java.lang.String str19 = equipmentController0.disableEquipment("Equipment ID already exists");
        java.lang.String str21 = equipmentController0.getEquipmentStatus("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment enabled successfully!" + "'", str6.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment disabled successfully!" + "'", str9.equals("Equipment disabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Equipment ID already exists" + "'", str15.equals("Equipment ID already exists"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Equipment not found" + "'", str17.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Equipment not found" + "'", str19.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "DISABLED" + "'", str21.equals("DISABLED"));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.markAvailable("");
        model.Equipment.Equipment equipment8 = equipmentController0.getEquipment("");
        model.Equipment.Equipment equipment10 = equipmentController0.getEquipment("DISABLED");
        java.lang.String str12 = equipmentController0.markMaintenance("Equipment marked available");
        java.lang.String str14 = equipmentController0.disableEquipment("Equipment disabled successfully!");
        java.lang.String str16 = equipmentController0.getEquipmentStatus("");
        java.lang.String str22 = equipmentController0.addEquipment("Equipment enabled successfully!", "Equipment added successfully!", "Equipment removed successfully!", "Equipment removed successfully!", 0.0d);
        java.lang.String str24 = equipmentController0.removeEquipment("Equipment marked available");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList25 = equipmentController0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment marked for maintenance" + "'", str12.equals("Equipment marked for maintenance"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Equipment not found" + "'", str14.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Equipment not found" + "'", str16.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Equipment ID already exists" + "'", str22.equals("Equipment ID already exists"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Equipment removed successfully!" + "'", str24.equals("Equipment removed successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList25);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("hi!");
        java.lang.String str8 = equipmentController0.removeEquipment("Equipment disabled successfully!");
        java.lang.String str10 = equipmentController0.removeEquipment("Equipment marked for maintenance");
        java.lang.String str12 = equipmentController0.markMaintenance("hi!");
        java.lang.String str14 = equipmentController0.markAvailable("DISABLED");
        java.lang.String str16 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str18 = equipmentController0.markMaintenance("Equipment enabled successfully!");
        java.lang.String str20 = equipmentController0.markMaintenance("Equipment not found");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "DISABLED" + "'", str6.equals("DISABLED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment not found" + "'", str8.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment not found" + "'", str10.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment marked for maintenance" + "'", str12.equals("Equipment marked for maintenance"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Equipment marked available" + "'", str14.equals("Equipment marked available"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "AVAILABLE" + "'", str16.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Equipment marked for maintenance" + "'", str18.equals("Equipment marked for maintenance"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Equipment marked for maintenance" + "'", str20.equals("Equipment marked for maintenance"));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("Equipment removed successfully!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str10 = equipmentController0.getEquipmentStatus("Equipment removed successfully!");
        java.lang.String str12 = equipmentController0.enableEquipment("Equipment disabled successfully!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList13 = equipmentController0.getAllEquipment();
        java.util.ArrayList<model.Equipment.Equipment> equipmentList14 = equipmentController0.getAllEquipment();
        java.lang.Class<?> wildcardClass15 = equipmentList14.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "MAINTENANCE" + "'", str6.equals("MAINTENANCE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "MAINTENANCE" + "'", str8.equals("MAINTENANCE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "MAINTENANCE" + "'", str10.equals("MAINTENANCE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment not found" + "'", str12.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        model.Equipment.Equipment equipment8 = equipmentController0.getEquipment("Equipment not found");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MAINTENANCE" + "'", str4.equals("MAINTENANCE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment enabled successfully!" + "'", str6.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment8);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.disableEquipment("Equipment removed successfully!");
        model.Equipment.Equipment equipment8 = equipmentController0.getEquipment("Equipment disabled successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MAINTENANCE" + "'", str4.equals("MAINTENANCE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment disabled successfully!" + "'", str6.equals("Equipment disabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment8);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.disableEquipment("Equipment marked available");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment ID already exists");
        java.lang.String str6 = equipmentController0.removeEquipment("DISABLED");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment removed successfully!" + "'", str6.equals("Equipment removed successfully!"));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("Equipment removed successfully!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str10 = equipmentController0.getEquipmentStatus("Equipment removed successfully!");
        java.lang.String str12 = equipmentController0.enableEquipment("Equipment disabled successfully!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList13 = equipmentController0.getAllEquipment();
        java.util.ArrayList<model.Equipment.Equipment> equipmentList14 = equipmentController0.getAllEquipment();
        java.lang.String str16 = equipmentController0.removeEquipment("Equipment removed successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "DISABLED" + "'", str6.equals("DISABLED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "MAINTENANCE" + "'", str8.equals("MAINTENANCE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "DISABLED" + "'", str10.equals("DISABLED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment enabled successfully!" + "'", str12.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Equipment removed successfully!" + "'", str16.equals("Equipment removed successfully!"));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("DISABLED");
        java.lang.String str6 = equipmentController0.markMaintenance("Equipment disabled successfully!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList7 = equipmentController0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment marked for maintenance" + "'", str6.equals("Equipment marked for maintenance"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList7);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.markAvailable("");
        model.Equipment.Equipment equipment8 = equipmentController0.getEquipment("");
        java.lang.String str10 = equipmentController0.disableEquipment("");
        java.lang.String str12 = equipmentController0.markAvailable("Equipment not found");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MAINTENANCE" + "'", str4.equals("MAINTENANCE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment not found" + "'", str10.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment marked available" + "'", str12.equals("Equipment marked available"));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.disableEquipment("Equipment marked available");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment ID already exists");
        java.lang.String str6 = equipmentController0.disableEquipment("Equipment marked available");
        java.lang.String str8 = equipmentController0.disableEquipment("Equipment marked available");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment not found" + "'", str8.equals("Equipment not found"));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.lang.String str8 = equipmentController0.disableEquipment("Equipment disabled successfully!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList9 = equipmentController0.getAllEquipment();
        java.lang.Class<?> wildcardClass10 = equipmentList9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment enabled successfully!" + "'", str6.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment not found" + "'", str8.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        model.Equipment.Equipment equipment10 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str12 = equipmentController0.disableEquipment("");
        java.lang.String str18 = equipmentController0.addEquipment("Equipment added successfully!", "Equipment marked available", "", "Equipment disabled successfully!", (double) (short) 10);
        java.lang.String str20 = equipmentController0.getEquipmentStatus("Equipment added successfully!");
        java.lang.String str22 = equipmentController0.disableEquipment("hi!");
        java.lang.String str24 = equipmentController0.removeEquipment("DISABLED");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment enabled successfully!" + "'", str6.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "AVAILABLE" + "'", str8.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment not found" + "'", str12.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Equipment ID already exists" + "'", str18.equals("Equipment ID already exists"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "DISABLED" + "'", str20.equals("DISABLED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Equipment disabled successfully!" + "'", str22.equals("Equipment disabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Equipment not found" + "'", str24.equals("Equipment not found"));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.markAvailable("");
        model.Equipment.Equipment equipment8 = equipmentController0.getEquipment("");
        java.lang.String str10 = equipmentController0.disableEquipment("");
        java.lang.String str12 = equipmentController0.enableEquipment("Equipment disabled successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment not found" + "'", str10.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment not found" + "'", str12.equals("Equipment not found"));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment7 = equipmentController0.getEquipment("");
        java.lang.String str9 = equipmentController0.removeEquipment("");
        java.lang.String str15 = equipmentController0.addEquipment("Equipment removed successfully!", "hi!", "Equipment added successfully!", "Equipment marked available", 10.0d);
        java.lang.String str17 = equipmentController0.getEquipmentStatus("hi!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList18 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment20 = equipmentController0.getEquipment("Equipment added successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Equipment added successfully!" + "'", str15.equals("Equipment added successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "MAINTENANCE" + "'", str17.equals("MAINTENANCE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment20);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("hi!");
        java.lang.String str6 = equipmentController0.disableEquipment("Equipment not found");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment enabled successfully!" + "'", str4.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment disabled successfully!" + "'", str6.equals("Equipment disabled successfully!"));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.removeEquipment("hi!");
        java.lang.String str4 = equipmentController0.markAvailable("");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("Equipment disabled successfully!");
        java.lang.String str8 = equipmentController0.markAvailable("Equipment removed successfully!");
        java.lang.String str10 = equipmentController0.enableEquipment("Equipment marked for maintenance");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment removed successfully!" + "'", str2.equals("Equipment removed successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment marked available" + "'", str8.equals("Equipment marked available"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment not found" + "'", str10.equals("Equipment not found"));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.markAvailable("");
        model.Equipment.Equipment equipment8 = equipmentController0.getEquipment("");
        model.Equipment.Equipment equipment10 = equipmentController0.getEquipment("DISABLED");
        java.lang.String str12 = equipmentController0.markMaintenance("Equipment marked available");
        java.lang.String str14 = equipmentController0.disableEquipment("Equipment removed successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "DISABLED" + "'", str4.equals("DISABLED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment not found" + "'", str12.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Equipment disabled successfully!" + "'", str14.equals("Equipment disabled successfully!"));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        model.Equipment.Equipment equipment10 = equipmentController0.getEquipment("Equipment not found");
        model.Equipment.Equipment equipment12 = equipmentController0.getEquipment("DISABLED");
        java.lang.String str18 = equipmentController0.addEquipment("Equipment removed successfully!", "Equipment marked available", "Equipment disabled successfully!", "hi!", (double) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "DISABLED" + "'", str4.equals("DISABLED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "DISABLED" + "'", str8.equals("DISABLED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Equipment ID already exists" + "'", str18.equals("Equipment ID already exists"));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        model.Equipment.Equipment equipment10 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str12 = equipmentController0.disableEquipment("");
        java.lang.String str18 = equipmentController0.addEquipment("Equipment added successfully!", "Equipment marked available", "", "Equipment disabled successfully!", (double) (short) 10);
        model.Equipment.Equipment equipment20 = equipmentController0.getEquipment("Equipment marked available");
        java.lang.String str26 = equipmentController0.addEquipment("Equipment marked available", "hi!", "Equipment enabled successfully!", "Equipment not found", 100.0d);
        java.lang.String str28 = equipmentController0.markMaintenance("Equipment ID already exists");
        java.lang.String str30 = equipmentController0.disableEquipment("DISABLED");
        java.lang.String str32 = equipmentController0.disableEquipment("DISABLED");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "DISABLED" + "'", str4.equals("DISABLED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "DISABLED" + "'", str8.equals("DISABLED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment not found" + "'", str12.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Equipment ID already exists" + "'", str18.equals("Equipment ID already exists"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Equipment added successfully!" + "'", str26.equals("Equipment added successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Equipment not found" + "'", str28.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Equipment not found" + "'", str30.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Equipment not found" + "'", str32.equals("Equipment not found"));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.markAvailable("Equipment marked available");
        model.Equipment.Equipment equipment8 = equipmentController0.getEquipment("Equipment added successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "DISABLED" + "'", str4.equals("DISABLED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment marked available" + "'", str6.equals("Equipment marked available"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment8);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.disableEquipment("Equipment added successfully!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment disabled successfully!" + "'", str4.equals("Equipment disabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("hi!");
        java.lang.String str8 = equipmentController0.removeEquipment("Equipment disabled successfully!");
        java.lang.String str10 = equipmentController0.removeEquipment("Equipment marked for maintenance");
        java.lang.String str12 = equipmentController0.markMaintenance("hi!");
        java.lang.String str14 = equipmentController0.disableEquipment("Equipment added successfully!");
        java.lang.String str16 = equipmentController0.enableEquipment("MAINTENANCE");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList17 = equipmentController0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "DISABLED" + "'", str4.equals("DISABLED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment removed successfully!" + "'", str8.equals("Equipment removed successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment not found" + "'", str10.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment not found" + "'", str12.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Equipment disabled successfully!" + "'", str14.equals("Equipment disabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Equipment enabled successfully!" + "'", str16.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList17);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment7 = equipmentController0.getEquipment("");
        java.lang.String str9 = equipmentController0.removeEquipment("");
        java.lang.String str15 = equipmentController0.addEquipment("Equipment removed successfully!", "hi!", "Equipment added successfully!", "Equipment marked available", 10.0d);
        java.lang.String str17 = equipmentController0.enableEquipment("Equipment disabled successfully!");
        java.lang.String str19 = equipmentController0.markAvailable("Equipment marked for maintenance");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Equipment ID already exists" + "'", str15.equals("Equipment ID already exists"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Equipment not found" + "'", str17.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Equipment not found" + "'", str19.equals("Equipment not found"));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.markAvailable("");
        model.Equipment.Equipment equipment8 = equipmentController0.getEquipment("");
        model.Equipment.Equipment equipment10 = equipmentController0.getEquipment("DISABLED");
        java.lang.String str12 = equipmentController0.markMaintenance("Equipment marked available");
        java.lang.String str14 = equipmentController0.disableEquipment("Equipment disabled successfully!");
        java.lang.String str16 = equipmentController0.getEquipmentStatus("");
        java.lang.String str22 = equipmentController0.addEquipment("Equipment enabled successfully!", "Equipment added successfully!", "Equipment removed successfully!", "Equipment removed successfully!", 0.0d);
        java.lang.Class<?> wildcardClass23 = equipmentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment marked for maintenance" + "'", str12.equals("Equipment marked for maintenance"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Equipment not found" + "'", str14.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Equipment not found" + "'", str16.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Equipment ID already exists" + "'", str22.equals("Equipment ID already exists"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        model.Equipment.Equipment equipment10 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str12 = equipmentController0.disableEquipment("");
        java.lang.String str18 = equipmentController0.addEquipment("Equipment added successfully!", "Equipment marked available", "", "Equipment disabled successfully!", (double) (short) 10);
        java.lang.String str20 = equipmentController0.getEquipmentStatus("Equipment added successfully!");
        java.lang.String str22 = equipmentController0.disableEquipment("hi!");
        model.Equipment.Equipment equipment24 = equipmentController0.getEquipment("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "AVAILABLE" + "'", str8.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment not found" + "'", str12.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Equipment ID already exists" + "'", str18.equals("Equipment ID already exists"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "DISABLED" + "'", str20.equals("DISABLED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Equipment not found" + "'", str22.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment24);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment7 = equipmentController0.getEquipment("");
        java.lang.String str9 = equipmentController0.removeEquipment("");
        java.lang.String str11 = equipmentController0.enableEquipment("Equipment marked available");
        java.lang.String str17 = equipmentController0.addEquipment("Equipment removed successfully!", "Equipment added successfully!", "", "Equipment enabled successfully!", (double) (short) -1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Equipment enabled successfully!" + "'", str11.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Equipment ID already exists" + "'", str17.equals("Equipment ID already exists"));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("hi!");
        java.lang.String str8 = equipmentController0.markAvailable("Equipment not found");
        java.lang.String str10 = equipmentController0.getEquipmentStatus("Equipment ID already exists");
        java.lang.String str12 = equipmentController0.enableEquipment("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment marked available" + "'", str8.equals("Equipment marked available"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment not found" + "'", str10.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment not found" + "'", str12.equals("Equipment not found"));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        model.Equipment.Equipment equipment10 = equipmentController0.getEquipment("Equipment not found");
        model.Equipment.Equipment equipment12 = equipmentController0.getEquipment("DISABLED");
        java.lang.String str18 = equipmentController0.addEquipment("Equipment disabled successfully!", "hi!", "Equipment not found", "AVAILABLE", (double) 0.0f);
        java.lang.String str20 = equipmentController0.enableEquipment("Equipment marked available");
        java.lang.String str22 = equipmentController0.getEquipmentStatus("MAINTENANCE");
        java.lang.String str24 = equipmentController0.getEquipmentStatus("Equipment marked for maintenance");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "AVAILABLE" + "'", str8.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Equipment added successfully!" + "'", str18.equals("Equipment added successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Equipment enabled successfully!" + "'", str20.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "MAINTENANCE" + "'", str22.equals("MAINTENANCE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Equipment not found" + "'", str24.equals("Equipment not found"));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("hi!");
        java.lang.String str8 = equipmentController0.markAvailable("Equipment not found");
        java.lang.String str10 = equipmentController0.getEquipmentStatus("Equipment ID already exists");
        java.lang.String str12 = equipmentController0.disableEquipment("Equipment disabled successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment marked available" + "'", str8.equals("Equipment marked available"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment not found" + "'", str10.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment disabled successfully!" + "'", str12.equals("Equipment disabled successfully!"));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment7 = equipmentController0.getEquipment("");
        java.lang.String str9 = equipmentController0.removeEquipment("");
        java.lang.String str15 = equipmentController0.addEquipment("Equipment not found", "hi!", "", "", (double) 1L);
        java.lang.String str17 = equipmentController0.disableEquipment("DISABLED");
        java.lang.String str19 = equipmentController0.enableEquipment("Equipment added successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Equipment ID already exists" + "'", str15.equals("Equipment ID already exists"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Equipment not found" + "'", str17.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Equipment enabled successfully!" + "'", str19.equals("Equipment enabled successfully!"));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment7 = equipmentController0.getEquipment("");
        java.lang.String str9 = equipmentController0.removeEquipment("");
        java.lang.String str11 = equipmentController0.enableEquipment("Equipment not found");
        java.lang.String str13 = equipmentController0.removeEquipment("hi!");
        java.lang.String str15 = equipmentController0.disableEquipment("hi!");
        java.lang.String str17 = equipmentController0.getEquipmentStatus("AVAILABLE");
        java.lang.String str19 = equipmentController0.markAvailable("Equipment added successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Equipment enabled successfully!" + "'", str11.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Equipment not found" + "'", str13.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Equipment not found" + "'", str15.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Equipment not found" + "'", str17.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Equipment marked available" + "'", str19.equals("Equipment marked available"));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.enableEquipment("hi!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        java.lang.String str7 = equipmentController0.markMaintenance("Equipment enabled successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Equipment marked for maintenance" + "'", str7.equals("Equipment marked for maintenance"));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList3 = equipmentController0.getAllEquipment();
        java.lang.String str5 = equipmentController0.removeEquipment("Equipment removed successfully!");
        java.lang.String str7 = equipmentController0.removeEquipment("Equipment removed successfully!");
        java.lang.String str9 = equipmentController0.markAvailable("Equipment added successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList3);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Equipment removed successfully!" + "'", str5.equals("Equipment removed successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Equipment not found" + "'", str7.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment marked available" + "'", str9.equals("Equipment marked available"));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.markAvailable("Equipment marked available");
        java.lang.String str8 = equipmentController0.removeEquipment("Equipment not found");
        java.lang.String str10 = equipmentController0.removeEquipment("");
        model.Equipment.Equipment equipment12 = equipmentController0.getEquipment("Equipment added successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment marked available" + "'", str6.equals("Equipment marked available"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment removed successfully!" + "'", str8.equals("Equipment removed successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment not found" + "'", str10.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment12);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str8 = equipmentController0.addEquipment("hi!", "Equipment marked available", "Equipment not found", "Equipment not found", (double) (byte) 100);
        java.lang.String str14 = equipmentController0.addEquipment("", "hi!", "Equipment ID already exists", "", (double) 10L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment added successfully!" + "'", str8.equals("Equipment added successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Equipment added successfully!" + "'", str14.equals("Equipment added successfully!"));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.markAvailable("");
        java.lang.String str8 = equipmentController0.enableEquipment("Equipment not found");
        java.lang.String str14 = equipmentController0.addEquipment("", "AVAILABLE", "Equipment marked available", "", 10.0d);
        java.lang.String str16 = equipmentController0.markAvailable("MAINTENANCE");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment marked available" + "'", str6.equals("Equipment marked available"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment not found" + "'", str8.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Equipment ID already exists" + "'", str14.equals("Equipment ID already exists"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Equipment marked available" + "'", str16.equals("Equipment marked available"));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList7 = equipmentController0.getAllEquipment();
        java.lang.String str9 = equipmentController0.disableEquipment("hi!");
        java.lang.String str11 = equipmentController0.removeEquipment("Equipment not found");
        java.lang.String str13 = equipmentController0.enableEquipment("Equipment not found");
        java.lang.String str15 = equipmentController0.enableEquipment("hi!");
        java.lang.String str21 = equipmentController0.addEquipment("Equipment marked available", "Equipment added successfully!", "Equipment not found", "Equipment enabled successfully!", (double) 100);
        java.util.ArrayList<model.Equipment.Equipment> equipmentList22 = equipmentController0.getAllEquipment();
        java.lang.String str24 = equipmentController0.markMaintenance("Equipment marked available");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment enabled successfully!" + "'", str6.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment disabled successfully!" + "'", str9.equals("Equipment disabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Equipment not found" + "'", str11.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Equipment not found" + "'", str13.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Equipment enabled successfully!" + "'", str15.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Equipment ID already exists" + "'", str21.equals("Equipment ID already exists"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Equipment marked for maintenance" + "'", str24.equals("Equipment marked for maintenance"));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment7 = equipmentController0.getEquipment("");
        java.lang.String str9 = equipmentController0.removeEquipment("");
        java.lang.String str11 = equipmentController0.enableEquipment("Equipment not found");
        java.lang.String str13 = equipmentController0.removeEquipment("hi!");
        java.lang.String str15 = equipmentController0.disableEquipment("hi!");
        java.lang.String str17 = equipmentController0.markMaintenance("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "AVAILABLE" + "'", str2.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment enabled successfully!" + "'", str4.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment removed successfully!" + "'", str9.equals("Equipment removed successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Equipment not found" + "'", str11.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Equipment removed successfully!" + "'", str13.equals("Equipment removed successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Equipment not found" + "'", str15.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Equipment not found" + "'", str17.equals("Equipment not found"));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("hi!");
        java.lang.String str8 = equipmentController0.removeEquipment("Equipment disabled successfully!");
        java.lang.String str10 = equipmentController0.removeEquipment("Equipment marked for maintenance");
        java.lang.String str12 = equipmentController0.markMaintenance("hi!");
        java.lang.String str14 = equipmentController0.markAvailable("DISABLED");
        java.lang.String str16 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str18 = equipmentController0.markMaintenance("Equipment enabled successfully!");
        java.lang.String str20 = equipmentController0.markAvailable("Equipment added successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment removed successfully!" + "'", str8.equals("Equipment removed successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment not found" + "'", str10.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment not found" + "'", str12.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Equipment not found" + "'", str14.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Equipment not found" + "'", str16.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Equipment marked for maintenance" + "'", str18.equals("Equipment marked for maintenance"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Equipment marked available" + "'", str20.equals("Equipment marked available"));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment7 = equipmentController0.getEquipment("");
        java.lang.String str9 = equipmentController0.removeEquipment("");
        java.lang.String str15 = equipmentController0.addEquipment("Equipment not found", "hi!", "", "", (double) 1L);
        java.lang.String str17 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str19 = equipmentController0.removeEquipment("Equipment marked for maintenance");
        java.lang.String str25 = equipmentController0.addEquipment("MAINTENANCE", "Equipment not found", "Equipment disabled successfully!", "Equipment disabled successfully!", (double) 100.0f);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Equipment added successfully!" + "'", str15.equals("Equipment added successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "AVAILABLE" + "'", str17.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Equipment not found" + "'", str19.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Equipment ID already exists" + "'", str25.equals("Equipment ID already exists"));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment7 = equipmentController0.getEquipment("");
        java.lang.String str9 = equipmentController0.disableEquipment("Equipment marked available");
        java.lang.String str15 = equipmentController0.addEquipment("DISABLED", "Equipment enabled successfully!", "hi!", "Equipment added successfully!", (double) 100L);
        java.lang.Class<?> wildcardClass16 = equipmentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment disabled successfully!" + "'", str9.equals("Equipment disabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Equipment added successfully!" + "'", str15.equals("Equipment added successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList7 = equipmentController0.getAllEquipment();
        java.lang.String str9 = equipmentController0.disableEquipment("hi!");
        model.Equipment.Equipment equipment11 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str13 = equipmentController0.disableEquipment("Equipment ID already exists");
        model.Equipment.Equipment equipment15 = equipmentController0.getEquipment("MAINTENANCE");
        java.lang.String str17 = equipmentController0.disableEquipment("hi!");
        java.lang.String str19 = equipmentController0.enableEquipment("Equipment ID already exists");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Equipment not found" + "'", str13.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Equipment not found" + "'", str17.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Equipment not found" + "'", str19.equals("Equipment not found"));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment7 = equipmentController0.getEquipment("");
        java.lang.String str9 = equipmentController0.removeEquipment("");
        java.lang.String str11 = equipmentController0.enableEquipment("Equipment marked available");
        java.lang.String str13 = equipmentController0.removeEquipment("AVAILABLE");
        java.lang.String str19 = equipmentController0.addEquipment("Equipment removed successfully!", "hi!", "Equipment marked available", "", (double) 100);
        java.lang.String str21 = equipmentController0.disableEquipment("");
        java.lang.String str23 = equipmentController0.getEquipmentStatus("Equipment added successfully!");
        java.lang.String str25 = equipmentController0.getEquipmentStatus("Equipment marked available");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "AVAILABLE" + "'", str2.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment enabled successfully!" + "'", str4.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment removed successfully!" + "'", str9.equals("Equipment removed successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Equipment enabled successfully!" + "'", str11.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Equipment not found" + "'", str13.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Equipment ID already exists" + "'", str19.equals("Equipment ID already exists"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Equipment not found" + "'", str21.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Equipment not found" + "'", str23.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "AVAILABLE" + "'", str25.equals("AVAILABLE"));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment7 = equipmentController0.getEquipment("DISABLED");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment7);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment7 = equipmentController0.getEquipment("");
        java.lang.String str9 = equipmentController0.disableEquipment("Equipment marked available");
        model.Equipment.Equipment equipment11 = equipmentController0.getEquipment("");
        java.lang.String str13 = equipmentController0.markAvailable("MAINTENANCE");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment disabled successfully!" + "'", str9.equals("Equipment disabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Equipment marked available" + "'", str13.equals("Equipment marked available"));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.lang.String str8 = equipmentController0.disableEquipment("Equipment added successfully!");
        java.lang.String str10 = equipmentController0.disableEquipment("DISABLED");
        java.lang.String str12 = equipmentController0.markMaintenance("Equipment marked available");
        java.lang.String str18 = equipmentController0.addEquipment("Equipment marked available", "Equipment ID already exists", "", "AVAILABLE", 0.0d);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment not found" + "'", str8.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment disabled successfully!" + "'", str10.equals("Equipment disabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment marked for maintenance" + "'", str12.equals("Equipment marked for maintenance"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Equipment ID already exists" + "'", str18.equals("Equipment ID already exists"));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment7 = equipmentController0.getEquipment("");
        java.lang.String str9 = equipmentController0.removeEquipment("");
        java.lang.String str11 = equipmentController0.enableEquipment("Equipment marked available");
        java.lang.String str13 = equipmentController0.removeEquipment("AVAILABLE");
        java.lang.String str19 = equipmentController0.addEquipment("Equipment removed successfully!", "hi!", "Equipment marked available", "", (double) 100);
        java.lang.String str21 = equipmentController0.disableEquipment("");
        java.lang.String str23 = equipmentController0.getEquipmentStatus("Equipment added successfully!");
        java.lang.String str25 = equipmentController0.enableEquipment("Equipment enabled successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Equipment enabled successfully!" + "'", str11.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Equipment not found" + "'", str13.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Equipment ID already exists" + "'", str19.equals("Equipment ID already exists"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Equipment not found" + "'", str21.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Equipment not found" + "'", str23.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Equipment enabled successfully!" + "'", str25.equals("Equipment enabled successfully!"));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        model.Equipment.EquipmentStatus equipmentStatus1 = null;
        boolean boolean2 = controller.EquipmentController.updateEquipmentStatus("Equipment disabled successfully!", equipmentStatus1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.removeEquipment("hi!");
        java.lang.String str4 = equipmentController0.markAvailable("");
        java.lang.String str6 = equipmentController0.markMaintenance("Equipment disabled successfully!");
        java.lang.String str8 = equipmentController0.markAvailable("Equipment not found");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList9 = equipmentController0.getAllEquipment();
        java.lang.Class<?> wildcardClass10 = equipmentList9.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment marked available" + "'", str8.equals("Equipment marked available"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        model.Equipment.Equipment equipment10 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str12 = equipmentController0.disableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList13 = equipmentController0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "AVAILABLE" + "'", str8.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment not found" + "'", str12.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList13);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("hi!");
        java.lang.String str8 = equipmentController0.markAvailable("Equipment not found");
        java.lang.Class<?> wildcardClass9 = equipmentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment marked available" + "'", str8.equals("Equipment marked available"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.disableEquipment("Equipment marked available");
        model.Equipment.Equipment equipment4 = equipmentController0.getEquipment("");
        java.lang.String str6 = equipmentController0.markAvailable("Equipment disabled successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment disabled successfully!" + "'", str2.equals("Equipment disabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        model.Equipment.Equipment equipment10 = equipmentController0.getEquipment("Equipment not found");
        model.Equipment.Equipment equipment12 = equipmentController0.getEquipment("DISABLED");
        java.lang.String str14 = equipmentController0.enableEquipment("MAINTENANCE");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "AVAILABLE" + "'", str8.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Equipment enabled successfully!" + "'", str14.equals("Equipment enabled successfully!"));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        model.Equipment.Equipment equipment10 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str12 = equipmentController0.disableEquipment("");
        java.lang.String str18 = equipmentController0.addEquipment("Equipment added successfully!", "Equipment marked available", "", "Equipment disabled successfully!", (double) (short) 10);
        model.Equipment.Equipment equipment20 = equipmentController0.getEquipment("Equipment marked available");
        java.lang.String str26 = equipmentController0.addEquipment("Equipment marked available", "hi!", "Equipment enabled successfully!", "Equipment not found", 100.0d);
        java.lang.String str28 = equipmentController0.enableEquipment("Equipment added successfully!");
        java.lang.String str30 = equipmentController0.removeEquipment("Equipment marked available");
        java.lang.String str32 = equipmentController0.markMaintenance("Equipment disabled successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "AVAILABLE" + "'", str8.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment not found" + "'", str12.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Equipment added successfully!" + "'", str18.equals("Equipment added successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Equipment ID already exists" + "'", str26.equals("Equipment ID already exists"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Equipment enabled successfully!" + "'", str28.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Equipment removed successfully!" + "'", str30.equals("Equipment removed successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Equipment not found" + "'", str32.equals("Equipment not found"));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        model.Equipment.Equipment equipment6 = equipmentController0.getEquipment("AVAILABLE");
        model.Equipment.Equipment equipment8 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str10 = equipmentController0.removeEquipment("Equipment marked for maintenance");
        java.lang.String str12 = equipmentController0.removeEquipment("Equipment added successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment not found" + "'", str10.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment removed successfully!" + "'", str12.equals("Equipment removed successfully!"));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList7 = equipmentController0.getAllEquipment();
        java.lang.String str9 = equipmentController0.disableEquipment("hi!");
        java.lang.String str11 = equipmentController0.removeEquipment("Equipment not found");
        java.lang.String str17 = equipmentController0.addEquipment("", "Equipment marked available", "Equipment not found", "Equipment disabled successfully!", (double) 10);
        java.lang.String str23 = equipmentController0.addEquipment("AVAILABLE", "Equipment marked for maintenance", "", "Equipment enabled successfully!", (double) 100L);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Equipment removed successfully!" + "'", str11.equals("Equipment removed successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Equipment added successfully!" + "'", str17.equals("Equipment added successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Equipment added successfully!" + "'", str23.equals("Equipment added successfully!"));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        java.lang.String str7 = equipmentController0.enableEquipment("DISABLED");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList8 = equipmentController0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Equipment enabled successfully!" + "'", str7.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList8);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.markAvailable("");
        java.lang.String str8 = equipmentController0.disableEquipment("MAINTENANCE");
        java.lang.String str14 = equipmentController0.addEquipment("Equipment enabled successfully!", "Equipment ID already exists", "Equipment not found", "Equipment removed successfully!", (double) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment marked available" + "'", str6.equals("Equipment marked available"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment disabled successfully!" + "'", str8.equals("Equipment disabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Equipment ID already exists" + "'", str14.equals("Equipment ID already exists"));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        java.lang.String str7 = equipmentController0.disableEquipment("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Equipment not found" + "'", str7.equals("Equipment not found"));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment7 = equipmentController0.getEquipment("");
        java.lang.String str9 = equipmentController0.removeEquipment("");
        java.lang.String str15 = equipmentController0.addEquipment("Equipment removed successfully!", "hi!", "Equipment added successfully!", "Equipment marked available", 10.0d);
        model.Equipment.Equipment equipment17 = equipmentController0.getEquipment("Equipment enabled successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "AVAILABLE" + "'", str2.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment enabled successfully!" + "'", str4.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment removed successfully!" + "'", str9.equals("Equipment removed successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Equipment ID already exists" + "'", str15.equals("Equipment ID already exists"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment17);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList7 = equipmentController0.getAllEquipment();
        java.lang.String str9 = equipmentController0.disableEquipment("hi!");
        java.lang.String str15 = equipmentController0.addEquipment("Equipment not found", "hi!", "Equipment marked available", "AVAILABLE", (double) (short) 1);
        java.lang.String str17 = equipmentController0.markAvailable("AVAILABLE");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Equipment added successfully!" + "'", str15.equals("Equipment added successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Equipment marked available" + "'", str17.equals("Equipment marked available"));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("Equipment removed successfully!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str10 = equipmentController0.getEquipmentStatus("Equipment removed successfully!");
        java.lang.String str12 = equipmentController0.enableEquipment("Equipment disabled successfully!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList13 = equipmentController0.getAllEquipment();
        java.util.ArrayList<model.Equipment.Equipment> equipmentList14 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment16 = equipmentController0.getEquipment("Equipment marked for maintenance");
        java.lang.String str18 = equipmentController0.getEquipmentStatus("Equipment marked for maintenance");
        model.Equipment.Equipment equipment20 = equipmentController0.getEquipment("Equipment added successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "AVAILABLE" + "'", str6.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "AVAILABLE" + "'", str8.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "AVAILABLE" + "'", str10.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment not found" + "'", str12.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Equipment not found" + "'", str18.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment20);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("Equipment removed successfully!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str10 = equipmentController0.removeEquipment("Equipment added successfully!");
        java.lang.String str12 = equipmentController0.markAvailable("AVAILABLE");
        java.lang.String str14 = equipmentController0.removeEquipment("");
        java.lang.String str16 = equipmentController0.removeEquipment("DISABLED");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "AVAILABLE" + "'", str6.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "AVAILABLE" + "'", str8.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment not found" + "'", str10.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment marked available" + "'", str12.equals("Equipment marked available"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Equipment not found" + "'", str14.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Equipment removed successfully!" + "'", str16.equals("Equipment removed successfully!"));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.markAvailable("");
        model.Equipment.Equipment equipment8 = equipmentController0.getEquipment("");
        model.Equipment.Equipment equipment10 = equipmentController0.getEquipment("DISABLED");
        model.Equipment.Equipment equipment12 = equipmentController0.getEquipment("Equipment ID already exists");
        java.lang.String str14 = equipmentController0.enableEquipment("DISABLED");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList15 = equipmentController0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Equipment not found" + "'", str14.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList15);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("hi!");
        java.lang.String str8 = equipmentController0.removeEquipment("Equipment disabled successfully!");
        java.lang.String str10 = equipmentController0.removeEquipment("Equipment marked for maintenance");
        java.lang.String str12 = equipmentController0.markMaintenance("hi!");
        java.lang.String str14 = equipmentController0.markAvailable("DISABLED");
        java.lang.String str16 = equipmentController0.getEquipmentStatus("Equipment not found");
        model.Equipment.Equipment equipment18 = equipmentController0.getEquipment("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment not found" + "'", str8.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment not found" + "'", str10.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment not found" + "'", str12.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Equipment not found" + "'", str14.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "AVAILABLE" + "'", str16.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment18);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment7 = equipmentController0.getEquipment("");
        java.lang.String str9 = equipmentController0.removeEquipment("");
        model.Equipment.Equipment equipment11 = equipmentController0.getEquipment("Equipment enabled successfully!");
        java.lang.String str13 = equipmentController0.markMaintenance("Equipment ID already exists");
        java.lang.String str19 = equipmentController0.addEquipment("Equipment ID already exists", "Equipment marked available", "Equipment removed successfully!", "Equipment marked available", 0.0d);
        java.lang.String str21 = equipmentController0.disableEquipment("Equipment ID already exists");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Equipment not found" + "'", str13.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Equipment added successfully!" + "'", str19.equals("Equipment added successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Equipment disabled successfully!" + "'", str21.equals("Equipment disabled successfully!"));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("Equipment removed successfully!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str10 = equipmentController0.removeEquipment("Equipment added successfully!");
        java.lang.String str12 = equipmentController0.markMaintenance("Equipment not found");
        model.Equipment.Equipment equipment14 = equipmentController0.getEquipment("AVAILABLE");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "AVAILABLE" + "'", str6.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "AVAILABLE" + "'", str8.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment not found" + "'", str10.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment marked for maintenance" + "'", str12.equals("Equipment marked for maintenance"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment14);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("hi!");
        java.lang.String str8 = equipmentController0.markAvailable("Equipment not found");
        java.lang.String str10 = equipmentController0.getEquipmentStatus("Equipment ID already exists");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList11 = equipmentController0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MAINTENANCE" + "'", str4.equals("MAINTENANCE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment marked available" + "'", str8.equals("Equipment marked available"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "DISABLED" + "'", str10.equals("DISABLED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList11);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment7 = equipmentController0.getEquipment("");
        java.lang.String str9 = equipmentController0.removeEquipment("");
        java.lang.String str15 = equipmentController0.addEquipment("Equipment not found", "hi!", "", "", (double) 1L);
        java.lang.String str17 = equipmentController0.disableEquipment("DISABLED");
        java.lang.String str19 = equipmentController0.disableEquipment("DISABLED");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Equipment ID already exists" + "'", str15.equals("Equipment ID already exists"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Equipment not found" + "'", str17.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Equipment not found" + "'", str19.equals("Equipment not found"));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment7 = equipmentController0.getEquipment("");
        java.lang.String str9 = equipmentController0.removeEquipment("");
        java.lang.String str11 = equipmentController0.enableEquipment("Equipment not found");
        java.lang.String str13 = equipmentController0.removeEquipment("hi!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList14 = equipmentController0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Equipment enabled successfully!" + "'", str11.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Equipment not found" + "'", str13.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList14);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment7 = equipmentController0.getEquipment("");
        java.lang.String str9 = equipmentController0.removeEquipment("");
        java.lang.String str15 = equipmentController0.addEquipment("Equipment removed successfully!", "hi!", "Equipment added successfully!", "Equipment marked available", 10.0d);
        java.lang.String str17 = equipmentController0.enableEquipment("Equipment disabled successfully!");
        java.lang.String str19 = equipmentController0.disableEquipment("Equipment marked for maintenance");
        java.lang.String str21 = equipmentController0.markMaintenance("Equipment disabled successfully!");
        java.lang.String str23 = equipmentController0.markMaintenance("Equipment marked for maintenance");
        java.lang.String str25 = equipmentController0.enableEquipment("Equipment removed successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Equipment ID already exists" + "'", str15.equals("Equipment ID already exists"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Equipment not found" + "'", str17.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Equipment not found" + "'", str19.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Equipment not found" + "'", str21.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Equipment not found" + "'", str23.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Equipment enabled successfully!" + "'", str25.equals("Equipment enabled successfully!"));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("Equipment removed successfully!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str10 = equipmentController0.getEquipmentStatus("Equipment removed successfully!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList11 = equipmentController0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "AVAILABLE" + "'", str6.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "AVAILABLE" + "'", str8.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "AVAILABLE" + "'", str10.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList11);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        model.Equipment.Equipment equipment10 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str12 = equipmentController0.disableEquipment("");
        java.lang.String str18 = equipmentController0.addEquipment("Equipment added successfully!", "Equipment marked available", "", "Equipment disabled successfully!", (double) (short) 10);
        java.lang.String str20 = equipmentController0.getEquipmentStatus("Equipment added successfully!");
        java.lang.Class<?> wildcardClass21 = equipmentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "AVAILABLE" + "'", str8.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment not found" + "'", str12.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Equipment added successfully!" + "'", str18.equals("Equipment added successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "AVAILABLE" + "'", str20.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.disableEquipment("Equipment removed successfully!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList7 = equipmentController0.getAllEquipment();
        java.lang.String str13 = equipmentController0.addEquipment("Equipment removed successfully!", "Equipment enabled successfully!", "Equipment ID already exists", "Equipment disabled successfully!", 0.0d);
        java.lang.String str19 = equipmentController0.addEquipment("", "DISABLED", "Equipment ID already exists", "MAINTENANCE", (double) (byte) -1);
        java.lang.String str21 = equipmentController0.getEquipmentStatus("Equipment not found");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment disabled successfully!" + "'", str6.equals("Equipment disabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Equipment ID already exists" + "'", str13.equals("Equipment ID already exists"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Equipment added successfully!" + "'", str19.equals("Equipment added successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "AVAILABLE" + "'", str21.equals("AVAILABLE"));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList7 = equipmentController0.getAllEquipment();
        java.lang.String str9 = equipmentController0.disableEquipment("hi!");
        java.lang.String str11 = equipmentController0.removeEquipment("Equipment not found");
        java.lang.String str13 = equipmentController0.enableEquipment("Equipment not found");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList14 = equipmentController0.getAllEquipment();
        java.lang.String str16 = equipmentController0.disableEquipment("Equipment marked for maintenance");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Equipment removed successfully!" + "'", str11.equals("Equipment removed successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Equipment not found" + "'", str13.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Equipment not found" + "'", str16.equals("Equipment not found"));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.enableEquipment("hi!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        java.lang.String str7 = equipmentController0.getEquipmentStatus("Equipment enabled successfully!");
        java.lang.String str9 = equipmentController0.markMaintenance("MAINTENANCE");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "MAINTENANCE" + "'", str7.equals("MAINTENANCE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment marked for maintenance" + "'", str9.equals("Equipment marked for maintenance"));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        model.Equipment.Equipment equipment10 = equipmentController0.getEquipment("Equipment not found");
        model.Equipment.Equipment equipment12 = equipmentController0.getEquipment("DISABLED");
        java.lang.String str18 = equipmentController0.addEquipment("Equipment disabled successfully!", "hi!", "Equipment not found", "AVAILABLE", (double) 0.0f);
        java.lang.String str20 = equipmentController0.enableEquipment("Equipment marked available");
        java.lang.Class<?> wildcardClass21 = equipmentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment not found" + "'", str8.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Equipment added successfully!" + "'", str18.equals("Equipment added successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Equipment not found" + "'", str20.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        model.Equipment.Equipment equipment10 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str12 = equipmentController0.disableEquipment("");
        java.lang.String str18 = equipmentController0.addEquipment("Equipment added successfully!", "Equipment marked available", "", "Equipment disabled successfully!", (double) (short) 10);
        model.Equipment.Equipment equipment20 = equipmentController0.getEquipment("Equipment marked available");
        java.lang.String str26 = equipmentController0.addEquipment("Equipment marked available", "hi!", "Equipment enabled successfully!", "Equipment not found", 100.0d);
        java.lang.String str28 = equipmentController0.markMaintenance("Equipment ID already exists");
        java.lang.String str30 = equipmentController0.disableEquipment("DISABLED");
        java.lang.String str32 = equipmentController0.enableEquipment("Equipment ID already exists");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment not found" + "'", str8.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment disabled successfully!" + "'", str12.equals("Equipment disabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Equipment ID already exists" + "'", str18.equals("Equipment ID already exists"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Equipment added successfully!" + "'", str26.equals("Equipment added successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Equipment marked for maintenance" + "'", str28.equals("Equipment marked for maintenance"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "Equipment not found" + "'", str30.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str32 + "' != '" + "Equipment enabled successfully!" + "'", str32.equals("Equipment enabled successfully!"));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment7 = equipmentController0.getEquipment("");
        java.lang.String str9 = equipmentController0.disableEquipment("Equipment marked available");
        java.lang.String str15 = equipmentController0.addEquipment("DISABLED", "Equipment enabled successfully!", "hi!", "Equipment added successfully!", (double) 100L);
        java.util.ArrayList<model.Equipment.Equipment> equipmentList16 = equipmentController0.getAllEquipment();
        java.util.ArrayList<model.Equipment.Equipment> equipmentList17 = equipmentController0.getAllEquipment();
        java.lang.String str19 = equipmentController0.disableEquipment("Equipment marked available");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "DISABLED" + "'", str2.equals("DISABLED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment enabled successfully!" + "'", str4.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment disabled successfully!" + "'", str9.equals("Equipment disabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Equipment added successfully!" + "'", str15.equals("Equipment added successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Equipment disabled successfully!" + "'", str19.equals("Equipment disabled successfully!"));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment7 = equipmentController0.getEquipment("");
        java.lang.String str9 = equipmentController0.removeEquipment("");
        java.lang.String str11 = equipmentController0.enableEquipment("Equipment marked available");
        java.lang.String str13 = equipmentController0.removeEquipment("Equipment ID already exists");
        java.lang.String str15 = equipmentController0.disableEquipment("Equipment removed successfully!");
        model.Equipment.Equipment equipment17 = equipmentController0.getEquipment("Equipment removed successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "AVAILABLE" + "'", str2.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment enabled successfully!" + "'", str4.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment removed successfully!" + "'", str9.equals("Equipment removed successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Equipment enabled successfully!" + "'", str11.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Equipment removed successfully!" + "'", str13.equals("Equipment removed successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Equipment disabled successfully!" + "'", str15.equals("Equipment disabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment17);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.markAvailable("");
        java.lang.String str8 = equipmentController0.enableEquipment("Equipment not found");
        java.lang.String str14 = equipmentController0.addEquipment("", "AVAILABLE", "Equipment marked available", "", 10.0d);
        java.lang.String str16 = equipmentController0.enableEquipment("Equipment ID already exists");
        java.lang.String str18 = equipmentController0.disableEquipment("hi!");
        java.lang.String str20 = equipmentController0.markMaintenance("Equipment added successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment marked available" + "'", str6.equals("Equipment marked available"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment not found" + "'", str8.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Equipment ID already exists" + "'", str14.equals("Equipment ID already exists"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Equipment not found" + "'", str16.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Equipment not found" + "'", str18.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Equipment marked for maintenance" + "'", str20.equals("Equipment marked for maintenance"));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment7 = equipmentController0.getEquipment("");
        java.lang.String str9 = equipmentController0.removeEquipment("");
        java.lang.String str15 = equipmentController0.addEquipment("Equipment removed successfully!", "hi!", "Equipment added successfully!", "Equipment marked available", 10.0d);
        java.lang.String str17 = equipmentController0.getEquipmentStatus("hi!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList18 = equipmentController0.getAllEquipment();
        java.lang.String str20 = equipmentController0.enableEquipment("Equipment enabled successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "AVAILABLE" + "'", str2.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment enabled successfully!" + "'", str4.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment removed successfully!" + "'", str9.equals("Equipment removed successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Equipment ID already exists" + "'", str15.equals("Equipment ID already exists"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Equipment not found" + "'", str17.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Equipment enabled successfully!" + "'", str20.equals("Equipment enabled successfully!"));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.markAvailable("Equipment marked available");
        java.lang.String str8 = equipmentController0.removeEquipment("Equipment not found");
        java.lang.String str14 = equipmentController0.addEquipment("Equipment not found", "Equipment marked available", "Equipment enabled successfully!", "MAINTENANCE", (double) (short) 0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment marked available" + "'", str6.equals("Equipment marked available"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment not found" + "'", str8.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Equipment added successfully!" + "'", str14.equals("Equipment added successfully!"));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList7 = equipmentController0.getAllEquipment();
        java.lang.String str9 = equipmentController0.disableEquipment("hi!");
        java.lang.String str11 = equipmentController0.removeEquipment("Equipment not found");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList12 = equipmentController0.getAllEquipment();
        java.lang.String str14 = equipmentController0.getEquipmentStatus("Equipment removed successfully!");
        java.lang.String str20 = equipmentController0.addEquipment("Equipment enabled successfully!", "Equipment enabled successfully!", "Equipment added successfully!", "Equipment marked available", (double) (-1L));
        model.Equipment.Equipment equipment22 = equipmentController0.getEquipment("Equipment ID already exists");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Equipment removed successfully!" + "'", str11.equals("Equipment removed successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "DISABLED" + "'", str14.equals("DISABLED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Equipment ID already exists" + "'", str20.equals("Equipment ID already exists"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment22);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        model.Equipment.Equipment equipment10 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str12 = equipmentController0.disableEquipment("");
        java.lang.String str14 = equipmentController0.enableEquipment("Equipment added successfully!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList15 = equipmentController0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment not found" + "'", str8.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment not found" + "'", str12.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Equipment enabled successfully!" + "'", str14.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList15);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment7 = equipmentController0.getEquipment("");
        java.lang.String str9 = equipmentController0.removeEquipment("");
        java.lang.String str11 = equipmentController0.enableEquipment("Equipment marked available");
        java.lang.String str13 = equipmentController0.removeEquipment("AVAILABLE");
        java.lang.String str19 = equipmentController0.addEquipment("Equipment removed successfully!", "hi!", "Equipment marked available", "", (double) 100);
        java.lang.String str21 = equipmentController0.disableEquipment("");
        java.lang.String str23 = equipmentController0.markAvailable("Equipment not found");
        java.lang.String str29 = equipmentController0.addEquipment("DISABLED", "MAINTENANCE", "Equipment removed successfully!", "AVAILABLE", (double) 10.0f);
        java.lang.String str31 = equipmentController0.disableEquipment("MAINTENANCE");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Equipment enabled successfully!" + "'", str11.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Equipment removed successfully!" + "'", str13.equals("Equipment removed successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Equipment ID already exists" + "'", str19.equals("Equipment ID already exists"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Equipment not found" + "'", str21.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Equipment not found" + "'", str23.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "Equipment ID already exists" + "'", str29.equals("Equipment ID already exists"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "Equipment disabled successfully!" + "'", str31.equals("Equipment disabled successfully!"));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.enableEquipment("hi!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        java.lang.String str11 = equipmentController0.addEquipment("Equipment disabled successfully!", "", "", "Equipment not found", (double) (short) 0);
        java.lang.String str13 = equipmentController0.enableEquipment("");
        java.lang.String str15 = equipmentController0.enableEquipment("Equipment enabled successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Equipment ID already exists" + "'", str11.equals("Equipment ID already exists"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Equipment not found" + "'", str13.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Equipment enabled successfully!" + "'", str15.equals("Equipment enabled successfully!"));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList7 = equipmentController0.getAllEquipment();
        java.lang.String str9 = equipmentController0.disableEquipment("hi!");
        model.Equipment.Equipment equipment11 = equipmentController0.getEquipment("MAINTENANCE");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList12 = equipmentController0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList12);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.disableEquipment("Equipment marked available");
        java.lang.String str8 = equipmentController0.addEquipment("AVAILABLE", "MAINTENANCE", "Equipment ID already exists", "AVAILABLE", (double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment disabled successfully!" + "'", str2.equals("Equipment disabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment added successfully!" + "'", str8.equals("Equipment added successfully!"));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("Equipment removed successfully!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str10 = equipmentController0.getEquipmentStatus("Equipment removed successfully!");
        java.lang.String str12 = equipmentController0.enableEquipment("Equipment disabled successfully!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList13 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment15 = equipmentController0.getEquipment("");
        java.lang.String str21 = equipmentController0.addEquipment("Equipment marked for maintenance", "DISABLED", "Equipment removed successfully!", "Equipment enabled successfully!", (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "DISABLED" + "'", str6.equals("DISABLED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment not found" + "'", str8.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "DISABLED" + "'", str10.equals("DISABLED"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment enabled successfully!" + "'", str12.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Equipment added successfully!" + "'", str21.equals("Equipment added successfully!"));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str10 = equipmentController0.disableEquipment("");
        java.lang.String str12 = equipmentController0.markAvailable("Equipment ID already exists");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment not found" + "'", str8.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment not found" + "'", str10.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment not found" + "'", str12.equals("Equipment not found"));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.lang.String str8 = equipmentController0.disableEquipment("Equipment disabled successfully!");
        java.lang.String str10 = equipmentController0.markMaintenance("MAINTENANCE");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment disabled successfully!" + "'", str8.equals("Equipment disabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment marked for maintenance" + "'", str10.equals("Equipment marked for maintenance"));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("hi!");
        java.lang.String str8 = equipmentController0.removeEquipment("Equipment disabled successfully!");
        java.lang.String str10 = equipmentController0.removeEquipment("Equipment marked for maintenance");
        model.Equipment.Equipment equipment12 = equipmentController0.getEquipment("Equipment added successfully!");
        java.lang.Class<?> wildcardClass13 = equipment12.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment removed successfully!" + "'", str8.equals("Equipment removed successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment removed successfully!" + "'", str10.equals("Equipment removed successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        model.Equipment.Equipment equipment4 = equipmentController0.getEquipment("hi!");
        java.lang.String str10 = equipmentController0.addEquipment("Equipment added successfully!", "hi!", "DISABLED", "DISABLED", (double) 0);
        model.Equipment.Equipment equipment12 = equipmentController0.getEquipment("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment4);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment ID already exists" + "'", str10.equals("Equipment ID already exists"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment12);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str10 = equipmentController0.disableEquipment("");
        java.lang.String str12 = equipmentController0.getEquipmentStatus("MAINTENANCE");
        java.lang.String str18 = equipmentController0.addEquipment("Equipment added successfully!", "AVAILABLE", "AVAILABLE", "DISABLED", 10.0d);
        java.lang.Class<?> wildcardClass19 = equipmentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment not found" + "'", str8.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment not found" + "'", str10.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "MAINTENANCE" + "'", str12.equals("MAINTENANCE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Equipment ID already exists" + "'", str18.equals("Equipment ID already exists"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList7 = equipmentController0.getAllEquipment();
        java.lang.String str9 = equipmentController0.disableEquipment("hi!");
        java.lang.String str11 = equipmentController0.removeEquipment("Equipment not found");
        java.lang.String str13 = equipmentController0.disableEquipment("");
        java.lang.String str15 = equipmentController0.enableEquipment("Equipment enabled successfully!");
        java.lang.String str17 = equipmentController0.getEquipmentStatus("");
        java.lang.String str19 = equipmentController0.getEquipmentStatus("MAINTENANCE");
        java.lang.String str21 = equipmentController0.getEquipmentStatus("AVAILABLE");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Equipment not found" + "'", str11.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Equipment not found" + "'", str13.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Equipment enabled successfully!" + "'", str15.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Equipment not found" + "'", str17.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "MAINTENANCE" + "'", str19.equals("MAINTENANCE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "AVAILABLE" + "'", str21.equals("AVAILABLE"));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.enableEquipment("hi!");
        model.Equipment.Equipment equipment6 = equipmentController0.getEquipment("Equipment enabled successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment6);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("hi!");
        java.lang.String str8 = equipmentController0.markAvailable("Equipment not found");
        java.lang.String str10 = equipmentController0.getEquipmentStatus("Equipment ID already exists");
        java.lang.Class<?> wildcardClass11 = equipmentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment not found" + "'", str8.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment not found" + "'", str10.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.lang.String str8 = equipmentController0.disableEquipment("Equipment disabled successfully!");
        java.lang.String str10 = equipmentController0.enableEquipment("Equipment removed successfully!");
        java.lang.String str12 = equipmentController0.enableEquipment("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment not found" + "'", str8.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment enabled successfully!" + "'", str10.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment not found" + "'", str12.equals("Equipment not found"));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment7 = equipmentController0.getEquipment("");
        java.lang.String str9 = equipmentController0.removeEquipment("");
        java.lang.String str15 = equipmentController0.addEquipment("Equipment not found", "hi!", "", "", (double) 1L);
        model.Equipment.Equipment equipment17 = equipmentController0.getEquipment("Equipment removed successfully!");
        java.lang.String str19 = equipmentController0.enableEquipment("Equipment enabled successfully!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList20 = equipmentController0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Equipment added successfully!" + "'", str15.equals("Equipment added successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Equipment enabled successfully!" + "'", str19.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList20);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        model.Equipment.Equipment equipment6 = equipmentController0.getEquipment("AVAILABLE");
        model.Equipment.Equipment equipment8 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str10 = equipmentController0.removeEquipment("Equipment marked for maintenance");
        java.lang.String str12 = equipmentController0.markMaintenance("DISABLED");
        model.Equipment.Equipment equipment14 = equipmentController0.getEquipment("Equipment ID already exists");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList15 = equipmentController0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment not found" + "'", str10.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment marked for maintenance" + "'", str12.equals("Equipment marked for maintenance"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList15);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("hi!");
        java.lang.String str8 = equipmentController0.removeEquipment("Equipment disabled successfully!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList9 = equipmentController0.getAllEquipment();
        java.lang.String str15 = equipmentController0.addEquipment("Equipment disabled successfully!", "Equipment ID already exists", "", "Equipment enabled successfully!", 1.0d);
        java.util.ArrayList<model.Equipment.Equipment> equipmentList16 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment18 = equipmentController0.getEquipment("hi!");
        java.lang.Class<?> wildcardClass19 = equipmentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment not found" + "'", str8.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Equipment added successfully!" + "'", str15.equals("Equipment added successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment7 = equipmentController0.getEquipment("");
        java.lang.String str9 = equipmentController0.disableEquipment("Equipment marked available");
        java.lang.String str15 = equipmentController0.addEquipment("DISABLED", "Equipment enabled successfully!", "hi!", "Equipment added successfully!", (double) 100L);
        java.util.ArrayList<model.Equipment.Equipment> equipmentList16 = equipmentController0.getAllEquipment();
        java.util.ArrayList<model.Equipment.Equipment> equipmentList17 = equipmentController0.getAllEquipment();
        java.lang.String str19 = equipmentController0.removeEquipment("Equipment enabled successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment disabled successfully!" + "'", str9.equals("Equipment disabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Equipment ID already exists" + "'", str15.equals("Equipment ID already exists"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Equipment removed successfully!" + "'", str19.equals("Equipment removed successfully!"));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.enableEquipment("hi!");
        java.lang.String str10 = equipmentController0.addEquipment("hi!", "Equipment disabled successfully!", "hi!", "Equipment added successfully!", (double) (short) 1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment added successfully!" + "'", str10.equals("Equipment added successfully!"));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.removeEquipment("hi!");
        java.lang.String str4 = equipmentController0.removeEquipment("hi!");
        java.lang.String str6 = equipmentController0.disableEquipment("hi!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment ID already exists");
        java.lang.String str10 = equipmentController0.getEquipmentStatus("");
        model.Equipment.Equipment equipment12 = equipmentController0.getEquipment("Equipment marked available");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment removed successfully!" + "'", str2.equals("Equipment removed successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment not found" + "'", str8.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "AVAILABLE" + "'", str10.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment12);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("hi!");
        java.lang.String str8 = equipmentController0.removeEquipment("Equipment disabled successfully!");
        java.lang.String str10 = equipmentController0.removeEquipment("Equipment marked for maintenance");
        java.lang.String str12 = equipmentController0.markMaintenance("hi!");
        java.lang.String str14 = equipmentController0.markAvailable("DISABLED");
        java.lang.String str16 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList17 = equipmentController0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment removed successfully!" + "'", str8.equals("Equipment removed successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment not found" + "'", str10.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment not found" + "'", str12.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Equipment marked available" + "'", str14.equals("Equipment marked available"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "AVAILABLE" + "'", str16.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList17);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment7 = equipmentController0.getEquipment("");
        java.lang.String str9 = equipmentController0.removeEquipment("");
        java.lang.String str11 = equipmentController0.enableEquipment("Equipment marked available");
        java.lang.String str13 = equipmentController0.disableEquipment("Equipment added successfully!");
        java.lang.String str15 = equipmentController0.disableEquipment("Equipment added successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "AVAILABLE" + "'", str2.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment enabled successfully!" + "'", str4.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment removed successfully!" + "'", str9.equals("Equipment removed successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Equipment enabled successfully!" + "'", str11.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Equipment disabled successfully!" + "'", str13.equals("Equipment disabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Equipment disabled successfully!" + "'", str15.equals("Equipment disabled successfully!"));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("Equipment removed successfully!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str10 = equipmentController0.getEquipmentStatus("Equipment removed successfully!");
        java.lang.String str12 = equipmentController0.enableEquipment("Equipment disabled successfully!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList13 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment15 = equipmentController0.getEquipment("");
        model.Equipment.Equipment equipment17 = equipmentController0.getEquipment("Equipment disabled successfully!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass18 = equipment17.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "AVAILABLE" + "'", str6.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "AVAILABLE" + "'", str8.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "AVAILABLE" + "'", str10.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment not found" + "'", str12.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment17);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str10 = equipmentController0.enableEquipment("Equipment removed successfully!");
        java.lang.String str12 = equipmentController0.markMaintenance("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "AVAILABLE" + "'", str8.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment enabled successfully!" + "'", str10.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment not found" + "'", str12.equals("Equipment not found"));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.removeEquipment("hi!");
        java.lang.String str4 = equipmentController0.removeEquipment("hi!");
        java.lang.String str6 = equipmentController0.disableEquipment("hi!");
        java.lang.String str8 = equipmentController0.markAvailable("Equipment not found");
        java.lang.String str14 = equipmentController0.addEquipment("Equipment added successfully!", "Equipment marked available", "Equipment ID already exists", "MAINTENANCE", (double) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment marked available" + "'", str8.equals("Equipment marked available"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Equipment ID already exists" + "'", str14.equals("Equipment ID already exists"));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("hi!");
        java.lang.String str8 = equipmentController0.markAvailable("hi!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList9 = equipmentController0.getAllEquipment();
        java.lang.String str11 = equipmentController0.markMaintenance("MAINTENANCE");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment not found" + "'", str8.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Equipment marked for maintenance" + "'", str11.equals("Equipment marked for maintenance"));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("Equipment removed successfully!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment marked available");
        java.lang.String str10 = equipmentController0.markAvailable("AVAILABLE");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "AVAILABLE" + "'", str6.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "AVAILABLE" + "'", str8.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment marked available" + "'", str10.equals("Equipment marked available"));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.removeEquipment("hi!");
        java.lang.String str4 = equipmentController0.removeEquipment("hi!");
        java.lang.String str6 = equipmentController0.disableEquipment("hi!");
        java.lang.String str8 = equipmentController0.disableEquipment("Equipment ID already exists");
        java.lang.String str10 = equipmentController0.markMaintenance("DISABLED");
        java.lang.String str12 = equipmentController0.enableEquipment("Equipment marked available");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment not found" + "'", str8.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment marked for maintenance" + "'", str10.equals("Equipment marked for maintenance"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment enabled successfully!" + "'", str12.equals("Equipment enabled successfully!"));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment7 = equipmentController0.getEquipment("");
        java.lang.String str9 = equipmentController0.removeEquipment("");
        java.lang.String str11 = equipmentController0.enableEquipment("Equipment marked available");
        java.lang.String str13 = equipmentController0.removeEquipment("AVAILABLE");
        java.lang.Class<?> wildcardClass14 = equipmentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Equipment enabled successfully!" + "'", str11.equals("Equipment enabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Equipment removed successfully!" + "'", str13.equals("Equipment removed successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList7 = equipmentController0.getAllEquipment();
        java.lang.String str9 = equipmentController0.disableEquipment("hi!");
        java.lang.String str11 = equipmentController0.removeEquipment("Equipment not found");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList12 = equipmentController0.getAllEquipment();
        java.lang.String str14 = equipmentController0.markAvailable("Equipment ID already exists");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Equipment removed successfully!" + "'", str11.equals("Equipment removed successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Equipment not found" + "'", str14.equals("Equipment not found"));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.removeEquipment("hi!");
        java.lang.String str4 = equipmentController0.removeEquipment("hi!");
        java.lang.String str6 = equipmentController0.disableEquipment("hi!");
        java.lang.String str8 = equipmentController0.markMaintenance("Equipment ID already exists");
        java.lang.String str10 = equipmentController0.getEquipmentStatus("Equipment not found");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment not found" + "'", str8.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment not found" + "'", str10.equals("Equipment not found"));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.lang.String str6 = equipmentController0.markAvailable("hi!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment removed successfully!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList9 = equipmentController0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "AVAILABLE" + "'", str8.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList9);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.removeEquipment("hi!");
        java.lang.String str4 = equipmentController0.removeEquipment("hi!");
        java.lang.String str6 = equipmentController0.disableEquipment("hi!");
        java.lang.String str8 = equipmentController0.markAvailable("Equipment not found");
        java.lang.String str10 = equipmentController0.disableEquipment("hi!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList11 = equipmentController0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment not found" + "'", str8.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment not found" + "'", str10.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList11);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList7 = equipmentController0.getAllEquipment();
        java.lang.String str9 = equipmentController0.disableEquipment("hi!");
        java.lang.String str15 = equipmentController0.addEquipment("Equipment not found", "hi!", "Equipment marked available", "AVAILABLE", (double) (short) 1);
        java.lang.String str17 = equipmentController0.markMaintenance("");
        java.lang.String str19 = equipmentController0.markMaintenance("AVAILABLE");
        java.lang.String str21 = equipmentController0.removeEquipment("Equipment marked available");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Equipment added successfully!" + "'", str15.equals("Equipment added successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Equipment not found" + "'", str17.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Equipment not found" + "'", str19.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Equipment removed successfully!" + "'", str21.equals("Equipment removed successfully!"));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("hi!");
        java.lang.String str8 = equipmentController0.markAvailable("Equipment not found");
        java.lang.String str10 = equipmentController0.getEquipmentStatus("Equipment ID already exists");
        java.lang.String str12 = equipmentController0.markMaintenance("Equipment not found");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AVAILABLE" + "'", str4.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment marked available" + "'", str8.equals("Equipment marked available"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment not found" + "'", str10.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment marked for maintenance" + "'", str12.equals("Equipment marked for maintenance"));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("Equipment removed successfully!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str10 = equipmentController0.removeEquipment("Equipment added successfully!");
        java.lang.Class<?> wildcardClass11 = equipmentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "AVAILABLE" + "'", str6.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "MAINTENANCE" + "'", str8.equals("MAINTENANCE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment removed successfully!" + "'", str10.equals("Equipment removed successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.markAvailable("");
        model.Equipment.Equipment equipment8 = equipmentController0.getEquipment("");
        model.Equipment.Equipment equipment10 = equipmentController0.getEquipment("DISABLED");
        java.lang.String str12 = equipmentController0.removeEquipment("AVAILABLE");
        java.lang.String str14 = equipmentController0.removeEquipment("Equipment removed successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MAINTENANCE" + "'", str4.equals("MAINTENANCE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment not found" + "'", str12.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Equipment removed successfully!" + "'", str14.equals("Equipment removed successfully!"));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.enableEquipment("hi!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        java.lang.String str11 = equipmentController0.addEquipment("Equipment disabled successfully!", "", "", "Equipment not found", (double) (short) 0);
        java.util.ArrayList<model.Equipment.Equipment> equipmentList12 = equipmentController0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Equipment added successfully!" + "'", str11.equals("Equipment added successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList12);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("hi!");
        java.lang.String str8 = equipmentController0.removeEquipment("Equipment disabled successfully!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList9 = equipmentController0.getAllEquipment();
        java.lang.String str15 = equipmentController0.addEquipment("Equipment disabled successfully!", "Equipment ID already exists", "", "Equipment enabled successfully!", 1.0d);
        java.lang.String str21 = equipmentController0.addEquipment("MAINTENANCE", "hi!", "Equipment ID already exists", "", (double) 0.0f);
        java.lang.String str23 = equipmentController0.disableEquipment("DISABLED");
        java.lang.String str25 = equipmentController0.enableEquipment("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MAINTENANCE" + "'", str4.equals("MAINTENANCE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment removed successfully!" + "'", str8.equals("Equipment removed successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Equipment added successfully!" + "'", str15.equals("Equipment added successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Equipment ID already exists" + "'", str21.equals("Equipment ID already exists"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Equipment disabled successfully!" + "'", str23.equals("Equipment disabled successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Equipment not found" + "'", str25.equals("Equipment not found"));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList7 = equipmentController0.getAllEquipment();
        java.lang.String str9 = equipmentController0.disableEquipment("hi!");
        java.lang.String str15 = equipmentController0.addEquipment("Equipment not found", "hi!", "Equipment marked available", "AVAILABLE", (double) (short) 1);
        java.lang.String str17 = equipmentController0.markMaintenance("");
        java.lang.String str19 = equipmentController0.markMaintenance("AVAILABLE");
        java.lang.String str21 = equipmentController0.enableEquipment("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MAINTENANCE" + "'", str4.equals("MAINTENANCE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Equipment ID already exists" + "'", str15.equals("Equipment ID already exists"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Equipment not found" + "'", str17.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Equipment not found" + "'", str19.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Equipment not found" + "'", str21.equals("Equipment not found"));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("hi!");
        java.lang.String str8 = equipmentController0.removeEquipment("Equipment disabled successfully!");
        java.lang.String str10 = equipmentController0.disableEquipment("hi!");
        model.Equipment.Equipment equipment12 = equipmentController0.getEquipment("Equipment not found");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MAINTENANCE" + "'", str4.equals("MAINTENANCE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment removed successfully!" + "'", str8.equals("Equipment removed successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment not found" + "'", str10.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment12);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("hi!");
        java.lang.String str8 = equipmentController0.removeEquipment("Equipment disabled successfully!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList9 = equipmentController0.getAllEquipment();
        java.lang.String str15 = equipmentController0.addEquipment("Equipment disabled successfully!", "Equipment ID already exists", "", "Equipment enabled successfully!", 1.0d);
        java.lang.String str17 = equipmentController0.getEquipmentStatus("MAINTENANCE");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MAINTENANCE" + "'", str4.equals("MAINTENANCE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment not found" + "'", str8.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Equipment added successfully!" + "'", str15.equals("Equipment added successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "MAINTENANCE" + "'", str17.equals("MAINTENANCE"));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("hi!");
        java.lang.String str8 = equipmentController0.removeEquipment("Equipment disabled successfully!");
        java.lang.String str10 = equipmentController0.removeEquipment("Equipment marked for maintenance");
        java.lang.Class<?> wildcardClass11 = equipmentController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MAINTENANCE" + "'", str4.equals("MAINTENANCE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Equipment removed successfully!" + "'", str8.equals("Equipment removed successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment not found" + "'", str10.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.enableEquipment("hi!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        model.Equipment.Equipment equipment10 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str12 = equipmentController0.disableEquipment("");
        model.Equipment.Equipment equipment14 = equipmentController0.getEquipment("Equipment added successfully!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MAINTENANCE" + "'", str4.equals("MAINTENANCE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "MAINTENANCE" + "'", str8.equals("MAINTENANCE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment not found" + "'", str12.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment14);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment7 = equipmentController0.getEquipment("");
        java.lang.String str9 = equipmentController0.removeEquipment("");
        java.lang.String str11 = equipmentController0.enableEquipment("Equipment marked available");
        java.lang.String str13 = equipmentController0.removeEquipment("AVAILABLE");
        java.lang.String str19 = equipmentController0.addEquipment("Equipment removed successfully!", "hi!", "Equipment marked available", "", (double) 100);
        java.lang.String str21 = equipmentController0.markAvailable("Equipment removed successfully!");
        java.lang.String str27 = equipmentController0.addEquipment("Equipment marked available", "", "Equipment enabled successfully!", "", (double) (short) 10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Equipment not found" + "'", str11.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Equipment not found" + "'", str13.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Equipment added successfully!" + "'", str19.equals("Equipment added successfully!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Equipment marked available" + "'", str21.equals("Equipment marked available"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Equipment added successfully!" + "'", str27.equals("Equipment added successfully!"));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str6 = equipmentController0.markAvailable("");
        model.Equipment.Equipment equipment8 = equipmentController0.getEquipment("");
        model.Equipment.Equipment equipment10 = equipmentController0.getEquipment("DISABLED");
        model.Equipment.Equipment equipment12 = equipmentController0.getEquipment("Equipment ID already exists");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList13 = equipmentController0.getAllEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "MAINTENANCE" + "'", str4.equals("MAINTENANCE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Equipment not found" + "'", str6.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList13);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.markMaintenance("MAINTENANCE");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment marked for maintenance" + "'", str2.equals("Equipment marked for maintenance"));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        model.Equipment.Equipment equipment7 = equipmentController0.getEquipment("");
        java.lang.String str9 = equipmentController0.removeEquipment("");
        java.lang.String str15 = equipmentController0.addEquipment("Equipment removed successfully!", "hi!", "Equipment added successfully!", "Equipment marked available", 10.0d);
        java.lang.String str17 = equipmentController0.getEquipmentStatus("hi!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList18 = equipmentController0.getAllEquipment();
        java.lang.String str20 = equipmentController0.markAvailable("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(equipment7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Equipment not found" + "'", str9.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Equipment ID already exists" + "'", str15.equals("Equipment ID already exists"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Equipment not found" + "'", str17.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Equipment not found" + "'", str20.equals("Equipment not found"));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        model.Equipment.Equipment equipment2 = equipmentController0.getEquipment("Equipment not found");
        java.lang.String str4 = equipmentController0.enableEquipment("hi!");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = equipmentController0.getAllEquipment();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = equipmentController0.markAvailable("MAINTENANCE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: Disabled equipment cannot be made available.");
        } catch (java.lang.IllegalStateException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipment2);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        controller.EquipmentController equipmentController0 = controller.EquipmentController.getInstance();
        java.lang.String str2 = equipmentController0.getEquipmentStatus("");
        java.lang.String str4 = equipmentController0.enableEquipment("");
        java.lang.String str6 = equipmentController0.getEquipmentStatus("Equipment removed successfully!");
        java.lang.String str8 = equipmentController0.getEquipmentStatus("Equipment not found");
        java.lang.String str10 = equipmentController0.removeEquipment("Equipment added successfully!");
        java.lang.String str12 = equipmentController0.markMaintenance("Equipment not found");
        java.lang.String str14 = equipmentController0.removeEquipment("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Equipment not found" + "'", str2.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Equipment not found" + "'", str4.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "AVAILABLE" + "'", str6.equals("AVAILABLE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "MAINTENANCE" + "'", str8.equals("MAINTENANCE"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Equipment not found" + "'", str10.equals("Equipment not found"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Equipment marked for maintenance" + "'", str12.equals("Equipment marked for maintenance"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Equipment not found" + "'", str14.equals("Equipment not found"));
    }
}

