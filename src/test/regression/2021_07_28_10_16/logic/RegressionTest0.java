package logic;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        logic.YourWood yourWood0 = new logic.YourWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.diameterFirstSortWood();
        java.lang.Class<?> wildcardClass3 = yourWood0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        roundVolume3.setVolume((double) 10.0f);
        java.lang.Class<?> wildcardClass11 = roundVolume3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        logic.YourWood yourWood0 = new logic.YourWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.lengthFirstSortWood();
        java.lang.Class<?> wildcardClass3 = yourWood0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        logic.VolumeDB volumeDB0 = new logic.VolumeDB();
        java.util.HashMap<java.lang.String, logic.RoundVolume> strMap1 = volumeDB0.getVolumes();
        java.util.HashMap<java.lang.String, logic.RoundVolume> strMap2 = volumeDB0.getVolumes();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.lang.Class<?> wildcardClass1 = yourWood0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        boolean boolean10 = roundVolume3.canEqual((java.lang.Object) (byte) -1);
        int int11 = roundVolume3.getDiameter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = null;
        logic.VolumeDB.mapper = objectMapper0;
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume3.setDiameter((int) (byte) 10);
        roundVolume3.setDiameter((int) (byte) -1);
        java.lang.String str8 = roundVolume3.toString();
        java.lang.Class<?> wildcardClass9 = roundVolume3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "RoundVolume(length=100.0, diameter=-1, volume=10.0)" + "'", str8, "RoundVolume(length=100.0, diameter=-1, volume=10.0)");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (byte) 100, 0, (double) 0.0f);
        roundVolume3.setLength((double) (byte) 0);
        java.lang.Class<?> wildcardClass6 = roundVolume3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = logic.VolumeDB.mapper;
        logic.VolumeDB.mapper = objectMapper0;
        logic.VolumeDB.mapper = objectMapper0;
        logic.VolumeDB.mapper = objectMapper0;
        logic.VolumeDB.mapper = objectMapper0;
        logic.VolumeDB.mapper = objectMapper0;
        org.junit.Assert.assertNull(objectMapper0);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList3 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
