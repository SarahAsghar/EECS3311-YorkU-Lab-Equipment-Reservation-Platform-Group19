package model;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        model.DatabaseManager databaseManager0 = model.DatabaseManager.getInstance();
        boolean boolean2 = databaseManager0.deleteReservation("");
        databaseManager0.saveNumLabManagerAccountCreated("");
        java.util.ArrayList<model.User.User> userList5 = databaseManager0.loadUsers();
        java.util.ArrayList<model.Payment.Payment> paymentList6 = databaseManager0.loadPayments();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(databaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(paymentList6);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        model.DatabaseManager databaseManager0 = model.DatabaseManager.getInstance();
        boolean boolean2 = databaseManager0.deleteReservation("");
        databaseManager0.saveNumLabManagerAccountCreated("");
        java.util.ArrayList<model.Equipment.Equipment> equipmentList5 = databaseManager0.loadEquipment();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(databaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(equipmentList5);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        model.DatabaseManager databaseManager0 = model.DatabaseManager.getInstance();
        boolean boolean2 = databaseManager0.deleteReservation("");
        databaseManager0.saveNumLabManagerAccountCreated("");
        boolean boolean6 = databaseManager0.deleteReservation("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(databaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        model.DatabaseManager databaseManager0 = model.DatabaseManager.getInstance();
        java.util.ArrayList<model.Reservation.Reservation> reservationList1 = null;
        databaseManager0.saveReservations(reservationList1);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(databaseManager0);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        model.DatabaseManager databaseManager0 = model.DatabaseManager.getInstance();
        boolean boolean2 = databaseManager0.deleteReservation("");
        databaseManager0.saveNumLabManagerAccountCreated("");
        java.util.ArrayList<model.User.User> userList5 = databaseManager0.loadUsers();
        model.Reservation.Reservation reservation6 = null;
        boolean boolean7 = databaseManager0.updateReservation(reservation6);
        java.util.ArrayList<model.Equipment.Equipment> equipmentList8 = null;
        databaseManager0.saveEquipment(equipmentList8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(databaseManager0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userList5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }
}

