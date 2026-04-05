package model.User;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UserFactoryRegressionTest {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        model.User.UserType userType2 = null;
        model.User.User[] userArray5 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList6 = new java.util.ArrayList<model.User.User>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList6, userArray5);
        model.User.User user8 = model.User.UserFactory.createUser("hi!", "", userType2, "", "hi!", userList6);
        java.lang.Class<?> wildcardClass9 = user8.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray5);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user8);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType16 = null;
        model.User.User[] userArray19 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList20 = new java.util.ArrayList<model.User.User>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList20, userArray19);
        model.User.User user22 = model.User.UserFactory.createUser("hi!", "", userType16, "", "hi!", userList20);
        model.User.User user23 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList20);
        model.User.User user24 = model.User.UserFactory.createUser("hi!", "", userType7, "hi!", "", userList20);
        model.User.UserType userType27 = null;
        model.User.UserType userType36 = null;
        model.User.User[] userArray39 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList40 = new java.util.ArrayList<model.User.User>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList40, userArray39);
        model.User.User user42 = model.User.UserFactory.createUser("hi!", "", userType36, "", "hi!", userList40);
        model.User.User user43 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList40);
        model.User.User user44 = model.User.UserFactory.createUser("hi!", "", userType27, "hi!", "", userList40);
        model.User.UserType userType47 = null;
        model.User.User[] userArray50 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList51 = new java.util.ArrayList<model.User.User>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList51, userArray50);
        model.User.User user53 = model.User.UserFactory.createUser("hi!", "", userType47, "", "hi!", userList51);
        model.User.UserType userType56 = null;
        model.User.User[] userArray59 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList60 = new java.util.ArrayList<model.User.User>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList60, userArray59);
        model.User.User user62 = model.User.UserFactory.createUser("hi!", "", userType56, "", "hi!", userList60);
        model.User.User[] userArray63 = new model.User.User[] { user24, user44, user53, user62 };
        java.util.ArrayList<model.User.User> userList64 = new java.util.ArrayList<model.User.User>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList64, userArray63);
        // The following exception was thrown during execution in test generation
        try {
            model.User.User user66 = model.User.UserFactory.createUser("hi!", "", userType2, "", "hi!", userList64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email already exists");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        model.User.UserType userType2 = null;
        model.User.UserType userType11 = null;
        model.User.User[] userArray14 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList15 = new java.util.ArrayList<model.User.User>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList15, userArray14);
        model.User.User user17 = model.User.UserFactory.createUser("hi!", "", userType11, "", "hi!", userList15);
        model.User.User user18 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList15);
        model.User.User user19 = model.User.UserFactory.createUser("hi!", "", userType2, "hi!", "", userList15);
        java.lang.Class<?> wildcardClass20 = user19.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        model.User.UserType userType10 = null;
        model.User.User[] userArray13 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList14 = new java.util.ArrayList<model.User.User>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList14, userArray13);
        model.User.User user16 = model.User.UserFactory.createUser("hi!", "", userType10, "", "hi!", userList14);
        model.User.User user17 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList14);
        model.User.User[] userArray18 = new model.User.User[] { user17 };
        java.util.ArrayList<model.User.User> userList19 = new java.util.ArrayList<model.User.User>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList19, userArray18);
        model.User.User user21 = model.User.UserFactory.createLabManager("", "", "hi!", "", userList19);
        java.lang.Class<?> wildcardClass22 = userList19.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        model.User.UserType userType14 = null;
        model.User.User[] userArray17 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList18 = new java.util.ArrayList<model.User.User>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList18, userArray17);
        model.User.User user20 = model.User.UserFactory.createUser("hi!", "", userType14, "", "hi!", userList18);
        model.User.User user21 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList18);
        model.User.User[] userArray22 = new model.User.User[] { user21 };
        java.util.ArrayList<model.User.User> userList23 = new java.util.ArrayList<model.User.User>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList23, userArray22);
        model.User.User user25 = model.User.UserFactory.createLabManager("", "", "hi!", "", userList23);
        // The following exception was thrown during execution in test generation
        try {
            model.User.User user26 = model.User.UserFactory.createLabManager("hi!", "", "hi!", "hi!", userList23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email already exists");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user25);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType16 = null;
        model.User.User[] userArray19 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList20 = new java.util.ArrayList<model.User.User>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList20, userArray19);
        model.User.User user22 = model.User.UserFactory.createUser("hi!", "", userType16, "", "hi!", userList20);
        model.User.User user23 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList20);
        model.User.User user24 = model.User.UserFactory.createUser("hi!", "", userType7, "hi!", "", userList20);
        model.User.User user25 = model.User.UserFactory.createUser("hi!", "", userType2, "hi!", "", userList20);
        java.lang.Class<?> wildcardClass26 = userList20.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        model.User.UserType userType2 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType20 = null;
        model.User.User[] userArray23 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList24 = new java.util.ArrayList<model.User.User>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList24, userArray23);
        model.User.User user26 = model.User.UserFactory.createUser("hi!", "", userType20, "", "hi!", userList24);
        model.User.User user27 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList24);
        model.User.User user28 = model.User.UserFactory.createUser("hi!", "", userType11, "hi!", "", userList24);
        model.User.User user29 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList24);
        model.User.User user30 = model.User.UserFactory.createUser("hi!", "hi!", userType2, "", "", userList24);
        java.lang.Class<?> wildcardClass31 = user30.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        model.User.UserType userType2 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType20 = null;
        model.User.User[] userArray23 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList24 = new java.util.ArrayList<model.User.User>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList24, userArray23);
        model.User.User user26 = model.User.UserFactory.createUser("hi!", "", userType20, "", "hi!", userList24);
        model.User.User user27 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList24);
        model.User.User user28 = model.User.UserFactory.createUser("hi!", "", userType11, "hi!", "", userList24);
        model.User.User user29 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList24);
        model.User.User user30 = model.User.UserFactory.createUser("hi!", "hi!", userType2, "", "", userList24);
        java.lang.Class<?> wildcardClass31 = userList24.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        model.User.UserType userType6 = null;
        model.User.UserType userType15 = null;
        model.User.User[] userArray18 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList19 = new java.util.ArrayList<model.User.User>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList19, userArray18);
        model.User.User user21 = model.User.UserFactory.createUser("hi!", "", userType15, "", "hi!", userList19);
        model.User.User user22 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList19);
        model.User.User user23 = model.User.UserFactory.createUser("hi!", "", userType6, "hi!", "", userList19);
        model.User.User user24 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList19);
        java.lang.Class<?> wildcardClass25 = userList19.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        model.User.UserType userType2 = null;
        model.User.UserType userType11 = null;
        model.User.User[] userArray14 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList15 = new java.util.ArrayList<model.User.User>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList15, userArray14);
        model.User.User user17 = model.User.UserFactory.createUser("hi!", "", userType11, "", "hi!", userList15);
        model.User.User user18 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList15);
        model.User.User user19 = model.User.UserFactory.createUser("hi!", "hi!", userType2, "hi!", "hi!", userList15);
        java.lang.Class<?> wildcardClass20 = userList15.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        model.User.UserType userType6 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType24 = null;
        model.User.User[] userArray27 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList28 = new java.util.ArrayList<model.User.User>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList28, userArray27);
        model.User.User user30 = model.User.UserFactory.createUser("hi!", "", userType24, "", "hi!", userList28);
        model.User.User user31 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList28);
        model.User.User user32 = model.User.UserFactory.createUser("hi!", "", userType15, "hi!", "", userList28);
        model.User.User user33 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList28);
        model.User.User user34 = model.User.UserFactory.createUser("hi!", "hi!", userType6, "", "", userList28);
        model.User.User user35 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList28);
        java.lang.Class<?> wildcardClass36 = userList28.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        model.User.UserType userType2 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType24 = null;
        model.User.UserType userType33 = null;
        model.User.User[] userArray36 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList37 = new java.util.ArrayList<model.User.User>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList37, userArray36);
        model.User.User user39 = model.User.UserFactory.createUser("hi!", "", userType33, "", "hi!", userList37);
        model.User.User user40 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList37);
        model.User.User user41 = model.User.UserFactory.createUser("hi!", "", userType24, "hi!", "", userList37);
        model.User.User user42 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList37);
        model.User.User user43 = model.User.UserFactory.createUser("hi!", "hi!", userType15, "", "", userList37);
        model.User.User user44 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList37);
        model.User.User user45 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "hi!", userList37);
        model.User.User user46 = model.User.UserFactory.createUser("", "hi!", userType2, "", "hi!", userList37);
        java.lang.Class<?> wildcardClass47 = user46.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType16 = null;
        model.User.User[] userArray19 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList20 = new java.util.ArrayList<model.User.User>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList20, userArray19);
        model.User.User user22 = model.User.UserFactory.createUser("hi!", "", userType16, "", "hi!", userList20);
        model.User.User user23 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList20);
        model.User.User user24 = model.User.UserFactory.createUser("hi!", "", userType7, "hi!", "", userList20);
        model.User.User user25 = model.User.UserFactory.createUser("hi!", "hi!", userType2, "", "", userList20);
        java.lang.Class<?> wildcardClass26 = userList20.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.util.ArrayList<model.User.User> userList4 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.User.User user5 = model.User.UserFactory.createLabManager("hi!", "", "hi!", "hi!", userList4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.iterator()\" because \"users\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType12 = null;
        model.User.UserType userType21 = null;
        model.User.User[] userArray24 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList25 = new java.util.ArrayList<model.User.User>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList25, userArray24);
        model.User.User user27 = model.User.UserFactory.createUser("hi!", "", userType21, "", "hi!", userList25);
        model.User.User user28 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList25);
        model.User.User user29 = model.User.UserFactory.createUser("hi!", "", userType12, "hi!", "", userList25);
        model.User.User user30 = model.User.UserFactory.createUser("hi!", "hi!", userType7, "", "", userList25);
        model.User.User user31 = model.User.UserFactory.createUser("hi!", "", userType2, "", "hi!", userList25);
        java.lang.Class<?> wildcardClass32 = userList25.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        model.User.UserType userType2 = null;
        model.User.UserType userType11 = null;
        model.User.User[] userArray14 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList15 = new java.util.ArrayList<model.User.User>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList15, userArray14);
        model.User.User user17 = model.User.UserFactory.createUser("hi!", "", userType11, "", "hi!", userList15);
        model.User.User user18 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList15);
        model.User.User user19 = model.User.UserFactory.createUser("hi!", "", userType2, "", "", userList15);
        java.lang.Class<?> wildcardClass20 = userList15.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        model.User.UserType userType2 = null;
        model.User.UserType userType11 = null;
        model.User.User[] userArray14 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList15 = new java.util.ArrayList<model.User.User>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList15, userArray14);
        model.User.User user17 = model.User.UserFactory.createUser("hi!", "", userType11, "", "hi!", userList15);
        model.User.User user18 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList15);
        model.User.User user19 = model.User.UserFactory.createUser("hi!", "", userType2, "", "", userList15);
        java.lang.Class<?> wildcardClass20 = user19.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType25 = null;
        model.User.User[] userArray28 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList29 = new java.util.ArrayList<model.User.User>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList29, userArray28);
        model.User.User user31 = model.User.UserFactory.createUser("hi!", "", userType25, "", "hi!", userList29);
        model.User.User user32 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList29);
        model.User.User user33 = model.User.UserFactory.createUser("hi!", "", userType16, "hi!", "", userList29);
        model.User.User user34 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList29);
        model.User.User user35 = model.User.UserFactory.createUser("hi!", "hi!", userType7, "", "", userList29);
        model.User.User user36 = model.User.UserFactory.createUser("hi!", "", userType2, "hi!", "hi!", userList29);
        java.lang.Class<?> wildcardClass37 = userList29.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType16 = null;
        model.User.User[] userArray19 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList20 = new java.util.ArrayList<model.User.User>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList20, userArray19);
        model.User.User user22 = model.User.UserFactory.createUser("hi!", "", userType16, "", "hi!", userList20);
        model.User.User user23 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList20);
        model.User.User user24 = model.User.UserFactory.createUser("hi!", "", userType7, "hi!", "", userList20);
        model.User.User user25 = model.User.UserFactory.createUser("", "", userType2, "hi!", "hi!", userList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user25);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType12 = null;
        model.User.UserType userType21 = null;
        model.User.User[] userArray24 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList25 = new java.util.ArrayList<model.User.User>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList25, userArray24);
        model.User.User user27 = model.User.UserFactory.createUser("hi!", "", userType21, "", "hi!", userList25);
        model.User.User user28 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList25);
        model.User.User user29 = model.User.UserFactory.createUser("hi!", "", userType12, "hi!", "", userList25);
        model.User.User user30 = model.User.UserFactory.createUser("hi!", "", userType7, "hi!", "", userList25);
        model.User.User user31 = model.User.UserFactory.createUser("", "hi!", userType2, "hi!", "", userList25);
        java.lang.Class<?> wildcardClass32 = user31.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType29 = null;
        model.User.UserType userType38 = null;
        model.User.User[] userArray41 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList42 = new java.util.ArrayList<model.User.User>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList42, userArray41);
        model.User.User user44 = model.User.UserFactory.createUser("hi!", "", userType38, "", "hi!", userList42);
        model.User.User user45 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList42);
        model.User.User user46 = model.User.UserFactory.createUser("hi!", "", userType29, "hi!", "", userList42);
        model.User.User user47 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList42);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "hi!", userType20, "", "", userList42);
        model.User.User user49 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList42);
        model.User.User user50 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "hi!", userList42);
        model.User.User user51 = model.User.UserFactory.createUser("", "hi!", userType7, "", "hi!", userList42);
        model.User.User user52 = model.User.UserFactory.createUser("", "hi!", userType2, "", "hi!", userList42);
        java.lang.Class<?> wildcardClass53 = user52.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        model.User.UserType userType14 = null;
        model.User.User[] userArray17 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList18 = new java.util.ArrayList<model.User.User>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList18, userArray17);
        model.User.User user20 = model.User.UserFactory.createUser("hi!", "", userType14, "", "hi!", userList18);
        model.User.User user21 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList18);
        model.User.User[] userArray22 = new model.User.User[] { user21 };
        java.util.ArrayList<model.User.User> userList23 = new java.util.ArrayList<model.User.User>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList23, userArray22);
        model.User.User user25 = model.User.UserFactory.createLabManager("", "", "hi!", "", userList23);
        // The following exception was thrown during execution in test generation
        try {
            model.User.User user26 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "hi!", userList23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email already exists");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user25);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType20 = null;
        model.User.User[] userArray23 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList24 = new java.util.ArrayList<model.User.User>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList24, userArray23);
        model.User.User user26 = model.User.UserFactory.createUser("hi!", "", userType20, "", "hi!", userList24);
        model.User.User user27 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList24);
        model.User.User user28 = model.User.UserFactory.createUser("hi!", "", userType11, "hi!", "", userList24);
        model.User.User user29 = model.User.UserFactory.createUser("", "", userType6, "", "", userList24);
        model.User.User user30 = model.User.UserFactory.createLabManager("", "hi!", "hi!", "hi!", userList24);
        java.lang.Class<?> wildcardClass31 = userList24.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        model.User.UserType userType10 = null;
        model.User.UserType userType19 = null;
        model.User.UserType userType28 = null;
        model.User.User[] userArray31 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList32 = new java.util.ArrayList<model.User.User>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList32, userArray31);
        model.User.User user34 = model.User.UserFactory.createUser("hi!", "", userType28, "", "hi!", userList32);
        model.User.User user35 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList32);
        model.User.User user36 = model.User.UserFactory.createUser("hi!", "", userType19, "hi!", "", userList32);
        model.User.User user37 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList32);
        model.User.User user38 = model.User.UserFactory.createUser("hi!", "hi!", userType10, "", "", userList32);
        model.User.User user39 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList32);
        model.User.User user40 = model.User.UserFactory.createLabManager("", "", "", "", userList32);
        java.lang.Class<?> wildcardClass41 = userList32.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType25 = null;
        model.User.User[] userArray28 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList29 = new java.util.ArrayList<model.User.User>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList29, userArray28);
        model.User.User user31 = model.User.UserFactory.createUser("hi!", "", userType25, "", "hi!", userList29);
        model.User.User user32 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList29);
        model.User.User user33 = model.User.UserFactory.createUser("hi!", "", userType16, "hi!", "", userList29);
        model.User.User user34 = model.User.UserFactory.createUser("hi!", "", userType11, "hi!", "", userList29);
        model.User.User user35 = model.User.UserFactory.createUser("hi!", "hi!", userType6, "", "", userList29);
        model.User.User user36 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList29);
        java.lang.Class<?> wildcardClass37 = userList29.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        model.User.UserType userType10 = null;
        model.User.UserType userType19 = null;
        model.User.UserType userType28 = null;
        model.User.User[] userArray31 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList32 = new java.util.ArrayList<model.User.User>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList32, userArray31);
        model.User.User user34 = model.User.UserFactory.createUser("hi!", "", userType28, "", "hi!", userList32);
        model.User.User user35 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList32);
        model.User.User user36 = model.User.UserFactory.createUser("hi!", "", userType19, "hi!", "", userList32);
        model.User.User user37 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList32);
        model.User.User user38 = model.User.UserFactory.createUser("hi!", "hi!", userType10, "", "", userList32);
        model.User.User user39 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList32);
        model.User.User user40 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "hi!", userList32);
        java.lang.Class<?> wildcardClass41 = user40.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        model.User.UserType userType10 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType29 = null;
        model.User.User[] userArray32 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList33 = new java.util.ArrayList<model.User.User>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList33, userArray32);
        model.User.User user35 = model.User.UserFactory.createUser("hi!", "", userType29, "", "hi!", userList33);
        model.User.User user36 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList33);
        model.User.User user37 = model.User.UserFactory.createUser("hi!", "", userType20, "hi!", "", userList33);
        model.User.User user38 = model.User.UserFactory.createUser("hi!", "", userType15, "hi!", "", userList33);
        model.User.User user39 = model.User.UserFactory.createUser("hi!", "hi!", userType10, "", "", userList33);
        model.User.User user40 = model.User.UserFactory.createLabManager("hi!", "", "", "hi!", userList33);
        model.User.User user41 = model.User.UserFactory.createLabManager("hi!", "", "hi!", "", userList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        model.User.UserType userType14 = null;
        model.User.UserType userType23 = null;
        model.User.UserType userType32 = null;
        model.User.User[] userArray35 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList36 = new java.util.ArrayList<model.User.User>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList36, userArray35);
        model.User.User user38 = model.User.UserFactory.createUser("hi!", "", userType32, "", "hi!", userList36);
        model.User.User user39 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList36);
        model.User.User user40 = model.User.UserFactory.createUser("hi!", "", userType23, "hi!", "", userList36);
        model.User.User user41 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList36);
        model.User.User user42 = model.User.UserFactory.createUser("hi!", "hi!", userType14, "", "", userList36);
        model.User.User user43 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList36);
        model.User.User user44 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "hi!", userList36);
        model.User.User user45 = model.User.UserFactory.createLabManager("hi!", "", "hi!", "hi!", userList36);
        java.lang.Class<?> wildcardClass46 = user45.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType16 = null;
        model.User.User[] userArray19 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList20 = new java.util.ArrayList<model.User.User>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList20, userArray19);
        model.User.User user22 = model.User.UserFactory.createUser("hi!", "", userType16, "", "hi!", userList20);
        model.User.User user23 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList20);
        model.User.User user24 = model.User.UserFactory.createUser("hi!", "", userType7, "hi!", "", userList20);
        model.User.User user25 = model.User.UserFactory.createUser("", "", userType2, "", "", userList20);
        java.lang.Class<?> wildcardClass26 = user25.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        model.User.UserType userType6 = null;
        model.User.UserType userType19 = null;
        model.User.UserType userType28 = null;
        model.User.UserType userType37 = null;
        model.User.User[] userArray40 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList41 = new java.util.ArrayList<model.User.User>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList41, userArray40);
        model.User.User user43 = model.User.UserFactory.createUser("hi!", "", userType37, "", "hi!", userList41);
        model.User.User user44 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList41);
        model.User.User user45 = model.User.UserFactory.createUser("hi!", "", userType28, "hi!", "", userList41);
        model.User.User user46 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList41);
        model.User.User user47 = model.User.UserFactory.createUser("hi!", "hi!", userType19, "", "", userList41);
        model.User.User user48 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList41);
        model.User.User user49 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "hi!", userList41);
        model.User.User user50 = model.User.UserFactory.createUser("", "hi!", userType6, "", "hi!", userList41);
        model.User.User user51 = model.User.UserFactory.createLabManager("hi!", "", "", "hi!", userList41);
        java.lang.Class<?> wildcardClass52 = userList41.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        model.User.UserType userType2 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType24 = null;
        model.User.UserType userType33 = null;
        model.User.User[] userArray36 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList37 = new java.util.ArrayList<model.User.User>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList37, userArray36);
        model.User.User user39 = model.User.UserFactory.createUser("hi!", "", userType33, "", "hi!", userList37);
        model.User.User user40 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList37);
        model.User.User user41 = model.User.UserFactory.createUser("hi!", "", userType24, "hi!", "", userList37);
        model.User.User user42 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList37);
        model.User.User user43 = model.User.UserFactory.createUser("hi!", "hi!", userType15, "", "", userList37);
        model.User.User user44 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList37);
        model.User.User user45 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "hi!", userList37);
        model.User.User user46 = model.User.UserFactory.createUser("", "hi!", userType2, "", "", userList37);
        java.lang.Class<?> wildcardClass47 = userList37.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType16 = null;
        model.User.User[] userArray19 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList20 = new java.util.ArrayList<model.User.User>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList20, userArray19);
        model.User.User user22 = model.User.UserFactory.createUser("hi!", "", userType16, "", "hi!", userList20);
        model.User.User user23 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList20);
        model.User.User user24 = model.User.UserFactory.createUser("hi!", "", userType7, "hi!", "", userList20);
        model.User.User user25 = model.User.UserFactory.createUser("", "", userType2, "", "", userList20);
        java.lang.Class<?> wildcardClass26 = userList20.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        model.User.UserType userType6 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType24 = null;
        model.User.User[] userArray27 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList28 = new java.util.ArrayList<model.User.User>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList28, userArray27);
        model.User.User user30 = model.User.UserFactory.createUser("hi!", "", userType24, "", "hi!", userList28);
        model.User.User user31 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList28);
        model.User.User user32 = model.User.UserFactory.createUser("hi!", "", userType15, "hi!", "", userList28);
        model.User.User user33 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList28);
        model.User.User user34 = model.User.UserFactory.createUser("hi!", "", userType6, "hi!", "", userList28);
        model.User.User user35 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList28);
        java.lang.Class<?> wildcardClass36 = userList28.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.util.ArrayList<model.User.User> userList4 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.User.User user5 = model.User.UserFactory.createLabManager("", "", "hi!", "hi!", userList4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.iterator()\" because \"users\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType29 = null;
        model.User.User[] userArray32 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList33 = new java.util.ArrayList<model.User.User>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList33, userArray32);
        model.User.User user35 = model.User.UserFactory.createUser("hi!", "", userType29, "", "hi!", userList33);
        model.User.User user36 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList33);
        model.User.User user37 = model.User.UserFactory.createUser("hi!", "", userType20, "hi!", "", userList33);
        model.User.User user38 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList33);
        model.User.User user39 = model.User.UserFactory.createUser("hi!", "", userType11, "hi!", "", userList33);
        model.User.User user40 = model.User.UserFactory.createUser("hi!", "", userType6, "hi!", "hi!", userList33);
        model.User.User user41 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList33);
        java.lang.Class<?> wildcardClass42 = userList33.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType29 = null;
        model.User.UserType userType38 = null;
        model.User.User[] userArray41 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList42 = new java.util.ArrayList<model.User.User>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList42, userArray41);
        model.User.User user44 = model.User.UserFactory.createUser("hi!", "", userType38, "", "hi!", userList42);
        model.User.User user45 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList42);
        model.User.User user46 = model.User.UserFactory.createUser("hi!", "", userType29, "hi!", "", userList42);
        model.User.User user47 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList42);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "hi!", userType20, "", "", userList42);
        model.User.User user49 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList42);
        model.User.User user50 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "hi!", userList42);
        model.User.User user51 = model.User.UserFactory.createUser("", "hi!", userType7, "", "hi!", userList42);
        model.User.User user52 = model.User.UserFactory.createUser("", "hi!", userType2, "", "hi!", userList42);
        java.lang.Class<?> wildcardClass53 = userList42.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType16 = null;
        model.User.User[] userArray19 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList20 = new java.util.ArrayList<model.User.User>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList20, userArray19);
        model.User.User user22 = model.User.UserFactory.createUser("hi!", "", userType16, "", "hi!", userList20);
        model.User.User user23 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList20);
        model.User.User user24 = model.User.UserFactory.createUser("hi!", "hi!", userType7, "hi!", "hi!", userList20);
        model.User.User user25 = model.User.UserFactory.createUser("hi!", "hi!", userType2, "hi!", "", userList20);
        java.lang.Class<?> wildcardClass26 = userList20.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.util.ArrayList<model.User.User> userList4 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.User.User user5 = model.User.UserFactory.createLabManager("", "hi!", "hi!", "hi!", userList4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.iterator()\" because \"users\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        model.User.UserType userType10 = null;
        model.User.UserType userType19 = null;
        model.User.UserType userType28 = null;
        model.User.User[] userArray31 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList32 = new java.util.ArrayList<model.User.User>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList32, userArray31);
        model.User.User user34 = model.User.UserFactory.createUser("hi!", "", userType28, "", "hi!", userList32);
        model.User.User user35 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList32);
        model.User.User user36 = model.User.UserFactory.createUser("hi!", "", userType19, "hi!", "", userList32);
        model.User.User user37 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList32);
        model.User.User user38 = model.User.UserFactory.createUser("hi!", "hi!", userType10, "", "", userList32);
        model.User.User user39 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList32);
        model.User.User user40 = model.User.UserFactory.createLabManager("", "", "hi!", "hi!", userList32);
        java.lang.Class<?> wildcardClass41 = user40.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        model.User.UserType userType10 = null;
        model.User.UserType userType19 = null;
        model.User.UserType userType28 = null;
        model.User.User[] userArray31 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList32 = new java.util.ArrayList<model.User.User>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList32, userArray31);
        model.User.User user34 = model.User.UserFactory.createUser("hi!", "", userType28, "", "hi!", userList32);
        model.User.User user35 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList32);
        model.User.User user36 = model.User.UserFactory.createUser("hi!", "", userType19, "hi!", "", userList32);
        model.User.User user37 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList32);
        model.User.User user38 = model.User.UserFactory.createUser("hi!", "hi!", userType10, "", "", userList32);
        model.User.User user39 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList32);
        model.User.User user40 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList32);
        java.lang.Class<?> wildcardClass41 = userList32.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        model.User.UserFactory userFactory0 = new model.User.UserFactory();
        java.lang.Class<?> wildcardClass1 = userFactory0.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType25 = null;
        model.User.User[] userArray28 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList29 = new java.util.ArrayList<model.User.User>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList29, userArray28);
        model.User.User user31 = model.User.UserFactory.createUser("hi!", "", userType25, "", "hi!", userList29);
        model.User.User user32 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList29);
        model.User.User user33 = model.User.UserFactory.createUser("hi!", "", userType16, "hi!", "", userList29);
        model.User.User user34 = model.User.UserFactory.createUser("hi!", "", userType11, "hi!", "", userList29);
        model.User.User user35 = model.User.UserFactory.createUser("", "hi!", userType6, "hi!", "", userList29);
        model.User.User user36 = model.User.UserFactory.createLabManager("", "", "hi!", "hi!", userList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        model.User.UserType userType6 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType24 = null;
        model.User.User[] userArray27 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList28 = new java.util.ArrayList<model.User.User>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList28, userArray27);
        model.User.User user30 = model.User.UserFactory.createUser("hi!", "", userType24, "", "hi!", userList28);
        model.User.User user31 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList28);
        model.User.User user32 = model.User.UserFactory.createUser("hi!", "", userType15, "hi!", "", userList28);
        model.User.User user33 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList28);
        model.User.User user34 = model.User.UserFactory.createUser("hi!", "hi!", userType6, "", "", userList28);
        model.User.User user35 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList28);
        java.lang.Class<?> wildcardClass36 = user35.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType12 = null;
        model.User.UserType userType21 = null;
        model.User.User[] userArray24 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList25 = new java.util.ArrayList<model.User.User>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList25, userArray24);
        model.User.User user27 = model.User.UserFactory.createUser("hi!", "", userType21, "", "hi!", userList25);
        model.User.User user28 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList25);
        model.User.User user29 = model.User.UserFactory.createUser("hi!", "", userType12, "hi!", "", userList25);
        model.User.User user30 = model.User.UserFactory.createUser("hi!", "hi!", userType7, "", "", userList25);
        model.User.User user31 = model.User.UserFactory.createUser("hi!", "", userType2, "", "hi!", userList25);
        java.lang.Class<?> wildcardClass32 = user31.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        model.User.UserType userType2 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType29 = null;
        model.User.User[] userArray32 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList33 = new java.util.ArrayList<model.User.User>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList33, userArray32);
        model.User.User user35 = model.User.UserFactory.createUser("hi!", "", userType29, "", "hi!", userList33);
        model.User.User user36 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList33);
        model.User.User user37 = model.User.UserFactory.createUser("hi!", "", userType20, "hi!", "", userList33);
        model.User.User user38 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList33);
        model.User.User user39 = model.User.UserFactory.createUser("hi!", "", userType11, "hi!", "", userList33);
        model.User.User user40 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "", userList33);
        model.User.User user41 = model.User.UserFactory.createUser("", "", userType2, "hi!", "", userList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType12 = null;
        model.User.UserType userType21 = null;
        model.User.User[] userArray24 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList25 = new java.util.ArrayList<model.User.User>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList25, userArray24);
        model.User.User user27 = model.User.UserFactory.createUser("hi!", "", userType21, "", "hi!", userList25);
        model.User.User user28 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList25);
        model.User.User user29 = model.User.UserFactory.createUser("hi!", "", userType12, "hi!", "", userList25);
        model.User.User user30 = model.User.UserFactory.createUser("", "hi!", userType7, "hi!", "", userList25);
        model.User.User user31 = model.User.UserFactory.createUser("hi!", "", userType2, "hi!", "", userList25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user31);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType12 = null;
        model.User.UserType userType21 = null;
        model.User.UserType userType30 = null;
        model.User.User[] userArray33 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList34 = new java.util.ArrayList<model.User.User>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList34, userArray33);
        model.User.User user36 = model.User.UserFactory.createUser("hi!", "", userType30, "", "hi!", userList34);
        model.User.User user37 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList34);
        model.User.User user38 = model.User.UserFactory.createUser("hi!", "", userType21, "hi!", "", userList34);
        model.User.User user39 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList34);
        model.User.User user40 = model.User.UserFactory.createUser("hi!", "hi!", userType12, "", "", userList34);
        model.User.User user41 = model.User.UserFactory.createUser("hi!", "", userType7, "hi!", "hi!", userList34);
        model.User.User user42 = model.User.UserFactory.createUser("hi!", "", userType2, "", "", userList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        model.User.UserType userType10 = null;
        model.User.UserType userType19 = null;
        model.User.UserType userType28 = null;
        model.User.User[] userArray31 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList32 = new java.util.ArrayList<model.User.User>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList32, userArray31);
        model.User.User user34 = model.User.UserFactory.createUser("hi!", "", userType28, "", "hi!", userList32);
        model.User.User user35 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList32);
        model.User.User user36 = model.User.UserFactory.createUser("hi!", "", userType19, "hi!", "", userList32);
        model.User.User user37 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList32);
        model.User.User user38 = model.User.UserFactory.createUser("hi!", "hi!", userType10, "", "", userList32);
        model.User.User user39 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList32);
        model.User.User user40 = model.User.UserFactory.createLabManager("", "", "hi!", "hi!", userList32);
        java.lang.Class<?> wildcardClass41 = userList32.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        model.User.UserType userType10 = null;
        model.User.UserType userType19 = null;
        model.User.UserType userType28 = null;
        model.User.User[] userArray31 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList32 = new java.util.ArrayList<model.User.User>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList32, userArray31);
        model.User.User user34 = model.User.UserFactory.createUser("hi!", "", userType28, "", "hi!", userList32);
        model.User.User user35 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList32);
        model.User.User user36 = model.User.UserFactory.createUser("hi!", "", userType19, "hi!", "", userList32);
        model.User.User user37 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList32);
        model.User.User user38 = model.User.UserFactory.createUser("hi!", "hi!", userType10, "", "", userList32);
        model.User.User user39 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList32);
        model.User.User user40 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList32);
        java.lang.Class<?> wildcardClass41 = user40.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        model.User.UserType userType18 = null;
        model.User.UserType userType27 = null;
        model.User.UserType userType36 = null;
        model.User.User[] userArray39 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList40 = new java.util.ArrayList<model.User.User>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList40, userArray39);
        model.User.User user42 = model.User.UserFactory.createUser("hi!", "", userType36, "", "hi!", userList40);
        model.User.User user43 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList40);
        model.User.User user44 = model.User.UserFactory.createUser("hi!", "", userType27, "hi!", "", userList40);
        model.User.User user45 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList40);
        model.User.User user46 = model.User.UserFactory.createUser("hi!", "hi!", userType18, "", "", userList40);
        model.User.User user47 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList40);
        model.User.User user48 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "hi!", userList40);
        model.User.User user49 = model.User.UserFactory.createLabManager("hi!", "", "hi!", "hi!", userList40);
        model.User.User user50 = model.User.UserFactory.createLabManager("", "", "", "", userList40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        model.User.UserType userType2 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType24 = null;
        model.User.UserType userType33 = null;
        model.User.User[] userArray36 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList37 = new java.util.ArrayList<model.User.User>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList37, userArray36);
        model.User.User user39 = model.User.UserFactory.createUser("hi!", "", userType33, "", "hi!", userList37);
        model.User.User user40 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList37);
        model.User.User user41 = model.User.UserFactory.createUser("hi!", "", userType24, "hi!", "", userList37);
        model.User.User user42 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList37);
        model.User.User user43 = model.User.UserFactory.createUser("hi!", "hi!", userType15, "", "", userList37);
        model.User.User user44 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList37);
        model.User.User user45 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "hi!", userList37);
        model.User.User user46 = model.User.UserFactory.createUser("", "hi!", userType2, "", "hi!", userList37);
        java.lang.Class<?> wildcardClass47 = userList37.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        model.User.UserType userType6 = null;
        model.User.UserType userType19 = null;
        model.User.UserType userType28 = null;
        model.User.UserType userType37 = null;
        model.User.User[] userArray40 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList41 = new java.util.ArrayList<model.User.User>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList41, userArray40);
        model.User.User user43 = model.User.UserFactory.createUser("hi!", "", userType37, "", "hi!", userList41);
        model.User.User user44 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList41);
        model.User.User user45 = model.User.UserFactory.createUser("hi!", "", userType28, "hi!", "", userList41);
        model.User.User user46 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList41);
        model.User.User user47 = model.User.UserFactory.createUser("hi!", "hi!", userType19, "", "", userList41);
        model.User.User user48 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList41);
        model.User.User user49 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList41);
        model.User.User user50 = model.User.UserFactory.createUser("", "", userType6, "hi!", "hi!", userList41);
        model.User.User user51 = model.User.UserFactory.createLabManager("hi!", "", "hi!", "hi!", userList41);
        java.lang.Class<?> wildcardClass52 = userList41.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        model.User.UserType userType10 = null;
        model.User.UserType userType19 = null;
        model.User.UserType userType28 = null;
        model.User.User[] userArray31 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList32 = new java.util.ArrayList<model.User.User>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList32, userArray31);
        model.User.User user34 = model.User.UserFactory.createUser("hi!", "", userType28, "", "hi!", userList32);
        model.User.User user35 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList32);
        model.User.User user36 = model.User.UserFactory.createUser("hi!", "", userType19, "hi!", "", userList32);
        model.User.User user37 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList32);
        model.User.User user38 = model.User.UserFactory.createUser("hi!", "", userType10, "hi!", "", userList32);
        model.User.User user39 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "", userList32);
        model.User.User user40 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "hi!", userList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        model.User.UserType userType2 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType24 = null;
        model.User.UserType userType33 = null;
        model.User.User[] userArray36 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList37 = new java.util.ArrayList<model.User.User>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList37, userArray36);
        model.User.User user39 = model.User.UserFactory.createUser("hi!", "", userType33, "", "hi!", userList37);
        model.User.User user40 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList37);
        model.User.User user41 = model.User.UserFactory.createUser("hi!", "", userType24, "hi!", "", userList37);
        model.User.User user42 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList37);
        model.User.User user43 = model.User.UserFactory.createUser("hi!", "hi!", userType15, "", "", userList37);
        model.User.User user44 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList37);
        model.User.User user45 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList37);
        model.User.User user46 = model.User.UserFactory.createUser("", "", userType2, "hi!", "hi!", userList37);
        java.lang.Class<?> wildcardClass47 = user46.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        model.User.UserType userType2 = null;
        model.User.UserType userType11 = null;
        model.User.User[] userArray14 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList15 = new java.util.ArrayList<model.User.User>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList15, userArray14);
        model.User.User user17 = model.User.UserFactory.createUser("hi!", "", userType11, "", "hi!", userList15);
        model.User.User user18 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList15);
        model.User.User user19 = model.User.UserFactory.createUser("", "", userType2, "", "hi!", userList15);
        java.lang.Class<?> wildcardClass20 = user19.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        model.User.UserType userType2 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType24 = null;
        model.User.UserType userType33 = null;
        model.User.User[] userArray36 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList37 = new java.util.ArrayList<model.User.User>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList37, userArray36);
        model.User.User user39 = model.User.UserFactory.createUser("hi!", "", userType33, "", "hi!", userList37);
        model.User.User user40 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList37);
        model.User.User user41 = model.User.UserFactory.createUser("hi!", "", userType24, "hi!", "", userList37);
        model.User.User user42 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList37);
        model.User.User user43 = model.User.UserFactory.createUser("hi!", "hi!", userType15, "", "", userList37);
        model.User.User user44 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList37);
        model.User.User user45 = model.User.UserFactory.createLabManager("", "", "", "", userList37);
        model.User.User user46 = model.User.UserFactory.createUser("hi!", "hi!", userType2, "", "", userList37);
        java.lang.Class<?> wildcardClass47 = user46.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType20 = null;
        model.User.User[] userArray23 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList24 = new java.util.ArrayList<model.User.User>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList24, userArray23);
        model.User.User user26 = model.User.UserFactory.createUser("hi!", "", userType20, "", "hi!", userList24);
        model.User.User user27 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList24);
        model.User.User user28 = model.User.UserFactory.createUser("hi!", "", userType11, "hi!", "", userList24);
        model.User.User user29 = model.User.UserFactory.createUser("", "hi!", userType6, "hi!", "", userList24);
        model.User.User user30 = model.User.UserFactory.createLabManager("", "", "", "hi!", userList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user30);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        model.User.UserType userType2 = null;
        model.User.UserType userType15 = null;
        model.User.User[] userArray18 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList19 = new java.util.ArrayList<model.User.User>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList19, userArray18);
        model.User.User user21 = model.User.UserFactory.createUser("hi!", "", userType15, "", "hi!", userList19);
        model.User.User user22 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList19);
        model.User.User[] userArray23 = new model.User.User[] { user22 };
        java.util.ArrayList<model.User.User> userList24 = new java.util.ArrayList<model.User.User>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList24, userArray23);
        model.User.User user26 = model.User.UserFactory.createLabManager("", "", "hi!", "", userList24);
        // The following exception was thrown during execution in test generation
        try {
            model.User.User user27 = model.User.UserFactory.createUser("hi!", "", userType2, "", "", userList24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Email already exists");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user26);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        model.User.UserType userType10 = null;
        model.User.User[] userArray13 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList14 = new java.util.ArrayList<model.User.User>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList14, userArray13);
        model.User.User user16 = model.User.UserFactory.createUser("hi!", "", userType10, "", "hi!", userList14);
        model.User.User user17 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList14);
        model.User.User[] userArray18 = new model.User.User[] { user17 };
        java.util.ArrayList<model.User.User> userList19 = new java.util.ArrayList<model.User.User>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList19, userArray18);
        model.User.User user21 = model.User.UserFactory.createLabManager("", "", "hi!", "", userList19);
        java.lang.Class<?> wildcardClass22 = user21.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        model.User.UserType userType14 = null;
        model.User.UserType userType23 = null;
        model.User.UserType userType32 = null;
        model.User.User[] userArray35 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList36 = new java.util.ArrayList<model.User.User>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList36, userArray35);
        model.User.User user38 = model.User.UserFactory.createUser("hi!", "", userType32, "", "hi!", userList36);
        model.User.User user39 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList36);
        model.User.User user40 = model.User.UserFactory.createUser("hi!", "", userType23, "hi!", "", userList36);
        model.User.User user41 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList36);
        model.User.User user42 = model.User.UserFactory.createUser("hi!", "hi!", userType14, "", "", userList36);
        model.User.User user43 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList36);
        model.User.User user44 = model.User.UserFactory.createLabManager("", "", "", "", userList36);
        model.User.User user45 = model.User.UserFactory.createLabManager("", "", "", "", userList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType29 = null;
        model.User.User[] userArray32 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList33 = new java.util.ArrayList<model.User.User>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList33, userArray32);
        model.User.User user35 = model.User.UserFactory.createUser("hi!", "", userType29, "", "hi!", userList33);
        model.User.User user36 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList33);
        model.User.User user37 = model.User.UserFactory.createUser("hi!", "", userType20, "hi!", "", userList33);
        model.User.User user38 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList33);
        model.User.User user39 = model.User.UserFactory.createUser("hi!", "", userType11, "hi!", "", userList33);
        model.User.User user40 = model.User.UserFactory.createUser("hi!", "", userType6, "hi!", "hi!", userList33);
        model.User.User user41 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList33);
        java.lang.Class<?> wildcardClass42 = user41.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType12 = null;
        model.User.UserType userType21 = null;
        model.User.UserType userType30 = null;
        model.User.User[] userArray33 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList34 = new java.util.ArrayList<model.User.User>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList34, userArray33);
        model.User.User user36 = model.User.UserFactory.createUser("hi!", "", userType30, "", "hi!", userList34);
        model.User.User user37 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList34);
        model.User.User user38 = model.User.UserFactory.createUser("hi!", "", userType21, "hi!", "", userList34);
        model.User.User user39 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList34);
        model.User.User user40 = model.User.UserFactory.createUser("hi!", "hi!", userType12, "", "", userList34);
        model.User.User user41 = model.User.UserFactory.createUser("hi!", "", userType7, "hi!", "hi!", userList34);
        model.User.User user42 = model.User.UserFactory.createUser("", "hi!", userType2, "hi!", "", userList34);
        java.lang.Class<?> wildcardClass43 = userList34.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        model.User.UserType userType2 = null;
        java.util.ArrayList<model.User.User> userList5 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.User.User user6 = model.User.UserFactory.createUser("hi!", "", userType2, "hi!", "hi!", userList5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.iterator()\" because \"users\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType12 = null;
        model.User.UserType userType21 = null;
        model.User.UserType userType30 = null;
        model.User.User[] userArray33 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList34 = new java.util.ArrayList<model.User.User>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList34, userArray33);
        model.User.User user36 = model.User.UserFactory.createUser("hi!", "", userType30, "", "hi!", userList34);
        model.User.User user37 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList34);
        model.User.User user38 = model.User.UserFactory.createUser("hi!", "", userType21, "hi!", "", userList34);
        model.User.User user39 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList34);
        model.User.User user40 = model.User.UserFactory.createUser("hi!", "hi!", userType12, "", "", userList34);
        model.User.User user41 = model.User.UserFactory.createUser("hi!", "", userType7, "hi!", "hi!", userList34);
        model.User.User user42 = model.User.UserFactory.createUser("", "hi!", userType2, "hi!", "", userList34);
        java.lang.Class<?> wildcardClass43 = user42.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType20 = null;
        model.User.User[] userArray23 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList24 = new java.util.ArrayList<model.User.User>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList24, userArray23);
        model.User.User user26 = model.User.UserFactory.createUser("hi!", "", userType20, "", "hi!", userList24);
        model.User.User user27 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList24);
        model.User.User user28 = model.User.UserFactory.createUser("hi!", "", userType11, "hi!", "", userList24);
        model.User.User user29 = model.User.UserFactory.createUser("hi!", "hi!", userType6, "", "", userList24);
        model.User.User user30 = model.User.UserFactory.createLabManager("", "", "", "hi!", userList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user30);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        model.User.UserType userType10 = null;
        model.User.UserType userType19 = null;
        model.User.UserType userType28 = null;
        model.User.User[] userArray31 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList32 = new java.util.ArrayList<model.User.User>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList32, userArray31);
        model.User.User user34 = model.User.UserFactory.createUser("hi!", "", userType28, "", "hi!", userList32);
        model.User.User user35 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList32);
        model.User.User user36 = model.User.UserFactory.createUser("hi!", "", userType19, "hi!", "", userList32);
        model.User.User user37 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList32);
        model.User.User user38 = model.User.UserFactory.createUser("hi!", "", userType10, "hi!", "", userList32);
        model.User.User user39 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList32);
        model.User.User user40 = model.User.UserFactory.createLabManager("hi!", "", "hi!", "hi!", userList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        model.User.UserType userType2 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType29 = null;
        model.User.User[] userArray32 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList33 = new java.util.ArrayList<model.User.User>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList33, userArray32);
        model.User.User user35 = model.User.UserFactory.createUser("hi!", "", userType29, "", "hi!", userList33);
        model.User.User user36 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList33);
        model.User.User user37 = model.User.UserFactory.createUser("hi!", "", userType20, "hi!", "", userList33);
        model.User.User user38 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList33);
        model.User.User user39 = model.User.UserFactory.createUser("hi!", "", userType11, "hi!", "", userList33);
        model.User.User user40 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList33);
        model.User.User user41 = model.User.UserFactory.createUser("", "", userType2, "hi!", "", userList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        model.User.UserType userType18 = null;
        model.User.UserType userType27 = null;
        model.User.UserType userType36 = null;
        model.User.User[] userArray39 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList40 = new java.util.ArrayList<model.User.User>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList40, userArray39);
        model.User.User user42 = model.User.UserFactory.createUser("hi!", "", userType36, "", "hi!", userList40);
        model.User.User user43 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList40);
        model.User.User user44 = model.User.UserFactory.createUser("hi!", "", userType27, "hi!", "", userList40);
        model.User.User user45 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList40);
        model.User.User user46 = model.User.UserFactory.createUser("hi!", "hi!", userType18, "", "", userList40);
        model.User.User user47 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList40);
        model.User.User user48 = model.User.UserFactory.createLabManager("", "", "hi!", "hi!", userList40);
        model.User.User user49 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "", userList40);
        model.User.User user50 = model.User.UserFactory.createLabManager("", "", "hi!", "", userList40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        model.User.UserType userType2 = null;
        java.util.ArrayList<model.User.User> userList5 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.User.User user6 = model.User.UserFactory.createUser("", "hi!", userType2, "hi!", "hi!", userList5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.iterator()\" because \"users\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType25 = null;
        model.User.UserType userType34 = null;
        model.User.UserType userType43 = null;
        model.User.User[] userArray46 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList47 = new java.util.ArrayList<model.User.User>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList47, userArray46);
        model.User.User user49 = model.User.UserFactory.createUser("hi!", "", userType43, "", "hi!", userList47);
        model.User.User user50 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList47);
        model.User.User user51 = model.User.UserFactory.createUser("hi!", "", userType34, "hi!", "", userList47);
        model.User.User user52 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList47);
        model.User.User user53 = model.User.UserFactory.createUser("hi!", "", userType25, "hi!", "", userList47);
        model.User.User user54 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList47);
        model.User.User user55 = model.User.UserFactory.createUser("hi!", "hi!", userType16, "", "", userList47);
        model.User.User user56 = model.User.UserFactory.createUser("", "", userType11, "", "", userList47);
        model.User.User user57 = model.User.UserFactory.createUser("", "hi!", userType6, "hi!", "hi!", userList47);
        model.User.User user58 = model.User.UserFactory.createLabManager("", "hi!", "hi!", "hi!", userList47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user58);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType25 = null;
        model.User.User[] userArray28 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList29 = new java.util.ArrayList<model.User.User>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList29, userArray28);
        model.User.User user31 = model.User.UserFactory.createUser("hi!", "", userType25, "", "hi!", userList29);
        model.User.User user32 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList29);
        model.User.User user33 = model.User.UserFactory.createUser("hi!", "", userType16, "hi!", "", userList29);
        model.User.User user34 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList29);
        model.User.User user35 = model.User.UserFactory.createUser("hi!", "hi!", userType7, "", "", userList29);
        model.User.User user36 = model.User.UserFactory.createUser("hi!", "hi!", userType2, "hi!", "", userList29);
        java.lang.Class<?> wildcardClass37 = userList29.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType29 = null;
        model.User.UserType userType38 = null;
        model.User.User[] userArray41 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList42 = new java.util.ArrayList<model.User.User>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList42, userArray41);
        model.User.User user44 = model.User.UserFactory.createUser("hi!", "", userType38, "", "hi!", userList42);
        model.User.User user45 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList42);
        model.User.User user46 = model.User.UserFactory.createUser("hi!", "", userType29, "hi!", "", userList42);
        model.User.User user47 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList42);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "hi!", userType20, "", "", userList42);
        model.User.User user49 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList42);
        model.User.User user50 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "hi!", userList42);
        model.User.User user51 = model.User.UserFactory.createUser("", "hi!", userType7, "", "", userList42);
        model.User.User user52 = model.User.UserFactory.createUser("", "", userType2, "", "", userList42);
        java.lang.Class<?> wildcardClass53 = user52.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        model.User.UserType userType2 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType29 = null;
        model.User.User[] userArray32 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList33 = new java.util.ArrayList<model.User.User>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList33, userArray32);
        model.User.User user35 = model.User.UserFactory.createUser("hi!", "", userType29, "", "hi!", userList33);
        model.User.User user36 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList33);
        model.User.User user37 = model.User.UserFactory.createUser("hi!", "", userType20, "hi!", "", userList33);
        model.User.User user38 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList33);
        model.User.User user39 = model.User.UserFactory.createUser("hi!", "", userType11, "hi!", "", userList33);
        model.User.User user40 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList33);
        model.User.User user41 = model.User.UserFactory.createUser("hi!", "hi!", userType2, "", "", userList33);
        java.lang.Class<?> wildcardClass42 = userList33.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType16 = null;
        model.User.User[] userArray19 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList20 = new java.util.ArrayList<model.User.User>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList20, userArray19);
        model.User.User user22 = model.User.UserFactory.createUser("hi!", "", userType16, "", "hi!", userList20);
        model.User.User user23 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList20);
        model.User.User user24 = model.User.UserFactory.createUser("hi!", "", userType7, "hi!", "", userList20);
        model.User.User user25 = model.User.UserFactory.createUser("hi!", "", userType2, "hi!", "", userList20);
        java.lang.Class<?> wildcardClass26 = user25.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        model.User.UserType userType2 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType28 = null;
        model.User.UserType userType37 = null;
        model.User.UserType userType46 = null;
        model.User.User[] userArray49 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList50 = new java.util.ArrayList<model.User.User>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList50, userArray49);
        model.User.User user52 = model.User.UserFactory.createUser("hi!", "", userType46, "", "hi!", userList50);
        model.User.User user53 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList50);
        model.User.User user54 = model.User.UserFactory.createUser("hi!", "", userType37, "hi!", "", userList50);
        model.User.User user55 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList50);
        model.User.User user56 = model.User.UserFactory.createUser("hi!", "hi!", userType28, "", "", userList50);
        model.User.User user57 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList50);
        model.User.User user58 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList50);
        model.User.User user59 = model.User.UserFactory.createUser("", "", userType15, "hi!", "", userList50);
        model.User.User user60 = model.User.UserFactory.createLabManager("", "", "hi!", "", userList50);
        model.User.User user61 = model.User.UserFactory.createLabManager("", "", "hi!", "", userList50);
        model.User.User user62 = model.User.UserFactory.createUser("", "", userType2, "hi!", "hi!", userList50);
        java.lang.Class<?> wildcardClass63 = userList50.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        model.User.UserType userType2 = null;
        model.User.UserType userType11 = null;
        model.User.User[] userArray14 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList15 = new java.util.ArrayList<model.User.User>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList15, userArray14);
        model.User.User user17 = model.User.UserFactory.createUser("hi!", "", userType11, "", "hi!", userList15);
        model.User.User user18 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList15);
        model.User.User user19 = model.User.UserFactory.createUser("hi!", "hi!", userType2, "hi!", "hi!", userList15);
        java.lang.Class<?> wildcardClass20 = user19.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        model.User.UserType userType2 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType29 = null;
        model.User.User[] userArray32 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList33 = new java.util.ArrayList<model.User.User>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList33, userArray32);
        model.User.User user35 = model.User.UserFactory.createUser("hi!", "", userType29, "", "hi!", userList33);
        model.User.User user36 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList33);
        model.User.User user37 = model.User.UserFactory.createUser("hi!", "", userType20, "hi!", "", userList33);
        model.User.User user38 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList33);
        model.User.User user39 = model.User.UserFactory.createUser("hi!", "hi!", userType11, "", "", userList33);
        model.User.User user40 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList33);
        model.User.User user41 = model.User.UserFactory.createUser("", "hi!", userType2, "hi!", "", userList33);
        java.lang.Class<?> wildcardClass42 = user41.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType12 = null;
        model.User.UserType userType17 = null;
        model.User.UserType userType26 = null;
        model.User.User[] userArray29 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList30 = new java.util.ArrayList<model.User.User>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList30, userArray29);
        model.User.User user32 = model.User.UserFactory.createUser("hi!", "", userType26, "", "hi!", userList30);
        model.User.User user33 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList30);
        model.User.User user34 = model.User.UserFactory.createUser("hi!", "", userType17, "hi!", "", userList30);
        model.User.User user35 = model.User.UserFactory.createUser("", "", userType12, "", "", userList30);
        model.User.User user36 = model.User.UserFactory.createUser("", "hi!", userType7, "hi!", "", userList30);
        model.User.User user37 = model.User.UserFactory.createUser("", "hi!", userType2, "", "hi!", userList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        model.User.UserType userType2 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType29 = null;
        model.User.User[] userArray32 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList33 = new java.util.ArrayList<model.User.User>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList33, userArray32);
        model.User.User user35 = model.User.UserFactory.createUser("hi!", "", userType29, "", "hi!", userList33);
        model.User.User user36 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList33);
        model.User.User user37 = model.User.UserFactory.createUser("hi!", "", userType20, "hi!", "", userList33);
        model.User.User user38 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList33);
        model.User.User user39 = model.User.UserFactory.createUser("hi!", "hi!", userType11, "", "", userList33);
        model.User.User user40 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList33);
        model.User.User user41 = model.User.UserFactory.createUser("hi!", "", userType2, "hi!", "", userList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        model.User.UserType userType2 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType29 = null;
        model.User.User[] userArray32 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList33 = new java.util.ArrayList<model.User.User>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList33, userArray32);
        model.User.User user35 = model.User.UserFactory.createUser("hi!", "", userType29, "", "hi!", userList33);
        model.User.User user36 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList33);
        model.User.User user37 = model.User.UserFactory.createUser("hi!", "", userType20, "hi!", "", userList33);
        model.User.User user38 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList33);
        model.User.User user39 = model.User.UserFactory.createUser("hi!", "hi!", userType11, "", "", userList33);
        model.User.User user40 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "hi!", userList33);
        model.User.User user41 = model.User.UserFactory.createUser("", "", userType2, "", "", userList33);
        java.lang.Class<?> wildcardClass42 = userList33.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        model.User.UserType userType6 = null;
        model.User.UserType userType23 = null;
        model.User.UserType userType32 = null;
        model.User.UserType userType41 = null;
        model.User.User[] userArray44 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList45 = new java.util.ArrayList<model.User.User>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList45, userArray44);
        model.User.User user47 = model.User.UserFactory.createUser("hi!", "", userType41, "", "hi!", userList45);
        model.User.User user48 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList45);
        model.User.User user49 = model.User.UserFactory.createUser("hi!", "", userType32, "hi!", "", userList45);
        model.User.User user50 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList45);
        model.User.User user51 = model.User.UserFactory.createUser("hi!", "hi!", userType23, "", "", userList45);
        model.User.User user52 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList45);
        model.User.User user53 = model.User.UserFactory.createLabManager("", "", "hi!", "hi!", userList45);
        model.User.User user54 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "", userList45);
        model.User.User user55 = model.User.UserFactory.createUser("hi!", "hi!", userType6, "hi!", "", userList45);
        model.User.User user56 = model.User.UserFactory.createLabManager("", "", "hi!", "", userList45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        model.User.UserType userType2 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType24 = null;
        model.User.UserType userType33 = null;
        model.User.User[] userArray36 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList37 = new java.util.ArrayList<model.User.User>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList37, userArray36);
        model.User.User user39 = model.User.UserFactory.createUser("hi!", "", userType33, "", "hi!", userList37);
        model.User.User user40 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList37);
        model.User.User user41 = model.User.UserFactory.createUser("hi!", "", userType24, "hi!", "", userList37);
        model.User.User user42 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList37);
        model.User.User user43 = model.User.UserFactory.createUser("hi!", "hi!", userType15, "", "", userList37);
        model.User.User user44 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "hi!", userList37);
        model.User.User user45 = model.User.UserFactory.createLabManager("", "hi!", "hi!", "hi!", userList37);
        model.User.User user46 = model.User.UserFactory.createUser("hi!", "", userType2, "hi!", "", userList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType16 = null;
        model.User.User[] userArray19 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList20 = new java.util.ArrayList<model.User.User>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList20, userArray19);
        model.User.User user22 = model.User.UserFactory.createUser("hi!", "", userType16, "", "hi!", userList20);
        model.User.User user23 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList20);
        model.User.User user24 = model.User.UserFactory.createUser("hi!", "", userType7, "hi!", "", userList20);
        model.User.User user25 = model.User.UserFactory.createUser("", "hi!", userType2, "hi!", "", userList20);
        java.lang.Class<?> wildcardClass26 = user25.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        model.User.UserType userType6 = null;
        model.User.UserType userType19 = null;
        model.User.UserType userType28 = null;
        model.User.UserType userType37 = null;
        model.User.User[] userArray40 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList41 = new java.util.ArrayList<model.User.User>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList41, userArray40);
        model.User.User user43 = model.User.UserFactory.createUser("hi!", "", userType37, "", "hi!", userList41);
        model.User.User user44 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList41);
        model.User.User user45 = model.User.UserFactory.createUser("hi!", "", userType28, "hi!", "", userList41);
        model.User.User user46 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList41);
        model.User.User user47 = model.User.UserFactory.createUser("hi!", "hi!", userType19, "", "", userList41);
        model.User.User user48 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList41);
        model.User.User user49 = model.User.UserFactory.createLabManager("", "", "", "", userList41);
        model.User.User user50 = model.User.UserFactory.createUser("hi!", "hi!", userType6, "", "", userList41);
        model.User.User user51 = model.User.UserFactory.createLabManager("hi!", "", "hi!", "hi!", userList41);
        java.lang.Class<?> wildcardClass52 = userList41.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType12 = null;
        model.User.UserType userType21 = null;
        model.User.User[] userArray24 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList25 = new java.util.ArrayList<model.User.User>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList25, userArray24);
        model.User.User user27 = model.User.UserFactory.createUser("hi!", "", userType21, "", "hi!", userList25);
        model.User.User user28 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList25);
        model.User.User user29 = model.User.UserFactory.createUser("hi!", "hi!", userType12, "hi!", "hi!", userList25);
        model.User.User user30 = model.User.UserFactory.createUser("hi!", "hi!", userType7, "hi!", "", userList25);
        model.User.User user31 = model.User.UserFactory.createUser("hi!", "", userType2, "", "", userList25);
        java.lang.Class<?> wildcardClass32 = userList25.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType20 = null;
        model.User.User[] userArray23 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList24 = new java.util.ArrayList<model.User.User>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList24, userArray23);
        model.User.User user26 = model.User.UserFactory.createUser("hi!", "", userType20, "", "hi!", userList24);
        model.User.User user27 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList24);
        model.User.User user28 = model.User.UserFactory.createUser("hi!", "", userType11, "hi!", "", userList24);
        model.User.User user29 = model.User.UserFactory.createUser("", "hi!", userType6, "hi!", "", userList24);
        model.User.User user30 = model.User.UserFactory.createLabManager("hi!", "", "hi!", "", userList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user30);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType29 = null;
        model.User.UserType userType38 = null;
        model.User.UserType userType47 = null;
        model.User.User[] userArray50 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList51 = new java.util.ArrayList<model.User.User>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList51, userArray50);
        model.User.User user53 = model.User.UserFactory.createUser("hi!", "", userType47, "", "hi!", userList51);
        model.User.User user54 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList51);
        model.User.User user55 = model.User.UserFactory.createUser("hi!", "", userType38, "hi!", "", userList51);
        model.User.User user56 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList51);
        model.User.User user57 = model.User.UserFactory.createUser("hi!", "hi!", userType29, "", "", userList51);
        model.User.User user58 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList51);
        model.User.User user59 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "hi!", userList51);
        model.User.User user60 = model.User.UserFactory.createUser("", "hi!", userType16, "", "hi!", userList51);
        model.User.User user61 = model.User.UserFactory.createUser("", "", userType11, "", "", userList51);
        model.User.User user62 = model.User.UserFactory.createUser("hi!", "hi!", userType6, "", "", userList51);
        model.User.User user63 = model.User.UserFactory.createLabManager("", "hi!", "hi!", "", userList51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user63);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType21 = null;
        model.User.UserType userType30 = null;
        model.User.UserType userType39 = null;
        model.User.UserType userType48 = null;
        model.User.User[] userArray51 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList52 = new java.util.ArrayList<model.User.User>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList52, userArray51);
        model.User.User user54 = model.User.UserFactory.createUser("hi!", "", userType48, "", "hi!", userList52);
        model.User.User user55 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList52);
        model.User.User user56 = model.User.UserFactory.createUser("hi!", "", userType39, "hi!", "", userList52);
        model.User.User user57 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList52);
        model.User.User user58 = model.User.UserFactory.createUser("hi!", "", userType30, "hi!", "", userList52);
        model.User.User user59 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList52);
        model.User.User user60 = model.User.UserFactory.createUser("hi!", "hi!", userType21, "", "", userList52);
        model.User.User user61 = model.User.UserFactory.createUser("", "hi!", userType16, "", "hi!", userList52);
        model.User.User user62 = model.User.UserFactory.createLabManager("hi!", "", "", "hi!", userList52);
        model.User.User user63 = model.User.UserFactory.createUser("hi!", "", userType7, "hi!", "hi!", userList52);
        model.User.User user64 = model.User.UserFactory.createUser("", "", userType2, "hi!", "", userList52);
        java.lang.Class<?> wildcardClass65 = userList52.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass65);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType12 = null;
        model.User.UserType userType17 = null;
        model.User.UserType userType22 = null;
        model.User.UserType userType31 = null;
        model.User.User[] userArray34 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList35 = new java.util.ArrayList<model.User.User>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList35, userArray34);
        model.User.User user37 = model.User.UserFactory.createUser("hi!", "", userType31, "", "hi!", userList35);
        model.User.User user38 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList35);
        model.User.User user39 = model.User.UserFactory.createUser("hi!", "", userType22, "hi!", "", userList35);
        model.User.User user40 = model.User.UserFactory.createUser("hi!", "hi!", userType17, "", "", userList35);
        model.User.User user41 = model.User.UserFactory.createUser("hi!", "", userType12, "", "hi!", userList35);
        model.User.User user42 = model.User.UserFactory.createUser("hi!", "", userType7, "hi!", "hi!", userList35);
        model.User.User user43 = model.User.UserFactory.createUser("", "", userType2, "", "", userList35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        model.User.UserType userType10 = null;
        model.User.UserType userType19 = null;
        model.User.UserType userType28 = null;
        model.User.User[] userArray31 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList32 = new java.util.ArrayList<model.User.User>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList32, userArray31);
        model.User.User user34 = model.User.UserFactory.createUser("hi!", "", userType28, "", "hi!", userList32);
        model.User.User user35 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList32);
        model.User.User user36 = model.User.UserFactory.createUser("hi!", "", userType19, "hi!", "", userList32);
        model.User.User user37 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList32);
        model.User.User user38 = model.User.UserFactory.createUser("hi!", "", userType10, "hi!", "", userList32);
        model.User.User user39 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "", userList32);
        model.User.User user40 = model.User.UserFactory.createLabManager("", "", "", "", userList32);
        java.lang.Class<?> wildcardClass41 = userList32.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType29 = null;
        model.User.UserType userType38 = null;
        model.User.User[] userArray41 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList42 = new java.util.ArrayList<model.User.User>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList42, userArray41);
        model.User.User user44 = model.User.UserFactory.createUser("hi!", "", userType38, "", "hi!", userList42);
        model.User.User user45 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList42);
        model.User.User user46 = model.User.UserFactory.createUser("hi!", "", userType29, "hi!", "", userList42);
        model.User.User user47 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList42);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "hi!", userType20, "", "", userList42);
        model.User.User user49 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList42);
        model.User.User user50 = model.User.UserFactory.createLabManager("", "", "", "", userList42);
        model.User.User user51 = model.User.UserFactory.createUser("hi!", "hi!", userType7, "", "", userList42);
        model.User.User user52 = model.User.UserFactory.createUser("", "", userType2, "hi!", "", userList42);
        java.lang.Class<?> wildcardClass53 = userList42.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType24 = null;
        model.User.UserType userType33 = null;
        model.User.UserType userType42 = null;
        model.User.User[] userArray45 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList46 = new java.util.ArrayList<model.User.User>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList46, userArray45);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "", userType42, "", "hi!", userList46);
        model.User.User user49 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList46);
        model.User.User user50 = model.User.UserFactory.createUser("hi!", "", userType33, "hi!", "", userList46);
        model.User.User user51 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList46);
        model.User.User user52 = model.User.UserFactory.createUser("hi!", "hi!", userType24, "", "", userList46);
        model.User.User user53 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList46);
        model.User.User user54 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "hi!", userList46);
        model.User.User user55 = model.User.UserFactory.createUser("", "hi!", userType11, "", "hi!", userList46);
        model.User.User user56 = model.User.UserFactory.createUser("", "hi!", userType6, "", "hi!", userList46);
        model.User.User user57 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "", userList46);
        java.lang.Class<?> wildcardClass58 = user57.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        model.User.UserType userType18 = null;
        model.User.UserType userType27 = null;
        model.User.UserType userType36 = null;
        model.User.User[] userArray39 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList40 = new java.util.ArrayList<model.User.User>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList40, userArray39);
        model.User.User user42 = model.User.UserFactory.createUser("hi!", "", userType36, "", "hi!", userList40);
        model.User.User user43 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList40);
        model.User.User user44 = model.User.UserFactory.createUser("hi!", "", userType27, "hi!", "", userList40);
        model.User.User user45 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList40);
        model.User.User user46 = model.User.UserFactory.createUser("hi!", "hi!", userType18, "", "", userList40);
        model.User.User user47 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList40);
        model.User.User user48 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "", userList40);
        model.User.User user49 = model.User.UserFactory.createLabManager("", "hi!", "hi!", "", userList40);
        model.User.User user50 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType20 = null;
        model.User.User[] userArray23 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList24 = new java.util.ArrayList<model.User.User>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList24, userArray23);
        model.User.User user26 = model.User.UserFactory.createUser("hi!", "", userType20, "", "hi!", userList24);
        model.User.User user27 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList24);
        model.User.User user28 = model.User.UserFactory.createUser("hi!", "", userType11, "hi!", "", userList24);
        model.User.User user29 = model.User.UserFactory.createUser("", "", userType6, "", "", userList24);
        model.User.User user30 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList24);
        java.lang.Class<?> wildcardClass31 = userList24.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        model.User.UserType userType10 = null;
        model.User.UserType userType19 = null;
        model.User.UserType userType28 = null;
        model.User.User[] userArray31 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList32 = new java.util.ArrayList<model.User.User>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList32, userArray31);
        model.User.User user34 = model.User.UserFactory.createUser("hi!", "", userType28, "", "hi!", userList32);
        model.User.User user35 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList32);
        model.User.User user36 = model.User.UserFactory.createUser("hi!", "", userType19, "hi!", "", userList32);
        model.User.User user37 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList32);
        model.User.User user38 = model.User.UserFactory.createUser("hi!", "hi!", userType10, "", "", userList32);
        model.User.User user39 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "hi!", userList32);
        model.User.User user40 = model.User.UserFactory.createLabManager("", "hi!", "hi!", "hi!", userList32);
        java.lang.Class<?> wildcardClass41 = user40.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType29 = null;
        model.User.UserType userType38 = null;
        model.User.User[] userArray41 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList42 = new java.util.ArrayList<model.User.User>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList42, userArray41);
        model.User.User user44 = model.User.UserFactory.createUser("hi!", "", userType38, "", "hi!", userList42);
        model.User.User user45 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList42);
        model.User.User user46 = model.User.UserFactory.createUser("hi!", "", userType29, "hi!", "", userList42);
        model.User.User user47 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList42);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "", userType20, "hi!", "", userList42);
        model.User.User user49 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList42);
        model.User.User user50 = model.User.UserFactory.createUser("hi!", "hi!", userType11, "", "", userList42);
        model.User.User user51 = model.User.UserFactory.createUser("", "hi!", userType6, "", "hi!", userList42);
        model.User.User user52 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        model.User.UserType userType14 = null;
        model.User.UserType userType23 = null;
        model.User.UserType userType32 = null;
        model.User.User[] userArray35 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList36 = new java.util.ArrayList<model.User.User>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList36, userArray35);
        model.User.User user38 = model.User.UserFactory.createUser("hi!", "", userType32, "", "hi!", userList36);
        model.User.User user39 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList36);
        model.User.User user40 = model.User.UserFactory.createUser("hi!", "", userType23, "hi!", "", userList36);
        model.User.User user41 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList36);
        model.User.User user42 = model.User.UserFactory.createUser("hi!", "hi!", userType14, "", "", userList36);
        model.User.User user43 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList36);
        model.User.User user44 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "", userList36);
        model.User.User user45 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType20 = null;
        model.User.User[] userArray23 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList24 = new java.util.ArrayList<model.User.User>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList24, userArray23);
        model.User.User user26 = model.User.UserFactory.createUser("hi!", "", userType20, "", "hi!", userList24);
        model.User.User user27 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList24);
        model.User.User user28 = model.User.UserFactory.createUser("hi!", "", userType11, "hi!", "", userList24);
        model.User.User user29 = model.User.UserFactory.createUser("", "hi!", userType6, "hi!", "", userList24);
        model.User.User user30 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList24);
        java.lang.Class<?> wildcardClass31 = userList24.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        model.User.UserType userType2 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType29 = null;
        model.User.UserType userType38 = null;
        model.User.User[] userArray41 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList42 = new java.util.ArrayList<model.User.User>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList42, userArray41);
        model.User.User user44 = model.User.UserFactory.createUser("hi!", "", userType38, "", "hi!", userList42);
        model.User.User user45 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList42);
        model.User.User user46 = model.User.UserFactory.createUser("hi!", "", userType29, "hi!", "", userList42);
        model.User.User user47 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList42);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "", userType20, "hi!", "", userList42);
        model.User.User user49 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList42);
        model.User.User user50 = model.User.UserFactory.createUser("hi!", "hi!", userType11, "", "", userList42);
        model.User.User user51 = model.User.UserFactory.createLabManager("", "hi!", "hi!", "hi!", userList42);
        model.User.User user52 = model.User.UserFactory.createUser("hi!", "hi!", userType2, "hi!", "hi!", userList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType25 = null;
        model.User.User[] userArray28 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList29 = new java.util.ArrayList<model.User.User>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList29, userArray28);
        model.User.User user31 = model.User.UserFactory.createUser("hi!", "", userType25, "", "hi!", userList29);
        model.User.User user32 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList29);
        model.User.User user33 = model.User.UserFactory.createUser("hi!", "", userType16, "hi!", "", userList29);
        model.User.User user34 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList29);
        model.User.User user35 = model.User.UserFactory.createUser("hi!", "", userType7, "hi!", "", userList29);
        model.User.User user36 = model.User.UserFactory.createUser("", "", userType2, "", "", userList29);
        java.lang.Class<?> wildcardClass37 = user36.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType12 = null;
        model.User.UserType userType21 = null;
        model.User.UserType userType30 = null;
        model.User.UserType userType39 = null;
        model.User.User[] userArray42 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList43 = new java.util.ArrayList<model.User.User>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList43, userArray42);
        model.User.User user45 = model.User.UserFactory.createUser("hi!", "", userType39, "", "hi!", userList43);
        model.User.User user46 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList43);
        model.User.User user47 = model.User.UserFactory.createUser("hi!", "", userType30, "hi!", "", userList43);
        model.User.User user48 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList43);
        model.User.User user49 = model.User.UserFactory.createUser("hi!", "hi!", userType21, "", "", userList43);
        model.User.User user50 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList43);
        model.User.User user51 = model.User.UserFactory.createUser("hi!", "", userType12, "hi!", "hi!", userList43);
        model.User.User user52 = model.User.UserFactory.createUser("", "", userType7, "", "hi!", userList43);
        model.User.User user53 = model.User.UserFactory.createUser("hi!", "", userType2, "", "", userList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType29 = null;
        model.User.UserType userType38 = null;
        model.User.User[] userArray41 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList42 = new java.util.ArrayList<model.User.User>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList42, userArray41);
        model.User.User user44 = model.User.UserFactory.createUser("hi!", "", userType38, "", "hi!", userList42);
        model.User.User user45 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList42);
        model.User.User user46 = model.User.UserFactory.createUser("hi!", "", userType29, "hi!", "", userList42);
        model.User.User user47 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList42);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "", userType20, "hi!", "", userList42);
        model.User.User user49 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList42);
        model.User.User user50 = model.User.UserFactory.createUser("hi!", "hi!", userType11, "", "", userList42);
        model.User.User user51 = model.User.UserFactory.createUser("", "", userType6, "", "", userList42);
        model.User.User user52 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList42);
        java.lang.Class<?> wildcardClass53 = userList42.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        model.User.UserType userType10 = null;
        model.User.User[] userArray13 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList14 = new java.util.ArrayList<model.User.User>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList14, userArray13);
        model.User.User user16 = model.User.UserFactory.createUser("hi!", "", userType10, "", "hi!", userList14);
        model.User.User user17 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList14);
        model.User.User user18 = model.User.UserFactory.createLabManager("", "", "hi!", "", userList14);
        java.lang.Class<?> wildcardClass19 = user18.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray13);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user16);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType29 = null;
        model.User.UserType userType38 = null;
        model.User.User[] userArray41 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList42 = new java.util.ArrayList<model.User.User>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList42, userArray41);
        model.User.User user44 = model.User.UserFactory.createUser("hi!", "", userType38, "", "hi!", userList42);
        model.User.User user45 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList42);
        model.User.User user46 = model.User.UserFactory.createUser("hi!", "", userType29, "hi!", "", userList42);
        model.User.User user47 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList42);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "hi!", userType20, "", "", userList42);
        model.User.User user49 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList42);
        model.User.User user50 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "hi!", userList42);
        model.User.User user51 = model.User.UserFactory.createUser("", "hi!", userType7, "", "", userList42);
        model.User.User user52 = model.User.UserFactory.createUser("", "", userType2, "hi!", "", userList42);
        java.lang.Class<?> wildcardClass53 = user52.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType21 = null;
        model.User.UserType userType30 = null;
        model.User.UserType userType39 = null;
        model.User.UserType userType48 = null;
        model.User.User[] userArray51 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList52 = new java.util.ArrayList<model.User.User>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList52, userArray51);
        model.User.User user54 = model.User.UserFactory.createUser("hi!", "", userType48, "", "hi!", userList52);
        model.User.User user55 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList52);
        model.User.User user56 = model.User.UserFactory.createUser("hi!", "", userType39, "hi!", "", userList52);
        model.User.User user57 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList52);
        model.User.User user58 = model.User.UserFactory.createUser("hi!", "", userType30, "hi!", "", userList52);
        model.User.User user59 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList52);
        model.User.User user60 = model.User.UserFactory.createUser("hi!", "hi!", userType21, "", "", userList52);
        model.User.User user61 = model.User.UserFactory.createUser("", "hi!", userType16, "", "hi!", userList52);
        model.User.User user62 = model.User.UserFactory.createLabManager("hi!", "", "", "hi!", userList52);
        model.User.User user63 = model.User.UserFactory.createUser("", "hi!", userType7, "hi!", "", userList52);
        model.User.User user64 = model.User.UserFactory.createUser("hi!", "", userType2, "", "", userList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user64);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        model.User.UserType userType6 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType24 = null;
        model.User.User[] userArray27 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList28 = new java.util.ArrayList<model.User.User>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList28, userArray27);
        model.User.User user30 = model.User.UserFactory.createUser("hi!", "", userType24, "", "hi!", userList28);
        model.User.User user31 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList28);
        model.User.User user32 = model.User.UserFactory.createUser("hi!", "", userType15, "hi!", "", userList28);
        model.User.User user33 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList28);
        model.User.User user34 = model.User.UserFactory.createUser("hi!", "hi!", userType6, "", "", userList28);
        model.User.User user35 = model.User.UserFactory.createLabManager("", "", "hi!", "hi!", userList28);
        java.lang.Class<?> wildcardClass36 = user35.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        model.User.UserType userType2 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType28 = null;
        model.User.UserType userType37 = null;
        model.User.UserType userType46 = null;
        model.User.User[] userArray49 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList50 = new java.util.ArrayList<model.User.User>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList50, userArray49);
        model.User.User user52 = model.User.UserFactory.createUser("hi!", "", userType46, "", "hi!", userList50);
        model.User.User user53 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList50);
        model.User.User user54 = model.User.UserFactory.createUser("hi!", "", userType37, "hi!", "", userList50);
        model.User.User user55 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList50);
        model.User.User user56 = model.User.UserFactory.createUser("hi!", "hi!", userType28, "", "", userList50);
        model.User.User user57 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList50);
        model.User.User user58 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList50);
        model.User.User user59 = model.User.UserFactory.createUser("", "", userType15, "hi!", "", userList50);
        model.User.User user60 = model.User.UserFactory.createLabManager("", "", "hi!", "", userList50);
        model.User.User user61 = model.User.UserFactory.createLabManager("", "", "hi!", "", userList50);
        model.User.User user62 = model.User.UserFactory.createUser("", "", userType2, "hi!", "", userList50);
        java.lang.Class<?> wildcardClass63 = user62.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType29 = null;
        model.User.UserType userType38 = null;
        model.User.User[] userArray41 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList42 = new java.util.ArrayList<model.User.User>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList42, userArray41);
        model.User.User user44 = model.User.UserFactory.createUser("hi!", "", userType38, "", "hi!", userList42);
        model.User.User user45 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList42);
        model.User.User user46 = model.User.UserFactory.createUser("hi!", "", userType29, "hi!", "", userList42);
        model.User.User user47 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList42);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "", userType20, "hi!", "", userList42);
        model.User.User user49 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList42);
        model.User.User user50 = model.User.UserFactory.createUser("hi!", "hi!", userType11, "", "", userList42);
        model.User.User user51 = model.User.UserFactory.createUser("", "", userType6, "", "", userList42);
        model.User.User user52 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "", userList42);
        java.lang.Class<?> wildcardClass53 = user52.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        model.User.UserType userType6 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType24 = null;
        model.User.User[] userArray27 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList28 = new java.util.ArrayList<model.User.User>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList28, userArray27);
        model.User.User user30 = model.User.UserFactory.createUser("hi!", "", userType24, "", "hi!", userList28);
        model.User.User user31 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList28);
        model.User.User user32 = model.User.UserFactory.createUser("hi!", "", userType15, "hi!", "", userList28);
        model.User.User user33 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList28);
        model.User.User user34 = model.User.UserFactory.createUser("hi!", "hi!", userType6, "", "", userList28);
        model.User.User user35 = model.User.UserFactory.createLabManager("", "", "hi!", "hi!", userList28);
        java.lang.Class<?> wildcardClass36 = userList28.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType12 = null;
        model.User.UserType userType21 = null;
        model.User.UserType userType30 = null;
        model.User.User[] userArray33 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList34 = new java.util.ArrayList<model.User.User>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList34, userArray33);
        model.User.User user36 = model.User.UserFactory.createUser("hi!", "", userType30, "", "hi!", userList34);
        model.User.User user37 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList34);
        model.User.User user38 = model.User.UserFactory.createUser("hi!", "", userType21, "hi!", "", userList34);
        model.User.User user39 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList34);
        model.User.User user40 = model.User.UserFactory.createUser("hi!", "", userType12, "hi!", "", userList34);
        model.User.User user41 = model.User.UserFactory.createUser("hi!", "", userType7, "hi!", "hi!", userList34);
        model.User.User user42 = model.User.UserFactory.createUser("", "", userType2, "", "hi!", userList34);
        java.lang.Class<?> wildcardClass43 = user42.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType12 = null;
        model.User.UserType userType21 = null;
        model.User.UserType userType30 = null;
        model.User.User[] userArray33 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList34 = new java.util.ArrayList<model.User.User>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList34, userArray33);
        model.User.User user36 = model.User.UserFactory.createUser("hi!", "", userType30, "", "hi!", userList34);
        model.User.User user37 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList34);
        model.User.User user38 = model.User.UserFactory.createUser("hi!", "", userType21, "hi!", "", userList34);
        model.User.User user39 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList34);
        model.User.User user40 = model.User.UserFactory.createUser("hi!", "hi!", userType12, "", "", userList34);
        model.User.User user41 = model.User.UserFactory.createUser("hi!", "hi!", userType7, "hi!", "", userList34);
        model.User.User user42 = model.User.UserFactory.createUser("", "", userType2, "hi!", "", userList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        model.User.UserType userType10 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType29 = null;
        model.User.User[] userArray32 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList33 = new java.util.ArrayList<model.User.User>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList33, userArray32);
        model.User.User user35 = model.User.UserFactory.createUser("hi!", "", userType29, "", "hi!", userList33);
        model.User.User user36 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList33);
        model.User.User user37 = model.User.UserFactory.createUser("hi!", "", userType20, "hi!", "", userList33);
        model.User.User user38 = model.User.UserFactory.createUser("hi!", "", userType15, "hi!", "", userList33);
        model.User.User user39 = model.User.UserFactory.createUser("hi!", "hi!", userType10, "", "", userList33);
        model.User.User user40 = model.User.UserFactory.createLabManager("hi!", "", "", "hi!", userList33);
        model.User.User user41 = model.User.UserFactory.createLabManager("", "hi!", "hi!", "hi!", userList33);
        java.lang.Class<?> wildcardClass42 = user41.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType24 = null;
        model.User.UserType userType33 = null;
        model.User.UserType userType42 = null;
        model.User.User[] userArray45 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList46 = new java.util.ArrayList<model.User.User>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList46, userArray45);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "", userType42, "", "hi!", userList46);
        model.User.User user49 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList46);
        model.User.User user50 = model.User.UserFactory.createUser("hi!", "", userType33, "hi!", "", userList46);
        model.User.User user51 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList46);
        model.User.User user52 = model.User.UserFactory.createUser("hi!", "hi!", userType24, "", "", userList46);
        model.User.User user53 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList46);
        model.User.User user54 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "hi!", userList46);
        model.User.User user55 = model.User.UserFactory.createUser("", "hi!", userType11, "", "hi!", userList46);
        model.User.User user56 = model.User.UserFactory.createUser("", "hi!", userType6, "", "hi!", userList46);
        model.User.User user57 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "", userList46);
        java.lang.Class<?> wildcardClass58 = userList46.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        model.User.UserType userType2 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType24 = null;
        model.User.UserType userType33 = null;
        model.User.User[] userArray36 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList37 = new java.util.ArrayList<model.User.User>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList37, userArray36);
        model.User.User user39 = model.User.UserFactory.createUser("hi!", "", userType33, "", "hi!", userList37);
        model.User.User user40 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList37);
        model.User.User user41 = model.User.UserFactory.createUser("hi!", "", userType24, "hi!", "", userList37);
        model.User.User user42 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList37);
        model.User.User user43 = model.User.UserFactory.createUser("hi!", "hi!", userType15, "", "", userList37);
        model.User.User user44 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList37);
        model.User.User user45 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList37);
        model.User.User user46 = model.User.UserFactory.createUser("", "", userType2, "hi!", "hi!", userList37);
        java.lang.Class<?> wildcardClass47 = userList37.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        model.User.UserType userType6 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType24 = null;
        model.User.UserType userType33 = null;
        model.User.User[] userArray36 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList37 = new java.util.ArrayList<model.User.User>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList37, userArray36);
        model.User.User user39 = model.User.UserFactory.createUser("hi!", "", userType33, "", "hi!", userList37);
        model.User.User user40 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList37);
        model.User.User user41 = model.User.UserFactory.createUser("hi!", "", userType24, "hi!", "", userList37);
        model.User.User user42 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList37);
        model.User.User user43 = model.User.UserFactory.createUser("hi!", "hi!", userType15, "", "", userList37);
        model.User.User user44 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList37);
        model.User.User user45 = model.User.UserFactory.createUser("hi!", "", userType6, "hi!", "hi!", userList37);
        model.User.User user46 = model.User.UserFactory.createLabManager("", "", "", "", userList37);
        java.lang.Class<?> wildcardClass47 = userList37.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        model.User.UserType userType6 = null;
        model.User.UserType userType15 = null;
        model.User.User[] userArray18 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList19 = new java.util.ArrayList<model.User.User>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList19, userArray18);
        model.User.User user21 = model.User.UserFactory.createUser("hi!", "", userType15, "", "hi!", userList19);
        model.User.User user22 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList19);
        model.User.User user23 = model.User.UserFactory.createUser("hi!", "hi!", userType6, "hi!", "hi!", userList19);
        model.User.User user24 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList19);
        java.lang.Class<?> wildcardClass25 = user24.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType25 = null;
        model.User.UserType userType34 = null;
        model.User.UserType userType43 = null;
        model.User.User[] userArray46 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList47 = new java.util.ArrayList<model.User.User>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList47, userArray46);
        model.User.User user49 = model.User.UserFactory.createUser("hi!", "", userType43, "", "hi!", userList47);
        model.User.User user50 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList47);
        model.User.User user51 = model.User.UserFactory.createUser("hi!", "", userType34, "hi!", "", userList47);
        model.User.User user52 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList47);
        model.User.User user53 = model.User.UserFactory.createUser("hi!", "hi!", userType25, "", "", userList47);
        model.User.User user54 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList47);
        model.User.User user55 = model.User.UserFactory.createUser("hi!", "", userType16, "hi!", "hi!", userList47);
        model.User.User user56 = model.User.UserFactory.createLabManager("", "", "", "", userList47);
        model.User.User user57 = model.User.UserFactory.createUser("hi!", "", userType7, "hi!", "hi!", userList47);
        model.User.User user58 = model.User.UserFactory.createUser("", "", userType2, "hi!", "", userList47);
        java.lang.Class<?> wildcardClass59 = userList47.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType20 = null;
        model.User.User[] userArray23 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList24 = new java.util.ArrayList<model.User.User>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList24, userArray23);
        model.User.User user26 = model.User.UserFactory.createUser("hi!", "", userType20, "", "hi!", userList24);
        model.User.User user27 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList24);
        model.User.User user28 = model.User.UserFactory.createUser("hi!", "", userType11, "hi!", "", userList24);
        model.User.User user29 = model.User.UserFactory.createUser("", "", userType6, "", "", userList24);
        model.User.User user30 = model.User.UserFactory.createLabManager("", "hi!", "hi!", "hi!", userList24);
        java.lang.Class<?> wildcardClass31 = user30.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        model.User.UserType userType2 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType24 = null;
        model.User.UserType userType33 = null;
        model.User.UserType userType42 = null;
        model.User.User[] userArray45 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList46 = new java.util.ArrayList<model.User.User>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList46, userArray45);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "", userType42, "", "hi!", userList46);
        model.User.User user49 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList46);
        model.User.User user50 = model.User.UserFactory.createUser("hi!", "", userType33, "hi!", "", userList46);
        model.User.User user51 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList46);
        model.User.User user52 = model.User.UserFactory.createUser("hi!", "hi!", userType24, "", "", userList46);
        model.User.User user53 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList46);
        model.User.User user54 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList46);
        model.User.User user55 = model.User.UserFactory.createUser("", "", userType11, "hi!", "", userList46);
        model.User.User user56 = model.User.UserFactory.createLabManager("", "", "hi!", "", userList46);
        model.User.User user57 = model.User.UserFactory.createUser("", "hi!", userType2, "hi!", "hi!", userList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        model.User.UserType userType2 = null;
        java.util.ArrayList<model.User.User> userList5 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.User.User user6 = model.User.UserFactory.createUser("hi!", "hi!", userType2, "", "hi!", userList5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.iterator()\" because \"users\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        model.User.UserType userType6 = null;
        model.User.UserType userType15 = null;
        model.User.User[] userArray18 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList19 = new java.util.ArrayList<model.User.User>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList19, userArray18);
        model.User.User user21 = model.User.UserFactory.createUser("hi!", "", userType15, "", "hi!", userList19);
        model.User.User user22 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList19);
        model.User.User user23 = model.User.UserFactory.createUser("hi!", "", userType6, "hi!", "", userList19);
        model.User.User user24 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "hi!", userList19);
        java.lang.Class<?> wildcardClass25 = userList19.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        model.User.UserType userType6 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType24 = null;
        model.User.UserType userType33 = null;
        model.User.User[] userArray36 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList37 = new java.util.ArrayList<model.User.User>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList37, userArray36);
        model.User.User user39 = model.User.UserFactory.createUser("hi!", "", userType33, "", "hi!", userList37);
        model.User.User user40 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList37);
        model.User.User user41 = model.User.UserFactory.createUser("hi!", "", userType24, "hi!", "", userList37);
        model.User.User user42 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList37);
        model.User.User user43 = model.User.UserFactory.createUser("hi!", "hi!", userType15, "", "", userList37);
        model.User.User user44 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList37);
        model.User.User user45 = model.User.UserFactory.createUser("", "", userType6, "hi!", "hi!", userList37);
        model.User.User user46 = model.User.UserFactory.createLabManager("hi!", "", "hi!", "", userList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        model.User.UserType userType14 = null;
        model.User.UserType userType23 = null;
        model.User.UserType userType32 = null;
        model.User.User[] userArray35 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList36 = new java.util.ArrayList<model.User.User>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList36, userArray35);
        model.User.User user38 = model.User.UserFactory.createUser("hi!", "", userType32, "", "hi!", userList36);
        model.User.User user39 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList36);
        model.User.User user40 = model.User.UserFactory.createUser("hi!", "", userType23, "hi!", "", userList36);
        model.User.User user41 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList36);
        model.User.User user42 = model.User.UserFactory.createUser("hi!", "hi!", userType14, "", "", userList36);
        model.User.User user43 = model.User.UserFactory.createLabManager("hi!", "", "hi!", "hi!", userList36);
        model.User.User user44 = model.User.UserFactory.createLabManager("", "", "hi!", "", userList36);
        model.User.User user45 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList36);
        java.lang.Class<?> wildcardClass46 = user45.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        model.User.UserType userType14 = null;
        model.User.UserType userType23 = null;
        model.User.UserType userType32 = null;
        model.User.User[] userArray35 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList36 = new java.util.ArrayList<model.User.User>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList36, userArray35);
        model.User.User user38 = model.User.UserFactory.createUser("hi!", "", userType32, "", "hi!", userList36);
        model.User.User user39 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList36);
        model.User.User user40 = model.User.UserFactory.createUser("hi!", "", userType23, "hi!", "", userList36);
        model.User.User user41 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList36);
        model.User.User user42 = model.User.UserFactory.createUser("hi!", "hi!", userType14, "", "", userList36);
        model.User.User user43 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList36);
        model.User.User user44 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList36);
        model.User.User user45 = model.User.UserFactory.createLabManager("hi!", "", "hi!", "", userList36);
        java.lang.Class<?> wildcardClass46 = userList36.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        model.User.UserType userType2 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType21 = null;
        model.User.UserType userType30 = null;
        model.User.User[] userArray33 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList34 = new java.util.ArrayList<model.User.User>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList34, userArray33);
        model.User.User user36 = model.User.UserFactory.createUser("hi!", "", userType30, "", "hi!", userList34);
        model.User.User user37 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList34);
        model.User.User user38 = model.User.UserFactory.createUser("hi!", "", userType21, "hi!", "", userList34);
        model.User.User user39 = model.User.UserFactory.createUser("hi!", "", userType16, "hi!", "", userList34);
        model.User.User user40 = model.User.UserFactory.createUser("hi!", "hi!", userType11, "", "", userList34);
        model.User.User user41 = model.User.UserFactory.createLabManager("", "hi!", "hi!", "hi!", userList34);
        model.User.User user42 = model.User.UserFactory.createUser("hi!", "", userType2, "", "", userList34);
        java.lang.Class<?> wildcardClass43 = user42.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType29 = null;
        model.User.UserType userType38 = null;
        model.User.User[] userArray41 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList42 = new java.util.ArrayList<model.User.User>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList42, userArray41);
        model.User.User user44 = model.User.UserFactory.createUser("hi!", "", userType38, "", "hi!", userList42);
        model.User.User user45 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList42);
        model.User.User user46 = model.User.UserFactory.createUser("hi!", "", userType29, "hi!", "", userList42);
        model.User.User user47 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList42);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "hi!", userType20, "", "", userList42);
        model.User.User user49 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList42);
        model.User.User user50 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "hi!", userList42);
        model.User.User user51 = model.User.UserFactory.createUser("", "hi!", userType7, "", "", userList42);
        model.User.User user52 = model.User.UserFactory.createUser("", "", userType2, "", "", userList42);
        java.lang.Class<?> wildcardClass53 = userList42.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        model.User.UserType userType2 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType28 = null;
        model.User.UserType userType37 = null;
        model.User.UserType userType46 = null;
        model.User.User[] userArray49 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList50 = new java.util.ArrayList<model.User.User>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList50, userArray49);
        model.User.User user52 = model.User.UserFactory.createUser("hi!", "", userType46, "", "hi!", userList50);
        model.User.User user53 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList50);
        model.User.User user54 = model.User.UserFactory.createUser("hi!", "", userType37, "hi!", "", userList50);
        model.User.User user55 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList50);
        model.User.User user56 = model.User.UserFactory.createUser("hi!", "hi!", userType28, "", "", userList50);
        model.User.User user57 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList50);
        model.User.User user58 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList50);
        model.User.User user59 = model.User.UserFactory.createUser("", "", userType15, "hi!", "", userList50);
        model.User.User user60 = model.User.UserFactory.createLabManager("", "", "hi!", "", userList50);
        model.User.User user61 = model.User.UserFactory.createLabManager("", "", "hi!", "", userList50);
        model.User.User user62 = model.User.UserFactory.createUser("", "", userType2, "hi!", "", userList50);
        java.lang.Class<?> wildcardClass63 = userList50.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType29 = null;
        model.User.UserType userType38 = null;
        model.User.UserType userType47 = null;
        model.User.User[] userArray50 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList51 = new java.util.ArrayList<model.User.User>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList51, userArray50);
        model.User.User user53 = model.User.UserFactory.createUser("hi!", "", userType47, "", "hi!", userList51);
        model.User.User user54 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList51);
        model.User.User user55 = model.User.UserFactory.createUser("hi!", "", userType38, "hi!", "", userList51);
        model.User.User user56 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList51);
        model.User.User user57 = model.User.UserFactory.createUser("hi!", "hi!", userType29, "", "", userList51);
        model.User.User user58 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList51);
        model.User.User user59 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList51);
        model.User.User user60 = model.User.UserFactory.createUser("", "", userType16, "hi!", "hi!", userList51);
        model.User.User user61 = model.User.UserFactory.createLabManager("hi!", "", "hi!", "hi!", userList51);
        model.User.User user62 = model.User.UserFactory.createUser("", "hi!", userType7, "hi!", "", userList51);
        model.User.User user63 = model.User.UserFactory.createUser("hi!", "hi!", userType2, "hi!", "", userList51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user63);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType12 = null;
        model.User.UserType userType25 = null;
        model.User.UserType userType34 = null;
        model.User.UserType userType43 = null;
        model.User.User[] userArray46 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList47 = new java.util.ArrayList<model.User.User>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList47, userArray46);
        model.User.User user49 = model.User.UserFactory.createUser("hi!", "", userType43, "", "hi!", userList47);
        model.User.User user50 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList47);
        model.User.User user51 = model.User.UserFactory.createUser("hi!", "", userType34, "hi!", "", userList47);
        model.User.User user52 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList47);
        model.User.User user53 = model.User.UserFactory.createUser("hi!", "hi!", userType25, "", "", userList47);
        model.User.User user54 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList47);
        model.User.User user55 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "hi!", userList47);
        model.User.User user56 = model.User.UserFactory.createUser("", "hi!", userType12, "", "hi!", userList47);
        model.User.User user57 = model.User.UserFactory.createUser("hi!", "", userType7, "hi!", "", userList47);
        model.User.User user58 = model.User.UserFactory.createUser("", "", userType2, "", "hi!", userList47);
        java.lang.Class<?> wildcardClass59 = userList47.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType29 = null;
        model.User.UserType userType38 = null;
        model.User.User[] userArray41 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList42 = new java.util.ArrayList<model.User.User>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList42, userArray41);
        model.User.User user44 = model.User.UserFactory.createUser("hi!", "", userType38, "", "hi!", userList42);
        model.User.User user45 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList42);
        model.User.User user46 = model.User.UserFactory.createUser("hi!", "", userType29, "hi!", "", userList42);
        model.User.User user47 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList42);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "", userType20, "hi!", "", userList42);
        model.User.User user49 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList42);
        model.User.User user50 = model.User.UserFactory.createUser("hi!", "hi!", userType11, "", "", userList42);
        model.User.User user51 = model.User.UserFactory.createUser("", "hi!", userType6, "", "hi!", userList42);
        model.User.User user52 = model.User.UserFactory.createLabManager("hi!", "", "", "hi!", userList42);
        java.lang.Class<?> wildcardClass53 = userList42.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        model.User.UserType userType6 = null;
        model.User.UserType userType15 = null;
        model.User.User[] userArray18 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList19 = new java.util.ArrayList<model.User.User>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList19, userArray18);
        model.User.User user21 = model.User.UserFactory.createUser("hi!", "", userType15, "", "hi!", userList19);
        model.User.User user22 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList19);
        model.User.User user23 = model.User.UserFactory.createUser("", "", userType6, "", "hi!", userList19);
        model.User.User user24 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "hi!", userList19);
        java.lang.Class<?> wildcardClass25 = userList19.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        model.User.UserType userType14 = null;
        model.User.UserType userType23 = null;
        model.User.UserType userType32 = null;
        model.User.User[] userArray35 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList36 = new java.util.ArrayList<model.User.User>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList36, userArray35);
        model.User.User user38 = model.User.UserFactory.createUser("hi!", "", userType32, "", "hi!", userList36);
        model.User.User user39 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList36);
        model.User.User user40 = model.User.UserFactory.createUser("hi!", "", userType23, "hi!", "", userList36);
        model.User.User user41 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList36);
        model.User.User user42 = model.User.UserFactory.createUser("hi!", "hi!", userType14, "", "", userList36);
        model.User.User user43 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList36);
        model.User.User user44 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList36);
        model.User.User user45 = model.User.UserFactory.createLabManager("", "hi!", "hi!", "hi!", userList36);
        java.lang.Class<?> wildcardClass46 = userList36.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        model.User.UserType userType14 = null;
        model.User.UserType userType23 = null;
        model.User.UserType userType32 = null;
        model.User.User[] userArray35 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList36 = new java.util.ArrayList<model.User.User>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList36, userArray35);
        model.User.User user38 = model.User.UserFactory.createUser("hi!", "", userType32, "", "hi!", userList36);
        model.User.User user39 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList36);
        model.User.User user40 = model.User.UserFactory.createUser("hi!", "", userType23, "hi!", "", userList36);
        model.User.User user41 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList36);
        model.User.User user42 = model.User.UserFactory.createUser("hi!", "hi!", userType14, "", "", userList36);
        model.User.User user43 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList36);
        model.User.User user44 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "hi!", userList36);
        model.User.User user45 = model.User.UserFactory.createLabManager("hi!", "", "hi!", "hi!", userList36);
        java.lang.Class<?> wildcardClass46 = userList36.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType21 = null;
        model.User.UserType userType26 = null;
        model.User.UserType userType35 = null;
        model.User.User[] userArray38 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList39 = new java.util.ArrayList<model.User.User>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList39, userArray38);
        model.User.User user41 = model.User.UserFactory.createUser("hi!", "", userType35, "", "hi!", userList39);
        model.User.User user42 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList39);
        model.User.User user43 = model.User.UserFactory.createUser("hi!", "", userType26, "hi!", "", userList39);
        model.User.User user44 = model.User.UserFactory.createUser("hi!", "", userType21, "hi!", "", userList39);
        model.User.User user45 = model.User.UserFactory.createUser("hi!", "hi!", userType16, "", "", userList39);
        model.User.User user46 = model.User.UserFactory.createLabManager("", "hi!", "hi!", "hi!", userList39);
        model.User.User user47 = model.User.UserFactory.createUser("hi!", "", userType7, "", "", userList39);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "", userType2, "", "", userList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        model.User.UserType userType14 = null;
        model.User.UserType userType23 = null;
        model.User.UserType userType32 = null;
        model.User.User[] userArray35 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList36 = new java.util.ArrayList<model.User.User>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList36, userArray35);
        model.User.User user38 = model.User.UserFactory.createUser("hi!", "", userType32, "", "hi!", userList36);
        model.User.User user39 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList36);
        model.User.User user40 = model.User.UserFactory.createUser("hi!", "", userType23, "hi!", "", userList36);
        model.User.User user41 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList36);
        model.User.User user42 = model.User.UserFactory.createUser("hi!", "hi!", userType14, "", "", userList36);
        model.User.User user43 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList36);
        model.User.User user44 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "", userList36);
        model.User.User user45 = model.User.UserFactory.createLabManager("", "hi!", "hi!", "", userList36);
        java.lang.Class<?> wildcardClass46 = user45.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        model.User.UserType userType2 = null;
        model.User.UserType userType11 = null;
        model.User.User[] userArray14 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList15 = new java.util.ArrayList<model.User.User>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList15, userArray14);
        model.User.User user17 = model.User.UserFactory.createUser("hi!", "", userType11, "", "hi!", userList15);
        model.User.User user18 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList15);
        model.User.User user19 = model.User.UserFactory.createUser("hi!", "", userType2, "hi!", "", userList15);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray14);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user19);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        model.User.UserType userType2 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType25 = null;
        model.User.UserType userType34 = null;
        model.User.User[] userArray37 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList38 = new java.util.ArrayList<model.User.User>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList38, userArray37);
        model.User.User user40 = model.User.UserFactory.createUser("hi!", "", userType34, "", "hi!", userList38);
        model.User.User user41 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList38);
        model.User.User user42 = model.User.UserFactory.createUser("hi!", "", userType25, "hi!", "", userList38);
        model.User.User user43 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList38);
        model.User.User user44 = model.User.UserFactory.createUser("hi!", "", userType16, "hi!", "", userList38);
        model.User.User user45 = model.User.UserFactory.createUser("", "", userType11, "hi!", "hi!", userList38);
        model.User.User user46 = model.User.UserFactory.createLabManager("", "", "", "hi!", userList38);
        model.User.User user47 = model.User.UserFactory.createUser("hi!", "hi!", userType2, "", "", userList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        model.User.UserType userType6 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType24 = null;
        model.User.User[] userArray27 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList28 = new java.util.ArrayList<model.User.User>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList28, userArray27);
        model.User.User user30 = model.User.UserFactory.createUser("hi!", "", userType24, "", "hi!", userList28);
        model.User.User user31 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList28);
        model.User.User user32 = model.User.UserFactory.createUser("hi!", "", userType15, "hi!", "", userList28);
        model.User.User user33 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList28);
        model.User.User user34 = model.User.UserFactory.createUser("hi!", "hi!", userType6, "", "", userList28);
        model.User.User user35 = model.User.UserFactory.createLabManager("hi!", "", "hi!", "hi!", userList28);
        java.lang.Class<?> wildcardClass36 = user35.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        model.User.UserType userType2 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType25 = null;
        model.User.UserType userType34 = null;
        model.User.UserType userType43 = null;
        model.User.User[] userArray46 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList47 = new java.util.ArrayList<model.User.User>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList47, userArray46);
        model.User.User user49 = model.User.UserFactory.createUser("hi!", "", userType43, "", "hi!", userList47);
        model.User.User user50 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList47);
        model.User.User user51 = model.User.UserFactory.createUser("hi!", "", userType34, "hi!", "", userList47);
        model.User.User user52 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList47);
        model.User.User user53 = model.User.UserFactory.createUser("hi!", "", userType25, "hi!", "", userList47);
        model.User.User user54 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList47);
        model.User.User user55 = model.User.UserFactory.createUser("hi!", "hi!", userType16, "", "", userList47);
        model.User.User user56 = model.User.UserFactory.createUser("", "", userType11, "", "", userList47);
        model.User.User user57 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "", userList47);
        model.User.User user58 = model.User.UserFactory.createUser("", "", userType2, "", "hi!", userList47);
        java.lang.Class<?> wildcardClass59 = userList47.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        model.User.UserType userType6 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType24 = null;
        model.User.User[] userArray27 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList28 = new java.util.ArrayList<model.User.User>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList28, userArray27);
        model.User.User user30 = model.User.UserFactory.createUser("hi!", "", userType24, "", "hi!", userList28);
        model.User.User user31 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList28);
        model.User.User user32 = model.User.UserFactory.createUser("hi!", "", userType15, "hi!", "", userList28);
        model.User.User user33 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "hi!", userList28);
        model.User.User user34 = model.User.UserFactory.createUser("hi!", "", userType6, "hi!", "hi!", userList28);
        model.User.User user35 = model.User.UserFactory.createLabManager("hi!", "", "", "hi!", userList28);
        java.lang.Class<?> wildcardClass36 = userList28.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType21 = null;
        model.User.UserType userType30 = null;
        model.User.UserType userType39 = null;
        model.User.User[] userArray42 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList43 = new java.util.ArrayList<model.User.User>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList43, userArray42);
        model.User.User user45 = model.User.UserFactory.createUser("hi!", "", userType39, "", "hi!", userList43);
        model.User.User user46 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList43);
        model.User.User user47 = model.User.UserFactory.createUser("hi!", "", userType30, "hi!", "", userList43);
        model.User.User user48 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList43);
        model.User.User user49 = model.User.UserFactory.createUser("hi!", "", userType21, "hi!", "", userList43);
        model.User.User user50 = model.User.UserFactory.createUser("", "", userType16, "hi!", "hi!", userList43);
        model.User.User user51 = model.User.UserFactory.createLabManager("", "", "", "hi!", userList43);
        model.User.User user52 = model.User.UserFactory.createUser("hi!", "", userType7, "", "hi!", userList43);
        model.User.User user53 = model.User.UserFactory.createUser("", "hi!", userType2, "hi!", "hi!", userList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType25 = null;
        model.User.UserType userType34 = null;
        model.User.UserType userType43 = null;
        model.User.User[] userArray46 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList47 = new java.util.ArrayList<model.User.User>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList47, userArray46);
        model.User.User user49 = model.User.UserFactory.createUser("hi!", "", userType43, "", "hi!", userList47);
        model.User.User user50 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList47);
        model.User.User user51 = model.User.UserFactory.createUser("hi!", "", userType34, "hi!", "", userList47);
        model.User.User user52 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList47);
        model.User.User user53 = model.User.UserFactory.createUser("hi!", "hi!", userType25, "", "", userList47);
        model.User.User user54 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList47);
        model.User.User user55 = model.User.UserFactory.createUser("hi!", "", userType16, "hi!", "hi!", userList47);
        model.User.User user56 = model.User.UserFactory.createLabManager("", "", "", "", userList47);
        model.User.User user57 = model.User.UserFactory.createUser("hi!", "", userType7, "hi!", "hi!", userList47);
        model.User.User user58 = model.User.UserFactory.createUser("", "", userType2, "hi!", "", userList47);
        java.lang.Class<?> wildcardClass59 = user58.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType20 = null;
        model.User.User[] userArray23 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList24 = new java.util.ArrayList<model.User.User>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList24, userArray23);
        model.User.User user26 = model.User.UserFactory.createUser("hi!", "", userType20, "", "hi!", userList24);
        model.User.User user27 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList24);
        model.User.User user28 = model.User.UserFactory.createUser("hi!", "", userType11, "hi!", "", userList24);
        model.User.User user29 = model.User.UserFactory.createUser("", "", userType6, "", "", userList24);
        model.User.User user30 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "", userList24);
        java.lang.Class<?> wildcardClass31 = userList24.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        model.User.UserType userType2 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType20 = null;
        model.User.User[] userArray23 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList24 = new java.util.ArrayList<model.User.User>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList24, userArray23);
        model.User.User user26 = model.User.UserFactory.createUser("hi!", "", userType20, "", "hi!", userList24);
        model.User.User user27 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList24);
        model.User.User user28 = model.User.UserFactory.createUser("hi!", "hi!", userType11, "hi!", "hi!", userList24);
        model.User.User user29 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList24);
        model.User.User user30 = model.User.UserFactory.createUser("", "", userType2, "", "hi!", userList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user30);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType12 = null;
        model.User.UserType userType17 = null;
        model.User.UserType userType26 = null;
        model.User.User[] userArray29 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList30 = new java.util.ArrayList<model.User.User>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList30, userArray29);
        model.User.User user32 = model.User.UserFactory.createUser("hi!", "", userType26, "", "hi!", userList30);
        model.User.User user33 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList30);
        model.User.User user34 = model.User.UserFactory.createUser("hi!", "", userType17, "hi!", "", userList30);
        model.User.User user35 = model.User.UserFactory.createUser("hi!", "hi!", userType12, "", "", userList30);
        model.User.User user36 = model.User.UserFactory.createUser("", "", userType7, "hi!", "", userList30);
        model.User.User user37 = model.User.UserFactory.createUser("hi!", "", userType2, "", "", userList30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType29 = null;
        model.User.User[] userArray32 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList33 = new java.util.ArrayList<model.User.User>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList33, userArray32);
        model.User.User user35 = model.User.UserFactory.createUser("hi!", "", userType29, "", "hi!", userList33);
        model.User.User user36 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList33);
        model.User.User user37 = model.User.UserFactory.createUser("hi!", "", userType20, "hi!", "", userList33);
        model.User.User user38 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList33);
        model.User.User user39 = model.User.UserFactory.createUser("hi!", "hi!", userType11, "", "", userList33);
        model.User.User user40 = model.User.UserFactory.createUser("hi!", "", userType6, "hi!", "hi!", userList33);
        model.User.User user41 = model.User.UserFactory.createLabManager("", "hi!", "hi!", "hi!", userList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        model.User.UserType userType2 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType24 = null;
        model.User.UserType userType33 = null;
        model.User.UserType userType42 = null;
        model.User.User[] userArray45 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList46 = new java.util.ArrayList<model.User.User>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList46, userArray45);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "", userType42, "", "hi!", userList46);
        model.User.User user49 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList46);
        model.User.User user50 = model.User.UserFactory.createUser("hi!", "", userType33, "hi!", "", userList46);
        model.User.User user51 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList46);
        model.User.User user52 = model.User.UserFactory.createUser("hi!", "hi!", userType24, "", "", userList46);
        model.User.User user53 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList46);
        model.User.User user54 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList46);
        model.User.User user55 = model.User.UserFactory.createUser("", "", userType11, "hi!", "hi!", userList46);
        model.User.User user56 = model.User.UserFactory.createLabManager("hi!", "", "hi!", "hi!", userList46);
        model.User.User user57 = model.User.UserFactory.createUser("", "hi!", userType2, "hi!", "", userList46);
        java.lang.Class<?> wildcardClass58 = user57.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        model.User.UserType userType10 = null;
        model.User.UserType userType19 = null;
        model.User.UserType userType28 = null;
        model.User.User[] userArray31 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList32 = new java.util.ArrayList<model.User.User>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList32, userArray31);
        model.User.User user34 = model.User.UserFactory.createUser("hi!", "", userType28, "", "hi!", userList32);
        model.User.User user35 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList32);
        model.User.User user36 = model.User.UserFactory.createUser("hi!", "", userType19, "hi!", "", userList32);
        model.User.User user37 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList32);
        model.User.User user38 = model.User.UserFactory.createUser("hi!", "hi!", userType10, "", "", userList32);
        model.User.User user39 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "hi!", userList32);
        model.User.User user40 = model.User.UserFactory.createLabManager("", "hi!", "hi!", "hi!", userList32);
        java.lang.Class<?> wildcardClass41 = userList32.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        java.util.ArrayList<model.User.User> userList4 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.User.User user5 = model.User.UserFactory.createLabManager("", "", "", "hi!", userList4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.iterator()\" because \"users\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        model.User.UserType userType2 = null;
        model.User.UserType userType19 = null;
        model.User.UserType userType28 = null;
        model.User.UserType userType37 = null;
        model.User.User[] userArray40 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList41 = new java.util.ArrayList<model.User.User>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList41, userArray40);
        model.User.User user43 = model.User.UserFactory.createUser("hi!", "", userType37, "", "hi!", userList41);
        model.User.User user44 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList41);
        model.User.User user45 = model.User.UserFactory.createUser("hi!", "", userType28, "hi!", "", userList41);
        model.User.User user46 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList41);
        model.User.User user47 = model.User.UserFactory.createUser("hi!", "hi!", userType19, "", "", userList41);
        model.User.User user48 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "hi!", userList41);
        model.User.User user49 = model.User.UserFactory.createLabManager("", "hi!", "hi!", "hi!", userList41);
        model.User.User user50 = model.User.UserFactory.createLabManager("", "", "hi!", "", userList41);
        model.User.User user51 = model.User.UserFactory.createUser("", "hi!", userType2, "hi!", "", userList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType16 = null;
        model.User.User[] userArray19 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList20 = new java.util.ArrayList<model.User.User>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList20, userArray19);
        model.User.User user22 = model.User.UserFactory.createUser("hi!", "", userType16, "", "hi!", userList20);
        model.User.User user23 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList20);
        model.User.User user24 = model.User.UserFactory.createUser("hi!", "", userType7, "", "", userList20);
        model.User.User user25 = model.User.UserFactory.createUser("", "hi!", userType2, "", "", userList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user25);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType25 = null;
        model.User.User[] userArray28 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList29 = new java.util.ArrayList<model.User.User>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList29, userArray28);
        model.User.User user31 = model.User.UserFactory.createUser("hi!", "", userType25, "", "hi!", userList29);
        model.User.User user32 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList29);
        model.User.User user33 = model.User.UserFactory.createUser("hi!", "", userType16, "hi!", "", userList29);
        model.User.User user34 = model.User.UserFactory.createUser("hi!", "", userType11, "hi!", "", userList29);
        model.User.User user35 = model.User.UserFactory.createUser("hi!", "hi!", userType6, "", "", userList29);
        model.User.User user36 = model.User.UserFactory.createLabManager("", "hi!", "hi!", "hi!", userList29);
        java.lang.Class<?> wildcardClass37 = userList29.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        model.User.UserType userType6 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType28 = null;
        model.User.UserType userType37 = null;
        model.User.UserType userType46 = null;
        model.User.User[] userArray49 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList50 = new java.util.ArrayList<model.User.User>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList50, userArray49);
        model.User.User user52 = model.User.UserFactory.createUser("hi!", "", userType46, "", "hi!", userList50);
        model.User.User user53 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList50);
        model.User.User user54 = model.User.UserFactory.createUser("hi!", "", userType37, "hi!", "", userList50);
        model.User.User user55 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList50);
        model.User.User user56 = model.User.UserFactory.createUser("hi!", "hi!", userType28, "", "", userList50);
        model.User.User user57 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList50);
        model.User.User user58 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList50);
        model.User.User user59 = model.User.UserFactory.createUser("", "", userType15, "hi!", "hi!", userList50);
        model.User.User user60 = model.User.UserFactory.createLabManager("hi!", "", "hi!", "hi!", userList50);
        model.User.User user61 = model.User.UserFactory.createUser("", "hi!", userType6, "hi!", "", userList50);
        model.User.User user62 = model.User.UserFactory.createLabManager("", "", "hi!", "hi!", userList50);
        java.lang.Class<?> wildcardClass63 = userList50.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType12 = null;
        model.User.UserType userType21 = null;
        model.User.UserType userType30 = null;
        model.User.User[] userArray33 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList34 = new java.util.ArrayList<model.User.User>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList34, userArray33);
        model.User.User user36 = model.User.UserFactory.createUser("hi!", "", userType30, "", "hi!", userList34);
        model.User.User user37 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList34);
        model.User.User user38 = model.User.UserFactory.createUser("hi!", "", userType21, "hi!", "", userList34);
        model.User.User user39 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList34);
        model.User.User user40 = model.User.UserFactory.createUser("hi!", "hi!", userType12, "", "", userList34);
        model.User.User user41 = model.User.UserFactory.createUser("hi!", "hi!", userType7, "hi!", "", userList34);
        model.User.User user42 = model.User.UserFactory.createUser("hi!", "", userType2, "", "", userList34);
        java.lang.Class<?> wildcardClass43 = userList34.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType25 = null;
        model.User.User[] userArray28 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList29 = new java.util.ArrayList<model.User.User>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList29, userArray28);
        model.User.User user31 = model.User.UserFactory.createUser("hi!", "", userType25, "", "hi!", userList29);
        model.User.User user32 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList29);
        model.User.User user33 = model.User.UserFactory.createUser("hi!", "", userType16, "hi!", "", userList29);
        model.User.User user34 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList29);
        model.User.User user35 = model.User.UserFactory.createUser("hi!", "", userType7, "hi!", "", userList29);
        model.User.User user36 = model.User.UserFactory.createUser("hi!", "hi!", userType2, "hi!", "", userList29);
        java.lang.Class<?> wildcardClass37 = userList29.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType25 = null;
        model.User.User[] userArray28 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList29 = new java.util.ArrayList<model.User.User>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList29, userArray28);
        model.User.User user31 = model.User.UserFactory.createUser("hi!", "", userType25, "", "hi!", userList29);
        model.User.User user32 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList29);
        model.User.User user33 = model.User.UserFactory.createUser("hi!", "", userType16, "hi!", "", userList29);
        model.User.User user34 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList29);
        model.User.User user35 = model.User.UserFactory.createUser("hi!", "hi!", userType7, "", "", userList29);
        model.User.User user36 = model.User.UserFactory.createUser("", "", userType2, "hi!", "", userList29);
        java.lang.Class<?> wildcardClass37 = user36.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType24 = null;
        model.User.UserType userType33 = null;
        model.User.UserType userType42 = null;
        model.User.User[] userArray45 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList46 = new java.util.ArrayList<model.User.User>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList46, userArray45);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "", userType42, "", "hi!", userList46);
        model.User.User user49 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList46);
        model.User.User user50 = model.User.UserFactory.createUser("hi!", "", userType33, "hi!", "", userList46);
        model.User.User user51 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList46);
        model.User.User user52 = model.User.UserFactory.createUser("hi!", "hi!", userType24, "", "", userList46);
        model.User.User user53 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList46);
        model.User.User user54 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList46);
        model.User.User user55 = model.User.UserFactory.createUser("", "", userType11, "hi!", "hi!", userList46);
        model.User.User user56 = model.User.UserFactory.createUser("", "hi!", userType6, "hi!", "hi!", userList46);
        model.User.User user57 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList46);
        java.lang.Class<?> wildcardClass58 = userList46.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        model.User.UserType userType10 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType24 = null;
        model.User.UserType userType33 = null;
        model.User.UserType userType42 = null;
        model.User.User[] userArray45 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList46 = new java.util.ArrayList<model.User.User>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList46, userArray45);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "", userType42, "", "hi!", userList46);
        model.User.User user49 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList46);
        model.User.User user50 = model.User.UserFactory.createUser("hi!", "", userType33, "hi!", "", userList46);
        model.User.User user51 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList46);
        model.User.User user52 = model.User.UserFactory.createUser("hi!", "", userType24, "hi!", "", userList46);
        model.User.User user53 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList46);
        model.User.User user54 = model.User.UserFactory.createUser("hi!", "hi!", userType15, "", "", userList46);
        model.User.User user55 = model.User.UserFactory.createUser("", "", userType10, "", "", userList46);
        model.User.User user56 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "", userList46);
        model.User.User user57 = model.User.UserFactory.createLabManager("", "hi!", "hi!", "hi!", userList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType29 = null;
        model.User.User[] userArray32 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList33 = new java.util.ArrayList<model.User.User>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList33, userArray32);
        model.User.User user35 = model.User.UserFactory.createUser("hi!", "", userType29, "", "hi!", userList33);
        model.User.User user36 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList33);
        model.User.User user37 = model.User.UserFactory.createUser("hi!", "", userType20, "hi!", "", userList33);
        model.User.User user38 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList33);
        model.User.User user39 = model.User.UserFactory.createUser("hi!", "hi!", userType11, "", "", userList33);
        model.User.User user40 = model.User.UserFactory.createUser("hi!", "", userType6, "hi!", "hi!", userList33);
        model.User.User user41 = model.User.UserFactory.createLabManager("", "", "hi!", "hi!", userList33);
        java.lang.Class<?> wildcardClass42 = userList33.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        model.User.UserType userType2 = null;
        model.User.UserType userType15 = null;
        model.User.User[] userArray18 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList19 = new java.util.ArrayList<model.User.User>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList19, userArray18);
        model.User.User user21 = model.User.UserFactory.createUser("hi!", "", userType15, "", "hi!", userList19);
        model.User.User user22 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList19);
        model.User.User user23 = model.User.UserFactory.createLabManager("", "", "", "hi!", userList19);
        model.User.User user24 = model.User.UserFactory.createUser("", "hi!", userType2, "", "", userList19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user24);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType21 = null;
        model.User.UserType userType30 = null;
        model.User.UserType userType39 = null;
        model.User.User[] userArray42 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList43 = new java.util.ArrayList<model.User.User>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList43, userArray42);
        model.User.User user45 = model.User.UserFactory.createUser("hi!", "", userType39, "", "hi!", userList43);
        model.User.User user46 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList43);
        model.User.User user47 = model.User.UserFactory.createUser("hi!", "", userType30, "hi!", "", userList43);
        model.User.User user48 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList43);
        model.User.User user49 = model.User.UserFactory.createUser("hi!", "", userType21, "hi!", "", userList43);
        model.User.User user50 = model.User.UserFactory.createUser("", "", userType16, "hi!", "hi!", userList43);
        model.User.User user51 = model.User.UserFactory.createLabManager("", "", "", "hi!", userList43);
        model.User.User user52 = model.User.UserFactory.createUser("hi!", "", userType7, "", "hi!", userList43);
        model.User.User user53 = model.User.UserFactory.createUser("", "", userType2, "hi!", "hi!", userList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType25 = null;
        model.User.UserType userType30 = null;
        model.User.UserType userType39 = null;
        model.User.User[] userArray42 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList43 = new java.util.ArrayList<model.User.User>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList43, userArray42);
        model.User.User user45 = model.User.UserFactory.createUser("hi!", "", userType39, "", "hi!", userList43);
        model.User.User user46 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList43);
        model.User.User user47 = model.User.UserFactory.createUser("hi!", "", userType30, "hi!", "", userList43);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "", userType25, "hi!", "", userList43);
        model.User.User user49 = model.User.UserFactory.createUser("hi!", "hi!", userType20, "", "", userList43);
        model.User.User user50 = model.User.UserFactory.createLabManager("", "hi!", "hi!", "hi!", userList43);
        model.User.User user51 = model.User.UserFactory.createUser("hi!", "", userType11, "", "", userList43);
        model.User.User user52 = model.User.UserFactory.createUser("", "", userType6, "", "", userList43);
        model.User.User user53 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "hi!", userList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType25 = null;
        model.User.User[] userArray28 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList29 = new java.util.ArrayList<model.User.User>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList29, userArray28);
        model.User.User user31 = model.User.UserFactory.createUser("hi!", "", userType25, "", "hi!", userList29);
        model.User.User user32 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList29);
        model.User.User user33 = model.User.UserFactory.createUser("hi!", "hi!", userType16, "hi!", "hi!", userList29);
        model.User.User user34 = model.User.UserFactory.createUser("hi!", "hi!", userType11, "hi!", "", userList29);
        model.User.User user35 = model.User.UserFactory.createUser("hi!", "", userType6, "", "", userList29);
        model.User.User user36 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList29);
        java.lang.Class<?> wildcardClass37 = userList29.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        model.User.UserType userType2 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType29 = null;
        model.User.User[] userArray32 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList33 = new java.util.ArrayList<model.User.User>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList33, userArray32);
        model.User.User user35 = model.User.UserFactory.createUser("hi!", "", userType29, "", "hi!", userList33);
        model.User.User user36 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList33);
        model.User.User user37 = model.User.UserFactory.createUser("hi!", "", userType20, "hi!", "", userList33);
        model.User.User user38 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList33);
        model.User.User user39 = model.User.UserFactory.createUser("hi!", "", userType11, "hi!", "", userList33);
        model.User.User user40 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList33);
        model.User.User user41 = model.User.UserFactory.createUser("", "", userType2, "hi!", "hi!", userList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType25 = null;
        model.User.UserType userType34 = null;
        model.User.UserType userType43 = null;
        model.User.User[] userArray46 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList47 = new java.util.ArrayList<model.User.User>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList47, userArray46);
        model.User.User user49 = model.User.UserFactory.createUser("hi!", "", userType43, "", "hi!", userList47);
        model.User.User user50 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList47);
        model.User.User user51 = model.User.UserFactory.createUser("hi!", "", userType34, "hi!", "", userList47);
        model.User.User user52 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList47);
        model.User.User user53 = model.User.UserFactory.createUser("hi!", "", userType25, "hi!", "", userList47);
        model.User.User user54 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList47);
        model.User.User user55 = model.User.UserFactory.createUser("hi!", "hi!", userType16, "", "", userList47);
        model.User.User user56 = model.User.UserFactory.createUser("", "", userType11, "", "", userList47);
        model.User.User user57 = model.User.UserFactory.createUser("", "hi!", userType6, "hi!", "hi!", userList47);
        model.User.User user58 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList47);
        java.lang.Class<?> wildcardClass59 = user58.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        model.User.UserType userType2 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType29 = null;
        model.User.UserType userType38 = null;
        model.User.UserType userType47 = null;
        model.User.User[] userArray50 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList51 = new java.util.ArrayList<model.User.User>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList51, userArray50);
        model.User.User user53 = model.User.UserFactory.createUser("hi!", "", userType47, "", "hi!", userList51);
        model.User.User user54 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList51);
        model.User.User user55 = model.User.UserFactory.createUser("hi!", "", userType38, "hi!", "", userList51);
        model.User.User user56 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList51);
        model.User.User user57 = model.User.UserFactory.createUser("hi!", "", userType29, "hi!", "", userList51);
        model.User.User user58 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList51);
        model.User.User user59 = model.User.UserFactory.createUser("hi!", "hi!", userType20, "", "", userList51);
        model.User.User user60 = model.User.UserFactory.createUser("", "", userType15, "", "", userList51);
        model.User.User user61 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList51);
        model.User.User user62 = model.User.UserFactory.createLabManager("", "hi!", "hi!", "hi!", userList51);
        model.User.User user63 = model.User.UserFactory.createUser("hi!", "hi!", userType2, "hi!", "hi!", userList51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user63);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        model.User.UserType userType14 = null;
        model.User.UserType userType23 = null;
        model.User.UserType userType32 = null;
        model.User.User[] userArray35 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList36 = new java.util.ArrayList<model.User.User>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList36, userArray35);
        model.User.User user38 = model.User.UserFactory.createUser("hi!", "", userType32, "", "hi!", userList36);
        model.User.User user39 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList36);
        model.User.User user40 = model.User.UserFactory.createUser("hi!", "", userType23, "hi!", "", userList36);
        model.User.User user41 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList36);
        model.User.User user42 = model.User.UserFactory.createUser("hi!", "hi!", userType14, "", "", userList36);
        model.User.User user43 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList36);
        model.User.User user44 = model.User.UserFactory.createLabManager("", "", "hi!", "hi!", userList36);
        model.User.User user45 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList36);
        java.lang.Class<?> wildcardClass46 = userList36.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType12 = null;
        model.User.UserType userType17 = null;
        model.User.UserType userType22 = null;
        model.User.UserType userType27 = null;
        model.User.UserType userType36 = null;
        model.User.User[] userArray39 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList40 = new java.util.ArrayList<model.User.User>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList40, userArray39);
        model.User.User user42 = model.User.UserFactory.createUser("hi!", "", userType36, "", "hi!", userList40);
        model.User.User user43 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList40);
        model.User.User user44 = model.User.UserFactory.createUser("hi!", "", userType27, "hi!", "", userList40);
        model.User.User user45 = model.User.UserFactory.createUser("hi!", "hi!", userType22, "", "", userList40);
        model.User.User user46 = model.User.UserFactory.createUser("hi!", "", userType17, "", "hi!", userList40);
        model.User.User user47 = model.User.UserFactory.createUser("hi!", "hi!", userType12, "", "", userList40);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "hi!", userType7, "hi!", "", userList40);
        model.User.User user49 = model.User.UserFactory.createUser("hi!", "", userType2, "hi!", "hi!", userList40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType29 = null;
        model.User.UserType userType38 = null;
        model.User.User[] userArray41 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList42 = new java.util.ArrayList<model.User.User>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList42, userArray41);
        model.User.User user44 = model.User.UserFactory.createUser("hi!", "", userType38, "", "hi!", userList42);
        model.User.User user45 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList42);
        model.User.User user46 = model.User.UserFactory.createUser("hi!", "", userType29, "hi!", "", userList42);
        model.User.User user47 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList42);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "hi!", userType20, "", "", userList42);
        model.User.User user49 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList42);
        model.User.User user50 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList42);
        model.User.User user51 = model.User.UserFactory.createUser("", "", userType7, "hi!", "", userList42);
        model.User.User user52 = model.User.UserFactory.createUser("", "hi!", userType2, "hi!", "hi!", userList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        model.User.UserType userType2 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType33 = null;
        model.User.UserType userType42 = null;
        model.User.UserType userType51 = null;
        model.User.User[] userArray54 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList55 = new java.util.ArrayList<model.User.User>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList55, userArray54);
        model.User.User user57 = model.User.UserFactory.createUser("hi!", "", userType51, "", "hi!", userList55);
        model.User.User user58 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList55);
        model.User.User user59 = model.User.UserFactory.createUser("hi!", "", userType42, "hi!", "", userList55);
        model.User.User user60 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList55);
        model.User.User user61 = model.User.UserFactory.createUser("hi!", "hi!", userType33, "", "", userList55);
        model.User.User user62 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList55);
        model.User.User user63 = model.User.UserFactory.createLabManager("", "", "hi!", "hi!", userList55);
        model.User.User user64 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "", userList55);
        model.User.User user65 = model.User.UserFactory.createUser("hi!", "", userType16, "hi!", "hi!", userList55);
        model.User.User user66 = model.User.UserFactory.createUser("hi!", "hi!", userType11, "", "", userList55);
        model.User.User user67 = model.User.UserFactory.createLabManager("", "hi!", "hi!", "", userList55);
        model.User.User user68 = model.User.UserFactory.createUser("", "", userType2, "", "", userList55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user68);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType25 = null;
        model.User.UserType userType34 = null;
        model.User.User[] userArray37 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList38 = new java.util.ArrayList<model.User.User>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList38, userArray37);
        model.User.User user40 = model.User.UserFactory.createUser("hi!", "", userType34, "", "hi!", userList38);
        model.User.User user41 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList38);
        model.User.User user42 = model.User.UserFactory.createUser("hi!", "", userType25, "hi!", "", userList38);
        model.User.User user43 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList38);
        model.User.User user44 = model.User.UserFactory.createUser("hi!", "", userType16, "hi!", "", userList38);
        model.User.User user45 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList38);
        model.User.User user46 = model.User.UserFactory.createUser("hi!", "hi!", userType7, "", "", userList38);
        model.User.User user47 = model.User.UserFactory.createUser("hi!", "", userType2, "", "", userList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType20 = null;
        model.User.User[] userArray23 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList24 = new java.util.ArrayList<model.User.User>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList24, userArray23);
        model.User.User user26 = model.User.UserFactory.createUser("hi!", "", userType20, "", "hi!", userList24);
        model.User.User user27 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList24);
        model.User.User user28 = model.User.UserFactory.createUser("hi!", "", userType11, "hi!", "", userList24);
        model.User.User user29 = model.User.UserFactory.createUser("hi!", "hi!", userType6, "", "", userList24);
        model.User.User user30 = model.User.UserFactory.createLabManager("", "hi!", "hi!", "hi!", userList24);
        java.lang.Class<?> wildcardClass31 = userList24.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType12 = null;
        model.User.UserType userType21 = null;
        model.User.User[] userArray24 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList25 = new java.util.ArrayList<model.User.User>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList25, userArray24);
        model.User.User user27 = model.User.UserFactory.createUser("hi!", "", userType21, "", "hi!", userList25);
        model.User.User user28 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList25);
        model.User.User user29 = model.User.UserFactory.createUser("hi!", "", userType12, "hi!", "", userList25);
        model.User.User user30 = model.User.UserFactory.createUser("", "", userType7, "", "", userList25);
        model.User.User user31 = model.User.UserFactory.createUser("hi!", "hi!", userType2, "", "hi!", userList25);
        java.lang.Class<?> wildcardClass32 = user31.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType21 = null;
        model.User.UserType userType34 = null;
        model.User.UserType userType43 = null;
        model.User.UserType userType52 = null;
        model.User.User[] userArray55 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList56 = new java.util.ArrayList<model.User.User>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList56, userArray55);
        model.User.User user58 = model.User.UserFactory.createUser("hi!", "", userType52, "", "hi!", userList56);
        model.User.User user59 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList56);
        model.User.User user60 = model.User.UserFactory.createUser("hi!", "", userType43, "hi!", "", userList56);
        model.User.User user61 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList56);
        model.User.User user62 = model.User.UserFactory.createUser("hi!", "hi!", userType34, "", "", userList56);
        model.User.User user63 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList56);
        model.User.User user64 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "hi!", userList56);
        model.User.User user65 = model.User.UserFactory.createUser("", "hi!", userType21, "", "hi!", userList56);
        model.User.User user66 = model.User.UserFactory.createUser("", "", userType16, "", "", userList56);
        model.User.User user67 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList56);
        model.User.User user68 = model.User.UserFactory.createUser("", "", userType7, "hi!", "", userList56);
        model.User.User user69 = model.User.UserFactory.createUser("hi!", "", userType2, "hi!", "", userList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user69);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType12 = null;
        model.User.UserType userType21 = null;
        model.User.UserType userType30 = null;
        model.User.User[] userArray33 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList34 = new java.util.ArrayList<model.User.User>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList34, userArray33);
        model.User.User user36 = model.User.UserFactory.createUser("hi!", "", userType30, "", "hi!", userList34);
        model.User.User user37 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList34);
        model.User.User user38 = model.User.UserFactory.createUser("hi!", "", userType21, "hi!", "", userList34);
        model.User.User user39 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList34);
        model.User.User user40 = model.User.UserFactory.createUser("hi!", "hi!", userType12, "", "", userList34);
        model.User.User user41 = model.User.UserFactory.createUser("hi!", "", userType7, "hi!", "hi!", userList34);
        model.User.User user42 = model.User.UserFactory.createUser("hi!", "", userType2, "hi!", "", userList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType12 = null;
        model.User.UserType userType25 = null;
        model.User.UserType userType34 = null;
        model.User.UserType userType43 = null;
        model.User.User[] userArray46 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList47 = new java.util.ArrayList<model.User.User>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList47, userArray46);
        model.User.User user49 = model.User.UserFactory.createUser("hi!", "", userType43, "", "hi!", userList47);
        model.User.User user50 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList47);
        model.User.User user51 = model.User.UserFactory.createUser("hi!", "", userType34, "hi!", "", userList47);
        model.User.User user52 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList47);
        model.User.User user53 = model.User.UserFactory.createUser("hi!", "hi!", userType25, "", "", userList47);
        model.User.User user54 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList47);
        model.User.User user55 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList47);
        model.User.User user56 = model.User.UserFactory.createUser("", "", userType12, "hi!", "hi!", userList47);
        model.User.User user57 = model.User.UserFactory.createUser("", "hi!", userType7, "hi!", "", userList47);
        model.User.User user58 = model.User.UserFactory.createUser("", "", userType2, "", "hi!", userList47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user58);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType20 = null;
        model.User.User[] userArray23 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList24 = new java.util.ArrayList<model.User.User>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList24, userArray23);
        model.User.User user26 = model.User.UserFactory.createUser("hi!", "", userType20, "", "hi!", userList24);
        model.User.User user27 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList24);
        model.User.User user28 = model.User.UserFactory.createUser("hi!", "", userType11, "hi!", "", userList24);
        model.User.User user29 = model.User.UserFactory.createUser("", "", userType6, "", "", userList24);
        model.User.User user30 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList24);
        java.lang.Class<?> wildcardClass31 = user30.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType21 = null;
        model.User.UserType userType30 = null;
        model.User.UserType userType39 = null;
        model.User.UserType userType48 = null;
        model.User.User[] userArray51 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList52 = new java.util.ArrayList<model.User.User>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList52, userArray51);
        model.User.User user54 = model.User.UserFactory.createUser("hi!", "", userType48, "", "hi!", userList52);
        model.User.User user55 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList52);
        model.User.User user56 = model.User.UserFactory.createUser("hi!", "", userType39, "hi!", "", userList52);
        model.User.User user57 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList52);
        model.User.User user58 = model.User.UserFactory.createUser("hi!", "", userType30, "hi!", "", userList52);
        model.User.User user59 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList52);
        model.User.User user60 = model.User.UserFactory.createUser("hi!", "hi!", userType21, "", "", userList52);
        model.User.User user61 = model.User.UserFactory.createUser("", "", userType16, "", "", userList52);
        model.User.User user62 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "", userList52);
        model.User.User user63 = model.User.UserFactory.createUser("", "", userType7, "", "hi!", userList52);
        model.User.User user64 = model.User.UserFactory.createUser("hi!", "hi!", userType2, "hi!", "", userList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user64);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType21 = null;
        model.User.UserType userType30 = null;
        model.User.User[] userArray33 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList34 = new java.util.ArrayList<model.User.User>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList34, userArray33);
        model.User.User user36 = model.User.UserFactory.createUser("hi!", "", userType30, "", "hi!", userList34);
        model.User.User user37 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList34);
        model.User.User user38 = model.User.UserFactory.createUser("hi!", "", userType21, "hi!", "", userList34);
        model.User.User user39 = model.User.UserFactory.createUser("hi!", "hi!", userType16, "", "", userList34);
        model.User.User user40 = model.User.UserFactory.createUser("hi!", "", userType11, "", "hi!", userList34);
        model.User.User user41 = model.User.UserFactory.createUser("hi!", "", userType6, "hi!", "hi!", userList34);
        model.User.User user42 = model.User.UserFactory.createLabManager("", "", "", "hi!", userList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        model.User.UserType userType6 = null;
        model.User.UserType userType19 = null;
        model.User.UserType userType28 = null;
        model.User.UserType userType37 = null;
        model.User.User[] userArray40 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList41 = new java.util.ArrayList<model.User.User>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList41, userArray40);
        model.User.User user43 = model.User.UserFactory.createUser("hi!", "", userType37, "", "hi!", userList41);
        model.User.User user44 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList41);
        model.User.User user45 = model.User.UserFactory.createUser("hi!", "", userType28, "hi!", "", userList41);
        model.User.User user46 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList41);
        model.User.User user47 = model.User.UserFactory.createUser("hi!", "hi!", userType19, "", "", userList41);
        model.User.User user48 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "hi!", userList41);
        model.User.User user49 = model.User.UserFactory.createLabManager("", "hi!", "hi!", "hi!", userList41);
        model.User.User user50 = model.User.UserFactory.createUser("", "hi!", userType6, "", "", userList41);
        model.User.User user51 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        model.User.UserType userType2 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType21 = null;
        model.User.UserType userType30 = null;
        model.User.User[] userArray33 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList34 = new java.util.ArrayList<model.User.User>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList34, userArray33);
        model.User.User user36 = model.User.UserFactory.createUser("hi!", "", userType30, "", "hi!", userList34);
        model.User.User user37 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList34);
        model.User.User user38 = model.User.UserFactory.createUser("hi!", "hi!", userType21, "hi!", "hi!", userList34);
        model.User.User user39 = model.User.UserFactory.createUser("hi!", "hi!", userType16, "hi!", "", userList34);
        model.User.User user40 = model.User.UserFactory.createUser("hi!", "", userType11, "", "", userList34);
        model.User.User user41 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList34);
        model.User.User user42 = model.User.UserFactory.createUser("", "", userType2, "", "hi!", userList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        model.User.UserType userType6 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType29 = null;
        model.User.UserType userType38 = null;
        model.User.UserType userType47 = null;
        model.User.User[] userArray50 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList51 = new java.util.ArrayList<model.User.User>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList51, userArray50);
        model.User.User user53 = model.User.UserFactory.createUser("hi!", "", userType47, "", "hi!", userList51);
        model.User.User user54 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList51);
        model.User.User user55 = model.User.UserFactory.createUser("hi!", "", userType38, "hi!", "", userList51);
        model.User.User user56 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList51);
        model.User.User user57 = model.User.UserFactory.createUser("hi!", "", userType29, "hi!", "", userList51);
        model.User.User user58 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList51);
        model.User.User user59 = model.User.UserFactory.createUser("hi!", "hi!", userType20, "", "", userList51);
        model.User.User user60 = model.User.UserFactory.createUser("", "hi!", userType15, "", "hi!", userList51);
        model.User.User user61 = model.User.UserFactory.createLabManager("hi!", "", "", "hi!", userList51);
        model.User.User user62 = model.User.UserFactory.createUser("", "hi!", userType6, "hi!", "", userList51);
        model.User.User user63 = model.User.UserFactory.createLabManager("", "", "", "", userList51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user63);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        model.User.UserType userType10 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType24 = null;
        model.User.UserType userType33 = null;
        model.User.UserType userType42 = null;
        model.User.User[] userArray45 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList46 = new java.util.ArrayList<model.User.User>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList46, userArray45);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "", userType42, "", "hi!", userList46);
        model.User.User user49 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList46);
        model.User.User user50 = model.User.UserFactory.createUser("hi!", "", userType33, "hi!", "", userList46);
        model.User.User user51 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList46);
        model.User.User user52 = model.User.UserFactory.createUser("hi!", "", userType24, "hi!", "", userList46);
        model.User.User user53 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList46);
        model.User.User user54 = model.User.UserFactory.createUser("hi!", "hi!", userType15, "", "", userList46);
        model.User.User user55 = model.User.UserFactory.createUser("", "", userType10, "", "", userList46);
        model.User.User user56 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList46);
        model.User.User user57 = model.User.UserFactory.createLabManager("", "", "hi!", "", userList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType21 = null;
        model.User.UserType userType26 = null;
        model.User.UserType userType35 = null;
        model.User.User[] userArray38 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList39 = new java.util.ArrayList<model.User.User>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList39, userArray38);
        model.User.User user41 = model.User.UserFactory.createUser("hi!", "", userType35, "", "hi!", userList39);
        model.User.User user42 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList39);
        model.User.User user43 = model.User.UserFactory.createUser("hi!", "", userType26, "hi!", "", userList39);
        model.User.User user44 = model.User.UserFactory.createUser("hi!", "hi!", userType21, "", "", userList39);
        model.User.User user45 = model.User.UserFactory.createUser("hi!", "", userType16, "", "hi!", userList39);
        model.User.User user46 = model.User.UserFactory.createUser("hi!", "hi!", userType11, "", "", userList39);
        model.User.User user47 = model.User.UserFactory.createUser("hi!", "hi!", userType6, "hi!", "", userList39);
        model.User.User user48 = model.User.UserFactory.createLabManager("hi!", "", "", "hi!", userList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType24 = null;
        model.User.UserType userType33 = null;
        model.User.UserType userType42 = null;
        model.User.User[] userArray45 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList46 = new java.util.ArrayList<model.User.User>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList46, userArray45);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "", userType42, "", "hi!", userList46);
        model.User.User user49 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList46);
        model.User.User user50 = model.User.UserFactory.createUser("hi!", "", userType33, "hi!", "", userList46);
        model.User.User user51 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList46);
        model.User.User user52 = model.User.UserFactory.createUser("hi!", "hi!", userType24, "", "", userList46);
        model.User.User user53 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList46);
        model.User.User user54 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "hi!", userList46);
        model.User.User user55 = model.User.UserFactory.createLabManager("hi!", "", "hi!", "hi!", userList46);
        model.User.User user56 = model.User.UserFactory.createUser("hi!", "", userType7, "", "", userList46);
        model.User.User user57 = model.User.UserFactory.createUser("", "hi!", userType2, "", "hi!", userList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType12 = null;
        model.User.UserType userType17 = null;
        model.User.UserType userType22 = null;
        model.User.UserType userType35 = null;
        model.User.UserType userType44 = null;
        model.User.UserType userType53 = null;
        model.User.User[] userArray56 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList57 = new java.util.ArrayList<model.User.User>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList57, userArray56);
        model.User.User user59 = model.User.UserFactory.createUser("hi!", "", userType53, "", "hi!", userList57);
        model.User.User user60 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList57);
        model.User.User user61 = model.User.UserFactory.createUser("hi!", "", userType44, "hi!", "", userList57);
        model.User.User user62 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList57);
        model.User.User user63 = model.User.UserFactory.createUser("hi!", "hi!", userType35, "", "", userList57);
        model.User.User user64 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList57);
        model.User.User user65 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "hi!", userList57);
        model.User.User user66 = model.User.UserFactory.createUser("", "hi!", userType22, "", "hi!", userList57);
        model.User.User user67 = model.User.UserFactory.createUser("", "", userType17, "", "", userList57);
        model.User.User user68 = model.User.UserFactory.createUser("", "hi!", userType12, "", "", userList57);
        model.User.User user69 = model.User.UserFactory.createUser("", "", userType7, "hi!", "", userList57);
        model.User.User user70 = model.User.UserFactory.createUser("", "hi!", userType2, "hi!", "", userList57);
        java.lang.Class<?> wildcardClass71 = userList57.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass71);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType21 = null;
        model.User.UserType userType26 = null;
        model.User.UserType userType35 = null;
        model.User.User[] userArray38 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList39 = new java.util.ArrayList<model.User.User>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList39, userArray38);
        model.User.User user41 = model.User.UserFactory.createUser("hi!", "", userType35, "", "hi!", userList39);
        model.User.User user42 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList39);
        model.User.User user43 = model.User.UserFactory.createUser("hi!", "", userType26, "hi!", "", userList39);
        model.User.User user44 = model.User.UserFactory.createUser("hi!", "", userType21, "hi!", "", userList39);
        model.User.User user45 = model.User.UserFactory.createUser("hi!", "hi!", userType16, "", "", userList39);
        model.User.User user46 = model.User.UserFactory.createLabManager("hi!", "", "", "hi!", userList39);
        model.User.User user47 = model.User.UserFactory.createUser("hi!", "hi!", userType7, "", "", userList39);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "hi!", userType2, "hi!", "", userList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType25 = null;
        model.User.User[] userArray28 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList29 = new java.util.ArrayList<model.User.User>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList29, userArray28);
        model.User.User user31 = model.User.UserFactory.createUser("hi!", "", userType25, "", "hi!", userList29);
        model.User.User user32 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList29);
        model.User.User user33 = model.User.UserFactory.createUser("hi!", "", userType16, "hi!", "", userList29);
        model.User.User user34 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList29);
        model.User.User user35 = model.User.UserFactory.createUser("hi!", "", userType7, "hi!", "", userList29);
        model.User.User user36 = model.User.UserFactory.createUser("", "", userType2, "", "hi!", userList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType12 = null;
        model.User.UserType userType29 = null;
        model.User.UserType userType38 = null;
        model.User.UserType userType47 = null;
        model.User.User[] userArray50 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList51 = new java.util.ArrayList<model.User.User>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList51, userArray50);
        model.User.User user53 = model.User.UserFactory.createUser("hi!", "", userType47, "", "hi!", userList51);
        model.User.User user54 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList51);
        model.User.User user55 = model.User.UserFactory.createUser("hi!", "", userType38, "hi!", "", userList51);
        model.User.User user56 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList51);
        model.User.User user57 = model.User.UserFactory.createUser("hi!", "hi!", userType29, "", "", userList51);
        model.User.User user58 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList51);
        model.User.User user59 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "hi!", userList51);
        model.User.User user60 = model.User.UserFactory.createLabManager("hi!", "", "hi!", "hi!", userList51);
        model.User.User user61 = model.User.UserFactory.createUser("hi!", "", userType12, "", "hi!", userList51);
        model.User.User user62 = model.User.UserFactory.createUser("hi!", "", userType7, "hi!", "hi!", userList51);
        model.User.User user63 = model.User.UserFactory.createUser("hi!", "hi!", userType2, "", "", userList51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user63);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType12 = null;
        model.User.UserType userType25 = null;
        model.User.UserType userType34 = null;
        model.User.UserType userType43 = null;
        model.User.User[] userArray46 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList47 = new java.util.ArrayList<model.User.User>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList47, userArray46);
        model.User.User user49 = model.User.UserFactory.createUser("hi!", "", userType43, "", "hi!", userList47);
        model.User.User user50 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList47);
        model.User.User user51 = model.User.UserFactory.createUser("hi!", "", userType34, "hi!", "", userList47);
        model.User.User user52 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList47);
        model.User.User user53 = model.User.UserFactory.createUser("hi!", "hi!", userType25, "", "", userList47);
        model.User.User user54 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList47);
        model.User.User user55 = model.User.UserFactory.createLabManager("", "", "", "", userList47);
        model.User.User user56 = model.User.UserFactory.createUser("hi!", "hi!", userType12, "", "", userList47);
        model.User.User user57 = model.User.UserFactory.createUser("", "", userType7, "hi!", "", userList47);
        model.User.User user58 = model.User.UserFactory.createUser("", "hi!", userType2, "hi!", "", userList47);
        java.lang.Class<?> wildcardClass59 = user58.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        model.User.UserType userType10 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType24 = null;
        model.User.UserType userType33 = null;
        model.User.UserType userType42 = null;
        model.User.User[] userArray45 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList46 = new java.util.ArrayList<model.User.User>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList46, userArray45);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "", userType42, "", "hi!", userList46);
        model.User.User user49 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList46);
        model.User.User user50 = model.User.UserFactory.createUser("hi!", "", userType33, "hi!", "", userList46);
        model.User.User user51 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList46);
        model.User.User user52 = model.User.UserFactory.createUser("hi!", "", userType24, "hi!", "", userList46);
        model.User.User user53 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList46);
        model.User.User user54 = model.User.UserFactory.createUser("hi!", "hi!", userType15, "", "", userList46);
        model.User.User user55 = model.User.UserFactory.createUser("", "", userType10, "", "", userList46);
        model.User.User user56 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList46);
        model.User.User user57 = model.User.UserFactory.createLabManager("hi!", "", "", "hi!", userList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType29 = null;
        model.User.User[] userArray32 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList33 = new java.util.ArrayList<model.User.User>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList33, userArray32);
        model.User.User user35 = model.User.UserFactory.createUser("hi!", "", userType29, "", "hi!", userList33);
        model.User.User user36 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList33);
        model.User.User user37 = model.User.UserFactory.createUser("hi!", "", userType20, "hi!", "", userList33);
        model.User.User user38 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList33);
        model.User.User user39 = model.User.UserFactory.createUser("hi!", "", userType11, "hi!", "", userList33);
        model.User.User user40 = model.User.UserFactory.createUser("", "", userType6, "hi!", "hi!", userList33);
        model.User.User user41 = model.User.UserFactory.createLabManager("", "", "", "hi!", userList33);
        java.lang.Class<?> wildcardClass42 = userList33.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        model.User.UserType userType2 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType29 = null;
        model.User.User[] userArray32 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList33 = new java.util.ArrayList<model.User.User>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList33, userArray32);
        model.User.User user35 = model.User.UserFactory.createUser("hi!", "", userType29, "", "hi!", userList33);
        model.User.User user36 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList33);
        model.User.User user37 = model.User.UserFactory.createUser("hi!", "", userType20, "hi!", "", userList33);
        model.User.User user38 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList33);
        model.User.User user39 = model.User.UserFactory.createUser("hi!", "", userType11, "hi!", "", userList33);
        model.User.User user40 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList33);
        model.User.User user41 = model.User.UserFactory.createUser("hi!", "hi!", userType2, "", "hi!", userList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        model.User.UserType userType10 = null;
        model.User.UserType userType23 = null;
        model.User.UserType userType32 = null;
        model.User.UserType userType41 = null;
        model.User.User[] userArray44 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList45 = new java.util.ArrayList<model.User.User>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList45, userArray44);
        model.User.User user47 = model.User.UserFactory.createUser("hi!", "", userType41, "", "hi!", userList45);
        model.User.User user48 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList45);
        model.User.User user49 = model.User.UserFactory.createUser("hi!", "", userType32, "hi!", "", userList45);
        model.User.User user50 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList45);
        model.User.User user51 = model.User.UserFactory.createUser("hi!", "hi!", userType23, "", "", userList45);
        model.User.User user52 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList45);
        model.User.User user53 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList45);
        model.User.User user54 = model.User.UserFactory.createUser("", "", userType10, "hi!", "hi!", userList45);
        model.User.User user55 = model.User.UserFactory.createLabManager("hi!", "", "hi!", "hi!", userList45);
        model.User.User user56 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType12 = null;
        model.User.UserType userType21 = null;
        model.User.UserType userType26 = null;
        model.User.UserType userType35 = null;
        model.User.UserType userType44 = null;
        model.User.UserType userType53 = null;
        model.User.User[] userArray56 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList57 = new java.util.ArrayList<model.User.User>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList57, userArray56);
        model.User.User user59 = model.User.UserFactory.createUser("hi!", "", userType53, "", "hi!", userList57);
        model.User.User user60 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList57);
        model.User.User user61 = model.User.UserFactory.createUser("hi!", "", userType44, "hi!", "", userList57);
        model.User.User user62 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList57);
        model.User.User user63 = model.User.UserFactory.createUser("hi!", "", userType35, "hi!", "", userList57);
        model.User.User user64 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList57);
        model.User.User user65 = model.User.UserFactory.createUser("hi!", "hi!", userType26, "", "", userList57);
        model.User.User user66 = model.User.UserFactory.createUser("", "hi!", userType21, "", "hi!", userList57);
        model.User.User user67 = model.User.UserFactory.createLabManager("hi!", "", "", "hi!", userList57);
        model.User.User user68 = model.User.UserFactory.createUser("hi!", "", userType12, "hi!", "hi!", userList57);
        model.User.User user69 = model.User.UserFactory.createUser("", "", userType7, "hi!", "", userList57);
        model.User.User user70 = model.User.UserFactory.createUser("hi!", "hi!", userType2, "", "", userList57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user70);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType12 = null;
        model.User.UserType userType17 = null;
        model.User.UserType userType30 = null;
        model.User.UserType userType39 = null;
        model.User.UserType userType48 = null;
        model.User.User[] userArray51 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList52 = new java.util.ArrayList<model.User.User>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList52, userArray51);
        model.User.User user54 = model.User.UserFactory.createUser("hi!", "", userType48, "", "hi!", userList52);
        model.User.User user55 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList52);
        model.User.User user56 = model.User.UserFactory.createUser("hi!", "", userType39, "hi!", "", userList52);
        model.User.User user57 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList52);
        model.User.User user58 = model.User.UserFactory.createUser("hi!", "hi!", userType30, "", "", userList52);
        model.User.User user59 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList52);
        model.User.User user60 = model.User.UserFactory.createLabManager("", "", "", "", userList52);
        model.User.User user61 = model.User.UserFactory.createUser("hi!", "hi!", userType17, "", "", userList52);
        model.User.User user62 = model.User.UserFactory.createUser("", "", userType12, "hi!", "", userList52);
        model.User.User user63 = model.User.UserFactory.createUser("hi!", "hi!", userType7, "", "", userList52);
        model.User.User user64 = model.User.UserFactory.createUser("", "hi!", userType2, "", "hi!", userList52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user64);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        model.User.UserType userType10 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType24 = null;
        model.User.UserType userType33 = null;
        model.User.UserType userType42 = null;
        model.User.User[] userArray45 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList46 = new java.util.ArrayList<model.User.User>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList46, userArray45);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "", userType42, "", "hi!", userList46);
        model.User.User user49 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList46);
        model.User.User user50 = model.User.UserFactory.createUser("hi!", "", userType33, "hi!", "", userList46);
        model.User.User user51 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList46);
        model.User.User user52 = model.User.UserFactory.createUser("hi!", "", userType24, "hi!", "", userList46);
        model.User.User user53 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList46);
        model.User.User user54 = model.User.UserFactory.createUser("hi!", "hi!", userType15, "", "", userList46);
        model.User.User user55 = model.User.UserFactory.createUser("", "", userType10, "", "", userList46);
        model.User.User user56 = model.User.UserFactory.createLabManager("", "", "", "", userList46);
        model.User.User user57 = model.User.UserFactory.createLabManager("hi!", "", "", "hi!", userList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        model.User.UserType userType6 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType29 = null;
        model.User.UserType userType38 = null;
        model.User.User[] userArray41 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList42 = new java.util.ArrayList<model.User.User>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList42, userArray41);
        model.User.User user44 = model.User.UserFactory.createUser("hi!", "", userType38, "", "hi!", userList42);
        model.User.User user45 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList42);
        model.User.User user46 = model.User.UserFactory.createUser("hi!", "", userType29, "hi!", "", userList42);
        model.User.User user47 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList42);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "hi!", userType20, "", "", userList42);
        model.User.User user49 = model.User.UserFactory.createUser("hi!", "", userType15, "hi!", "hi!", userList42);
        model.User.User user50 = model.User.UserFactory.createLabManager("", "", "hi!", "hi!", userList42);
        model.User.User user51 = model.User.UserFactory.createUser("hi!", "", userType6, "hi!", "hi!", userList42);
        model.User.User user52 = model.User.UserFactory.createLabManager("", "hi!", "hi!", "hi!", userList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType29 = null;
        model.User.UserType userType38 = null;
        model.User.UserType userType47 = null;
        model.User.User[] userArray50 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList51 = new java.util.ArrayList<model.User.User>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList51, userArray50);
        model.User.User user53 = model.User.UserFactory.createUser("hi!", "", userType47, "", "hi!", userList51);
        model.User.User user54 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList51);
        model.User.User user55 = model.User.UserFactory.createUser("hi!", "", userType38, "hi!", "", userList51);
        model.User.User user56 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList51);
        model.User.User user57 = model.User.UserFactory.createUser("hi!", "hi!", userType29, "", "", userList51);
        model.User.User user58 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList51);
        model.User.User user59 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "hi!", userList51);
        model.User.User user60 = model.User.UserFactory.createUser("", "hi!", userType16, "", "hi!", userList51);
        model.User.User user61 = model.User.UserFactory.createUser("hi!", "", userType11, "hi!", "", userList51);
        model.User.User user62 = model.User.UserFactory.createUser("", "", userType6, "", "hi!", userList51);
        model.User.User user63 = model.User.UserFactory.createLabManager("", "", "", "", userList51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user63);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType28 = null;
        model.User.UserType userType37 = null;
        model.User.UserType userType46 = null;
        model.User.User[] userArray49 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList50 = new java.util.ArrayList<model.User.User>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList50, userArray49);
        model.User.User user52 = model.User.UserFactory.createUser("hi!", "", userType46, "", "hi!", userList50);
        model.User.User user53 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList50);
        model.User.User user54 = model.User.UserFactory.createUser("hi!", "", userType37, "hi!", "", userList50);
        model.User.User user55 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList50);
        model.User.User user56 = model.User.UserFactory.createUser("hi!", "hi!", userType28, "", "", userList50);
        model.User.User user57 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList50);
        model.User.User user58 = model.User.UserFactory.createLabManager("", "", "hi!", "hi!", userList50);
        model.User.User user59 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "", userList50);
        model.User.User user60 = model.User.UserFactory.createUser("hi!", "", userType11, "hi!", "hi!", userList50);
        model.User.User user61 = model.User.UserFactory.createUser("hi!", "hi!", userType6, "hi!", "hi!", userList50);
        model.User.User user62 = model.User.UserFactory.createLabManager("", "hi!", "hi!", "", userList50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user62);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType25 = null;
        model.User.User[] userArray28 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList29 = new java.util.ArrayList<model.User.User>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList29, userArray28);
        model.User.User user31 = model.User.UserFactory.createUser("hi!", "", userType25, "", "hi!", userList29);
        model.User.User user32 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList29);
        model.User.User user33 = model.User.UserFactory.createUser("hi!", "", userType16, "hi!", "", userList29);
        model.User.User user34 = model.User.UserFactory.createUser("hi!", "", userType11, "hi!", "", userList29);
        model.User.User user35 = model.User.UserFactory.createUser("hi!", "hi!", userType6, "", "", userList29);
        model.User.User user36 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "hi!", userList29);
        java.lang.Class<?> wildcardClass37 = user36.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        model.User.UserType userType6 = null;
        model.User.UserType userType19 = null;
        model.User.UserType userType32 = null;
        model.User.UserType userType41 = null;
        model.User.UserType userType50 = null;
        model.User.User[] userArray53 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList54 = new java.util.ArrayList<model.User.User>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList54, userArray53);
        model.User.User user56 = model.User.UserFactory.createUser("hi!", "", userType50, "", "hi!", userList54);
        model.User.User user57 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList54);
        model.User.User user58 = model.User.UserFactory.createUser("hi!", "", userType41, "hi!", "", userList54);
        model.User.User user59 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList54);
        model.User.User user60 = model.User.UserFactory.createUser("hi!", "hi!", userType32, "", "", userList54);
        model.User.User user61 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList54);
        model.User.User user62 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList54);
        model.User.User user63 = model.User.UserFactory.createUser("", "", userType19, "hi!", "", userList54);
        model.User.User user64 = model.User.UserFactory.createLabManager("", "", "hi!", "", userList54);
        model.User.User user65 = model.User.UserFactory.createLabManager("", "", "hi!", "", userList54);
        model.User.User user66 = model.User.UserFactory.createUser("", "", userType6, "hi!", "", userList54);
        model.User.User user67 = model.User.UserFactory.createLabManager("", "hi!", "hi!", "", userList54);
        java.lang.Class<?> wildcardClass68 = userList54.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType16 = null;
        model.User.User[] userArray19 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList20 = new java.util.ArrayList<model.User.User>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList20, userArray19);
        model.User.User user22 = model.User.UserFactory.createUser("hi!", "", userType16, "", "hi!", userList20);
        model.User.User user23 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList20);
        model.User.User user24 = model.User.UserFactory.createUser("hi!", "", userType7, "hi!", "", userList20);
        model.User.User user25 = model.User.UserFactory.createUser("hi!", "hi!", userType2, "", "hi!", userList20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray19);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user25);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        model.User.UserType userType6 = null;
        model.User.UserType userType19 = null;
        model.User.UserType userType32 = null;
        model.User.UserType userType41 = null;
        model.User.UserType userType50 = null;
        model.User.User[] userArray53 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList54 = new java.util.ArrayList<model.User.User>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList54, userArray53);
        model.User.User user56 = model.User.UserFactory.createUser("hi!", "", userType50, "", "hi!", userList54);
        model.User.User user57 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList54);
        model.User.User user58 = model.User.UserFactory.createUser("hi!", "", userType41, "hi!", "", userList54);
        model.User.User user59 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList54);
        model.User.User user60 = model.User.UserFactory.createUser("hi!", "hi!", userType32, "", "", userList54);
        model.User.User user61 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList54);
        model.User.User user62 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList54);
        model.User.User user63 = model.User.UserFactory.createUser("", "", userType19, "hi!", "", userList54);
        model.User.User user64 = model.User.UserFactory.createLabManager("", "", "hi!", "", userList54);
        model.User.User user65 = model.User.UserFactory.createLabManager("", "", "hi!", "", userList54);
        model.User.User user66 = model.User.UserFactory.createUser("", "", userType6, "hi!", "", userList54);
        model.User.User user67 = model.User.UserFactory.createLabManager("", "hi!", "hi!", "", userList54);
        java.lang.Class<?> wildcardClass68 = user67.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType24 = null;
        model.User.UserType userType33 = null;
        model.User.UserType userType42 = null;
        model.User.User[] userArray45 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList46 = new java.util.ArrayList<model.User.User>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList46, userArray45);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "", userType42, "", "hi!", userList46);
        model.User.User user49 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList46);
        model.User.User user50 = model.User.UserFactory.createUser("hi!", "", userType33, "hi!", "", userList46);
        model.User.User user51 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList46);
        model.User.User user52 = model.User.UserFactory.createUser("hi!", "hi!", userType24, "", "", userList46);
        model.User.User user53 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList46);
        model.User.User user54 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList46);
        model.User.User user55 = model.User.UserFactory.createUser("", "", userType11, "hi!", "hi!", userList46);
        model.User.User user56 = model.User.UserFactory.createUser("", "hi!", userType6, "hi!", "", userList46);
        model.User.User user57 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        model.User.UserType userType10 = null;
        model.User.UserType userType19 = null;
        model.User.UserType userType28 = null;
        model.User.UserType userType37 = null;
        model.User.UserType userType46 = null;
        model.User.User[] userArray49 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList50 = new java.util.ArrayList<model.User.User>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList50, userArray49);
        model.User.User user52 = model.User.UserFactory.createUser("hi!", "", userType46, "", "hi!", userList50);
        model.User.User user53 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList50);
        model.User.User user54 = model.User.UserFactory.createUser("hi!", "", userType37, "hi!", "", userList50);
        model.User.User user55 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList50);
        model.User.User user56 = model.User.UserFactory.createUser("hi!", "hi!", userType28, "", "", userList50);
        model.User.User user57 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList50);
        model.User.User user58 = model.User.UserFactory.createUser("hi!", "", userType19, "hi!", "hi!", userList50);
        model.User.User user59 = model.User.UserFactory.createLabManager("", "", "", "", userList50);
        model.User.User user60 = model.User.UserFactory.createUser("hi!", "", userType10, "hi!", "hi!", userList50);
        model.User.User user61 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList50);
        model.User.User user62 = model.User.UserFactory.createLabManager("", "", "hi!", "", userList50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user62);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType12 = null;
        model.User.UserType userType17 = null;
        model.User.UserType userType22 = null;
        model.User.UserType userType31 = null;
        model.User.User[] userArray34 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList35 = new java.util.ArrayList<model.User.User>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList35, userArray34);
        model.User.User user37 = model.User.UserFactory.createUser("hi!", "", userType31, "", "hi!", userList35);
        model.User.User user38 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList35);
        model.User.User user39 = model.User.UserFactory.createUser("hi!", "", userType22, "hi!", "", userList35);
        model.User.User user40 = model.User.UserFactory.createUser("hi!", "hi!", userType17, "", "", userList35);
        model.User.User user41 = model.User.UserFactory.createUser("hi!", "", userType12, "", "hi!", userList35);
        model.User.User user42 = model.User.UserFactory.createUser("hi!", "hi!", userType7, "", "", userList35);
        model.User.User user43 = model.User.UserFactory.createUser("hi!", "hi!", userType2, "hi!", "", userList35);
        java.lang.Class<?> wildcardClass44 = user43.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType25 = null;
        model.User.User[] userArray28 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList29 = new java.util.ArrayList<model.User.User>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList29, userArray28);
        model.User.User user31 = model.User.UserFactory.createUser("hi!", "", userType25, "", "hi!", userList29);
        model.User.User user32 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList29);
        model.User.User user33 = model.User.UserFactory.createUser("hi!", "", userType16, "hi!", "", userList29);
        model.User.User user34 = model.User.UserFactory.createUser("", "", userType11, "", "", userList29);
        model.User.User user35 = model.User.UserFactory.createUser("hi!", "hi!", userType6, "", "hi!", userList29);
        model.User.User user36 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "hi!", userList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        model.User.UserType userType10 = null;
        model.User.UserType userType19 = null;
        model.User.UserType userType28 = null;
        model.User.UserType userType37 = null;
        model.User.User[] userArray40 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList41 = new java.util.ArrayList<model.User.User>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList41, userArray40);
        model.User.User user43 = model.User.UserFactory.createUser("hi!", "", userType37, "", "hi!", userList41);
        model.User.User user44 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList41);
        model.User.User user45 = model.User.UserFactory.createUser("hi!", "", userType28, "hi!", "", userList41);
        model.User.User user46 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList41);
        model.User.User user47 = model.User.UserFactory.createUser("hi!", "", userType19, "hi!", "", userList41);
        model.User.User user48 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList41);
        model.User.User user49 = model.User.UserFactory.createUser("hi!", "hi!", userType10, "", "", userList41);
        model.User.User user50 = model.User.UserFactory.createLabManager("", "hi!", "hi!", "hi!", userList41);
        model.User.User user51 = model.User.UserFactory.createLabManager("", "", "", "hi!", userList41);
        java.lang.Class<?> wildcardClass52 = user51.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType24 = null;
        model.User.UserType userType33 = null;
        model.User.UserType userType42 = null;
        model.User.User[] userArray45 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList46 = new java.util.ArrayList<model.User.User>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList46, userArray45);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "", userType42, "", "hi!", userList46);
        model.User.User user49 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList46);
        model.User.User user50 = model.User.UserFactory.createUser("hi!", "", userType33, "hi!", "", userList46);
        model.User.User user51 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList46);
        model.User.User user52 = model.User.UserFactory.createUser("hi!", "hi!", userType24, "", "", userList46);
        model.User.User user53 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList46);
        model.User.User user54 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList46);
        model.User.User user55 = model.User.UserFactory.createUser("", "", userType11, "hi!", "hi!", userList46);
        model.User.User user56 = model.User.UserFactory.createUser("", "hi!", userType6, "hi!", "hi!", userList46);
        model.User.User user57 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList46);
        java.lang.Class<?> wildcardClass58 = user57.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType24 = null;
        model.User.UserType userType33 = null;
        model.User.UserType userType42 = null;
        model.User.User[] userArray45 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList46 = new java.util.ArrayList<model.User.User>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList46, userArray45);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "", userType42, "", "hi!", userList46);
        model.User.User user49 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList46);
        model.User.User user50 = model.User.UserFactory.createUser("hi!", "", userType33, "hi!", "", userList46);
        model.User.User user51 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList46);
        model.User.User user52 = model.User.UserFactory.createUser("hi!", "hi!", userType24, "", "", userList46);
        model.User.User user53 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList46);
        model.User.User user54 = model.User.UserFactory.createLabManager("", "", "", "", userList46);
        model.User.User user55 = model.User.UserFactory.createUser("hi!", "hi!", userType11, "", "", userList46);
        model.User.User user56 = model.User.UserFactory.createUser("", "", userType6, "hi!", "", userList46);
        model.User.User user57 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType29 = null;
        model.User.UserType userType38 = null;
        model.User.User[] userArray41 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList42 = new java.util.ArrayList<model.User.User>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList42, userArray41);
        model.User.User user44 = model.User.UserFactory.createUser("hi!", "", userType38, "", "hi!", userList42);
        model.User.User user45 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList42);
        model.User.User user46 = model.User.UserFactory.createUser("hi!", "", userType29, "hi!", "", userList42);
        model.User.User user47 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList42);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "hi!", userType20, "", "", userList42);
        model.User.User user49 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList42);
        model.User.User user50 = model.User.UserFactory.createLabManager("", "", "", "", userList42);
        model.User.User user51 = model.User.UserFactory.createUser("hi!", "hi!", userType7, "", "", userList42);
        model.User.User user52 = model.User.UserFactory.createUser("", "", userType2, "hi!", "", userList42);
        java.lang.Class<?> wildcardClass53 = user52.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        model.User.UserType userType22 = null;
        model.User.UserType userType31 = null;
        model.User.UserType userType40 = null;
        model.User.User[] userArray43 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList44 = new java.util.ArrayList<model.User.User>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList44, userArray43);
        model.User.User user46 = model.User.UserFactory.createUser("hi!", "", userType40, "", "hi!", userList44);
        model.User.User user47 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList44);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "", userType31, "hi!", "", userList44);
        model.User.User user49 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList44);
        model.User.User user50 = model.User.UserFactory.createUser("hi!", "hi!", userType22, "", "", userList44);
        model.User.User user51 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList44);
        model.User.User user52 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList44);
        model.User.User user53 = model.User.UserFactory.createLabManager("hi!", "", "hi!", "", userList44);
        model.User.User user54 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "hi!", userList44);
        model.User.User user55 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "hi!", userList44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType29 = null;
        model.User.UserType userType38 = null;
        model.User.UserType userType47 = null;
        model.User.User[] userArray50 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList51 = new java.util.ArrayList<model.User.User>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList51, userArray50);
        model.User.User user53 = model.User.UserFactory.createUser("hi!", "", userType47, "", "hi!", userList51);
        model.User.User user54 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList51);
        model.User.User user55 = model.User.UserFactory.createUser("hi!", "", userType38, "hi!", "", userList51);
        model.User.User user56 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList51);
        model.User.User user57 = model.User.UserFactory.createUser("hi!", "hi!", userType29, "", "", userList51);
        model.User.User user58 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList51);
        model.User.User user59 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "hi!", userList51);
        model.User.User user60 = model.User.UserFactory.createUser("", "hi!", userType16, "", "hi!", userList51);
        model.User.User user61 = model.User.UserFactory.createUser("hi!", "", userType11, "hi!", "", userList51);
        model.User.User user62 = model.User.UserFactory.createUser("", "", userType6, "", "hi!", userList51);
        model.User.User user63 = model.User.UserFactory.createLabManager("hi!", "", "hi!", "hi!", userList51);
        java.lang.Class<?> wildcardClass64 = userList51.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        model.User.UserType userType2 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType24 = null;
        model.User.UserType userType33 = null;
        model.User.User[] userArray36 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList37 = new java.util.ArrayList<model.User.User>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList37, userArray36);
        model.User.User user39 = model.User.UserFactory.createUser("hi!", "", userType33, "", "hi!", userList37);
        model.User.User user40 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList37);
        model.User.User user41 = model.User.UserFactory.createUser("hi!", "", userType24, "hi!", "", userList37);
        model.User.User user42 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList37);
        model.User.User user43 = model.User.UserFactory.createUser("hi!", "hi!", userType15, "", "", userList37);
        model.User.User user44 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList37);
        model.User.User user45 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList37);
        model.User.User user46 = model.User.UserFactory.createUser("hi!", "", userType2, "", "hi!", userList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        model.User.UserType userType10 = null;
        model.User.UserType userType23 = null;
        model.User.UserType userType32 = null;
        model.User.UserType userType41 = null;
        model.User.User[] userArray44 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList45 = new java.util.ArrayList<model.User.User>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList45, userArray44);
        model.User.User user47 = model.User.UserFactory.createUser("hi!", "", userType41, "", "hi!", userList45);
        model.User.User user48 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList45);
        model.User.User user49 = model.User.UserFactory.createUser("hi!", "", userType32, "hi!", "", userList45);
        model.User.User user50 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList45);
        model.User.User user51 = model.User.UserFactory.createUser("hi!", "hi!", userType23, "", "", userList45);
        model.User.User user52 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList45);
        model.User.User user53 = model.User.UserFactory.createLabManager("", "", "", "", userList45);
        model.User.User user54 = model.User.UserFactory.createUser("hi!", "hi!", userType10, "", "", userList45);
        model.User.User user55 = model.User.UserFactory.createLabManager("hi!", "", "hi!", "hi!", userList45);
        model.User.User user56 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        model.User.UserType userType2 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType24 = null;
        model.User.UserType userType33 = null;
        model.User.UserType userType42 = null;
        model.User.User[] userArray45 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList46 = new java.util.ArrayList<model.User.User>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList46, userArray45);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "", userType42, "", "hi!", userList46);
        model.User.User user49 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList46);
        model.User.User user50 = model.User.UserFactory.createUser("hi!", "", userType33, "hi!", "", userList46);
        model.User.User user51 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList46);
        model.User.User user52 = model.User.UserFactory.createUser("hi!", "hi!", userType24, "", "", userList46);
        model.User.User user53 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList46);
        model.User.User user54 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "hi!", userList46);
        model.User.User user55 = model.User.UserFactory.createUser("", "hi!", userType11, "", "", userList46);
        model.User.User user56 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList46);
        model.User.User user57 = model.User.UserFactory.createUser("", "hi!", userType2, "", "hi!", userList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        model.User.UserType userType2 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType25 = null;
        model.User.User[] userArray28 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList29 = new java.util.ArrayList<model.User.User>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList29, userArray28);
        model.User.User user31 = model.User.UserFactory.createUser("hi!", "", userType25, "", "hi!", userList29);
        model.User.User user32 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList29);
        model.User.User user33 = model.User.UserFactory.createUser("hi!", "", userType16, "hi!", "", userList29);
        model.User.User user34 = model.User.UserFactory.createUser("", "hi!", userType11, "hi!", "", userList29);
        model.User.User user35 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList29);
        model.User.User user36 = model.User.UserFactory.createUser("hi!", "hi!", userType2, "hi!", "hi!", userList29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        model.User.UserType userType10 = null;
        model.User.UserType userType19 = null;
        model.User.UserType userType28 = null;
        model.User.UserType userType37 = null;
        model.User.UserType userType46 = null;
        model.User.User[] userArray49 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList50 = new java.util.ArrayList<model.User.User>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList50, userArray49);
        model.User.User user52 = model.User.UserFactory.createUser("hi!", "", userType46, "", "hi!", userList50);
        model.User.User user53 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList50);
        model.User.User user54 = model.User.UserFactory.createUser("hi!", "", userType37, "hi!", "", userList50);
        model.User.User user55 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList50);
        model.User.User user56 = model.User.UserFactory.createUser("hi!", "hi!", userType28, "", "", userList50);
        model.User.User user57 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList50);
        model.User.User user58 = model.User.UserFactory.createUser("hi!", "", userType19, "hi!", "hi!", userList50);
        model.User.User user59 = model.User.UserFactory.createLabManager("", "", "", "", userList50);
        model.User.User user60 = model.User.UserFactory.createUser("hi!", "", userType10, "hi!", "hi!", userList50);
        model.User.User user61 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList50);
        model.User.User user62 = model.User.UserFactory.createLabManager("hi!", "", "hi!", "hi!", userList50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user62);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType21 = null;
        model.User.UserType userType26 = null;
        model.User.UserType userType35 = null;
        model.User.User[] userArray38 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList39 = new java.util.ArrayList<model.User.User>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList39, userArray38);
        model.User.User user41 = model.User.UserFactory.createUser("hi!", "", userType35, "", "hi!", userList39);
        model.User.User user42 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList39);
        model.User.User user43 = model.User.UserFactory.createUser("hi!", "", userType26, "hi!", "", userList39);
        model.User.User user44 = model.User.UserFactory.createUser("hi!", "", userType21, "hi!", "", userList39);
        model.User.User user45 = model.User.UserFactory.createUser("hi!", "hi!", userType16, "", "", userList39);
        model.User.User user46 = model.User.UserFactory.createLabManager("hi!", "", "", "hi!", userList39);
        model.User.User user47 = model.User.UserFactory.createUser("", "hi!", userType7, "hi!", "", userList39);
        model.User.User user48 = model.User.UserFactory.createUser("", "hi!", userType2, "hi!", "", userList39);
        java.lang.Class<?> wildcardClass49 = user48.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType29 = null;
        model.User.UserType userType38 = null;
        model.User.User[] userArray41 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList42 = new java.util.ArrayList<model.User.User>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList42, userArray41);
        model.User.User user44 = model.User.UserFactory.createUser("hi!", "", userType38, "", "hi!", userList42);
        model.User.User user45 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList42);
        model.User.User user46 = model.User.UserFactory.createUser("hi!", "", userType29, "hi!", "", userList42);
        model.User.User user47 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList42);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "", userType20, "hi!", "", userList42);
        model.User.User user49 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList42);
        model.User.User user50 = model.User.UserFactory.createUser("hi!", "hi!", userType11, "", "", userList42);
        model.User.User user51 = model.User.UserFactory.createUser("", "", userType6, "", "", userList42);
        model.User.User user52 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType25 = null;
        model.User.UserType userType34 = null;
        model.User.User[] userArray37 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList38 = new java.util.ArrayList<model.User.User>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList38, userArray37);
        model.User.User user40 = model.User.UserFactory.createUser("hi!", "", userType34, "", "hi!", userList38);
        model.User.User user41 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList38);
        model.User.User user42 = model.User.UserFactory.createUser("hi!", "", userType25, "hi!", "", userList38);
        model.User.User user43 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList38);
        model.User.User user44 = model.User.UserFactory.createUser("hi!", "hi!", userType16, "", "", userList38);
        model.User.User user45 = model.User.UserFactory.createUser("hi!", "", userType11, "", "", userList38);
        model.User.User user46 = model.User.UserFactory.createUser("", "", userType6, "", "hi!", userList38);
        model.User.User user47 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        model.User.UserType userType10 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType29 = null;
        model.User.User[] userArray32 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList33 = new java.util.ArrayList<model.User.User>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList33, userArray32);
        model.User.User user35 = model.User.UserFactory.createUser("hi!", "", userType29, "", "hi!", userList33);
        model.User.User user36 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList33);
        model.User.User user37 = model.User.UserFactory.createUser("hi!", "", userType20, "hi!", "", userList33);
        model.User.User user38 = model.User.UserFactory.createUser("hi!", "", userType15, "hi!", "", userList33);
        model.User.User user39 = model.User.UserFactory.createUser("hi!", "hi!", userType10, "", "", userList33);
        model.User.User user40 = model.User.UserFactory.createLabManager("hi!", "", "", "hi!", userList33);
        model.User.User user41 = model.User.UserFactory.createLabManager("", "hi!", "hi!", "hi!", userList33);
        java.lang.Class<?> wildcardClass42 = userList33.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        model.User.UserType userType14 = null;
        model.User.UserType userType23 = null;
        model.User.UserType userType32 = null;
        model.User.User[] userArray35 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList36 = new java.util.ArrayList<model.User.User>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList36, userArray35);
        model.User.User user38 = model.User.UserFactory.createUser("hi!", "", userType32, "", "hi!", userList36);
        model.User.User user39 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList36);
        model.User.User user40 = model.User.UserFactory.createUser("hi!", "", userType23, "hi!", "", userList36);
        model.User.User user41 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList36);
        model.User.User user42 = model.User.UserFactory.createUser("hi!", "hi!", userType14, "", "", userList36);
        model.User.User user43 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList36);
        model.User.User user44 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList36);
        model.User.User user45 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "hi!", userList36);
        java.lang.Class<?> wildcardClass46 = user45.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType12 = null;
        model.User.UserType userType21 = null;
        model.User.User[] userArray24 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList25 = new java.util.ArrayList<model.User.User>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList25, userArray24);
        model.User.User user27 = model.User.UserFactory.createUser("hi!", "", userType21, "", "hi!", userList25);
        model.User.User user28 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList25);
        model.User.User user29 = model.User.UserFactory.createUser("hi!", "", userType12, "hi!", "", userList25);
        model.User.User user30 = model.User.UserFactory.createUser("hi!", "hi!", userType7, "", "", userList25);
        model.User.User user31 = model.User.UserFactory.createUser("", "", userType2, "hi!", "", userList25);
        java.lang.Class<?> wildcardClass32 = user31.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        model.User.UserType userType2 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType29 = null;
        model.User.User[] userArray32 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList33 = new java.util.ArrayList<model.User.User>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList33, userArray32);
        model.User.User user35 = model.User.UserFactory.createUser("hi!", "", userType29, "", "hi!", userList33);
        model.User.User user36 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList33);
        model.User.User user37 = model.User.UserFactory.createUser("hi!", "", userType20, "hi!", "", userList33);
        model.User.User user38 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList33);
        model.User.User user39 = model.User.UserFactory.createUser("hi!", "", userType11, "hi!", "", userList33);
        model.User.User user40 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "", userList33);
        model.User.User user41 = model.User.UserFactory.createUser("hi!", "", userType2, "hi!", "", userList33);
        java.lang.Class<?> wildcardClass42 = userList33.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        model.User.UserType userType6 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType24 = null;
        model.User.UserType userType33 = null;
        model.User.UserType userType42 = null;
        model.User.User[] userArray45 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList46 = new java.util.ArrayList<model.User.User>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList46, userArray45);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "", userType42, "", "hi!", userList46);
        model.User.User user49 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList46);
        model.User.User user50 = model.User.UserFactory.createUser("hi!", "", userType33, "hi!", "", userList46);
        model.User.User user51 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList46);
        model.User.User user52 = model.User.UserFactory.createUser("hi!", "hi!", userType24, "", "", userList46);
        model.User.User user53 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList46);
        model.User.User user54 = model.User.UserFactory.createUser("hi!", "", userType15, "hi!", "hi!", userList46);
        model.User.User user55 = model.User.UserFactory.createLabManager("", "", "", "", userList46);
        model.User.User user56 = model.User.UserFactory.createUser("hi!", "", userType6, "hi!", "hi!", userList46);
        model.User.User user57 = model.User.UserFactory.createLabManager("", "", "hi!", "", userList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        model.User.UserType userType14 = null;
        model.User.UserType userType23 = null;
        model.User.UserType userType32 = null;
        model.User.User[] userArray35 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList36 = new java.util.ArrayList<model.User.User>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList36, userArray35);
        model.User.User user38 = model.User.UserFactory.createUser("hi!", "", userType32, "", "hi!", userList36);
        model.User.User user39 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList36);
        model.User.User user40 = model.User.UserFactory.createUser("hi!", "", userType23, "hi!", "", userList36);
        model.User.User user41 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList36);
        model.User.User user42 = model.User.UserFactory.createUser("hi!", "hi!", userType14, "", "", userList36);
        model.User.User user43 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "hi!", userList36);
        model.User.User user44 = model.User.UserFactory.createLabManager("", "hi!", "hi!", "hi!", userList36);
        model.User.User user45 = model.User.UserFactory.createLabManager("", "", "hi!", "", userList36);
        java.lang.Class<?> wildcardClass46 = user45.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        model.User.UserType userType2 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType29 = null;
        model.User.UserType userType38 = null;
        model.User.UserType userType47 = null;
        model.User.User[] userArray50 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList51 = new java.util.ArrayList<model.User.User>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList51, userArray50);
        model.User.User user53 = model.User.UserFactory.createUser("hi!", "", userType47, "", "hi!", userList51);
        model.User.User user54 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList51);
        model.User.User user55 = model.User.UserFactory.createUser("hi!", "", userType38, "hi!", "", userList51);
        model.User.User user56 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList51);
        model.User.User user57 = model.User.UserFactory.createUser("hi!", "hi!", userType29, "", "", userList51);
        model.User.User user58 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList51);
        model.User.User user59 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList51);
        model.User.User user60 = model.User.UserFactory.createUser("", "", userType16, "hi!", "hi!", userList51);
        model.User.User user61 = model.User.UserFactory.createUser("", "hi!", userType11, "hi!", "hi!", userList51);
        model.User.User user62 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList51);
        model.User.User user63 = model.User.UserFactory.createUser("", "hi!", userType2, "", "", userList51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user63);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType12 = null;
        model.User.UserType userType25 = null;
        model.User.UserType userType34 = null;
        model.User.UserType userType43 = null;
        model.User.User[] userArray46 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList47 = new java.util.ArrayList<model.User.User>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList47, userArray46);
        model.User.User user49 = model.User.UserFactory.createUser("hi!", "", userType43, "", "hi!", userList47);
        model.User.User user50 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList47);
        model.User.User user51 = model.User.UserFactory.createUser("hi!", "", userType34, "hi!", "", userList47);
        model.User.User user52 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList47);
        model.User.User user53 = model.User.UserFactory.createUser("hi!", "hi!", userType25, "", "", userList47);
        model.User.User user54 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList47);
        model.User.User user55 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "hi!", userList47);
        model.User.User user56 = model.User.UserFactory.createUser("", "hi!", userType12, "", "hi!", userList47);
        model.User.User user57 = model.User.UserFactory.createUser("", "hi!", userType7, "", "hi!", userList47);
        model.User.User user58 = model.User.UserFactory.createUser("", "", userType2, "", "", userList47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user58);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        model.User.UserType userType2 = null;
        model.User.UserType userType27 = null;
        model.User.UserType userType36 = null;
        model.User.UserType userType45 = null;
        model.User.User[] userArray48 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList49 = new java.util.ArrayList<model.User.User>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList49, userArray48);
        model.User.User user51 = model.User.UserFactory.createUser("hi!", "", userType45, "", "hi!", userList49);
        model.User.User user52 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList49);
        model.User.User user53 = model.User.UserFactory.createUser("hi!", "", userType36, "hi!", "", userList49);
        model.User.User user54 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList49);
        model.User.User user55 = model.User.UserFactory.createUser("hi!", "hi!", userType27, "", "", userList49);
        model.User.User user56 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "hi!", userList49);
        model.User.User user57 = model.User.UserFactory.createLabManager("", "hi!", "hi!", "hi!", userList49);
        model.User.User user58 = model.User.UserFactory.createLabManager("", "", "hi!", "", userList49);
        model.User.User user59 = model.User.UserFactory.createLabManager("", "", "hi!", "hi!", userList49);
        model.User.User user60 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "hi!", userList49);
        model.User.User user61 = model.User.UserFactory.createUser("", "", userType2, "", "hi!", userList49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user61);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        model.User.UserType userType6 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType29 = null;
        model.User.UserType userType38 = null;
        model.User.UserType userType47 = null;
        model.User.User[] userArray50 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList51 = new java.util.ArrayList<model.User.User>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList51, userArray50);
        model.User.User user53 = model.User.UserFactory.createUser("hi!", "", userType47, "", "hi!", userList51);
        model.User.User user54 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList51);
        model.User.User user55 = model.User.UserFactory.createUser("hi!", "", userType38, "hi!", "", userList51);
        model.User.User user56 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList51);
        model.User.User user57 = model.User.UserFactory.createUser("hi!", "", userType29, "hi!", "", userList51);
        model.User.User user58 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList51);
        model.User.User user59 = model.User.UserFactory.createUser("hi!", "hi!", userType20, "", "", userList51);
        model.User.User user60 = model.User.UserFactory.createUser("", "", userType15, "", "", userList51);
        model.User.User user61 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList51);
        model.User.User user62 = model.User.UserFactory.createUser("", "hi!", userType6, "hi!", "", userList51);
        model.User.User user63 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "hi!", userList51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user63);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        model.User.UserType userType6 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType29 = null;
        model.User.UserType userType38 = null;
        model.User.UserType userType47 = null;
        model.User.User[] userArray50 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList51 = new java.util.ArrayList<model.User.User>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList51, userArray50);
        model.User.User user53 = model.User.UserFactory.createUser("hi!", "", userType47, "", "hi!", userList51);
        model.User.User user54 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList51);
        model.User.User user55 = model.User.UserFactory.createUser("hi!", "", userType38, "hi!", "", userList51);
        model.User.User user56 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList51);
        model.User.User user57 = model.User.UserFactory.createUser("hi!", "", userType29, "hi!", "", userList51);
        model.User.User user58 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList51);
        model.User.User user59 = model.User.UserFactory.createUser("hi!", "hi!", userType20, "", "", userList51);
        model.User.User user60 = model.User.UserFactory.createUser("", "", userType15, "", "", userList51);
        model.User.User user61 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "", userList51);
        model.User.User user62 = model.User.UserFactory.createUser("hi!", "", userType6, "", "hi!", userList51);
        model.User.User user63 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "hi!", userList51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user63);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        model.User.UserType userType2 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType25 = null;
        model.User.UserType userType34 = null;
        model.User.User[] userArray37 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList38 = new java.util.ArrayList<model.User.User>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList38, userArray37);
        model.User.User user40 = model.User.UserFactory.createUser("hi!", "", userType34, "", "hi!", userList38);
        model.User.User user41 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList38);
        model.User.User user42 = model.User.UserFactory.createUser("hi!", "", userType25, "hi!", "", userList38);
        model.User.User user43 = model.User.UserFactory.createUser("hi!", "", userType20, "hi!", "", userList38);
        model.User.User user44 = model.User.UserFactory.createUser("hi!", "hi!", userType15, "", "", userList38);
        model.User.User user45 = model.User.UserFactory.createLabManager("hi!", "", "", "hi!", userList38);
        model.User.User user46 = model.User.UserFactory.createLabManager("", "hi!", "hi!", "hi!", userList38);
        model.User.User user47 = model.User.UserFactory.createUser("", "hi!", userType2, "hi!", "hi!", userList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        model.User.UserType userType14 = null;
        model.User.User[] userArray17 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList18 = new java.util.ArrayList<model.User.User>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList18, userArray17);
        model.User.User user20 = model.User.UserFactory.createUser("hi!", "", userType14, "", "hi!", userList18);
        model.User.User user21 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList18);
        model.User.User user22 = model.User.UserFactory.createLabManager("", "", "hi!", "", userList18);
        model.User.User user23 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList18);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray17);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user20);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user21);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user23);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        model.User.UserType userType6 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType29 = null;
        model.User.UserType userType38 = null;
        model.User.UserType userType47 = null;
        model.User.User[] userArray50 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList51 = new java.util.ArrayList<model.User.User>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList51, userArray50);
        model.User.User user53 = model.User.UserFactory.createUser("hi!", "", userType47, "", "hi!", userList51);
        model.User.User user54 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList51);
        model.User.User user55 = model.User.UserFactory.createUser("hi!", "", userType38, "hi!", "", userList51);
        model.User.User user56 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList51);
        model.User.User user57 = model.User.UserFactory.createUser("hi!", "", userType29, "hi!", "", userList51);
        model.User.User user58 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList51);
        model.User.User user59 = model.User.UserFactory.createUser("hi!", "hi!", userType20, "", "", userList51);
        model.User.User user60 = model.User.UserFactory.createUser("", "", userType15, "", "", userList51);
        model.User.User user61 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "", userList51);
        model.User.User user62 = model.User.UserFactory.createUser("hi!", "hi!", userType6, "hi!", "", userList51);
        model.User.User user63 = model.User.UserFactory.createLabManager("hi!", "", "", "hi!", userList51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user63);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        model.User.UserType userType2 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType24 = null;
        model.User.User[] userArray27 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList28 = new java.util.ArrayList<model.User.User>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList28, userArray27);
        model.User.User user30 = model.User.UserFactory.createUser("hi!", "", userType24, "", "hi!", userList28);
        model.User.User user31 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList28);
        model.User.User user32 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "hi!", userList28);
        model.User.User user33 = model.User.UserFactory.createUser("hi!", "", userType11, "", "hi!", userList28);
        model.User.User user34 = model.User.UserFactory.createLabManager("hi!", "", "hi!", "hi!", userList28);
        model.User.User user35 = model.User.UserFactory.createUser("", "hi!", userType2, "hi!", "", userList28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType29 = null;
        model.User.UserType userType38 = null;
        model.User.User[] userArray41 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList42 = new java.util.ArrayList<model.User.User>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList42, userArray41);
        model.User.User user44 = model.User.UserFactory.createUser("hi!", "", userType38, "", "hi!", userList42);
        model.User.User user45 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList42);
        model.User.User user46 = model.User.UserFactory.createUser("hi!", "", userType29, "hi!", "", userList42);
        model.User.User user47 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList42);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "hi!", userType20, "", "", userList42);
        model.User.User user49 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList42);
        model.User.User user50 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "hi!", userList42);
        model.User.User user51 = model.User.UserFactory.createUser("", "hi!", userType7, "", "hi!", userList42);
        model.User.User user52 = model.User.UserFactory.createUser("hi!", "", userType2, "hi!", "", userList42);
        java.lang.Class<?> wildcardClass53 = userList42.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        model.User.UserType userType6 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType28 = null;
        model.User.UserType userType33 = null;
        model.User.UserType userType46 = null;
        model.User.UserType userType55 = null;
        model.User.UserType userType64 = null;
        model.User.User[] userArray67 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList68 = new java.util.ArrayList<model.User.User>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList68, userArray67);
        model.User.User user70 = model.User.UserFactory.createUser("hi!", "", userType64, "", "hi!", userList68);
        model.User.User user71 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList68);
        model.User.User user72 = model.User.UserFactory.createUser("hi!", "", userType55, "hi!", "", userList68);
        model.User.User user73 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList68);
        model.User.User user74 = model.User.UserFactory.createUser("hi!", "hi!", userType46, "", "", userList68);
        model.User.User user75 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList68);
        model.User.User user76 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList68);
        model.User.User user77 = model.User.UserFactory.createUser("", "", userType33, "hi!", "hi!", userList68);
        model.User.User user78 = model.User.UserFactory.createUser("", "hi!", userType28, "hi!", "hi!", userList68);
        model.User.User user79 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList68);
        model.User.User user80 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "hi!", userList68);
        model.User.User user81 = model.User.UserFactory.createUser("", "", userType15, "", "hi!", userList68);
        model.User.User user82 = model.User.UserFactory.createLabManager("hi!", "", "hi!", "", userList68);
        model.User.User user83 = model.User.UserFactory.createUser("", "", userType6, "hi!", "hi!", userList68);
        model.User.User user84 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user70);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user84);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        model.User.UserType userType10 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType24 = null;
        model.User.UserType userType33 = null;
        model.User.UserType userType42 = null;
        model.User.User[] userArray45 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList46 = new java.util.ArrayList<model.User.User>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList46, userArray45);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "", userType42, "", "hi!", userList46);
        model.User.User user49 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList46);
        model.User.User user50 = model.User.UserFactory.createUser("hi!", "", userType33, "hi!", "", userList46);
        model.User.User user51 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList46);
        model.User.User user52 = model.User.UserFactory.createUser("hi!", "", userType24, "hi!", "", userList46);
        model.User.User user53 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList46);
        model.User.User user54 = model.User.UserFactory.createUser("hi!", "hi!", userType15, "", "", userList46);
        model.User.User user55 = model.User.UserFactory.createUser("", "", userType10, "", "", userList46);
        model.User.User user56 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "", userList46);
        model.User.User user57 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType12 = null;
        model.User.UserType userType21 = null;
        model.User.UserType userType30 = null;
        model.User.UserType userType39 = null;
        model.User.User[] userArray42 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList43 = new java.util.ArrayList<model.User.User>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList43, userArray42);
        model.User.User user45 = model.User.UserFactory.createUser("hi!", "", userType39, "", "hi!", userList43);
        model.User.User user46 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList43);
        model.User.User user47 = model.User.UserFactory.createUser("hi!", "", userType30, "hi!", "", userList43);
        model.User.User user48 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList43);
        model.User.User user49 = model.User.UserFactory.createUser("hi!", "hi!", userType21, "", "", userList43);
        model.User.User user50 = model.User.UserFactory.createLabManager("hi!", "", "hi!", "hi!", userList43);
        model.User.User user51 = model.User.UserFactory.createUser("", "hi!", userType12, "hi!", "hi!", userList43);
        model.User.User user52 = model.User.UserFactory.createUser("hi!", "hi!", userType7, "", "", userList43);
        model.User.User user53 = model.User.UserFactory.createUser("", "hi!", userType2, "hi!", "hi!", userList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType24 = null;
        model.User.UserType userType33 = null;
        model.User.UserType userType42 = null;
        model.User.User[] userArray45 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList46 = new java.util.ArrayList<model.User.User>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList46, userArray45);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "", userType42, "", "hi!", userList46);
        model.User.User user49 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList46);
        model.User.User user50 = model.User.UserFactory.createUser("hi!", "", userType33, "hi!", "", userList46);
        model.User.User user51 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList46);
        model.User.User user52 = model.User.UserFactory.createUser("hi!", "hi!", userType24, "", "", userList46);
        model.User.User user53 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList46);
        model.User.User user54 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "hi!", userList46);
        model.User.User user55 = model.User.UserFactory.createUser("", "hi!", userType11, "", "hi!", userList46);
        model.User.User user56 = model.User.UserFactory.createUser("", "", userType6, "", "", userList46);
        model.User.User user57 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList46);
        java.lang.Class<?> wildcardClass58 = user57.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass58);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        model.User.UserType userType6 = null;
        model.User.UserType userType19 = null;
        model.User.UserType userType28 = null;
        model.User.UserType userType37 = null;
        model.User.User[] userArray40 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList41 = new java.util.ArrayList<model.User.User>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList41, userArray40);
        model.User.User user43 = model.User.UserFactory.createUser("hi!", "", userType37, "", "hi!", userList41);
        model.User.User user44 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList41);
        model.User.User user45 = model.User.UserFactory.createUser("hi!", "", userType28, "hi!", "", userList41);
        model.User.User user46 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList41);
        model.User.User user47 = model.User.UserFactory.createUser("hi!", "hi!", userType19, "", "", userList41);
        model.User.User user48 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList41);
        model.User.User user49 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "hi!", userList41);
        model.User.User user50 = model.User.UserFactory.createUser("", "hi!", userType6, "", "", userList41);
        model.User.User user51 = model.User.UserFactory.createLabManager("", "", "hi!", "", userList41);
        java.lang.Class<?> wildcardClass52 = user51.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        model.User.UserType userType2 = null;
        java.util.ArrayList<model.User.User> userList5 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.User.User user6 = model.User.UserFactory.createUser("hi!", "", userType2, "", "", userList5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.iterator()\" because \"users\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType24 = null;
        model.User.UserType userType33 = null;
        model.User.UserType userType42 = null;
        model.User.User[] userArray45 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList46 = new java.util.ArrayList<model.User.User>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList46, userArray45);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "", userType42, "", "hi!", userList46);
        model.User.User user49 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList46);
        model.User.User user50 = model.User.UserFactory.createUser("hi!", "", userType33, "hi!", "", userList46);
        model.User.User user51 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList46);
        model.User.User user52 = model.User.UserFactory.createUser("hi!", "hi!", userType24, "", "", userList46);
        model.User.User user53 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList46);
        model.User.User user54 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "hi!", userList46);
        model.User.User user55 = model.User.UserFactory.createLabManager("hi!", "", "hi!", "hi!", userList46);
        model.User.User user56 = model.User.UserFactory.createUser("hi!", "", userType7, "", "", userList46);
        model.User.User user57 = model.User.UserFactory.createUser("", "", userType2, "", "hi!", userList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        model.User.UserType userType2 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType24 = null;
        model.User.UserType userType33 = null;
        model.User.User[] userArray36 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList37 = new java.util.ArrayList<model.User.User>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList37, userArray36);
        model.User.User user39 = model.User.UserFactory.createUser("hi!", "", userType33, "", "hi!", userList37);
        model.User.User user40 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList37);
        model.User.User user41 = model.User.UserFactory.createUser("hi!", "", userType24, "hi!", "", userList37);
        model.User.User user42 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList37);
        model.User.User user43 = model.User.UserFactory.createUser("hi!", "hi!", userType15, "", "", userList37);
        model.User.User user44 = model.User.UserFactory.createLabManager("hi!", "", "hi!", "hi!", userList37);
        model.User.User user45 = model.User.UserFactory.createLabManager("", "hi!", "hi!", "", userList37);
        model.User.User user46 = model.User.UserFactory.createUser("", "", userType2, "", "", userList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType29 = null;
        model.User.User[] userArray32 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList33 = new java.util.ArrayList<model.User.User>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList33, userArray32);
        model.User.User user35 = model.User.UserFactory.createUser("hi!", "", userType29, "", "hi!", userList33);
        model.User.User user36 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList33);
        model.User.User user37 = model.User.UserFactory.createUser("hi!", "", userType20, "hi!", "", userList33);
        model.User.User user38 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList33);
        model.User.User user39 = model.User.UserFactory.createUser("hi!", "", userType11, "hi!", "", userList33);
        model.User.User user40 = model.User.UserFactory.createUser("", "", userType6, "hi!", "hi!", userList33);
        model.User.User user41 = model.User.UserFactory.createLabManager("", "", "", "hi!", userList33);
        java.lang.Class<?> wildcardClass42 = user41.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        model.User.UserType userType6 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType33 = null;
        model.User.UserType userType42 = null;
        model.User.UserType userType51 = null;
        model.User.User[] userArray54 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList55 = new java.util.ArrayList<model.User.User>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList55, userArray54);
        model.User.User user57 = model.User.UserFactory.createUser("hi!", "", userType51, "", "hi!", userList55);
        model.User.User user58 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList55);
        model.User.User user59 = model.User.UserFactory.createUser("hi!", "", userType42, "hi!", "", userList55);
        model.User.User user60 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList55);
        model.User.User user61 = model.User.UserFactory.createUser("hi!", "hi!", userType33, "", "", userList55);
        model.User.User user62 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList55);
        model.User.User user63 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "hi!", userList55);
        model.User.User user64 = model.User.UserFactory.createUser("", "hi!", userType20, "", "hi!", userList55);
        model.User.User user65 = model.User.UserFactory.createUser("", "", userType15, "", "", userList55);
        model.User.User user66 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList55);
        model.User.User user67 = model.User.UserFactory.createUser("", "", userType6, "hi!", "", userList55);
        model.User.User user68 = model.User.UserFactory.createLabManager("", "", "", "", userList55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user68);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        model.User.UserType userType2 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType25 = null;
        model.User.UserType userType30 = null;
        model.User.UserType userType39 = null;
        model.User.User[] userArray42 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList43 = new java.util.ArrayList<model.User.User>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList43, userArray42);
        model.User.User user45 = model.User.UserFactory.createUser("hi!", "", userType39, "", "hi!", userList43);
        model.User.User user46 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList43);
        model.User.User user47 = model.User.UserFactory.createUser("hi!", "", userType30, "hi!", "", userList43);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "", userType25, "hi!", "", userList43);
        model.User.User user49 = model.User.UserFactory.createUser("hi!", "hi!", userType20, "", "", userList43);
        model.User.User user50 = model.User.UserFactory.createLabManager("", "hi!", "hi!", "", userList43);
        model.User.User user51 = model.User.UserFactory.createUser("hi!", "", userType11, "", "", userList43);
        model.User.User user52 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "hi!", userList43);
        model.User.User user53 = model.User.UserFactory.createUser("", "hi!", userType2, "", "hi!", userList43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        model.User.UserType userType14 = null;
        model.User.UserType userType19 = null;
        model.User.UserType userType28 = null;
        model.User.User[] userArray31 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList32 = new java.util.ArrayList<model.User.User>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList32, userArray31);
        model.User.User user34 = model.User.UserFactory.createUser("hi!", "", userType28, "", "hi!", userList32);
        model.User.User user35 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList32);
        model.User.User user36 = model.User.UserFactory.createUser("hi!", "", userType19, "hi!", "", userList32);
        model.User.User user37 = model.User.UserFactory.createUser("", "", userType14, "", "", userList32);
        model.User.User user38 = model.User.UserFactory.createLabManager("", "hi!", "hi!", "hi!", userList32);
        model.User.User user39 = model.User.UserFactory.createLabManager("hi!", "", "", "hi!", userList32);
        model.User.User user40 = model.User.UserFactory.createLabManager("hi!", "", "hi!", "", userList32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType24 = null;
        model.User.UserType userType33 = null;
        model.User.UserType userType42 = null;
        model.User.User[] userArray45 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList46 = new java.util.ArrayList<model.User.User>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList46, userArray45);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "", userType42, "", "hi!", userList46);
        model.User.User user49 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList46);
        model.User.User user50 = model.User.UserFactory.createUser("hi!", "", userType33, "hi!", "", userList46);
        model.User.User user51 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList46);
        model.User.User user52 = model.User.UserFactory.createUser("hi!", "hi!", userType24, "", "", userList46);
        model.User.User user53 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList46);
        model.User.User user54 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList46);
        model.User.User user55 = model.User.UserFactory.createLabManager("", "hi!", "hi!", "hi!", userList46);
        model.User.User user56 = model.User.UserFactory.createUser("", "", userType7, "", "hi!", userList46);
        model.User.User user57 = model.User.UserFactory.createUser("", "hi!", userType2, "", "", userList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        model.User.UserType userType2 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType21 = null;
        model.User.UserType userType30 = null;
        model.User.User[] userArray33 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList34 = new java.util.ArrayList<model.User.User>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList34, userArray33);
        model.User.User user36 = model.User.UserFactory.createUser("hi!", "", userType30, "", "hi!", userList34);
        model.User.User user37 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList34);
        model.User.User user38 = model.User.UserFactory.createUser("hi!", "", userType21, "hi!", "", userList34);
        model.User.User user39 = model.User.UserFactory.createUser("hi!", "", userType16, "hi!", "", userList34);
        model.User.User user40 = model.User.UserFactory.createUser("hi!", "hi!", userType11, "", "", userList34);
        model.User.User user41 = model.User.UserFactory.createLabManager("", "hi!", "hi!", "hi!", userList34);
        model.User.User user42 = model.User.UserFactory.createUser("hi!", "hi!", userType2, "hi!", "", userList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType12 = null;
        model.User.UserType userType17 = null;
        model.User.UserType userType26 = null;
        model.User.UserType userType35 = null;
        model.User.User[] userArray38 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList39 = new java.util.ArrayList<model.User.User>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList39, userArray38);
        model.User.User user41 = model.User.UserFactory.createUser("hi!", "", userType35, "", "hi!", userList39);
        model.User.User user42 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList39);
        model.User.User user43 = model.User.UserFactory.createUser("hi!", "", userType26, "hi!", "", userList39);
        model.User.User user44 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList39);
        model.User.User user45 = model.User.UserFactory.createUser("hi!", "hi!", userType17, "", "", userList39);
        model.User.User user46 = model.User.UserFactory.createUser("hi!", "", userType12, "hi!", "hi!", userList39);
        model.User.User user47 = model.User.UserFactory.createUser("", "hi!", userType7, "hi!", "", userList39);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "", userType2, "", "hi!", userList39);
        java.lang.Class<?> wildcardClass49 = user48.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType12 = null;
        model.User.UserType userType17 = null;
        model.User.UserType userType26 = null;
        model.User.User[] userArray29 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList30 = new java.util.ArrayList<model.User.User>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList30, userArray29);
        model.User.User user32 = model.User.UserFactory.createUser("hi!", "", userType26, "", "hi!", userList30);
        model.User.User user33 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList30);
        model.User.User user34 = model.User.UserFactory.createUser("hi!", "", userType17, "hi!", "", userList30);
        model.User.User user35 = model.User.UserFactory.createUser("hi!", "hi!", userType12, "", "", userList30);
        model.User.User user36 = model.User.UserFactory.createUser("hi!", "", userType7, "", "hi!", userList30);
        model.User.User user37 = model.User.UserFactory.createUser("hi!", "hi!", userType2, "", "", userList30);
        java.lang.Class<?> wildcardClass38 = userList30.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        model.User.UserType userType6 = null;
        model.User.UserType userType19 = null;
        model.User.UserType userType28 = null;
        model.User.UserType userType37 = null;
        model.User.User[] userArray40 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList41 = new java.util.ArrayList<model.User.User>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList41, userArray40);
        model.User.User user43 = model.User.UserFactory.createUser("hi!", "", userType37, "", "hi!", userList41);
        model.User.User user44 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList41);
        model.User.User user45 = model.User.UserFactory.createUser("hi!", "", userType28, "hi!", "", userList41);
        model.User.User user46 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList41);
        model.User.User user47 = model.User.UserFactory.createUser("hi!", "hi!", userType19, "", "", userList41);
        model.User.User user48 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList41);
        model.User.User user49 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "hi!", userList41);
        model.User.User user50 = model.User.UserFactory.createUser("", "hi!", userType6, "", "", userList41);
        model.User.User user51 = model.User.UserFactory.createLabManager("", "", "", "", userList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType21 = null;
        model.User.UserType userType34 = null;
        model.User.UserType userType43 = null;
        model.User.UserType userType52 = null;
        model.User.User[] userArray55 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList56 = new java.util.ArrayList<model.User.User>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList56, userArray55);
        model.User.User user58 = model.User.UserFactory.createUser("hi!", "", userType52, "", "hi!", userList56);
        model.User.User user59 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList56);
        model.User.User user60 = model.User.UserFactory.createUser("hi!", "", userType43, "hi!", "", userList56);
        model.User.User user61 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList56);
        model.User.User user62 = model.User.UserFactory.createUser("hi!", "hi!", userType34, "", "", userList56);
        model.User.User user63 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList56);
        model.User.User user64 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "hi!", userList56);
        model.User.User user65 = model.User.UserFactory.createUser("", "hi!", userType21, "", "hi!", userList56);
        model.User.User user66 = model.User.UserFactory.createUser("", "", userType16, "", "", userList56);
        model.User.User user67 = model.User.UserFactory.createUser("", "hi!", userType11, "", "", userList56);
        model.User.User user68 = model.User.UserFactory.createUser("", "", userType6, "hi!", "", userList56);
        model.User.User user69 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "hi!", userList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user69);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        model.User.UserType userType2 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType24 = null;
        model.User.UserType userType33 = null;
        model.User.UserType userType42 = null;
        model.User.User[] userArray45 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList46 = new java.util.ArrayList<model.User.User>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList46, userArray45);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "", userType42, "", "hi!", userList46);
        model.User.User user49 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList46);
        model.User.User user50 = model.User.UserFactory.createUser("hi!", "", userType33, "hi!", "", userList46);
        model.User.User user51 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList46);
        model.User.User user52 = model.User.UserFactory.createUser("hi!", "hi!", userType24, "", "", userList46);
        model.User.User user53 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList46);
        model.User.User user54 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "hi!", userList46);
        model.User.User user55 = model.User.UserFactory.createUser("", "hi!", userType11, "", "", userList46);
        model.User.User user56 = model.User.UserFactory.createLabManager("", "", "hi!", "", userList46);
        model.User.User user57 = model.User.UserFactory.createUser("", "hi!", userType2, "", "", userList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        model.User.UserType userType10 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType24 = null;
        model.User.UserType userType33 = null;
        model.User.UserType userType42 = null;
        model.User.User[] userArray45 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList46 = new java.util.ArrayList<model.User.User>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList46, userArray45);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "", userType42, "", "hi!", userList46);
        model.User.User user49 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList46);
        model.User.User user50 = model.User.UserFactory.createUser("hi!", "", userType33, "hi!", "", userList46);
        model.User.User user51 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList46);
        model.User.User user52 = model.User.UserFactory.createUser("hi!", "", userType24, "hi!", "", userList46);
        model.User.User user53 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList46);
        model.User.User user54 = model.User.UserFactory.createUser("hi!", "hi!", userType15, "", "", userList46);
        model.User.User user55 = model.User.UserFactory.createUser("", "hi!", userType10, "", "hi!", userList46);
        model.User.User user56 = model.User.UserFactory.createLabManager("hi!", "", "", "hi!", userList46);
        model.User.User user57 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType12 = null;
        model.User.UserType userType21 = null;
        model.User.User[] userArray24 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList25 = new java.util.ArrayList<model.User.User>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList25, userArray24);
        model.User.User user27 = model.User.UserFactory.createUser("hi!", "", userType21, "", "hi!", userList25);
        model.User.User user28 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList25);
        model.User.User user29 = model.User.UserFactory.createUser("hi!", "", userType12, "hi!", "", userList25);
        model.User.User user30 = model.User.UserFactory.createUser("hi!", "", userType7, "hi!", "", userList25);
        model.User.User user31 = model.User.UserFactory.createUser("hi!", "hi!", userType2, "hi!", "", userList25);
        java.lang.Class<?> wildcardClass32 = userList25.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType29 = null;
        model.User.User[] userArray32 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList33 = new java.util.ArrayList<model.User.User>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList33, userArray32);
        model.User.User user35 = model.User.UserFactory.createUser("hi!", "", userType29, "", "hi!", userList33);
        model.User.User user36 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList33);
        model.User.User user37 = model.User.UserFactory.createUser("hi!", "", userType20, "hi!", "", userList33);
        model.User.User user38 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList33);
        model.User.User user39 = model.User.UserFactory.createUser("hi!", "", userType11, "hi!", "", userList33);
        model.User.User user40 = model.User.UserFactory.createUser("hi!", "hi!", userType6, "hi!", "", userList33);
        model.User.User user41 = model.User.UserFactory.createLabManager("", "", "", "hi!", userList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType21 = null;
        model.User.UserType userType34 = null;
        model.User.UserType userType43 = null;
        model.User.UserType userType52 = null;
        model.User.User[] userArray55 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList56 = new java.util.ArrayList<model.User.User>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList56, userArray55);
        model.User.User user58 = model.User.UserFactory.createUser("hi!", "", userType52, "", "hi!", userList56);
        model.User.User user59 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList56);
        model.User.User user60 = model.User.UserFactory.createUser("hi!", "", userType43, "hi!", "", userList56);
        model.User.User user61 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList56);
        model.User.User user62 = model.User.UserFactory.createUser("hi!", "hi!", userType34, "", "", userList56);
        model.User.User user63 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList56);
        model.User.User user64 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "hi!", userList56);
        model.User.User user65 = model.User.UserFactory.createUser("", "hi!", userType21, "", "hi!", userList56);
        model.User.User user66 = model.User.UserFactory.createUser("", "", userType16, "", "", userList56);
        model.User.User user67 = model.User.UserFactory.createUser("", "hi!", userType11, "", "", userList56);
        model.User.User user68 = model.User.UserFactory.createUser("", "", userType6, "hi!", "", userList56);
        model.User.User user69 = model.User.UserFactory.createLabManager("", "hi!", "hi!", "", userList56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user69);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        model.User.UserType userType6 = null;
        model.User.UserType userType19 = null;
        model.User.User[] userArray22 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList23 = new java.util.ArrayList<model.User.User>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList23, userArray22);
        model.User.User user25 = model.User.UserFactory.createUser("hi!", "", userType19, "", "hi!", userList23);
        model.User.User user26 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList23);
        model.User.User user27 = model.User.UserFactory.createLabManager("", "", "hi!", "", userList23);
        model.User.User user28 = model.User.UserFactory.createUser("", "", userType6, "hi!", "", userList23);
        model.User.User user29 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "hi!", userList23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray22);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user25);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user29);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        model.User.UserType userType2 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType24 = null;
        model.User.UserType userType33 = null;
        model.User.User[] userArray36 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList37 = new java.util.ArrayList<model.User.User>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList37, userArray36);
        model.User.User user39 = model.User.UserFactory.createUser("hi!", "", userType33, "", "hi!", userList37);
        model.User.User user40 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList37);
        model.User.User user41 = model.User.UserFactory.createUser("hi!", "", userType24, "hi!", "", userList37);
        model.User.User user42 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList37);
        model.User.User user43 = model.User.UserFactory.createUser("hi!", "hi!", userType15, "", "", userList37);
        model.User.User user44 = model.User.UserFactory.createLabManager("hi!", "", "hi!", "hi!", userList37);
        model.User.User user45 = model.User.UserFactory.createLabManager("", "", "hi!", "", userList37);
        model.User.User user46 = model.User.UserFactory.createUser("hi!", "", userType2, "", "", userList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        model.User.UserType userType18 = null;
        model.User.UserType userType27 = null;
        model.User.UserType userType36 = null;
        model.User.User[] userArray39 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList40 = new java.util.ArrayList<model.User.User>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList40, userArray39);
        model.User.User user42 = model.User.UserFactory.createUser("hi!", "", userType36, "", "hi!", userList40);
        model.User.User user43 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList40);
        model.User.User user44 = model.User.UserFactory.createUser("hi!", "", userType27, "hi!", "", userList40);
        model.User.User user45 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList40);
        model.User.User user46 = model.User.UserFactory.createUser("hi!", "hi!", userType18, "", "", userList40);
        model.User.User user47 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList40);
        model.User.User user48 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList40);
        model.User.User user49 = model.User.UserFactory.createLabManager("", "hi!", "hi!", "hi!", userList40);
        model.User.User user50 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        model.User.UserType userType2 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType29 = null;
        model.User.User[] userArray32 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList33 = new java.util.ArrayList<model.User.User>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList33, userArray32);
        model.User.User user35 = model.User.UserFactory.createUser("hi!", "", userType29, "", "hi!", userList33);
        model.User.User user36 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList33);
        model.User.User user37 = model.User.UserFactory.createUser("hi!", "", userType20, "hi!", "", userList33);
        model.User.User user38 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList33);
        model.User.User user39 = model.User.UserFactory.createUser("hi!", "hi!", userType11, "", "", userList33);
        model.User.User user40 = model.User.UserFactory.createLabManager("hi!", "", "hi!", "hi!", userList33);
        model.User.User user41 = model.User.UserFactory.createUser("", "hi!", userType2, "hi!", "hi!", userList33);
        java.lang.Class<?> wildcardClass42 = userList33.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType21 = null;
        model.User.UserType userType26 = null;
        model.User.UserType userType35 = null;
        model.User.User[] userArray38 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList39 = new java.util.ArrayList<model.User.User>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList39, userArray38);
        model.User.User user41 = model.User.UserFactory.createUser("hi!", "", userType35, "", "hi!", userList39);
        model.User.User user42 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList39);
        model.User.User user43 = model.User.UserFactory.createUser("hi!", "", userType26, "hi!", "", userList39);
        model.User.User user44 = model.User.UserFactory.createUser("hi!", "", userType21, "hi!", "", userList39);
        model.User.User user45 = model.User.UserFactory.createUser("hi!", "hi!", userType16, "", "", userList39);
        model.User.User user46 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList39);
        model.User.User user47 = model.User.UserFactory.createUser("hi!", "", userType7, "hi!", "", userList39);
        model.User.User user48 = model.User.UserFactory.createUser("", "", userType2, "", "", userList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType21 = null;
        model.User.UserType userType26 = null;
        model.User.UserType userType35 = null;
        model.User.User[] userArray38 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList39 = new java.util.ArrayList<model.User.User>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList39, userArray38);
        model.User.User user41 = model.User.UserFactory.createUser("hi!", "", userType35, "", "hi!", userList39);
        model.User.User user42 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList39);
        model.User.User user43 = model.User.UserFactory.createUser("hi!", "", userType26, "hi!", "", userList39);
        model.User.User user44 = model.User.UserFactory.createUser("hi!", "", userType21, "hi!", "", userList39);
        model.User.User user45 = model.User.UserFactory.createUser("hi!", "hi!", userType16, "", "", userList39);
        model.User.User user46 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList39);
        model.User.User user47 = model.User.UserFactory.createUser("hi!", "", userType7, "hi!", "", userList39);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "", userType2, "", "hi!", userList39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType12 = null;
        model.User.UserType userType17 = null;
        model.User.UserType userType26 = null;
        model.User.User[] userArray29 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList30 = new java.util.ArrayList<model.User.User>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList30, userArray29);
        model.User.User user32 = model.User.UserFactory.createUser("hi!", "", userType26, "", "hi!", userList30);
        model.User.User user33 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList30);
        model.User.User user34 = model.User.UserFactory.createUser("hi!", "", userType17, "hi!", "", userList30);
        model.User.User user35 = model.User.UserFactory.createUser("hi!", "", userType12, "hi!", "", userList30);
        model.User.User user36 = model.User.UserFactory.createUser("hi!", "hi!", userType7, "", "", userList30);
        model.User.User user37 = model.User.UserFactory.createUser("hi!", "hi!", userType2, "", "", userList30);
        java.lang.Class<?> wildcardClass38 = userList30.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        model.User.UserType userType10 = null;
        model.User.UserType userType19 = null;
        model.User.UserType userType28 = null;
        model.User.UserType userType37 = null;
        model.User.User[] userArray40 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList41 = new java.util.ArrayList<model.User.User>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList41, userArray40);
        model.User.User user43 = model.User.UserFactory.createUser("hi!", "", userType37, "", "hi!", userList41);
        model.User.User user44 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList41);
        model.User.User user45 = model.User.UserFactory.createUser("hi!", "", userType28, "hi!", "", userList41);
        model.User.User user46 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList41);
        model.User.User user47 = model.User.UserFactory.createUser("hi!", "", userType19, "hi!", "", userList41);
        model.User.User user48 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList41);
        model.User.User user49 = model.User.UserFactory.createUser("hi!", "hi!", userType10, "", "", userList41);
        model.User.User user50 = model.User.UserFactory.createLabManager("", "hi!", "hi!", "hi!", userList41);
        model.User.User user51 = model.User.UserFactory.createLabManager("", "", "", "hi!", userList41);
        java.lang.Class<?> wildcardClass52 = userList41.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        model.User.UserType userType2 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType25 = null;
        model.User.UserType userType34 = null;
        model.User.User[] userArray37 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList38 = new java.util.ArrayList<model.User.User>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList38, userArray37);
        model.User.User user40 = model.User.UserFactory.createUser("hi!", "", userType34, "", "hi!", userList38);
        model.User.User user41 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList38);
        model.User.User user42 = model.User.UserFactory.createUser("hi!", "hi!", userType25, "hi!", "hi!", userList38);
        model.User.User user43 = model.User.UserFactory.createUser("hi!", "hi!", userType20, "hi!", "", userList38);
        model.User.User user44 = model.User.UserFactory.createUser("hi!", "", userType15, "", "", userList38);
        model.User.User user45 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList38);
        model.User.User user46 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList38);
        model.User.User user47 = model.User.UserFactory.createUser("", "", userType2, "", "", userList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        model.User.UserType userType14 = null;
        model.User.UserType userType23 = null;
        model.User.User[] userArray26 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList27 = new java.util.ArrayList<model.User.User>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList27, userArray26);
        model.User.User user29 = model.User.UserFactory.createUser("hi!", "", userType23, "", "hi!", userList27);
        model.User.User user30 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList27);
        model.User.User user31 = model.User.UserFactory.createUser("hi!", "", userType14, "hi!", "", userList27);
        model.User.User user32 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList27);
        model.User.User user33 = model.User.UserFactory.createLabManager("hi!", "", "hi!", "", userList27);
        model.User.User user34 = model.User.UserFactory.createLabManager("", "", "", "hi!", userList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user34);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        model.User.UserType userType2 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType28 = null;
        model.User.UserType userType37 = null;
        model.User.UserType userType46 = null;
        model.User.User[] userArray49 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList50 = new java.util.ArrayList<model.User.User>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList50, userArray49);
        model.User.User user52 = model.User.UserFactory.createUser("hi!", "", userType46, "", "hi!", userList50);
        model.User.User user53 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList50);
        model.User.User user54 = model.User.UserFactory.createUser("hi!", "", userType37, "hi!", "", userList50);
        model.User.User user55 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList50);
        model.User.User user56 = model.User.UserFactory.createUser("hi!", "hi!", userType28, "", "", userList50);
        model.User.User user57 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList50);
        model.User.User user58 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList50);
        model.User.User user59 = model.User.UserFactory.createUser("", "", userType15, "hi!", "", userList50);
        model.User.User user60 = model.User.UserFactory.createLabManager("", "", "hi!", "", userList50);
        model.User.User user61 = model.User.UserFactory.createLabManager("", "", "hi!", "", userList50);
        model.User.User user62 = model.User.UserFactory.createUser("", "", userType2, "hi!", "hi!", userList50);
        java.lang.Class<?> wildcardClass63 = user62.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType25 = null;
        model.User.User[] userArray28 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList29 = new java.util.ArrayList<model.User.User>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList29, userArray28);
        model.User.User user31 = model.User.UserFactory.createUser("hi!", "", userType25, "", "hi!", userList29);
        model.User.User user32 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList29);
        model.User.User user33 = model.User.UserFactory.createUser("hi!", "", userType16, "hi!", "", userList29);
        model.User.User user34 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList29);
        model.User.User user35 = model.User.UserFactory.createUser("hi!", "hi!", userType7, "", "", userList29);
        model.User.User user36 = model.User.UserFactory.createUser("hi!", "", userType2, "", "", userList29);
        java.lang.Class<?> wildcardClass37 = user36.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType12 = null;
        model.User.UserType userType25 = null;
        model.User.UserType userType34 = null;
        model.User.UserType userType43 = null;
        model.User.User[] userArray46 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList47 = new java.util.ArrayList<model.User.User>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList47, userArray46);
        model.User.User user49 = model.User.UserFactory.createUser("hi!", "", userType43, "", "hi!", userList47);
        model.User.User user50 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList47);
        model.User.User user51 = model.User.UserFactory.createUser("hi!", "", userType34, "hi!", "", userList47);
        model.User.User user52 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList47);
        model.User.User user53 = model.User.UserFactory.createUser("hi!", "hi!", userType25, "", "", userList47);
        model.User.User user54 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList47);
        model.User.User user55 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList47);
        model.User.User user56 = model.User.UserFactory.createUser("", "", userType12, "hi!", "hi!", userList47);
        model.User.User user57 = model.User.UserFactory.createUser("", "hi!", userType7, "hi!", "hi!", userList47);
        model.User.User user58 = model.User.UserFactory.createUser("", "hi!", userType2, "hi!", "", userList47);
        java.lang.Class<?> wildcardClass59 = user58.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType29 = null;
        model.User.UserType userType34 = null;
        model.User.UserType userType47 = null;
        model.User.UserType userType56 = null;
        model.User.UserType userType65 = null;
        model.User.User[] userArray68 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList69 = new java.util.ArrayList<model.User.User>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList69, userArray68);
        model.User.User user71 = model.User.UserFactory.createUser("hi!", "", userType65, "", "hi!", userList69);
        model.User.User user72 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList69);
        model.User.User user73 = model.User.UserFactory.createUser("hi!", "", userType56, "hi!", "", userList69);
        model.User.User user74 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList69);
        model.User.User user75 = model.User.UserFactory.createUser("hi!", "hi!", userType47, "", "", userList69);
        model.User.User user76 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList69);
        model.User.User user77 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList69);
        model.User.User user78 = model.User.UserFactory.createUser("", "", userType34, "hi!", "hi!", userList69);
        model.User.User user79 = model.User.UserFactory.createUser("", "hi!", userType29, "hi!", "hi!", userList69);
        model.User.User user80 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList69);
        model.User.User user81 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "hi!", userList69);
        model.User.User user82 = model.User.UserFactory.createUser("", "", userType16, "", "hi!", userList69);
        model.User.User user83 = model.User.UserFactory.createLabManager("hi!", "", "hi!", "", userList69);
        model.User.User user84 = model.User.UserFactory.createUser("", "", userType7, "hi!", "hi!", userList69);
        model.User.User user85 = model.User.UserFactory.createUser("", "hi!", userType2, "hi!", "", userList69);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user71);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user72);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user73);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user74);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user75);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user76);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user77);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user78);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user79);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user80);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user81);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user82);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user83);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user84);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user85);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        model.User.UserType userType2 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType20 = null;
        model.User.User[] userArray23 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList24 = new java.util.ArrayList<model.User.User>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList24, userArray23);
        model.User.User user26 = model.User.UserFactory.createUser("hi!", "", userType20, "", "hi!", userList24);
        model.User.User user27 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList24);
        model.User.User user28 = model.User.UserFactory.createUser("hi!", "", userType11, "", "hi!", userList24);
        model.User.User user29 = model.User.UserFactory.createLabManager("", "", "", "", userList24);
        model.User.User user30 = model.User.UserFactory.createUser("", "", userType2, "", "hi!", userList24);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray23);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user30);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        model.User.UserType userType2 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType21 = null;
        model.User.UserType userType30 = null;
        model.User.User[] userArray33 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList34 = new java.util.ArrayList<model.User.User>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList34, userArray33);
        model.User.User user36 = model.User.UserFactory.createUser("hi!", "", userType30, "", "hi!", userList34);
        model.User.User user37 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList34);
        model.User.User user38 = model.User.UserFactory.createUser("hi!", "", userType21, "hi!", "", userList34);
        model.User.User user39 = model.User.UserFactory.createUser("hi!", "", userType16, "hi!", "", userList34);
        model.User.User user40 = model.User.UserFactory.createUser("hi!", "hi!", userType11, "", "", userList34);
        model.User.User user41 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList34);
        model.User.User user42 = model.User.UserFactory.createUser("hi!", "", userType2, "hi!", "hi!", userList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        model.User.UserType userType10 = null;
        model.User.UserType userType23 = null;
        model.User.User[] userArray26 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList27 = new java.util.ArrayList<model.User.User>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList27, userArray26);
        model.User.User user29 = model.User.UserFactory.createUser("hi!", "", userType23, "", "hi!", userList27);
        model.User.User user30 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList27);
        model.User.User user31 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "hi!", userList27);
        model.User.User user32 = model.User.UserFactory.createUser("hi!", "", userType10, "", "hi!", userList27);
        model.User.User user33 = model.User.UserFactory.createLabManager("", "", "", "hi!", userList27);
        model.User.User user34 = model.User.UserFactory.createLabManager("hi!", "", "", "hi!", userList27);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray26);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user29);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user30);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user34);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType25 = null;
        model.User.UserType userType34 = null;
        model.User.User[] userArray37 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList38 = new java.util.ArrayList<model.User.User>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList38, userArray37);
        model.User.User user40 = model.User.UserFactory.createUser("hi!", "", userType34, "", "hi!", userList38);
        model.User.User user41 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList38);
        model.User.User user42 = model.User.UserFactory.createUser("hi!", "", userType25, "hi!", "", userList38);
        model.User.User user43 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList38);
        model.User.User user44 = model.User.UserFactory.createUser("hi!", "hi!", userType16, "", "", userList38);
        model.User.User user45 = model.User.UserFactory.createUser("hi!", "hi!", userType11, "hi!", "", userList38);
        model.User.User user46 = model.User.UserFactory.createUser("hi!", "", userType6, "", "", userList38);
        model.User.User user47 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "hi!", userList38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        model.User.UserType userType2 = null;
        model.User.UserType userType7 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType29 = null;
        model.User.UserType userType38 = null;
        model.User.User[] userArray41 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList42 = new java.util.ArrayList<model.User.User>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList42, userArray41);
        model.User.User user44 = model.User.UserFactory.createUser("hi!", "", userType38, "", "hi!", userList42);
        model.User.User user45 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList42);
        model.User.User user46 = model.User.UserFactory.createUser("hi!", "", userType29, "hi!", "", userList42);
        model.User.User user47 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList42);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "hi!", userType20, "", "", userList42);
        model.User.User user49 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList42);
        model.User.User user50 = model.User.UserFactory.createLabManager("", "", "", "", userList42);
        model.User.User user51 = model.User.UserFactory.createUser("hi!", "", userType7, "", "", userList42);
        model.User.User user52 = model.User.UserFactory.createUser("hi!", "", userType2, "", "hi!", userList42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType25 = null;
        model.User.User[] userArray28 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList29 = new java.util.ArrayList<model.User.User>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList29, userArray28);
        model.User.User user31 = model.User.UserFactory.createUser("hi!", "", userType25, "", "hi!", userList29);
        model.User.User user32 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList29);
        model.User.User user33 = model.User.UserFactory.createUser("hi!", "", userType16, "hi!", "", userList29);
        model.User.User user34 = model.User.UserFactory.createUser("hi!", "", userType11, "hi!", "", userList29);
        model.User.User user35 = model.User.UserFactory.createUser("hi!", "hi!", userType6, "", "", userList29);
        model.User.User user36 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "hi!", userList29);
        java.lang.Class<?> wildcardClass37 = userList29.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray28);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user31);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        model.User.UserType userType6 = null;
        model.User.UserType userType19 = null;
        model.User.UserType userType28 = null;
        model.User.UserType userType37 = null;
        model.User.User[] userArray40 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList41 = new java.util.ArrayList<model.User.User>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList41, userArray40);
        model.User.User user43 = model.User.UserFactory.createUser("hi!", "", userType37, "", "hi!", userList41);
        model.User.User user44 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList41);
        model.User.User user45 = model.User.UserFactory.createUser("hi!", "", userType28, "hi!", "", userList41);
        model.User.User user46 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList41);
        model.User.User user47 = model.User.UserFactory.createUser("hi!", "hi!", userType19, "", "", userList41);
        model.User.User user48 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList41);
        model.User.User user49 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList41);
        model.User.User user50 = model.User.UserFactory.createUser("", "", userType6, "hi!", "", userList41);
        model.User.User user51 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        model.User.UserType userType2 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType21 = null;
        model.User.UserType userType30 = null;
        model.User.User[] userArray33 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList34 = new java.util.ArrayList<model.User.User>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList34, userArray33);
        model.User.User user36 = model.User.UserFactory.createUser("hi!", "", userType30, "", "hi!", userList34);
        model.User.User user37 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList34);
        model.User.User user38 = model.User.UserFactory.createUser("hi!", "hi!", userType21, "hi!", "hi!", userList34);
        model.User.User user39 = model.User.UserFactory.createUser("hi!", "hi!", userType16, "hi!", "", userList34);
        model.User.User user40 = model.User.UserFactory.createUser("hi!", "", userType11, "", "", userList34);
        model.User.User user41 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList34);
        model.User.User user42 = model.User.UserFactory.createUser("hi!", "hi!", userType2, "", "", userList34);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        model.User.UserType userType6 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType24 = null;
        model.User.UserType userType33 = null;
        model.User.User[] userArray36 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList37 = new java.util.ArrayList<model.User.User>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList37, userArray36);
        model.User.User user39 = model.User.UserFactory.createUser("hi!", "", userType33, "", "hi!", userList37);
        model.User.User user40 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList37);
        model.User.User user41 = model.User.UserFactory.createUser("hi!", "", userType24, "hi!", "", userList37);
        model.User.User user42 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "hi!", userList37);
        model.User.User user43 = model.User.UserFactory.createUser("hi!", "", userType15, "hi!", "hi!", userList37);
        model.User.User user44 = model.User.UserFactory.createLabManager("hi!", "", "", "hi!", userList37);
        model.User.User user45 = model.User.UserFactory.createUser("hi!", "", userType6, "hi!", "hi!", userList37);
        model.User.User user46 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user42);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        model.User.UserType userType2 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType33 = null;
        model.User.UserType userType42 = null;
        model.User.UserType userType51 = null;
        model.User.User[] userArray54 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList55 = new java.util.ArrayList<model.User.User>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList55, userArray54);
        model.User.User user57 = model.User.UserFactory.createUser("hi!", "", userType51, "", "hi!", userList55);
        model.User.User user58 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList55);
        model.User.User user59 = model.User.UserFactory.createUser("hi!", "", userType42, "hi!", "", userList55);
        model.User.User user60 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList55);
        model.User.User user61 = model.User.UserFactory.createUser("hi!", "hi!", userType33, "", "", userList55);
        model.User.User user62 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList55);
        model.User.User user63 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList55);
        model.User.User user64 = model.User.UserFactory.createUser("", "", userType20, "hi!", "hi!", userList55);
        model.User.User user65 = model.User.UserFactory.createUser("", "hi!", userType15, "hi!", "hi!", userList55);
        model.User.User user66 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList55);
        model.User.User user67 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "hi!", userList55);
        model.User.User user68 = model.User.UserFactory.createUser("", "", userType2, "", "hi!", userList55);
        java.lang.Class<?> wildcardClass69 = user68.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user64);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user65);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user66);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user67);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user68);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass69);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        model.User.UserType userType6 = null;
        model.User.UserType userType23 = null;
        model.User.UserType userType32 = null;
        model.User.UserType userType41 = null;
        model.User.User[] userArray44 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList45 = new java.util.ArrayList<model.User.User>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList45, userArray44);
        model.User.User user47 = model.User.UserFactory.createUser("hi!", "", userType41, "", "hi!", userList45);
        model.User.User user48 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList45);
        model.User.User user49 = model.User.UserFactory.createUser("hi!", "", userType32, "hi!", "", userList45);
        model.User.User user50 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList45);
        model.User.User user51 = model.User.UserFactory.createUser("hi!", "hi!", userType23, "", "", userList45);
        model.User.User user52 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList45);
        model.User.User user53 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList45);
        model.User.User user54 = model.User.UserFactory.createLabManager("", "hi!", "hi!", "hi!", userList45);
        model.User.User user55 = model.User.UserFactory.createUser("hi!", "", userType6, "", "", userList45);
        model.User.User user56 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        model.User.UserType userType6 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType29 = null;
        model.User.User[] userArray32 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList33 = new java.util.ArrayList<model.User.User>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList33, userArray32);
        model.User.User user35 = model.User.UserFactory.createUser("hi!", "", userType29, "", "hi!", userList33);
        model.User.User user36 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList33);
        model.User.User user37 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "hi!", userList33);
        model.User.User user38 = model.User.UserFactory.createUser("hi!", "", userType16, "", "hi!", userList33);
        model.User.User user39 = model.User.UserFactory.createUser("", "", userType11, "hi!", "", userList33);
        model.User.User user40 = model.User.UserFactory.createUser("hi!", "", userType6, "", "", userList33);
        model.User.User user41 = model.User.UserFactory.createLabManager("hi!", "", "hi!", "", userList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        model.User.UserType userType6 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType29 = null;
        model.User.UserType userType38 = null;
        model.User.UserType userType47 = null;
        model.User.User[] userArray50 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList51 = new java.util.ArrayList<model.User.User>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList51, userArray50);
        model.User.User user53 = model.User.UserFactory.createUser("hi!", "", userType47, "", "hi!", userList51);
        model.User.User user54 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList51);
        model.User.User user55 = model.User.UserFactory.createUser("hi!", "", userType38, "hi!", "", userList51);
        model.User.User user56 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList51);
        model.User.User user57 = model.User.UserFactory.createUser("hi!", "", userType29, "hi!", "", userList51);
        model.User.User user58 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList51);
        model.User.User user59 = model.User.UserFactory.createUser("hi!", "hi!", userType20, "", "", userList51);
        model.User.User user60 = model.User.UserFactory.createUser("", "", userType15, "", "", userList51);
        model.User.User user61 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "", userList51);
        model.User.User user62 = model.User.UserFactory.createUser("hi!", "", userType6, "", "hi!", userList51);
        model.User.User user63 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "", userList51);
        java.lang.Class<?> wildcardClass64 = userList51.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user58);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user59);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user60);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user61);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user62);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user63);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        model.User.UserType userType6 = null;
        model.User.UserType userType23 = null;
        model.User.UserType userType32 = null;
        model.User.UserType userType41 = null;
        model.User.User[] userArray44 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList45 = new java.util.ArrayList<model.User.User>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList45, userArray44);
        model.User.User user47 = model.User.UserFactory.createUser("hi!", "", userType41, "", "hi!", userList45);
        model.User.User user48 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList45);
        model.User.User user49 = model.User.UserFactory.createUser("hi!", "", userType32, "hi!", "", userList45);
        model.User.User user50 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList45);
        model.User.User user51 = model.User.UserFactory.createUser("hi!", "hi!", userType23, "", "", userList45);
        model.User.User user52 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList45);
        model.User.User user53 = model.User.UserFactory.createLabManager("", "", "hi!", "hi!", userList45);
        model.User.User user54 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "", userList45);
        model.User.User user55 = model.User.UserFactory.createUser("hi!", "hi!", userType6, "hi!", "", userList45);
        model.User.User user56 = model.User.UserFactory.createLabManager("", "", "", "hi!", userList45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        model.User.UserType userType2 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType16 = null;
        model.User.UserType userType25 = null;
        model.User.UserType userType34 = null;
        model.User.UserType userType43 = null;
        model.User.User[] userArray46 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList47 = new java.util.ArrayList<model.User.User>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList47, userArray46);
        model.User.User user49 = model.User.UserFactory.createUser("hi!", "", userType43, "", "hi!", userList47);
        model.User.User user50 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList47);
        model.User.User user51 = model.User.UserFactory.createUser("hi!", "", userType34, "hi!", "", userList47);
        model.User.User user52 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList47);
        model.User.User user53 = model.User.UserFactory.createUser("hi!", "hi!", userType25, "", "", userList47);
        model.User.User user54 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList47);
        model.User.User user55 = model.User.UserFactory.createUser("", "hi!", userType16, "", "", userList47);
        model.User.User user56 = model.User.UserFactory.createUser("hi!", "hi!", userType11, "hi!", "", userList47);
        model.User.User user57 = model.User.UserFactory.createLabManager("hi!", "", "hi!", "", userList47);
        model.User.User user58 = model.User.UserFactory.createUser("hi!", "hi!", userType2, "hi!", "", userList47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user58);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        model.User.UserType userType2 = null;
        model.User.UserType userType11 = null;
        model.User.UserType userType24 = null;
        model.User.UserType userType33 = null;
        model.User.UserType userType42 = null;
        model.User.User[] userArray45 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList46 = new java.util.ArrayList<model.User.User>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList46, userArray45);
        model.User.User user48 = model.User.UserFactory.createUser("hi!", "", userType42, "", "hi!", userList46);
        model.User.User user49 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList46);
        model.User.User user50 = model.User.UserFactory.createUser("hi!", "", userType33, "hi!", "", userList46);
        model.User.User user51 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList46);
        model.User.User user52 = model.User.UserFactory.createUser("hi!", "hi!", userType24, "", "", userList46);
        model.User.User user53 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList46);
        model.User.User user54 = model.User.UserFactory.createLabManager("", "", "", "", userList46);
        model.User.User user55 = model.User.UserFactory.createUser("hi!", "hi!", userType11, "", "", userList46);
        model.User.User user56 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList46);
        model.User.User user57 = model.User.UserFactory.createUser("hi!", "", userType2, "", "hi!", userList46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user52);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user53);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user54);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user55);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user56);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user57);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        model.User.UserType userType2 = null;
        model.User.UserType userType15 = null;
        model.User.UserType userType20 = null;
        model.User.UserType userType29 = null;
        model.User.User[] userArray32 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList33 = new java.util.ArrayList<model.User.User>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList33, userArray32);
        model.User.User user35 = model.User.UserFactory.createUser("hi!", "", userType29, "", "hi!", userList33);
        model.User.User user36 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList33);
        model.User.User user37 = model.User.UserFactory.createUser("hi!", "", userType20, "hi!", "", userList33);
        model.User.User user38 = model.User.UserFactory.createUser("hi!", "hi!", userType15, "", "", userList33);
        model.User.User user39 = model.User.UserFactory.createLabManager("", "hi!", "hi!", "hi!", userList33);
        model.User.User user40 = model.User.UserFactory.createLabManager("", "hi!", "", "", userList33);
        model.User.User user41 = model.User.UserFactory.createUser("hi!", "", userType2, "hi!", "", userList33);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray32);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user35);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user36);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user37);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user38);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user39);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user41);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        model.User.UserType userType2 = null;
        model.User.UserType userType19 = null;
        model.User.UserType userType28 = null;
        model.User.UserType userType37 = null;
        model.User.User[] userArray40 = new model.User.User[] {};
        java.util.ArrayList<model.User.User> userList41 = new java.util.ArrayList<model.User.User>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<model.User.User>) userList41, userArray40);
        model.User.User user43 = model.User.UserFactory.createUser("hi!", "", userType37, "", "hi!", userList41);
        model.User.User user44 = model.User.UserFactory.createLabManager("hi!", "hi!", "hi!", "", userList41);
        model.User.User user45 = model.User.UserFactory.createUser("hi!", "", userType28, "hi!", "", userList41);
        model.User.User user46 = model.User.UserFactory.createLabManager("hi!", "", "", "", userList41);
        model.User.User user47 = model.User.UserFactory.createUser("hi!", "hi!", userType19, "", "", userList41);
        model.User.User user48 = model.User.UserFactory.createLabManager("", "hi!", "", "hi!", userList41);
        model.User.User user49 = model.User.UserFactory.createLabManager("", "", "hi!", "hi!", userList41);
        model.User.User user50 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "", userList41);
        model.User.User user51 = model.User.UserFactory.createUser("hi!", "hi!", userType2, "hi!", "", userList41);
        java.lang.Class<?> wildcardClass52 = userList41.getClass();
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(userArray40);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user43);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user44);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user45);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user46);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user47);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user48);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user49);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user50);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(user51);
        // Regression assertion (captures the current behavior of the code)
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        java.util.ArrayList<model.User.User> userList4 = null;
        // The following exception was thrown during execution in test generation
        try {
            model.User.User user5 = model.User.UserFactory.createLabManager("hi!", "hi!", "", "", userList4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.ArrayList.iterator()\" because \"users\" is null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
    }
}