// flaky:         yourWood0.addWood((double) 1, (int) (short) 100);
        org.junit.Assert.assertNotNull(roundVolumeList1);
        org.junit.Assert.assertNotNull(roundVolumeList3);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        int int9 = roundVolume3.getDiameter();
        logic.RoundVolume roundVolume13 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume13.setLength((double) (-1.0f));
        java.lang.String str16 = roundVolume13.toString();
        roundVolume13.setLength(100.0d);
        roundVolume13.setVolume(0.0d);
        boolean boolean21 = roundVolume3.equals((java.lang.Object) 0.0d);
        logic.RoundVolume roundVolume25 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume25.setLength((double) (-1.0f));
        java.lang.String str28 = roundVolume25.toString();
        double double29 = roundVolume25.getVolume();
        int int30 = roundVolume25.getDiameter();
        double double31 = roundVolume25.getVolume();
        boolean boolean32 = roundVolume3.canEqual((java.lang.Object) double31);
        java.lang.Class<?> wildcardClass33 = roundVolume3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str16, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str28, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        int int8 = roundVolume3.getDiameter();
        double double9 = roundVolume3.getLength();
        java.lang.Class<?> wildcardClass10 = roundVolume3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setVolume(0.0d);
        java.lang.Class<?> wildcardClass11 = roundVolume3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        boolean boolean10 = roundVolume3.equals((java.lang.Object) 0.0f);
        double double11 = roundVolume3.getVolume();
        java.lang.Class<?> wildcardClass12 = roundVolume3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setDiameter((int) (byte) 0);
        java.lang.String str11 = roundVolume3.toString();
        roundVolume3.setDiameter((int) (byte) -1);
        boolean boolean15 = roundVolume3.canEqual((java.lang.Object) (-1.0d));
        int int16 = roundVolume3.getDiameter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=10.0)" + "'", str11, "RoundVolume(length=100.0, diameter=0, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        com.fasterxml.jackson.databind.ObjectMapper objectMapper0 = logic.VolumeDB.mapper;
        logic.VolumeDB.mapper = objectMapper0;
        logic.VolumeDB.mapper = objectMapper0;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = objectMapper0.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(objectMapper0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        java.lang.String str8 = roundVolume3.toString();
        double double9 = roundVolume3.getVolume();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str8, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        java.lang.Class<?> wildcardClass7 = roundVolume3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        logic.YourWood yourWood0 = new logic.YourWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.diameterFirstSortWood();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume3.setDiameter((int) (byte) 10);
        roundVolume3.setDiameter((int) (byte) -1);
        roundVolume3.setVolume((double) 10);
        double double10 = roundVolume3.getLength();
        java.lang.Class<?> wildcardClass11 = roundVolume3.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        java.lang.Class<?> wildcardClass4 = roundVolume3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        java.lang.String str10 = roundVolume3.toString();
        logic.RoundVolume roundVolume14 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume14.setDiameter((int) (byte) 10);
        java.lang.Object obj17 = null;
        boolean boolean18 = roundVolume14.canEqual(obj17);
        boolean boolean20 = roundVolume14.canEqual((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass21 = roundVolume14.getClass();
        boolean boolean22 = roundVolume3.equals((java.lang.Object) wildcardClass21);
        java.lang.Class<?> wildcardClass23 = roundVolume3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str10, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        logic.YourWood yourWood0 = new logic.YourWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.diameterFirstSortWood();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (short) 100, (int) (byte) -1, (double) (byte) 10);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (-1L), (int) (byte) -1, (double) ' ');
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setDiameter((int) (byte) 0);
        java.lang.String str11 = roundVolume3.toString();
        java.lang.Class<?> wildcardClass12 = roundVolume3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=10.0)" + "'", str11, "RoundVolume(length=100.0, diameter=0, volume=10.0)");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        java.lang.String str10 = roundVolume3.toString();
        logic.RoundVolume roundVolume14 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume14.setLength((double) 1L);
        logic.YourWood yourWood17 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList18 = yourWood17.getWood();
        yourWood17.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList20 = yourWood17.getWood();
        yourWood17.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList22 = yourWood17.getWood();
        boolean boolean23 = roundVolume14.canEqual((java.lang.Object) roundVolumeList22);
        boolean boolean24 = roundVolume3.canEqual((java.lang.Object) boolean23);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str10, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertNotNull(roundVolumeList18);
        org.junit.Assert.assertNotNull(roundVolumeList20);
        org.junit.Assert.assertNotNull(roundVolumeList22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        logic.RoundVolume roundVolume13 = new logic.RoundVolume((double) (byte) 100, 0, (double) 0.0f);
        boolean boolean14 = roundVolume3.equals((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass15 = roundVolume3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (byte) 10, (-1), (double) 'a');
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 10L, 100, (double) (byte) -1);
        java.lang.String str4 = roundVolume3.toString();
        java.lang.String str5 = roundVolume3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RoundVolume(length=10.0, diameter=100, volume=-1.0)" + "'", str4, "RoundVolume(length=10.0, diameter=100, volume=-1.0)");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "RoundVolume(length=10.0, diameter=100, volume=-1.0)" + "'", str5, "RoundVolume(length=10.0, diameter=100, volume=-1.0)");
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        roundVolume3.setVolume((double) 10.0f);
        java.lang.String str11 = roundVolume3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str11, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        roundVolume3.setDiameter((int) (byte) 100);
        logic.YourWood yourWood12 = new logic.YourWood();
        yourWood12.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList14 = yourWood12.getWood();
        boolean boolean15 = roundVolume3.equals((java.lang.Object) roundVolumeList14);
        java.lang.Class<?> wildcardClass16 = roundVolumeList14.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(roundVolumeList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        boolean boolean10 = roundVolume3.equals((java.lang.Object) 0.0f);
        double double11 = roundVolume3.getVolume();
        double double12 = roundVolume3.getVolume();
        roundVolume3.setVolume((double) (-1L));
        java.lang.String str15 = roundVolume3.toString();
        double double16 = roundVolume3.getVolume();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=-1.0)" + "'", str15, "RoundVolume(length=-1.0, diameter=1, volume=-1.0)");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume3.setDiameter((int) (byte) 10);
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getLength();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=100.0, diameter=10, volume=10.0)" + "'", str6, "RoundVolume(length=100.0, diameter=10, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 100.0d + "'", double7 == 100.0d);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        logic.YourWood yourWood0 = new logic.YourWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList2 = yourWood0.getWood();
        java.lang.Class<?> wildcardClass3 = yourWood0.getClass();
        org.junit.Assert.assertNotNull(roundVolumeList2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        logic.YourWood yourWood0 = new logic.YourWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList3 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList3);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        logic.RoundVolume roundVolume7 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        boolean boolean8 = roundVolume3.equals((java.lang.Object) (short) 1);
        java.lang.Object obj9 = null;
        boolean boolean10 = roundVolume3.equals(obj9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        int int8 = roundVolume3.getDiameter();
        double double9 = roundVolume3.getVolume();
        roundVolume3.setLength((double) ' ');
        roundVolume3.setLength((double) 100);
        roundVolume3.setLength(1.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setVolume(0.0d);
        roundVolume3.setDiameter((int) (short) 0);
        java.lang.String str13 = roundVolume3.toString();
        int int14 = roundVolume3.getDiameter();
        boolean boolean16 = roundVolume3.equals((java.lang.Object) "RoundVolume(length=100.0, diameter=-1, volume=10.0)");
        logic.RoundVolume roundVolume20 = new logic.RoundVolume((double) (byte) 100, 0, (double) 0.0f);
        roundVolume20.setLength((double) (byte) 0);
        boolean boolean23 = roundVolume3.canEqual((java.lang.Object) (byte) 0);
        roundVolume3.setDiameter((int) (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str13, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume3.setDiameter((int) (byte) 10);
        java.lang.Object obj6 = null;
        boolean boolean7 = roundVolume3.canEqual(obj6);
        double double8 = roundVolume3.getVolume();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        logic.YourWood yourWood0 = new logic.YourWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.diameterFirstSortWood();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        int int9 = roundVolume3.getDiameter();
        roundVolume3.setLength((double) (-1));
        roundVolume3.setVolume((double) 10.0f);
        logic.RoundVolume roundVolume17 = new logic.RoundVolume((double) 1, (int) 'a', (double) (byte) -1);
        logic.YourWood yourWood18 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList19 = yourWood18.getWood();
        yourWood18.lengthFirstSortWood();
        boolean boolean21 = roundVolume17.equals((java.lang.Object) yourWood18);
        boolean boolean22 = roundVolume3.canEqual((java.lang.Object) roundVolume17);
        java.lang.Class<?> wildcardClass23 = roundVolume17.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(roundVolumeList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) 1L);
        double double6 = roundVolume3.getLength();
        double double7 = roundVolume3.getVolume();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        boolean boolean10 = roundVolume3.equals((java.lang.Object) 0.0f);
        double double11 = roundVolume3.getVolume();
        double double12 = roundVolume3.getVolume();
        logic.RoundVolume roundVolume16 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume16.setLength((double) (-1.0f));
        java.lang.String str19 = roundVolume16.toString();
        double double20 = roundVolume16.getVolume();
        double double21 = roundVolume16.getLength();
        int int22 = roundVolume16.getDiameter();
        java.lang.String str23 = roundVolume16.toString();
        logic.RoundVolume roundVolume27 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume27.setDiameter((int) (byte) 10);
        java.lang.Object obj30 = null;
        boolean boolean31 = roundVolume27.canEqual(obj30);
        boolean boolean33 = roundVolume27.canEqual((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass34 = roundVolume27.getClass();
        boolean boolean35 = roundVolume16.equals((java.lang.Object) wildcardClass34);
        int int36 = roundVolume16.getDiameter();
        boolean boolean37 = roundVolume3.equals((java.lang.Object) roundVolume16);
        roundVolume3.setLength((double) (short) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str19, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str23, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        double double10 = roundVolume3.getVolume();
        roundVolume3.setLength(0.0d);
        roundVolume3.setVolume((double) 'a');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        roundVolume3.setVolume((double) 10.0f);
        roundVolume3.setLength((double) (short) 1);
        logic.YourWood yourWood13 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList14 = yourWood13.getWood();
        yourWood13.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList16 = yourWood13.getWood();
        yourWood13.lengthFirstSortWood();
        yourWood13.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList19 = yourWood13.getWood();
        boolean boolean20 = roundVolume3.canEqual((java.lang.Object) yourWood13);
        int int21 = roundVolume3.getDiameter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(roundVolumeList14);
        org.junit.Assert.assertNotNull(roundVolumeList16);
        org.junit.Assert.assertNotNull(roundVolumeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        logic.YourWood yourWood0 = new logic.YourWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList4 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        java.lang.Class<?> wildcardClass6 = yourWood0.getClass();
        org.junit.Assert.assertNotNull(roundVolumeList4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100L, (int) (byte) 100, (double) (-1));
        roundVolume3.setLength((double) (-1.0f));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) 1L);
        int int6 = roundVolume3.getDiameter();
        roundVolume3.setLength((double) ' ');
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        roundVolume3.setVolume((double) 10.0f);
        roundVolume3.setDiameter((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (short) 1, (int) (short) 100, (double) 0L);
        logic.RoundVolume roundVolume7 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume7.setDiameter((int) (byte) 10);
        java.lang.Object obj10 = null;
        boolean boolean11 = roundVolume7.canEqual(obj10);
        int int12 = roundVolume7.getDiameter();
        boolean boolean13 = roundVolume3.equals((java.lang.Object) roundVolume7);
        roundVolume7.setVolume((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setDiameter((int) (byte) 0);
        java.lang.String str11 = roundVolume3.toString();
        boolean boolean13 = roundVolume3.equals((java.lang.Object) (-1L));
        roundVolume3.setDiameter((int) '4');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=10.0)" + "'", str11, "RoundVolume(length=100.0, diameter=0, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (short) 1, (int) (short) 100, (double) 0L);
        logic.RoundVolume roundVolume7 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume7.setDiameter((int) (byte) 10);
        java.lang.Object obj10 = null;
        boolean boolean11 = roundVolume7.canEqual(obj10);
        int int12 = roundVolume7.getDiameter();
        boolean boolean13 = roundVolume3.equals((java.lang.Object) roundVolume7);
        roundVolume7.setVolume((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setVolume(0.0d);
        roundVolume3.setDiameter((int) (short) 0);
        int int13 = roundVolume3.getDiameter();
        logic.YourWood yourWood14 = new logic.YourWood();
        yourWood14.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList16 = yourWood14.getWood();
        yourWood14.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList18 = yourWood14.getWood();
// flaky:         yourWood14.addWood((double) 1L, (int) (short) 100);
        boolean boolean22 = roundVolume3.equals((java.lang.Object) (short) 100);
        roundVolume3.setLength((double) '4');
        java.lang.Class<?> wildcardClass25 = roundVolume3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(roundVolumeList16);
        org.junit.Assert.assertNotNull(roundVolumeList18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 10L, 100, (double) (byte) -1);
        java.lang.String str4 = roundVolume3.toString();
        logic.RoundVolume roundVolume8 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume8.setLength((double) (-1.0f));
        java.lang.String str11 = roundVolume8.toString();
        roundVolume8.setLength(100.0d);
        roundVolume8.setLength((double) 100L);
        logic.YourWood yourWood16 = new logic.YourWood();
        yourWood16.lengthFirstSortWood();
        yourWood16.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList19 = yourWood16.getWood();
        boolean boolean20 = roundVolume8.canEqual((java.lang.Object) yourWood16);
        boolean boolean21 = roundVolume3.equals((java.lang.Object) yourWood16);
        java.lang.Class<?> wildcardClass22 = yourWood16.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RoundVolume(length=10.0, diameter=100, volume=-1.0)" + "'", str4, "RoundVolume(length=10.0, diameter=100, volume=-1.0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str11, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertNotNull(roundVolumeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setVolume(0.0d);
        roundVolume3.setDiameter((int) (short) 0);
        int int13 = roundVolume3.getDiameter();
        java.lang.String str14 = roundVolume3.toString();
        java.lang.Class<?> wildcardClass15 = roundVolume3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str14, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        int int8 = roundVolume3.getDiameter();
        double double9 = roundVolume3.getVolume();
        java.lang.Object obj10 = null;
        boolean boolean11 = roundVolume3.equals(obj10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        double double6 = roundVolume3.getVolume();
        logic.RoundVolume roundVolume7 = new logic.RoundVolume();
        double double8 = roundVolume7.getVolume();
        logic.YourWood yourWood9 = new logic.YourWood();
        yourWood9.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList11 = yourWood9.getWood();
        boolean boolean12 = roundVolume7.canEqual((java.lang.Object) yourWood9);
        logic.YourWood yourWood13 = new logic.YourWood();
        yourWood13.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList15 = yourWood13.getWood();
        yourWood13.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList17 = yourWood13.getWood();
// flaky:         yourWood13.addWood((double) 1L, (int) (short) 100);
        boolean boolean21 = roundVolume7.canEqual((java.lang.Object) 1L);
        boolean boolean22 = roundVolume3.equals((java.lang.Object) 1L);
        roundVolume3.setLength((double) 10);
        java.lang.Class<?> wildcardClass25 = roundVolume3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(roundVolumeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(roundVolumeList15);
        org.junit.Assert.assertNotNull(roundVolumeList17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        logic.YourWood yourWood0 = new logic.YourWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList2 = yourWood0.getWood();
        yourWood0.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList4 = yourWood0.getWood();
        yourWood0.diameterFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList2);
        org.junit.Assert.assertNotNull(roundVolumeList4);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (-1), (int) ' ', (double) 100);
        double double4 = roundVolume3.getVolume();
        roundVolume3.setLength((double) (byte) 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (byte) 10, (int) ' ', (double) 10L);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        roundVolume3.setDiameter((int) (byte) 100);
        roundVolume3.setDiameter((int) (short) 10);
        double double14 = roundVolume3.getLength();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (byte) 0, 0, (double) (byte) 10);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        logic.RoundVolume roundVolume0 = new logic.RoundVolume();
        java.lang.Class<?> wildcardClass1 = roundVolume0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setVolume(0.0d);
        roundVolume3.setDiameter((int) (short) 0);
        java.lang.String str13 = roundVolume3.toString();
        double double14 = roundVolume3.getVolume();
        logic.RoundVolume roundVolume18 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume18.setLength((double) (-1.0f));
        java.lang.String str21 = roundVolume18.toString();
        double double22 = roundVolume18.getVolume();
        double double23 = roundVolume18.getLength();
        int int24 = roundVolume18.getDiameter();
        java.lang.String str25 = roundVolume18.toString();
        logic.RoundVolume roundVolume29 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume29.setDiameter((int) (byte) 10);
        java.lang.Object obj32 = null;
        boolean boolean33 = roundVolume29.canEqual(obj32);
        boolean boolean35 = roundVolume29.canEqual((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass36 = roundVolume29.getClass();
        boolean boolean37 = roundVolume18.equals((java.lang.Object) wildcardClass36);
        logic.RoundVolume roundVolume41 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume41.setLength((double) (-1.0f));
        java.lang.String str44 = roundVolume41.toString();
        double double45 = roundVolume41.getVolume();
        double double46 = roundVolume41.getLength();
        int int47 = roundVolume41.getDiameter();
        roundVolume41.setVolume((double) (-1));
        roundVolume41.setVolume((double) 10.0f);
        boolean boolean52 = roundVolume18.equals((java.lang.Object) 10.0f);
        boolean boolean53 = roundVolume3.canEqual((java.lang.Object) roundVolume18);
        roundVolume18.setDiameter(100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str13, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str21, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str25, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str44, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1.0d) + "'", double46 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (short) 100, 10, (double) (byte) 100);
        java.lang.Class<?> wildcardClass4 = roundVolume3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setLength((double) 100L);
        java.lang.Class<?> wildcardClass11 = roundVolume3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        logic.YourWood yourWood0 = new logic.YourWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.diameterFirstSortWood();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume(100.0d, 1, (double) '4');
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList6 = yourWood0.getWood();
        org.junit.Assert.assertNotNull(roundVolumeList1);
        org.junit.Assert.assertNotNull(roundVolumeList6);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setDiameter((int) (byte) 0);
        roundVolume3.setDiameter((int) (byte) 10);
        java.lang.String str13 = roundVolume3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RoundVolume(length=100.0, diameter=10, volume=10.0)" + "'", str13, "RoundVolume(length=100.0, diameter=10, volume=10.0)");
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        logic.RoundVolume roundVolume0 = new logic.RoundVolume();
        double double1 = roundVolume0.getVolume();
        int int2 = roundVolume0.getDiameter();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setLength((double) 100L);
        roundVolume3.setVolume((double) (short) -1);
        logic.RoundVolume roundVolume16 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume16.setLength((double) (-1.0f));
        java.lang.String str19 = roundVolume16.toString();
        double double20 = roundVolume16.getVolume();
        java.lang.String str21 = roundVolume16.toString();
        boolean boolean22 = roundVolume3.equals((java.lang.Object) roundVolume16);
        double double23 = roundVolume16.getVolume();
        double double24 = roundVolume16.getVolume();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str19, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str21, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        logic.YourWood yourWood0 = new logic.YourWood();
        yourWood0.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList2 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList4 = yourWood0.getWood();
        org.junit.Assert.assertNotNull(roundVolumeList2);
        org.junit.Assert.assertNotNull(roundVolumeList4);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        logic.RoundVolume roundVolume0 = new logic.RoundVolume();
        double double1 = roundVolume0.getVolume();
        logic.YourWood yourWood2 = new logic.YourWood();
        yourWood2.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList4 = yourWood2.getWood();
        boolean boolean5 = roundVolume0.canEqual((java.lang.Object) yourWood2);
        double double6 = roundVolume0.getLength();
        logic.RoundVolume roundVolume10 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume10.setLength((double) (-1.0f));
        java.lang.String str13 = roundVolume10.toString();
        double double14 = roundVolume10.getVolume();
        double double15 = roundVolume10.getVolume();
        boolean boolean17 = roundVolume10.equals((java.lang.Object) "");
        double double18 = roundVolume10.getLength();
        boolean boolean19 = roundVolume0.canEqual((java.lang.Object) double18);
        java.lang.String str20 = roundVolume0.toString();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roundVolumeList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str13, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "RoundVolume(length=0.0, diameter=0, volume=0.0)" + "'", str20, "RoundVolume(length=0.0, diameter=0, volume=0.0)");
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        boolean boolean10 = roundVolume3.equals((java.lang.Object) 0.0f);
        java.lang.Class<?> wildcardClass11 = roundVolume3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setDiameter((int) (byte) 0);
        java.lang.String str11 = roundVolume3.toString();
        roundVolume3.setDiameter((int) (byte) -1);
        boolean boolean15 = roundVolume3.canEqual((java.lang.Object) (-1.0d));
        roundVolume3.setVolume((double) 1.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=10.0)" + "'", str11, "RoundVolume(length=100.0, diameter=0, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, 0, (double) 1);
        double double4 = roundVolume3.getVolume();
        logic.RoundVolume roundVolume8 = new logic.RoundVolume((double) 1.0f, (int) 'a', (double) 'a');
        roundVolume8.setLength((double) 1.0f);
        boolean boolean11 = roundVolume3.canEqual((java.lang.Object) 1.0f);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        roundVolume3.setDiameter((int) (byte) 100);
        roundVolume3.setVolume((double) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        roundVolume3.setVolume((double) 10.0f);
        roundVolume3.setLength((double) (short) 1);
        logic.YourWood yourWood13 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList14 = yourWood13.getWood();
        yourWood13.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList16 = yourWood13.getWood();
        yourWood13.lengthFirstSortWood();
        yourWood13.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList19 = yourWood13.getWood();
        boolean boolean20 = roundVolume3.canEqual((java.lang.Object) yourWood13);
        roundVolume3.setVolume((double) ' ');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(roundVolumeList14);
        org.junit.Assert.assertNotNull(roundVolumeList16);
        org.junit.Assert.assertNotNull(roundVolumeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0.0f, (int) (short) 100, (double) (-1L));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        logic.YourWood yourWood10 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList11 = yourWood10.getWood();
        yourWood10.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList13 = yourWood10.getWood();
        yourWood10.lengthFirstSortWood();
        yourWood10.diameterFirstSortWood();
        boolean boolean16 = roundVolume3.equals((java.lang.Object) yourWood10);
        yourWood10.lengthFirstSortWood();
        yourWood10.lengthFirstSortWood();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(roundVolumeList11);
        org.junit.Assert.assertNotNull(roundVolumeList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        logic.RoundVolume roundVolume0 = new logic.RoundVolume();
        double double1 = roundVolume0.getVolume();
        logic.RoundVolume roundVolume5 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume5.setLength((double) (-1.0f));
        java.lang.String str8 = roundVolume5.toString();
        roundVolume5.setLength(100.0d);
        roundVolume5.setVolume(0.0d);
        logic.RoundVolume roundVolume16 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume16.setLength((double) 1L);
        boolean boolean19 = roundVolume5.canEqual((java.lang.Object) roundVolume16);
        boolean boolean20 = roundVolume0.canEqual((java.lang.Object) roundVolume5);
        double double21 = roundVolume0.getVolume();
        double double22 = roundVolume0.getLength();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str8, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume3.setDiameter((int) (byte) 10);
        java.lang.Object obj6 = null;
        boolean boolean7 = roundVolume3.canEqual(obj6);
        int int8 = roundVolume3.getDiameter();
        int int9 = roundVolume3.getDiameter();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        int int9 = roundVolume3.getDiameter();
        roundVolume3.setLength((double) (-1));
        roundVolume3.setVolume((double) 10.0f);
        logic.RoundVolume roundVolume17 = new logic.RoundVolume((double) 1, (int) 'a', (double) (byte) -1);
        logic.YourWood yourWood18 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList19 = yourWood18.getWood();
        yourWood18.lengthFirstSortWood();
        boolean boolean21 = roundVolume17.equals((java.lang.Object) yourWood18);
        boolean boolean22 = roundVolume3.canEqual((java.lang.Object) roundVolume17);
        double double23 = roundVolume3.getVolume();
        double double24 = roundVolume3.getLength();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(roundVolumeList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        roundVolume3.setVolume((double) (-1));
        roundVolume3.setVolume((double) 10.0f);
        roundVolume3.setVolume((double) 0);
        int int16 = roundVolume3.getDiameter();
        roundVolume3.setDiameter(0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
// flaky:         yourWood0.addWood((double) 10, 10);
        java.util.ArrayList<logic.RoundVolume> roundVolumeList5 = yourWood0.getWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList9 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.lengthFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList1);
        org.junit.Assert.assertNotNull(roundVolumeList5);
        org.junit.Assert.assertNotNull(roundVolumeList9);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume(0.0d, (int) (byte) -1, (double) (short) 10);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        double double10 = roundVolume3.getVolume();
        roundVolume3.setLength(0.0d);
        double double13 = roundVolume3.getLength();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        logic.RoundVolume roundVolume0 = new logic.RoundVolume();
        double double1 = roundVolume0.getVolume();
        logic.RoundVolume roundVolume5 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume5.setLength((double) (-1.0f));
        java.lang.String str8 = roundVolume5.toString();
        roundVolume5.setLength(100.0d);
        roundVolume5.setVolume(0.0d);
        logic.RoundVolume roundVolume16 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume16.setLength((double) 1L);
        boolean boolean19 = roundVolume5.canEqual((java.lang.Object) roundVolume16);
        boolean boolean20 = roundVolume0.canEqual((java.lang.Object) roundVolume5);
        logic.RoundVolume roundVolume24 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume24.setLength((double) (-1.0f));
        java.lang.String str27 = roundVolume24.toString();
        double double28 = roundVolume24.getVolume();
        double double29 = roundVolume24.getLength();
        int int30 = roundVolume24.getDiameter();
        roundVolume24.setDiameter((int) (byte) 100);
        logic.YourWood yourWood33 = new logic.YourWood();
        yourWood33.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList35 = yourWood33.getWood();
        boolean boolean36 = roundVolume24.equals((java.lang.Object) roundVolumeList35);
        roundVolume24.setDiameter((int) 'a');
        roundVolume24.setDiameter((-1));
        boolean boolean41 = roundVolume5.canEqual((java.lang.Object) (-1));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str8, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str27, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + (-1.0d) + "'", double29 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertNotNull(roundVolumeList35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        double double9 = roundVolume3.getLength();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume3.setDiameter((int) (byte) 10);
        java.lang.Object obj6 = null;
        boolean boolean7 = roundVolume3.canEqual(obj6);
        int int8 = roundVolume3.getDiameter();
        double double9 = roundVolume3.getLength();
        logic.RoundVolume roundVolume13 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume13.setLength((double) (-1.0f));
        java.lang.String str16 = roundVolume13.toString();
        double double17 = roundVolume13.getVolume();
        double double18 = roundVolume13.getLength();
        int int19 = roundVolume13.getDiameter();
        roundVolume13.setVolume((double) (-1));
        roundVolume13.setVolume((double) 10.0f);
        boolean boolean25 = roundVolume13.canEqual((java.lang.Object) 10.0f);
        boolean boolean26 = roundVolume3.canEqual((java.lang.Object) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str16, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setVolume(0.0d);
        roundVolume3.setDiameter((int) (short) 0);
        java.lang.String str13 = roundVolume3.toString();
        int int14 = roundVolume3.getDiameter();
        boolean boolean16 = roundVolume3.equals((java.lang.Object) "RoundVolume(length=100.0, diameter=-1, volume=10.0)");
        java.lang.Class<?> wildcardClass17 = roundVolume3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str13, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getLength();
        int int8 = roundVolume3.getDiameter();
        roundVolume3.setLength((double) (-1));
        java.lang.String str11 = roundVolume3.toString();
        logic.RoundVolume roundVolume15 = new logic.RoundVolume((double) (-1), (int) ' ', (double) 100);
        java.lang.Class<?> wildcardClass16 = roundVolume15.getClass();
        boolean boolean17 = roundVolume3.equals((java.lang.Object) wildcardClass16);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str11, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        logic.RoundVolume roundVolume0 = new logic.RoundVolume();
        double double1 = roundVolume0.getVolume();
        logic.YourWood yourWood2 = new logic.YourWood();
        yourWood2.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList4 = yourWood2.getWood();
        boolean boolean5 = roundVolume0.canEqual((java.lang.Object) yourWood2);
        java.lang.String str6 = roundVolume0.toString();
        roundVolume0.setLength((double) (short) 1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roundVolumeList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=0.0, diameter=0, volume=0.0)" + "'", str6, "RoundVolume(length=0.0, diameter=0, volume=0.0)");
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        logic.YourWood yourWood0 = new logic.YourWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList2 = yourWood0.getWood();
        yourWood0.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList4 = yourWood0.getWood();
// flaky:         yourWood0.addWood((double) 1L, (int) (short) 100);
        java.util.ArrayList<logic.RoundVolume> roundVolumeList8 = yourWood0.getWood();
        yourWood0.diameterFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList2);
        org.junit.Assert.assertNotNull(roundVolumeList4);
        org.junit.Assert.assertNotNull(roundVolumeList8);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        roundVolume3.setVolume((double) 10.0f);
        double double11 = roundVolume3.getVolume();
        double double12 = roundVolume3.getVolume();
        double double13 = roundVolume3.getVolume();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
// flaky:         yourWood0.addWood((double) 1L, (int) (byte) 100);
        yourWood0.lengthFirstSortWood();
        yourWood0.diameterFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList1);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume3.setDiameter((int) (byte) 10);
        roundVolume3.setDiameter((int) (byte) -1);
        int int8 = roundVolume3.getDiameter();
        double double9 = roundVolume3.getLength();
        java.lang.String str10 = roundVolume3.toString();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RoundVolume(length=100.0, diameter=-1, volume=10.0)" + "'", str10, "RoundVolume(length=100.0, diameter=-1, volume=10.0)");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 10L, 1, (double) '#');
        double double4 = roundVolume3.getLength();
        double double5 = roundVolume3.getLength();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setLength((double) 100L);
        roundVolume3.setVolume((double) (short) -1);
        logic.RoundVolume roundVolume16 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume16.setLength((double) (-1.0f));
        java.lang.String str19 = roundVolume16.toString();
        double double20 = roundVolume16.getVolume();
        java.lang.String str21 = roundVolume16.toString();
        boolean boolean22 = roundVolume3.equals((java.lang.Object) roundVolume16);
        logic.YourWood yourWood23 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList24 = yourWood23.getWood();
// flaky:         yourWood23.addWood((double) 10, 10);
        java.util.ArrayList<logic.RoundVolume> roundVolumeList28 = yourWood23.getWood();
        boolean boolean29 = roundVolume16.equals((java.lang.Object) roundVolumeList28);
        logic.RoundVolume roundVolume33 = new logic.RoundVolume((double) 'a', (int) (byte) 0, (double) '#');
        boolean boolean34 = roundVolume16.equals((java.lang.Object) 'a');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str19, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str21, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(roundVolumeList24);
        org.junit.Assert.assertNotNull(roundVolumeList28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
// flaky:         yourWood0.addWood((double) 10, 10);
        java.util.ArrayList<logic.RoundVolume> roundVolumeList5 = yourWood0.getWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList6 = yourWood0.getWood();
        org.junit.Assert.assertNotNull(roundVolumeList1);
        org.junit.Assert.assertNotNull(roundVolumeList5);
        org.junit.Assert.assertNotNull(roundVolumeList6);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        boolean boolean10 = roundVolume3.equals((java.lang.Object) 0.0f);
        double double11 = roundVolume3.getVolume();
        roundVolume3.setLength((double) 100L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList3 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList5 = yourWood0.getWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList6 = yourWood0.getWood();
        yourWood0.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList8 = yourWood0.getWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.lengthFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList1);
        org.junit.Assert.assertNotNull(roundVolumeList3);
        org.junit.Assert.assertNotNull(roundVolumeList5);
        org.junit.Assert.assertNotNull(roundVolumeList6);
        org.junit.Assert.assertNotNull(roundVolumeList8);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        logic.RoundVolume roundVolume0 = new logic.RoundVolume();
        java.lang.String str1 = roundVolume0.toString();
        roundVolume0.setDiameter((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "RoundVolume(length=0.0, diameter=0, volume=0.0)" + "'", str1, "RoundVolume(length=0.0, diameter=0, volume=0.0)");
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getLength();
        int int8 = roundVolume3.getDiameter();
        roundVolume3.setLength((double) (-1));
        java.lang.String str11 = roundVolume3.toString();
        logic.YourWood yourWood12 = new logic.YourWood();
        yourWood12.lengthFirstSortWood();
        yourWood12.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList15 = yourWood12.getWood();
        boolean boolean16 = roundVolume3.canEqual((java.lang.Object) yourWood12);
        java.lang.Class<?> wildcardClass17 = roundVolume3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str11, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertNotNull(roundVolumeList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (-1.0f), (int) (short) 10, (double) (short) 10);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume3.setDiameter((int) (byte) 10);
        roundVolume3.setDiameter((int) (byte) -1);
        roundVolume3.setVolume((double) 10);
        double double10 = roundVolume3.getLength();
        java.lang.String str11 = roundVolume3.toString();
        double double12 = roundVolume3.getLength();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=100.0, diameter=-1, volume=10.0)" + "'", str11, "RoundVolume(length=100.0, diameter=-1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        java.lang.String str8 = roundVolume3.toString();
        logic.RoundVolume roundVolume12 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume12.setDiameter((int) (byte) 10);
        java.lang.Object obj15 = null;
        boolean boolean16 = roundVolume12.canEqual(obj15);
        boolean boolean17 = roundVolume3.canEqual((java.lang.Object) boolean16);
        roundVolume3.setDiameter((int) (short) -1);
        roundVolume3.setDiameter((int) (byte) 1);
        int int22 = roundVolume3.getDiameter();
        java.lang.Class<?> wildcardClass23 = roundVolume3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str8, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        logic.YourWood yourWood0 = new logic.YourWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList5 = yourWood0.getWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList6 = yourWood0.getWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList7 = yourWood0.getWood();
        org.junit.Assert.assertNotNull(roundVolumeList5);
        org.junit.Assert.assertNotNull(roundVolumeList6);
        org.junit.Assert.assertNotNull(roundVolumeList7);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        java.lang.String str8 = roundVolume3.toString();
        java.lang.String str9 = roundVolume3.toString();
        double double10 = roundVolume3.getVolume();
        roundVolume3.setDiameter(1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str8, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str9, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList2 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.lengthFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList1);
        org.junit.Assert.assertNotNull(roundVolumeList2);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        logic.YourWood yourWood0 = new logic.YourWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.lengthFirstSortWood();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
// flaky:         yourWood0.addWood((double) 10, 10);
        yourWood0.lengthFirstSortWood();
        java.lang.Class<?> wildcardClass6 = yourWood0.getClass();
        org.junit.Assert.assertNotNull(roundVolumeList1);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume3.setDiameter((int) (byte) 10);
        roundVolume3.setDiameter((int) (byte) -1);
        roundVolume3.setVolume((double) 10);
        double double10 = roundVolume3.getLength();
        java.lang.String str11 = roundVolume3.toString();
        double double12 = roundVolume3.getVolume();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=100.0, diameter=-1, volume=10.0)" + "'", str11, "RoundVolume(length=100.0, diameter=-1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (short) -1, (int) (byte) 0, (double) (-1L));
        logic.RoundVolume roundVolume7 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume7.setDiameter((int) (byte) 10);
        java.lang.Object obj10 = null;
        boolean boolean11 = roundVolume7.canEqual(obj10);
        boolean boolean13 = roundVolume7.canEqual((java.lang.Object) 10L);
        java.lang.String str14 = roundVolume7.toString();
        boolean boolean15 = roundVolume3.equals((java.lang.Object) str14);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "RoundVolume(length=100.0, diameter=10, volume=10.0)" + "'", str14, "RoundVolume(length=100.0, diameter=10, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) 1L);
        logic.YourWood yourWood6 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList7 = yourWood6.getWood();
        yourWood6.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList9 = yourWood6.getWood();
        yourWood6.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList11 = yourWood6.getWood();
        boolean boolean12 = roundVolume3.canEqual((java.lang.Object) roundVolumeList11);
        roundVolume3.setLength((double) '#');
        int int15 = roundVolume3.getDiameter();
        roundVolume3.setVolume(1.0d);
        org.junit.Assert.assertNotNull(roundVolumeList7);
        org.junit.Assert.assertNotNull(roundVolumeList9);
        org.junit.Assert.assertNotNull(roundVolumeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 1, (int) 'a', (double) (byte) -1);
        logic.YourWood yourWood4 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList5 = yourWood4.getWood();
        yourWood4.lengthFirstSortWood();
        boolean boolean7 = roundVolume3.equals((java.lang.Object) yourWood4);
        yourWood4.diameterFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (byte) 1, (int) (short) 0, (double) (-1.0f));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        java.lang.String str10 = roundVolume3.toString();
        logic.RoundVolume roundVolume14 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume14.setDiameter((int) (byte) 10);
        java.lang.Object obj17 = null;
        boolean boolean18 = roundVolume14.canEqual(obj17);
        boolean boolean20 = roundVolume14.canEqual((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass21 = roundVolume14.getClass();
        boolean boolean22 = roundVolume3.equals((java.lang.Object) wildcardClass21);
        logic.RoundVolume roundVolume26 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume26.setLength((double) (-1.0f));
        java.lang.String str29 = roundVolume26.toString();
        double double30 = roundVolume26.getVolume();
        double double31 = roundVolume26.getLength();
        int int32 = roundVolume26.getDiameter();
        roundVolume26.setVolume((double) (-1));
        roundVolume26.setVolume((double) 10.0f);
        boolean boolean37 = roundVolume3.equals((java.lang.Object) 10.0f);
        int int38 = roundVolume3.getDiameter();
        roundVolume3.setDiameter((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str10, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str29, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setLength((double) 100L);
        roundVolume3.setVolume((double) (short) -1);
        logic.RoundVolume roundVolume16 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume16.setLength((double) (-1.0f));
        java.lang.String str19 = roundVolume16.toString();
        double double20 = roundVolume16.getVolume();
        java.lang.String str21 = roundVolume16.toString();
        boolean boolean22 = roundVolume3.equals((java.lang.Object) roundVolume16);
        logic.YourWood yourWood23 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList24 = yourWood23.getWood();
// flaky:         yourWood23.addWood((double) 10, 10);
        java.util.ArrayList<logic.RoundVolume> roundVolumeList28 = yourWood23.getWood();
        boolean boolean29 = roundVolume16.equals((java.lang.Object) roundVolumeList28);
        double double30 = roundVolume16.getVolume();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str19, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str21, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(roundVolumeList24);
        org.junit.Assert.assertNotNull(roundVolumeList28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100, (int) (byte) 100, 10.0d);
        java.lang.String str4 = roundVolume3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RoundVolume(length=100.0, diameter=100, volume=10.0)" + "'", str4, "RoundVolume(length=100.0, diameter=100, volume=10.0)");
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getLength();
        int int8 = roundVolume3.getDiameter();
        roundVolume3.setLength((double) (-1));
        java.lang.String str11 = roundVolume3.toString();
        logic.YourWood yourWood12 = new logic.YourWood();
        yourWood12.lengthFirstSortWood();
        yourWood12.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList15 = yourWood12.getWood();
        boolean boolean16 = roundVolume3.canEqual((java.lang.Object) yourWood12);
        boolean boolean18 = roundVolume3.canEqual((java.lang.Object) (short) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str11, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertNotNull(roundVolumeList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        logic.RoundVolume roundVolume0 = new logic.RoundVolume();
        double double1 = roundVolume0.getVolume();
        logic.YourWood yourWood2 = new logic.YourWood();
        yourWood2.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList4 = yourWood2.getWood();
        boolean boolean5 = roundVolume0.canEqual((java.lang.Object) yourWood2);
        roundVolume0.setLength((double) 100L);
        boolean boolean9 = roundVolume0.equals((java.lang.Object) "RoundVolume(length=100.0, diameter=1, volume=0.0)");
        double double10 = roundVolume0.getVolume();
        java.lang.String str11 = roundVolume0.toString();
        roundVolume0.setVolume((double) (-1.0f));
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roundVolumeList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str11, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        logic.YourWood yourWood0 = new logic.YourWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList6 = yourWood0.getWood();
        org.junit.Assert.assertNotNull(roundVolumeList6);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        roundVolume3.setDiameter((int) (byte) 100);
        roundVolume3.setVolume((double) 0);
        logic.RoundVolume roundVolume17 = new logic.RoundVolume(0.0d, (-1), (double) (byte) 100);
        java.lang.Class<?> wildcardClass18 = roundVolume17.getClass();
        boolean boolean19 = roundVolume3.canEqual((java.lang.Object) roundVolume17);
        java.lang.String str20 = roundVolume17.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "RoundVolume(length=0.0, diameter=-1, volume=100.0)" + "'", str20, "RoundVolume(length=0.0, diameter=-1, volume=100.0)");
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setVolume(0.0d);
        roundVolume3.setDiameter((int) (short) 0);
        java.lang.String str13 = roundVolume3.toString();
        roundVolume3.setLength((double) (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str13, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 1, (int) (byte) 10, (double) (-1L));
        roundVolume3.setLength((double) ' ');
        double double6 = roundVolume3.getLength();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 32.0d + "'", double6 == 32.0d);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        int int9 = roundVolume3.getDiameter();
        roundVolume3.setLength((double) (-1));
        roundVolume3.setVolume((double) 10.0f);
        logic.RoundVolume roundVolume17 = new logic.RoundVolume((double) 1, (int) 'a', (double) (byte) -1);
        logic.YourWood yourWood18 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList19 = yourWood18.getWood();
        yourWood18.lengthFirstSortWood();
        boolean boolean21 = roundVolume17.equals((java.lang.Object) yourWood18);
        boolean boolean22 = roundVolume3.canEqual((java.lang.Object) roundVolume17);
        roundVolume17.setLength((double) (byte) -1);
        logic.RoundVolume roundVolume28 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume28.setLength((double) (-1.0f));
        java.lang.String str31 = roundVolume28.toString();
        double double32 = roundVolume28.getVolume();
        double double33 = roundVolume28.getLength();
        roundVolume28.setVolume((double) 10.0f);
        double double36 = roundVolume28.getVolume();
        roundVolume28.setLength((double) (short) 10);
        boolean boolean39 = roundVolume17.equals((java.lang.Object) (short) 10);
        roundVolume17.setLength((double) (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(roundVolumeList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str31, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        logic.YourWood yourWood0 = new logic.YourWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList3 = yourWood0.getWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList4 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        java.lang.Class<?> wildcardClass6 = yourWood0.getClass();
        org.junit.Assert.assertNotNull(roundVolumeList3);
        org.junit.Assert.assertNotNull(roundVolumeList4);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 10L, 100, (double) (byte) -1);
        java.lang.String str4 = roundVolume3.toString();
        logic.RoundVolume roundVolume8 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume8.setLength((double) (-1.0f));
        java.lang.String str11 = roundVolume8.toString();
        roundVolume8.setLength(100.0d);
        roundVolume8.setLength((double) 100L);
        logic.YourWood yourWood16 = new logic.YourWood();
        yourWood16.lengthFirstSortWood();
        yourWood16.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList19 = yourWood16.getWood();
        boolean boolean20 = roundVolume8.canEqual((java.lang.Object) yourWood16);
        boolean boolean21 = roundVolume3.equals((java.lang.Object) yourWood16);
        yourWood16.diameterFirstSortWood();
        java.lang.Class<?> wildcardClass23 = yourWood16.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RoundVolume(length=10.0, diameter=100, volume=-1.0)" + "'", str4, "RoundVolume(length=10.0, diameter=100, volume=-1.0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str11, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertNotNull(roundVolumeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 1, (int) (byte) 10, (double) (-1L));
        roundVolume3.setLength((double) ' ');
        logic.RoundVolume roundVolume6 = new logic.RoundVolume();
        logic.YourWood yourWood7 = new logic.YourWood();
        yourWood7.diameterFirstSortWood();
        yourWood7.diameterFirstSortWood();
        yourWood7.lengthFirstSortWood();
        yourWood7.lengthFirstSortWood();
        boolean boolean12 = roundVolume6.equals((java.lang.Object) yourWood7);
        java.util.ArrayList<logic.RoundVolume> roundVolumeList13 = yourWood7.getWood();
        boolean boolean14 = roundVolume3.canEqual((java.lang.Object) roundVolumeList13);
        roundVolume3.setLength((double) '4');
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(roundVolumeList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        logic.YourWood yourWood0 = new logic.YourWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.lengthFirstSortWood();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) 1L);
        int int6 = roundVolume3.getDiameter();
        java.lang.String str7 = roundVolume3.toString();
        roundVolume3.setLength((double) (byte) 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "RoundVolume(length=1.0, diameter=1, volume=10.0)" + "'", str7, "RoundVolume(length=1.0, diameter=1, volume=10.0)");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.diameterFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList1);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        boolean boolean10 = roundVolume3.equals((java.lang.Object) "");
        roundVolume3.setLength(0.0d);
        roundVolume3.setLength((double) (-1.0f));
        int int15 = roundVolume3.getDiameter();
        roundVolume3.setVolume((double) 'a');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
// flaky:         yourWood0.addWood((double) 10, 10);
        java.util.ArrayList<logic.RoundVolume> roundVolumeList5 = yourWood0.getWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.lengthFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList1);
        org.junit.Assert.assertNotNull(roundVolumeList5);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (short) -1, (int) (byte) 0, (double) (-1L));
        roundVolume3.setDiameter((int) (byte) 100);
        java.lang.String str6 = roundVolume3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=100, volume=-1.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=100, volume=-1.0)");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        int int9 = roundVolume3.getDiameter();
        logic.RoundVolume roundVolume13 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume13.setLength((double) (-1.0f));
        java.lang.String str16 = roundVolume13.toString();
        roundVolume13.setLength(100.0d);
        roundVolume13.setVolume(0.0d);
        boolean boolean21 = roundVolume3.equals((java.lang.Object) 0.0d);
        logic.RoundVolume roundVolume25 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume25.setLength((double) (-1.0f));
        java.lang.String str28 = roundVolume25.toString();
        double double29 = roundVolume25.getVolume();
        int int30 = roundVolume25.getDiameter();
        double double31 = roundVolume25.getVolume();
        boolean boolean32 = roundVolume3.canEqual((java.lang.Object) double31);
        double double33 = roundVolume3.getVolume();
        roundVolume3.setDiameter((int) ' ');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str16, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str28, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        logic.RoundVolume roundVolume0 = new logic.RoundVolume();
        double double1 = roundVolume0.getVolume();
        logic.RoundVolume roundVolume5 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume5.setLength((double) (-1.0f));
        java.lang.String str8 = roundVolume5.toString();
        roundVolume5.setLength(100.0d);
        roundVolume5.setVolume(0.0d);
        logic.RoundVolume roundVolume16 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume16.setLength((double) 1L);
        boolean boolean19 = roundVolume5.canEqual((java.lang.Object) roundVolume16);
        boolean boolean20 = roundVolume0.canEqual((java.lang.Object) roundVolume5);
        roundVolume0.setVolume((double) ' ');
        roundVolume0.setVolume(32.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str8, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((-1.0d), (-1), (double) (-1));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        logic.YourWood yourWood0 = new logic.YourWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList3 = yourWood0.getWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList4 = yourWood0.getWood();
        yourWood0.diameterFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList3);
        org.junit.Assert.assertNotNull(roundVolumeList4);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (short) 1, (int) (short) 100, (double) 0L);
        logic.RoundVolume roundVolume7 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume7.setDiameter((int) (byte) 10);
        java.lang.Object obj10 = null;
        boolean boolean11 = roundVolume7.canEqual(obj10);
        int int12 = roundVolume7.getDiameter();
        boolean boolean13 = roundVolume3.equals((java.lang.Object) roundVolume7);
        java.lang.String str14 = roundVolume7.toString();
        roundVolume7.setVolume((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "RoundVolume(length=100.0, diameter=10, volume=10.0)" + "'", str14, "RoundVolume(length=100.0, diameter=10, volume=10.0)");
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        int int9 = roundVolume3.getDiameter();
        roundVolume3.setLength((double) (-1));
        roundVolume3.setVolume((double) 10.0f);
        logic.RoundVolume roundVolume17 = new logic.RoundVolume((double) 1, (int) 'a', (double) (byte) -1);
        logic.YourWood yourWood18 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList19 = yourWood18.getWood();
        yourWood18.lengthFirstSortWood();
        boolean boolean21 = roundVolume17.equals((java.lang.Object) yourWood18);
        boolean boolean22 = roundVolume3.canEqual((java.lang.Object) roundVolume17);
        double double23 = roundVolume3.getVolume();
        int int24 = roundVolume3.getDiameter();
        int int25 = roundVolume3.getDiameter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(roundVolumeList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setVolume(0.0d);
        roundVolume3.setDiameter((int) (short) 0);
        int int13 = roundVolume3.getDiameter();
        java.lang.String str14 = roundVolume3.toString();
        double double15 = roundVolume3.getVolume();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str14, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        roundVolume3.setVolume((double) 10.0f);
        roundVolume3.setLength((double) (short) 1);
        logic.YourWood yourWood13 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList14 = yourWood13.getWood();
        yourWood13.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList16 = yourWood13.getWood();
        yourWood13.lengthFirstSortWood();
        yourWood13.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList19 = yourWood13.getWood();
        boolean boolean20 = roundVolume3.canEqual((java.lang.Object) yourWood13);
        yourWood13.diameterFirstSortWood();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertNotNull(roundVolumeList14);
        org.junit.Assert.assertNotNull(roundVolumeList16);
        org.junit.Assert.assertNotNull(roundVolumeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        logic.RoundVolume roundVolume0 = new logic.RoundVolume();
        double double1 = roundVolume0.getVolume();
        logic.YourWood yourWood2 = new logic.YourWood();
        yourWood2.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList4 = yourWood2.getWood();
        boolean boolean5 = roundVolume0.canEqual((java.lang.Object) yourWood2);
        roundVolume0.setLength((double) 100L);
        boolean boolean9 = roundVolume0.equals((java.lang.Object) "RoundVolume(length=100.0, diameter=1, volume=0.0)");
        double double10 = roundVolume0.getVolume();
        java.lang.String str11 = roundVolume0.toString();
        int int12 = roundVolume0.getDiameter();
        roundVolume0.setDiameter((-1));
        double double15 = roundVolume0.getVolume();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roundVolumeList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str11, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        roundVolume3.setVolume((double) (-1));
        roundVolume3.setVolume((double) 10.0f);
        boolean boolean15 = roundVolume3.canEqual((java.lang.Object) 10.0f);
        java.lang.String str16 = roundVolume3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str16, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        int int9 = roundVolume3.getDiameter();
        logic.RoundVolume roundVolume13 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume13.setLength((double) (-1.0f));
        java.lang.String str16 = roundVolume13.toString();
        roundVolume13.setLength(100.0d);
        roundVolume13.setVolume(0.0d);
        boolean boolean21 = roundVolume3.equals((java.lang.Object) 0.0d);
        java.lang.Class<?> wildcardClass22 = roundVolume3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str16, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setLength((double) 100L);
        roundVolume3.setLength(0.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (short) 10, 10, (double) 1);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        logic.YourWood yourWood0 = new logic.YourWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.lengthFirstSortWood();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) 1L);
        roundVolume3.setDiameter((int) (byte) 1);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setVolume(0.0d);
        roundVolume3.setDiameter((int) (short) 0);
        int int13 = roundVolume3.getDiameter();
        roundVolume3.setLength((double) 100L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 10L, 100, (double) (byte) -1);
        roundVolume3.setDiameter((int) '#');
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume(1.0d, (int) (short) -1, (double) (byte) 10);
        java.lang.String str4 = roundVolume3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RoundVolume(length=1.0, diameter=-1, volume=10.0)" + "'", str4, "RoundVolume(length=1.0, diameter=-1, volume=10.0)");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        logic.RoundVolume roundVolume0 = new logic.RoundVolume();
        double double1 = roundVolume0.getVolume();
        logic.YourWood yourWood2 = new logic.YourWood();
        yourWood2.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList4 = yourWood2.getWood();
        boolean boolean5 = roundVolume0.canEqual((java.lang.Object) yourWood2);
        roundVolume0.setLength((double) 100L);
        boolean boolean9 = roundVolume0.equals((java.lang.Object) "RoundVolume(length=100.0, diameter=1, volume=0.0)");
        double double10 = roundVolume0.getVolume();
        java.lang.String str11 = roundVolume0.toString();
        double double12 = roundVolume0.getVolume();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roundVolumeList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str11, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (short) -1, (int) (byte) 0, (double) (-1L));
        java.lang.Class<?> wildcardClass4 = roundVolume3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume3.setDiameter((int) (byte) 10);
        roundVolume3.setDiameter((int) (byte) -1);
        java.lang.String str8 = roundVolume3.toString();
        double double9 = roundVolume3.getVolume();
        roundVolume3.setDiameter((int) (byte) 1);
        java.lang.Class<?> wildcardClass12 = roundVolume3.getClass();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "RoundVolume(length=100.0, diameter=-1, volume=10.0)" + "'", str8, "RoundVolume(length=100.0, diameter=-1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        boolean boolean10 = roundVolume3.equals((java.lang.Object) 10L);
        boolean boolean12 = roundVolume3.canEqual((java.lang.Object) "RoundVolume(length=100.0, diameter=10, volume=10.0)");
        roundVolume3.setDiameter(100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        java.lang.String str7 = roundVolume3.toString();
        double double8 = roundVolume3.getLength();
        java.lang.Object obj9 = null;
        boolean boolean10 = roundVolume3.equals(obj9);
        logic.RoundVolume roundVolume11 = new logic.RoundVolume();
        double double12 = roundVolume11.getVolume();
        java.lang.String str13 = roundVolume11.toString();
        boolean boolean14 = roundVolume3.equals((java.lang.Object) str13);
        logic.RoundVolume roundVolume18 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume18.setLength((double) (-1.0f));
        java.lang.String str21 = roundVolume18.toString();
        roundVolume18.setLength(100.0d);
        roundVolume18.setLength((double) 100L);
        roundVolume18.setVolume((double) (short) -1);
        logic.RoundVolume roundVolume31 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume31.setLength((double) (-1.0f));
        java.lang.String str34 = roundVolume31.toString();
        double double35 = roundVolume31.getVolume();
        java.lang.String str36 = roundVolume31.toString();
        boolean boolean37 = roundVolume18.equals((java.lang.Object) roundVolume31);
        logic.YourWood yourWood38 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList39 = yourWood38.getWood();
// flaky:         yourWood38.addWood((double) 10, 10);
        java.util.ArrayList<logic.RoundVolume> roundVolumeList43 = yourWood38.getWood();
        boolean boolean44 = roundVolume31.equals((java.lang.Object) roundVolumeList43);
        boolean boolean45 = roundVolume3.equals((java.lang.Object) roundVolume31);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str7, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RoundVolume(length=0.0, diameter=0, volume=0.0)" + "'", str13, "RoundVolume(length=0.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str21, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str34, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 10.0d + "'", double35 == 10.0d);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str36, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(roundVolumeList39);
        org.junit.Assert.assertNotNull(roundVolumeList43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (short) -1, (int) (short) 0, (double) 'a');
        int int4 = roundVolume3.getDiameter();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (byte) 1, (int) (byte) 1, (double) (-1L));
        java.lang.String str4 = roundVolume3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RoundVolume(length=1.0, diameter=1, volume=-1.0)" + "'", str4, "RoundVolume(length=1.0, diameter=1, volume=-1.0)");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setVolume(0.0d);
        int int11 = roundVolume3.getDiameter();
        int int12 = roundVolume3.getDiameter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        roundVolume3.setVolume((double) (-1));
        roundVolume3.setVolume((double) 10.0f);
        roundVolume3.setVolume((double) 0);
        int int16 = roundVolume3.getDiameter();
        double double17 = roundVolume3.getLength();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getLength();
        int int8 = roundVolume3.getDiameter();
        roundVolume3.setLength((double) (-1));
        java.lang.String str11 = roundVolume3.toString();
        logic.YourWood yourWood12 = new logic.YourWood();
        yourWood12.lengthFirstSortWood();
        yourWood12.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList15 = yourWood12.getWood();
        boolean boolean16 = roundVolume3.canEqual((java.lang.Object) yourWood12);
        yourWood12.diameterFirstSortWood();
        yourWood12.lengthFirstSortWood();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str11, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertNotNull(roundVolumeList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setDiameter((int) (byte) 0);
        java.lang.String str11 = roundVolume3.toString();
        roundVolume3.setDiameter((int) (byte) -1);
        int int14 = roundVolume3.getDiameter();
        double double15 = roundVolume3.getLength();
        double double16 = roundVolume3.getLength();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=10.0)" + "'", str11, "RoundVolume(length=100.0, diameter=0, volume=10.0)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        logic.YourWood yourWood0 = new logic.YourWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.diameterFirstSortWood();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        logic.YourWood yourWood0 = new logic.YourWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList6 = yourWood0.getWood();
        org.junit.Assert.assertNotNull(roundVolumeList6);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (short) 100, 10, (double) (byte) 100);
        logic.RoundVolume roundVolume7 = new logic.RoundVolume(0.0d, (-1), (double) (byte) 100);
        double double8 = roundVolume7.getVolume();
        roundVolume7.setVolume((double) (short) 1);
        boolean boolean11 = roundVolume3.canEqual((java.lang.Object) (short) 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setVolume(0.0d);
        java.lang.String str11 = roundVolume3.toString();
        double double12 = roundVolume3.getLength();
        roundVolume3.setDiameter((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=100.0, diameter=1, volume=0.0)" + "'", str11, "RoundVolume(length=100.0, diameter=1, volume=0.0)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        logic.RoundVolume roundVolume0 = new logic.RoundVolume();
        double double1 = roundVolume0.getVolume();
        logic.YourWood yourWood2 = new logic.YourWood();
        yourWood2.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList4 = yourWood2.getWood();
        boolean boolean5 = roundVolume0.canEqual((java.lang.Object) yourWood2);
        yourWood2.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList7 = yourWood2.getWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList8 = yourWood2.getWood();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roundVolumeList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(roundVolumeList7);
        org.junit.Assert.assertNotNull(roundVolumeList8);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
// flaky:         yourWood0.addWood((double) 10, 10);
// flaky:         yourWood0.addWood((double) 10, (int) (byte) 10);
        yourWood0.lengthFirstSortWood();
        yourWood0.diameterFirstSortWood();
        java.lang.Class<?> wildcardClass10 = yourWood0.getClass();
        org.junit.Assert.assertNotNull(roundVolumeList1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        int int8 = roundVolume3.getDiameter();
        double double9 = roundVolume3.getVolume();
        roundVolume3.setLength((double) ' ');
        roundVolume3.setLength((double) (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (short) 1, (int) (short) 0, (double) 0L);
        roundVolume3.setVolume((double) '#');
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.lengthFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList1);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        logic.YourWood yourWood0 = new logic.YourWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList4 = yourWood0.getWood();
        java.lang.Class<?> wildcardClass5 = roundVolumeList4.getClass();
        org.junit.Assert.assertNotNull(roundVolumeList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        double double6 = roundVolume3.getVolume();
        logic.RoundVolume roundVolume7 = new logic.RoundVolume();
        double double8 = roundVolume7.getVolume();
        logic.YourWood yourWood9 = new logic.YourWood();
        yourWood9.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList11 = yourWood9.getWood();
        boolean boolean12 = roundVolume7.canEqual((java.lang.Object) yourWood9);
        logic.YourWood yourWood13 = new logic.YourWood();
        yourWood13.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList15 = yourWood13.getWood();
        yourWood13.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList17 = yourWood13.getWood();
// flaky:         yourWood13.addWood((double) 1L, (int) (short) 100);
        boolean boolean21 = roundVolume7.canEqual((java.lang.Object) 1L);
        boolean boolean22 = roundVolume3.equals((java.lang.Object) 1L);
        roundVolume3.setLength((double) 10);
        logic.RoundVolume roundVolume28 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume28.setLength((double) (-1.0f));
        java.lang.String str31 = roundVolume28.toString();
        double double32 = roundVolume28.getVolume();
        double double33 = roundVolume28.getLength();
        int int34 = roundVolume28.getDiameter();
        roundVolume28.setDiameter((int) (byte) 100);
        logic.YourWood yourWood37 = new logic.YourWood();
        yourWood37.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList39 = yourWood37.getWood();
        boolean boolean40 = roundVolume28.equals((java.lang.Object) roundVolumeList39);
        roundVolume28.setDiameter((int) 'a');
        roundVolume28.setDiameter((-1));
        java.lang.Class<?> wildcardClass45 = roundVolume28.getClass();
        boolean boolean46 = roundVolume3.canEqual((java.lang.Object) roundVolume28);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(roundVolumeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(roundVolumeList15);
        org.junit.Assert.assertNotNull(roundVolumeList17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str31, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertNotNull(roundVolumeList39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        roundVolume3.setDiameter((int) (byte) 100);
        double double12 = roundVolume3.getLength();
        double double13 = roundVolume3.getVolume();
        int int14 = roundVolume3.getDiameter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 1.0f, (int) 'a', (double) 'a');
        roundVolume3.setLength((double) 1.0f);
        double double6 = roundVolume3.getLength();
        java.lang.String str7 = roundVolume3.toString();
        int int8 = roundVolume3.getDiameter();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "RoundVolume(length=1.0, diameter=97, volume=97.0)" + "'", str7, "RoundVolume(length=1.0, diameter=97, volume=97.0)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) 1L);
        double double6 = roundVolume3.getLength();
        java.lang.String str7 = roundVolume3.toString();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "RoundVolume(length=1.0, diameter=1, volume=10.0)" + "'", str7, "RoundVolume(length=1.0, diameter=1, volume=10.0)");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (short) 1, (int) (short) 100, (double) 0L);
        logic.RoundVolume roundVolume7 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume7.setDiameter((int) (byte) 10);
        java.lang.Object obj10 = null;
        boolean boolean11 = roundVolume7.canEqual(obj10);
        int int12 = roundVolume7.getDiameter();
        boolean boolean13 = roundVolume3.equals((java.lang.Object) roundVolume7);
        roundVolume3.setDiameter((int) (short) -1);
        int int16 = roundVolume3.getDiameter();
        double double17 = roundVolume3.getVolume();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setVolume(0.0d);
        roundVolume3.setDiameter((int) (short) 0);
        int int13 = roundVolume3.getDiameter();
        java.lang.String str14 = roundVolume3.toString();
        int int15 = roundVolume3.getDiameter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str14, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (short) 1, (int) '#', (double) (short) 0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume(100.0d, 1, (double) 10L);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        roundVolume3.setVolume((double) 10.0f);
        double double11 = roundVolume3.getVolume();
        roundVolume3.setLength((double) (short) 0);
        roundVolume3.setDiameter((int) (byte) -1);
        java.lang.Class<?> wildcardClass16 = roundVolume3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        roundVolume3.setDiameter((int) (byte) 100);
        roundVolume3.setDiameter((int) (short) 10);
        roundVolume3.setDiameter((int) (short) 1);
        roundVolume3.setLength((double) 0L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0L, (int) (byte) 10, (double) (-1.0f));
        logic.RoundVolume roundVolume7 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume7.setLength((double) (-1.0f));
        java.lang.String str10 = roundVolume7.toString();
        double double11 = roundVolume7.getVolume();
        double double12 = roundVolume7.getVolume();
        boolean boolean14 = roundVolume7.canEqual((java.lang.Object) (byte) -1);
        roundVolume7.setDiameter(100);
        roundVolume7.setVolume((double) 10.0f);
        roundVolume7.setDiameter((int) (short) 10);
        boolean boolean21 = roundVolume3.canEqual((java.lang.Object) roundVolume7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str10, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        int int9 = roundVolume3.getDiameter();
        roundVolume3.setLength((double) (-1));
        roundVolume3.setVolume((double) 10.0f);
        logic.RoundVolume roundVolume17 = new logic.RoundVolume((double) 1, (int) 'a', (double) (byte) -1);
        logic.YourWood yourWood18 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList19 = yourWood18.getWood();
        yourWood18.lengthFirstSortWood();
        boolean boolean21 = roundVolume17.equals((java.lang.Object) yourWood18);
        boolean boolean22 = roundVolume3.canEqual((java.lang.Object) roundVolume17);
        double double23 = roundVolume3.getVolume();
        roundVolume3.setDiameter((int) (short) 100);
        int int26 = roundVolume3.getDiameter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(roundVolumeList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0.0f, 97, (double) 10);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        boolean boolean10 = roundVolume3.equals((java.lang.Object) 0.0f);
        int int11 = roundVolume3.getDiameter();
        java.lang.String str12 = roundVolume3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str12, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        int int9 = roundVolume3.getDiameter();
        logic.RoundVolume roundVolume13 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume13.setLength((double) (-1.0f));
        java.lang.String str16 = roundVolume13.toString();
        roundVolume13.setLength(100.0d);
        roundVolume13.setVolume(0.0d);
        boolean boolean21 = roundVolume3.equals((java.lang.Object) 0.0d);
        double double22 = roundVolume3.getVolume();
        double double23 = roundVolume3.getLength();
        java.lang.String str24 = roundVolume3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str16, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str24, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList3 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList6 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList8 = yourWood0.getWood();
// flaky:         yourWood0.addWood((double) (byte) 1, 100);
        org.junit.Assert.assertNotNull(roundVolumeList1);
        org.junit.Assert.assertNotNull(roundVolumeList3);
        org.junit.Assert.assertNotNull(roundVolumeList6);
        org.junit.Assert.assertNotNull(roundVolumeList8);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setDiameter((int) (byte) 0);
        java.lang.String str11 = roundVolume3.toString();
        roundVolume3.setDiameter((int) (byte) -1);
        double double14 = roundVolume3.getLength();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=10.0)" + "'", str11, "RoundVolume(length=100.0, diameter=0, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume3.setDiameter((int) (byte) 10);
        roundVolume3.setDiameter((int) (byte) -1);
        roundVolume3.setVolume((double) 10);
        double double10 = roundVolume3.getLength();
        boolean boolean12 = roundVolume3.equals((java.lang.Object) (byte) 1);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = logic.VolumeDB.mapper;
        logic.VolumeDB.mapper = objectMapper13;
        logic.VolumeDB.mapper = objectMapper13;
        logic.VolumeDB.mapper = objectMapper13;
        logic.VolumeDB.mapper = objectMapper13;
        boolean boolean18 = roundVolume3.equals((java.lang.Object) objectMapper13);
        logic.RoundVolume roundVolume19 = new logic.RoundVolume();
        double double20 = roundVolume19.getVolume();
        logic.YourWood yourWood21 = new logic.YourWood();
        yourWood21.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList23 = yourWood21.getWood();
        boolean boolean24 = roundVolume19.canEqual((java.lang.Object) yourWood21);
        boolean boolean25 = roundVolume3.canEqual((java.lang.Object) roundVolume19);
        roundVolume3.setVolume((double) 0);
        java.lang.Class<?> wildcardClass28 = roundVolume3.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(roundVolumeList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
// flaky:         yourWood0.addWood((double) 10, 10);
        yourWood0.lengthFirstSortWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList8 = yourWood0.getWood();
        org.junit.Assert.assertNotNull(roundVolumeList1);
        org.junit.Assert.assertNotNull(roundVolumeList8);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setVolume(0.0d);
        logic.RoundVolume roundVolume14 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume14.setLength((double) 1L);
        boolean boolean17 = roundVolume3.canEqual((java.lang.Object) roundVolume14);
        int int18 = roundVolume3.getDiameter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        java.lang.String str8 = roundVolume3.toString();
        logic.RoundVolume roundVolume12 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume12.setDiameter((int) (byte) 10);
        java.lang.Object obj15 = null;
        boolean boolean16 = roundVolume12.canEqual(obj15);
        boolean boolean17 = roundVolume3.canEqual((java.lang.Object) boolean16);
        int int18 = roundVolume3.getDiameter();
        java.lang.Class<?> wildcardClass19 = roundVolume3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str8, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) '#', (int) (short) 10, 100.0d);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setVolume(0.0d);
        logic.RoundVolume roundVolume14 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume14.setLength((double) 1L);
        boolean boolean17 = roundVolume3.canEqual((java.lang.Object) roundVolume14);
        double double18 = roundVolume3.getVolume();
        double double19 = roundVolume3.getVolume();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        logic.RoundVolume roundVolume0 = new logic.RoundVolume();
        double double1 = roundVolume0.getVolume();
        logic.RoundVolume roundVolume5 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume5.setLength((double) (-1.0f));
        java.lang.String str8 = roundVolume5.toString();
        roundVolume5.setLength(100.0d);
        roundVolume5.setVolume(0.0d);
        logic.RoundVolume roundVolume16 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume16.setLength((double) 1L);
        boolean boolean19 = roundVolume5.canEqual((java.lang.Object) roundVolume16);
        boolean boolean20 = roundVolume0.canEqual((java.lang.Object) roundVolume5);
        roundVolume0.setVolume((double) ' ');
        roundVolume0.setLength((double) 100.0f);
        double double25 = roundVolume0.getVolume();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str8, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 32.0d + "'", double25 == 32.0d);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setVolume(0.0d);
        logic.RoundVolume roundVolume14 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume14.setLength((double) 1L);
        boolean boolean17 = roundVolume3.canEqual((java.lang.Object) roundVolume14);
        double double18 = roundVolume3.getVolume();
        roundVolume3.setVolume((double) (-1L));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100L, (int) '#', (double) 1);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        java.lang.String str8 = roundVolume3.toString();
        logic.RoundVolume roundVolume12 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume12.setDiameter((int) (byte) 10);
        java.lang.Object obj15 = null;
        boolean boolean16 = roundVolume12.canEqual(obj15);
        boolean boolean17 = roundVolume3.canEqual((java.lang.Object) boolean16);
        roundVolume3.setDiameter((int) (short) -1);
        roundVolume3.setDiameter((int) (byte) 1);
        int int22 = roundVolume3.getDiameter();
        logic.RoundVolume roundVolume23 = new logic.RoundVolume();
        double double24 = roundVolume23.getVolume();
        logic.YourWood yourWood25 = new logic.YourWood();
        yourWood25.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList27 = yourWood25.getWood();
        boolean boolean28 = roundVolume23.canEqual((java.lang.Object) yourWood25);
        logic.YourWood yourWood29 = new logic.YourWood();
        yourWood29.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList31 = yourWood29.getWood();
        yourWood29.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList33 = yourWood29.getWood();
// flaky:         yourWood29.addWood((double) 1L, (int) (short) 100);
        boolean boolean37 = roundVolume23.canEqual((java.lang.Object) 1L);
        boolean boolean38 = roundVolume3.canEqual((java.lang.Object) boolean37);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str8, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertNotNull(roundVolumeList27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(roundVolumeList31);
        org.junit.Assert.assertNotNull(roundVolumeList33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        double double6 = roundVolume3.getVolume();
        double double7 = roundVolume3.getLength();
        roundVolume3.setDiameter(1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        roundVolume3.setVolume((double) (-1));
        java.lang.String str12 = roundVolume3.toString();
        java.lang.String str13 = roundVolume3.toString();
        double double14 = roundVolume3.getLength();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=-1.0)" + "'", str12, "RoundVolume(length=-1.0, diameter=1, volume=-1.0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=-1.0)" + "'", str13, "RoundVolume(length=-1.0, diameter=1, volume=-1.0)");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
// flaky:         yourWood0.addWood((double) 10, 10);
        yourWood0.lengthFirstSortWood();
        yourWood0.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList7 = yourWood0.getWood();
        org.junit.Assert.assertNotNull(roundVolumeList1);
        org.junit.Assert.assertNotNull(roundVolumeList7);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        logic.RoundVolume roundVolume0 = new logic.RoundVolume();
        logic.YourWood yourWood1 = new logic.YourWood();
        yourWood1.diameterFirstSortWood();
        yourWood1.diameterFirstSortWood();
        yourWood1.lengthFirstSortWood();
        yourWood1.lengthFirstSortWood();
        boolean boolean6 = roundVolume0.equals((java.lang.Object) yourWood1);
        java.util.ArrayList<logic.RoundVolume> roundVolumeList7 = yourWood1.getWood();
        yourWood1.diameterFirstSortWood();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(roundVolumeList7);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setDiameter((int) (byte) 0);
        roundVolume3.setLength((double) 10.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.lengthFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList1);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) 1L);
        logic.YourWood yourWood6 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList7 = yourWood6.getWood();
        yourWood6.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList9 = yourWood6.getWood();
        yourWood6.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList11 = yourWood6.getWood();
        boolean boolean12 = roundVolume3.canEqual((java.lang.Object) roundVolumeList11);
        roundVolume3.setLength((double) '#');
        roundVolume3.setDiameter((int) (short) 1);
        roundVolume3.setLength((double) (short) 0);
        org.junit.Assert.assertNotNull(roundVolumeList7);
        org.junit.Assert.assertNotNull(roundVolumeList9);
        org.junit.Assert.assertNotNull(roundVolumeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        java.lang.String str10 = roundVolume3.toString();
        double double11 = roundVolume3.getVolume();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str10, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume3.setDiameter((int) (byte) 10);
        java.lang.Object obj6 = null;
        boolean boolean7 = roundVolume3.canEqual(obj6);
        int int8 = roundVolume3.getDiameter();
        double double9 = roundVolume3.getLength();
        logic.RoundVolume roundVolume13 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume13.setLength((double) (-1.0f));
        double double16 = roundVolume13.getVolume();
        logic.RoundVolume roundVolume17 = new logic.RoundVolume();
        double double18 = roundVolume17.getVolume();
        logic.YourWood yourWood19 = new logic.YourWood();
        yourWood19.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList21 = yourWood19.getWood();
        boolean boolean22 = roundVolume17.canEqual((java.lang.Object) yourWood19);
        logic.YourWood yourWood23 = new logic.YourWood();
        yourWood23.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList25 = yourWood23.getWood();
        yourWood23.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList27 = yourWood23.getWood();
// flaky:         yourWood23.addWood((double) 1L, (int) (short) 100);
        boolean boolean31 = roundVolume17.canEqual((java.lang.Object) 1L);
        boolean boolean32 = roundVolume13.equals((java.lang.Object) 1L);
        boolean boolean33 = roundVolume3.equals((java.lang.Object) boolean32);
        java.lang.String str34 = roundVolume3.toString();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(roundVolumeList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(roundVolumeList25);
        org.junit.Assert.assertNotNull(roundVolumeList27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "RoundVolume(length=100.0, diameter=10, volume=10.0)" + "'", str34, "RoundVolume(length=100.0, diameter=10, volume=10.0)");
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        logic.RoundVolume roundVolume0 = new logic.RoundVolume();
        logic.YourWood yourWood1 = new logic.YourWood();
        yourWood1.diameterFirstSortWood();
        yourWood1.diameterFirstSortWood();
        yourWood1.lengthFirstSortWood();
        yourWood1.lengthFirstSortWood();
        boolean boolean6 = roundVolume0.equals((java.lang.Object) yourWood1);
        logic.RoundVolume roundVolume10 = new logic.RoundVolume((double) (byte) -1, 0, (double) 100);
        boolean boolean11 = roundVolume0.canEqual((java.lang.Object) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        boolean boolean10 = roundVolume3.equals((java.lang.Object) "");
        roundVolume3.setLength(0.0d);
        roundVolume3.setVolume(0.0d);
        logic.RoundVolume roundVolume18 = new logic.RoundVolume((double) 1.0f, (int) 'a', (double) 'a');
        boolean boolean19 = roundVolume3.equals((java.lang.Object) 'a');
        logic.RoundVolume roundVolume23 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume23.setLength((double) (-1.0f));
        double double26 = roundVolume23.getVolume();
        double double27 = roundVolume23.getLength();
        boolean boolean28 = roundVolume3.equals((java.lang.Object) roundVolume23);
        java.lang.Class<?> wildcardClass29 = roundVolume3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) '#', (int) (short) 0, (double) (byte) 100);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        roundVolume3.setDiameter((int) (byte) 100);
        roundVolume3.setDiameter((int) (short) 10);
        logic.RoundVolume roundVolume17 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume17.setLength((double) (-1.0f));
        java.lang.String str20 = roundVolume17.toString();
        roundVolume17.setLength(100.0d);
        roundVolume17.setVolume(0.0d);
        logic.RoundVolume roundVolume28 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume28.setLength((double) 1L);
        boolean boolean31 = roundVolume17.canEqual((java.lang.Object) roundVolume28);
        boolean boolean32 = roundVolume3.canEqual((java.lang.Object) roundVolume17);
        double double33 = roundVolume17.getLength();
        roundVolume17.setVolume((double) 100L);
        double double36 = roundVolume17.getLength();
        roundVolume17.setDiameter((int) '#');
        logic.RoundVolume roundVolume42 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume42.setDiameter((int) (byte) 10);
        roundVolume42.setDiameter((int) (byte) -1);
        java.lang.String str47 = roundVolume42.toString();
        double double48 = roundVolume42.getVolume();
        roundVolume42.setDiameter((int) (byte) 1);
        boolean boolean51 = roundVolume17.equals((java.lang.Object) roundVolume42);
        logic.RoundVolume roundVolume55 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume55.setLength((double) (-1.0f));
        java.lang.String str58 = roundVolume55.toString();
        roundVolume55.setLength(100.0d);
        roundVolume55.setDiameter((int) (byte) 0);
        java.lang.Class<?> wildcardClass63 = roundVolume55.getClass();
        boolean boolean64 = roundVolume42.equals((java.lang.Object) roundVolume55);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str20, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 100.0d + "'", double33 == 100.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 100.0d + "'", double36 == 100.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "RoundVolume(length=100.0, diameter=-1, volume=10.0)" + "'", str47, "RoundVolume(length=100.0, diameter=-1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str58, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) '#', (int) (short) -1, (double) 0L);
        logic.RoundVolume roundVolume7 = new logic.RoundVolume((double) (byte) 100, 0, (double) 0.0f);
        double double8 = roundVolume7.getVolume();
        java.lang.String str9 = roundVolume7.toString();
        boolean boolean10 = roundVolume3.canEqual((java.lang.Object) roundVolume7);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str9, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setVolume(0.0d);
        roundVolume3.setDiameter((int) (short) 0);
        java.lang.String str13 = roundVolume3.toString();
        double double14 = roundVolume3.getVolume();
        logic.RoundVolume roundVolume18 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume18.setLength((double) (-1.0f));
        java.lang.String str21 = roundVolume18.toString();
        double double22 = roundVolume18.getVolume();
        double double23 = roundVolume18.getLength();
        int int24 = roundVolume18.getDiameter();
        java.lang.String str25 = roundVolume18.toString();
        logic.RoundVolume roundVolume29 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume29.setDiameter((int) (byte) 10);
        java.lang.Object obj32 = null;
        boolean boolean33 = roundVolume29.canEqual(obj32);
        boolean boolean35 = roundVolume29.canEqual((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass36 = roundVolume29.getClass();
        boolean boolean37 = roundVolume18.equals((java.lang.Object) wildcardClass36);
        logic.RoundVolume roundVolume41 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume41.setLength((double) (-1.0f));
        java.lang.String str44 = roundVolume41.toString();
        double double45 = roundVolume41.getVolume();
        double double46 = roundVolume41.getLength();
        int int47 = roundVolume41.getDiameter();
        roundVolume41.setVolume((double) (-1));
        roundVolume41.setVolume((double) 10.0f);
        boolean boolean52 = roundVolume18.equals((java.lang.Object) 10.0f);
        boolean boolean53 = roundVolume3.canEqual((java.lang.Object) roundVolume18);
        double double54 = roundVolume3.getVolume();
        java.lang.Class<?> wildcardClass55 = roundVolume3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str13, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str21, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str25, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str44, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1.0d) + "'", double46 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (short) 100, 10, (double) (byte) 100);
        logic.RoundVolume roundVolume7 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume7.setLength((double) (-1.0f));
        java.lang.String str10 = roundVolume7.toString();
        roundVolume7.setLength(100.0d);
        roundVolume7.setDiameter((int) (byte) 0);
        roundVolume7.setDiameter((int) (byte) 10);
        boolean boolean17 = roundVolume3.canEqual((java.lang.Object) (byte) 10);
        roundVolume3.setDiameter((int) ' ');
        int int20 = roundVolume3.getDiameter();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str10, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) 1L);
        double double6 = roundVolume3.getLength();
        int int7 = roundVolume3.getDiameter();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList3 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.diameterFirstSortWood();
        java.lang.Class<?> wildcardClass6 = yourWood0.getClass();
        org.junit.Assert.assertNotNull(roundVolumeList1);
        org.junit.Assert.assertNotNull(roundVolumeList3);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume3.setDiameter((int) (byte) 10);
        roundVolume3.setDiameter((int) (byte) -1);
        roundVolume3.setVolume((double) 10);
        roundVolume3.setVolume(100.0d);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        logic.RoundVolume roundVolume0 = new logic.RoundVolume();
        double double1 = roundVolume0.getVolume();
        logic.YourWood yourWood2 = new logic.YourWood();
        yourWood2.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList4 = yourWood2.getWood();
        boolean boolean5 = roundVolume0.canEqual((java.lang.Object) yourWood2);
        roundVolume0.setLength((double) 100L);
        boolean boolean9 = roundVolume0.equals((java.lang.Object) "RoundVolume(length=100.0, diameter=1, volume=0.0)");
        double double10 = roundVolume0.getVolume();
        java.lang.String str11 = roundVolume0.toString();
        int int12 = roundVolume0.getDiameter();
        roundVolume0.setDiameter((-1));
        roundVolume0.setVolume((double) 0L);
        roundVolume0.setLength((double) '#');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roundVolumeList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str11, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        int int9 = roundVolume3.getDiameter();
        roundVolume3.setLength((double) (-1));
        java.lang.String str12 = roundVolume3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str12, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        double double9 = roundVolume3.getVolume();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (byte) 100, (int) (byte) 1, 1.0d);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        com.fasterxml.jackson.databind.ObjectMapper objectMapper6 = logic.VolumeDB.mapper;
        logic.VolumeDB.mapper = objectMapper6;
        logic.VolumeDB.mapper = objectMapper6;
        logic.VolumeDB.mapper = objectMapper6;
        logic.VolumeDB.mapper = objectMapper6;
        boolean boolean11 = roundVolume3.canEqual((java.lang.Object) objectMapper6);
        java.lang.String str12 = roundVolume3.toString();
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str12, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        logic.RoundVolume roundVolume0 = new logic.RoundVolume();
        double double1 = roundVolume0.getVolume();
        logic.YourWood yourWood2 = new logic.YourWood();
        yourWood2.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList4 = yourWood2.getWood();
        boolean boolean5 = roundVolume0.canEqual((java.lang.Object) yourWood2);
        double double6 = roundVolume0.getLength();
        logic.RoundVolume roundVolume10 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume10.setLength((double) (-1.0f));
        java.lang.String str13 = roundVolume10.toString();
        double double14 = roundVolume10.getVolume();
        java.lang.String str15 = roundVolume10.toString();
        logic.RoundVolume roundVolume19 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume19.setDiameter((int) (byte) 10);
        java.lang.Object obj22 = null;
        boolean boolean23 = roundVolume19.canEqual(obj22);
        boolean boolean24 = roundVolume10.canEqual((java.lang.Object) boolean23);
        roundVolume10.setDiameter((int) (short) -1);
        roundVolume10.setVolume((double) 100);
        boolean boolean29 = roundVolume0.canEqual((java.lang.Object) 100);
        roundVolume0.setLength((double) (byte) -1);
        roundVolume0.setVolume((double) (short) 100);
        logic.RoundVolume roundVolume37 = new logic.RoundVolume(0.0d, (-1), (double) (byte) 100);
        java.lang.Class<?> wildcardClass38 = roundVolume37.getClass();
        boolean boolean39 = roundVolume0.canEqual((java.lang.Object) roundVolume37);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roundVolumeList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str13, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str15, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        java.lang.String str10 = roundVolume3.toString();
        logic.RoundVolume roundVolume14 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume14.setDiameter((int) (byte) 10);
        java.lang.Object obj17 = null;
        boolean boolean18 = roundVolume14.canEqual(obj17);
        boolean boolean20 = roundVolume14.canEqual((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass21 = roundVolume14.getClass();
        boolean boolean22 = roundVolume3.equals((java.lang.Object) wildcardClass21);
        logic.RoundVolume roundVolume26 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume26.setLength((double) (-1.0f));
        java.lang.String str29 = roundVolume26.toString();
        double double30 = roundVolume26.getVolume();
        double double31 = roundVolume26.getLength();
        int int32 = roundVolume26.getDiameter();
        roundVolume26.setVolume((double) (-1));
        roundVolume26.setVolume((double) 10.0f);
        boolean boolean37 = roundVolume3.equals((java.lang.Object) 10.0f);
        double double38 = roundVolume3.getLength();
        logic.RoundVolume roundVolume42 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume42.setLength((double) (-1.0f));
        java.lang.String str45 = roundVolume42.toString();
        double double46 = roundVolume42.getVolume();
        double double47 = roundVolume42.getLength();
        boolean boolean48 = roundVolume3.equals((java.lang.Object) roundVolume42);
        int int49 = roundVolume42.getDiameter();
        double double50 = roundVolume42.getLength();
        roundVolume42.setVolume((double) '4');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str10, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str29, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-1.0d) + "'", double38 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str45, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-1.0d) + "'", double47 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-1.0d) + "'", double50 == (-1.0d));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        logic.RoundVolume roundVolume0 = new logic.RoundVolume();
        double double1 = roundVolume0.getVolume();
        logic.YourWood yourWood2 = new logic.YourWood();
        yourWood2.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList4 = yourWood2.getWood();
        boolean boolean5 = roundVolume0.canEqual((java.lang.Object) yourWood2);
        double double6 = roundVolume0.getLength();
        logic.RoundVolume roundVolume10 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume10.setLength((double) (-1.0f));
        java.lang.String str13 = roundVolume10.toString();
        double double14 = roundVolume10.getVolume();
        java.lang.String str15 = roundVolume10.toString();
        logic.RoundVolume roundVolume19 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume19.setDiameter((int) (byte) 10);
        java.lang.Object obj22 = null;
        boolean boolean23 = roundVolume19.canEqual(obj22);
        boolean boolean24 = roundVolume10.canEqual((java.lang.Object) boolean23);
        roundVolume10.setDiameter((int) (short) -1);
        roundVolume10.setVolume((double) 100);
        boolean boolean29 = roundVolume0.canEqual((java.lang.Object) 100);
        roundVolume0.setLength((double) (byte) -1);
        roundVolume0.setVolume((double) (short) 100);
        logic.RoundVolume roundVolume37 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume37.setLength((double) (-1.0f));
        java.lang.String str40 = roundVolume37.toString();
        double double41 = roundVolume37.getVolume();
        double double42 = roundVolume37.getVolume();
        int int43 = roundVolume37.getDiameter();
        logic.RoundVolume roundVolume47 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume47.setLength((double) (-1.0f));
        java.lang.String str50 = roundVolume47.toString();
        roundVolume47.setLength(100.0d);
        roundVolume47.setVolume(0.0d);
        boolean boolean55 = roundVolume37.equals((java.lang.Object) 0.0d);
        double double56 = roundVolume37.getVolume();
        double double57 = roundVolume37.getLength();
        boolean boolean58 = roundVolume0.equals((java.lang.Object) double57);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roundVolumeList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str13, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str15, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str40, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str50, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 10.0d + "'", double56 == 10.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + (-1.0d) + "'", double57 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setVolume(0.0d);
        logic.RoundVolume roundVolume14 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume14.setLength((double) 1L);
        boolean boolean17 = roundVolume3.canEqual((java.lang.Object) roundVolume14);
        double double18 = roundVolume3.getVolume();
        logic.RoundVolume roundVolume22 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume22.setLength((double) (-1.0f));
        java.lang.String str25 = roundVolume22.toString();
        roundVolume22.setLength(100.0d);
        roundVolume22.setVolume(0.0d);
        roundVolume22.setDiameter((int) (short) 0);
        java.lang.String str32 = roundVolume22.toString();
        double double33 = roundVolume22.getVolume();
        logic.RoundVolume roundVolume37 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume37.setLength((double) (-1.0f));
        java.lang.String str40 = roundVolume37.toString();
        double double41 = roundVolume37.getVolume();
        double double42 = roundVolume37.getLength();
        int int43 = roundVolume37.getDiameter();
        java.lang.String str44 = roundVolume37.toString();
        logic.RoundVolume roundVolume48 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume48.setDiameter((int) (byte) 10);
        java.lang.Object obj51 = null;
        boolean boolean52 = roundVolume48.canEqual(obj51);
        boolean boolean54 = roundVolume48.canEqual((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass55 = roundVolume48.getClass();
        boolean boolean56 = roundVolume37.equals((java.lang.Object) wildcardClass55);
        logic.RoundVolume roundVolume60 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume60.setLength((double) (-1.0f));
        java.lang.String str63 = roundVolume60.toString();
        double double64 = roundVolume60.getVolume();
        double double65 = roundVolume60.getLength();
        int int66 = roundVolume60.getDiameter();
        roundVolume60.setVolume((double) (-1));
        roundVolume60.setVolume((double) 10.0f);
        boolean boolean71 = roundVolume37.equals((java.lang.Object) 10.0f);
        boolean boolean72 = roundVolume22.canEqual((java.lang.Object) roundVolume37);
        int int73 = roundVolume37.getDiameter();
        double double74 = roundVolume37.getVolume();
        boolean boolean75 = roundVolume3.equals((java.lang.Object) roundVolume37);
        roundVolume3.setVolume((double) 32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str25, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str32, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 0.0d + "'", double33 == 0.0d);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str40, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + (-1.0d) + "'", double42 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1 + "'", int43 == 1);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str44, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str63, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 10.0d + "'", double64 == 10.0d);
        org.junit.Assert.assertTrue("'" + double65 + "' != '" + (-1.0d) + "'", double65 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 1 + "'", int73 == 1);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 10.0d + "'", double74 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        java.lang.String str10 = roundVolume3.toString();
        logic.RoundVolume roundVolume14 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume14.setDiameter((int) (byte) 10);
        java.lang.Object obj17 = null;
        boolean boolean18 = roundVolume14.canEqual(obj17);
        boolean boolean20 = roundVolume14.canEqual((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass21 = roundVolume14.getClass();
        boolean boolean22 = roundVolume3.equals((java.lang.Object) wildcardClass21);
        double double23 = roundVolume3.getVolume();
        logic.YourWood yourWood24 = new logic.YourWood();
        yourWood24.diameterFirstSortWood();
        yourWood24.diameterFirstSortWood();
        boolean boolean27 = roundVolume3.equals((java.lang.Object) yourWood24);
        yourWood24.diameterFirstSortWood();
        yourWood24.diameterFirstSortWood();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str10, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (byte) 1, 10, (double) 10.0f);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        logic.RoundVolume roundVolume0 = new logic.RoundVolume();
        java.lang.String str1 = roundVolume0.toString();
        double double2 = roundVolume0.getVolume();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "RoundVolume(length=0.0, diameter=0, volume=0.0)" + "'", str1, "RoundVolume(length=0.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        logic.YourWood yourWood0 = new logic.YourWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList2 = yourWood0.getWood();
        yourWood0.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList4 = yourWood0.getWood();
// flaky:         yourWood0.addWood((double) 1L, (int) (short) 100);
        java.util.ArrayList<logic.RoundVolume> roundVolumeList8 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList2);
        org.junit.Assert.assertNotNull(roundVolumeList4);
        org.junit.Assert.assertNotNull(roundVolumeList8);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume(0.0d, (int) 'a', (double) 32);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (short) 100, 10, (double) (byte) 100);
        roundVolume3.setDiameter((int) (byte) 1);
        roundVolume3.setDiameter(1);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        logic.YourWood yourWood0 = new logic.YourWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList5 = yourWood0.getWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList6 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList5);
        org.junit.Assert.assertNotNull(roundVolumeList6);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setVolume(0.0d);
        roundVolume3.setDiameter((int) (short) 0);
        logic.RoundVolume roundVolume16 = new logic.RoundVolume(0.0d, (int) (byte) 1, (double) (byte) -1);
        boolean boolean17 = roundVolume3.canEqual((java.lang.Object) 0.0d);
        logic.RoundVolume roundVolume21 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        boolean boolean23 = roundVolume21.canEqual((java.lang.Object) false);
        boolean boolean24 = roundVolume3.equals((java.lang.Object) boolean23);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        roundVolume3.setDiameter((int) (byte) 100);
        roundVolume3.setVolume((double) 0);
        double double14 = roundVolume3.getLength();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (short) -1, (int) (byte) 0, (double) (-1L));
        roundVolume3.setDiameter((int) (byte) 100);
        roundVolume3.setDiameter(1);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (short) 0, (int) (byte) 1, 100.0d);
        int int4 = roundVolume3.getDiameter();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) 1L);
        logic.YourWood yourWood6 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList7 = yourWood6.getWood();
        yourWood6.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList9 = yourWood6.getWood();
        yourWood6.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList11 = yourWood6.getWood();
        boolean boolean12 = roundVolume3.canEqual((java.lang.Object) roundVolumeList11);
        logic.RoundVolume roundVolume16 = new logic.RoundVolume((double) 1L, (int) 'a', (double) 1);
        boolean boolean17 = roundVolume3.equals((java.lang.Object) 1);
        org.junit.Assert.assertNotNull(roundVolumeList7);
        org.junit.Assert.assertNotNull(roundVolumeList9);
        org.junit.Assert.assertNotNull(roundVolumeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        roundVolume3.setDiameter((int) (byte) 100);
        double double12 = roundVolume3.getLength();
        int int13 = roundVolume3.getDiameter();
        java.lang.Class<?> wildcardClass14 = roundVolume3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        roundVolume3.setDiameter((int) (byte) 100);
        roundVolume3.setDiameter((int) (short) 10);
        logic.RoundVolume roundVolume17 = new logic.RoundVolume((double) 0, 0, (double) 1);
        double double18 = roundVolume17.getVolume();
        boolean boolean19 = roundVolume3.canEqual((java.lang.Object) roundVolume17);
        int int20 = roundVolume3.getDiameter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (-1), (int) (byte) 1, (double) (short) 0);
        roundVolume3.setDiameter((int) (byte) 100);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume3.setDiameter((int) (byte) 10);
        java.lang.Object obj6 = null;
        boolean boolean7 = roundVolume3.canEqual(obj6);
        int int8 = roundVolume3.getDiameter();
        double double9 = roundVolume3.getLength();
        logic.RoundVolume roundVolume13 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume13.setLength((double) (-1.0f));
        double double16 = roundVolume13.getVolume();
        logic.RoundVolume roundVolume17 = new logic.RoundVolume();
        double double18 = roundVolume17.getVolume();
        logic.YourWood yourWood19 = new logic.YourWood();
        yourWood19.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList21 = yourWood19.getWood();
        boolean boolean22 = roundVolume17.canEqual((java.lang.Object) yourWood19);
        logic.YourWood yourWood23 = new logic.YourWood();
        yourWood23.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList25 = yourWood23.getWood();
        yourWood23.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList27 = yourWood23.getWood();
// flaky:         yourWood23.addWood((double) 1L, (int) (short) 100);
        boolean boolean31 = roundVolume17.canEqual((java.lang.Object) 1L);
        boolean boolean32 = roundVolume13.equals((java.lang.Object) 1L);
        boolean boolean33 = roundVolume3.equals((java.lang.Object) boolean32);
        int int34 = roundVolume3.getDiameter();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(roundVolumeList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(roundVolumeList25);
        org.junit.Assert.assertNotNull(roundVolumeList27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 10 + "'", int34 == 10);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (short) 0, (-1), (double) (byte) -1);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getLength();
        int int8 = roundVolume3.getDiameter();
        roundVolume3.setLength((double) (-1));
        java.lang.String str11 = roundVolume3.toString();
        logic.RoundVolume roundVolume15 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume15.setLength((double) (-1.0f));
        java.lang.String str18 = roundVolume15.toString();
        double double19 = roundVolume15.getVolume();
        java.lang.String str20 = roundVolume15.toString();
        java.lang.String str21 = roundVolume15.toString();
        boolean boolean22 = roundVolume3.canEqual((java.lang.Object) roundVolume15);
        logic.YourWood yourWood23 = new logic.YourWood();
        yourWood23.diameterFirstSortWood();
        yourWood23.diameterFirstSortWood();
        yourWood23.lengthFirstSortWood();
        boolean boolean27 = roundVolume3.equals((java.lang.Object) yourWood23);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str11, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str18, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str20, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str21, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (byte) 100, 0, (double) 0.0f);
        double double4 = roundVolume3.getVolume();
        logic.RoundVolume roundVolume8 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume8.setLength((double) (-1.0f));
        java.lang.String str11 = roundVolume8.toString();
        double double12 = roundVolume8.getVolume();
        double double13 = roundVolume8.getVolume();
        boolean boolean15 = roundVolume8.equals((java.lang.Object) "");
        boolean boolean16 = roundVolume3.canEqual((java.lang.Object) roundVolume8);
        java.lang.String str17 = roundVolume8.toString();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str11, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str17, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (short) -1, (int) (byte) 0, (double) (-1L));
        java.lang.String str4 = roundVolume3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RoundVolume(length=-1.0, diameter=0, volume=-1.0)" + "'", str4, "RoundVolume(length=-1.0, diameter=0, volume=-1.0)");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        roundVolume3.setVolume((double) (-1));
        roundVolume3.setVolume((double) 10.0f);
        boolean boolean15 = roundVolume3.canEqual((java.lang.Object) 10.0f);
        roundVolume3.setDiameter((int) 'a');
        roundVolume3.setVolume((double) 1L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume3.setDiameter((int) (byte) 10);
        java.lang.Object obj6 = null;
        boolean boolean7 = roundVolume3.canEqual(obj6);
        int int8 = roundVolume3.getDiameter();
        double double9 = roundVolume3.getLength();
        java.lang.String str10 = roundVolume3.toString();
        java.lang.Class<?> wildcardClass11 = roundVolume3.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RoundVolume(length=100.0, diameter=10, volume=10.0)" + "'", str10, "RoundVolume(length=100.0, diameter=10, volume=10.0)");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 1, (int) 'a', (double) (byte) -1);
        double double4 = roundVolume3.getVolume();
        double double5 = roundVolume3.getLength();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (short) 1, (int) (short) 100, (double) 0L);
        logic.RoundVolume roundVolume7 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume7.setDiameter((int) (byte) 10);
        java.lang.Object obj10 = null;
        boolean boolean11 = roundVolume7.canEqual(obj10);
        int int12 = roundVolume7.getDiameter();
        boolean boolean13 = roundVolume3.equals((java.lang.Object) roundVolume7);
        roundVolume3.setVolume((-1.0d));
        int int16 = roundVolume3.getDiameter();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 100 + "'", int16 == 100);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        boolean boolean10 = roundVolume3.equals((java.lang.Object) "");
        roundVolume3.setLength(0.0d);
        logic.RoundVolume roundVolume16 = new logic.RoundVolume((double) (byte) 100, 0, (double) 0.0f);
        double double17 = roundVolume16.getVolume();
        logic.RoundVolume roundVolume21 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume21.setLength((double) (-1.0f));
        java.lang.String str24 = roundVolume21.toString();
        double double25 = roundVolume21.getVolume();
        double double26 = roundVolume21.getVolume();
        boolean boolean28 = roundVolume21.equals((java.lang.Object) "");
        boolean boolean29 = roundVolume16.canEqual((java.lang.Object) roundVolume21);
        roundVolume16.setLength((double) (byte) 10);
        boolean boolean32 = roundVolume3.canEqual((java.lang.Object) (byte) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str24, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setVolume(0.0d);
        int int11 = roundVolume3.getDiameter();
        roundVolume3.setVolume((double) 0);
        double double14 = roundVolume3.getVolume();
        java.lang.String str15 = roundVolume3.toString();
        logic.RoundVolume roundVolume19 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume19.setLength((double) (-1.0f));
        java.lang.String str22 = roundVolume19.toString();
        roundVolume19.setLength(100.0d);
        roundVolume19.setLength((double) 100L);
        boolean boolean27 = roundVolume3.equals((java.lang.Object) roundVolume19);
        java.lang.Class<?> wildcardClass28 = roundVolume3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "RoundVolume(length=100.0, diameter=1, volume=0.0)" + "'", str15, "RoundVolume(length=100.0, diameter=1, volume=0.0)");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str22, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        roundVolume3.setDiameter((int) (byte) 100);
        roundVolume3.setDiameter((int) (short) 10);
        logic.RoundVolume roundVolume17 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume17.setLength((double) (-1.0f));
        java.lang.String str20 = roundVolume17.toString();
        roundVolume17.setLength(100.0d);
        roundVolume17.setVolume(0.0d);
        logic.RoundVolume roundVolume28 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume28.setLength((double) 1L);
        boolean boolean31 = roundVolume17.canEqual((java.lang.Object) roundVolume28);
        boolean boolean32 = roundVolume3.canEqual((java.lang.Object) roundVolume17);
        double double33 = roundVolume17.getLength();
        roundVolume17.setVolume((double) 100L);
        double double36 = roundVolume17.getLength();
        roundVolume17.setDiameter((int) '#');
        logic.RoundVolume roundVolume42 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume42.setDiameter((int) (byte) 10);
        roundVolume42.setDiameter((int) (byte) -1);
        java.lang.String str47 = roundVolume42.toString();
        double double48 = roundVolume42.getVolume();
        roundVolume42.setDiameter((int) (byte) 1);
        boolean boolean51 = roundVolume17.equals((java.lang.Object) roundVolume42);
        java.lang.String str52 = roundVolume17.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str20, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 100.0d + "'", double33 == 100.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 100.0d + "'", double36 == 100.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "RoundVolume(length=100.0, diameter=-1, volume=10.0)" + "'", str47, "RoundVolume(length=100.0, diameter=-1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "RoundVolume(length=100.0, diameter=35, volume=100.0)" + "'", str52, "RoundVolume(length=100.0, diameter=35, volume=100.0)");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        int int9 = roundVolume3.getDiameter();
        logic.RoundVolume roundVolume13 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume13.setLength((double) (-1.0f));
        java.lang.String str16 = roundVolume13.toString();
        roundVolume13.setLength(100.0d);
        roundVolume13.setVolume(0.0d);
        boolean boolean21 = roundVolume3.equals((java.lang.Object) 0.0d);
        logic.RoundVolume roundVolume25 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume25.setLength((double) (-1.0f));
        java.lang.String str28 = roundVolume25.toString();
        double double29 = roundVolume25.getVolume();
        int int30 = roundVolume25.getDiameter();
        double double31 = roundVolume25.getVolume();
        boolean boolean32 = roundVolume3.canEqual((java.lang.Object) double31);
        double double33 = roundVolume3.getVolume();
        roundVolume3.setLength((double) (byte) 10);
        logic.RoundVolume roundVolume39 = new logic.RoundVolume((double) (short) 0, (int) (short) 10, (double) (short) 10);
        logic.RoundVolume roundVolume43 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume43.setLength((double) (-1.0f));
        java.lang.String str46 = roundVolume43.toString();
        double double47 = roundVolume43.getVolume();
        double double48 = roundVolume43.getLength();
        int int49 = roundVolume43.getDiameter();
        logic.RoundVolume roundVolume53 = new logic.RoundVolume((double) (byte) 100, 0, (double) 0.0f);
        boolean boolean54 = roundVolume43.equals((java.lang.Object) 0.0f);
        boolean boolean55 = roundVolume39.equals((java.lang.Object) roundVolume43);
        boolean boolean56 = roundVolume3.canEqual((java.lang.Object) boolean55);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str16, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str28, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 10.0d + "'", double33 == 10.0d);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str46, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + (-1.0d) + "'", double48 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        logic.RoundVolume roundVolume0 = new logic.RoundVolume();
        double double1 = roundVolume0.getVolume();
        logic.YourWood yourWood2 = new logic.YourWood();
        yourWood2.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList4 = yourWood2.getWood();
        boolean boolean5 = roundVolume0.canEqual((java.lang.Object) yourWood2);
        yourWood2.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList7 = yourWood2.getWood();
        java.lang.Class<?> wildcardClass8 = roundVolumeList7.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roundVolumeList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(roundVolumeList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume(100.0d, (int) (byte) -1, (double) 1L);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (byte) -1, (int) 'a', (double) (byte) 100);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setVolume(0.0d);
        logic.RoundVolume roundVolume14 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume14.setLength((double) 1L);
        boolean boolean17 = roundVolume3.canEqual((java.lang.Object) roundVolume14);
        double double18 = roundVolume3.getLength();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        logic.RoundVolume roundVolume12 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume12.setLength((double) (-1.0f));
        java.lang.String str15 = roundVolume12.toString();
        double double16 = roundVolume12.getVolume();
        double double17 = roundVolume12.getVolume();
        boolean boolean19 = roundVolume12.canEqual((java.lang.Object) (byte) -1);
        roundVolume12.setDiameter(100);
        roundVolume12.setDiameter((int) '4');
        boolean boolean24 = roundVolume3.equals((java.lang.Object) '4');
        roundVolume3.setVolume((double) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str15, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        boolean boolean10 = roundVolume3.equals((java.lang.Object) "");
        double double11 = roundVolume3.getLength();
        double double12 = roundVolume3.getVolume();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        logic.RoundVolume roundVolume0 = new logic.RoundVolume();
        double double1 = roundVolume0.getVolume();
        roundVolume0.setDiameter((int) (short) 1);
        int int4 = roundVolume0.getDiameter();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setVolume(0.0d);
        roundVolume3.setDiameter((int) (short) 0);
        logic.RoundVolume roundVolume16 = new logic.RoundVolume(0.0d, (int) (byte) 1, (double) (byte) -1);
        boolean boolean17 = roundVolume3.canEqual((java.lang.Object) 0.0d);
        logic.RoundVolume roundVolume21 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume21.setLength((double) (-1.0f));
        java.lang.String str24 = roundVolume21.toString();
        double double25 = roundVolume21.getVolume();
        double double26 = roundVolume21.getLength();
        boolean boolean28 = roundVolume21.equals((java.lang.Object) 0.0f);
        double double29 = roundVolume21.getVolume();
        double double30 = roundVolume21.getVolume();
        logic.RoundVolume roundVolume34 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume34.setLength((double) (-1.0f));
        java.lang.String str37 = roundVolume34.toString();
        double double38 = roundVolume34.getVolume();
        double double39 = roundVolume34.getLength();
        int int40 = roundVolume34.getDiameter();
        java.lang.String str41 = roundVolume34.toString();
        logic.RoundVolume roundVolume45 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume45.setDiameter((int) (byte) 10);
        java.lang.Object obj48 = null;
        boolean boolean49 = roundVolume45.canEqual(obj48);
        boolean boolean51 = roundVolume45.canEqual((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass52 = roundVolume45.getClass();
        boolean boolean53 = roundVolume34.equals((java.lang.Object) wildcardClass52);
        int int54 = roundVolume34.getDiameter();
        boolean boolean55 = roundVolume21.equals((java.lang.Object) roundVolume34);
        java.lang.Class<?> wildcardClass56 = roundVolume34.getClass();
        boolean boolean57 = roundVolume3.canEqual((java.lang.Object) roundVolume34);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str24, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str37, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 10.0d + "'", double38 == 10.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + (-1.0d) + "'", double39 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str41, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(wildcardClass52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(wildcardClass56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        roundVolume3.setDiameter((int) (byte) 100);
        roundVolume3.setDiameter((int) (short) 10);
        logic.RoundVolume roundVolume17 = new logic.RoundVolume((double) 0, 0, (double) 1);
        double double18 = roundVolume17.getVolume();
        boolean boolean19 = roundVolume3.canEqual((java.lang.Object) roundVolume17);
        roundVolume3.setLength((double) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList3 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList6 = yourWood0.getWood();
        org.junit.Assert.assertNotNull(roundVolumeList1);
        org.junit.Assert.assertNotNull(roundVolumeList3);
        org.junit.Assert.assertNotNull(roundVolumeList6);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setLength((double) 100L);
        java.lang.Object obj11 = null;
        boolean boolean12 = roundVolume3.equals(obj11);
        double double13 = roundVolume3.getLength();
        roundVolume3.setDiameter((int) (byte) 1);
        java.lang.String str16 = roundVolume3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "RoundVolume(length=100.0, diameter=1, volume=10.0)" + "'", str16, "RoundVolume(length=100.0, diameter=1, volume=10.0)");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList2 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.diameterFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList1);
        org.junit.Assert.assertNotNull(roundVolumeList2);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        logic.RoundVolume roundVolume0 = new logic.RoundVolume();
        double double1 = roundVolume0.getVolume();
        logic.YourWood yourWood2 = new logic.YourWood();
        yourWood2.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList4 = yourWood2.getWood();
        boolean boolean5 = roundVolume0.canEqual((java.lang.Object) yourWood2);
        java.lang.String str6 = roundVolume0.toString();
        double double7 = roundVolume0.getVolume();
        roundVolume0.setDiameter((int) (short) 100);
        int int10 = roundVolume0.getDiameter();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roundVolumeList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=0.0, diameter=0, volume=0.0)" + "'", str6, "RoundVolume(length=0.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 100 + "'", int10 == 100);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        java.lang.String str10 = roundVolume3.toString();
        logic.RoundVolume roundVolume14 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume14.setDiameter((int) (byte) 10);
        java.lang.Object obj17 = null;
        boolean boolean18 = roundVolume14.canEqual(obj17);
        boolean boolean20 = roundVolume14.canEqual((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass21 = roundVolume14.getClass();
        boolean boolean22 = roundVolume3.equals((java.lang.Object) wildcardClass21);
        double double23 = roundVolume3.getVolume();
        logic.YourWood yourWood24 = new logic.YourWood();
        yourWood24.diameterFirstSortWood();
        yourWood24.diameterFirstSortWood();
        boolean boolean27 = roundVolume3.equals((java.lang.Object) yourWood24);
        yourWood24.lengthFirstSortWood();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str10, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        boolean boolean10 = roundVolume3.canEqual((java.lang.Object) (byte) -1);
        roundVolume3.setDiameter(100);
        roundVolume3.setVolume((double) 10.0f);
        roundVolume3.setDiameter((int) (short) 10);
        logic.RoundVolume roundVolume20 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume20.setDiameter((int) (byte) 10);
        java.lang.Object obj23 = null;
        boolean boolean24 = roundVolume20.canEqual(obj23);
        boolean boolean26 = roundVolume20.canEqual((java.lang.Object) 10L);
        java.lang.String str27 = roundVolume20.toString();
        int int28 = roundVolume20.getDiameter();
        boolean boolean29 = roundVolume3.canEqual((java.lang.Object) int28);
        roundVolume3.setVolume((double) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "RoundVolume(length=100.0, diameter=10, volume=10.0)" + "'", str27, "RoundVolume(length=100.0, diameter=10, volume=10.0)");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        int int9 = roundVolume3.getDiameter();
        roundVolume3.setLength((double) (-1));
        roundVolume3.setVolume((double) 10.0f);
        logic.RoundVolume roundVolume17 = new logic.RoundVolume((double) 1, (int) 'a', (double) (byte) -1);
        logic.YourWood yourWood18 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList19 = yourWood18.getWood();
        yourWood18.lengthFirstSortWood();
        boolean boolean21 = roundVolume17.equals((java.lang.Object) yourWood18);
        boolean boolean22 = roundVolume3.canEqual((java.lang.Object) roundVolume17);
        roundVolume17.setLength((double) (byte) -1);
        logic.RoundVolume roundVolume28 = new logic.RoundVolume((double) (short) 10, (int) '4', 0.0d);
        logic.RoundVolume roundVolume32 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume32.setLength((double) 1L);
        logic.YourWood yourWood35 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList36 = yourWood35.getWood();
        yourWood35.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList38 = yourWood35.getWood();
        yourWood35.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList40 = yourWood35.getWood();
        boolean boolean41 = roundVolume32.canEqual((java.lang.Object) roundVolumeList40);
        boolean boolean42 = roundVolume28.canEqual((java.lang.Object) roundVolume32);
        boolean boolean43 = roundVolume17.equals((java.lang.Object) roundVolume28);
        int int44 = roundVolume28.getDiameter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(roundVolumeList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(roundVolumeList36);
        org.junit.Assert.assertNotNull(roundVolumeList38);
        org.junit.Assert.assertNotNull(roundVolumeList40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 52 + "'", int44 == 52);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setDiameter((int) (byte) 0);
        roundVolume3.setVolume(32.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        roundVolume3.setDiameter((int) (byte) 100);
        roundVolume3.setDiameter((int) (short) 10);
        roundVolume3.setDiameter((int) (short) 1);
        roundVolume3.setDiameter(100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setVolume(0.0d);
        roundVolume3.setDiameter((int) (short) 0);
        java.lang.String str13 = roundVolume3.toString();
        double double14 = roundVolume3.getVolume();
        logic.RoundVolume roundVolume18 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume18.setLength((double) (-1.0f));
        java.lang.String str21 = roundVolume18.toString();
        double double22 = roundVolume18.getVolume();
        double double23 = roundVolume18.getLength();
        int int24 = roundVolume18.getDiameter();
        java.lang.String str25 = roundVolume18.toString();
        logic.RoundVolume roundVolume29 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume29.setDiameter((int) (byte) 10);
        java.lang.Object obj32 = null;
        boolean boolean33 = roundVolume29.canEqual(obj32);
        boolean boolean35 = roundVolume29.canEqual((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass36 = roundVolume29.getClass();
        boolean boolean37 = roundVolume18.equals((java.lang.Object) wildcardClass36);
        logic.RoundVolume roundVolume41 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume41.setLength((double) (-1.0f));
        java.lang.String str44 = roundVolume41.toString();
        double double45 = roundVolume41.getVolume();
        double double46 = roundVolume41.getLength();
        int int47 = roundVolume41.getDiameter();
        roundVolume41.setVolume((double) (-1));
        roundVolume41.setVolume((double) 10.0f);
        boolean boolean52 = roundVolume18.equals((java.lang.Object) 10.0f);
        boolean boolean53 = roundVolume3.canEqual((java.lang.Object) roundVolume18);
        double double54 = roundVolume3.getVolume();
        logic.RoundVolume roundVolume58 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        double double59 = roundVolume58.getLength();
        boolean boolean60 = roundVolume3.canEqual((java.lang.Object) roundVolume58);
        java.lang.String str61 = roundVolume3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str13, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str21, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str25, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str44, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1.0d) + "'", double46 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 100.0d + "'", double59 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str61, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 10L, 100, (double) (byte) -1);
        java.lang.String str4 = roundVolume3.toString();
        logic.RoundVolume roundVolume8 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume8.setLength((double) (-1.0f));
        java.lang.String str11 = roundVolume8.toString();
        roundVolume8.setLength(100.0d);
        roundVolume8.setLength((double) 100L);
        logic.YourWood yourWood16 = new logic.YourWood();
        yourWood16.lengthFirstSortWood();
        yourWood16.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList19 = yourWood16.getWood();
        boolean boolean20 = roundVolume8.canEqual((java.lang.Object) yourWood16);
        boolean boolean21 = roundVolume3.equals((java.lang.Object) yourWood16);
        yourWood16.diameterFirstSortWood();
        yourWood16.diameterFirstSortWood();
        yourWood16.lengthFirstSortWood();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RoundVolume(length=10.0, diameter=100, volume=-1.0)" + "'", str4, "RoundVolume(length=10.0, diameter=100, volume=-1.0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str11, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertNotNull(roundVolumeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
        yourWood0.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList3 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.diameterFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList1);
        org.junit.Assert.assertNotNull(roundVolumeList3);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        logic.YourWood yourWood0 = new logic.YourWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList2 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.lengthFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList2);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        com.fasterxml.jackson.databind.ObjectMapper objectMapper6 = logic.VolumeDB.mapper;
        logic.VolumeDB.mapper = objectMapper6;
        logic.VolumeDB.mapper = objectMapper6;
        logic.VolumeDB.mapper = objectMapper6;
        logic.VolumeDB.mapper = objectMapper6;
        boolean boolean11 = roundVolume3.canEqual((java.lang.Object) objectMapper6);
        int int12 = roundVolume3.getDiameter();
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume3.setDiameter((int) (byte) 10);
        roundVolume3.setDiameter((int) (byte) -1);
        roundVolume3.setVolume((double) '4');
        double double10 = roundVolume3.getLength();
        roundVolume3.setDiameter((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
// flaky:         yourWood0.addWood((double) 10, 10);
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList6 = yourWood0.getWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList7 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList1);
        org.junit.Assert.assertNotNull(roundVolumeList6);
        org.junit.Assert.assertNotNull(roundVolumeList7);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        roundVolume3.setDiameter((int) (byte) 100);
        double double12 = roundVolume3.getLength();
        double double13 = roundVolume3.getLength();
        double double14 = roundVolume3.getVolume();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-1.0d) + "'", double13 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        logic.YourWood yourWood0 = new logic.YourWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList4 = yourWood0.getWood();
        org.junit.Assert.assertNotNull(roundVolumeList4);
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100, 0, (double) (short) 0);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        logic.YourWood yourWood10 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList11 = yourWood10.getWood();
        yourWood10.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList13 = yourWood10.getWood();
        yourWood10.lengthFirstSortWood();
        yourWood10.diameterFirstSortWood();
        boolean boolean16 = roundVolume3.equals((java.lang.Object) yourWood10);
        roundVolume3.setDiameter((-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(roundVolumeList11);
        org.junit.Assert.assertNotNull(roundVolumeList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        int int9 = roundVolume3.getDiameter();
        roundVolume3.setLength((double) (-1));
        roundVolume3.setDiameter((int) '4');
        java.lang.String str14 = roundVolume3.toString();
        logic.RoundVolume roundVolume18 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume18.setLength((double) 1L);
        int int21 = roundVolume18.getDiameter();
        roundVolume18.setDiameter(0);
        roundVolume18.setDiameter((int) '4');
        boolean boolean26 = roundVolume3.equals((java.lang.Object) roundVolume18);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "RoundVolume(length=-1.0, diameter=52, volume=10.0)" + "'", str14, "RoundVolume(length=-1.0, diameter=52, volume=10.0)");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (byte) 100, 0, (double) 0.0f);
        double double4 = roundVolume3.getVolume();
        roundVolume3.setLength((double) 100L);
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (short) 0, (int) (short) 10, (double) (short) 10);
        logic.RoundVolume roundVolume7 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume7.setLength((double) (-1.0f));
        java.lang.String str10 = roundVolume7.toString();
        double double11 = roundVolume7.getVolume();
        double double12 = roundVolume7.getLength();
        int int13 = roundVolume7.getDiameter();
        logic.RoundVolume roundVolume17 = new logic.RoundVolume((double) (byte) 100, 0, (double) 0.0f);
        boolean boolean18 = roundVolume7.equals((java.lang.Object) 0.0f);
        boolean boolean19 = roundVolume3.equals((java.lang.Object) roundVolume7);
        roundVolume7.setLength((double) (short) 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str10, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) '#', (int) 'a', (double) 1.0f);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (short) 1, (int) (short) 100, (double) 0L);
        logic.RoundVolume roundVolume7 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume7.setLength((double) (-1.0f));
        java.lang.String str10 = roundVolume7.toString();
        roundVolume7.setLength(100.0d);
        roundVolume7.setVolume(0.0d);
        roundVolume7.setDiameter((int) (short) 0);
        java.lang.String str17 = roundVolume7.toString();
        double double18 = roundVolume7.getVolume();
        logic.RoundVolume roundVolume22 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume22.setLength((double) (-1.0f));
        java.lang.String str25 = roundVolume22.toString();
        double double26 = roundVolume22.getVolume();
        double double27 = roundVolume22.getLength();
        int int28 = roundVolume22.getDiameter();
        java.lang.String str29 = roundVolume22.toString();
        logic.RoundVolume roundVolume33 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume33.setDiameter((int) (byte) 10);
        java.lang.Object obj36 = null;
        boolean boolean37 = roundVolume33.canEqual(obj36);
        boolean boolean39 = roundVolume33.canEqual((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass40 = roundVolume33.getClass();
        boolean boolean41 = roundVolume22.equals((java.lang.Object) wildcardClass40);
        logic.RoundVolume roundVolume45 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume45.setLength((double) (-1.0f));
        java.lang.String str48 = roundVolume45.toString();
        double double49 = roundVolume45.getVolume();
        double double50 = roundVolume45.getLength();
        int int51 = roundVolume45.getDiameter();
        roundVolume45.setVolume((double) (-1));
        roundVolume45.setVolume((double) 10.0f);
        boolean boolean56 = roundVolume22.equals((java.lang.Object) 10.0f);
        boolean boolean57 = roundVolume7.canEqual((java.lang.Object) roundVolume22);
        double double58 = roundVolume7.getVolume();
        logic.RoundVolume roundVolume62 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        double double63 = roundVolume62.getLength();
        boolean boolean64 = roundVolume7.canEqual((java.lang.Object) roundVolume62);
        boolean boolean65 = roundVolume3.equals((java.lang.Object) boolean64);
        java.lang.String str66 = roundVolume3.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str10, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str17, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str25, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str29, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str48, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-1.0d) + "'", double50 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 0.0d + "'", double58 == 0.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 100.0d + "'", double63 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "RoundVolume(length=1.0, diameter=100, volume=0.0)" + "'", str66, "RoundVolume(length=1.0, diameter=100, volume=0.0)");
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        logic.YourWood yourWood0 = new logic.YourWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.lengthFirstSortWood();
// flaky:         yourWood0.addWood((double) 10.0f, (int) (byte) 10);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setDiameter((int) (byte) 0);
        java.lang.String str11 = roundVolume3.toString();
        roundVolume3.setDiameter((int) (byte) -1);
        int int14 = roundVolume3.getDiameter();
        java.lang.Object obj15 = null;
        boolean boolean16 = roundVolume3.canEqual(obj15);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=10.0)" + "'", str11, "RoundVolume(length=100.0, diameter=0, volume=10.0)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList3 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.lengthFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList1);
        org.junit.Assert.assertNotNull(roundVolumeList3);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (-1), (int) (short) 100, (double) 1);
        roundVolume3.setDiameter((int) (byte) 1);
        double double6 = roundVolume3.getVolume();
        logic.YourWood yourWood7 = new logic.YourWood();
        yourWood7.diameterFirstSortWood();
        yourWood7.diameterFirstSortWood();
        yourWood7.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList11 = yourWood7.getWood();
        yourWood7.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList13 = yourWood7.getWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList14 = yourWood7.getWood();
        boolean boolean15 = roundVolume3.equals((java.lang.Object) yourWood7);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertNotNull(roundVolumeList11);
        org.junit.Assert.assertNotNull(roundVolumeList13);
        org.junit.Assert.assertNotNull(roundVolumeList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        int int9 = roundVolume3.getDiameter();
        logic.RoundVolume roundVolume13 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume13.setLength((double) (-1.0f));
        java.lang.String str16 = roundVolume13.toString();
        roundVolume13.setLength(100.0d);
        roundVolume13.setVolume(0.0d);
        boolean boolean21 = roundVolume3.equals((java.lang.Object) 0.0d);
        int int22 = roundVolume3.getDiameter();
        java.lang.Class<?> wildcardClass23 = roundVolume3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str16, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setVolume(0.0d);
        int int11 = roundVolume3.getDiameter();
        roundVolume3.setVolume((double) 0);
        roundVolume3.setLength((double) 52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (byte) -1, 0, (double) (byte) 10);
        logic.RoundVolume roundVolume7 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume7.setLength((double) (-1.0f));
        java.lang.String str10 = roundVolume7.toString();
        double double11 = roundVolume7.getVolume();
        double double12 = roundVolume7.getLength();
        int int13 = roundVolume7.getDiameter();
        java.lang.String str14 = roundVolume7.toString();
        logic.RoundVolume roundVolume18 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume18.setDiameter((int) (byte) 10);
        java.lang.Object obj21 = null;
        boolean boolean22 = roundVolume18.canEqual(obj21);
        boolean boolean24 = roundVolume18.canEqual((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass25 = roundVolume18.getClass();
        boolean boolean26 = roundVolume7.equals((java.lang.Object) wildcardClass25);
        logic.RoundVolume roundVolume30 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume30.setLength((double) (-1.0f));
        java.lang.String str33 = roundVolume30.toString();
        double double34 = roundVolume30.getVolume();
        double double35 = roundVolume30.getLength();
        int int36 = roundVolume30.getDiameter();
        roundVolume30.setVolume((double) (-1));
        roundVolume30.setVolume((double) 10.0f);
        boolean boolean41 = roundVolume7.equals((java.lang.Object) 10.0f);
        int int42 = roundVolume7.getDiameter();
        logic.RoundVolume roundVolume46 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume46.setLength((double) (-1.0f));
        double double49 = roundVolume46.getVolume();
        boolean boolean50 = roundVolume7.equals((java.lang.Object) double49);
        boolean boolean51 = roundVolume3.canEqual((java.lang.Object) boolean50);
        java.lang.Class<?> wildcardClass52 = roundVolume3.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str10, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str14, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str33, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + (-1.0d) + "'", double35 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) '#', (int) (short) -1, (double) 0L);
        logic.RoundVolume roundVolume7 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume7.setLength((double) (-1.0f));
        java.lang.String str10 = roundVolume7.toString();
        roundVolume7.setLength(100.0d);
        roundVolume7.setVolume(0.0d);
        java.lang.String str15 = roundVolume7.toString();
        double double16 = roundVolume7.getVolume();
        boolean boolean17 = roundVolume3.equals((java.lang.Object) double16);
        java.lang.String str18 = roundVolume3.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str10, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "RoundVolume(length=100.0, diameter=1, volume=0.0)" + "'", str15, "RoundVolume(length=100.0, diameter=1, volume=0.0)");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "RoundVolume(length=35.0, diameter=-1, volume=0.0)" + "'", str18, "RoundVolume(length=35.0, diameter=-1, volume=0.0)");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        java.lang.String str10 = roundVolume3.toString();
        logic.RoundVolume roundVolume14 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume14.setDiameter((int) (byte) 10);
        java.lang.Object obj17 = null;
        boolean boolean18 = roundVolume14.canEqual(obj17);
        boolean boolean20 = roundVolume14.canEqual((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass21 = roundVolume14.getClass();
        boolean boolean22 = roundVolume3.equals((java.lang.Object) wildcardClass21);
        int int23 = roundVolume3.getDiameter();
        java.lang.Class<?> wildcardClass24 = roundVolume3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str10, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 1L, (int) 'a', (double) 1);
        roundVolume3.setDiameter((int) (short) 0);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getLength();
        int int8 = roundVolume3.getDiameter();
        roundVolume3.setLength((double) (-1));
        java.lang.String str11 = roundVolume3.toString();
        logic.YourWood yourWood12 = new logic.YourWood();
        yourWood12.lengthFirstSortWood();
        yourWood12.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList15 = yourWood12.getWood();
        boolean boolean16 = roundVolume3.canEqual((java.lang.Object) yourWood12);
        yourWood12.lengthFirstSortWood();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str11, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertNotNull(roundVolumeList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 32, 1, 1.0d);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume(100.0d, 0, (double) 100);
        roundVolume3.setDiameter((int) (short) 10);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getLength();
        int int8 = roundVolume3.getDiameter();
        roundVolume3.setLength((double) (-1));
        java.lang.String str11 = roundVolume3.toString();
        logic.YourWood yourWood12 = new logic.YourWood();
        yourWood12.lengthFirstSortWood();
        yourWood12.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList15 = yourWood12.getWood();
        boolean boolean16 = roundVolume3.canEqual((java.lang.Object) yourWood12);
        roundVolume3.setDiameter(97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str11, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertNotNull(roundVolumeList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.lengthFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList1);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        boolean boolean10 = roundVolume3.canEqual((java.lang.Object) (byte) -1);
        roundVolume3.setDiameter(100);
        roundVolume3.setDiameter(1);
        logic.YourWood yourWood15 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList16 = yourWood15.getWood();
// flaky:         yourWood15.addWood((double) 10, 10);
        yourWood15.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList21 = yourWood15.getWood();
        boolean boolean22 = roundVolume3.equals((java.lang.Object) yourWood15);
        double double23 = roundVolume3.getVolume();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(roundVolumeList16);
        org.junit.Assert.assertNotNull(roundVolumeList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        java.lang.String str9 = roundVolume3.toString();
        logic.RoundVolume roundVolume13 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume13.setLength((double) (-1.0f));
        java.lang.String str16 = roundVolume13.toString();
        double double17 = roundVolume13.getVolume();
        double double18 = roundVolume13.getVolume();
        boolean boolean20 = roundVolume13.canEqual((java.lang.Object) (byte) -1);
        roundVolume13.setDiameter(100);
        boolean boolean23 = roundVolume3.equals((java.lang.Object) roundVolume13);
        double double24 = roundVolume3.getVolume();
        java.lang.String str25 = roundVolume3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RoundVolume(length=100.0, diameter=1, volume=10.0)" + "'", str9, "RoundVolume(length=100.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str16, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "RoundVolume(length=100.0, diameter=1, volume=10.0)" + "'", str25, "RoundVolume(length=100.0, diameter=1, volume=10.0)");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        com.fasterxml.jackson.databind.ObjectMapper objectMapper6 = logic.VolumeDB.mapper;
        logic.VolumeDB.mapper = objectMapper6;
        logic.VolumeDB.mapper = objectMapper6;
        logic.VolumeDB.mapper = objectMapper6;
        logic.VolumeDB.mapper = objectMapper6;
        boolean boolean11 = roundVolume3.canEqual((java.lang.Object) objectMapper6);
        logic.RoundVolume roundVolume15 = new logic.RoundVolume((double) 1.0f, (int) 'a', (double) 'a');
        roundVolume15.setLength((double) 1.0f);
        boolean boolean18 = roundVolume3.equals((java.lang.Object) roundVolume15);
        double double19 = roundVolume15.getVolume();
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 97.0d + "'", double19 == 97.0d);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        boolean boolean10 = roundVolume3.equals((java.lang.Object) 0.0f);
        double double11 = roundVolume3.getVolume();
        double double12 = roundVolume3.getVolume();
        logic.RoundVolume roundVolume16 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume16.setLength((double) (-1.0f));
        java.lang.String str19 = roundVolume16.toString();
        double double20 = roundVolume16.getVolume();
        double double21 = roundVolume16.getLength();
        int int22 = roundVolume16.getDiameter();
        java.lang.String str23 = roundVolume16.toString();
        logic.RoundVolume roundVolume27 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume27.setDiameter((int) (byte) 10);
        java.lang.Object obj30 = null;
        boolean boolean31 = roundVolume27.canEqual(obj30);
        boolean boolean33 = roundVolume27.canEqual((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass34 = roundVolume27.getClass();
        boolean boolean35 = roundVolume16.equals((java.lang.Object) wildcardClass34);
        int int36 = roundVolume16.getDiameter();
        boolean boolean37 = roundVolume3.equals((java.lang.Object) roundVolume16);
        logic.RoundVolume roundVolume41 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume41.setLength((double) (-1.0f));
        java.lang.String str44 = roundVolume41.toString();
        double double45 = roundVolume41.getVolume();
        double double46 = roundVolume41.getLength();
        int int47 = roundVolume41.getDiameter();
        logic.YourWood yourWood48 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList49 = yourWood48.getWood();
        yourWood48.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList51 = yourWood48.getWood();
        yourWood48.lengthFirstSortWood();
        yourWood48.diameterFirstSortWood();
        boolean boolean54 = roundVolume41.equals((java.lang.Object) yourWood48);
        boolean boolean55 = roundVolume16.equals((java.lang.Object) roundVolume41);
        roundVolume41.setDiameter((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str19, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str23, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str44, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1.0d) + "'", double46 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(roundVolumeList49);
        org.junit.Assert.assertNotNull(roundVolumeList51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        java.lang.String str10 = roundVolume3.toString();
        logic.RoundVolume roundVolume14 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume14.setDiameter((int) (byte) 10);
        java.lang.Object obj17 = null;
        boolean boolean18 = roundVolume14.canEqual(obj17);
        boolean boolean20 = roundVolume14.canEqual((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass21 = roundVolume14.getClass();
        boolean boolean22 = roundVolume3.equals((java.lang.Object) wildcardClass21);
        logic.RoundVolume roundVolume26 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume26.setLength((double) (-1.0f));
        java.lang.String str29 = roundVolume26.toString();
        double double30 = roundVolume26.getVolume();
        double double31 = roundVolume26.getLength();
        int int32 = roundVolume26.getDiameter();
        roundVolume26.setVolume((double) (-1));
        roundVolume26.setVolume((double) 10.0f);
        boolean boolean37 = roundVolume3.equals((java.lang.Object) 10.0f);
        int int38 = roundVolume3.getDiameter();
        roundVolume3.setDiameter((int) (byte) 1);
        logic.RoundVolume roundVolume41 = new logic.RoundVolume();
        double double42 = roundVolume41.getVolume();
        logic.RoundVolume roundVolume46 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume46.setLength((double) (-1.0f));
        java.lang.String str49 = roundVolume46.toString();
        roundVolume46.setLength(100.0d);
        roundVolume46.setVolume(0.0d);
        logic.RoundVolume roundVolume57 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume57.setLength((double) 1L);
        boolean boolean60 = roundVolume46.canEqual((java.lang.Object) roundVolume57);
        boolean boolean61 = roundVolume41.canEqual((java.lang.Object) roundVolume46);
        roundVolume41.setVolume((double) ' ');
        roundVolume41.setLength((double) 100.0f);
        logic.RoundVolume roundVolume69 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume69.setLength((double) (-1.0f));
        java.lang.String str72 = roundVolume69.toString();
        roundVolume69.setLength(100.0d);
        java.lang.String str75 = roundVolume69.toString();
        logic.RoundVolume roundVolume79 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume79.setLength((double) (-1.0f));
        java.lang.String str82 = roundVolume79.toString();
        double double83 = roundVolume79.getVolume();
        double double84 = roundVolume79.getVolume();
        boolean boolean86 = roundVolume79.canEqual((java.lang.Object) (byte) -1);
        roundVolume79.setDiameter(100);
        boolean boolean89 = roundVolume69.equals((java.lang.Object) roundVolume79);
        boolean boolean90 = roundVolume41.equals((java.lang.Object) boolean89);
        boolean boolean91 = roundVolume3.equals((java.lang.Object) roundVolume41);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str10, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str29, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 0.0d + "'", double42 == 0.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str49, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str72, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "RoundVolume(length=100.0, diameter=1, volume=10.0)" + "'", str75, "RoundVolume(length=100.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str82, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 10.0d + "'", double83 == 10.0d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 10.0d + "'", double84 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (-1), (int) (short) 100, (double) 1);
        roundVolume3.setDiameter((int) (byte) 1);
        logic.YourWood yourWood6 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList7 = yourWood6.getWood();
        yourWood6.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList9 = yourWood6.getWood();
        yourWood6.lengthFirstSortWood();
// flaky:         yourWood6.addWood((double) 1L, (int) (byte) 100);
        yourWood6.diameterFirstSortWood();
        java.lang.Class<?> wildcardClass15 = yourWood6.getClass();
        boolean boolean16 = roundVolume3.equals((java.lang.Object) yourWood6);
        org.junit.Assert.assertNotNull(roundVolumeList7);
        org.junit.Assert.assertNotNull(roundVolumeList9);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        int int8 = roundVolume3.getDiameter();
        double double9 = roundVolume3.getVolume();
        double double10 = roundVolume3.getVolume();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (-1), 0, (double) (byte) 10);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        java.lang.String str4 = roundVolume3.toString();
        roundVolume3.setLength((-1.0d));
        roundVolume3.setDiameter(1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RoundVolume(length=0.0, diameter=1, volume=10.0)" + "'", str4, "RoundVolume(length=0.0, diameter=1, volume=10.0)");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        boolean boolean10 = roundVolume3.equals((java.lang.Object) "");
        roundVolume3.setLength(0.0d);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.Class<?> wildcardClass15 = roundVolume3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        roundVolume3.setDiameter((int) (byte) 100);
        logic.YourWood yourWood12 = new logic.YourWood();
        yourWood12.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList14 = yourWood12.getWood();
        boolean boolean15 = roundVolume3.equals((java.lang.Object) roundVolumeList14);
        roundVolume3.setDiameter((int) 'a');
        java.lang.String str18 = roundVolume3.toString();
        roundVolume3.setLength((double) (-1.0f));
        double double21 = roundVolume3.getVolume();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(roundVolumeList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "RoundVolume(length=-1.0, diameter=97, volume=10.0)" + "'", str18, "RoundVolume(length=-1.0, diameter=97, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) 1L);
        logic.YourWood yourWood6 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList7 = yourWood6.getWood();
        yourWood6.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList9 = yourWood6.getWood();
        yourWood6.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList11 = yourWood6.getWood();
        boolean boolean12 = roundVolume3.canEqual((java.lang.Object) roundVolumeList11);
        roundVolume3.setLength((double) '#');
        roundVolume3.setVolume((double) 52);
        org.junit.Assert.assertNotNull(roundVolumeList7);
        org.junit.Assert.assertNotNull(roundVolumeList9);
        org.junit.Assert.assertNotNull(roundVolumeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        logic.RoundVolume roundVolume12 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume12.setLength((double) (-1.0f));
        java.lang.String str15 = roundVolume12.toString();
        double double16 = roundVolume12.getVolume();
        double double17 = roundVolume12.getVolume();
        boolean boolean19 = roundVolume12.canEqual((java.lang.Object) (byte) -1);
        roundVolume12.setDiameter(100);
        roundVolume12.setDiameter((int) '4');
        boolean boolean24 = roundVolume3.equals((java.lang.Object) '4');
        logic.RoundVolume roundVolume28 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume28.setLength((double) (-1.0f));
        java.lang.String str31 = roundVolume28.toString();
        double double32 = roundVolume28.getVolume();
        double double33 = roundVolume28.getLength();
        int int34 = roundVolume28.getDiameter();
        roundVolume28.setDiameter((int) (byte) 100);
        roundVolume28.setDiameter((int) (short) 10);
        logic.RoundVolume roundVolume42 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume42.setLength((double) (-1.0f));
        java.lang.String str45 = roundVolume42.toString();
        roundVolume42.setLength(100.0d);
        roundVolume42.setVolume(0.0d);
        logic.RoundVolume roundVolume53 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume53.setLength((double) 1L);
        boolean boolean56 = roundVolume42.canEqual((java.lang.Object) roundVolume53);
        boolean boolean57 = roundVolume28.canEqual((java.lang.Object) roundVolume42);
        logic.YourWood yourWood58 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList59 = yourWood58.getWood();
        yourWood58.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList61 = yourWood58.getWood();
        boolean boolean62 = roundVolume28.canEqual((java.lang.Object) roundVolumeList61);
        boolean boolean63 = roundVolume3.canEqual((java.lang.Object) roundVolumeList61);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str15, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str31, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + (-1.0d) + "'", double33 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str45, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(roundVolumeList59);
        org.junit.Assert.assertNotNull(roundVolumeList61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 10L, 100, (double) (byte) -1);
        java.lang.String str4 = roundVolume3.toString();
        logic.RoundVolume roundVolume8 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume8.setLength((double) (-1.0f));
        java.lang.String str11 = roundVolume8.toString();
        roundVolume8.setLength(100.0d);
        roundVolume8.setLength((double) 100L);
        logic.YourWood yourWood16 = new logic.YourWood();
        yourWood16.lengthFirstSortWood();
        yourWood16.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList19 = yourWood16.getWood();
        boolean boolean20 = roundVolume8.canEqual((java.lang.Object) yourWood16);
        boolean boolean21 = roundVolume3.equals((java.lang.Object) yourWood16);
        yourWood16.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList23 = yourWood16.getWood();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RoundVolume(length=10.0, diameter=100, volume=-1.0)" + "'", str4, "RoundVolume(length=10.0, diameter=100, volume=-1.0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str11, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertNotNull(roundVolumeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(roundVolumeList23);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList3 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList6 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList8 = yourWood0.getWood();
        yourWood0.diameterFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList1);
        org.junit.Assert.assertNotNull(roundVolumeList3);
        org.junit.Assert.assertNotNull(roundVolumeList6);
        org.junit.Assert.assertNotNull(roundVolumeList8);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setVolume(0.0d);
        int int11 = roundVolume3.getDiameter();
        roundVolume3.setVolume((double) 0);
        double double14 = roundVolume3.getVolume();
        java.lang.String str15 = roundVolume3.toString();
        double double16 = roundVolume3.getLength();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "RoundVolume(length=100.0, diameter=1, volume=0.0)" + "'", str15, "RoundVolume(length=100.0, diameter=1, volume=0.0)");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100, (int) (byte) 100, 100.0d);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setVolume(0.0d);
        roundVolume3.setDiameter((int) (short) 0);
        java.lang.String str13 = roundVolume3.toString();
        double double14 = roundVolume3.getVolume();
        logic.RoundVolume roundVolume18 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume18.setLength((double) (-1.0f));
        java.lang.String str21 = roundVolume18.toString();
        double double22 = roundVolume18.getVolume();
        double double23 = roundVolume18.getLength();
        int int24 = roundVolume18.getDiameter();
        java.lang.String str25 = roundVolume18.toString();
        logic.RoundVolume roundVolume29 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume29.setDiameter((int) (byte) 10);
        java.lang.Object obj32 = null;
        boolean boolean33 = roundVolume29.canEqual(obj32);
        boolean boolean35 = roundVolume29.canEqual((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass36 = roundVolume29.getClass();
        boolean boolean37 = roundVolume18.equals((java.lang.Object) wildcardClass36);
        logic.RoundVolume roundVolume41 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume41.setLength((double) (-1.0f));
        java.lang.String str44 = roundVolume41.toString();
        double double45 = roundVolume41.getVolume();
        double double46 = roundVolume41.getLength();
        int int47 = roundVolume41.getDiameter();
        roundVolume41.setVolume((double) (-1));
        roundVolume41.setVolume((double) 10.0f);
        boolean boolean52 = roundVolume18.equals((java.lang.Object) 10.0f);
        boolean boolean53 = roundVolume3.canEqual((java.lang.Object) roundVolume18);
        boolean boolean55 = roundVolume3.equals((java.lang.Object) "RoundVolume(length=0.0, diameter=1, volume=10.0)");
        logic.YourWood yourWood56 = new logic.YourWood();
        yourWood56.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList58 = yourWood56.getWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList59 = yourWood56.getWood();
        yourWood56.lengthFirstSortWood();
        boolean boolean61 = roundVolume3.equals((java.lang.Object) yourWood56);
        boolean boolean63 = roundVolume3.equals((java.lang.Object) 97);
        roundVolume3.setVolume((double) 10.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str13, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str21, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str25, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str44, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1.0d) + "'", double46 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(roundVolumeList58);
        org.junit.Assert.assertNotNull(roundVolumeList59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (short) -1, (int) (short) 10, 0.0d);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (-1L), 97, (double) 10L);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (short) 10, (int) '4', 0.0d);
        double double4 = roundVolume3.getLength();
        double double5 = roundVolume3.getVolume();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume(100.0d, (int) (byte) 100, (double) 'a');
        double double4 = roundVolume3.getVolume();
        boolean boolean6 = roundVolume3.canEqual((java.lang.Object) "RoundVolume(length=-1.0, diameter=1, volume=-1.0)");
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 97.0d + "'", double4 == 97.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) ' ', (int) (short) -1, (double) (byte) 1);
        logic.RoundVolume roundVolume7 = new logic.RoundVolume(0.0d, (int) (byte) 1, (double) ' ');
        boolean boolean8 = roundVolume3.equals((java.lang.Object) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (short) 100, (int) (short) 0, (double) (byte) -1);
        roundVolume3.setDiameter(0);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setVolume(0.0d);
        roundVolume3.setDiameter((int) (short) 0);
        int int13 = roundVolume3.getDiameter();
        java.lang.String str14 = roundVolume3.toString();
        logic.RoundVolume roundVolume18 = new logic.RoundVolume((double) 10L, 100, (double) (byte) -1);
        boolean boolean19 = roundVolume3.equals((java.lang.Object) roundVolume18);
        roundVolume18.setVolume((double) (short) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str14, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (byte) 100, 0, (double) 0.0f);
        roundVolume3.setLength((double) (byte) 0);
        double double6 = roundVolume3.getLength();
        java.lang.String str7 = roundVolume3.toString();
        int int8 = roundVolume3.getDiameter();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "RoundVolume(length=0.0, diameter=0, volume=0.0)" + "'", str7, "RoundVolume(length=0.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        boolean boolean10 = roundVolume3.equals((java.lang.Object) 10L);
        double double11 = roundVolume3.getVolume();
        roundVolume3.setDiameter(0);
        roundVolume3.setDiameter(32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        java.lang.String str10 = roundVolume3.toString();
        logic.RoundVolume roundVolume14 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume14.setDiameter((int) (byte) 10);
        java.lang.Object obj17 = null;
        boolean boolean18 = roundVolume14.canEqual(obj17);
        boolean boolean20 = roundVolume14.canEqual((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass21 = roundVolume14.getClass();
        boolean boolean22 = roundVolume3.equals((java.lang.Object) wildcardClass21);
        double double23 = roundVolume3.getVolume();
        double double24 = roundVolume3.getVolume();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str10, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((-1.0d), (int) (short) 100, 1.0d);
        java.lang.Object obj4 = null;
        boolean boolean5 = roundVolume3.canEqual(obj4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        java.lang.String str10 = roundVolume3.toString();
        logic.RoundVolume roundVolume14 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume14.setDiameter((int) (byte) 10);
        java.lang.Object obj17 = null;
        boolean boolean18 = roundVolume14.canEqual(obj17);
        boolean boolean20 = roundVolume14.canEqual((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass21 = roundVolume14.getClass();
        boolean boolean22 = roundVolume3.equals((java.lang.Object) wildcardClass21);
        int int23 = roundVolume3.getDiameter();
        roundVolume3.setDiameter((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str10, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        logic.YourWood yourWood0 = new logic.YourWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList2 = yourWood0.getWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList3 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList5 = yourWood0.getWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList6 = yourWood0.getWood();
        org.junit.Assert.assertNotNull(roundVolumeList2);
        org.junit.Assert.assertNotNull(roundVolumeList3);
        org.junit.Assert.assertNotNull(roundVolumeList5);
        org.junit.Assert.assertNotNull(roundVolumeList6);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.lengthFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList1);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        int int8 = roundVolume3.getDiameter();
        java.lang.Class<?> wildcardClass9 = roundVolume3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList3 = yourWood0.getWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList4 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList1);
        org.junit.Assert.assertNotNull(roundVolumeList3);
        org.junit.Assert.assertNotNull(roundVolumeList4);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setDiameter((int) (byte) 0);
        java.lang.String str11 = roundVolume3.toString();
        boolean boolean13 = roundVolume3.equals((java.lang.Object) (-1L));
        roundVolume3.setVolume((double) (-1));
        double double16 = roundVolume3.getLength();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=10.0)" + "'", str11, "RoundVolume(length=100.0, diameter=0, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume(100.0d, (int) (short) 1, (double) 32);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume(100.0d, (int) (byte) 100, (double) 'a');
        roundVolume3.setLength((double) (-1.0f));
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (byte) 0, 0, (double) (-1));
        double double4 = roundVolume3.getLength();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        logic.RoundVolume roundVolume12 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume12.setLength((double) 1L);
        int int15 = roundVolume12.getDiameter();
        double double16 = roundVolume12.getVolume();
        logic.RoundVolume roundVolume20 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume20.setDiameter((int) (byte) 10);
        java.lang.Object obj23 = null;
        boolean boolean24 = roundVolume20.canEqual(obj23);
        boolean boolean26 = roundVolume20.equals((java.lang.Object) ' ');
        boolean boolean27 = roundVolume12.canEqual((java.lang.Object) ' ');
        boolean boolean28 = roundVolume3.canEqual((java.lang.Object) boolean27);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        roundVolume3.setVolume((double) (-1));
        int int12 = roundVolume3.getDiameter();
        logic.RoundVolume roundVolume16 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume16.setDiameter((int) (byte) 10);
        roundVolume16.setDiameter((int) (byte) -1);
        int int21 = roundVolume16.getDiameter();
        boolean boolean22 = roundVolume3.equals((java.lang.Object) roundVolume16);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        logic.RoundVolume roundVolume13 = new logic.RoundVolume((double) (byte) 100, 0, (double) 0.0f);
        boolean boolean14 = roundVolume3.equals((java.lang.Object) 0.0f);
        roundVolume3.setVolume((double) (short) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 10L, 1, (double) '#');
        roundVolume3.setDiameter((int) (short) 1);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setLength((double) 100L);
        logic.YourWood yourWood11 = new logic.YourWood();
        yourWood11.lengthFirstSortWood();
        yourWood11.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList14 = yourWood11.getWood();
        boolean boolean15 = roundVolume3.canEqual((java.lang.Object) yourWood11);
        yourWood11.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList17 = yourWood11.getWood();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertNotNull(roundVolumeList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(roundVolumeList17);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setVolume(0.0d);
        roundVolume3.setDiameter((int) (short) 0);
        java.lang.String str13 = roundVolume3.toString();
        int int14 = roundVolume3.getDiameter();
        roundVolume3.setVolume((double) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str13, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        logic.RoundVolume roundVolume0 = new logic.RoundVolume();
        double double1 = roundVolume0.getVolume();
        java.lang.String str2 = roundVolume0.toString();
        logic.YourWood yourWood3 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList4 = yourWood3.getWood();
// flaky:         yourWood3.addWood((double) 10, 10);
        yourWood3.diameterFirstSortWood();
        yourWood3.lengthFirstSortWood();
        boolean boolean10 = roundVolume0.equals((java.lang.Object) yourWood3);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "RoundVolume(length=0.0, diameter=0, volume=0.0)" + "'", str2, "RoundVolume(length=0.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertNotNull(roundVolumeList4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (short) 1, (int) (short) 100, (double) 0L);
        int int4 = roundVolume3.getDiameter();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        logic.RoundVolume roundVolume7 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        boolean boolean8 = roundVolume3.equals((java.lang.Object) (short) 1);
        int int9 = roundVolume3.getDiameter();
        logic.RoundVolume roundVolume13 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume13.setLength((double) (-1.0f));
        java.lang.String str16 = roundVolume13.toString();
        double double17 = roundVolume13.getVolume();
        double double18 = roundVolume13.getLength();
        boolean boolean20 = roundVolume13.equals((java.lang.Object) 0.0f);
        double double21 = roundVolume13.getVolume();
        double double22 = roundVolume13.getVolume();
        logic.RoundVolume roundVolume26 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume26.setLength((double) (-1.0f));
        java.lang.String str29 = roundVolume26.toString();
        double double30 = roundVolume26.getVolume();
        double double31 = roundVolume26.getLength();
        int int32 = roundVolume26.getDiameter();
        java.lang.String str33 = roundVolume26.toString();
        logic.RoundVolume roundVolume37 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume37.setDiameter((int) (byte) 10);
        java.lang.Object obj40 = null;
        boolean boolean41 = roundVolume37.canEqual(obj40);
        boolean boolean43 = roundVolume37.canEqual((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass44 = roundVolume37.getClass();
        boolean boolean45 = roundVolume26.equals((java.lang.Object) wildcardClass44);
        int int46 = roundVolume26.getDiameter();
        boolean boolean47 = roundVolume13.equals((java.lang.Object) roundVolume26);
        boolean boolean48 = roundVolume3.equals((java.lang.Object) roundVolume13);
        java.lang.Class<?> wildcardClass49 = roundVolume3.getClass();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str16, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str29, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str33, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        boolean boolean10 = roundVolume3.canEqual((java.lang.Object) (byte) -1);
        roundVolume3.setDiameter(100);
        roundVolume3.setVolume((double) 10.0f);
        java.lang.Object obj15 = new java.lang.Object();
        boolean boolean16 = roundVolume3.equals(obj15);
        int int17 = roundVolume3.getDiameter();
        double double18 = roundVolume3.getLength();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 100 + "'", int17 == 100);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        roundVolume3.setDiameter((int) (byte) 100);
        roundVolume3.setDiameter((int) (short) 10);
        logic.RoundVolume roundVolume17 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume17.setLength((double) (-1.0f));
        java.lang.String str20 = roundVolume17.toString();
        roundVolume17.setLength(100.0d);
        roundVolume17.setVolume(0.0d);
        logic.RoundVolume roundVolume28 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume28.setLength((double) 1L);
        boolean boolean31 = roundVolume17.canEqual((java.lang.Object) roundVolume28);
        boolean boolean32 = roundVolume3.canEqual((java.lang.Object) roundVolume17);
        double double33 = roundVolume17.getLength();
        roundVolume17.setVolume((double) 100L);
        double double36 = roundVolume17.getLength();
        roundVolume17.setDiameter((int) '#');
        logic.RoundVolume roundVolume42 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume42.setDiameter((int) (byte) 10);
        roundVolume42.setDiameter((int) (byte) -1);
        java.lang.String str47 = roundVolume42.toString();
        double double48 = roundVolume42.getVolume();
        roundVolume42.setDiameter((int) (byte) 1);
        boolean boolean51 = roundVolume17.equals((java.lang.Object) roundVolume42);
        roundVolume42.setDiameter(97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str20, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 100.0d + "'", double33 == 100.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 100.0d + "'", double36 == 100.0d);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "RoundVolume(length=100.0, diameter=-1, volume=10.0)" + "'", str47, "RoundVolume(length=100.0, diameter=-1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 10.0d + "'", double48 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
        yourWood0.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList3 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList5 = yourWood0.getWood();
        org.junit.Assert.assertNotNull(roundVolumeList1);
        org.junit.Assert.assertNotNull(roundVolumeList3);
        org.junit.Assert.assertNotNull(roundVolumeList5);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 1, 52, (double) (-1.0f));
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setLength((double) 100L);
        logic.YourWood yourWood11 = new logic.YourWood();
        yourWood11.lengthFirstSortWood();
        yourWood11.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList14 = yourWood11.getWood();
        boolean boolean15 = roundVolume3.canEqual((java.lang.Object) yourWood11);
        yourWood11.lengthFirstSortWood();
        yourWood11.lengthFirstSortWood();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertNotNull(roundVolumeList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setVolume(0.0d);
        roundVolume3.setDiameter((int) (short) 0);
        java.lang.String str13 = roundVolume3.toString();
        int int14 = roundVolume3.getDiameter();
        boolean boolean16 = roundVolume3.equals((java.lang.Object) "RoundVolume(length=100.0, diameter=-1, volume=10.0)");
        double double17 = roundVolume3.getLength();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str13, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        int int9 = roundVolume3.getDiameter();
        roundVolume3.setLength((double) (-1));
        roundVolume3.setVolume((double) 10.0f);
        logic.RoundVolume roundVolume17 = new logic.RoundVolume((double) 1, (int) 'a', (double) (byte) -1);
        logic.YourWood yourWood18 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList19 = yourWood18.getWood();
        yourWood18.lengthFirstSortWood();
        boolean boolean21 = roundVolume17.equals((java.lang.Object) yourWood18);
        boolean boolean22 = roundVolume3.canEqual((java.lang.Object) roundVolume17);
        double double23 = roundVolume3.getVolume();
        roundVolume3.setVolume((double) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(roundVolumeList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (byte) 100, 0, (double) 0.0f);
        roundVolume3.setLength((double) (byte) 0);
        double double6 = roundVolume3.getLength();
        java.lang.String str7 = roundVolume3.toString();
        logic.RoundVolume roundVolume11 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume11.setLength((double) (-1.0f));
        java.lang.String str14 = roundVolume11.toString();
        double double15 = roundVolume11.getVolume();
        double double16 = roundVolume11.getLength();
        roundVolume11.setVolume((double) 10.0f);
        double double19 = roundVolume11.getVolume();
        roundVolume11.setLength((double) (short) 0);
        double double22 = roundVolume11.getLength();
        boolean boolean23 = roundVolume3.equals((java.lang.Object) roundVolume11);
        int int24 = roundVolume11.getDiameter();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "RoundVolume(length=0.0, diameter=0, volume=0.0)" + "'", str7, "RoundVolume(length=0.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str14, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        logic.RoundVolume roundVolume0 = new logic.RoundVolume();
        double double1 = roundVolume0.getVolume();
        logic.YourWood yourWood2 = new logic.YourWood();
        yourWood2.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList4 = yourWood2.getWood();
        boolean boolean5 = roundVolume0.canEqual((java.lang.Object) yourWood2);
        double double6 = roundVolume0.getLength();
        double double7 = roundVolume0.getLength();
        logic.RoundVolume roundVolume8 = new logic.RoundVolume();
        double double9 = roundVolume8.getVolume();
        logic.YourWood yourWood10 = new logic.YourWood();
        yourWood10.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList12 = yourWood10.getWood();
        boolean boolean13 = roundVolume8.canEqual((java.lang.Object) yourWood10);
        yourWood10.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList15 = yourWood10.getWood();
        yourWood10.lengthFirstSortWood();
        yourWood10.diameterFirstSortWood();
        yourWood10.diameterFirstSortWood();
        boolean boolean19 = roundVolume0.equals((java.lang.Object) yourWood10);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roundVolumeList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(roundVolumeList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(roundVolumeList15);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setLength((double) 100L);
        logic.YourWood yourWood11 = new logic.YourWood();
        yourWood11.lengthFirstSortWood();
        yourWood11.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList14 = yourWood11.getWood();
        boolean boolean15 = roundVolume3.canEqual((java.lang.Object) yourWood11);
        yourWood11.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList17 = yourWood11.getWood();
// flaky:         yourWood11.addWood((double) 1, (int) (short) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertNotNull(roundVolumeList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(roundVolumeList17);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setLength((double) 100L);
        double double11 = roundVolume3.getVolume();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        roundVolume3.setVolume((double) (-1));
        roundVolume3.setDiameter((int) (byte) -1);
        roundVolume3.setVolume((double) (byte) -1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
// flaky:         yourWood0.addWood((double) 10, 10);
// flaky:         yourWood0.addWood((double) 10, (int) (byte) 10);
        java.util.ArrayList<logic.RoundVolume> roundVolumeList8 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.lengthFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList1);
        org.junit.Assert.assertNotNull(roundVolumeList8);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setVolume((double) (short) 1);
        logic.RoundVolume roundVolume9 = new logic.RoundVolume((double) 1, (int) 'a', (double) (byte) -1);
        logic.YourWood yourWood10 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList11 = yourWood10.getWood();
        yourWood10.lengthFirstSortWood();
        boolean boolean13 = roundVolume9.equals((java.lang.Object) yourWood10);
        yourWood10.lengthFirstSortWood();
        boolean boolean15 = roundVolume3.canEqual((java.lang.Object) yourWood10);
        java.lang.String str16 = roundVolume3.toString();
        org.junit.Assert.assertNotNull(roundVolumeList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "RoundVolume(length=0.0, diameter=1, volume=1.0)" + "'", str16, "RoundVolume(length=0.0, diameter=1, volume=1.0)");
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        roundVolume3.setVolume((double) 10.0f);
        roundVolume3.setLength((double) (short) 1);
        roundVolume3.setVolume((double) 10);
        double double15 = roundVolume3.getVolume();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        logic.RoundVolume roundVolume0 = new logic.RoundVolume();
        roundVolume0.setVolume((double) (-1.0f));
        roundVolume0.setVolume((double) 'a');
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        int int9 = roundVolume3.getDiameter();
        roundVolume3.setVolume((double) 0L);
        logic.RoundVolume roundVolume15 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume15.setLength((double) (-1.0f));
        java.lang.String str18 = roundVolume15.toString();
        double double19 = roundVolume15.getVolume();
        java.lang.String str20 = roundVolume15.toString();
        logic.RoundVolume roundVolume24 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume24.setDiameter((int) (byte) 10);
        java.lang.Object obj27 = null;
        boolean boolean28 = roundVolume24.canEqual(obj27);
        boolean boolean29 = roundVolume15.canEqual((java.lang.Object) boolean28);
        roundVolume15.setLength((double) 1.0f);
        boolean boolean32 = roundVolume3.canEqual((java.lang.Object) roundVolume15);
        java.lang.String str33 = roundVolume15.toString();
        roundVolume15.setVolume((double) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str18, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str20, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "RoundVolume(length=1.0, diameter=1, volume=10.0)" + "'", str33, "RoundVolume(length=1.0, diameter=1, volume=10.0)");
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        boolean boolean10 = roundVolume3.equals((java.lang.Object) 10L);
        double double11 = roundVolume3.getVolume();
        roundVolume3.setDiameter(0);
        roundVolume3.setDiameter(0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (byte) 100, 0, (double) 0.0f);
        double double4 = roundVolume3.getVolume();
        logic.RoundVolume roundVolume8 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume8.setLength((double) (-1.0f));
        java.lang.String str11 = roundVolume8.toString();
        double double12 = roundVolume8.getVolume();
        double double13 = roundVolume8.getVolume();
        boolean boolean15 = roundVolume8.equals((java.lang.Object) "");
        boolean boolean16 = roundVolume3.canEqual((java.lang.Object) roundVolume8);
        roundVolume3.setLength((double) (byte) 10);
        roundVolume3.setDiameter((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str11, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume3.setDiameter((int) (byte) 10);
        roundVolume3.setDiameter((int) (byte) -1);
        roundVolume3.setVolume((double) 10);
        double double10 = roundVolume3.getLength();
        boolean boolean12 = roundVolume3.equals((java.lang.Object) (byte) 1);
        com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = logic.VolumeDB.mapper;
        logic.VolumeDB.mapper = objectMapper13;
        logic.VolumeDB.mapper = objectMapper13;
        logic.VolumeDB.mapper = objectMapper13;
        logic.VolumeDB.mapper = objectMapper13;
        boolean boolean18 = roundVolume3.equals((java.lang.Object) objectMapper13);
        logic.RoundVolume roundVolume19 = new logic.RoundVolume();
        double double20 = roundVolume19.getVolume();
        logic.YourWood yourWood21 = new logic.YourWood();
        yourWood21.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList23 = yourWood21.getWood();
        boolean boolean24 = roundVolume19.canEqual((java.lang.Object) yourWood21);
        boolean boolean25 = roundVolume3.canEqual((java.lang.Object) roundVolume19);
        java.lang.String str26 = roundVolume3.toString();
        logic.RoundVolume roundVolume30 = new logic.RoundVolume((double) (-1), (int) (short) 100, (double) 1);
        java.lang.String str31 = roundVolume30.toString();
        boolean boolean32 = roundVolume3.equals((java.lang.Object) roundVolume30);
        java.lang.Class<?> wildcardClass33 = roundVolume30.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(roundVolumeList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "RoundVolume(length=100.0, diameter=-1, volume=10.0)" + "'", str26, "RoundVolume(length=100.0, diameter=-1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "RoundVolume(length=-1.0, diameter=100, volume=1.0)" + "'", str31, "RoundVolume(length=-1.0, diameter=100, volume=1.0)");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 1.0f, (int) 'a', (double) 'a');
        double double4 = roundVolume3.getLength();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        int int9 = roundVolume3.getDiameter();
        roundVolume3.setLength((double) (-1));
        roundVolume3.setDiameter((int) '4');
        int int14 = roundVolume3.getDiameter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 1, (int) 'a', (double) (byte) -1);
        logic.RoundVolume roundVolume7 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume7.setLength((double) (-1.0f));
        java.lang.String str10 = roundVolume7.toString();
        double double11 = roundVolume7.getVolume();
        double double12 = roundVolume7.getVolume();
        java.lang.Class<?> wildcardClass13 = roundVolume7.getClass();
        boolean boolean14 = roundVolume3.canEqual((java.lang.Object) roundVolume7);
        double double15 = roundVolume3.getLength();
        roundVolume3.setLength((double) 1.0f);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str10, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setDiameter((int) (byte) 0);
        roundVolume3.setDiameter((int) (byte) 10);
        double double13 = roundVolume3.getVolume();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (byte) -1, 0, (double) 52);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        logic.RoundVolume roundVolume7 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        boolean boolean8 = roundVolume3.equals((java.lang.Object) (short) 1);
        double double9 = roundVolume3.getVolume();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume3.setDiameter((int) (byte) 10);
        roundVolume3.setDiameter((int) (byte) -1);
        boolean boolean9 = roundVolume3.canEqual((java.lang.Object) 1);
        java.lang.Class<?> wildcardClass10 = roundVolume3.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 1, (int) 'a', (double) (byte) -1);
        logic.YourWood yourWood4 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList5 = yourWood4.getWood();
        yourWood4.lengthFirstSortWood();
        boolean boolean7 = roundVolume3.equals((java.lang.Object) yourWood4);
        java.util.ArrayList<logic.RoundVolume> roundVolumeList8 = yourWood4.getWood();
        org.junit.Assert.assertNotNull(roundVolumeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(roundVolumeList8);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        logic.RoundVolume roundVolume0 = new logic.RoundVolume();
        double double1 = roundVolume0.getVolume();
        logic.YourWood yourWood2 = new logic.YourWood();
        yourWood2.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList4 = yourWood2.getWood();
        boolean boolean5 = roundVolume0.canEqual((java.lang.Object) yourWood2);
        double double6 = roundVolume0.getLength();
        logic.RoundVolume roundVolume10 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume10.setLength((double) (-1.0f));
        java.lang.String str13 = roundVolume10.toString();
        double double14 = roundVolume10.getVolume();
        java.lang.String str15 = roundVolume10.toString();
        logic.RoundVolume roundVolume19 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume19.setDiameter((int) (byte) 10);
        java.lang.Object obj22 = null;
        boolean boolean23 = roundVolume19.canEqual(obj22);
        boolean boolean24 = roundVolume10.canEqual((java.lang.Object) boolean23);
        roundVolume10.setDiameter((int) (short) -1);
        roundVolume10.setVolume((double) 100);
        boolean boolean29 = roundVolume0.canEqual((java.lang.Object) 100);
        int int30 = roundVolume0.getDiameter();
        double double31 = roundVolume0.getLength();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roundVolumeList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str13, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str15, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        boolean boolean10 = roundVolume3.canEqual((java.lang.Object) (byte) -1);
        roundVolume3.setDiameter(100);
        roundVolume3.setDiameter((int) '4');
        roundVolume3.setVolume((double) 10.0f);
        double double17 = roundVolume3.getVolume();
        java.lang.Object obj18 = null;
        boolean boolean19 = roundVolume3.equals(obj18);
        logic.YourWood yourWood20 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList21 = yourWood20.getWood();
        yourWood20.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList23 = yourWood20.getWood();
        yourWood20.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList25 = yourWood20.getWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList26 = yourWood20.getWood();
        yourWood20.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList28 = yourWood20.getWood();
        boolean boolean29 = roundVolume3.equals((java.lang.Object) roundVolumeList28);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(roundVolumeList21);
        org.junit.Assert.assertNotNull(roundVolumeList23);
        org.junit.Assert.assertNotNull(roundVolumeList25);
        org.junit.Assert.assertNotNull(roundVolumeList26);
        org.junit.Assert.assertNotNull(roundVolumeList28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        com.fasterxml.jackson.databind.ObjectMapper objectMapper6 = logic.VolumeDB.mapper;
        logic.VolumeDB.mapper = objectMapper6;
        logic.VolumeDB.mapper = objectMapper6;
        logic.VolumeDB.mapper = objectMapper6;
        logic.VolumeDB.mapper = objectMapper6;
        boolean boolean11 = roundVolume3.canEqual((java.lang.Object) objectMapper6);
        logic.RoundVolume roundVolume15 = new logic.RoundVolume((double) 1.0f, (int) 'a', (double) 'a');
        roundVolume15.setLength((double) 1.0f);
        boolean boolean18 = roundVolume3.equals((java.lang.Object) roundVolume15);
        java.lang.String str19 = roundVolume3.toString();
        org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str19, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (short) 1, (int) (short) 100, (double) 0L);
        logic.RoundVolume roundVolume7 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume7.setDiameter((int) (byte) 10);
        java.lang.Object obj10 = null;
        boolean boolean11 = roundVolume7.canEqual(obj10);
        int int12 = roundVolume7.getDiameter();
        boolean boolean13 = roundVolume3.equals((java.lang.Object) roundVolume7);
        roundVolume3.setVolume((-1.0d));
        roundVolume3.setVolume((double) (byte) 1);
        roundVolume3.setLength((double) 1.0f);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        roundVolume3.setVolume((double) (-1));
        roundVolume3.setVolume((double) 10.0f);
        roundVolume3.setVolume((double) 0);
        int int16 = roundVolume3.getDiameter();
        double double17 = roundVolume3.getVolume();
        java.lang.String str18 = roundVolume3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=0.0)" + "'", str18, "RoundVolume(length=-1.0, diameter=1, volume=0.0)");
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setVolume(0.0d);
        roundVolume3.setDiameter((int) (short) 0);
        java.lang.String str13 = roundVolume3.toString();
        double double14 = roundVolume3.getVolume();
        logic.RoundVolume roundVolume18 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume18.setLength((double) (-1.0f));
        java.lang.String str21 = roundVolume18.toString();
        double double22 = roundVolume18.getVolume();
        double double23 = roundVolume18.getLength();
        int int24 = roundVolume18.getDiameter();
        java.lang.String str25 = roundVolume18.toString();
        logic.RoundVolume roundVolume29 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume29.setDiameter((int) (byte) 10);
        java.lang.Object obj32 = null;
        boolean boolean33 = roundVolume29.canEqual(obj32);
        boolean boolean35 = roundVolume29.canEqual((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass36 = roundVolume29.getClass();
        boolean boolean37 = roundVolume18.equals((java.lang.Object) wildcardClass36);
        logic.RoundVolume roundVolume41 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume41.setLength((double) (-1.0f));
        java.lang.String str44 = roundVolume41.toString();
        double double45 = roundVolume41.getVolume();
        double double46 = roundVolume41.getLength();
        int int47 = roundVolume41.getDiameter();
        roundVolume41.setVolume((double) (-1));
        roundVolume41.setVolume((double) 10.0f);
        boolean boolean52 = roundVolume18.equals((java.lang.Object) 10.0f);
        boolean boolean53 = roundVolume3.canEqual((java.lang.Object) roundVolume18);
        int int54 = roundVolume18.getDiameter();
        roundVolume18.setDiameter((-1));
        java.lang.Class<?> wildcardClass57 = roundVolume18.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str13, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str21, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str25, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str44, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1.0d) + "'", double46 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList3 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
// flaky:         yourWood0.addWood((double) 1L, (int) (byte) 100);
        java.util.ArrayList<logic.RoundVolume> roundVolumeList8 = yourWood0.getWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList9 = yourWood0.getWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList10 = yourWood0.getWood();
        org.junit.Assert.assertNotNull(roundVolumeList1);
        org.junit.Assert.assertNotNull(roundVolumeList3);
        org.junit.Assert.assertNotNull(roundVolumeList8);
        org.junit.Assert.assertNotNull(roundVolumeList9);
        org.junit.Assert.assertNotNull(roundVolumeList10);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
// flaky:         yourWood0.addWood((double) 10, 10);
        yourWood0.diameterFirstSortWood();
        yourWood0.diameterFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList1);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        roundVolume3.setVolume((double) 10.0f);
        double double11 = roundVolume3.getLength();
        double double12 = roundVolume3.getLength();
        java.lang.String str13 = roundVolume3.toString();
        int int14 = roundVolume3.getDiameter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str13, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setVolume(0.0d);
        roundVolume3.setDiameter((int) (short) 0);
        java.lang.String str13 = roundVolume3.toString();
        double double14 = roundVolume3.getVolume();
        logic.RoundVolume roundVolume18 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume18.setLength((double) (-1.0f));
        java.lang.String str21 = roundVolume18.toString();
        double double22 = roundVolume18.getVolume();
        double double23 = roundVolume18.getLength();
        int int24 = roundVolume18.getDiameter();
        java.lang.String str25 = roundVolume18.toString();
        logic.RoundVolume roundVolume29 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume29.setDiameter((int) (byte) 10);
        java.lang.Object obj32 = null;
        boolean boolean33 = roundVolume29.canEqual(obj32);
        boolean boolean35 = roundVolume29.canEqual((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass36 = roundVolume29.getClass();
        boolean boolean37 = roundVolume18.equals((java.lang.Object) wildcardClass36);
        logic.RoundVolume roundVolume41 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume41.setLength((double) (-1.0f));
        java.lang.String str44 = roundVolume41.toString();
        double double45 = roundVolume41.getVolume();
        double double46 = roundVolume41.getLength();
        int int47 = roundVolume41.getDiameter();
        roundVolume41.setVolume((double) (-1));
        roundVolume41.setVolume((double) 10.0f);
        boolean boolean52 = roundVolume18.equals((java.lang.Object) 10.0f);
        boolean boolean53 = roundVolume3.canEqual((java.lang.Object) roundVolume18);
        double double54 = roundVolume18.getLength();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str13, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str21, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str25, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str44, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1.0d) + "'", double46 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + (-1.0d) + "'", double54 == (-1.0d));
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        java.lang.String str10 = roundVolume3.toString();
        logic.RoundVolume roundVolume14 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume14.setDiameter((int) (byte) 10);
        java.lang.Object obj17 = null;
        boolean boolean18 = roundVolume14.canEqual(obj17);
        boolean boolean20 = roundVolume14.canEqual((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass21 = roundVolume14.getClass();
        boolean boolean22 = roundVolume3.equals((java.lang.Object) wildcardClass21);
        logic.RoundVolume roundVolume26 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume26.setLength((double) (-1.0f));
        java.lang.String str29 = roundVolume26.toString();
        double double30 = roundVolume26.getVolume();
        double double31 = roundVolume26.getLength();
        int int32 = roundVolume26.getDiameter();
        roundVolume26.setVolume((double) (-1));
        roundVolume26.setVolume((double) 10.0f);
        boolean boolean37 = roundVolume3.equals((java.lang.Object) 10.0f);
        double double38 = roundVolume3.getLength();
        logic.RoundVolume roundVolume42 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume42.setLength((double) (-1.0f));
        java.lang.String str45 = roundVolume42.toString();
        double double46 = roundVolume42.getVolume();
        double double47 = roundVolume42.getLength();
        boolean boolean48 = roundVolume3.equals((java.lang.Object) roundVolume42);
        double double49 = roundVolume3.getVolume();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str10, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str29, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-1.0d) + "'", double38 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str45, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-1.0d) + "'", double47 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (short) 100, 10, (double) (byte) 100);
        roundVolume3.setDiameter((int) (byte) 1);
        roundVolume3.setVolume((double) 100.0f);
        logic.RoundVolume roundVolume11 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume11.setLength((double) (-1.0f));
        java.lang.String str14 = roundVolume11.toString();
        double double15 = roundVolume11.getVolume();
        double double16 = roundVolume11.getLength();
        int int17 = roundVolume11.getDiameter();
        roundVolume11.setDiameter((int) (byte) 100);
        roundVolume11.setDiameter((int) (short) 10);
        roundVolume11.setDiameter((int) (short) 1);
        double double24 = roundVolume11.getLength();
        boolean boolean25 = roundVolume3.canEqual((java.lang.Object) roundVolume11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str14, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume(10.0d, (-1), (double) 97);
        logic.RoundVolume roundVolume7 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume7.setLength((double) (-1.0f));
        java.lang.String str10 = roundVolume7.toString();
        roundVolume7.setLength(100.0d);
        roundVolume7.setVolume(0.0d);
        roundVolume7.setDiameter((int) (short) 0);
        int int17 = roundVolume7.getDiameter();
        logic.YourWood yourWood18 = new logic.YourWood();
        yourWood18.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList20 = yourWood18.getWood();
        yourWood18.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList22 = yourWood18.getWood();
// flaky:         yourWood18.addWood((double) 1L, (int) (short) 100);
        boolean boolean26 = roundVolume7.equals((java.lang.Object) (short) 100);
        double double27 = roundVolume7.getLength();
        boolean boolean28 = roundVolume3.canEqual((java.lang.Object) double27);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str10, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(roundVolumeList20);
        org.junit.Assert.assertNotNull(roundVolumeList22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 100.0d + "'", double27 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (short) 1, (int) (short) 100, (double) 0L);
        logic.RoundVolume roundVolume7 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume7.setDiameter((int) (byte) 10);
        java.lang.Object obj10 = null;
        boolean boolean11 = roundVolume7.canEqual(obj10);
        int int12 = roundVolume7.getDiameter();
        boolean boolean13 = roundVolume3.equals((java.lang.Object) roundVolume7);
        double double14 = roundVolume7.getVolume();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        boolean boolean10 = roundVolume3.equals((java.lang.Object) "");
        roundVolume3.setLength(0.0d);
        roundVolume3.setDiameter((int) '4');
        logic.RoundVolume roundVolume18 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume18.setLength((double) (-1.0f));
        java.lang.String str21 = roundVolume18.toString();
        double double22 = roundVolume18.getVolume();
        double double23 = roundVolume18.getLength();
        int int24 = roundVolume18.getDiameter();
        java.lang.String str25 = roundVolume18.toString();
        logic.RoundVolume roundVolume29 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume29.setDiameter((int) (byte) 10);
        java.lang.Object obj32 = null;
        boolean boolean33 = roundVolume29.canEqual(obj32);
        boolean boolean35 = roundVolume29.canEqual((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass36 = roundVolume29.getClass();
        boolean boolean37 = roundVolume18.equals((java.lang.Object) wildcardClass36);
        logic.RoundVolume roundVolume41 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume41.setLength((double) (-1.0f));
        java.lang.String str44 = roundVolume41.toString();
        double double45 = roundVolume41.getVolume();
        double double46 = roundVolume41.getLength();
        int int47 = roundVolume41.getDiameter();
        roundVolume41.setVolume((double) (-1));
        roundVolume41.setVolume((double) 10.0f);
        boolean boolean52 = roundVolume18.equals((java.lang.Object) 10.0f);
        double double53 = roundVolume18.getLength();
        logic.RoundVolume roundVolume57 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume57.setLength((double) (-1.0f));
        java.lang.String str60 = roundVolume57.toString();
        double double61 = roundVolume57.getVolume();
        double double62 = roundVolume57.getLength();
        boolean boolean63 = roundVolume18.equals((java.lang.Object) roundVolume57);
        int int64 = roundVolume57.getDiameter();
        boolean boolean65 = roundVolume3.canEqual((java.lang.Object) roundVolume57);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str21, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str25, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str44, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1.0d) + "'", double46 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + (-1.0d) + "'", double53 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str60, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 10.0d + "'", double61 == 10.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + (-1.0d) + "'", double62 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList3 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList6 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.lengthFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList1);
        org.junit.Assert.assertNotNull(roundVolumeList3);
        org.junit.Assert.assertNotNull(roundVolumeList6);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        java.lang.String str10 = roundVolume3.toString();
        logic.RoundVolume roundVolume14 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume14.setDiameter((int) (byte) 10);
        java.lang.Object obj17 = null;
        boolean boolean18 = roundVolume14.canEqual(obj17);
        boolean boolean20 = roundVolume14.canEqual((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass21 = roundVolume14.getClass();
        boolean boolean22 = roundVolume3.equals((java.lang.Object) wildcardClass21);
        double double23 = roundVolume3.getVolume();
        logic.YourWood yourWood24 = new logic.YourWood();
        yourWood24.diameterFirstSortWood();
        yourWood24.diameterFirstSortWood();
        boolean boolean27 = roundVolume3.equals((java.lang.Object) yourWood24);
        // The following exception was thrown during execution in test generation
        try {
            yourWood24.addWood((double) 52, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str10, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (-1), 97, (double) 0L);
        double double4 = roundVolume3.getLength();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (short) 10, 97, (double) (short) -1);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume3.setDiameter((int) (byte) 10);
        roundVolume3.setDiameter((int) (byte) -1);
        java.lang.String str8 = roundVolume3.toString();
        double double9 = roundVolume3.getVolume();
        roundVolume3.setDiameter((int) (byte) 1);
        int int12 = roundVolume3.getDiameter();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "RoundVolume(length=100.0, diameter=-1, volume=10.0)" + "'", str8, "RoundVolume(length=100.0, diameter=-1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        logic.YourWood yourWood0 = new logic.YourWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList7 = yourWood0.getWood();
        org.junit.Assert.assertNotNull(roundVolumeList7);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setVolume(0.0d);
        int int11 = roundVolume3.getDiameter();
        roundVolume3.setLength((double) (short) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((-1.0d), 1, (double) (short) -1);
        double double4 = roundVolume3.getLength();
        roundVolume3.setLength((double) '4');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) 1L);
        logic.YourWood yourWood6 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList7 = yourWood6.getWood();
        yourWood6.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList9 = yourWood6.getWood();
        yourWood6.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList11 = yourWood6.getWood();
        boolean boolean12 = roundVolume3.canEqual((java.lang.Object) roundVolumeList11);
        roundVolume3.setLength((double) '#');
        roundVolume3.setDiameter(0);
        logic.RoundVolume roundVolume20 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume20.setLength((double) (-1.0f));
        java.lang.String str23 = roundVolume20.toString();
        roundVolume20.setLength(100.0d);
        roundVolume20.setLength((double) 100L);
        roundVolume20.setVolume((double) (short) -1);
        logic.RoundVolume roundVolume33 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume33.setLength((double) (-1.0f));
        java.lang.String str36 = roundVolume33.toString();
        double double37 = roundVolume33.getVolume();
        java.lang.String str38 = roundVolume33.toString();
        boolean boolean39 = roundVolume20.equals((java.lang.Object) roundVolume33);
        logic.YourWood yourWood40 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList41 = yourWood40.getWood();
// flaky:         yourWood40.addWood((double) 10, 10);
        java.util.ArrayList<logic.RoundVolume> roundVolumeList45 = yourWood40.getWood();
        boolean boolean46 = roundVolume33.equals((java.lang.Object) roundVolumeList45);
        int int47 = roundVolume33.getDiameter();
        boolean boolean48 = roundVolume3.equals((java.lang.Object) int47);
        org.junit.Assert.assertNotNull(roundVolumeList7);
        org.junit.Assert.assertNotNull(roundVolumeList9);
        org.junit.Assert.assertNotNull(roundVolumeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str23, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str36, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 10.0d + "'", double37 == 10.0d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str38, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(roundVolumeList41);
        org.junit.Assert.assertNotNull(roundVolumeList45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        java.lang.String str10 = roundVolume3.toString();
        logic.RoundVolume roundVolume14 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume14.setDiameter((int) (byte) 10);
        java.lang.Object obj17 = null;
        boolean boolean18 = roundVolume14.canEqual(obj17);
        boolean boolean20 = roundVolume14.canEqual((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass21 = roundVolume14.getClass();
        boolean boolean22 = roundVolume3.equals((java.lang.Object) wildcardClass21);
        logic.RoundVolume roundVolume26 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume26.setLength((double) (-1.0f));
        java.lang.String str29 = roundVolume26.toString();
        double double30 = roundVolume26.getVolume();
        double double31 = roundVolume26.getLength();
        int int32 = roundVolume26.getDiameter();
        roundVolume26.setVolume((double) (-1));
        roundVolume26.setVolume((double) 10.0f);
        boolean boolean37 = roundVolume3.equals((java.lang.Object) 10.0f);
        double double38 = roundVolume3.getVolume();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str10, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str29, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 10.0d + "'", double38 == 10.0d);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        int int9 = roundVolume3.getDiameter();
        roundVolume3.setLength((double) (-1));
        roundVolume3.setVolume((double) (short) 0);
        java.lang.Class<?> wildcardClass14 = roundVolume3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 32, 32, (double) 0.0f);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        java.lang.String str7 = roundVolume3.toString();
        double double8 = roundVolume3.getLength();
        java.lang.Object obj9 = null;
        boolean boolean10 = roundVolume3.equals(obj9);
        java.lang.String str11 = roundVolume3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str7, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str11, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setVolume(0.0d);
        roundVolume3.setDiameter((int) (short) 0);
        java.lang.String str13 = roundVolume3.toString();
        double double14 = roundVolume3.getVolume();
        logic.RoundVolume roundVolume18 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume18.setLength((double) (-1.0f));
        java.lang.String str21 = roundVolume18.toString();
        double double22 = roundVolume18.getVolume();
        double double23 = roundVolume18.getLength();
        int int24 = roundVolume18.getDiameter();
        java.lang.String str25 = roundVolume18.toString();
        logic.RoundVolume roundVolume29 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume29.setDiameter((int) (byte) 10);
        java.lang.Object obj32 = null;
        boolean boolean33 = roundVolume29.canEqual(obj32);
        boolean boolean35 = roundVolume29.canEqual((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass36 = roundVolume29.getClass();
        boolean boolean37 = roundVolume18.equals((java.lang.Object) wildcardClass36);
        logic.RoundVolume roundVolume41 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume41.setLength((double) (-1.0f));
        java.lang.String str44 = roundVolume41.toString();
        double double45 = roundVolume41.getVolume();
        double double46 = roundVolume41.getLength();
        int int47 = roundVolume41.getDiameter();
        roundVolume41.setVolume((double) (-1));
        roundVolume41.setVolume((double) 10.0f);
        boolean boolean52 = roundVolume18.equals((java.lang.Object) 10.0f);
        boolean boolean53 = roundVolume3.canEqual((java.lang.Object) roundVolume18);
        double double54 = roundVolume18.getVolume();
        roundVolume18.setLength((double) (short) 100);
        java.lang.String str57 = roundVolume18.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str13, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str21, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str25, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str44, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1.0d) + "'", double46 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "RoundVolume(length=100.0, diameter=1, volume=10.0)" + "'", str57, "RoundVolume(length=100.0, diameter=1, volume=10.0)");
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume3.setDiameter((int) (byte) 10);
        roundVolume3.setDiameter((int) (byte) -1);
        roundVolume3.setVolume((double) 10);
        double double10 = roundVolume3.getLength();
        boolean boolean12 = roundVolume3.equals((java.lang.Object) (byte) 1);
        double double13 = roundVolume3.getLength();
        logic.RoundVolume roundVolume17 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume17.setLength((double) (-1.0f));
        java.lang.String str20 = roundVolume17.toString();
        roundVolume17.setLength(100.0d);
        roundVolume17.setVolume(0.0d);
        roundVolume17.setDiameter((int) (short) 0);
        java.lang.String str27 = roundVolume17.toString();
        double double28 = roundVolume17.getVolume();
        logic.RoundVolume roundVolume32 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume32.setLength((double) (-1.0f));
        java.lang.String str35 = roundVolume32.toString();
        double double36 = roundVolume32.getVolume();
        double double37 = roundVolume32.getLength();
        int int38 = roundVolume32.getDiameter();
        java.lang.String str39 = roundVolume32.toString();
        logic.RoundVolume roundVolume43 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume43.setDiameter((int) (byte) 10);
        java.lang.Object obj46 = null;
        boolean boolean47 = roundVolume43.canEqual(obj46);
        boolean boolean49 = roundVolume43.canEqual((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass50 = roundVolume43.getClass();
        boolean boolean51 = roundVolume32.equals((java.lang.Object) wildcardClass50);
        logic.RoundVolume roundVolume55 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume55.setLength((double) (-1.0f));
        java.lang.String str58 = roundVolume55.toString();
        double double59 = roundVolume55.getVolume();
        double double60 = roundVolume55.getLength();
        int int61 = roundVolume55.getDiameter();
        roundVolume55.setVolume((double) (-1));
        roundVolume55.setVolume((double) 10.0f);
        boolean boolean66 = roundVolume32.equals((java.lang.Object) 10.0f);
        boolean boolean67 = roundVolume17.canEqual((java.lang.Object) roundVolume32);
        double double68 = roundVolume17.getVolume();
        logic.RoundVolume roundVolume72 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        double double73 = roundVolume72.getLength();
        boolean boolean74 = roundVolume17.canEqual((java.lang.Object) roundVolume72);
        logic.RoundVolume roundVolume78 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume78.setLength((double) (-1.0f));
        java.lang.String str81 = roundVolume78.toString();
        double double82 = roundVolume78.getVolume();
        double double83 = roundVolume78.getLength();
        roundVolume78.setVolume((double) 10.0f);
        double double86 = roundVolume78.getVolume();
        double double87 = roundVolume78.getVolume();
        roundVolume78.setDiameter(1);
        double double90 = roundVolume78.getVolume();
        boolean boolean91 = roundVolume17.equals((java.lang.Object) roundVolume78);
        boolean boolean92 = roundVolume3.equals((java.lang.Object) roundVolume78);
        java.lang.Class<?> wildcardClass93 = roundVolume78.getClass();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str20, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str27, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str35, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + (-1.0d) + "'", double37 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str39, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str58, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 10.0d + "'", double59 == 10.0d);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + (-1.0d) + "'", double60 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 0.0d + "'", double68 == 0.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 100.0d + "'", double73 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str81, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 10.0d + "'", double82 == 10.0d);
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + (-1.0d) + "'", double83 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 10.0d + "'", double86 == 10.0d);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 10.0d + "'", double87 == 10.0d);
        org.junit.Assert.assertTrue("'" + double90 + "' != '" + 10.0d + "'", double90 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + false + "'", boolean91 == false);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertNotNull(wildcardClass93);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        logic.RoundVolume roundVolume0 = new logic.RoundVolume();
        double double1 = roundVolume0.getVolume();
        logic.YourWood yourWood2 = new logic.YourWood();
        yourWood2.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList4 = yourWood2.getWood();
        boolean boolean5 = roundVolume0.canEqual((java.lang.Object) yourWood2);
        roundVolume0.setVolume((double) 100.0f);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roundVolumeList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume3.setDiameter((int) (byte) 10);
        roundVolume3.setDiameter((int) (byte) -1);
        int int8 = roundVolume3.getDiameter();
        double double9 = roundVolume3.getLength();
        int int10 = roundVolume3.getDiameter();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 10L, 100, (double) (byte) -1);
        java.lang.String str4 = roundVolume3.toString();
        logic.RoundVolume roundVolume8 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume8.setLength((double) (-1.0f));
        java.lang.String str11 = roundVolume8.toString();
        roundVolume8.setLength(100.0d);
        roundVolume8.setLength((double) 100L);
        logic.YourWood yourWood16 = new logic.YourWood();
        yourWood16.lengthFirstSortWood();
        yourWood16.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList19 = yourWood16.getWood();
        boolean boolean20 = roundVolume8.canEqual((java.lang.Object) yourWood16);
        boolean boolean21 = roundVolume3.equals((java.lang.Object) yourWood16);
        double double22 = roundVolume3.getVolume();
        logic.RoundVolume roundVolume26 = new logic.RoundVolume((double) '#', (-1), (double) 100L);
        logic.RoundVolume roundVolume30 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume30.setLength((double) (-1.0f));
        java.lang.String str33 = roundVolume30.toString();
        double double34 = roundVolume30.getVolume();
        double double35 = roundVolume30.getVolume();
        boolean boolean37 = roundVolume30.canEqual((java.lang.Object) (byte) -1);
        roundVolume30.setDiameter(100);
        roundVolume30.setDiameter(1);
        boolean boolean42 = roundVolume26.equals((java.lang.Object) 1);
        boolean boolean43 = roundVolume3.canEqual((java.lang.Object) roundVolume26);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RoundVolume(length=10.0, diameter=100, volume=-1.0)" + "'", str4, "RoundVolume(length=10.0, diameter=100, volume=-1.0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str11, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertNotNull(roundVolumeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str33, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 10.0d + "'", double35 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (short) 10, (int) '4', 0.0d);
        double double4 = roundVolume3.getLength();
        roundVolume3.setLength(1.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (byte) 0, (int) (byte) -1, (double) (byte) 0);
        java.lang.String str4 = roundVolume3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RoundVolume(length=0.0, diameter=-1, volume=0.0)" + "'", str4, "RoundVolume(length=0.0, diameter=-1, volume=0.0)");
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setVolume(0.0d);
        roundVolume3.setDiameter((int) (short) 0);
        java.lang.String str13 = roundVolume3.toString();
        double double14 = roundVolume3.getLength();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str13, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 100.0d + "'", double14 == 100.0d);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setVolume(0.0d);
        roundVolume3.setDiameter((int) (short) 0);
        java.lang.String str13 = roundVolume3.toString();
        int int14 = roundVolume3.getDiameter();
        boolean boolean16 = roundVolume3.equals((java.lang.Object) "RoundVolume(length=100.0, diameter=-1, volume=10.0)");
        logic.RoundVolume roundVolume20 = new logic.RoundVolume((double) (byte) 100, 0, (double) 0.0f);
        roundVolume20.setLength((double) (byte) 0);
        boolean boolean23 = roundVolume3.canEqual((java.lang.Object) (byte) 0);
        double double24 = roundVolume3.getVolume();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str13, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (byte) 1, (int) (short) 0, (double) 100.0f);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100L, (int) (short) 10, (double) 1.0f);
        int int4 = roundVolume3.getDiameter();
        roundVolume3.setLength((double) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 10 + "'", int4 == 10);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        int int9 = roundVolume3.getDiameter();
        java.lang.String str10 = roundVolume3.toString();
        double double11 = roundVolume3.getVolume();
        int int12 = roundVolume3.getDiameter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str10, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (byte) -1, (int) (byte) 0, (double) 1);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 10L, 100, (double) (byte) -1);
        java.lang.String str4 = roundVolume3.toString();
        logic.RoundVolume roundVolume8 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume8.setLength((double) (-1.0f));
        java.lang.String str11 = roundVolume8.toString();
        roundVolume8.setLength(100.0d);
        roundVolume8.setLength((double) 100L);
        logic.YourWood yourWood16 = new logic.YourWood();
        yourWood16.lengthFirstSortWood();
        yourWood16.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList19 = yourWood16.getWood();
        boolean boolean20 = roundVolume8.canEqual((java.lang.Object) yourWood16);
        boolean boolean21 = roundVolume3.equals((java.lang.Object) yourWood16);
        double double22 = roundVolume3.getVolume();
        roundVolume3.setDiameter((-1));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RoundVolume(length=10.0, diameter=100, volume=-1.0)" + "'", str4, "RoundVolume(length=10.0, diameter=100, volume=-1.0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str11, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertNotNull(roundVolumeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume(100.0d, (int) (byte) 1, (double) (-1.0f));
        java.lang.String str4 = roundVolume3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RoundVolume(length=100.0, diameter=1, volume=-1.0)" + "'", str4, "RoundVolume(length=100.0, diameter=1, volume=-1.0)");
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (short) 100, (int) (short) 0, (double) (byte) -1);
        java.lang.Class<?> wildcardClass4 = roundVolume3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        int int9 = roundVolume3.getDiameter();
        logic.RoundVolume roundVolume13 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume13.setLength((double) (-1.0f));
        java.lang.String str16 = roundVolume13.toString();
        roundVolume13.setLength(100.0d);
        roundVolume13.setVolume(0.0d);
        boolean boolean21 = roundVolume3.equals((java.lang.Object) 0.0d);
        int int22 = roundVolume3.getDiameter();
        logic.RoundVolume roundVolume26 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume26.setLength((double) (-1.0f));
        java.lang.String str29 = roundVolume26.toString();
        double double30 = roundVolume26.getVolume();
        java.lang.String str31 = roundVolume26.toString();
        logic.RoundVolume roundVolume35 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume35.setDiameter((int) (byte) 10);
        java.lang.Object obj38 = null;
        boolean boolean39 = roundVolume35.canEqual(obj38);
        boolean boolean40 = roundVolume26.canEqual((java.lang.Object) boolean39);
        int int41 = roundVolume26.getDiameter();
        boolean boolean42 = roundVolume3.canEqual((java.lang.Object) roundVolume26);
        double double43 = roundVolume3.getLength();
        double double44 = roundVolume3.getVolume();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str16, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str29, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str31, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1.0d) + "'", double43 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setLength((double) 100L);
        roundVolume3.setVolume((double) (short) -1);
        logic.RoundVolume roundVolume16 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume16.setLength((double) (-1.0f));
        java.lang.String str19 = roundVolume16.toString();
        double double20 = roundVolume16.getVolume();
        java.lang.String str21 = roundVolume16.toString();
        boolean boolean22 = roundVolume3.equals((java.lang.Object) roundVolume16);
        logic.YourWood yourWood23 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList24 = yourWood23.getWood();
// flaky:         yourWood23.addWood((double) 10, 10);
        java.util.ArrayList<logic.RoundVolume> roundVolumeList28 = yourWood23.getWood();
        boolean boolean29 = roundVolume16.equals((java.lang.Object) roundVolumeList28);
        int int30 = roundVolume16.getDiameter();
        roundVolume16.setLength((double) 97);
        roundVolume16.setVolume((double) 32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str19, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str21, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(roundVolumeList24);
        org.junit.Assert.assertNotNull(roundVolumeList28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) 1L);
        logic.YourWood yourWood6 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList7 = yourWood6.getWood();
        yourWood6.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList9 = yourWood6.getWood();
        yourWood6.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList11 = yourWood6.getWood();
        boolean boolean12 = roundVolume3.canEqual((java.lang.Object) roundVolumeList11);
        roundVolume3.setLength((double) '#');
        int int15 = roundVolume3.getDiameter();
        logic.RoundVolume roundVolume19 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume19.setLength((double) (-1.0f));
        java.lang.String str22 = roundVolume19.toString();
        double double23 = roundVolume19.getVolume();
        double double24 = roundVolume19.getLength();
        int int25 = roundVolume19.getDiameter();
        logic.YourWood yourWood26 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList27 = yourWood26.getWood();
        yourWood26.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList29 = yourWood26.getWood();
        yourWood26.lengthFirstSortWood();
        yourWood26.diameterFirstSortWood();
        boolean boolean32 = roundVolume19.equals((java.lang.Object) yourWood26);
        boolean boolean33 = roundVolume3.equals((java.lang.Object) roundVolume19);
        org.junit.Assert.assertNotNull(roundVolumeList7);
        org.junit.Assert.assertNotNull(roundVolumeList9);
        org.junit.Assert.assertNotNull(roundVolumeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str22, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(roundVolumeList27);
        org.junit.Assert.assertNotNull(roundVolumeList29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume3.setVolume(1.0d);
        java.lang.String str6 = roundVolume3.toString();
        logic.YourWood yourWood7 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList8 = yourWood7.getWood();
        boolean boolean9 = roundVolume3.canEqual((java.lang.Object) yourWood7);
        double double10 = roundVolume3.getVolume();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=100.0, diameter=97, volume=1.0)" + "'", str6, "RoundVolume(length=100.0, diameter=97, volume=1.0)");
        org.junit.Assert.assertNotNull(roundVolumeList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 1.0d + "'", double10 == 1.0d);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (byte) 100, 0, (double) 0.0f);
        double double4 = roundVolume3.getVolume();
        logic.RoundVolume roundVolume8 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume8.setLength((double) (-1.0f));
        java.lang.String str11 = roundVolume8.toString();
        double double12 = roundVolume8.getVolume();
        double double13 = roundVolume8.getVolume();
        boolean boolean15 = roundVolume8.equals((java.lang.Object) "");
        boolean boolean16 = roundVolume3.canEqual((java.lang.Object) roundVolume8);
        roundVolume3.setLength((double) (byte) 10);
        roundVolume3.setDiameter((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str11, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        logic.RoundVolume roundVolume0 = new logic.RoundVolume();
        double double1 = roundVolume0.getVolume();
        double double2 = roundVolume0.getVolume();
        roundVolume0.setLength((double) 1.0f);
        java.lang.Class<?> wildcardClass5 = roundVolume0.getClass();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList4 = yourWood0.getWood();
        org.junit.Assert.assertNotNull(roundVolumeList1);
        org.junit.Assert.assertNotNull(roundVolumeList4);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        boolean boolean10 = roundVolume3.equals((java.lang.Object) 10L);
        logic.RoundVolume roundVolume14 = new logic.RoundVolume((double) (short) 1, (int) (byte) 0, (double) (-1.0f));
        boolean boolean15 = roundVolume3.canEqual((java.lang.Object) (short) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        roundVolume3.setVolume((double) 10.0f);
        double double11 = roundVolume3.getVolume();
        roundVolume3.setLength((double) (short) 0);
        int int14 = roundVolume3.getDiameter();
        int int15 = roundVolume3.getDiameter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 'a', (int) (byte) 0, (double) (short) 10);
        logic.RoundVolume roundVolume4 = new logic.RoundVolume();
        double double5 = roundVolume4.getVolume();
        logic.YourWood yourWood6 = new logic.YourWood();
        yourWood6.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList8 = yourWood6.getWood();
        boolean boolean9 = roundVolume4.canEqual((java.lang.Object) yourWood6);
        java.lang.String str10 = roundVolume4.toString();
        double double11 = roundVolume4.getVolume();
        boolean boolean12 = roundVolume3.canEqual((java.lang.Object) double11);
        double double13 = roundVolume3.getLength();
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(roundVolumeList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RoundVolume(length=0.0, diameter=0, volume=0.0)" + "'", str10, "RoundVolume(length=0.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 97.0d + "'", double13 == 97.0d);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        int int9 = roundVolume3.getDiameter();
        roundVolume3.setLength((double) (-1));
        roundVolume3.setVolume((double) 10.0f);
        logic.RoundVolume roundVolume17 = new logic.RoundVolume((double) 1, (int) 'a', (double) (byte) -1);
        logic.YourWood yourWood18 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList19 = yourWood18.getWood();
        yourWood18.lengthFirstSortWood();
        boolean boolean21 = roundVolume17.equals((java.lang.Object) yourWood18);
        boolean boolean22 = roundVolume3.canEqual((java.lang.Object) roundVolume17);
        double double23 = roundVolume3.getVolume();
        int int24 = roundVolume3.getDiameter();
        roundVolume3.setVolume((double) 10L);
        double double27 = roundVolume3.getLength();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(roundVolumeList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        java.lang.String str10 = roundVolume3.toString();
        logic.RoundVolume roundVolume14 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume14.setDiameter((int) (byte) 10);
        java.lang.Object obj17 = null;
        boolean boolean18 = roundVolume14.canEqual(obj17);
        boolean boolean20 = roundVolume14.canEqual((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass21 = roundVolume14.getClass();
        boolean boolean22 = roundVolume3.equals((java.lang.Object) wildcardClass21);
        logic.RoundVolume roundVolume26 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume26.setLength((double) (-1.0f));
        java.lang.String str29 = roundVolume26.toString();
        double double30 = roundVolume26.getVolume();
        double double31 = roundVolume26.getLength();
        int int32 = roundVolume26.getDiameter();
        roundVolume26.setVolume((double) (-1));
        roundVolume26.setVolume((double) 10.0f);
        boolean boolean37 = roundVolume3.equals((java.lang.Object) 10.0f);
        double double38 = roundVolume3.getLength();
        logic.RoundVolume roundVolume42 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume42.setLength((double) (-1.0f));
        java.lang.String str45 = roundVolume42.toString();
        double double46 = roundVolume42.getVolume();
        double double47 = roundVolume42.getLength();
        boolean boolean48 = roundVolume3.equals((java.lang.Object) roundVolume42);
        int int49 = roundVolume42.getDiameter();
        double double50 = roundVolume42.getLength();
        double double51 = roundVolume42.getLength();
        double double52 = roundVolume42.getLength();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str10, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str29, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 10.0d + "'", double30 == 10.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + (-1.0d) + "'", double31 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + (-1.0d) + "'", double38 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str45, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + (-1.0d) + "'", double47 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-1.0d) + "'", double50 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-1.0d) + "'", double51 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + (-1.0d) + "'", double52 == (-1.0d));
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
// flaky:         yourWood0.addWood((double) 10, 10);
// flaky:         yourWood0.addWood((double) 10, (int) (byte) 10);
        java.util.ArrayList<logic.RoundVolume> roundVolumeList8 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList10 = yourWood0.getWood();
        yourWood0.diameterFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList1);
        org.junit.Assert.assertNotNull(roundVolumeList8);
        org.junit.Assert.assertNotNull(roundVolumeList10);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setVolume(0.0d);
        roundVolume3.setDiameter((int) (short) 0);
        int int13 = roundVolume3.getDiameter();
        java.lang.String str14 = roundVolume3.toString();
        java.lang.String str15 = roundVolume3.toString();
        double double16 = roundVolume3.getLength();
        double double17 = roundVolume3.getLength();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str14, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str15, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 100.0d + "'", double16 == 100.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume(100.0d, (int) (byte) 1, (double) (byte) 10);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) '4', (int) (byte) 100, (double) 10L);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList2 = yourWood0.getWood();
        yourWood0.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList4 = yourWood0.getWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList5 = yourWood0.getWood();
        org.junit.Assert.assertNotNull(roundVolumeList1);
        org.junit.Assert.assertNotNull(roundVolumeList2);
        org.junit.Assert.assertNotNull(roundVolumeList4);
        org.junit.Assert.assertNotNull(roundVolumeList5);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        roundVolume3.setDiameter((int) (byte) 100);
        logic.YourWood yourWood12 = new logic.YourWood();
        yourWood12.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList14 = yourWood12.getWood();
        boolean boolean15 = roundVolume3.equals((java.lang.Object) roundVolumeList14);
        roundVolume3.setDiameter((int) 'a');
        java.lang.String str18 = roundVolume3.toString();
        logic.RoundVolume roundVolume22 = new logic.RoundVolume((double) (byte) 100, 0, (double) 0.0f);
        roundVolume22.setLength((double) (byte) 0);
        double double25 = roundVolume22.getLength();
        java.lang.String str26 = roundVolume22.toString();
        boolean boolean27 = roundVolume3.canEqual((java.lang.Object) roundVolume22);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(roundVolumeList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "RoundVolume(length=-1.0, diameter=97, volume=10.0)" + "'", str18, "RoundVolume(length=-1.0, diameter=97, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "RoundVolume(length=0.0, diameter=0, volume=0.0)" + "'", str26, "RoundVolume(length=0.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList2 = yourWood0.getWood();
        yourWood0.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList4 = yourWood0.getWood();
        java.lang.Class<?> wildcardClass5 = roundVolumeList4.getClass();
        org.junit.Assert.assertNotNull(roundVolumeList1);
        org.junit.Assert.assertNotNull(roundVolumeList2);
        org.junit.Assert.assertNotNull(roundVolumeList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        logic.RoundVolume roundVolume0 = new logic.RoundVolume();
        double double1 = roundVolume0.getVolume();
        logic.YourWood yourWood2 = new logic.YourWood();
        yourWood2.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList4 = yourWood2.getWood();
        boolean boolean5 = roundVolume0.canEqual((java.lang.Object) yourWood2);
        double double6 = roundVolume0.getLength();
        logic.RoundVolume roundVolume10 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume10.setLength((double) (-1.0f));
        java.lang.String str13 = roundVolume10.toString();
        double double14 = roundVolume10.getVolume();
        double double15 = roundVolume10.getVolume();
        boolean boolean17 = roundVolume10.equals((java.lang.Object) "");
        double double18 = roundVolume10.getLength();
        boolean boolean19 = roundVolume0.canEqual((java.lang.Object) double18);
        int int20 = roundVolume0.getDiameter();
        double double21 = roundVolume0.getLength();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roundVolumeList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str13, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + (-1.0d) + "'", double18 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        logic.YourWood yourWood0 = new logic.YourWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList4 = yourWood0.getWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList5 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList4);
        org.junit.Assert.assertNotNull(roundVolumeList5);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setLength((double) 100L);
        roundVolume3.setVolume((double) (short) -1);
        logic.RoundVolume roundVolume16 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume16.setLength((double) (-1.0f));
        java.lang.String str19 = roundVolume16.toString();
        double double20 = roundVolume16.getVolume();
        java.lang.String str21 = roundVolume16.toString();
        boolean boolean22 = roundVolume3.equals((java.lang.Object) roundVolume16);
        logic.YourWood yourWood23 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList24 = yourWood23.getWood();
// flaky:         yourWood23.addWood((double) 10, 10);
        java.util.ArrayList<logic.RoundVolume> roundVolumeList28 = yourWood23.getWood();
        boolean boolean29 = roundVolume16.equals((java.lang.Object) roundVolumeList28);
        java.lang.Class<?> wildcardClass30 = roundVolume16.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str19, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str21, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(roundVolumeList24);
        org.junit.Assert.assertNotNull(roundVolumeList28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (short) 0, (-1), (double) (short) -1);
        java.lang.String str4 = roundVolume3.toString();
        logic.YourWood yourWood5 = new logic.YourWood();
        yourWood5.diameterFirstSortWood();
        yourWood5.diameterFirstSortWood();
        yourWood5.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList9 = yourWood5.getWood();
        yourWood5.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList11 = yourWood5.getWood();
        boolean boolean12 = roundVolume3.canEqual((java.lang.Object) yourWood5);
        yourWood5.diameterFirstSortWood();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RoundVolume(length=0.0, diameter=-1, volume=-1.0)" + "'", str4, "RoundVolume(length=0.0, diameter=-1, volume=-1.0)");
        org.junit.Assert.assertNotNull(roundVolumeList9);
        org.junit.Assert.assertNotNull(roundVolumeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setVolume(0.0d);
        roundVolume3.setDiameter((int) (short) 0);
        java.lang.String str13 = roundVolume3.toString();
        double double14 = roundVolume3.getVolume();
        logic.RoundVolume roundVolume18 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume18.setLength((double) (-1.0f));
        java.lang.String str21 = roundVolume18.toString();
        double double22 = roundVolume18.getVolume();
        double double23 = roundVolume18.getLength();
        int int24 = roundVolume18.getDiameter();
        java.lang.String str25 = roundVolume18.toString();
        logic.RoundVolume roundVolume29 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume29.setDiameter((int) (byte) 10);
        java.lang.Object obj32 = null;
        boolean boolean33 = roundVolume29.canEqual(obj32);
        boolean boolean35 = roundVolume29.canEqual((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass36 = roundVolume29.getClass();
        boolean boolean37 = roundVolume18.equals((java.lang.Object) wildcardClass36);
        logic.RoundVolume roundVolume41 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume41.setLength((double) (-1.0f));
        java.lang.String str44 = roundVolume41.toString();
        double double45 = roundVolume41.getVolume();
        double double46 = roundVolume41.getLength();
        int int47 = roundVolume41.getDiameter();
        roundVolume41.setVolume((double) (-1));
        roundVolume41.setVolume((double) 10.0f);
        boolean boolean52 = roundVolume18.equals((java.lang.Object) 10.0f);
        boolean boolean53 = roundVolume3.canEqual((java.lang.Object) roundVolume18);
        double double54 = roundVolume18.getVolume();
        roundVolume18.setLength((double) (short) 100);
        double double57 = roundVolume18.getVolume();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str13, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str21, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str25, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str44, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1.0d) + "'", double46 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 10.0d + "'", double57 == 10.0d);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        logic.YourWood yourWood0 = new logic.YourWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList2 = yourWood0.getWood();
        yourWood0.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList4 = yourWood0.getWood();
// flaky:         yourWood0.addWood((double) 1L, (int) (short) 100);
        yourWood0.diameterFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList2);
        org.junit.Assert.assertNotNull(roundVolumeList4);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) '#', (-1), (double) 100L);
        roundVolume3.setVolume((double) 10);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume3.setDiameter((int) (byte) 10);
        java.lang.Object obj6 = null;
        boolean boolean7 = roundVolume3.canEqual(obj6);
        boolean boolean9 = roundVolume3.equals((java.lang.Object) ' ');
        java.lang.Class<?> wildcardClass10 = roundVolume3.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume(0.0d, (int) (byte) 1, (double) ' ');
        java.lang.String str4 = roundVolume3.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RoundVolume(length=0.0, diameter=1, volume=32.0)" + "'", str4, "RoundVolume(length=0.0, diameter=1, volume=32.0)");
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume3.setDiameter((int) (byte) 10);
        java.lang.Object obj6 = null;
        boolean boolean7 = roundVolume3.canEqual(obj6);
        int int8 = roundVolume3.getDiameter();
        double double9 = roundVolume3.getLength();
        logic.RoundVolume roundVolume13 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume13.setLength((double) (-1.0f));
        double double16 = roundVolume13.getVolume();
        logic.RoundVolume roundVolume17 = new logic.RoundVolume();
        double double18 = roundVolume17.getVolume();
        logic.YourWood yourWood19 = new logic.YourWood();
        yourWood19.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList21 = yourWood19.getWood();
        boolean boolean22 = roundVolume17.canEqual((java.lang.Object) yourWood19);
        logic.YourWood yourWood23 = new logic.YourWood();
        yourWood23.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList25 = yourWood23.getWood();
        yourWood23.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList27 = yourWood23.getWood();
// flaky:         yourWood23.addWood((double) 1L, (int) (short) 100);
        boolean boolean31 = roundVolume17.canEqual((java.lang.Object) 1L);
        boolean boolean32 = roundVolume13.equals((java.lang.Object) 1L);
        boolean boolean33 = roundVolume3.equals((java.lang.Object) boolean32);
        logic.RoundVolume roundVolume37 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume37.setLength((double) (-1.0f));
        java.lang.String str40 = roundVolume37.toString();
        double double41 = roundVolume37.getVolume();
        double double42 = roundVolume37.getVolume();
        boolean boolean44 = roundVolume37.canEqual((java.lang.Object) (byte) -1);
        roundVolume37.setDiameter(100);
        roundVolume37.setDiameter((int) '4');
        boolean boolean49 = roundVolume3.equals((java.lang.Object) '4');
        double double50 = roundVolume3.getLength();
        roundVolume3.setVolume((double) '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 100.0d + "'", double9 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertNotNull(roundVolumeList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(roundVolumeList25);
        org.junit.Assert.assertNotNull(roundVolumeList27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str40, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 100.0d + "'", double50 == 100.0d);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        roundVolume3.setDiameter((int) (byte) 100);
        roundVolume3.setVolume((double) 0);
        roundVolume3.setDiameter((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (short) 100, 10, 100.0d);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) '#', (int) (short) -1, (double) 0L);
        logic.RoundVolume roundVolume7 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume7.setLength((double) (-1.0f));
        java.lang.String str10 = roundVolume7.toString();
        roundVolume7.setLength(100.0d);
        roundVolume7.setVolume(0.0d);
        java.lang.String str15 = roundVolume7.toString();
        double double16 = roundVolume7.getVolume();
        boolean boolean17 = roundVolume3.equals((java.lang.Object) double16);
        logic.RoundVolume roundVolume21 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume21.setLength((double) 1L);
        int int24 = roundVolume21.getDiameter();
        double double25 = roundVolume21.getVolume();
        logic.RoundVolume roundVolume29 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume29.setDiameter((int) (byte) 10);
        java.lang.Object obj32 = null;
        boolean boolean33 = roundVolume29.canEqual(obj32);
        boolean boolean35 = roundVolume29.equals((java.lang.Object) ' ');
        boolean boolean36 = roundVolume21.canEqual((java.lang.Object) ' ');
        boolean boolean37 = roundVolume3.canEqual((java.lang.Object) boolean36);
        roundVolume3.setVolume((double) '4');
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str10, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "RoundVolume(length=100.0, diameter=1, volume=0.0)" + "'", str15, "RoundVolume(length=100.0, diameter=1, volume=0.0)");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 'a', (int) (byte) 0, (double) (short) 10);
        logic.RoundVolume roundVolume7 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume7.setLength((double) (-1.0f));
        java.lang.String str10 = roundVolume7.toString();
        double double11 = roundVolume7.getVolume();
        double double12 = roundVolume7.getLength();
        roundVolume7.setVolume((double) 10.0f);
        double double15 = roundVolume7.getVolume();
        roundVolume7.setLength((double) (short) 0);
        roundVolume7.setDiameter((int) (byte) -1);
        int int20 = roundVolume7.getDiameter();
        boolean boolean21 = roundVolume3.equals((java.lang.Object) int20);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str10, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume3.setDiameter((int) (byte) 10);
        roundVolume3.setDiameter((int) (byte) -1);
        roundVolume3.setVolume((double) '4');
        roundVolume3.setLength((double) (byte) 10);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 1, (int) (short) 10, (double) 1L);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume(97.0d, (int) '4', (double) 1);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        roundVolume3.setDiameter((int) (byte) 100);
        double double12 = roundVolume3.getLength();
        int int13 = roundVolume3.getDiameter();
        int int14 = roundVolume3.getDiameter();
        roundVolume3.setVolume((double) 10.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        logic.RoundVolume roundVolume0 = new logic.RoundVolume();
        double double1 = roundVolume0.getVolume();
        logic.YourWood yourWood2 = new logic.YourWood();
        yourWood2.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList4 = yourWood2.getWood();
        boolean boolean5 = roundVolume0.canEqual((java.lang.Object) yourWood2);
        yourWood2.diameterFirstSortWood();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roundVolumeList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        java.lang.String str8 = roundVolume3.toString();
        double double9 = roundVolume3.getLength();
        double double10 = roundVolume3.getLength();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str8, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + (-1.0d) + "'", double10 == (-1.0d));
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        logic.RoundVolume roundVolume0 = new logic.RoundVolume();
        logic.YourWood yourWood1 = new logic.YourWood();
        yourWood1.diameterFirstSortWood();
        yourWood1.diameterFirstSortWood();
        yourWood1.lengthFirstSortWood();
        yourWood1.lengthFirstSortWood();
        boolean boolean6 = roundVolume0.equals((java.lang.Object) yourWood1);
        java.util.ArrayList<logic.RoundVolume> roundVolumeList7 = yourWood1.getWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList8 = yourWood1.getWood();
        yourWood1.diameterFirstSortWood();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(roundVolumeList7);
        org.junit.Assert.assertNotNull(roundVolumeList8);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        logic.RoundVolume roundVolume0 = new logic.RoundVolume();
        double double1 = roundVolume0.getVolume();
        logic.RoundVolume roundVolume5 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume5.setLength((double) (-1.0f));
        java.lang.String str8 = roundVolume5.toString();
        roundVolume5.setLength(100.0d);
        roundVolume5.setVolume(0.0d);
        logic.RoundVolume roundVolume16 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume16.setLength((double) 1L);
        boolean boolean19 = roundVolume5.canEqual((java.lang.Object) roundVolume16);
        boolean boolean20 = roundVolume0.canEqual((java.lang.Object) roundVolume5);
        roundVolume0.setVolume((double) ' ');
        roundVolume0.setLength((double) 100.0f);
        logic.RoundVolume roundVolume28 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume28.setLength((double) (-1.0f));
        java.lang.String str31 = roundVolume28.toString();
        roundVolume28.setLength(100.0d);
        java.lang.String str34 = roundVolume28.toString();
        logic.RoundVolume roundVolume38 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume38.setLength((double) (-1.0f));
        java.lang.String str41 = roundVolume38.toString();
        double double42 = roundVolume38.getVolume();
        double double43 = roundVolume38.getVolume();
        boolean boolean45 = roundVolume38.canEqual((java.lang.Object) (byte) -1);
        roundVolume38.setDiameter(100);
        boolean boolean48 = roundVolume28.equals((java.lang.Object) roundVolume38);
        boolean boolean49 = roundVolume0.equals((java.lang.Object) boolean48);
        double double50 = roundVolume0.getVolume();
        double double51 = roundVolume0.getVolume();
        int int52 = roundVolume0.getDiameter();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str8, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str31, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "RoundVolume(length=100.0, diameter=1, volume=10.0)" + "'", str34, "RoundVolume(length=100.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str41, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 32.0d + "'", double50 == 32.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 32.0d + "'", double51 == 32.0d);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        boolean boolean10 = roundVolume3.canEqual((java.lang.Object) (byte) -1);
        roundVolume3.setDiameter(100);
        roundVolume3.setVolume((double) 10.0f);
        roundVolume3.setDiameter((int) (short) 10);
        double double17 = roundVolume3.getVolume();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        java.lang.String str7 = roundVolume3.toString();
        roundVolume3.setDiameter((int) (byte) 10);
        int int10 = roundVolume3.getDiameter();
        java.lang.String str11 = roundVolume3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str7, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=-1.0, diameter=10, volume=10.0)" + "'", str11, "RoundVolume(length=-1.0, diameter=10, volume=10.0)");
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (short) 1, (int) (byte) 0, (double) (-1.0f));
        java.lang.String str4 = roundVolume3.toString();
        double double5 = roundVolume3.getLength();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RoundVolume(length=1.0, diameter=0, volume=-1.0)" + "'", str4, "RoundVolume(length=1.0, diameter=0, volume=-1.0)");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setDiameter((int) (byte) 0);
        java.lang.String str11 = roundVolume3.toString();
        roundVolume3.setDiameter((int) (byte) -1);
        int int14 = roundVolume3.getDiameter();
        roundVolume3.setLength(32.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=10.0)" + "'", str11, "RoundVolume(length=100.0, diameter=0, volume=10.0)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (-1), (int) ' ', (double) 100);
        double double4 = roundVolume3.getLength();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + (-1.0d) + "'", double4 == (-1.0d));
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 1, 0, (double) (byte) 100);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
// flaky:         yourWood0.addWood((double) 10, 10);
        java.util.ArrayList<logic.RoundVolume> roundVolumeList5 = yourWood0.getWood();
        yourWood0.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList7 = yourWood0.getWood();
        yourWood0.diameterFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList1);
        org.junit.Assert.assertNotNull(roundVolumeList5);
        org.junit.Assert.assertNotNull(roundVolumeList7);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getLength();
        int int8 = roundVolume3.getDiameter();
        roundVolume3.setLength((double) (-1));
        logic.RoundVolume roundVolume14 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume14.setLength((double) (-1.0f));
        java.lang.String str17 = roundVolume14.toString();
        roundVolume14.setLength(100.0d);
        roundVolume14.setVolume(0.0d);
        roundVolume14.setDiameter((int) (short) 0);
        int int24 = roundVolume14.getDiameter();
        logic.YourWood yourWood25 = new logic.YourWood();
        yourWood25.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList27 = yourWood25.getWood();
        yourWood25.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList29 = yourWood25.getWood();
