package model.controller;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserControllerRegressionTest {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        model.User.User user0 = null;
        controller.UserController.setLoggedInUser(user0);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        model.User.User user0 = controller.UserController.getLoggedInUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNull(user0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        model.User.UserType userType9 = null;
        java.lang.String str12 = userController0.registerUser("hi!", "Invalid email", userType9, "Invalid email", "Fail");
        java.lang.Class<?> wildcardClass13 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Invalid email" + "'", str12.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        model.User.UserType userType9 = null;
        java.lang.String str12 = userController0.registerUser("", "Invalid email", userType9, "Invalid email", "Fail");
        java.lang.Class<?> wildcardClass13 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Invalid email" + "'", str12.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str3 = userController0.loginUser("hi!", "hi!");
        java.lang.String str6 = userController0.loginUser("", "");
        java.lang.Class<?> wildcardClass7 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Fail" + "'", str3.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        controller.UserController userController0 = controller.UserController.getInstance();
        java.lang.String str1 = userController0.createLabManagerUser();
        java.lang.Class<?> wildcardClass2 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.Class<?> wildcardClass3 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        java.lang.Class<?> wildcardClass7 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str3 = userController0.loginUser("hi!", "hi!");
        java.lang.String str6 = userController0.loginUser("", "");
        java.lang.String str7 = userController0.createLabManagerUser();
        java.lang.Class<?> wildcardClass8 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Fail" + "'", str3.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        java.lang.String str10 = userController0.createLabManagerUser();
        boolean boolean12 = userController0.removeUser("");
        model.User.UserType userType15 = null;
        java.lang.String str18 = userController0.registerUser("hi!", "hi!", userType15, "Fail", "Fail");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Invalid email" + "'", str18.equals("Invalid email"));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        boolean boolean10 = userController0.removeUser("Fail");
        model.User.UserType userType13 = null;
        java.lang.String str16 = userController0.registerUser("Fail", "", userType13, "", "Invalid email");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Invalid email" + "'", str16.equals("Invalid email"));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        model.User.UserType userType12 = null;
        java.lang.String str15 = userController0.registerUser("", "Fail", userType12, "hi!", "hi!");
        java.lang.Class<?> wildcardClass16 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Invalid email" + "'", str15.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        boolean boolean10 = userController0.removeUser("Invalid email");
        java.lang.String str13 = userController0.loginUser("Invalid email", "Fail");
        boolean boolean15 = userController0.removeUser("hi!");
        java.lang.Class<?> wildcardClass16 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        boolean boolean10 = userController0.removeUser("");
        model.User.UserType userType13 = null;
        java.lang.String str16 = userController0.registerUser("Fail", "", userType13, "", "Invalid email");
        boolean boolean18 = userController0.removeUser("hi!");
        java.lang.Class<?> wildcardClass19 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Invalid email" + "'", str16.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        java.lang.String str11 = userController0.loginUser("", "Fail");
        model.User.UserType userType14 = null;
        java.lang.String str17 = userController0.registerUser("Fail", "Invalid email", userType14, "Invalid email", "Invalid email");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Fail" + "'", str11.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Invalid email" + "'", str17.equals("Invalid email"));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str3 = userController0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass4 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Fail" + "'", str3.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        java.lang.String str10 = userController0.createLabManagerUser();
        boolean boolean12 = userController0.removeUser("");
        java.lang.String str13 = userController0.createLabManagerUser();
        java.lang.Class<?> wildcardClass14 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        boolean boolean8 = userController0.removeUser("Fail");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("Invalid email");
        java.lang.Class<?> wildcardClass9 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        java.lang.String str11 = userController0.loginUser("", "Fail");
        java.lang.Class<?> wildcardClass12 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Fail" + "'", str11.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        java.lang.String str9 = userController0.createLabManagerUser();
        boolean boolean11 = userController0.approveUser("");
        model.User.UserType userType14 = null;
        java.lang.String str17 = userController0.registerUser("hi!", "", userType14, "hi!", "Fail");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Invalid email" + "'", str17.equals("Invalid email"));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.approveUser("hi!");
        boolean boolean10 = userController0.removeUser("Fail");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.approveUser("hi!");
        boolean boolean10 = userController0.removeUser("Invalid email");
        java.lang.String str13 = userController0.loginUser("hi!", "Fail");
        java.lang.Class<?> wildcardClass14 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        boolean boolean10 = userController0.removeUser("Invalid email");
        java.lang.String str13 = userController0.loginUser("Invalid email", "Fail");
        boolean boolean15 = userController0.approveUser("");
        java.lang.Class<?> wildcardClass16 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        boolean boolean10 = userController0.removeUser("");
        model.User.UserType userType13 = null;
        java.lang.String str16 = userController0.registerUser("Fail", "", userType13, "", "Invalid email");
        boolean boolean18 = userController0.removeUser("hi!");
        java.lang.String str21 = userController0.loginUser("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Invalid email" + "'", str16.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Fail" + "'", str21.equals("Fail"));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        boolean boolean10 = userController0.removeUser("Invalid email");
        java.lang.String str13 = userController0.loginUser("Invalid email", "Fail");
        java.lang.Class<?> wildcardClass14 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        java.lang.String str11 = userController0.loginUser("", "Fail");
        java.lang.String str14 = userController0.loginUser("hi!", "Fail");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Fail" + "'", str11.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Fail" + "'", str14.equals("Fail"));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        boolean boolean10 = userController0.removeUser("Invalid email");
        java.lang.String str13 = userController0.loginUser("Invalid email", "Fail");
        boolean boolean15 = userController0.removeUser("hi!");
        java.lang.String str16 = userController0.createLabManagerUser();
        boolean boolean18 = userController0.approveUser("Invalid email");
        model.User.UserType userType21 = null;
        java.lang.String str24 = userController0.registerUser("", "", userType21, "hi!", "Invalid email");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Invalid email" + "'", str24.equals("Invalid email"));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str1 = userController0.createLabManagerUser();
        boolean boolean3 = userController0.approveUser("Fail");
        java.lang.String str6 = userController0.loginUser("Invalid email", "Invalid email");
        model.User.UserType userType9 = null;
        java.lang.String str12 = userController0.registerUser("Invalid email", "Fail", userType9, "hi!", "Fail");
        java.lang.Class<?> wildcardClass13 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Invalid email" + "'", str12.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        controller.UserController userController0 = controller.UserController.getInstance();
        java.lang.String str1 = userController0.createLabManagerUser();
        boolean boolean3 = userController0.removeUser("Fail");
        java.lang.Class<?> wildcardClass4 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str3 = userController0.loginUser("Fail", "hi!");
        java.lang.String str6 = userController0.loginUser("hi!", "");
        model.User.UserType userType9 = null;
        java.lang.String str12 = userController0.registerUser("Invalid email", "hi!", userType9, "hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Fail" + "'", str3.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Invalid email" + "'", str12.equals("Invalid email"));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        boolean boolean10 = userController0.removeUser("Fail");
        java.lang.String str13 = userController0.loginUser("hi!", "Fail");
        java.lang.String str16 = userController0.loginUser("Invalid email", "Fail");
        java.lang.String str17 = userController0.createLabManagerUser();
        model.User.UserType userType20 = null;
        java.lang.String str23 = userController0.registerUser("hi!", "", userType20, "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Fail" + "'", str16.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Invalid email" + "'", str23.equals("Invalid email"));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        java.lang.String str10 = userController0.createLabManagerUser();
        boolean boolean12 = userController0.approveUser("");
        boolean boolean14 = userController0.approveUser("Invalid email");
        java.lang.Class<?> wildcardClass15 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        java.lang.String str9 = userController0.createLabManagerUser();
        boolean boolean11 = userController0.removeUser("");
        java.lang.Class<?> wildcardClass12 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.approveUser("Fail");
        model.User.UserType userType11 = null;
        java.lang.String str14 = userController0.registerUser("Fail", "Fail", userType11, "Invalid email", "hi!");
        model.User.UserType userType17 = null;
        java.lang.String str20 = userController0.registerUser("Fail", "Invalid email", userType17, "Fail", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Invalid email" + "'", str14.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Invalid email" + "'", str20.equals("Invalid email"));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str1 = userController0.createLabManagerUser();
        boolean boolean3 = userController0.removeUser("");
        java.lang.String str6 = userController0.loginUser("Invalid email", "");
        model.User.UserType userType9 = null;
        java.lang.String str12 = userController0.registerUser("Fail", "Fail", userType9, "hi!", "Invalid email");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Invalid email" + "'", str12.equals("Invalid email"));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.approveUser("Fail");
        model.User.UserType userType11 = null;
        java.lang.String str14 = userController0.registerUser("", "hi!", userType11, "Invalid email", "Fail");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Invalid email" + "'", str14.equals("Invalid email"));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        model.User.UserType userType9 = null;
        java.lang.String str12 = userController0.registerUser("hi!", "hi!", userType9, "hi!", "Fail");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Invalid email" + "'", str12.equals("Invalid email"));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        controller.UserController userController0 = controller.UserController.getInstance();
        java.lang.String str1 = userController0.createLabManagerUser();
        boolean boolean3 = userController0.removeUser("");
        model.User.UserType userType6 = null;
        java.lang.String str9 = userController0.registerUser("", "", userType6, "Fail", "");
        java.lang.Class<?> wildcardClass10 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Invalid email" + "'", str9.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        java.lang.String str9 = userController0.createLabManagerUser();
        model.User.UserType userType12 = null;
        java.lang.String str15 = userController0.registerUser("", "hi!", userType12, "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Invalid email" + "'", str15.equals("Invalid email"));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str1 = userController0.createLabManagerUser();
        boolean boolean3 = userController0.approveUser("Fail");
        java.lang.String str6 = userController0.loginUser("Invalid email", "Invalid email");
        java.lang.Class<?> wildcardClass7 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str3 = userController0.loginUser("hi!", "hi!");
        java.lang.String str6 = userController0.loginUser("", "");
        java.lang.String str7 = userController0.createLabManagerUser();
        java.lang.String str10 = userController0.loginUser("", "Fail");
        java.lang.Class<?> wildcardClass11 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Fail" + "'", str3.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Fail" + "'", str10.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        boolean boolean10 = userController0.removeUser("Invalid email");
        java.lang.String str13 = userController0.loginUser("Fail", "Fail");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str3 = userController0.loginUser("hi!", "hi!");
        java.lang.String str6 = userController0.loginUser("", "");
        java.lang.String str7 = userController0.createLabManagerUser();
        java.lang.String str10 = userController0.loginUser("", "Fail");
        boolean boolean12 = userController0.approveUser("");
        java.lang.Class<?> wildcardClass13 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Fail" + "'", str3.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Fail" + "'", str10.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        java.lang.String str10 = userController0.createLabManagerUser();
        boolean boolean12 = userController0.removeUser("Fail");
        java.lang.String str15 = userController0.loginUser("Invalid email", "Fail");
        model.User.UserType userType18 = null;
        java.lang.String str21 = userController0.registerUser("Invalid email", "Fail", userType18, "Invalid email", "Fail");
        boolean boolean23 = userController0.approveUser("Fail");
        java.lang.String str26 = userController0.loginUser("Fail", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Fail" + "'", str15.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Invalid email" + "'", str21.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Fail" + "'", str26.equals("Fail"));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        boolean boolean11 = userController0.approveUser("Invalid email");
        java.lang.String str12 = userController0.createLabManagerUser();
        boolean boolean14 = userController0.approveUser("Fail");
        boolean boolean16 = userController0.approveUser("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        boolean boolean10 = userController0.removeUser("Fail");
        java.lang.String str13 = userController0.loginUser("", "Fail");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        model.User.UserType userType11 = null;
        java.lang.String str14 = userController0.registerUser("", "Invalid email", userType11, "hi!", "");
        java.lang.Class<?> wildcardClass15 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Invalid email" + "'", str14.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str1 = userController0.createLabManagerUser();
        model.User.UserType userType4 = null;
        java.lang.String str7 = userController0.registerUser("Fail", "", userType4, "Fail", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Invalid email" + "'", str7.equals("Invalid email"));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        boolean boolean11 = userController0.removeUser("Fail");
        java.lang.String str14 = userController0.loginUser("", "Invalid email");
        java.lang.Class<?> wildcardClass15 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Fail" + "'", str14.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        boolean boolean10 = userController0.removeUser("Invalid email");
        java.lang.Class<?> wildcardClass11 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        boolean boolean10 = userController0.removeUser("Invalid email");
        java.lang.String str13 = userController0.loginUser("Invalid email", "Fail");
        boolean boolean15 = userController0.removeUser("hi!");
        java.lang.String str16 = userController0.createLabManagerUser();
        boolean boolean18 = userController0.removeUser("Fail");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str3 = userController0.loginUser("hi!", "hi!");
        java.lang.String str6 = userController0.loginUser("", "");
        java.lang.String str7 = userController0.createLabManagerUser();
        boolean boolean9 = userController0.removeUser("hi!");
        boolean boolean11 = userController0.removeUser("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Fail" + "'", str3.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.approveUser("hi!");
        java.lang.String str9 = userController0.createLabManagerUser();
        java.lang.String str12 = userController0.loginUser("Fail", "Invalid email");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Fail" + "'", str12.equals("Fail"));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        boolean boolean10 = userController0.removeUser("");
        model.User.UserType userType13 = null;
        java.lang.String str16 = userController0.registerUser("Fail", "", userType13, "", "Invalid email");
        boolean boolean18 = userController0.removeUser("hi!");
        java.lang.String str21 = userController0.loginUser("", "Fail");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Invalid email" + "'", str16.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Fail" + "'", str21.equals("Fail"));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str1 = userController0.createLabManagerUser();
        boolean boolean3 = userController0.approveUser("");
        java.lang.String str4 = userController0.createLabManagerUser();
        java.lang.Class<?> wildcardClass5 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str3 = userController0.loginUser("hi!", "hi!");
        java.lang.String str6 = userController0.loginUser("", "");
        boolean boolean8 = userController0.approveUser("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Fail" + "'", str3.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        java.lang.String str10 = userController0.createLabManagerUser();
        boolean boolean12 = userController0.removeUser("");
        java.lang.String str13 = userController0.createLabManagerUser();
        boolean boolean15 = userController0.approveUser("hi!");
        java.lang.String str18 = userController0.loginUser("Invalid email", "Invalid email");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Fail" + "'", str18.equals("Fail"));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        java.lang.String str10 = userController0.createLabManagerUser();
        boolean boolean12 = userController0.removeUser("hi!");
        boolean boolean14 = userController0.removeUser("Fail");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        boolean boolean10 = userController0.removeUser("Fail");
        java.lang.String str13 = userController0.loginUser("hi!", "Fail");
        java.lang.String str16 = userController0.loginUser("Invalid email", "Fail");
        java.lang.String str17 = userController0.createLabManagerUser();
        java.lang.Class<?> wildcardClass18 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Fail" + "'", str16.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        model.User.UserType userType9 = null;
        java.lang.String str12 = userController0.registerUser("hi!", "Invalid email", userType9, "Invalid email", "Fail");
        boolean boolean14 = userController0.removeUser("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Invalid email" + "'", str12.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str3 = userController0.loginUser("", "");
        boolean boolean5 = userController0.approveUser("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Fail" + "'", str3.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        controller.UserController userController0 = controller.UserController.getInstance();
        java.lang.String str1 = userController0.createLabManagerUser();
        boolean boolean3 = userController0.approveUser("Invalid email");
        java.lang.Class<?> wildcardClass4 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str3 = userController0.loginUser("hi!", "hi!");
        java.lang.String str6 = userController0.loginUser("", "");
        java.lang.String str7 = userController0.createLabManagerUser();
        boolean boolean9 = userController0.removeUser("hi!");
        java.lang.Class<?> wildcardClass10 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Fail" + "'", str3.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        boolean boolean10 = userController0.removeUser("Invalid email");
        java.lang.String str13 = userController0.loginUser("", "Invalid email");
        boolean boolean15 = userController0.approveUser("Invalid email");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str3 = userController0.loginUser("Fail", "hi!");
        boolean boolean5 = userController0.removeUser("hi!");
        java.lang.String str8 = userController0.loginUser("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Fail" + "'", str3.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        java.lang.String str10 = userController0.createLabManagerUser();
        boolean boolean12 = userController0.removeUser("");
        java.lang.String str13 = userController0.createLabManagerUser();
        boolean boolean15 = userController0.approveUser("hi!");
        java.lang.String str18 = userController0.loginUser("Invalid email", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Fail" + "'", str18.equals("Fail"));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        model.User.UserType userType11 = null;
        java.lang.String str14 = userController0.registerUser("", "Invalid email", userType11, "hi!", "");
        model.User.UserType userType17 = null;
        java.lang.String str20 = userController0.registerUser("", "Invalid email", userType17, "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Invalid email" + "'", str14.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Invalid email" + "'", str20.equals("Invalid email"));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        boolean boolean10 = userController0.removeUser("Invalid email");
        model.User.UserType userType13 = null;
        java.lang.String str16 = userController0.registerUser("hi!", "Fail", userType13, "Invalid email", "");
        model.User.UserType userType19 = null;
        java.lang.String str22 = userController0.registerUser("Fail", "Fail", userType19, "hi!", "");
        boolean boolean24 = userController0.removeUser("Fail");
        boolean boolean26 = userController0.approveUser("");
        java.lang.Class<?> wildcardClass27 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Invalid email" + "'", str16.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Invalid email" + "'", str22.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        boolean boolean10 = userController0.removeUser("Fail");
        java.lang.String str13 = userController0.loginUser("hi!", "Fail");
        model.User.UserType userType16 = null;
        java.lang.String str19 = userController0.registerUser("hi!", "Fail", userType16, "Fail", "");
        boolean boolean21 = userController0.approveUser("Invalid email");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Invalid email" + "'", str19.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        java.lang.String str10 = userController0.createLabManagerUser();
        boolean boolean12 = userController0.removeUser("hi!");
        boolean boolean14 = userController0.removeUser("Invalid email");
        model.User.UserType userType17 = null;
        java.lang.String str20 = userController0.registerUser("hi!", "Invalid email", userType17, "Invalid email", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Invalid email" + "'", str20.equals("Invalid email"));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        controller.UserController userController0 = controller.UserController.getInstance();
        java.lang.String str1 = userController0.createLabManagerUser();
        boolean boolean3 = userController0.approveUser("Invalid email");
        java.lang.String str4 = userController0.createLabManagerUser();
        model.User.UserType userType7 = null;
        java.lang.String str10 = userController0.registerUser("hi!", "Fail", userType7, "hi!", "Fail");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Invalid email" + "'", str10.equals("Invalid email"));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str3 = userController0.loginUser("Fail", "hi!");
        java.lang.String str6 = userController0.loginUser("hi!", "");
        model.User.UserType userType9 = null;
        java.lang.String str12 = userController0.registerUser("Fail", "hi!", userType9, "hi!", "hi!");
        java.lang.Class<?> wildcardClass13 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Fail" + "'", str3.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Invalid email" + "'", str12.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.approveUser("Invalid email");
        model.User.UserType userType11 = null;
        java.lang.String str14 = userController0.registerUser("Invalid email", "", userType11, "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Invalid email" + "'", str14.equals("Invalid email"));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        java.lang.String str10 = userController0.createLabManagerUser();
        boolean boolean12 = userController0.removeUser("");
        boolean boolean14 = userController0.removeUser("hi!");
        java.lang.String str15 = userController0.createLabManagerUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str3 = userController0.loginUser("hi!", "hi!");
        java.lang.String str6 = userController0.loginUser("", "");
        java.lang.String str7 = userController0.createLabManagerUser();
        boolean boolean9 = userController0.approveUser("");
        java.lang.String str10 = userController0.createLabManagerUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Fail" + "'", str3.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        model.User.UserType userType11 = null;
        java.lang.String str14 = userController0.registerUser("", "Invalid email", userType11, "hi!", "");
        java.lang.String str15 = userController0.createLabManagerUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Invalid email" + "'", str14.equals("Invalid email"));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.approveUser("");
        boolean boolean10 = userController0.approveUser("Invalid email");
        model.User.UserType userType13 = null;
        java.lang.String str16 = userController0.registerUser("hi!", "hi!", userType13, "Invalid email", "hi!");
        model.User.UserType userType19 = null;
        java.lang.String str22 = userController0.registerUser("Fail", "Invalid email", userType19, "Fail", "Fail");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Invalid email" + "'", str16.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Invalid email" + "'", str22.equals("Invalid email"));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str3 = userController0.loginUser("Fail", "hi!");
        java.lang.String str6 = userController0.loginUser("hi!", "");
        model.User.UserType userType9 = null;
        java.lang.String str12 = userController0.registerUser("Fail", "hi!", userType9, "hi!", "hi!");
        model.User.UserType userType15 = null;
        java.lang.String str18 = userController0.registerUser("Fail", "", userType15, "Invalid email", "Invalid email");
        java.lang.String str19 = userController0.createLabManagerUser();
        java.lang.String str22 = userController0.loginUser("hi!", "hi!");
        java.lang.String str25 = userController0.loginUser("hi!", "Fail");
        java.lang.String str28 = userController0.loginUser("", "Invalid email");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Fail" + "'", str3.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Invalid email" + "'", str12.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Invalid email" + "'", str18.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Fail" + "'", str22.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Fail" + "'", str25.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Fail" + "'", str28.equals("Fail"));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str3 = userController0.loginUser("Fail", "hi!");
        java.lang.String str6 = userController0.loginUser("hi!", "");
        model.User.UserType userType9 = null;
        java.lang.String str12 = userController0.registerUser("Fail", "hi!", userType9, "hi!", "hi!");
        boolean boolean14 = userController0.approveUser("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Fail" + "'", str3.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Invalid email" + "'", str12.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        boolean boolean10 = userController0.approveUser("");
        java.lang.String str11 = userController0.createLabManagerUser();
        java.lang.Class<?> wildcardClass12 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str1 = userController0.createLabManagerUser();
        boolean boolean3 = userController0.approveUser("Fail");
        java.lang.String str6 = userController0.loginUser("Invalid email", "Invalid email");
        model.User.UserType userType9 = null;
        java.lang.String str12 = userController0.registerUser("hi!", "", userType9, "Invalid email", "Invalid email");
        boolean boolean14 = userController0.approveUser("Fail");
        boolean boolean16 = userController0.approveUser("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Invalid email" + "'", str12.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        controller.UserController userController0 = controller.UserController.getInstance();
        java.lang.String str1 = userController0.createLabManagerUser();
        boolean boolean3 = userController0.approveUser("Invalid email");
        java.lang.String str4 = userController0.createLabManagerUser();
        model.User.UserType userType7 = null;
        java.lang.String str10 = userController0.registerUser("hi!", "Fail", userType7, "Fail", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Invalid email" + "'", str10.equals("Invalid email"));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        boolean boolean11 = userController0.approveUser("Invalid email");
        boolean boolean13 = userController0.removeUser("Fail");
        boolean boolean15 = userController0.approveUser("");
        boolean boolean17 = userController0.approveUser("Fail");
        java.lang.String str20 = userController0.loginUser("Invalid email", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Fail" + "'", str20.equals("Fail"));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str1 = userController0.createLabManagerUser();
        boolean boolean3 = userController0.approveUser("Fail");
        java.lang.String str6 = userController0.loginUser("Invalid email", "Invalid email");
        model.User.UserType userType9 = null;
        java.lang.String str12 = userController0.registerUser("hi!", "", userType9, "Invalid email", "Invalid email");
        model.User.UserType userType15 = null;
        java.lang.String str18 = userController0.registerUser("Fail", "", userType15, "Invalid email", "Fail");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Invalid email" + "'", str12.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Invalid email" + "'", str18.equals("Invalid email"));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        boolean boolean10 = userController0.removeUser("Fail");
        model.User.UserType userType13 = null;
        java.lang.String str16 = userController0.registerUser("Fail", "Invalid email", userType13, "Fail", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Invalid email" + "'", str16.equals("Invalid email"));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str3 = userController0.loginUser("Fail", "hi!");
        java.lang.String str6 = userController0.loginUser("hi!", "");
        boolean boolean8 = userController0.removeUser("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Fail" + "'", str3.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        boolean boolean10 = userController0.removeUser("Fail");
        java.lang.String str11 = userController0.createLabManagerUser();
        boolean boolean13 = userController0.removeUser("Fail");
        boolean boolean15 = userController0.removeUser("Invalid email");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        java.lang.String str10 = userController0.createLabManagerUser();
        boolean boolean12 = userController0.removeUser("");
        boolean boolean14 = userController0.removeUser("hi!");
        boolean boolean16 = userController0.removeUser("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        boolean boolean10 = userController0.removeUser("Invalid email");
        java.lang.String str13 = userController0.loginUser("Invalid email", "Fail");
        boolean boolean15 = userController0.removeUser("hi!");
        java.lang.String str16 = userController0.createLabManagerUser();
        model.User.UserType userType19 = null;
        java.lang.String str22 = userController0.registerUser("", "Fail", userType19, "hi!", "Fail");
        model.User.UserType userType25 = null;
        java.lang.String str28 = userController0.registerUser("hi!", "Invalid email", userType25, "", "");
        boolean boolean30 = userController0.approveUser("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Invalid email" + "'", str22.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Invalid email" + "'", str28.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        java.lang.String str10 = userController0.createLabManagerUser();
        boolean boolean12 = userController0.removeUser("Fail");
        java.lang.String str15 = userController0.loginUser("Invalid email", "Fail");
        model.User.UserType userType18 = null;
        java.lang.String str21 = userController0.registerUser("Invalid email", "Fail", userType18, "Invalid email", "Fail");
        java.lang.String str22 = userController0.createLabManagerUser();
        boolean boolean24 = userController0.removeUser("Fail");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Fail" + "'", str15.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Invalid email" + "'", str21.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.approveUser("Fail");
        boolean boolean10 = userController0.removeUser("Fail");
        java.lang.String str11 = userController0.createLabManagerUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.approveUser("Fail");
        java.lang.String str9 = userController0.createLabManagerUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        boolean boolean10 = userController0.removeUser("Invalid email");
        java.lang.String str13 = userController0.loginUser("Invalid email", "Fail");
        boolean boolean15 = userController0.removeUser("hi!");
        java.lang.String str16 = userController0.createLabManagerUser();
        boolean boolean18 = userController0.approveUser("Invalid email");
        boolean boolean20 = userController0.approveUser("hi!");
        boolean boolean22 = userController0.approveUser("Invalid email");
        java.lang.Class<?> wildcardClass23 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str1 = userController0.createLabManagerUser();
        boolean boolean3 = userController0.approveUser("Fail");
        boolean boolean5 = userController0.removeUser("Invalid email");
        boolean boolean7 = userController0.approveUser("Invalid email");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        java.lang.String str10 = userController0.createLabManagerUser();
        boolean boolean12 = userController0.removeUser("Fail");
        java.lang.String str15 = userController0.loginUser("Invalid email", "Fail");
        model.User.UserType userType18 = null;
        java.lang.String str21 = userController0.registerUser("Invalid email", "Fail", userType18, "Invalid email", "Fail");
        boolean boolean23 = userController0.approveUser("Fail");
        boolean boolean25 = userController0.approveUser("Invalid email");
        java.lang.String str28 = userController0.loginUser("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Fail" + "'", str15.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Invalid email" + "'", str21.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Fail" + "'", str28.equals("Fail"));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        java.lang.String str10 = userController0.createLabManagerUser();
        boolean boolean12 = userController0.approveUser("");
        boolean boolean14 = userController0.approveUser("Invalid email");
        boolean boolean16 = userController0.removeUser("Invalid email");
        java.lang.String str19 = userController0.loginUser("Fail", "Invalid email");
        model.User.UserType userType22 = null;
        java.lang.String str25 = userController0.registerUser("Fail", "Fail", userType22, "Invalid email", "Fail");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Fail" + "'", str19.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Invalid email" + "'", str25.equals("Invalid email"));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        java.lang.String str10 = userController0.createLabManagerUser();
        boolean boolean12 = userController0.removeUser("");
        java.lang.Class<?> wildcardClass13 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        controller.UserController userController0 = controller.UserController.getInstance();
        java.lang.String str1 = userController0.createLabManagerUser();
        boolean boolean3 = userController0.removeUser("");
        java.lang.String str6 = userController0.loginUser("Invalid email", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        boolean boolean10 = userController0.removeUser("");
        model.User.UserType userType13 = null;
        java.lang.String str16 = userController0.registerUser("Fail", "", userType13, "", "Invalid email");
        boolean boolean18 = userController0.removeUser("hi!");
        java.lang.String str21 = userController0.loginUser("hi!", "");
        boolean boolean23 = userController0.approveUser("Fail");
        java.lang.String str24 = userController0.createLabManagerUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Invalid email" + "'", str16.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Fail" + "'", str21.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str1 = userController0.createLabManagerUser();
        boolean boolean3 = userController0.approveUser("");
        java.lang.String str4 = userController0.createLabManagerUser();
        java.lang.String str7 = userController0.loginUser("Fail", "hi!");
        java.lang.String str8 = userController0.createLabManagerUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Fail" + "'", str7.equals("Fail"));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        boolean boolean10 = userController0.removeUser("Invalid email");
        model.User.UserType userType13 = null;
        java.lang.String str16 = userController0.registerUser("hi!", "Fail", userType13, "Invalid email", "");
        model.User.UserType userType19 = null;
        java.lang.String str22 = userController0.registerUser("Fail", "Fail", userType19, "hi!", "");
        java.lang.Class<?> wildcardClass23 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Invalid email" + "'", str16.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Invalid email" + "'", str22.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        boolean boolean10 = userController0.removeUser("Fail");
        java.lang.String str11 = userController0.createLabManagerUser();
        boolean boolean13 = userController0.approveUser("");
        java.lang.String str16 = userController0.loginUser("Fail", "Invalid email");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Fail" + "'", str16.equals("Fail"));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        controller.UserController userController0 = controller.UserController.getInstance();
        java.lang.String str1 = userController0.createLabManagerUser();
        boolean boolean3 = userController0.removeUser("");
        model.User.UserType userType6 = null;
        java.lang.String str9 = userController0.registerUser("Invalid email", "Invalid email", userType6, "Fail", "Invalid email");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Invalid email" + "'", str9.equals("Invalid email"));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        boolean boolean11 = userController0.approveUser("Invalid email");
        java.lang.String str12 = userController0.createLabManagerUser();
        boolean boolean14 = userController0.approveUser("Fail");
        java.lang.Class<?> wildcardClass15 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        controller.UserController userController0 = controller.UserController.getInstance();
        java.lang.String str1 = userController0.createLabManagerUser();
        boolean boolean3 = userController0.approveUser("Invalid email");
        java.lang.String str4 = userController0.createLabManagerUser();
        boolean boolean6 = userController0.approveUser("Invalid email");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        boolean boolean10 = userController0.removeUser("Invalid email");
        java.lang.String str13 = userController0.loginUser("Invalid email", "Fail");
        boolean boolean15 = userController0.removeUser("hi!");
        java.lang.String str16 = userController0.createLabManagerUser();
        boolean boolean18 = userController0.approveUser("Invalid email");
        java.lang.Class<?> wildcardClass19 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        controller.UserController userController0 = controller.UserController.getInstance();
        java.lang.Class<?> wildcardClass1 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        boolean boolean11 = userController0.approveUser("Invalid email");
        boolean boolean13 = userController0.approveUser("Invalid email");
        java.lang.String str14 = userController0.createLabManagerUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str3 = userController0.loginUser("hi!", "hi!");
        java.lang.String str6 = userController0.loginUser("", "");
        java.lang.String str7 = userController0.createLabManagerUser();
        boolean boolean9 = userController0.approveUser("");
        boolean boolean11 = userController0.removeUser("hi!");
        boolean boolean13 = userController0.approveUser("Invalid email");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Fail" + "'", str3.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str3 = userController0.loginUser("Fail", "hi!");
        java.lang.String str6 = userController0.loginUser("hi!", "");
        model.User.UserType userType9 = null;
        java.lang.String str12 = userController0.registerUser("Fail", "hi!", userType9, "hi!", "hi!");
        model.User.UserType userType15 = null;
        java.lang.String str18 = userController0.registerUser("Fail", "", userType15, "Invalid email", "Invalid email");
        java.lang.String str19 = userController0.createLabManagerUser();
        java.lang.String str22 = userController0.loginUser("hi!", "hi!");
        java.lang.Class<?> wildcardClass23 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Fail" + "'", str3.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Invalid email" + "'", str12.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Invalid email" + "'", str18.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Fail" + "'", str22.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        boolean boolean10 = userController0.removeUser("Invalid email");
        java.lang.String str13 = userController0.loginUser("Invalid email", "Fail");
        java.lang.String str16 = userController0.loginUser("hi!", "hi!");
        boolean boolean18 = userController0.removeUser("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Fail" + "'", str16.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str3 = userController0.loginUser("hi!", "hi!");
        java.lang.String str6 = userController0.loginUser("", "");
        model.User.UserType userType9 = null;
        java.lang.String str12 = userController0.registerUser("Invalid email", "hi!", userType9, "Fail", "Invalid email");
        java.lang.String str13 = userController0.createLabManagerUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Fail" + "'", str3.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Invalid email" + "'", str12.equals("Invalid email"));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        boolean boolean10 = userController0.removeUser("Invalid email");
        java.lang.String str13 = userController0.loginUser("Invalid email", "Fail");
        boolean boolean15 = userController0.removeUser("hi!");
        java.lang.String str16 = userController0.createLabManagerUser();
        java.lang.Class<?> wildcardClass17 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        boolean boolean10 = userController0.removeUser("");
        model.User.UserType userType13 = null;
        java.lang.String str16 = userController0.registerUser("Fail", "", userType13, "", "Invalid email");
        java.lang.String str17 = userController0.createLabManagerUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Invalid email" + "'", str16.equals("Invalid email"));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        controller.UserController userController0 = controller.UserController.getInstance();
        java.lang.String str1 = userController0.createLabManagerUser();
        boolean boolean3 = userController0.approveUser("Invalid email");
        java.lang.String str4 = userController0.createLabManagerUser();
        java.lang.String str7 = userController0.loginUser("Invalid email", "hi!");
        java.lang.String str8 = userController0.createLabManagerUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Fail" + "'", str7.equals("Fail"));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.approveUser("");
        boolean boolean10 = userController0.removeUser("");
        java.lang.String str13 = userController0.loginUser("Invalid email", "hi!");
        java.lang.Class<?> wildcardClass14 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.approveUser("");
        boolean boolean10 = userController0.removeUser("");
        java.lang.String str13 = userController0.loginUser("Invalid email", "hi!");
        model.User.UserType userType16 = null;
        java.lang.String str19 = userController0.registerUser("Invalid email", "", userType16, "Invalid email", "Fail");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Invalid email" + "'", str19.equals("Invalid email"));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        boolean boolean10 = userController0.removeUser("Fail");
        java.lang.String str13 = userController0.loginUser("hi!", "Fail");
        java.lang.String str16 = userController0.loginUser("Invalid email", "Fail");
        model.User.UserType userType19 = null;
        java.lang.String str22 = userController0.registerUser("Fail", "hi!", userType19, "Fail", "Invalid email");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Fail" + "'", str16.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Invalid email" + "'", str22.equals("Invalid email"));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str1 = userController0.createLabManagerUser();
        boolean boolean3 = userController0.approveUser("");
        java.lang.String str6 = userController0.loginUser("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.approveUser("hi!");
        java.lang.String str9 = userController0.createLabManagerUser();
        java.lang.String str12 = userController0.loginUser("hi!", "");
        boolean boolean14 = userController0.removeUser("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Fail" + "'", str12.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.approveUser("");
        boolean boolean10 = userController0.approveUser("Invalid email");
        model.User.UserType userType13 = null;
        java.lang.String str16 = userController0.registerUser("hi!", "hi!", userType13, "Invalid email", "hi!");
        java.lang.Class<?> wildcardClass17 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Invalid email" + "'", str16.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        boolean boolean10 = userController0.removeUser("Fail");
        java.lang.String str13 = userController0.loginUser("hi!", "Fail");
        java.lang.String str16 = userController0.loginUser("Invalid email", "Fail");
        java.lang.String str17 = userController0.createLabManagerUser();
        java.lang.String str18 = userController0.createLabManagerUser();
        boolean boolean20 = userController0.approveUser("Fail");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Fail" + "'", str16.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        boolean boolean10 = userController0.removeUser("Invalid email");
        java.lang.String str13 = userController0.loginUser("Invalid email", "Fail");
        boolean boolean15 = userController0.removeUser("hi!");
        java.lang.String str16 = userController0.createLabManagerUser();
        boolean boolean18 = userController0.approveUser("");
        boolean boolean20 = userController0.removeUser("hi!");
        boolean boolean22 = userController0.approveUser("hi!");
        java.lang.String str23 = userController0.createLabManagerUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("Invalid email");
        model.User.UserType userType11 = null;
        java.lang.String str14 = userController0.registerUser("", "Fail", userType11, "hi!", "");
        java.lang.String str17 = userController0.loginUser("", "");
        java.lang.String str20 = userController0.loginUser("", "Fail");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Invalid email" + "'", str14.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Fail" + "'", str17.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Fail" + "'", str20.equals("Fail"));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        boolean boolean10 = userController0.removeUser("");
        model.User.UserType userType13 = null;
        java.lang.String str16 = userController0.registerUser("Fail", "", userType13, "", "Invalid email");
        boolean boolean18 = userController0.removeUser("hi!");
        java.lang.String str21 = userController0.loginUser("hi!", "");
        boolean boolean23 = userController0.approveUser("Fail");
        boolean boolean25 = userController0.removeUser("");
        java.lang.Class<?> wildcardClass26 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Invalid email" + "'", str16.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Fail" + "'", str21.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str1 = userController0.createLabManagerUser();
        boolean boolean3 = userController0.approveUser("Fail");
        java.lang.String str4 = userController0.createLabManagerUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        boolean boolean10 = userController0.removeUser("Fail");
        java.lang.String str13 = userController0.loginUser("hi!", "Fail");
        java.lang.String str16 = userController0.loginUser("Invalid email", "Fail");
        boolean boolean18 = userController0.removeUser("hi!");
        java.lang.String str21 = userController0.loginUser("Invalid email", "Fail");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Fail" + "'", str16.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Fail" + "'", str21.equals("Fail"));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        boolean boolean10 = userController0.removeUser("Fail");
        java.lang.String str13 = userController0.loginUser("hi!", "Fail");
        java.lang.String str16 = userController0.loginUser("Invalid email", "Fail");
        java.lang.String str17 = userController0.createLabManagerUser();
        java.lang.String str18 = userController0.createLabManagerUser();
        model.User.UserType userType21 = null;
        java.lang.String str24 = userController0.registerUser("Fail", "hi!", userType21, "Fail", "Fail");
        java.lang.Class<?> wildcardClass25 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Fail" + "'", str16.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Invalid email" + "'", str24.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        java.lang.String str9 = userController0.createLabManagerUser();
        java.lang.String str10 = userController0.createLabManagerUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        boolean boolean10 = userController0.removeUser("Fail");
        java.lang.String str13 = userController0.loginUser("hi!", "Fail");
        model.User.UserType userType16 = null;
        java.lang.String str19 = userController0.registerUser("Invalid email", "hi!", userType16, "Fail", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Invalid email" + "'", str19.equals("Invalid email"));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        java.lang.String str10 = userController0.createLabManagerUser();
        boolean boolean12 = userController0.removeUser("Fail");
        java.lang.String str15 = userController0.loginUser("Invalid email", "Fail");
        model.User.UserType userType18 = null;
        java.lang.String str21 = userController0.registerUser("Invalid email", "Fail", userType18, "Invalid email", "Fail");
        java.lang.String str24 = userController0.loginUser("", "Fail");
        boolean boolean26 = userController0.approveUser("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Fail" + "'", str15.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Invalid email" + "'", str21.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Fail" + "'", str24.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        boolean boolean10 = userController0.removeUser("Invalid email");
        model.User.UserType userType13 = null;
        java.lang.String str16 = userController0.registerUser("hi!", "Fail", userType13, "Invalid email", "");
        model.User.UserType userType19 = null;
        java.lang.String str22 = userController0.registerUser("Fail", "Fail", userType19, "hi!", "");
        boolean boolean24 = userController0.removeUser("Invalid email");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Invalid email" + "'", str16.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Invalid email" + "'", str22.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        boolean boolean10 = userController0.removeUser("Invalid email");
        model.User.UserType userType13 = null;
        java.lang.String str16 = userController0.registerUser("", "hi!", userType13, "", "Fail");
        java.lang.String str17 = userController0.createLabManagerUser();
        java.lang.String str20 = userController0.loginUser("hi!", "Fail");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Invalid email" + "'", str16.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Fail" + "'", str20.equals("Fail"));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str3 = userController0.loginUser("Fail", "hi!");
        boolean boolean5 = userController0.removeUser("hi!");
        boolean boolean7 = userController0.removeUser("Invalid email");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Fail" + "'", str3.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        controller.UserController userController0 = controller.UserController.getInstance();
        java.lang.String str1 = userController0.createLabManagerUser();
        boolean boolean3 = userController0.approveUser("Invalid email");
        java.lang.String str4 = userController0.createLabManagerUser();
        boolean boolean6 = userController0.approveUser("Fail");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        boolean boolean10 = userController0.removeUser("");
        boolean boolean12 = userController0.removeUser("");
        model.User.UserType userType15 = null;
        java.lang.String str18 = userController0.registerUser("Invalid email", "", userType15, "Fail", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Invalid email" + "'", str18.equals("Invalid email"));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str1 = userController0.createLabManagerUser();
        boolean boolean3 = userController0.approveUser("Fail");
        java.lang.String str6 = userController0.loginUser("Invalid email", "Invalid email");
        model.User.UserType userType9 = null;
        java.lang.String str12 = userController0.registerUser("Invalid email", "Fail", userType9, "hi!", "Fail");
        boolean boolean14 = userController0.approveUser("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Invalid email" + "'", str12.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        java.lang.String str10 = userController0.createLabManagerUser();
        boolean boolean12 = userController0.approveUser("");
        boolean boolean14 = userController0.approveUser("Invalid email");
        boolean boolean16 = userController0.removeUser("Invalid email");
        boolean boolean18 = userController0.approveUser("Invalid email");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.approveUser("hi!");
        boolean boolean10 = userController0.removeUser("Invalid email");
        boolean boolean12 = userController0.approveUser("Invalid email");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        controller.UserController userController0 = controller.UserController.getInstance();
        java.lang.String str1 = userController0.createLabManagerUser();
        boolean boolean3 = userController0.approveUser("Invalid email");
        boolean boolean5 = userController0.removeUser("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        controller.UserController userController0 = controller.UserController.getInstance();
        java.lang.String str1 = userController0.createLabManagerUser();
        boolean boolean3 = userController0.approveUser("Invalid email");
        java.lang.String str6 = userController0.loginUser("Fail", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        boolean boolean10 = userController0.removeUser("");
        model.User.UserType userType13 = null;
        java.lang.String str16 = userController0.registerUser("Fail", "", userType13, "", "Invalid email");
        boolean boolean18 = userController0.removeUser("hi!");
        java.lang.String str21 = userController0.loginUser("hi!", "");
        boolean boolean23 = userController0.approveUser("Fail");
        boolean boolean25 = userController0.removeUser("Fail");
        java.lang.String str26 = userController0.createLabManagerUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Invalid email" + "'", str16.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Fail" + "'", str21.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        boolean boolean10 = userController0.removeUser("Fail");
        java.lang.String str13 = userController0.loginUser("hi!", "Fail");
        java.lang.String str16 = userController0.loginUser("Invalid email", "Fail");
        boolean boolean18 = userController0.removeUser("");
        boolean boolean20 = userController0.approveUser("hi!");
        model.User.UserType userType23 = null;
        java.lang.String str26 = userController0.registerUser("hi!", "hi!", userType23, "Invalid email", "Fail");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Fail" + "'", str16.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Invalid email" + "'", str26.equals("Invalid email"));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str3 = userController0.loginUser("hi!", "hi!");
        java.lang.String str6 = userController0.loginUser("", "");
        java.lang.String str7 = userController0.createLabManagerUser();
        java.lang.String str10 = userController0.loginUser("", "Fail");
        java.lang.String str13 = userController0.loginUser("Invalid email", "hi!");
        java.lang.String str14 = userController0.createLabManagerUser();
        boolean boolean16 = userController0.approveUser("");
        boolean boolean18 = userController0.approveUser("Invalid email");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Fail" + "'", str3.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Fail" + "'", str10.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str3 = userController0.loginUser("Fail", "hi!");
        java.lang.String str6 = userController0.loginUser("hi!", "");
        java.lang.String str7 = userController0.createLabManagerUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Fail" + "'", str3.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("Invalid email");
        model.User.UserType userType11 = null;
        java.lang.String str14 = userController0.registerUser("", "Fail", userType11, "hi!", "");
        java.lang.String str17 = userController0.loginUser("Fail", "Fail");
        java.lang.String str18 = userController0.createLabManagerUser();
        java.lang.Class<?> wildcardClass19 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Invalid email" + "'", str14.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Fail" + "'", str17.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        boolean boolean11 = userController0.removeUser("Fail");
        model.User.UserType userType14 = null;
        java.lang.String str17 = userController0.registerUser("Invalid email", "Invalid email", userType14, "", "hi!");
        java.lang.Class<?> wildcardClass18 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Invalid email" + "'", str17.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str1 = userController0.createLabManagerUser();
        boolean boolean3 = userController0.removeUser("");
        java.lang.String str6 = userController0.loginUser("Invalid email", "");
        boolean boolean8 = userController0.removeUser("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        controller.UserController userController0 = controller.UserController.getInstance();
        java.lang.String str1 = userController0.createLabManagerUser();
        boolean boolean3 = userController0.removeUser("Fail");
        java.lang.String str4 = userController0.createLabManagerUser();
        java.lang.String str7 = userController0.loginUser("hi!", "hi!");
        boolean boolean9 = userController0.removeUser("Invalid email");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Fail" + "'", str7.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        boolean boolean10 = userController0.approveUser("");
        boolean boolean12 = userController0.removeUser("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        boolean boolean10 = userController0.removeUser("Invalid email");
        java.lang.String str13 = userController0.loginUser("Invalid email", "Fail");
        model.User.UserType userType16 = null;
        java.lang.String str19 = userController0.registerUser("", "Fail", userType16, "", "Fail");
        java.lang.String str22 = userController0.loginUser("Invalid email", "");
        java.lang.Class<?> wildcardClass23 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Invalid email" + "'", str19.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Fail" + "'", str22.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        controller.UserController userController0 = controller.UserController.getInstance();
        java.lang.String str1 = userController0.createLabManagerUser();
        boolean boolean3 = userController0.approveUser("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        boolean boolean10 = userController0.removeUser("");
        model.User.UserType userType13 = null;
        java.lang.String str16 = userController0.registerUser("Fail", "", userType13, "", "Invalid email");
        boolean boolean18 = userController0.removeUser("hi!");
        java.lang.String str21 = userController0.loginUser("hi!", "");
        boolean boolean23 = userController0.approveUser("Fail");
        boolean boolean25 = userController0.removeUser("");
        boolean boolean27 = userController0.removeUser("Fail");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Invalid email" + "'", str16.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Fail" + "'", str21.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str3 = userController0.loginUser("hi!", "hi!");
        java.lang.String str6 = userController0.loginUser("", "");
        java.lang.String str7 = userController0.createLabManagerUser();
        java.lang.String str10 = userController0.loginUser("", "Fail");
        boolean boolean12 = userController0.approveUser("");
        boolean boolean14 = userController0.removeUser("hi!");
        boolean boolean16 = userController0.approveUser("Fail");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Fail" + "'", str3.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Fail" + "'", str10.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        java.lang.String str10 = userController0.createLabManagerUser();
        boolean boolean12 = userController0.removeUser("");
        java.lang.String str13 = userController0.createLabManagerUser();
        boolean boolean15 = userController0.approveUser("Fail");
        java.lang.String str16 = userController0.createLabManagerUser();
        java.lang.String str17 = userController0.createLabManagerUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str3 = userController0.loginUser("hi!", "hi!");
        java.lang.String str6 = userController0.loginUser("", "");
        java.lang.String str7 = userController0.createLabManagerUser();
        boolean boolean9 = userController0.removeUser("hi!");
        java.lang.String str12 = userController0.loginUser("hi!", "Fail");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Fail" + "'", str3.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Fail" + "'", str12.equals("Fail"));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.approveUser("hi!");
        java.lang.String str9 = userController0.createLabManagerUser();
        java.lang.String str12 = userController0.loginUser("hi!", "");
        java.lang.String str15 = userController0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass16 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Fail" + "'", str12.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Fail" + "'", str15.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        boolean boolean10 = userController0.removeUser("Invalid email");
        model.User.UserType userType13 = null;
        java.lang.String str16 = userController0.registerUser("hi!", "Fail", userType13, "Invalid email", "");
        model.User.UserType userType19 = null;
        java.lang.String str22 = userController0.registerUser("Fail", "Fail", userType19, "hi!", "");
        boolean boolean24 = userController0.removeUser("Fail");
        java.lang.String str25 = userController0.createLabManagerUser();
        java.lang.String str26 = userController0.createLabManagerUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Invalid email" + "'", str16.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Invalid email" + "'", str22.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        boolean boolean10 = userController0.removeUser("Invalid email");
        java.lang.String str13 = userController0.loginUser("", "Invalid email");
        model.User.UserType userType16 = null;
        java.lang.String str19 = userController0.registerUser("Fail", "hi!", userType16, "hi!", "Fail");
        java.lang.String str22 = userController0.loginUser("hi!", "Invalid email");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Invalid email" + "'", str19.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Fail" + "'", str22.equals("Fail"));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.approveUser("Fail");
        boolean boolean10 = userController0.approveUser("Invalid email");
        boolean boolean12 = userController0.approveUser("Invalid email");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        boolean boolean11 = userController0.approveUser("Invalid email");
        boolean boolean13 = userController0.removeUser("Fail");
        boolean boolean15 = userController0.approveUser("");
        model.User.UserType userType18 = null;
        java.lang.String str21 = userController0.registerUser("hi!", "Fail", userType18, "Invalid email", "Fail");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Invalid email" + "'", str21.equals("Invalid email"));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        java.lang.String str10 = userController0.createLabManagerUser();
        model.User.UserType userType13 = null;
        java.lang.String str16 = userController0.registerUser("", "hi!", userType13, "Invalid email", "");
        boolean boolean18 = userController0.approveUser("Invalid email");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Invalid email" + "'", str16.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        boolean boolean10 = userController0.removeUser("Invalid email");
        model.User.UserType userType13 = null;
        java.lang.String str16 = userController0.registerUser("", "hi!", userType13, "", "Fail");
        java.lang.String str17 = userController0.createLabManagerUser();
        java.lang.String str18 = userController0.createLabManagerUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Invalid email" + "'", str16.equals("Invalid email"));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str1 = userController0.createLabManagerUser();
        java.lang.String str2 = userController0.createLabManagerUser();
        model.User.UserType userType5 = null;
        java.lang.String str8 = userController0.registerUser("", "Fail", userType5, "hi!", "hi!");
        java.lang.String str9 = userController0.createLabManagerUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Invalid email" + "'", str8.equals("Invalid email"));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        boolean boolean10 = userController0.removeUser("Fail");
        java.lang.String str13 = userController0.loginUser("hi!", "Fail");
        java.lang.String str16 = userController0.loginUser("Invalid email", "Fail");
        boolean boolean18 = userController0.removeUser("hi!");
        java.lang.String str19 = userController0.createLabManagerUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Fail" + "'", str16.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        boolean boolean10 = userController0.removeUser("Invalid email");
        java.lang.String str13 = userController0.loginUser("Invalid email", "Fail");
        boolean boolean15 = userController0.approveUser("");
        boolean boolean17 = userController0.approveUser("Invalid email");
        java.lang.String str18 = userController0.createLabManagerUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("Invalid email");
        model.User.UserType userType11 = null;
        java.lang.String str14 = userController0.registerUser("", "Fail", userType11, "hi!", "");
        java.lang.String str17 = userController0.loginUser("Fail", "Fail");
        boolean boolean19 = userController0.removeUser("Fail");
        java.lang.Class<?> wildcardClass20 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Invalid email" + "'", str14.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Fail" + "'", str17.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        java.lang.String str11 = userController0.loginUser("hi!", "Fail");
        java.lang.Class<?> wildcardClass12 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Fail" + "'", str11.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        boolean boolean10 = userController0.removeUser("Fail");
        java.lang.String str11 = userController0.createLabManagerUser();
        boolean boolean13 = userController0.approveUser("");
        boolean boolean15 = userController0.removeUser("Invalid email");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        java.lang.String str10 = userController0.createLabManagerUser();
        boolean boolean12 = userController0.approveUser("");
        java.lang.String str15 = userController0.loginUser("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Fail" + "'", str15.equals("Fail"));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        controller.UserController userController0 = controller.UserController.getInstance();
        java.lang.String str3 = userController0.loginUser("Fail", "");
        boolean boolean5 = userController0.approveUser("Invalid email");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Fail" + "'", str3.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("Fail", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        boolean boolean10 = userController0.removeUser("Fail");
        java.lang.String str13 = userController0.loginUser("hi!", "Fail");
        boolean boolean15 = userController0.removeUser("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        boolean boolean10 = userController0.removeUser("Invalid email");
        model.User.UserType userType13 = null;
        java.lang.String str16 = userController0.registerUser("", "hi!", userType13, "", "Fail");
        java.lang.String str19 = userController0.loginUser("Fail", "Fail");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Invalid email" + "'", str16.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Fail" + "'", str19.equals("Fail"));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str3 = userController0.loginUser("Fail", "hi!");
        java.lang.String str6 = userController0.loginUser("hi!", "");
        java.lang.String str9 = userController0.loginUser("Fail", "Invalid email");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Fail" + "'", str3.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        boolean boolean10 = userController0.removeUser("Invalid email");
        java.lang.String str13 = userController0.loginUser("Invalid email", "Fail");
        java.lang.String str14 = userController0.createLabManagerUser();
        model.User.UserType userType17 = null;
        java.lang.String str20 = userController0.registerUser("Invalid email", "Fail", userType17, "Fail", "Invalid email");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Invalid email" + "'", str20.equals("Invalid email"));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.approveUser("hi!");
        java.lang.String str9 = userController0.createLabManagerUser();
        java.lang.String str12 = userController0.loginUser("hi!", "");
        java.lang.String str15 = userController0.loginUser("Fail", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Fail" + "'", str12.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Fail" + "'", str15.equals("Fail"));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.approveUser("hi!");
        java.lang.String str9 = userController0.createLabManagerUser();
        java.lang.String str12 = userController0.loginUser("hi!", "");
        java.lang.String str15 = userController0.loginUser("hi!", "");
        java.lang.String str18 = userController0.loginUser("Fail", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Fail" + "'", str12.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Fail" + "'", str15.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Fail" + "'", str18.equals("Fail"));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        java.lang.String str10 = userController0.createLabManagerUser();
        boolean boolean12 = userController0.removeUser("");
        boolean boolean14 = userController0.removeUser("hi!");
        boolean boolean16 = userController0.approveUser("Fail");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        boolean boolean10 = userController0.removeUser("");
        boolean boolean12 = userController0.removeUser("");
        java.lang.Class<?> wildcardClass13 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        java.lang.String str10 = userController0.createLabManagerUser();
        boolean boolean12 = userController0.removeUser("Fail");
        model.User.UserType userType15 = null;
        java.lang.String str18 = userController0.registerUser("hi!", "", userType15, "hi!", "Invalid email");
        boolean boolean20 = userController0.removeUser("Fail");
        model.User.UserType userType23 = null;
        java.lang.String str26 = userController0.registerUser("Fail", "Fail", userType23, "Invalid email", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Invalid email" + "'", str18.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Invalid email" + "'", str26.equals("Invalid email"));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("Invalid email");
        model.User.UserType userType11 = null;
        java.lang.String str14 = userController0.registerUser("", "Fail", userType11, "hi!", "");
        java.lang.String str17 = userController0.loginUser("", "");
        model.User.UserType userType20 = null;
        java.lang.String str23 = userController0.registerUser("Fail", "Fail", userType20, "", "Invalid email");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Invalid email" + "'", str14.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Fail" + "'", str17.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Invalid email" + "'", str23.equals("Invalid email"));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        boolean boolean10 = userController0.removeUser("Invalid email");
        java.lang.String str13 = userController0.loginUser("Invalid email", "Fail");
        boolean boolean15 = userController0.removeUser("hi!");
        java.lang.String str16 = userController0.createLabManagerUser();
        boolean boolean18 = userController0.approveUser("");
        boolean boolean20 = userController0.removeUser("hi!");
        model.User.UserType userType23 = null;
        java.lang.String str26 = userController0.registerUser("", "", userType23, "", "hi!");
        boolean boolean28 = userController0.approveUser("Invalid email");
        java.lang.String str29 = userController0.createLabManagerUser();
        model.User.UserType userType32 = null;
        java.lang.String str35 = userController0.registerUser("hi!", "hi!", userType32, "Fail", "Invalid email");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Invalid email" + "'", str26.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "Invalid email" + "'", str35.equals("Invalid email"));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        boolean boolean10 = userController0.removeUser("Fail");
        java.lang.String str13 = userController0.loginUser("hi!", "Fail");
        model.User.UserType userType16 = null;
        java.lang.String str19 = userController0.registerUser("hi!", "Fail", userType16, "Fail", "");
        java.lang.String str22 = userController0.loginUser("Fail", "");
        java.lang.String str23 = userController0.createLabManagerUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Invalid email" + "'", str19.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Fail" + "'", str22.equals("Fail"));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        java.lang.String str9 = userController0.createLabManagerUser();
        java.lang.String str10 = userController0.createLabManagerUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str1 = userController0.createLabManagerUser();
        boolean boolean3 = userController0.removeUser("");
        java.lang.String str6 = userController0.loginUser("Fail", "hi!");
        boolean boolean8 = userController0.approveUser("hi!");
        java.lang.String str11 = userController0.loginUser("Fail", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Fail" + "'", str11.equals("Fail"));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.approveUser("Invalid email");
        boolean boolean10 = userController0.removeUser("Fail");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        model.User.UserType userType9 = null;
        java.lang.String str12 = userController0.registerUser("", "Invalid email", userType9, "Invalid email", "Fail");
        boolean boolean14 = userController0.removeUser("Fail");
        java.lang.String str17 = userController0.loginUser("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Invalid email" + "'", str12.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Fail" + "'", str17.equals("Fail"));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        boolean boolean11 = userController0.approveUser("Invalid email");
        boolean boolean13 = userController0.removeUser("Fail");
        boolean boolean15 = userController0.approveUser("");
        boolean boolean17 = userController0.approveUser("Fail");
        java.lang.String str18 = userController0.createLabManagerUser();
        java.lang.String str19 = userController0.createLabManagerUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str1 = userController0.createLabManagerUser();
        boolean boolean3 = userController0.approveUser("Fail");
        java.lang.String str6 = userController0.loginUser("Invalid email", "Invalid email");
        model.User.UserType userType9 = null;
        java.lang.String str12 = userController0.registerUser("Invalid email", "Fail", userType9, "hi!", "Fail");
        boolean boolean14 = userController0.approveUser("Invalid email");
        model.User.UserType userType17 = null;
        java.lang.String str20 = userController0.registerUser("", "", userType17, "", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Invalid email" + "'", str12.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Invalid email" + "'", str20.equals("Invalid email"));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        java.lang.String str10 = userController0.createLabManagerUser();
        boolean boolean12 = userController0.removeUser("");
        boolean boolean14 = userController0.approveUser("hi!");
        java.lang.String str15 = userController0.createLabManagerUser();
        boolean boolean17 = userController0.removeUser("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str3 = userController0.loginUser("Fail", "hi!");
        model.User.UserType userType6 = null;
        java.lang.String str9 = userController0.registerUser("Fail", "", userType6, "Invalid email", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Fail" + "'", str3.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Invalid email" + "'", str9.equals("Invalid email"));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        java.lang.String str10 = userController0.createLabManagerUser();
        boolean boolean12 = userController0.removeUser("");
        java.lang.String str13 = userController0.createLabManagerUser();
        boolean boolean15 = userController0.approveUser("Fail");
        java.lang.String str18 = userController0.loginUser("Fail", "hi!");
        java.lang.String str21 = userController0.loginUser("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Fail" + "'", str18.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Fail" + "'", str21.equals("Fail"));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str1 = userController0.createLabManagerUser();
        boolean boolean3 = userController0.removeUser("");
        java.lang.String str6 = userController0.loginUser("Fail", "hi!");
        boolean boolean8 = userController0.approveUser("hi!");
        java.lang.String str9 = userController0.createLabManagerUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        boolean boolean11 = userController0.approveUser("Invalid email");
        java.lang.String str14 = userController0.loginUser("hi!", "Fail");
        boolean boolean16 = userController0.removeUser("Invalid email");
        boolean boolean18 = userController0.removeUser("");
        java.lang.String str19 = userController0.createLabManagerUser();
        java.lang.String str22 = userController0.loginUser("Fail", "Invalid email");
        java.lang.String str23 = userController0.createLabManagerUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Fail" + "'", str14.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Fail" + "'", str22.equals("Fail"));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        boolean boolean11 = userController0.approveUser("Invalid email");
        java.lang.String str14 = userController0.loginUser("hi!", "Fail");
        boolean boolean16 = userController0.removeUser("Invalid email");
        boolean boolean18 = userController0.removeUser("");
        java.lang.String str19 = userController0.createLabManagerUser();
        java.lang.String str20 = userController0.createLabManagerUser();
        boolean boolean22 = userController0.approveUser("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Fail" + "'", str14.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        boolean boolean10 = userController0.removeUser("Invalid email");
        java.lang.String str13 = userController0.loginUser("Invalid email", "Fail");
        boolean boolean15 = userController0.removeUser("hi!");
        java.lang.String str16 = userController0.createLabManagerUser();
        boolean boolean18 = userController0.approveUser("");
        boolean boolean20 = userController0.removeUser("hi!");
        model.User.UserType userType23 = null;
        java.lang.String str26 = userController0.registerUser("", "", userType23, "", "hi!");
        java.lang.String str29 = userController0.loginUser("Fail", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Invalid email" + "'", str26.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "Fail" + "'", str29.equals("Fail"));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.approveUser("");
        boolean boolean10 = userController0.removeUser("");
        java.lang.String str13 = userController0.loginUser("Invalid email", "Fail");
        java.lang.String str14 = userController0.createLabManagerUser();
        boolean boolean16 = userController0.approveUser("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        boolean boolean10 = userController0.removeUser("");
        model.User.UserType userType13 = null;
        java.lang.String str16 = userController0.registerUser("Fail", "", userType13, "", "Invalid email");
        boolean boolean18 = userController0.removeUser("hi!");
        java.lang.String str21 = userController0.loginUser("hi!", "");
        boolean boolean23 = userController0.approveUser("Fail");
        model.User.UserType userType26 = null;
        java.lang.String str29 = userController0.registerUser("hi!", "hi!", userType26, "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Invalid email" + "'", str16.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Fail" + "'", str21.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "Invalid email" + "'", str29.equals("Invalid email"));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str1 = userController0.createLabManagerUser();
        boolean boolean3 = userController0.approveUser("Fail");
        java.lang.String str6 = userController0.loginUser("Invalid email", "Invalid email");
        model.User.UserType userType9 = null;
        java.lang.String str12 = userController0.registerUser("Invalid email", "Fail", userType9, "hi!", "Fail");
        java.lang.String str15 = userController0.loginUser("", "Fail");
        java.lang.String str18 = userController0.loginUser("Fail", "Fail");
        java.lang.String str19 = userController0.createLabManagerUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Invalid email" + "'", str12.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Fail" + "'", str15.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Fail" + "'", str18.equals("Fail"));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        boolean boolean10 = userController0.removeUser("");
        model.User.UserType userType13 = null;
        java.lang.String str16 = userController0.registerUser("Fail", "", userType13, "", "Invalid email");
        model.User.UserType userType19 = null;
        java.lang.String str22 = userController0.registerUser("hi!", "Invalid email", userType19, "", "Fail");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Invalid email" + "'", str16.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Invalid email" + "'", str22.equals("Invalid email"));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        boolean boolean10 = userController0.removeUser("Fail");
        java.lang.String str13 = userController0.loginUser("hi!", "Fail");
        java.lang.String str16 = userController0.loginUser("Invalid email", "Fail");
        java.lang.String str17 = userController0.createLabManagerUser();
        boolean boolean19 = userController0.removeUser("");
        java.lang.Class<?> wildcardClass20 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Fail" + "'", str16.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        controller.UserController userController0 = controller.UserController.getInstance();
        java.lang.String str1 = userController0.createLabManagerUser();
        boolean boolean3 = userController0.removeUser("Fail");
        boolean boolean5 = userController0.approveUser("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.approveUser("hi!");
        java.lang.String str9 = userController0.createLabManagerUser();
        java.lang.String str12 = userController0.loginUser("hi!", "");
        java.lang.String str15 = userController0.loginUser("hi!", "");
        model.User.UserType userType18 = null;
        java.lang.String str21 = userController0.registerUser("Fail", "Invalid email", userType18, "Invalid email", "Invalid email");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Fail" + "'", str12.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Fail" + "'", str15.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Invalid email" + "'", str21.equals("Invalid email"));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        boolean boolean10 = userController0.removeUser("Invalid email");
        java.lang.String str13 = userController0.loginUser("Invalid email", "Fail");
        model.User.UserType userType16 = null;
        java.lang.String str19 = userController0.registerUser("", "Fail", userType16, "", "Fail");
        model.User.UserType userType22 = null;
        java.lang.String str25 = userController0.registerUser("Invalid email", "Fail", userType22, "", "Invalid email");
        java.lang.Class<?> wildcardClass26 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Invalid email" + "'", str19.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Invalid email" + "'", str25.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        boolean boolean10 = userController0.removeUser("Invalid email");
        java.lang.String str13 = userController0.loginUser("", "Invalid email");
        java.lang.String str14 = userController0.createLabManagerUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        boolean boolean10 = userController0.removeUser("Fail");
        java.lang.String str13 = userController0.loginUser("hi!", "Fail");
        java.lang.String str16 = userController0.loginUser("Invalid email", "Fail");
        boolean boolean18 = userController0.approveUser("Invalid email");
        java.lang.Class<?> wildcardClass19 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Fail" + "'", str16.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        boolean boolean10 = userController0.removeUser("Fail");
        java.lang.String str13 = userController0.loginUser("hi!", "Fail");
        model.User.UserType userType16 = null;
        java.lang.String str19 = userController0.registerUser("hi!", "Fail", userType16, "Fail", "");
        boolean boolean21 = userController0.removeUser("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Invalid email" + "'", str19.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        java.lang.String str10 = userController0.createLabManagerUser();
        boolean boolean12 = userController0.removeUser("");
        java.lang.String str13 = userController0.createLabManagerUser();
        boolean boolean15 = userController0.approveUser("hi!");
        boolean boolean17 = userController0.removeUser("");
        java.lang.String str20 = userController0.loginUser("hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Fail" + "'", str20.equals("Fail"));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        boolean boolean10 = userController0.removeUser("");
        model.User.UserType userType13 = null;
        java.lang.String str16 = userController0.registerUser("Fail", "", userType13, "", "Invalid email");
        boolean boolean18 = userController0.removeUser("hi!");
        java.lang.String str19 = userController0.createLabManagerUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Invalid email" + "'", str16.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        boolean boolean11 = userController0.approveUser("Invalid email");
        java.lang.String str14 = userController0.loginUser("hi!", "Fail");
        model.User.UserType userType17 = null;
        java.lang.String str20 = userController0.registerUser("Invalid email", "hi!", userType17, "", "Fail");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Fail" + "'", str14.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Invalid email" + "'", str20.equals("Invalid email"));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        boolean boolean7 = userController0.removeUser("");
        model.User.UserType userType10 = null;
        java.lang.String str13 = userController0.registerUser("Fail", "", userType10, "hi!", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Invalid email" + "'", str13.equals("Invalid email"));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        boolean boolean10 = userController0.removeUser("");
        model.User.UserType userType13 = null;
        java.lang.String str16 = userController0.registerUser("Fail", "", userType13, "", "Invalid email");
        boolean boolean18 = userController0.removeUser("hi!");
        java.lang.String str21 = userController0.loginUser("hi!", "");
        boolean boolean23 = userController0.approveUser("Fail");
        boolean boolean25 = userController0.removeUser("Fail");
        java.lang.Class<?> wildcardClass26 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Invalid email" + "'", str16.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Fail" + "'", str21.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        boolean boolean11 = userController0.approveUser("Invalid email");
        java.lang.String str12 = userController0.createLabManagerUser();
        boolean boolean14 = userController0.approveUser("Fail");
        java.lang.String str15 = userController0.createLabManagerUser();
        java.lang.Class<?> wildcardClass16 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        boolean boolean10 = userController0.removeUser("Fail");
        java.lang.String str11 = userController0.createLabManagerUser();
        boolean boolean13 = userController0.approveUser("");
        java.lang.String str14 = userController0.createLabManagerUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str1 = userController0.createLabManagerUser();
        boolean boolean3 = userController0.approveUser("Fail");
        java.lang.String str6 = userController0.loginUser("Invalid email", "Invalid email");
        model.User.UserType userType9 = null;
        java.lang.String str12 = userController0.registerUser("Invalid email", "Fail", userType9, "hi!", "Fail");
        model.User.UserType userType15 = null;
        java.lang.String str18 = userController0.registerUser("Invalid email", "Fail", userType15, "hi!", "Fail");
        java.lang.String str19 = userController0.createLabManagerUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Invalid email" + "'", str12.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Invalid email" + "'", str18.equals("Invalid email"));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        boolean boolean11 = userController0.approveUser("Invalid email");
        boolean boolean13 = userController0.approveUser("Invalid email");
        boolean boolean15 = userController0.removeUser("Fail");
        boolean boolean17 = userController0.approveUser("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        java.lang.String str10 = userController0.createLabManagerUser();
        boolean boolean12 = userController0.removeUser("");
        java.lang.String str13 = userController0.createLabManagerUser();
        boolean boolean15 = userController0.approveUser("hi!");
        java.lang.Class<?> wildcardClass16 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        model.User.UserType userType9 = null;
        java.lang.String str12 = userController0.registerUser("hi!", "", userType9, "Fail", "Fail");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Invalid email" + "'", str12.equals("Invalid email"));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        boolean boolean10 = userController0.removeUser("Invalid email");
        model.User.UserType userType13 = null;
        java.lang.String str16 = userController0.registerUser("hi!", "Fail", userType13, "Invalid email", "");
        model.User.UserType userType19 = null;
        java.lang.String str22 = userController0.registerUser("Fail", "Fail", userType19, "hi!", "");
        boolean boolean24 = userController0.removeUser("Fail");
        java.lang.String str25 = userController0.createLabManagerUser();
        java.lang.String str28 = userController0.loginUser("Fail", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Invalid email" + "'", str16.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Invalid email" + "'", str22.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "Fail" + "'", str28.equals("Fail"));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str1 = userController0.createLabManagerUser();
        boolean boolean3 = userController0.approveUser("Fail");
        java.lang.String str6 = userController0.loginUser("Invalid email", "Invalid email");
        model.User.UserType userType9 = null;
        java.lang.String str12 = userController0.registerUser("hi!", "", userType9, "Invalid email", "Invalid email");
        boolean boolean14 = userController0.approveUser("Fail");
        java.lang.String str17 = userController0.loginUser("", "");
        java.lang.String str20 = userController0.loginUser("", "Invalid email");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Invalid email" + "'", str12.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Fail" + "'", str17.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "Fail" + "'", str20.equals("Fail"));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("Invalid email");
        model.User.UserType userType11 = null;
        java.lang.String str14 = userController0.registerUser("", "Fail", userType11, "hi!", "");
        java.lang.String str17 = userController0.loginUser("Fail", "Fail");
        boolean boolean19 = userController0.removeUser("Fail");
        java.lang.String str20 = userController0.createLabManagerUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Invalid email" + "'", str14.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Fail" + "'", str17.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.approveUser("hi!");
        java.lang.String str9 = userController0.createLabManagerUser();
        java.lang.String str12 = userController0.loginUser("hi!", "");
        boolean boolean14 = userController0.removeUser("");
        java.lang.Class<?> wildcardClass15 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Fail" + "'", str12.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        boolean boolean10 = userController0.removeUser("Invalid email");
        java.lang.String str13 = userController0.loginUser("Invalid email", "Fail");
        boolean boolean15 = userController0.removeUser("hi!");
        java.lang.String str16 = userController0.createLabManagerUser();
        model.User.UserType userType19 = null;
        java.lang.String str22 = userController0.registerUser("", "Fail", userType19, "hi!", "Fail");
        boolean boolean24 = userController0.approveUser("hi!");
        boolean boolean26 = userController0.approveUser("Invalid email");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Invalid email" + "'", str22.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str1 = userController0.createLabManagerUser();
        boolean boolean3 = userController0.approveUser("Fail");
        java.lang.String str6 = userController0.loginUser("Invalid email", "Invalid email");
        model.User.UserType userType9 = null;
        java.lang.String str12 = userController0.registerUser("hi!", "", userType9, "Invalid email", "Invalid email");
        boolean boolean14 = userController0.approveUser("Fail");
        boolean boolean16 = userController0.approveUser("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Invalid email" + "'", str12.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        boolean boolean10 = userController0.removeUser("Invalid email");
        model.User.UserType userType13 = null;
        java.lang.String str16 = userController0.registerUser("hi!", "Fail", userType13, "Invalid email", "");
        model.User.UserType userType19 = null;
        java.lang.String str22 = userController0.registerUser("Fail", "Fail", userType19, "hi!", "");
        boolean boolean24 = userController0.removeUser("Fail");
        java.lang.String str27 = userController0.loginUser("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Invalid email" + "'", str16.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Invalid email" + "'", str22.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + "Fail" + "'", str27.equals("Fail"));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("Invalid email");
        model.User.UserType userType11 = null;
        java.lang.String str14 = userController0.registerUser("", "Fail", userType11, "hi!", "");
        java.lang.String str17 = userController0.loginUser("", "");
        boolean boolean19 = userController0.removeUser("Fail");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Invalid email" + "'", str14.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Fail" + "'", str17.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        boolean boolean10 = userController0.removeUser("Invalid email");
        model.User.UserType userType13 = null;
        java.lang.String str16 = userController0.registerUser("hi!", "Fail", userType13, "Invalid email", "");
        model.User.UserType userType19 = null;
        java.lang.String str22 = userController0.registerUser("Fail", "Fail", userType19, "hi!", "");
        boolean boolean24 = userController0.removeUser("Fail");
        java.lang.String str25 = userController0.createLabManagerUser();
        boolean boolean27 = userController0.removeUser("");
        java.lang.String str28 = userController0.createLabManagerUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Invalid email" + "'", str16.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Invalid email" + "'", str22.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        controller.UserController userController0 = controller.UserController.getInstance();
        java.lang.String str1 = userController0.createLabManagerUser();
        boolean boolean3 = userController0.approveUser("Invalid email");
        java.lang.String str4 = userController0.createLabManagerUser();
        java.lang.String str5 = userController0.createLabManagerUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        boolean boolean10 = userController0.removeUser("Fail");
        java.lang.String str13 = userController0.loginUser("hi!", "Fail");
        java.lang.String str16 = userController0.loginUser("Invalid email", "Fail");
        boolean boolean18 = userController0.removeUser("");
        boolean boolean20 = userController0.approveUser("hi!");
        java.lang.String str21 = userController0.createLabManagerUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Fail" + "'", str16.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str1 = userController0.createLabManagerUser();
        boolean boolean3 = userController0.approveUser("Fail");
        java.lang.String str6 = userController0.loginUser("Invalid email", "Invalid email");
        model.User.UserType userType9 = null;
        java.lang.String str12 = userController0.registerUser("Invalid email", "Fail", userType9, "hi!", "Fail");
        java.lang.String str15 = userController0.loginUser("", "Fail");
        java.lang.String str16 = userController0.createLabManagerUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Invalid email" + "'", str12.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Fail" + "'", str15.equals("Fail"));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str3 = userController0.loginUser("Fail", "hi!");
        java.lang.String str6 = userController0.loginUser("hi!", "");
        model.User.UserType userType9 = null;
        java.lang.String str12 = userController0.registerUser("hi!", "hi!", userType9, "Fail", "");
        java.lang.Class<?> wildcardClass13 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Fail" + "'", str3.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Invalid email" + "'", str12.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str1 = userController0.createLabManagerUser();
        boolean boolean3 = userController0.removeUser("");
        java.lang.String str6 = userController0.loginUser("Fail", "hi!");
        java.lang.String str9 = userController0.loginUser("Invalid email", "");
        boolean boolean11 = userController0.removeUser("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        java.lang.String str10 = userController0.createLabManagerUser();
        boolean boolean12 = userController0.removeUser("Fail");
        model.User.UserType userType15 = null;
        java.lang.String str18 = userController0.registerUser("hi!", "", userType15, "hi!", "Invalid email");
        boolean boolean20 = userController0.removeUser("Fail");
        model.User.UserType userType23 = null;
        java.lang.String str26 = userController0.registerUser("hi!", "", userType23, "hi!", "");
        java.lang.String str29 = userController0.loginUser("", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Invalid email" + "'", str18.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Invalid email" + "'", str26.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str29 + "' != '" + "Fail" + "'", str29.equals("Fail"));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        java.lang.String str10 = userController0.createLabManagerUser();
        boolean boolean12 = userController0.removeUser("Fail");
        java.lang.String str15 = userController0.loginUser("Invalid email", "Fail");
        model.User.UserType userType18 = null;
        java.lang.String str21 = userController0.registerUser("Invalid email", "Fail", userType18, "Invalid email", "Fail");
        java.lang.String str22 = userController0.createLabManagerUser();
        java.lang.String str25 = userController0.loginUser("", "Invalid email");
        model.User.UserType userType28 = null;
        java.lang.String str31 = userController0.registerUser("Fail", "hi!", userType28, "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Fail" + "'", str15.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Invalid email" + "'", str21.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Fail" + "'", str25.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "Invalid email" + "'", str31.equals("Invalid email"));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        boolean boolean10 = userController0.removeUser("Invalid email");
        java.lang.String str13 = userController0.loginUser("Invalid email", "Fail");
        boolean boolean15 = userController0.removeUser("hi!");
        java.lang.String str16 = userController0.createLabManagerUser();
        boolean boolean18 = userController0.removeUser("");
        model.User.UserType userType21 = null;
        java.lang.String str24 = userController0.registerUser("Invalid email", "hi!", userType21, "", "Invalid email");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Invalid email" + "'", str24.equals("Invalid email"));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        boolean boolean11 = userController0.removeUser("");
        java.lang.Class<?> wildcardClass12 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        boolean boolean10 = userController0.removeUser("");
        model.User.UserType userType13 = null;
        java.lang.String str16 = userController0.registerUser("Fail", "", userType13, "", "Invalid email");
        boolean boolean18 = userController0.approveUser("hi!");
        boolean boolean20 = userController0.approveUser("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Invalid email" + "'", str16.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str1 = userController0.createLabManagerUser();
        boolean boolean3 = userController0.approveUser("Fail");
        java.lang.String str6 = userController0.loginUser("Invalid email", "Invalid email");
        model.User.UserType userType9 = null;
        java.lang.String str12 = userController0.registerUser("Invalid email", "Fail", userType9, "hi!", "Fail");
        boolean boolean14 = userController0.approveUser("Invalid email");
        java.lang.String str15 = userController0.createLabManagerUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Invalid email" + "'", str12.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str1 = userController0.createLabManagerUser();
        boolean boolean3 = userController0.approveUser("Fail");
        java.lang.String str6 = userController0.loginUser("Invalid email", "Invalid email");
        model.User.UserType userType9 = null;
        java.lang.String str12 = userController0.registerUser("Invalid email", "Fail", userType9, "hi!", "Fail");
        model.User.UserType userType15 = null;
        java.lang.String str18 = userController0.registerUser("Invalid email", "Fail", userType15, "hi!", "Fail");
        model.User.UserType userType21 = null;
        java.lang.String str24 = userController0.registerUser("hi!", "Invalid email", userType21, "", "Invalid email");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Invalid email" + "'", str12.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Invalid email" + "'", str18.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Invalid email" + "'", str24.equals("Invalid email"));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        java.lang.String str10 = userController0.createLabManagerUser();
        model.User.UserType userType13 = null;
        java.lang.String str16 = userController0.registerUser("", "hi!", userType13, "Invalid email", "");
        boolean boolean18 = userController0.removeUser("");
        java.lang.String str19 = userController0.createLabManagerUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Invalid email" + "'", str16.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        controller.UserController userController0 = controller.UserController.getInstance();
        java.lang.String str1 = userController0.createLabManagerUser();
        boolean boolean3 = userController0.removeUser("");
        model.User.UserType userType6 = null;
        java.lang.String str9 = userController0.registerUser("", "", userType6, "Fail", "");
        model.User.UserType userType12 = null;
        java.lang.String str15 = userController0.registerUser("", "hi!", userType12, "Fail", "Fail");
        boolean boolean17 = userController0.approveUser("Fail");
        boolean boolean19 = userController0.removeUser("");
        java.lang.Class<?> wildcardClass20 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Invalid email" + "'", str9.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Invalid email" + "'", str15.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str3 = userController0.loginUser("Fail", "hi!");
        boolean boolean5 = userController0.approveUser("");
        java.lang.Class<?> wildcardClass6 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Fail" + "'", str3.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        controller.UserController userController0 = controller.UserController.getInstance();
        java.lang.String str1 = userController0.createLabManagerUser();
        boolean boolean3 = userController0.removeUser("");
        model.User.UserType userType6 = null;
        java.lang.String str9 = userController0.registerUser("", "", userType6, "Fail", "");
        model.User.UserType userType12 = null;
        java.lang.String str15 = userController0.registerUser("", "hi!", userType12, "Fail", "Fail");
        boolean boolean17 = userController0.approveUser("Fail");
        boolean boolean19 = userController0.removeUser("");
        boolean boolean21 = userController0.removeUser("Invalid email");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Invalid email" + "'", str9.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Invalid email" + "'", str15.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        boolean boolean10 = userController0.removeUser("Invalid email");
        java.lang.String str13 = userController0.loginUser("Invalid email", "Fail");
        model.User.UserType userType16 = null;
        java.lang.String str19 = userController0.registerUser("", "Fail", userType16, "", "Fail");
        boolean boolean21 = userController0.approveUser("");
        java.lang.Class<?> wildcardClass22 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "Invalid email" + "'", str19.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.approveUser("");
        boolean boolean10 = userController0.approveUser("Invalid email");
        model.User.UserType userType13 = null;
        java.lang.String str16 = userController0.registerUser("hi!", "hi!", userType13, "Invalid email", "hi!");
        boolean boolean18 = userController0.removeUser("hi!");
        model.User.UserType userType21 = null;
        java.lang.String str24 = userController0.registerUser("Invalid email", "Fail", userType21, "hi!", "Fail");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Invalid email" + "'", str16.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "Invalid email" + "'", str24.equals("Invalid email"));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("Invalid email");
        model.User.UserType userType11 = null;
        java.lang.String str14 = userController0.registerUser("", "Fail", userType11, "hi!", "");
        java.lang.String str17 = userController0.loginUser("Fail", "Fail");
        java.lang.String str18 = userController0.createLabManagerUser();
        java.lang.String str19 = userController0.createLabManagerUser();
        model.User.UserType userType22 = null;
        java.lang.String str25 = userController0.registerUser("Invalid email", "Invalid email", userType22, "Fail", "Fail");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Invalid email" + "'", str14.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Fail" + "'", str17.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Invalid email" + "'", str25.equals("Invalid email"));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        boolean boolean10 = userController0.removeUser("Invalid email");
        java.lang.String str13 = userController0.loginUser("Invalid email", "Fail");
        boolean boolean15 = userController0.removeUser("hi!");
        java.lang.String str16 = userController0.createLabManagerUser();
        boolean boolean18 = userController0.approveUser("Invalid email");
        java.lang.String str21 = userController0.loginUser("Invalid email", "hi!");
        boolean boolean23 = userController0.removeUser("hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Fail" + "'", str21.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str3 = userController0.loginUser("Fail", "hi!");
        java.lang.String str6 = userController0.loginUser("hi!", "");
        model.User.UserType userType9 = null;
        java.lang.String str12 = userController0.registerUser("Fail", "hi!", userType9, "hi!", "hi!");
        model.User.UserType userType15 = null;
        java.lang.String str18 = userController0.registerUser("Fail", "", userType15, "Invalid email", "Invalid email");
        java.lang.String str19 = userController0.createLabManagerUser();
        java.lang.String str22 = userController0.loginUser("hi!", "hi!");
        java.lang.String str25 = userController0.loginUser("", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Fail" + "'", str3.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Invalid email" + "'", str12.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Invalid email" + "'", str18.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Fail" + "'", str22.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Fail" + "'", str25.equals("Fail"));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        boolean boolean10 = userController0.approveUser("");
        java.lang.String str11 = userController0.createLabManagerUser();
        java.lang.String str12 = userController0.createLabManagerUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.approveUser("Fail");
        model.User.UserType userType11 = null;
        java.lang.String str14 = userController0.registerUser("Fail", "Fail", userType11, "Invalid email", "hi!");
        java.lang.String str15 = userController0.createLabManagerUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Invalid email" + "'", str14.equals("Invalid email"));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        java.lang.String str10 = userController0.createLabManagerUser();
        boolean boolean12 = userController0.removeUser("hi!");
        java.lang.String str13 = userController0.createLabManagerUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        model.User.UserType userType12 = null;
        java.lang.String str15 = userController0.registerUser("", "Fail", userType12, "hi!", "hi!");
        boolean boolean17 = userController0.removeUser("");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Invalid email" + "'", str15.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str3 = userController0.loginUser("Fail", "hi!");
        java.lang.String str6 = userController0.loginUser("hi!", "");
        model.User.UserType userType9 = null;
        java.lang.String str12 = userController0.registerUser("Fail", "hi!", userType9, "hi!", "hi!");
        model.User.UserType userType15 = null;
        java.lang.String str18 = userController0.registerUser("Fail", "", userType15, "Invalid email", "Invalid email");
        java.lang.String str19 = userController0.createLabManagerUser();
        java.lang.String str22 = userController0.loginUser("hi!", "hi!");
        java.lang.String str25 = userController0.loginUser("", "hi!");
        boolean boolean27 = userController0.approveUser("");
        boolean boolean29 = userController0.approveUser("Fail");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Fail" + "'", str3.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Invalid email" + "'", str12.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "Invalid email" + "'", str18.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Fail" + "'", str22.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Fail" + "'", str25.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        boolean boolean10 = userController0.removeUser("Invalid email");
        model.User.UserType userType13 = null;
        java.lang.String str16 = userController0.registerUser("hi!", "Fail", userType13, "Invalid email", "");
        model.User.UserType userType19 = null;
        java.lang.String str22 = userController0.registerUser("Fail", "Fail", userType19, "hi!", "");
        java.lang.String str25 = userController0.loginUser("", "Fail");
        model.User.UserType userType28 = null;
        java.lang.String str31 = userController0.registerUser("Fail", "Invalid email", userType28, "", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Invalid email" + "'", str16.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Invalid email" + "'", str22.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "Fail" + "'", str25.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str31 + "' != '" + "Invalid email" + "'", str31.equals("Invalid email"));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.approveUser("hi!");
        boolean boolean10 = userController0.removeUser("Invalid email");
        java.lang.String str13 = userController0.loginUser("hi!", "Fail");
        java.lang.String str16 = userController0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass17 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Fail" + "'", str16.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str3 = userController0.loginUser("Fail", "hi!");
        java.lang.String str6 = userController0.loginUser("hi!", "");
        model.User.UserType userType9 = null;
        java.lang.String str12 = userController0.registerUser("Fail", "", userType9, "", "hi!");
        java.lang.String str15 = userController0.loginUser("hi!", "");
        java.lang.Class<?> wildcardClass16 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Fail" + "'", str3.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Invalid email" + "'", str12.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Fail" + "'", str15.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        java.lang.String str11 = userController0.loginUser("", "Fail");
        java.lang.String str14 = userController0.loginUser("hi!", "");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Fail" + "'", str11.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Fail" + "'", str14.equals("Fail"));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        controller.UserController userController0 = controller.UserController.getInstance();
        java.lang.String str3 = userController0.loginUser("Invalid email", "Invalid email");
        java.lang.Class<?> wildcardClass4 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Fail" + "'", str3.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        boolean boolean10 = userController0.removeUser("Invalid email");
        model.User.UserType userType13 = null;
        java.lang.String str16 = userController0.registerUser("hi!", "Fail", userType13, "Invalid email", "");
        java.lang.String str17 = userController0.createLabManagerUser();
        boolean boolean19 = userController0.approveUser("Fail");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Invalid email" + "'", str16.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        boolean boolean11 = userController0.approveUser("Invalid email");
        boolean boolean13 = userController0.removeUser("Fail");
        boolean boolean15 = userController0.approveUser("");
        model.User.UserType userType18 = null;
        java.lang.String str21 = userController0.registerUser("Fail", "Fail", userType18, "Invalid email", "");
        java.lang.Class<?> wildcardClass22 = userController0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + "Invalid email" + "'", str21.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        controller.UserController userController0 = new controller.UserController();
        java.lang.String str3 = userController0.loginUser("hi!", "hi!");
        java.lang.String str6 = userController0.loginUser("", "");
        java.lang.String str7 = userController0.createLabManagerUser();
        java.lang.String str10 = userController0.loginUser("", "Fail");
        boolean boolean12 = userController0.approveUser("");
        java.lang.String str13 = userController0.createLabManagerUser();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Fail" + "'", str3.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Fail" + "'", str6.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Fail" + "'", str10.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        java.lang.String str11 = userController0.loginUser("", "Fail");
        model.User.UserType userType14 = null;
        java.lang.String str17 = userController0.registerUser("Invalid email", "hi!", userType14, "hi!", "Invalid email");
        model.User.UserType userType20 = null;
        java.lang.String str23 = userController0.registerUser("Fail", "Invalid email", userType20, "hi!", "Invalid email");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Fail" + "'", str11.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Invalid email" + "'", str17.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "Invalid email" + "'", str23.equals("Invalid email"));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        controller.UserController userController0 = controller.UserController.getInstance();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("hi!", "Invalid email", userType3, "", "");
        boolean boolean8 = userController0.removeUser("");
        boolean boolean10 = userController0.removeUser("Fail");
        java.lang.String str13 = userController0.loginUser("Fail", "Fail");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userController0);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        controller.UserController userController0 = new controller.UserController();
        boolean boolean2 = userController0.removeUser("");
        java.lang.String str5 = userController0.loginUser("", "Fail");
        java.lang.String str8 = userController0.loginUser("", "hi!");
        boolean boolean10 = userController0.removeUser("Invalid email");
        java.lang.String str13 = userController0.loginUser("Invalid email", "Fail");
        boolean boolean15 = userController0.removeUser("hi!");
        java.lang.String str16 = userController0.createLabManagerUser();
        boolean boolean18 = userController0.approveUser("");
        boolean boolean20 = userController0.removeUser("hi!");
        model.User.UserType userType23 = null;
        java.lang.String str26 = userController0.registerUser("Invalid email", "Invalid email", userType23, "Fail", "hi!");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Fail" + "'", str5.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Fail" + "'", str8.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "Fail" + "'", str13.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "Invalid email" + "'", str26.equals("Invalid email"));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        controller.UserController userController0 = new controller.UserController();
        model.User.UserType userType3 = null;
        java.lang.String str6 = userController0.registerUser("Fail", "", userType3, "", "Fail");
        java.lang.String str9 = userController0.loginUser("hi!", "");
        java.lang.String str10 = userController0.createLabManagerUser();
        boolean boolean12 = userController0.removeUser("");
        java.lang.String str13 = userController0.createLabManagerUser();
        java.lang.String str16 = userController0.loginUser("", "Fail");
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Invalid email" + "'", str6.equals("Invalid email"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "Fail" + "'", str9.equals("Fail"));
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "Fail" + "'", str16.equals("Fail"));
    }
}

