package model.User;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserRegressionTest {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        java.lang.Class<?> wildcardClass6 = user5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        java.lang.String str9 = user5.getIDNum();
        java.lang.Class<?> wildcardClass10 = user5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        user5.setEmail("");
        user5.setStatus(true);
        user5.setIDNum("");
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        user5.setPassword("hi!");
        boolean boolean10 = user5.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        user5.setStatus(false);
        java.lang.String str12 = user5.getEmail();
        model.User.UserType userType13 = user5.getUserType();
        model.User.UserType userType14 = user5.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType14);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        java.lang.Class<?> wildcardClass10 = user5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        user5.setStatus(false);
        model.User.UserType userType12 = null;
        user5.setUserType(userType12);
        java.lang.String str14 = user5.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        user5.setStatus(false);
        user5.setIDNum("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        user5.setPassword("hi!");
        user5.setStatus(false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        java.lang.String str10 = user5.getEmail();
        model.User.UserType userType11 = null;
        user5.setUserType(userType11);
        user5.setStatus(false);
        java.lang.String str15 = user5.getIDNum();
        java.lang.String str16 = user5.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        user5.setEmail("");
        java.lang.String str10 = user5.getEmail();
        model.User.UserType userType11 = user5.getUserType();
        user5.setIDNum("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType11);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        user5.setStatus(false);
        java.lang.String str12 = user5.getEmail();
        java.lang.Class<?> wildcardClass13 = user5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        user5.setEmail("");
        user5.setIDNum("");
        java.lang.String str12 = user5.getEmail();
        java.lang.String str13 = user5.getEmail();
        java.lang.String str14 = user5.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        model.User.UserType userType8 = user5.getUserType();
        boolean boolean9 = user5.getStatus();
        java.lang.Class<?> wildcardClass10 = user5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "hi!", "");
        user5.setStatus(false);
        java.lang.Class<?> wildcardClass8 = user5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        model.User.UserType userType8 = null;
        user5.setUserType(userType8);
        java.lang.String str10 = user5.getEmail();
        model.User.UserType userType11 = user5.getUserType();
        java.lang.Class<?> wildcardClass12 = user5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        java.lang.String str10 = user5.getEmail();
        user5.setIDNum("hi!");
        user5.setIDNum("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "hi!", "");
        model.User.UserType userType6 = user5.getUserType();
        java.lang.String str7 = user5.getPassword();
        java.lang.Class<?> wildcardClass8 = user5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "hi!", "hi!");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "", "hi!");
        java.lang.String str6 = user5.getName();
        model.User.UserType userType7 = null;
        user5.setUserType(userType7);
        model.User.UserType userType9 = null;
        user5.setUserType(userType9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        model.User.UserType userType8 = null;
        user5.setUserType(userType8);
        java.lang.String str10 = user5.getEmail();
        java.lang.String str11 = user5.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "", "hi!");
        java.lang.String str6 = user5.getName();
        java.lang.String str7 = user5.getEmail();
        java.lang.Class<?> wildcardClass8 = user5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        user5.setEmail("");
        java.lang.String str10 = user5.getPassword();
        user5.setStatus(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        model.User.UserType userType8 = null;
        user5.setUserType(userType8);
        java.lang.String str10 = user5.getEmail();
        java.lang.String str11 = user5.getPassword();
        model.User.UserType userType12 = null;
        user5.setUserType(userType12);
        java.lang.Class<?> wildcardClass14 = user5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        model.User.UserType userType8 = null;
        user5.setUserType(userType8);
        model.User.UserType userType10 = user5.getUserType();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = userType10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType10);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        model.User.UserType userType8 = null;
        user5.setUserType(userType8);
        java.lang.String str10 = user5.getName();
        user5.setStatus(false);
        boolean boolean13 = user5.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "", "hi!");
        java.lang.String str6 = user5.getName();
        model.User.UserType userType7 = null;
        user5.setUserType(userType7);
        java.lang.String str9 = user5.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "hi!", "");
        model.User.UserType userType6 = user5.getUserType();
        java.lang.String str7 = user5.getPassword();
        user5.setIDNum("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        model.User.UserType userType8 = null;
        user5.setUserType(userType8);
        java.lang.String str10 = user5.getName();
        user5.setStatus(false);
        java.lang.String str13 = user5.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        user5.setStatus(false);
        model.User.UserType userType12 = user5.getUserType();
        java.lang.Class<?> wildcardClass13 = user5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType12);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        java.lang.Class<?> wildcardClass8 = user5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        model.User.UserType userType8 = null;
        user5.setUserType(userType8);
        java.lang.String str10 = user5.getEmail();
        java.lang.Class<?> wildcardClass11 = user5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "hi!", "");
        java.lang.String str6 = user5.getIDNum();
        java.lang.Class<?> wildcardClass7 = user5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        model.User.UserType userType8 = user5.getUserType();
        model.User.UserType userType9 = null;
        user5.setUserType(userType9);
        user5.setEmail("hi!");
        java.lang.Class<?> wildcardClass13 = user5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "", "");
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "hi!", userType2, "hi!", "");
        model.User.UserType userType6 = null;
        user5.setUserType(userType6);
        java.lang.String str8 = user5.getPassword();
        boolean boolean9 = user5.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        java.lang.String str6 = user5.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        model.User.UserType userType8 = user5.getUserType();
        model.User.UserType userType9 = null;
        user5.setUserType(userType9);
        user5.setEmail("hi!");
        java.lang.String str13 = user5.getName();
        java.lang.String str14 = user5.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        user5.setStatus(false);
        model.User.UserType userType12 = null;
        user5.setUserType(userType12);
        java.lang.String str14 = user5.getName();
        java.lang.String str15 = user5.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "hi!", userType2, "hi!", "");
        model.User.UserType userType6 = null;
        user5.setUserType(userType6);
        java.lang.String str8 = user5.getPassword();
        user5.setPassword("hi!");
        java.lang.String str11 = user5.getIDNum();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        model.User.UserType userType8 = null;
        user5.setUserType(userType8);
        java.lang.String str10 = user5.getName();
        user5.setStatus(false);
        user5.setEmail("");
        java.lang.String str15 = user5.getPassword();
        boolean boolean16 = user5.getStatus();
        java.lang.Class<?> wildcardClass17 = user5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        user5.setEmail("");
        java.lang.String str10 = user5.getPassword();
        java.lang.Class<?> wildcardClass11 = user5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        java.lang.String str10 = user5.getEmail();
        user5.setIDNum("hi!");
        model.User.UserType userType13 = null;
        user5.setUserType(userType13);
        java.lang.String str15 = user5.getIDNum();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        model.User.UserType userType8 = null;
        user5.setUserType(userType8);
        java.lang.String str10 = user5.getPassword();
        user5.setEmail("hi!");
        java.lang.String str13 = user5.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        java.lang.String str10 = user5.getEmail();
        user5.setIDNum("hi!");
        java.lang.String str13 = user5.getIDNum();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        user5.setStatus(false);
        model.User.UserType userType12 = user5.getUserType();
        user5.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType12);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        model.User.UserType userType8 = null;
        user5.setUserType(userType8);
        java.lang.String str10 = user5.getEmail();
        java.lang.String str11 = user5.getPassword();
        model.User.UserType userType12 = null;
        user5.setUserType(userType12);
        user5.setEmail("");
        java.lang.String str16 = user5.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        user5.setEmail("");
        user5.setIDNum("");
        java.lang.String str12 = user5.getName();
        user5.setEmail("hi!");
        user5.setIDNum("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "hi!", userType2, "", "");
        user5.setStatus(true);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        model.User.UserType userType8 = user5.getUserType();
        model.User.UserType userType9 = null;
        user5.setUserType(userType9);
        user5.setEmail("hi!");
        user5.setIDNum("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType8);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "", "hi!");
        java.lang.String str6 = user5.getPassword();
        user5.setStatus(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        user5.setEmail("");
        user5.setIDNum("");
        user5.setPassword("hi!");
        java.lang.String str14 = user5.getEmail();
        model.User.UserType userType15 = null;
        user5.setUserType(userType15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        user5.setStatus(false);
        java.lang.String str12 = user5.getEmail();
        user5.setEmail("");
        user5.setEmail("");
        user5.setEmail("");
        boolean boolean19 = user5.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "hi!", userType2, "", "");
        java.lang.String str6 = user5.getIDNum();
        java.lang.Class<?> wildcardClass7 = user5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        boolean boolean6 = user5.getStatus();
        user5.setStatus(false);
        java.lang.String str9 = user5.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "hi!", "");
        model.User.UserType userType6 = user5.getUserType();
        model.User.UserType userType7 = null;
        user5.setUserType(userType7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType6);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "hi!", "hi!");
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "hi!", userType2, "", "");
        java.lang.String str6 = user5.getIDNum();
        user5.setEmail("hi!");
        java.lang.String str9 = user5.getPassword();
        model.User.UserType userType10 = null;
        user5.setUserType(userType10);
        java.lang.String str12 = user5.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        user5.setEmail("");
        user5.setIDNum("");
        user5.setPassword("hi!");
        model.User.UserType userType14 = null;
        user5.setUserType(userType14);
        java.lang.Class<?> wildcardClass16 = user5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        user5.setPassword("hi!");
        java.lang.String str10 = user5.getEmail();
        java.lang.String str11 = user5.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        java.lang.String str10 = user5.getEmail();
        model.User.UserType userType11 = null;
        user5.setUserType(userType11);
        boolean boolean13 = user5.getStatus();
        java.lang.String str14 = user5.getPassword();
        user5.setStatus(false);
        user5.setStatus(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        user5.setEmail("");
        user5.setPassword("");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        java.lang.String str10 = user5.getEmail();
        user5.setIDNum("hi!");
        java.lang.String str13 = user5.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        user5.setEmail("");
        java.lang.String str10 = user5.getEmail();
        model.User.UserType userType11 = user5.getUserType();
        user5.setEmail("hi!");
        java.lang.String str14 = user5.getIDNum();
        model.User.UserType userType15 = null;
        user5.setUserType(userType15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        model.User.UserType userType9 = null;
        user5.setUserType(userType9);
        java.lang.String str11 = user5.getEmail();
        java.lang.Class<?> wildcardClass12 = user5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "hi!", userType2, "hi!", "hi!");
        java.lang.String str6 = user5.getPassword();
        java.lang.String str7 = user5.getIDNum();
        java.lang.Class<?> wildcardClass8 = user5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "", "hi!");
        java.lang.String str6 = user5.getName();
        java.lang.String str7 = user5.getEmail();
        user5.setPassword("hi!");
        java.lang.String str10 = user5.getName();
        user5.setPassword("");
        java.lang.String str13 = user5.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "hi!", userType2, "hi!", "");
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        user5.setStatus(true);
        boolean boolean11 = user5.getStatus();
        java.lang.String str12 = user5.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        model.User.UserType userType8 = null;
        user5.setUserType(userType8);
        java.lang.String str10 = user5.getEmail();
        java.lang.String str11 = user5.getIDNum();
        java.lang.String str12 = user5.getName();
        model.User.UserType userType13 = user5.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType13);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        user5.setStatus(false);
        boolean boolean10 = user5.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "hi!", userType2, "hi!", "hi!");
        user5.setStatus(true);
        model.User.UserType userType8 = null;
        user5.setUserType(userType8);
        java.lang.String str10 = user5.getPassword();
        user5.setIDNum("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        java.lang.String str10 = user5.getEmail();
        user5.setIDNum("hi!");
        user5.setStatus(true);
        java.lang.Class<?> wildcardClass15 = user5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        model.User.UserType userType8 = null;
        user5.setUserType(userType8);
        java.lang.String str10 = user5.getName();
        user5.setStatus(false);
        user5.setEmail("");
        java.lang.String str15 = user5.getPassword();
        java.lang.String str16 = user5.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        model.User.UserType userType8 = null;
        user5.setUserType(userType8);
        java.lang.String str10 = user5.getName();
        user5.setStatus(false);
        user5.setEmail("");
        java.lang.String str15 = user5.getPassword();
        boolean boolean16 = user5.getStatus();
        java.lang.String str17 = user5.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        model.User.UserType userType8 = null;
        user5.setUserType(userType8);
        java.lang.String str10 = user5.getEmail();
        java.lang.String str11 = user5.getPassword();
        model.User.UserType userType12 = null;
        user5.setUserType(userType12);
        user5.setEmail("");
        model.User.UserType userType16 = user5.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType16);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        model.User.UserType userType8 = null;
        user5.setUserType(userType8);
        model.User.UserType userType10 = null;
        user5.setUserType(userType10);
        user5.setPassword("hi!");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        user5.setPassword("hi!");
        user5.setPassword("");
        java.lang.String str13 = user5.getEmail();
        java.lang.String str14 = user5.getIDNum();
        user5.setIDNum("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        user5.setEmail("");
        user5.setIDNum("hi!");
        user5.setIDNum("");
        java.lang.String str14 = user5.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        model.User.UserType userType8 = null;
        user5.setUserType(userType8);
        java.lang.String str10 = user5.getEmail();
        java.lang.String str11 = user5.getPassword();
        model.User.UserType userType12 = null;
        user5.setUserType(userType12);
        user5.setEmail("");
        java.lang.String str16 = user5.getName();
        user5.setEmail("hi!");
        java.lang.Class<?> wildcardClass19 = user5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "hi!", "");
        model.User.UserType userType6 = user5.getUserType();
        user5.setEmail("");
        boolean boolean9 = user5.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        java.lang.String str10 = user5.getEmail();
        model.User.UserType userType11 = null;
        user5.setUserType(userType11);
        boolean boolean13 = user5.getStatus();
        java.lang.String str14 = user5.getPassword();
        user5.setStatus(false);
        model.User.UserType userType17 = null;
        user5.setUserType(userType17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        user5.setStatus(false);
        java.lang.String str12 = user5.getEmail();
        java.lang.String str13 = user5.getName();
        java.lang.String str14 = user5.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        model.User.UserType userType8 = null;
        user5.setUserType(userType8);
        java.lang.String str10 = user5.getEmail();
        boolean boolean11 = user5.getStatus();
        boolean boolean12 = user5.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        model.User.UserType userType8 = null;
        user5.setUserType(userType8);
        java.lang.String str10 = user5.getPassword();
        user5.setEmail("hi!");
        user5.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "hi!", userType2, "", "");
        java.lang.String str6 = user5.getIDNum();
        user5.setEmail("hi!");
        user5.setEmail("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        model.User.UserType userType8 = null;
        user5.setUserType(userType8);
        java.lang.String str10 = user5.getEmail();
        java.lang.String str11 = user5.getIDNum();
        java.lang.String str12 = user5.getName();
        java.lang.String str13 = user5.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        java.lang.String str10 = user5.getEmail();
        java.lang.String str11 = user5.getName();
        user5.setEmail("");
        java.lang.String str14 = user5.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "hi!", userType2, "hi!", "hi!");
        user5.setEmail("hi!");
        java.lang.String str8 = user5.getIDNum();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        java.lang.String str10 = user5.getEmail();
        java.lang.String str11 = user5.getName();
        boolean boolean12 = user5.getStatus();
        java.lang.String str13 = user5.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        user5.setEmail("");
        user5.setIDNum("");
        user5.setPassword("hi!");
        java.lang.String str14 = user5.getEmail();
        user5.setPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "");
        user5.setStatus(true);
        java.lang.Class<?> wildcardClass8 = user5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        user5.setEmail("");
        user5.setIDNum("");
        java.lang.String str12 = user5.getEmail();
        java.lang.String str13 = user5.getEmail();
        java.lang.Class<?> wildcardClass14 = user5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "hi!", "");
        model.User.UserType userType6 = user5.getUserType();
        java.lang.String str7 = user5.getPassword();
        user5.setIDNum("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "hi!", userType2, "", "");
        user5.setPassword("hi!");
        java.lang.String str8 = user5.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "hi!", userType2, "hi!", "hi!");
        java.lang.String str6 = user5.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        user5.setStatus(false);
        model.User.UserType userType12 = null;
        user5.setUserType(userType12);
        user5.setEmail("");
        model.User.UserType userType16 = user5.getUserType();
        model.User.UserType userType17 = null;
        user5.setUserType(userType17);
        java.lang.String str19 = user5.getIDNum();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        user5.setStatus(false);
        java.lang.String str12 = user5.getEmail();
        java.lang.String str13 = user5.getName();
        boolean boolean14 = user5.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "hi!", userType2, "hi!", "");
        model.User.UserType userType6 = null;
        user5.setUserType(userType6);
        java.lang.String str8 = user5.getPassword();
        user5.setPassword("hi!");
        boolean boolean11 = user5.getStatus();
        java.lang.String str12 = user5.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        java.lang.String str10 = user5.getEmail();
        boolean boolean11 = user5.getStatus();
        java.lang.String str12 = user5.getIDNum();
        user5.setStatus(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "hi!", userType2, "", "");
        java.lang.String str6 = user5.getIDNum();
        user5.setEmail("hi!");
        java.lang.String str9 = user5.getPassword();
        model.User.UserType userType10 = null;
        user5.setUserType(userType10);
        boolean boolean12 = user5.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        java.lang.String str10 = user5.getEmail();
        boolean boolean11 = user5.getStatus();
        boolean boolean12 = user5.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "", "hi!");
        java.lang.String str6 = user5.getName();
        java.lang.String str7 = user5.getEmail();
        user5.setEmail("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        user5.setEmail("");
        user5.setIDNum("");
        java.lang.String str12 = user5.getName();
        user5.setEmail("");
        java.lang.String str15 = user5.getIDNum();
        java.lang.Class<?> wildcardClass16 = user5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "", "hi!");
        java.lang.String str6 = user5.getName();
        java.lang.String str7 = user5.getEmail();
        user5.setPassword("hi!");
        model.User.UserType userType10 = user5.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType10);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "hi!", "");
        model.User.UserType userType6 = user5.getUserType();
        java.lang.String str7 = user5.getPassword();
        user5.setEmail("");
        model.User.UserType userType10 = null;
        user5.setUserType(userType10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "hi!", "");
        user5.setPassword("hi!");
        user5.setEmail("");
        user5.setPassword("hi!");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "hi!", userType2, "", "");
        java.lang.String str6 = user5.getPassword();
        java.lang.Class<?> wildcardClass7 = user5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        user5.setEmail("");
        user5.setStatus(true);
        user5.setStatus(false);
        java.lang.String str14 = user5.getName();
        user5.setIDNum("");
        java.lang.String str17 = user5.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        model.User.UserType userType8 = null;
        user5.setUserType(userType8);
        java.lang.String str10 = user5.getEmail();
        java.lang.String str11 = user5.getPassword();
        model.User.UserType userType12 = null;
        user5.setUserType(userType12);
        java.lang.String str14 = user5.getEmail();
        user5.setEmail("");
        user5.setStatus(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        java.lang.String str10 = user5.getEmail();
        java.lang.String str11 = user5.getEmail();
        user5.setPassword("");
        java.lang.Class<?> wildcardClass14 = user5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "", "hi!");
        java.lang.String str6 = user5.getPassword();
        java.lang.String str7 = user5.getPassword();
        java.lang.String str8 = user5.getIDNum();
        java.lang.String str9 = user5.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "hi!", "");
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "", "hi!");
        java.lang.String str6 = user5.getName();
        java.lang.String str7 = user5.getEmail();
        user5.setPassword("hi!");
        java.lang.String str10 = user5.getName();
        user5.setIDNum("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "hi!", userType2, "hi!", "hi!");
        user5.setStatus(true);
        model.User.UserType userType8 = null;
        user5.setUserType(userType8);
        user5.setEmail("");
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        user5.setStatus(false);
        model.User.UserType userType12 = null;
        user5.setUserType(userType12);
        user5.setEmail("");
        user5.setPassword("");
        model.User.UserType userType18 = user5.getUserType();
        user5.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType18);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        user5.setEmail("");
        user5.setIDNum("");
        java.lang.String str12 = user5.getName();
        user5.setEmail("hi!");
        java.lang.String str15 = user5.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "hi!", userType2, "hi!", "");
        model.User.UserType userType6 = null;
        user5.setUserType(userType6);
        java.lang.String str8 = user5.getPassword();
        user5.setPassword("hi!");
        user5.setPassword("");
        user5.setPassword("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        user5.setPassword("hi!");
        user5.setPassword("");
        java.lang.String str13 = user5.getPassword();
        user5.setIDNum("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "");
        user5.setStatus(true);
        model.User.UserType userType8 = user5.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType8);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "hi!", userType2, "", "");
        java.lang.String str6 = user5.getIDNum();
        user5.setEmail("hi!");
        java.lang.String str9 = user5.getPassword();
        model.User.UserType userType10 = null;
        user5.setUserType(userType10);
        user5.setPassword("hi!");
        model.User.UserType userType14 = user5.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType14);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "hi!", "");
        user5.setStatus(false);
        java.lang.String str8 = user5.getIDNum();
        java.lang.Class<?> wildcardClass9 = user5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        user5.setEmail("");
        java.lang.String str10 = user5.getEmail();
        model.User.UserType userType11 = user5.getUserType();
        java.lang.String str12 = user5.getName();
        user5.setIDNum("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "hi!", "");
        user5.setStatus(false);
        java.lang.String str8 = user5.getIDNum();
        model.User.UserType userType9 = user5.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType9);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        user5.setStatus(false);
        model.User.UserType userType12 = null;
        user5.setUserType(userType12);
        user5.setEmail("");
        user5.setPassword("");
        java.lang.String str18 = user5.getName();
        user5.setPassword("hi!");
        java.lang.Class<?> wildcardClass21 = user5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "hi!", userType2, "", "");
        boolean boolean6 = user5.getStatus();
        user5.setIDNum("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "hi!", "");
        user5.setPassword("hi!");
        user5.setEmail("");
        model.User.UserType userType10 = null;
        user5.setUserType(userType10);
        java.lang.Class<?> wildcardClass12 = user5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        model.User.UserType userType8 = null;
        user5.setUserType(userType8);
        java.lang.String str10 = user5.getEmail();
        java.lang.String str11 = user5.getPassword();
        model.User.UserType userType12 = null;
        user5.setUserType(userType12);
        user5.setPassword("");
        user5.setEmail("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        model.User.UserType userType8 = null;
        user5.setUserType(userType8);
        java.lang.String str10 = user5.getEmail();
        java.lang.String str11 = user5.getIDNum();
        java.lang.String str12 = user5.getName();
        model.User.UserType userType13 = null;
        user5.setUserType(userType13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        model.User.UserType userType8 = null;
        user5.setUserType(userType8);
        java.lang.String str10 = user5.getEmail();
        java.lang.String str11 = user5.getPassword();
        model.User.UserType userType12 = null;
        user5.setUserType(userType12);
        user5.setEmail("");
        java.lang.String str16 = user5.getName();
        java.lang.String str17 = user5.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        user5.setStatus(false);
        model.User.UserType userType12 = null;
        user5.setUserType(userType12);
        user5.setEmail("");
        user5.setPassword("");
        model.User.UserType userType18 = user5.getUserType();
        java.lang.Class<?> wildcardClass19 = user5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        java.lang.String str10 = user5.getEmail();
        model.User.UserType userType11 = null;
        user5.setUserType(userType11);
        boolean boolean13 = user5.getStatus();
        java.lang.String str14 = user5.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "", "hi!");
        java.lang.String str6 = user5.getName();
        model.User.UserType userType7 = null;
        user5.setUserType(userType7);
        java.lang.String str9 = user5.getPassword();
        user5.setIDNum("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        user5.setStatus(false);
        model.User.UserType userType12 = null;
        user5.setUserType(userType12);
        user5.setEmail("");
        user5.setPassword("");
        java.lang.String str18 = user5.getName();
        user5.setPassword("hi!");
        boolean boolean21 = user5.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        model.User.UserType userType8 = null;
        user5.setUserType(userType8);
        java.lang.String str10 = user5.getEmail();
        java.lang.String str11 = user5.getPassword();
        boolean boolean12 = user5.getStatus();
        java.lang.String str13 = user5.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "", "hi!");
        java.lang.String str6 = user5.getEmail();
        java.lang.String str7 = user5.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "hi!", userType2, "hi!", "");
        model.User.UserType userType6 = null;
        user5.setUserType(userType6);
        java.lang.String str8 = user5.getPassword();
        user5.setPassword("hi!");
        java.lang.String str11 = user5.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "hi!", "");
        user5.setPassword("hi!");
        user5.setIDNum("hi!");
        user5.setStatus(true);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "", "hi!");
        model.User.UserType userType6 = null;
        user5.setUserType(userType6);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "hi!", userType2, "", "");
        boolean boolean6 = user5.getStatus();
        java.lang.String str7 = user5.getName();
        java.lang.String str8 = user5.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "hi!", userType2, "hi!", "");
        model.User.UserType userType6 = null;
        user5.setUserType(userType6);
        java.lang.String str8 = user5.getPassword();
        user5.setPassword("hi!");
        user5.setPassword("");
        java.lang.String str13 = user5.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        user5.setEmail("");
        user5.setIDNum("");
        user5.setPassword("hi!");
        model.User.UserType userType14 = null;
        user5.setUserType(userType14);
        model.User.UserType userType16 = user5.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType16);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        java.lang.String str10 = user5.getEmail();
        model.User.UserType userType11 = null;
        user5.setUserType(userType11);
        user5.setStatus(false);
        java.lang.String str15 = user5.getIDNum();
        user5.setPassword("");
        user5.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "hi!", "");
        user5.setPassword("hi!");
        user5.setEmail("");
        user5.setEmail("");
        java.lang.String str12 = user5.getPassword();
        java.lang.String str13 = user5.getEmail();
        java.lang.Class<?> wildcardClass14 = user5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "hi!", userType2, "", "");
        java.lang.String str6 = user5.getIDNum();
        user5.setEmail("hi!");
        user5.setStatus(false);
        java.lang.String str11 = user5.getIDNum();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "hi!", "");
        user5.setStatus(false);
        user5.setIDNum("");
        model.User.UserType userType10 = null;
        user5.setUserType(userType10);
        user5.setIDNum("hi!");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        user5.setStatus(false);
        model.User.UserType userType12 = null;
        user5.setUserType(userType12);
        user5.setEmail("");
        user5.setPassword("");
        java.lang.String str18 = user5.getName();
        java.lang.String str19 = user5.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        user5.setStatus(false);
        java.lang.String str12 = user5.getEmail();
        java.lang.String str13 = user5.getName();
        user5.setStatus(true);
        user5.setPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        user5.setEmail("");
        user5.setIDNum("hi!");
        user5.setIDNum("hi!");
        user5.setPassword("");
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "hi!", userType2, "hi!", "");
        java.lang.String str6 = user5.getEmail();
        model.User.UserType userType7 = user5.getUserType();
        java.lang.String str8 = user5.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "hi!", userType2, "hi!", "");
        java.lang.String str6 = user5.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "", "hi!");
        java.lang.String str6 = user5.getName();
        java.lang.String str7 = user5.getIDNum();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "hi!", "");
        user5.setStatus(false);
        user5.setIDNum("");
        user5.setIDNum("");
        user5.setPassword("");
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        model.User.UserType userType9 = null;
        user5.setUserType(userType9);
        java.lang.String str11 = user5.getEmail();
        user5.setEmail("hi!");
        java.lang.String str14 = user5.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        java.lang.String str10 = user5.getEmail();
        model.User.UserType userType11 = null;
        user5.setUserType(userType11);
        boolean boolean13 = user5.getStatus();
        user5.setPassword("");
        java.lang.Class<?> wildcardClass16 = user5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        java.lang.String str10 = user5.getIDNum();
        model.User.UserType userType11 = null;
        user5.setUserType(userType11);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "hi!", "");
        user5.setPassword("hi!");
        user5.setEmail("");
        user5.setEmail("");
        user5.setPassword("hi!");
        model.User.UserType userType14 = null;
        user5.setUserType(userType14);
        java.lang.String str16 = user5.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        user5.setStatus(false);
        java.lang.String str12 = user5.getEmail();
        java.lang.String str13 = user5.getPassword();
        boolean boolean14 = user5.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        java.lang.String str8 = user5.getEmail();
        java.lang.String str9 = user5.getIDNum();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        user5.setEmail("");
        java.lang.String str10 = user5.getEmail();
        model.User.UserType userType11 = user5.getUserType();
        user5.setEmail("hi!");
        user5.setIDNum("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType11);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "", "hi!");
        java.lang.String str6 = user5.getName();
        boolean boolean7 = user5.getStatus();
        java.lang.String str8 = user5.getIDNum();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "");
        java.lang.Class<?> wildcardClass6 = user5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        user5.setEmail("");
        user5.setIDNum("");
        java.lang.Class<?> wildcardClass12 = user5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        user5.setEmail("");
        user5.setStatus(true);
        java.lang.String str12 = user5.getEmail();
        user5.setEmail("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "hi!", "");
        user5.setPassword("hi!");
        user5.setIDNum("hi!");
        java.lang.String str10 = user5.getName();
        boolean boolean11 = user5.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        model.User.UserType userType8 = null;
        user5.setUserType(userType8);
        user5.setEmail("");
        user5.setPassword("");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        user5.setEmail("");
        java.lang.String str10 = user5.getPassword();
        user5.setIDNum("");
        user5.setStatus(true);
        user5.setPassword("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        model.User.UserType userType8 = null;
        user5.setUserType(userType8);
        java.lang.String str10 = user5.getEmail();
        java.lang.String str11 = user5.getPassword();
        boolean boolean12 = user5.getStatus();
        java.lang.String str13 = user5.getPassword();
        user5.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        java.lang.String str10 = user5.getEmail();
        java.lang.String str11 = user5.getName();
        java.lang.String str12 = user5.getName();
        java.lang.Class<?> wildcardClass13 = user5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "hi!", "");
        model.User.UserType userType6 = user5.getUserType();
        java.lang.String str7 = user5.getPassword();
        java.lang.String str8 = user5.getIDNum();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        model.User.UserType userType8 = null;
        user5.setUserType(userType8);
        java.lang.String str10 = user5.getEmail();
        java.lang.String str11 = user5.getPassword();
        user5.setIDNum("hi!");
        user5.setStatus(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        model.User.UserType userType8 = null;
        user5.setUserType(userType8);
        model.User.UserType userType10 = user5.getUserType();
        model.User.UserType userType11 = null;
        user5.setUserType(userType11);
        model.User.UserType userType13 = user5.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType13);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "", "hi!");
        java.lang.String str6 = user5.getName();
        model.User.UserType userType7 = null;
        user5.setUserType(userType7);
        user5.setEmail("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "hi!", "");
        user5.setPassword("hi!");
        user5.setEmail("");
        user5.setEmail("");
        java.lang.String str12 = user5.getPassword();
        java.lang.String str13 = user5.getEmail();
        java.lang.String str14 = user5.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "hi!", userType2, "hi!", "hi!");
        java.lang.String str6 = user5.getPassword();
        java.lang.String str7 = user5.getIDNum();
        java.lang.String str8 = user5.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!" + "'", str7.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "hi!", "");
        user5.setStatus(false);
        user5.setIDNum("");
        user5.setPassword("");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        java.lang.String str10 = user5.getEmail();
        user5.setIDNum("hi!");
        boolean boolean13 = user5.getStatus();
        model.User.UserType userType14 = null;
        user5.setUserType(userType14);
        java.lang.String str16 = user5.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "", "hi!");
        java.lang.String str6 = user5.getEmail();
        model.User.UserType userType7 = null;
        user5.setUserType(userType7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        model.User.UserType userType8 = null;
        user5.setUserType(userType8);
        java.lang.String str10 = user5.getEmail();
        boolean boolean11 = user5.getStatus();
        user5.setPassword("hi!");
        java.lang.Class<?> wildcardClass14 = user5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "", "hi!");
        java.lang.String str6 = user5.getName();
        java.lang.Class<?> wildcardClass7 = user5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "hi!", "");
        model.User.UserType userType6 = user5.getUserType();
        java.lang.String str7 = user5.getPassword();
        user5.setEmail("");
        java.lang.Class<?> wildcardClass10 = user5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        model.User.UserType userType8 = null;
        user5.setUserType(userType8);
        java.lang.String str10 = user5.getEmail();
        boolean boolean11 = user5.getStatus();
        user5.setPassword("hi!");
        boolean boolean14 = user5.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        user5.setPassword("");
        user5.setEmail("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        user5.setStatus(false);
        model.User.UserType userType12 = null;
        user5.setUserType(userType12);
        user5.setEmail("");
        user5.setPassword("");
        java.lang.String str18 = user5.getName();
        user5.setPassword("hi!");
        java.lang.String str21 = user5.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        user5.setEmail("");
        user5.setStatus(true);
        user5.setStatus(false);
        java.lang.String str14 = user5.getName();
        user5.setIDNum("");
        model.User.UserType userType17 = user5.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType17);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "hi!", userType2, "hi!", "");
        model.User.UserType userType6 = null;
        user5.setUserType(userType6);
        java.lang.String str8 = user5.getName();
        model.User.UserType userType9 = null;
        user5.setUserType(userType9);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        java.lang.String str10 = user5.getEmail();
        user5.setIDNum("hi!");
        java.lang.String str13 = user5.getEmail();
        java.lang.Class<?> wildcardClass14 = user5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        user5.setStatus(false);
        java.lang.String str12 = user5.getEmail();
        java.lang.String str13 = user5.getName();
        user5.setPassword("hi!");
        java.lang.String str16 = user5.getIDNum();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        user5.setStatus(false);
        java.lang.String str12 = user5.getEmail();
        boolean boolean13 = user5.getStatus();
        java.lang.String str14 = user5.getIDNum();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "hi!", userType2, "hi!", "hi!");
        user5.setPassword("");
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        java.lang.String str10 = user5.getEmail();
        model.User.UserType userType11 = null;
        user5.setUserType(userType11);
        user5.setPassword("");
        boolean boolean15 = user5.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        model.User.UserType userType8 = null;
        user5.setUserType(userType8);
        java.lang.String str10 = user5.getName();
        java.lang.String str11 = user5.getIDNum();
        java.lang.String str12 = user5.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "", "hi!");
        user5.setEmail("");
        java.lang.String str8 = user5.getIDNum();
        java.lang.Class<?> wildcardClass9 = user5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        user5.setEmail("");
        user5.setIDNum("");
        java.lang.String str12 = user5.getName();
        user5.setEmail("");
        user5.setIDNum("hi!");
        user5.setEmail("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "hi!", "");
        model.User.UserType userType6 = user5.getUserType();
        java.lang.String str7 = user5.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "hi!", userType2, "", "");
        user5.setPassword("hi!");
        java.lang.String str8 = user5.getIDNum();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        model.User.UserType userType8 = null;
        user5.setUserType(userType8);
        java.lang.String str10 = user5.getEmail();
        java.lang.String str11 = user5.getIDNum();
        java.lang.String str12 = user5.getName();
        boolean boolean13 = user5.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        user5.setStatus(false);
        model.User.UserType userType12 = null;
        user5.setUserType(userType12);
        model.User.UserType userType14 = user5.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType14);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        java.lang.String str10 = user5.getEmail();
        boolean boolean11 = user5.getStatus();
        java.lang.Class<?> wildcardClass12 = user5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        java.lang.String str10 = user5.getName();
        model.User.UserType userType11 = user5.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType11);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        model.User.UserType userType8 = null;
        user5.setUserType(userType8);
        java.lang.String str10 = user5.getEmail();
        java.lang.String str11 = user5.getPassword();
        user5.setIDNum("hi!");
        user5.setEmail("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "hi!", "");
        model.User.UserType userType6 = user5.getUserType();
        model.User.UserType userType7 = user5.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType6);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType7);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        user5.setEmail("");
        user5.setIDNum("");
        user5.setPassword("hi!");
        java.lang.String str14 = user5.getPassword();
        boolean boolean15 = user5.getStatus();
        model.User.UserType userType16 = null;
        user5.setUserType(userType16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "hi!", "");
        user5.setPassword("hi!");
        user5.setEmail("");
        model.User.UserType userType10 = null;
        user5.setUserType(userType10);
        java.lang.String str12 = user5.getName();
        user5.setStatus(true);
        user5.setIDNum("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        user5.setEmail("");
        user5.setIDNum("");
        user5.setPassword("hi!");
        user5.setIDNum("");
        java.lang.String str16 = user5.getIDNum();
        java.lang.String str17 = user5.getIDNum();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        model.User.UserType userType8 = user5.getUserType();
        java.lang.String str9 = user5.getEmail();
        boolean boolean10 = user5.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        user5.setStatus(false);
        java.lang.String str10 = user5.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "hi!", userType2, "hi!", "");
        model.User.UserType userType6 = null;
        user5.setUserType(userType6);
        user5.setIDNum("hi!");
        user5.setIDNum("hi!");
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "hi!", "");
        java.lang.String str6 = user5.getIDNum();
        user5.setEmail("");
        java.lang.String str9 = user5.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "hi!", "");
        user5.setPassword("hi!");
        user5.setEmail("");
        boolean boolean10 = user5.getStatus();
        user5.setIDNum("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        java.lang.String str8 = user5.getIDNum();
        java.lang.String str9 = user5.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        model.User.UserType userType8 = null;
        user5.setUserType(userType8);
        java.lang.String str10 = user5.getEmail();
        java.lang.String str11 = user5.getPassword();
        model.User.UserType userType12 = null;
        user5.setUserType(userType12);
        java.lang.String str14 = user5.getEmail();
        user5.setEmail("");
        java.lang.String str17 = user5.getEmail();
        java.lang.String str18 = user5.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        user5.setEmail("");
        user5.setStatus(true);
        java.lang.String str12 = user5.getEmail();
        user5.setStatus(false);
        model.User.UserType userType15 = null;
        user5.setUserType(userType15);
        java.lang.String str17 = user5.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "hi!", "");
        user5.setPassword("hi!");
        user5.setEmail("");
        user5.setEmail("");
        user5.setEmail("");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        model.User.UserType userType8 = null;
        user5.setUserType(userType8);
        java.lang.String str10 = user5.getEmail();
        java.lang.String str11 = user5.getPassword();
        model.User.UserType userType12 = null;
        user5.setUserType(userType12);
        user5.setEmail("");
        java.lang.String str16 = user5.getIDNum();
        java.lang.String str17 = user5.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        java.lang.String str10 = user5.getEmail();
        java.lang.String str11 = user5.getEmail();
        user5.setPassword("");
        java.lang.String str14 = user5.getName();
        java.lang.String str15 = user5.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        user5.setPassword("hi!");
        user5.setPassword("");
        java.lang.String str13 = user5.getEmail();
        java.lang.String str14 = user5.getEmail();
        user5.setEmail("");
        boolean boolean17 = user5.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "hi!" + "'", str13.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        model.User.UserType userType8 = null;
        user5.setUserType(userType8);
        java.lang.String str10 = user5.getEmail();
        java.lang.String str11 = user5.getPassword();
        boolean boolean12 = user5.getStatus();
        java.lang.String str13 = user5.getPassword();
        user5.setEmail("hi!");
        user5.setIDNum("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        java.lang.String str10 = user5.getEmail();
        java.lang.String str11 = user5.getName();
        user5.setEmail("");
        java.lang.String str14 = user5.getName();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        user5.setStatus(false);
        java.lang.String str12 = user5.getEmail();
        model.User.UserType userType13 = user5.getUserType();
        user5.setEmail("hi!");
        user5.setPassword("");
        java.lang.String str18 = user5.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "", "hi!");
        java.lang.String str6 = user5.getPassword();
        java.lang.String str7 = user5.getEmail();
        boolean boolean8 = user5.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        model.User.UserType userType8 = null;
        user5.setUserType(userType8);
        java.lang.String str10 = user5.getName();
        user5.setStatus(false);
        user5.setEmail("");
        java.lang.String str15 = user5.getPassword();
        model.User.UserType userType16 = user5.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType16);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        user5.setStatus(false);
        model.User.UserType userType12 = null;
        user5.setUserType(userType12);
        java.lang.String str14 = user5.getName();
        java.lang.String str15 = user5.getPassword();
        boolean boolean16 = user5.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "hi!", userType2, "hi!", "hi!");
        user5.setStatus(true);
        model.User.UserType userType8 = null;
        user5.setUserType(userType8);
        java.lang.String str10 = user5.getIDNum();
        java.lang.String str11 = user5.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "", "hi!");
        java.lang.String str6 = user5.getPassword();
        java.lang.String str7 = user5.getPassword();
        java.lang.String str8 = user5.getIDNum();
        java.lang.String str9 = user5.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "hi!", userType2, "", "hi!");
        user5.setPassword("");
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "hi!", userType2, "", "hi!");
        model.User.UserType userType6 = null;
        user5.setUserType(userType6);
        java.lang.String str8 = user5.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        user5.setStatus(false);
        model.User.UserType userType12 = null;
        user5.setUserType(userType12);
        user5.setEmail("");
        user5.setPassword("");
        model.User.UserType userType18 = user5.getUserType();
        user5.setPassword("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType18);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        user5.setEmail("");
        user5.setStatus(true);
        user5.setIDNum("hi!");
        user5.setEmail("hi!");
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        user5.setEmail("");
        java.lang.String str10 = user5.getPassword();
        user5.setIDNum("");
        user5.setStatus(true);
        model.User.UserType userType15 = user5.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType15);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "hi!", userType2, "", "");
        java.lang.String str6 = user5.getIDNum();
        user5.setEmail("hi!");
        java.lang.String str9 = user5.getPassword();
        model.User.UserType userType10 = null;
        user5.setUserType(userType10);
        user5.setPassword("hi!");
        java.lang.String str14 = user5.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "hi!", "");
        user5.setPassword("hi!");
        java.lang.String str8 = user5.getIDNum();
        java.lang.String str9 = user5.getPassword();
        user5.setPassword("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "hi!" + "'", str9.equals("hi!"));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        java.lang.String str10 = user5.getEmail();
        model.User.UserType userType11 = null;
        user5.setUserType(userType11);
        boolean boolean13 = user5.getStatus();
        java.lang.String str14 = user5.getPassword();
        user5.setStatus(false);
        java.lang.String str17 = user5.getIDNum();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "hi!", userType2, "", "");
        java.lang.String str6 = user5.getIDNum();
        user5.setEmail("hi!");
        model.User.UserType userType9 = null;
        user5.setUserType(userType9);
        java.lang.String str11 = user5.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        java.lang.String str10 = user5.getEmail();
        user5.setIDNum("hi!");
        model.User.UserType userType13 = null;
        user5.setUserType(userType13);
        java.lang.String str15 = user5.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        model.User.UserType userType8 = null;
        user5.setUserType(userType8);
        model.User.UserType userType10 = user5.getUserType();
        java.lang.String str11 = user5.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType10);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "hi!", "");
        java.lang.String str6 = user5.getIDNum();
        user5.setEmail("");
        java.lang.String str9 = user5.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        java.lang.String str10 = user5.getEmail();
        model.User.UserType userType11 = null;
        user5.setUserType(userType11);
        user5.setStatus(false);
        java.lang.String str15 = user5.getEmail();
        java.lang.String str16 = user5.getEmail();
        user5.setEmail("");
        model.User.UserType userType19 = null;
        user5.setUserType(userType19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "hi!" + "'", str16.equals("hi!"));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        java.lang.String str10 = user5.getEmail();
        model.User.UserType userType11 = null;
        user5.setUserType(userType11);
        java.lang.String str13 = user5.getPassword();
        boolean boolean14 = user5.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        java.lang.String str10 = user5.getEmail();
        model.User.UserType userType11 = null;
        user5.setUserType(userType11);
        java.lang.String str13 = user5.getPassword();
        user5.setStatus(true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("", "", userType2, "", "hi!");
        java.lang.String str6 = user5.getName();
        model.User.UserType userType7 = user5.getUserType();
        boolean boolean8 = user5.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType7);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        model.User.UserType userType8 = null;
        user5.setUserType(userType8);
        java.lang.String str10 = user5.getName();
        user5.setStatus(false);
        user5.setEmail("");
        java.lang.String str15 = user5.getPassword();
        boolean boolean16 = user5.getStatus();
        user5.setPassword("");
        model.User.UserType userType19 = user5.getUserType();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(userType19);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        java.lang.String str10 = user5.getEmail();
        boolean boolean11 = user5.getStatus();
        user5.setEmail("hi!");
        model.User.UserType userType14 = null;
        user5.setUserType(userType14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        user5.setStatus(false);
        model.User.UserType userType12 = null;
        user5.setUserType(userType12);
        user5.setEmail("");
        user5.setPassword("");
        java.lang.String str18 = user5.getName();
        user5.setPassword("hi!");
        java.lang.String str21 = user5.getIDNum();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "hi!" + "'", str18.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "hi!" + "'", str21.equals("hi!"));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        java.lang.String str10 = user5.getEmail();
        model.User.UserType userType11 = null;
        user5.setUserType(userType11);
        user5.setStatus(false);
        java.lang.String str15 = user5.getIDNum();
        user5.setPassword("");
        boolean boolean18 = user5.getStatus();
        java.lang.String str19 = user5.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        java.lang.String str10 = user5.getEmail();
        boolean boolean11 = user5.getStatus();
        java.lang.String str12 = user5.getIDNum();
        user5.setPassword("");
        user5.setPassword("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("");
        model.User.UserType userType8 = null;
        user5.setUserType(userType8);
        java.lang.String str10 = user5.getEmail();
        java.lang.String str11 = user5.getIDNum();
        java.lang.String str12 = user5.getName();
        user5.setIDNum("");
        user5.setStatus(false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "hi!" + "'", str12.equals("hi!"));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        user5.setEmail("");
        user5.setStatus(true);
        user5.setIDNum("hi!");
        user5.setStatus(true);
        user5.setStatus(false);
        model.User.UserType userType18 = null;
        user5.setUserType(userType18);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "hi!", userType2, "hi!", "hi!");
        user5.setEmail("hi!");
        java.lang.String str8 = user5.getEmail();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        user5.setEmail("");
        user5.setIDNum("");
        user5.setPassword("hi!");
        java.lang.String str14 = user5.getPassword();
        boolean boolean15 = user5.getStatus();
        java.lang.String str16 = user5.getIDNum();
        java.lang.String str17 = user5.getIDNum();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "hi!" + "'", str14.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        boolean boolean8 = user5.getStatus();
        boolean boolean9 = user5.getStatus();
        java.lang.String str10 = user5.getEmail();
        model.User.UserType userType11 = null;
        user5.setUserType(userType11);
        boolean boolean13 = user5.getStatus();
        java.lang.String str14 = user5.getPassword();
        user5.setStatus(false);
        boolean boolean17 = user5.getStatus();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "hi!" + "'", str10.equals("hi!"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        user5.setEmail("");
        user5.setIDNum("");
        java.lang.String str12 = user5.getEmail();
        user5.setPassword("hi!");
        java.lang.String str15 = user5.getPassword();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "hi!" + "'", str15.equals("hi!"));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        user5.setEmail("");
        user5.setStatus(true);
        java.lang.String str12 = user5.getEmail();
        user5.setStatus(false);
        model.User.UserType userType15 = null;
        user5.setUserType(userType15);
        java.lang.String str17 = user5.getIDNum();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "hi!" + "'", str17.equals("hi!"));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        model.User.UserType userType2 = null;
        model.User.User user5 = new model.User.User("hi!", "", userType2, "", "hi!");
        user5.setIDNum("hi!");
        user5.setEmail("");
        user5.setIDNum("");
        user5.setPassword("hi!");
        boolean boolean14 = user5.getStatus();
        java.lang.Class<?> wildcardClass15 = user5.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }
}