// flaky:         yourWood25.addWood((double) 1L, (int) (short) 100);
        boolean boolean33 = roundVolume14.equals((java.lang.Object) (short) 100);
        boolean boolean34 = roundVolume3.canEqual((java.lang.Object) roundVolume14);
        roundVolume3.setDiameter((int) ' ');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str17, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(roundVolumeList27);
        org.junit.Assert.assertNotNull(roundVolumeList29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume3.setDiameter((int) (byte) 10);
        roundVolume3.setDiameter((int) (byte) -1);
        double double8 = roundVolume3.getLength();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setVolume(0.0d);
        roundVolume3.setDiameter((int) (short) 0);
        java.lang.String str13 = roundVolume3.toString();
        double double14 = roundVolume3.getVolume();
        logic.RoundVolume roundVolume18 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume18.setLength((double) (-1.0f));
        java.lang.String str21 = roundVolume18.toString();
        double double22 = roundVolume18.getVolume();
        double double23 = roundVolume18.getLength();
        int int24 = roundVolume18.getDiameter();
        java.lang.String str25 = roundVolume18.toString();
        logic.RoundVolume roundVolume29 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume29.setDiameter((int) (byte) 10);
        java.lang.Object obj32 = null;
        boolean boolean33 = roundVolume29.canEqual(obj32);
        boolean boolean35 = roundVolume29.canEqual((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass36 = roundVolume29.getClass();
        boolean boolean37 = roundVolume18.equals((java.lang.Object) wildcardClass36);
        logic.RoundVolume roundVolume41 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume41.setLength((double) (-1.0f));
        java.lang.String str44 = roundVolume41.toString();
        double double45 = roundVolume41.getVolume();
        double double46 = roundVolume41.getLength();
        int int47 = roundVolume41.getDiameter();
        roundVolume41.setVolume((double) (-1));
        roundVolume41.setVolume((double) 10.0f);
        boolean boolean52 = roundVolume18.equals((java.lang.Object) 10.0f);
        boolean boolean53 = roundVolume3.canEqual((java.lang.Object) roundVolume18);
        double double54 = roundVolume18.getVolume();
        java.lang.String str55 = roundVolume18.toString();
        int int56 = roundVolume18.getDiameter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str13, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str21, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str25, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str44, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1.0d) + "'", double46 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 10.0d + "'", double54 == 10.0d);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str55, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1 + "'", int56 == 1);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        roundVolume3.setVolume((double) 10.0f);
        roundVolume3.setLength((double) (short) 1);
        int int13 = roundVolume3.getDiameter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        boolean boolean10 = roundVolume3.equals((java.lang.Object) "");
        roundVolume3.setLength(0.0d);
        roundVolume3.setVolume(0.0d);
        logic.RoundVolume roundVolume18 = new logic.RoundVolume((double) 1.0f, (int) 'a', (double) 'a');
        boolean boolean19 = roundVolume3.equals((java.lang.Object) 'a');
        logic.RoundVolume roundVolume23 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume23.setLength((double) (-1.0f));
        double double26 = roundVolume23.getVolume();
        double double27 = roundVolume23.getLength();
        boolean boolean28 = roundVolume3.equals((java.lang.Object) roundVolume23);
        logic.RoundVolume roundVolume32 = new logic.RoundVolume((double) (byte) 100, 0, (double) 0.0f);
        roundVolume32.setLength((double) (byte) 0);
        double double35 = roundVolume32.getLength();
        java.lang.String str36 = roundVolume32.toString();
        boolean boolean37 = roundVolume23.canEqual((java.lang.Object) roundVolume32);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "RoundVolume(length=0.0, diameter=0, volume=0.0)" + "'", str36, "RoundVolume(length=0.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        boolean boolean10 = roundVolume3.equals((java.lang.Object) "");
        roundVolume3.setLength(0.0d);
        roundVolume3.setVolume((double) (short) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (byte) 100, 0, (double) 0.0f);
        roundVolume3.setLength((double) (byte) 0);
        double double6 = roundVolume3.getLength();
        java.lang.String str7 = roundVolume3.toString();
        logic.RoundVolume roundVolume11 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume11.setLength((double) (-1.0f));
        java.lang.String str14 = roundVolume11.toString();
        double double15 = roundVolume11.getVolume();
        double double16 = roundVolume11.getLength();
        roundVolume11.setVolume((double) 10.0f);
        double double19 = roundVolume11.getVolume();
        roundVolume11.setLength((double) (short) 0);
        double double22 = roundVolume11.getLength();
        boolean boolean23 = roundVolume3.equals((java.lang.Object) roundVolume11);
        double double24 = roundVolume3.getVolume();
        java.lang.String str25 = roundVolume3.toString();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "RoundVolume(length=0.0, diameter=0, volume=0.0)" + "'", str7, "RoundVolume(length=0.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str14, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "RoundVolume(length=0.0, diameter=0, volume=0.0)" + "'", str25, "RoundVolume(length=0.0, diameter=0, volume=0.0)");
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        boolean boolean10 = roundVolume3.equals((java.lang.Object) 0.0f);
        double double11 = roundVolume3.getVolume();
        double double12 = roundVolume3.getVolume();
        logic.RoundVolume roundVolume16 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume16.setLength((double) (-1.0f));
        java.lang.String str19 = roundVolume16.toString();
        double double20 = roundVolume16.getVolume();
        double double21 = roundVolume16.getLength();
        int int22 = roundVolume16.getDiameter();
        java.lang.String str23 = roundVolume16.toString();
        logic.RoundVolume roundVolume27 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume27.setDiameter((int) (byte) 10);
        java.lang.Object obj30 = null;
        boolean boolean31 = roundVolume27.canEqual(obj30);
        boolean boolean33 = roundVolume27.canEqual((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass34 = roundVolume27.getClass();
        boolean boolean35 = roundVolume16.equals((java.lang.Object) wildcardClass34);
        int int36 = roundVolume16.getDiameter();
        boolean boolean37 = roundVolume3.equals((java.lang.Object) roundVolume16);
        logic.RoundVolume roundVolume41 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume41.setLength((double) (-1.0f));
        java.lang.String str44 = roundVolume41.toString();
        double double45 = roundVolume41.getVolume();
        double double46 = roundVolume41.getLength();
        int int47 = roundVolume41.getDiameter();
        logic.YourWood yourWood48 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList49 = yourWood48.getWood();
        yourWood48.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList51 = yourWood48.getWood();
        yourWood48.lengthFirstSortWood();
        yourWood48.diameterFirstSortWood();
        boolean boolean54 = roundVolume41.equals((java.lang.Object) yourWood48);
        boolean boolean55 = roundVolume16.equals((java.lang.Object) roundVolume41);
        double double56 = roundVolume16.getLength();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str19, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str23, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str44, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1.0d) + "'", double46 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(roundVolumeList49);
        org.junit.Assert.assertNotNull(roundVolumeList51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + (-1.0d) + "'", double56 == (-1.0d));
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList3 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList6 = yourWood0.getWood();
        yourWood0.diameterFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList1);
        org.junit.Assert.assertNotNull(roundVolumeList3);
        org.junit.Assert.assertNotNull(roundVolumeList6);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (short) -1, (int) '4', (double) (short) 1);
        roundVolume3.setDiameter(1);
        int int6 = roundVolume3.getDiameter();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setVolume(0.0d);
        roundVolume3.setDiameter((int) (short) 0);
        java.lang.String str13 = roundVolume3.toString();
        double double14 = roundVolume3.getVolume();
        logic.RoundVolume roundVolume18 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume18.setLength((double) (-1.0f));
        java.lang.String str21 = roundVolume18.toString();
        double double22 = roundVolume18.getVolume();
        double double23 = roundVolume18.getLength();
        int int24 = roundVolume18.getDiameter();
        java.lang.String str25 = roundVolume18.toString();
        logic.RoundVolume roundVolume29 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume29.setDiameter((int) (byte) 10);
        java.lang.Object obj32 = null;
        boolean boolean33 = roundVolume29.canEqual(obj32);
        boolean boolean35 = roundVolume29.canEqual((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass36 = roundVolume29.getClass();
        boolean boolean37 = roundVolume18.equals((java.lang.Object) wildcardClass36);
        logic.RoundVolume roundVolume41 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume41.setLength((double) (-1.0f));
        java.lang.String str44 = roundVolume41.toString();
        double double45 = roundVolume41.getVolume();
        double double46 = roundVolume41.getLength();
        int int47 = roundVolume41.getDiameter();
        roundVolume41.setVolume((double) (-1));
        roundVolume41.setVolume((double) 10.0f);
        boolean boolean52 = roundVolume18.equals((java.lang.Object) 10.0f);
        boolean boolean53 = roundVolume3.canEqual((java.lang.Object) roundVolume18);
        boolean boolean55 = roundVolume3.equals((java.lang.Object) "RoundVolume(length=0.0, diameter=1, volume=10.0)");
        logic.YourWood yourWood56 = new logic.YourWood();
        yourWood56.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList58 = yourWood56.getWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList59 = yourWood56.getWood();
        yourWood56.lengthFirstSortWood();
        boolean boolean61 = roundVolume3.equals((java.lang.Object) yourWood56);
        yourWood56.lengthFirstSortWood();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str13, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str21, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str25, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str44, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1.0d) + "'", double46 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(roundVolumeList58);
        org.junit.Assert.assertNotNull(roundVolumeList59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        int int9 = roundVolume3.getDiameter();
        logic.RoundVolume roundVolume13 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume13.setLength((double) (-1.0f));
        java.lang.String str16 = roundVolume13.toString();
        roundVolume13.setLength(100.0d);
        roundVolume13.setVolume(0.0d);
        boolean boolean21 = roundVolume3.equals((java.lang.Object) 0.0d);
        logic.RoundVolume roundVolume25 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume25.setLength((double) (-1.0f));
        java.lang.String str28 = roundVolume25.toString();
        double double29 = roundVolume25.getVolume();
        int int30 = roundVolume25.getDiameter();
        double double31 = roundVolume25.getVolume();
        boolean boolean32 = roundVolume3.canEqual((java.lang.Object) double31);
        logic.YourWood yourWood33 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList34 = yourWood33.getWood();
        yourWood33.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList36 = yourWood33.getWood();
        yourWood33.lengthFirstSortWood();
        yourWood33.diameterFirstSortWood();
        boolean boolean39 = roundVolume3.canEqual((java.lang.Object) yourWood33);
        yourWood33.diameterFirstSortWood();
        yourWood33.diameterFirstSortWood();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str16, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str28, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(roundVolumeList34);
        org.junit.Assert.assertNotNull(roundVolumeList36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        boolean boolean10 = roundVolume3.equals((java.lang.Object) 0.0f);
        double double11 = roundVolume3.getVolume();
        double double12 = roundVolume3.getVolume();
        logic.RoundVolume roundVolume16 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume16.setLength((double) (-1.0f));
        java.lang.String str19 = roundVolume16.toString();
        double double20 = roundVolume16.getVolume();
        double double21 = roundVolume16.getLength();
        int int22 = roundVolume16.getDiameter();
        java.lang.String str23 = roundVolume16.toString();
        logic.RoundVolume roundVolume27 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume27.setDiameter((int) (byte) 10);
        java.lang.Object obj30 = null;
        boolean boolean31 = roundVolume27.canEqual(obj30);
        boolean boolean33 = roundVolume27.canEqual((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass34 = roundVolume27.getClass();
        boolean boolean35 = roundVolume16.equals((java.lang.Object) wildcardClass34);
        int int36 = roundVolume16.getDiameter();
        boolean boolean37 = roundVolume3.equals((java.lang.Object) roundVolume16);
        logic.RoundVolume roundVolume41 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume41.setLength((double) (-1.0f));
        java.lang.String str44 = roundVolume41.toString();
        double double45 = roundVolume41.getVolume();
        double double46 = roundVolume41.getLength();
        int int47 = roundVolume41.getDiameter();
        logic.YourWood yourWood48 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList49 = yourWood48.getWood();
        yourWood48.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList51 = yourWood48.getWood();
        yourWood48.lengthFirstSortWood();
        yourWood48.diameterFirstSortWood();
        boolean boolean54 = roundVolume41.equals((java.lang.Object) yourWood48);
        boolean boolean55 = roundVolume16.equals((java.lang.Object) roundVolume41);
        java.lang.String str56 = roundVolume41.toString();
        roundVolume41.setVolume(97.0d);
        roundVolume41.setDiameter(0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str19, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str23, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(wildcardClass34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str44, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1.0d) + "'", double46 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(roundVolumeList49);
        org.junit.Assert.assertNotNull(roundVolumeList51);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str56, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        roundVolume3.setDiameter((int) (byte) 100);
        roundVolume3.setDiameter((int) (short) 10);
        logic.RoundVolume roundVolume17 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume17.setLength((double) (-1.0f));
        java.lang.String str20 = roundVolume17.toString();
        roundVolume17.setLength(100.0d);
        roundVolume17.setVolume(0.0d);
        logic.RoundVolume roundVolume28 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume28.setLength((double) 1L);
        boolean boolean31 = roundVolume17.canEqual((java.lang.Object) roundVolume28);
        boolean boolean32 = roundVolume3.canEqual((java.lang.Object) roundVolume17);
        double double33 = roundVolume17.getLength();
        roundVolume17.setVolume((double) 100L);
        int int36 = roundVolume17.getDiameter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str20, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 100.0d + "'", double33 == 100.0d);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume3.setDiameter((int) (byte) 10);
        roundVolume3.setDiameter((int) (byte) -1);
        roundVolume3.setVolume((double) 10);
        double double10 = roundVolume3.getLength();
        boolean boolean12 = roundVolume3.equals((java.lang.Object) (byte) 1);
        roundVolume3.setDiameter((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((-1.0d), 1, (double) (short) -1);
        logic.RoundVolume roundVolume7 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume7.setLength((double) (-1.0f));
        java.lang.String str10 = roundVolume7.toString();
        double double11 = roundVolume7.getVolume();
        double double12 = roundVolume7.getLength();
        int int13 = roundVolume7.getDiameter();
        roundVolume7.setDiameter((int) (byte) 100);
        roundVolume7.setDiameter((int) (short) 10);
        logic.RoundVolume roundVolume21 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume21.setLength((double) (-1.0f));
        java.lang.String str24 = roundVolume21.toString();
        roundVolume21.setLength(100.0d);
        roundVolume21.setVolume(0.0d);
        logic.RoundVolume roundVolume32 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume32.setLength((double) 1L);
        boolean boolean35 = roundVolume21.canEqual((java.lang.Object) roundVolume32);
        boolean boolean36 = roundVolume7.canEqual((java.lang.Object) roundVolume21);
        double double37 = roundVolume21.getLength();
        boolean boolean38 = roundVolume3.canEqual((java.lang.Object) double37);
        roundVolume3.setVolume((double) 97);
        int int41 = roundVolume3.getDiameter();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str10, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str24, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 100.0d + "'", double37 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (-1), (int) (short) 100, (double) 1);
        roundVolume3.setDiameter((int) (byte) 1);
        double double6 = roundVolume3.getVolume();
        roundVolume3.setDiameter((int) (short) 10);
        logic.RoundVolume roundVolume12 = new logic.RoundVolume((double) (short) 0, (-1), (double) (short) -1);
        java.lang.String str13 = roundVolume12.toString();
        logic.YourWood yourWood14 = new logic.YourWood();
        yourWood14.diameterFirstSortWood();
        yourWood14.diameterFirstSortWood();
        yourWood14.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList18 = yourWood14.getWood();
        yourWood14.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList20 = yourWood14.getWood();
        boolean boolean21 = roundVolume12.canEqual((java.lang.Object) yourWood14);
        boolean boolean22 = roundVolume3.canEqual((java.lang.Object) boolean21);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RoundVolume(length=0.0, diameter=-1, volume=-1.0)" + "'", str13, "RoundVolume(length=0.0, diameter=-1, volume=-1.0)");
        org.junit.Assert.assertNotNull(roundVolumeList18);
        org.junit.Assert.assertNotNull(roundVolumeList20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 1.0f, (int) 'a', (double) 'a');
        roundVolume3.setLength((double) 1.0f);
        double double6 = roundVolume3.getLength();
        java.lang.String str7 = roundVolume3.toString();
        roundVolume3.setVolume((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1.0d + "'", double6 == 1.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "RoundVolume(length=1.0, diameter=97, volume=97.0)" + "'", str7, "RoundVolume(length=1.0, diameter=97, volume=97.0)");
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        int int9 = roundVolume3.getDiameter();
        roundVolume3.setLength((double) (-1));
        roundVolume3.setDiameter((int) '4');
        java.lang.String str14 = roundVolume3.toString();
        double double15 = roundVolume3.getLength();
        java.lang.String str16 = roundVolume3.toString();
        java.lang.Class<?> wildcardClass17 = roundVolume3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "RoundVolume(length=-1.0, diameter=52, volume=10.0)" + "'", str14, "RoundVolume(length=-1.0, diameter=52, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "RoundVolume(length=-1.0, diameter=52, volume=10.0)" + "'", str16, "RoundVolume(length=-1.0, diameter=52, volume=10.0)");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setVolume(0.0d);
        roundVolume3.setDiameter((int) (short) 0);
        java.lang.String str13 = roundVolume3.toString();
        double double14 = roundVolume3.getVolume();
        logic.RoundVolume roundVolume18 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume18.setLength((double) (-1.0f));
        java.lang.String str21 = roundVolume18.toString();
        double double22 = roundVolume18.getVolume();
        double double23 = roundVolume18.getLength();
        int int24 = roundVolume18.getDiameter();
        java.lang.String str25 = roundVolume18.toString();
        logic.RoundVolume roundVolume29 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume29.setDiameter((int) (byte) 10);
        java.lang.Object obj32 = null;
        boolean boolean33 = roundVolume29.canEqual(obj32);
        boolean boolean35 = roundVolume29.canEqual((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass36 = roundVolume29.getClass();
        boolean boolean37 = roundVolume18.equals((java.lang.Object) wildcardClass36);
        logic.RoundVolume roundVolume41 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume41.setLength((double) (-1.0f));
        java.lang.String str44 = roundVolume41.toString();
        double double45 = roundVolume41.getVolume();
        double double46 = roundVolume41.getLength();
        int int47 = roundVolume41.getDiameter();
        roundVolume41.setVolume((double) (-1));
        roundVolume41.setVolume((double) 10.0f);
        boolean boolean52 = roundVolume18.equals((java.lang.Object) 10.0f);
        boolean boolean53 = roundVolume3.canEqual((java.lang.Object) roundVolume18);
        double double54 = roundVolume3.getVolume();
        logic.RoundVolume roundVolume58 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        double double59 = roundVolume58.getLength();
        boolean boolean60 = roundVolume3.canEqual((java.lang.Object) roundVolume58);
        double double61 = roundVolume3.getLength();
        double double62 = roundVolume3.getVolume();
        java.lang.Class<?> wildcardClass63 = roundVolume3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str13, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str21, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 10.0d + "'", double22 == 10.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + (-1.0d) + "'", double23 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str25, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str44, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + (-1.0d) + "'", double46 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 0.0d + "'", double54 == 0.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 100.0d + "'", double59 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 100.0d + "'", double61 == 100.0d);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 0.0d + "'", double62 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass63);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        int int9 = roundVolume3.getDiameter();
        logic.RoundVolume roundVolume13 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume13.setLength((double) (-1.0f));
        java.lang.String str16 = roundVolume13.toString();
        roundVolume13.setLength(100.0d);
        roundVolume13.setVolume(0.0d);
        boolean boolean21 = roundVolume3.equals((java.lang.Object) 0.0d);
        logic.RoundVolume roundVolume25 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume25.setLength((double) (-1.0f));
        java.lang.String str28 = roundVolume25.toString();
        double double29 = roundVolume25.getVolume();
        int int30 = roundVolume25.getDiameter();
        double double31 = roundVolume25.getVolume();
        boolean boolean32 = roundVolume3.canEqual((java.lang.Object) double31);
        logic.YourWood yourWood33 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList34 = yourWood33.getWood();
        yourWood33.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList36 = yourWood33.getWood();
        yourWood33.lengthFirstSortWood();
        yourWood33.diameterFirstSortWood();
        boolean boolean39 = roundVolume3.canEqual((java.lang.Object) yourWood33);
        java.util.ArrayList<logic.RoundVolume> roundVolumeList40 = yourWood33.getWood();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str16, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str28, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 10.0d + "'", double29 == 10.0d);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 10.0d + "'", double31 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(roundVolumeList34);
        org.junit.Assert.assertNotNull(roundVolumeList36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(roundVolumeList40);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        double double4 = roundVolume3.getLength();
        java.lang.String str5 = roundVolume3.toString();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "RoundVolume(length=100.0, diameter=97, volume=10.0)" + "'", str5, "RoundVolume(length=100.0, diameter=97, volume=10.0)");
    }
}
