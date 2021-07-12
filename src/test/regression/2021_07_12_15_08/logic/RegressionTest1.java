package logic;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setVolume((double) (short) 1);
        roundVolume3.setVolume((double) 0L);
        double double8 = roundVolume3.getVolume();
        java.lang.Class<?> wildcardClass9 = roundVolume3.getClass();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.diameterFirstSortWood();
// flaky:         yourWood0.addWood((double) 1L, (int) (byte) 100);
        org.junit.Assert.assertNotNull(roundVolumeList1);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
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
        double double93 = roundVolume78.getLength();
        int int94 = roundVolume78.getDiameter();
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
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + (-1.0d) + "'", double93 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 1 + "'", int94 == 1);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
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
        int int55 = roundVolume18.getDiameter();
        java.lang.String str56 = roundVolume18.toString();
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
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str56, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        int int8 = roundVolume3.getDiameter();
        roundVolume3.setVolume((double) (-1));
        boolean boolean12 = roundVolume3.canEqual((java.lang.Object) "RoundVolume(length=100.0, diameter=35, volume=100.0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0L, (int) (byte) 10, (double) (-1.0f));
        roundVolume3.setLength((double) 1L);
        java.lang.String str6 = roundVolume3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=1.0, diameter=10, volume=-1.0)" + "'", str6, "RoundVolume(length=1.0, diameter=10, volume=-1.0)");
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 10.0f, (int) (byte) 1, (double) (short) -1);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
        yourWood0.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList3 = yourWood0.getWood();
// flaky:         yourWood0.addWood((double) 1L, (int) (byte) 10);
        org.junit.Assert.assertNotNull(roundVolumeList1);
        org.junit.Assert.assertNotNull(roundVolumeList3);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (short) 100, 10, (double) (byte) 100);
        logic.RoundVolume roundVolume7 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume7.setLength((double) (-1.0f));
        java.lang.String str10 = roundVolume7.toString();
        roundVolume7.setLength(100.0d);
        roundVolume7.setDiameter((int) (byte) 0);
        roundVolume7.setDiameter((int) (byte) 10);
        boolean boolean17 = roundVolume3.canEqual((java.lang.Object) (byte) 10);
        java.lang.String str18 = roundVolume3.toString();
        int int19 = roundVolume3.getDiameter();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str10, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "RoundVolume(length=100.0, diameter=10, volume=100.0)" + "'", str18, "RoundVolume(length=100.0, diameter=10, volume=100.0)");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setVolume((double) (short) 1);
        logic.RoundVolume roundVolume9 = new logic.RoundVolume((double) 1, (int) 'a', (double) (byte) -1);
        logic.YourWood yourWood10 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList11 = yourWood10.getWood();
        yourWood10.lengthFirstSortWood();
        boolean boolean13 = roundVolume9.equals((java.lang.Object) yourWood10);
        yourWood10.lengthFirstSortWood();
        boolean boolean15 = roundVolume3.canEqual((java.lang.Object) yourWood10);
        java.util.ArrayList<logic.RoundVolume> roundVolumeList16 = yourWood10.getWood();
        org.junit.Assert.assertNotNull(roundVolumeList11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(roundVolumeList16);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        double double10 = roundVolume3.getVolume();
        roundVolume3.setLength(0.0d);
        java.lang.String str13 = roundVolume3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RoundVolume(length=0.0, diameter=1, volume=10.0)" + "'", str13, "RoundVolume(length=0.0, diameter=1, volume=10.0)");
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume3.setDiameter((int) (byte) 10);
        java.lang.Object obj6 = null;
        boolean boolean7 = roundVolume3.canEqual(obj6);
        java.lang.String str8 = roundVolume3.toString();
        int int9 = roundVolume3.getDiameter();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "RoundVolume(length=100.0, diameter=10, volume=10.0)" + "'", str8, "RoundVolume(length=100.0, diameter=10, volume=10.0)");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
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
        java.lang.Class<?> wildcardClass28 = roundVolume3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 32, (int) (byte) 10, (double) (short) 10);
        double double4 = roundVolume3.getLength();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 32.0d + "'", double4 == 32.0d);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume3.setDiameter((int) (byte) 10);
        java.lang.Object obj6 = null;
        boolean boolean7 = roundVolume3.canEqual(obj6);
        boolean boolean9 = roundVolume3.canEqual((java.lang.Object) 10L);
        roundVolume3.setVolume((double) 100L);
        double double12 = roundVolume3.getLength();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 100.0d + "'", double12 == 100.0d);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
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
        logic.RoundVolume roundVolume21 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume21.setLength((double) (-1.0f));
        java.lang.String str24 = roundVolume21.toString();
        double double25 = roundVolume21.getVolume();
        double double26 = roundVolume21.getLength();
        int int27 = roundVolume21.getDiameter();
        roundVolume21.setDiameter((int) (byte) 100);
        roundVolume21.setDiameter((int) (short) 10);
        roundVolume21.setDiameter((int) (short) 1);
        double double34 = roundVolume21.getLength();
        double double35 = roundVolume21.getVolume();
        boolean boolean36 = roundVolume3.canEqual((java.lang.Object) roundVolume21);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str24, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + (-1.0d) + "'", double34 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 10.0d + "'", double35 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setDiameter((int) (byte) 0);
        java.lang.String str11 = roundVolume3.toString();
        boolean boolean13 = roundVolume3.equals((java.lang.Object) (-1L));
        java.lang.String str14 = roundVolume3.toString();
        boolean boolean16 = roundVolume3.equals((java.lang.Object) "RoundVolume(length=100.0, diameter=97, volume=1.0)");
        double double17 = roundVolume3.getLength();
        java.lang.Class<?> wildcardClass18 = roundVolume3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=10.0)" + "'", str11, "RoundVolume(length=100.0, diameter=0, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=10.0)" + "'", str14, "RoundVolume(length=100.0, diameter=0, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume(1.0d, (int) (short) 1, (double) 1);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
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
        roundVolume3.setDiameter(32);
        roundVolume3.setVolume((double) 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setVolume(0.0d);
        int int11 = roundVolume3.getDiameter();
        roundVolume3.setVolume((double) 0);
        logic.RoundVolume roundVolume17 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume17.setLength((double) 1L);
        int int20 = roundVolume17.getDiameter();
        boolean boolean21 = roundVolume3.equals((java.lang.Object) int20);
        java.lang.String str22 = roundVolume3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "RoundVolume(length=100.0, diameter=1, volume=0.0)" + "'", str22, "RoundVolume(length=100.0, diameter=1, volume=0.0)");
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (short) 0, (-1), (double) (byte) 0);
        java.lang.Class<?> wildcardClass4 = roundVolume3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
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
        yourWood11.diameterFirstSortWood();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertNotNull(roundVolumeList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
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
        roundVolume41.setDiameter(10);
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
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
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
        logic.RoundVolume roundVolume30 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume30.setLength((double) (-1.0f));
        java.lang.String str33 = roundVolume30.toString();
        roundVolume30.setLength(100.0d);
        roundVolume30.setLength((double) 100L);
        roundVolume30.setVolume((double) (short) -1);
        boolean boolean40 = roundVolume3.canEqual((java.lang.Object) roundVolume30);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(roundVolumeList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 10.0d + "'", double23 == 10.0d);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str33, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
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
        boolean boolean21 = roundVolume3.equals((java.lang.Object) "RoundVolume(length=100.0, diameter=1, volume=10.0)");
        roundVolume3.setVolume((double) (short) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str8, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        logic.RoundVolume roundVolume0 = new logic.RoundVolume();
        double double1 = roundVolume0.getVolume();
        logic.YourWood yourWood2 = new logic.YourWood();
        yourWood2.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList4 = yourWood2.getWood();
        boolean boolean5 = roundVolume0.canEqual((java.lang.Object) yourWood2);
        yourWood2.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList7 = yourWood2.getWood();
        yourWood2.lengthFirstSortWood();
        yourWood2.diameterFirstSortWood();
        yourWood2.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList11 = yourWood2.getWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList12 = yourWood2.getWood();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roundVolumeList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(roundVolumeList7);
        org.junit.Assert.assertNotNull(roundVolumeList11);
        org.junit.Assert.assertNotNull(roundVolumeList12);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (byte) -1, (int) (short) 100, (double) (byte) 100);
        roundVolume3.setVolume((double) 100L);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
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
        double double61 = roundVolume58.getVolume();
        roundVolume58.setLength((double) (-1.0f));
        logic.YourWood yourWood64 = new logic.YourWood();
        yourWood64.diameterFirstSortWood();
        yourWood64.diameterFirstSortWood();
        yourWood64.lengthFirstSortWood();
        yourWood64.lengthFirstSortWood();
        boolean boolean69 = roundVolume58.canEqual((java.lang.Object) yourWood64);
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
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 10.0d + "'", double61 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        int int9 = roundVolume3.getDiameter();
        java.lang.String str10 = roundVolume3.toString();
        roundVolume3.setDiameter((-1));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str10, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
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
        yourWood5.lengthFirstSortWood();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RoundVolume(length=0.0, diameter=-1, volume=-1.0)" + "'", str4, "RoundVolume(length=0.0, diameter=-1, volume=-1.0)");
        org.junit.Assert.assertNotNull(roundVolumeList9);
        org.junit.Assert.assertNotNull(roundVolumeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume3.setDiameter((int) (byte) 10);
        roundVolume3.setDiameter((int) (byte) -1);
        roundVolume3.setVolume((double) 10);
        double double10 = roundVolume3.getLength();
        java.lang.String str11 = roundVolume3.toString();
        logic.RoundVolume roundVolume15 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume15.setLength((double) (-1.0f));
        java.lang.String str18 = roundVolume15.toString();
        double double19 = roundVolume15.getVolume();
        double double20 = roundVolume15.getLength();
        int int21 = roundVolume15.getDiameter();
        roundVolume15.setVolume((double) (-1));
        double double24 = roundVolume15.getVolume();
        boolean boolean25 = roundVolume3.equals((java.lang.Object) double24);
        roundVolume3.setVolume(0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=100.0, diameter=-1, volume=10.0)" + "'", str11, "RoundVolume(length=100.0, diameter=-1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str18, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + (-1.0d) + "'", double24 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0.0f, 10, (-1.0d));
        logic.RoundVolume roundVolume7 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume7.setLength((double) (-1.0f));
        java.lang.String str10 = roundVolume7.toString();
        double double11 = roundVolume7.getVolume();
        double double12 = roundVolume7.getLength();
        roundVolume7.setVolume((double) 10.0f);
        double double15 = roundVolume7.getVolume();
        double double16 = roundVolume7.getVolume();
        roundVolume7.setDiameter(1);
        double double19 = roundVolume7.getVolume();
        logic.RoundVolume roundVolume23 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume23.setLength((double) (-1.0f));
        java.lang.String str26 = roundVolume23.toString();
        roundVolume23.setLength(100.0d);
        roundVolume23.setVolume(0.0d);
        roundVolume23.setDiameter((int) (short) 0);
        java.lang.String str33 = roundVolume23.toString();
        int int34 = roundVolume23.getDiameter();
        roundVolume23.setLength(0.0d);
        java.lang.Class<?> wildcardClass37 = roundVolume23.getClass();
        boolean boolean38 = roundVolume7.equals((java.lang.Object) wildcardClass37);
        java.lang.String str39 = roundVolume7.toString();
        boolean boolean40 = roundVolume3.canEqual((java.lang.Object) str39);
        roundVolume3.setLength((double) 1L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str10, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str26, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str33, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(wildcardClass37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str39, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
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
        roundVolume3.setLength((double) '4');
        java.lang.String str25 = roundVolume3.toString();
        java.lang.String str26 = roundVolume3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str10, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "RoundVolume(length=52.0, diameter=1, volume=10.0)" + "'", str25, "RoundVolume(length=52.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "RoundVolume(length=52.0, diameter=1, volume=10.0)" + "'", str26, "RoundVolume(length=52.0, diameter=1, volume=10.0)");
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        roundVolume3.setVolume((double) 10.0f);
        double double11 = roundVolume3.getLength();
        roundVolume3.setDiameter((int) (short) 100);
        logic.RoundVolume roundVolume17 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume17.setLength((double) (-1.0f));
        java.lang.String str20 = roundVolume17.toString();
        java.lang.String str21 = roundVolume17.toString();
        roundVolume17.setDiameter((int) (byte) 10);
        boolean boolean24 = roundVolume3.equals((java.lang.Object) (byte) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str20, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str21, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (short) 10, (int) '4', 0.0d);
        double double4 = roundVolume3.getLength();
        roundVolume3.setLength((double) 100L);
        java.lang.Class<?> wildcardClass7 = roundVolume3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
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
        double double26 = roundVolume19.getVolume();
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky:         org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertNotNull(roundVolumeList23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 52, 32, (double) (byte) 0);
        roundVolume3.setLength(97.0d);
        double double6 = roundVolume3.getLength();
        java.lang.Class<?> wildcardClass7 = roundVolume3.getClass();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 97.0d + "'", double6 == 97.0d);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
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
        roundVolume3.setLength(0.0d);
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
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        boolean boolean10 = roundVolume3.equals((java.lang.Object) "");
        java.lang.Class<?> wildcardClass11 = roundVolume3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        logic.YourWood yourWood0 = new logic.YourWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList5 = yourWood0.getWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.lengthFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList5);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (byte) 100, 0, (double) 0.0f);
        double double4 = roundVolume3.getVolume();
        roundVolume3.setLength((double) 100L);
        java.lang.String str7 = roundVolume3.toString();
        logic.RoundVolume roundVolume11 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume11.setLength((double) (-1.0f));
        java.lang.String str14 = roundVolume11.toString();
        double double15 = roundVolume11.getVolume();
        double double16 = roundVolume11.getLength();
        int int17 = roundVolume11.getDiameter();
        roundVolume11.setVolume((double) (-1));
        java.lang.String str20 = roundVolume11.toString();
        roundVolume11.setVolume((double) 100L);
        boolean boolean23 = roundVolume3.canEqual((java.lang.Object) 100L);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str7, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str14, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=-1.0)" + "'", str20, "RoundVolume(length=-1.0, diameter=1, volume=-1.0)");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
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
        roundVolume3.setLength((double) 1.0f);
        roundVolume3.setLength((double) (short) -1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str8, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        int int8 = roundVolume3.getDiameter();
        double double9 = roundVolume3.getVolume();
        roundVolume3.setLength((double) 100.0f);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        logic.RoundVolume roundVolume0 = new logic.RoundVolume();
        double double1 = roundVolume0.getVolume();
        logic.YourWood yourWood2 = new logic.YourWood();
        yourWood2.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList4 = yourWood2.getWood();
        boolean boolean5 = roundVolume0.canEqual((java.lang.Object) yourWood2);
        roundVolume0.setLength((double) 100L);
        double double8 = roundVolume0.getLength();
        roundVolume0.setVolume((double) 'a');
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roundVolumeList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
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
        java.lang.Class<?> wildcardClass21 = roundVolume0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        logic.RoundVolume roundVolume0 = new logic.RoundVolume();
        double double1 = roundVolume0.getVolume();
        logic.YourWood yourWood2 = new logic.YourWood();
        yourWood2.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList4 = yourWood2.getWood();
        boolean boolean5 = roundVolume0.canEqual((java.lang.Object) yourWood2);
        java.util.ArrayList<logic.RoundVolume> roundVolumeList6 = yourWood2.getWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList7 = yourWood2.getWood();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roundVolumeList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(roundVolumeList6);
        org.junit.Assert.assertNotNull(roundVolumeList7);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume3.setDiameter((int) (byte) 10);
        roundVolume3.setDiameter((int) (byte) -1);
        boolean boolean9 = roundVolume3.canEqual((java.lang.Object) 1);
        java.lang.String str10 = roundVolume3.toString();
        java.lang.Class<?> wildcardClass11 = roundVolume3.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RoundVolume(length=100.0, diameter=-1, volume=10.0)" + "'", str10, "RoundVolume(length=100.0, diameter=-1, volume=10.0)");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
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
        java.lang.String str23 = roundVolume16.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str19, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str21, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str23, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getLength();
        int int8 = roundVolume3.getDiameter();
        roundVolume3.setLength((double) (-1));
        java.lang.String str11 = roundVolume3.toString();
        roundVolume3.setLength((double) '4');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str11, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList3 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.lengthFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList1);
        org.junit.Assert.assertNotNull(roundVolumeList3);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
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
        java.lang.Class<?> wildcardClass62 = roundVolume3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass62);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        java.lang.String str7 = roundVolume3.toString();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        double double10 = roundVolume3.getVolume();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str7, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (-1), (double) 100L);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
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
        logic.YourWood yourWood23 = new logic.YourWood();
        yourWood23.diameterFirstSortWood();
        yourWood23.diameterFirstSortWood();
        yourWood23.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList27 = yourWood23.getWood();
        yourWood23.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList29 = yourWood23.getWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList30 = yourWood23.getWood();
        boolean boolean31 = roundVolume3.equals((java.lang.Object) yourWood23);
        int int32 = roundVolume3.getDiameter();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(roundVolumeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(roundVolumeList15);
        org.junit.Assert.assertNotNull(roundVolumeList17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(roundVolumeList27);
        org.junit.Assert.assertNotNull(roundVolumeList29);
        org.junit.Assert.assertNotNull(roundVolumeList30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
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
        int int23 = roundVolume3.getDiameter();
        roundVolume3.setVolume((double) (short) -1);
        double double26 = roundVolume3.getLength();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str16, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
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
        double double17 = roundVolume3.getVolume();
        java.lang.String str18 = roundVolume3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str11, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertNotNull(roundVolumeList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str18, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        roundVolume3.setVolume((double) 10.0f);
        double double11 = roundVolume3.getVolume();
        double double12 = roundVolume3.getVolume();
        roundVolume3.setDiameter(1);
        roundVolume3.setVolume((double) (byte) 100);
        double double17 = roundVolume3.getVolume();
        double double18 = roundVolume3.getVolume();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 100.0d + "'", double17 == 100.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 100.0d + "'", double18 == 100.0d);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (byte) 100, (int) (short) 10, 100.0d);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
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
        roundVolume3.setDiameter((int) (short) 0);
        roundVolume3.setLength((double) 100L);
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
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        java.lang.String str8 = roundVolume3.toString();
        java.lang.String str9 = roundVolume3.toString();
        int int10 = roundVolume3.getDiameter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str8, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str9, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
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
        boolean boolean19 = roundVolume3.equals((java.lang.Object) (byte) -1);
        java.lang.String str20 = roundVolume3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str8, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str20, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
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
        int int20 = roundVolume3.getDiameter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str14, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        boolean boolean10 = roundVolume3.equals((java.lang.Object) 0.0f);
        double double11 = roundVolume3.getVolume();
        roundVolume3.setVolume((double) 10);
        double double14 = roundVolume3.getLength();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + (-1.0d) + "'", double14 == (-1.0d));
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
// flaky:         yourWood0.addWood((double) 10, 10);
// flaky:         yourWood0.addWood((double) 10, (int) (byte) 10);
        yourWood0.lengthFirstSortWood();
        yourWood0.lengthFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList1);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
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
        roundVolume3.setVolume((double) (byte) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(roundVolumeList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        boolean boolean10 = roundVolume3.equals((java.lang.Object) "");
        roundVolume3.setLength(0.0d);
        roundVolume3.setLength((double) (-1.0f));
        int int15 = roundVolume3.getDiameter();
        int int16 = roundVolume3.getDiameter();
        roundVolume3.setVolume(100.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
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
        roundVolume3.setDiameter(10);
        java.lang.Class<?> wildcardClass57 = roundVolume3.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass57);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        roundVolume3.setVolume((double) 10.0f);
        double double11 = roundVolume3.getVolume();
        double double12 = roundVolume3.getVolume();
        roundVolume3.setDiameter(1);
        double double15 = roundVolume3.getVolume();
        logic.RoundVolume roundVolume19 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume19.setLength((double) (-1.0f));
        java.lang.String str22 = roundVolume19.toString();
        roundVolume19.setLength(100.0d);
        roundVolume19.setVolume(0.0d);
        roundVolume19.setDiameter((int) (short) 0);
        java.lang.String str29 = roundVolume19.toString();
        int int30 = roundVolume19.getDiameter();
        roundVolume19.setLength(0.0d);
        java.lang.Class<?> wildcardClass33 = roundVolume19.getClass();
        boolean boolean34 = roundVolume3.equals((java.lang.Object) wildcardClass33);
        java.lang.String str35 = roundVolume3.toString();
        logic.YourWood yourWood36 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList37 = yourWood36.getWood();
// flaky:         yourWood36.addWood((double) 10, 10);
// flaky:         yourWood36.addWood((double) 10, (int) (byte) 10);
        yourWood36.lengthFirstSortWood();
        yourWood36.diameterFirstSortWood();
        boolean boolean46 = roundVolume3.equals((java.lang.Object) yourWood36);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str22, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str29, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str35, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertNotNull(roundVolumeList37);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
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
        java.lang.Class<?> wildcardClass39 = roundVolume17.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str20, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 100.0d + "'", double33 == 100.0d);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 100.0d + "'", double36 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
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
        roundVolume3.setDiameter((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RoundVolume(length=100.0, diameter=1, volume=10.0)" + "'", str9, "RoundVolume(length=100.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str16, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 10L, 10, (double) 100L);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList3 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList5 = yourWood0.getWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList6 = yourWood0.getWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.diameterFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList1);
        org.junit.Assert.assertNotNull(roundVolumeList3);
        org.junit.Assert.assertNotNull(roundVolumeList5);
        org.junit.Assert.assertNotNull(roundVolumeList6);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        boolean boolean10 = roundVolume3.equals((java.lang.Object) 10L);
        roundVolume3.setLength((double) 100.0f);
        java.lang.Class<?> wildcardClass13 = roundVolume3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        int int9 = roundVolume3.getDiameter();
        java.lang.String str10 = roundVolume3.toString();
        logic.RoundVolume roundVolume14 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume14.setLength((double) (-1.0f));
        java.lang.String str17 = roundVolume14.toString();
        roundVolume14.setLength(100.0d);
        roundVolume14.setLength((double) 100L);
        logic.YourWood yourWood22 = new logic.YourWood();
        yourWood22.lengthFirstSortWood();
        yourWood22.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList25 = yourWood22.getWood();
        boolean boolean26 = roundVolume14.canEqual((java.lang.Object) yourWood22);
        yourWood22.lengthFirstSortWood();
        boolean boolean28 = roundVolume3.equals((java.lang.Object) yourWood22);
        yourWood22.lengthFirstSortWood();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str10, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str17, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertNotNull(roundVolumeList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
// flaky:         yourWood0.addWood((double) 10, 10);
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList6 = yourWood0.getWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList7 = yourWood0.getWood();
        yourWood0.diameterFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList1);
        org.junit.Assert.assertNotNull(roundVolumeList6);
        org.junit.Assert.assertNotNull(roundVolumeList7);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (byte) 100, 0, (double) 0.0f);
        int int4 = roundVolume3.getDiameter();
        roundVolume3.setVolume((double) (short) 0);
        roundVolume3.setLength((double) 100L);
        java.lang.String str9 = roundVolume3.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str9, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
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
        double double33 = roundVolume15.getLength();
        double double34 = roundVolume15.getVolume();
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
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 1.0d + "'", double33 == 1.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 10.0d + "'", double34 == 10.0d);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((-1.0d), (int) (short) 100, 1.0d);
        roundVolume3.setDiameter(0);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
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
        java.util.ArrayList<logic.RoundVolume> roundVolumeList62 = yourWood56.getWood();
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
        org.junit.Assert.assertNotNull(roundVolumeList62);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (byte) 100, 0, (double) 0.0f);
        double double4 = roundVolume3.getVolume();
        logic.RoundVolume roundVolume8 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume8.setLength((double) (-1.0f));
        java.lang.String str11 = roundVolume8.toString();
        roundVolume8.setLength(100.0d);
        roundVolume8.setLength((double) 100L);
        roundVolume8.setVolume((double) (short) -1);
        logic.RoundVolume roundVolume21 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume21.setLength((double) (-1.0f));
        java.lang.String str24 = roundVolume21.toString();
        double double25 = roundVolume21.getVolume();
        java.lang.String str26 = roundVolume21.toString();
        boolean boolean27 = roundVolume8.equals((java.lang.Object) roundVolume21);
        boolean boolean28 = roundVolume3.equals((java.lang.Object) boolean27);
        roundVolume3.setDiameter((int) (byte) 10);
        double double31 = roundVolume3.getVolume();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str11, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str24, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str26, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 0.0d + "'", double31 == 0.0d);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume(32.0d, (int) '#', (double) (byte) -1);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        logic.RoundVolume roundVolume0 = new logic.RoundVolume();
        double double1 = roundVolume0.getVolume();
        logic.YourWood yourWood2 = new logic.YourWood();
        yourWood2.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList4 = yourWood2.getWood();
        boolean boolean5 = roundVolume0.canEqual((java.lang.Object) yourWood2);
        roundVolume0.setLength((double) 100L);
        boolean boolean9 = roundVolume0.equals((java.lang.Object) "RoundVolume(length=100.0, diameter=1, volume=0.0)");
        double double10 = roundVolume0.getVolume();
        roundVolume0.setLength((double) (short) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roundVolumeList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
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
        double double17 = roundVolume3.getVolume();
        logic.RoundVolume roundVolume18 = new logic.RoundVolume();
        double double19 = roundVolume18.getVolume();
        boolean boolean20 = roundVolume3.equals((java.lang.Object) double19);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str11, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertNotNull(roundVolumeList15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setVolume(0.0d);
        roundVolume3.setDiameter((int) (short) 0);
        java.lang.String str13 = roundVolume3.toString();
        int int14 = roundVolume3.getDiameter();
        boolean boolean16 = roundVolume3.equals((java.lang.Object) "RoundVolume(length=100.0, diameter=-1, volume=10.0)");
        logic.RoundVolume roundVolume20 = new logic.RoundVolume((double) (short) 100, 10, (double) (byte) 100);
        logic.RoundVolume roundVolume24 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume24.setLength((double) (-1.0f));
        java.lang.String str27 = roundVolume24.toString();
        roundVolume24.setLength(100.0d);
        roundVolume24.setDiameter((int) (byte) 0);
        roundVolume24.setDiameter((int) (byte) 10);
        boolean boolean34 = roundVolume20.canEqual((java.lang.Object) (byte) 10);
        java.lang.String str35 = roundVolume20.toString();
        boolean boolean36 = roundVolume3.canEqual((java.lang.Object) str35);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str13, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str27, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "RoundVolume(length=100.0, diameter=10, volume=100.0)" + "'", str35, "RoundVolume(length=100.0, diameter=10, volume=100.0)");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        logic.YourWood yourWood0 = new logic.YourWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList4 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList4);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (short) 1, (int) (short) 100, (double) 0L);
        logic.RoundVolume roundVolume7 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume7.setDiameter((int) (byte) 10);
        java.lang.Object obj10 = null;
        boolean boolean11 = roundVolume7.canEqual(obj10);
        int int12 = roundVolume7.getDiameter();
        boolean boolean13 = roundVolume3.equals((java.lang.Object) roundVolume7);
        roundVolume3.setLength(1.0d);
        logic.RoundVolume roundVolume19 = new logic.RoundVolume((double) (byte) 100, 0, (double) 0.0f);
        double double20 = roundVolume19.getLength();
        boolean boolean21 = roundVolume3.canEqual((java.lang.Object) roundVolume19);
        roundVolume3.setVolume((double) 10L);
        roundVolume3.setLength((double) 0.0f);
        java.lang.String str26 = roundVolume3.toString();
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "RoundVolume(length=0.0, diameter=100, volume=10.0)" + "'", str26, "RoundVolume(length=0.0, diameter=100, volume=10.0)");
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        boolean boolean10 = roundVolume3.equals((java.lang.Object) 0.0f);
        double double11 = roundVolume3.getVolume();
        double double12 = roundVolume3.getVolume();
        roundVolume3.setDiameter((int) (byte) 1);
        roundVolume3.setLength((double) 32);
        roundVolume3.setDiameter((int) (short) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
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
        roundVolume0.setLength(32.0d);
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
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setVolume(0.0d);
        int int11 = roundVolume3.getDiameter();
        logic.YourWood yourWood12 = new logic.YourWood();
        yourWood12.diameterFirstSortWood();
        yourWood12.diameterFirstSortWood();
        boolean boolean15 = roundVolume3.equals((java.lang.Object) yourWood12);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
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
        int int13 = roundVolume3.getDiameter();
        logic.RoundVolume roundVolume17 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume17.setLength((double) (-1.0f));
        java.lang.String str20 = roundVolume17.toString();
        roundVolume17.setLength(100.0d);
        roundVolume17.setVolume(0.0d);
        roundVolume17.setDiameter((int) (short) 0);
        int int27 = roundVolume17.getDiameter();
        logic.YourWood yourWood28 = new logic.YourWood();
        yourWood28.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList30 = yourWood28.getWood();
        yourWood28.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList32 = yourWood28.getWood();
// flaky:         yourWood28.addWood((double) 1L, (int) (short) 100);
        boolean boolean36 = roundVolume17.equals((java.lang.Object) (short) 100);
        double double37 = roundVolume17.getLength();
        boolean boolean38 = roundVolume3.canEqual((java.lang.Object) roundVolume17);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertNotNull(roundVolumeList8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RoundVolume(length=0.0, diameter=0, volume=0.0)" + "'", str10, "RoundVolume(length=0.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str20, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(roundVolumeList30);
        org.junit.Assert.assertNotNull(roundVolumeList32);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 100.0d + "'", double37 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
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
        logic.RoundVolume roundVolume26 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume26.setDiameter((int) (byte) 10);
        java.lang.Object obj29 = null;
        boolean boolean30 = roundVolume26.canEqual(obj29);
        boolean boolean32 = roundVolume26.canEqual((java.lang.Object) 10L);
        java.lang.String str33 = roundVolume26.toString();
        boolean boolean34 = roundVolume0.equals((java.lang.Object) str33);
        roundVolume0.setDiameter((int) (byte) 0);
        java.lang.String str37 = roundVolume0.toString();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str8, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "RoundVolume(length=100.0, diameter=10, volume=10.0)" + "'", str33, "RoundVolume(length=100.0, diameter=10, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "RoundVolume(length=0.0, diameter=0, volume=32.0)" + "'", str37, "RoundVolume(length=0.0, diameter=0, volume=32.0)");
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 1, (int) (short) 10, 1.0d);
        java.lang.String str4 = roundVolume3.toString();
        logic.RoundVolume roundVolume8 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume8.setLength((double) (-1.0f));
        java.lang.String str11 = roundVolume8.toString();
        roundVolume8.setLength(100.0d);
        roundVolume8.setVolume(0.0d);
        roundVolume8.setDiameter((int) (short) 0);
        java.lang.String str18 = roundVolume8.toString();
        double double19 = roundVolume8.getVolume();
        logic.RoundVolume roundVolume23 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume23.setLength((double) (-1.0f));
        java.lang.String str26 = roundVolume23.toString();
        double double27 = roundVolume23.getVolume();
        double double28 = roundVolume23.getLength();
        int int29 = roundVolume23.getDiameter();
        java.lang.String str30 = roundVolume23.toString();
        logic.RoundVolume roundVolume34 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume34.setDiameter((int) (byte) 10);
        java.lang.Object obj37 = null;
        boolean boolean38 = roundVolume34.canEqual(obj37);
        boolean boolean40 = roundVolume34.canEqual((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass41 = roundVolume34.getClass();
        boolean boolean42 = roundVolume23.equals((java.lang.Object) wildcardClass41);
        logic.RoundVolume roundVolume46 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume46.setLength((double) (-1.0f));
        java.lang.String str49 = roundVolume46.toString();
        double double50 = roundVolume46.getVolume();
        double double51 = roundVolume46.getLength();
        int int52 = roundVolume46.getDiameter();
        roundVolume46.setVolume((double) (-1));
        roundVolume46.setVolume((double) 10.0f);
        boolean boolean57 = roundVolume23.equals((java.lang.Object) 10.0f);
        boolean boolean58 = roundVolume8.canEqual((java.lang.Object) roundVolume23);
        double double59 = roundVolume23.getVolume();
        java.lang.String str60 = roundVolume23.toString();
        boolean boolean61 = roundVolume3.equals((java.lang.Object) roundVolume23);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RoundVolume(length=1.0, diameter=10, volume=1.0)" + "'", str4, "RoundVolume(length=1.0, diameter=10, volume=1.0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str11, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str18, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str26, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + (-1.0d) + "'", double28 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str30, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(wildcardClass41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str49, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 10.0d + "'", double50 == 10.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + (-1.0d) + "'", double51 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1 + "'", int52 == 1);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 10.0d + "'", double59 == 10.0d);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str60, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 1, (int) 'a', (double) (byte) -1);
        logic.YourWood yourWood4 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList5 = yourWood4.getWood();
        yourWood4.lengthFirstSortWood();
        boolean boolean7 = roundVolume3.equals((java.lang.Object) yourWood4);
        java.lang.String str8 = roundVolume3.toString();
        org.junit.Assert.assertNotNull(roundVolumeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "RoundVolume(length=1.0, diameter=97, volume=-1.0)" + "'", str8, "RoundVolume(length=1.0, diameter=97, volume=-1.0)");
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 1, (int) (byte) 10, (double) (-1L));
        roundVolume3.setLength((double) 0.0f);
        double double6 = roundVolume3.getVolume();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + (-1.0d) + "'", double6 == (-1.0d));
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
// flaky:         yourWood0.addWood((double) 10, 10);
        java.util.ArrayList<logic.RoundVolume> roundVolumeList5 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList7 = yourWood0.getWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.lengthFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList1);
        org.junit.Assert.assertNotNull(roundVolumeList5);
        org.junit.Assert.assertNotNull(roundVolumeList7);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 1, (int) 'a', (double) (byte) -1);
        logic.YourWood yourWood4 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList5 = yourWood4.getWood();
        yourWood4.lengthFirstSortWood();
        boolean boolean7 = roundVolume3.equals((java.lang.Object) yourWood4);
        yourWood4.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList9 = yourWood4.getWood();
        yourWood4.lengthFirstSortWood();
        yourWood4.lengthFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(roundVolumeList9);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 97, 52, (double) 0.0f);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
        yourWood0.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList3 = yourWood0.getWood();
        yourWood0.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList5 = yourWood0.getWood();
        org.junit.Assert.assertNotNull(roundVolumeList1);
        org.junit.Assert.assertNotNull(roundVolumeList3);
        org.junit.Assert.assertNotNull(roundVolumeList5);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
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
        logic.RoundVolume roundVolume22 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume22.setLength((double) (-1.0f));
        java.lang.String str25 = roundVolume22.toString();
        roundVolume22.setLength(100.0d);
        roundVolume22.setVolume(0.0d);
        roundVolume22.setDiameter((int) (short) 0);
        int int32 = roundVolume22.getDiameter();
        logic.RoundVolume roundVolume36 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        logic.RoundVolume roundVolume40 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        boolean boolean41 = roundVolume36.equals((java.lang.Object) (short) 1);
        logic.RoundVolume roundVolume45 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume45.setLength((double) (-1.0f));
        java.lang.String str48 = roundVolume45.toString();
        double double49 = roundVolume45.getVolume();
        double double50 = roundVolume45.getLength();
        boolean boolean52 = roundVolume45.equals((java.lang.Object) 0.0f);
        boolean boolean53 = roundVolume36.equals((java.lang.Object) 0.0f);
        boolean boolean54 = roundVolume22.equals((java.lang.Object) roundVolume36);
        boolean boolean55 = roundVolume3.canEqual((java.lang.Object) roundVolume36);
// flaky:         org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str25, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str48, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 10.0d + "'", double49 == 10.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + (-1.0d) + "'", double50 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
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
        roundVolume15.setVolume((double) 100);
        roundVolume15.setLength((double) 10L);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str11, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str18, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 10.0d + "'", double19 == 10.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str20, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str21, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
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
        roundVolume17.setDiameter(0);
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
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume3.setDiameter((int) (byte) 10);
        roundVolume3.setDiameter((int) (byte) -1);
        boolean boolean9 = roundVolume3.canEqual((java.lang.Object) 1);
        int int10 = roundVolume3.getDiameter();
        roundVolume3.setLength((double) 1.0f);
        logic.RoundVolume roundVolume16 = new logic.RoundVolume((double) (short) 1, (int) (short) 0, (double) 0L);
        boolean boolean17 = roundVolume3.canEqual((java.lang.Object) roundVolume16);
        double double18 = roundVolume16.getVolume();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        roundVolume3.setVolume((double) (-1));
        java.lang.String str12 = roundVolume3.toString();
        java.lang.String str13 = roundVolume3.toString();
        logic.RoundVolume roundVolume17 = new logic.RoundVolume((-1.0d), 1, (double) (short) -1);
        logic.RoundVolume roundVolume21 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume21.setLength((double) (-1.0f));
        java.lang.String str24 = roundVolume21.toString();
        double double25 = roundVolume21.getVolume();
        double double26 = roundVolume21.getLength();
        int int27 = roundVolume21.getDiameter();
        roundVolume21.setDiameter((int) (byte) 100);
        roundVolume21.setDiameter((int) (short) 10);
        logic.RoundVolume roundVolume35 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume35.setLength((double) (-1.0f));
        java.lang.String str38 = roundVolume35.toString();
        roundVolume35.setLength(100.0d);
        roundVolume35.setVolume(0.0d);
        logic.RoundVolume roundVolume46 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume46.setLength((double) 1L);
        boolean boolean49 = roundVolume35.canEqual((java.lang.Object) roundVolume46);
        boolean boolean50 = roundVolume21.canEqual((java.lang.Object) roundVolume35);
        double double51 = roundVolume35.getLength();
        boolean boolean52 = roundVolume17.canEqual((java.lang.Object) double51);
        boolean boolean53 = roundVolume3.canEqual((java.lang.Object) double51);
        int int54 = roundVolume3.getDiameter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=-1.0)" + "'", str12, "RoundVolume(length=-1.0, diameter=1, volume=-1.0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=-1.0)" + "'", str13, "RoundVolume(length=-1.0, diameter=1, volume=-1.0)");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str24, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + (-1.0d) + "'", double26 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str38, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 100.0d + "'", double51 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        double double10 = roundVolume3.getVolume();
        roundVolume3.setLength(0.0d);
        int int13 = roundVolume3.getDiameter();
        int int14 = roundVolume3.getDiameter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
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
        roundVolume3.setDiameter((int) '4');
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
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (-1), (int) ' ', (double) 100);
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
        double double27 = roundVolume7.getVolume();
        logic.YourWood yourWood28 = new logic.YourWood();
        yourWood28.diameterFirstSortWood();
        yourWood28.diameterFirstSortWood();
        boolean boolean31 = roundVolume7.equals((java.lang.Object) yourWood28);
        boolean boolean32 = roundVolume3.equals((java.lang.Object) boolean31);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str10, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str14, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
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
        yourWood0.diameterFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList1);
        org.junit.Assert.assertNotNull(roundVolumeList3);
        org.junit.Assert.assertNotNull(roundVolumeList5);
        org.junit.Assert.assertNotNull(roundVolumeList6);
        org.junit.Assert.assertNotNull(roundVolumeList8);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        boolean boolean10 = roundVolume3.equals((java.lang.Object) 0.0f);
        double double11 = roundVolume3.getVolume();
        double double12 = roundVolume3.getVolume();
        roundVolume3.setVolume((double) 100.0f);
        roundVolume3.setLength((double) ' ');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        logic.RoundVolume roundVolume0 = new logic.RoundVolume();
        double double1 = roundVolume0.getVolume();
        logic.YourWood yourWood2 = new logic.YourWood();
        yourWood2.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList4 = yourWood2.getWood();
        boolean boolean5 = roundVolume0.canEqual((java.lang.Object) yourWood2);
        roundVolume0.setLength((double) 100L);
        boolean boolean9 = roundVolume0.equals((java.lang.Object) "RoundVolume(length=100.0, diameter=1, volume=0.0)");
        roundVolume0.setVolume((double) (byte) -1);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roundVolumeList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setLength((double) 100L);
        java.lang.Object obj11 = null;
        boolean boolean12 = roundVolume3.equals(obj11);
        double double13 = roundVolume3.getLength();
        roundVolume3.setDiameter((int) (byte) 1);
        double double16 = roundVolume3.getVolume();
        roundVolume3.setVolume((double) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 100.0d + "'", double13 == 100.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 10, (int) (short) -1, (double) (byte) 10);
        roundVolume3.setLength((double) 0L);
        int int6 = roundVolume3.getDiameter();
        logic.RoundVolume roundVolume10 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume10.setLength((double) (-1.0f));
        com.fasterxml.jackson.databind.ObjectMapper objectMapper13 = logic.VolumeDB.mapper;
        logic.VolumeDB.mapper = objectMapper13;
        logic.VolumeDB.mapper = objectMapper13;
        logic.VolumeDB.mapper = objectMapper13;
        logic.VolumeDB.mapper = objectMapper13;
        boolean boolean18 = roundVolume10.canEqual((java.lang.Object) objectMapper13);
        logic.RoundVolume roundVolume22 = new logic.RoundVolume((double) 1.0f, (int) 'a', (double) 'a');
        roundVolume22.setLength((double) 1.0f);
        boolean boolean25 = roundVolume10.equals((java.lang.Object) roundVolume22);
        java.lang.Class<?> wildcardClass26 = roundVolume22.getClass();
        boolean boolean27 = roundVolume3.canEqual((java.lang.Object) wildcardClass26);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
// flaky:         org.junit.Assert.assertNull(objectMapper13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (-1), (int) (short) 100, (double) 1);
        java.lang.String str4 = roundVolume3.toString();
        logic.RoundVolume roundVolume8 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume8.setLength((double) (-1.0f));
        com.fasterxml.jackson.databind.ObjectMapper objectMapper11 = logic.VolumeDB.mapper;
        logic.VolumeDB.mapper = objectMapper11;
        logic.VolumeDB.mapper = objectMapper11;
        logic.VolumeDB.mapper = objectMapper11;
        logic.VolumeDB.mapper = objectMapper11;
        boolean boolean16 = roundVolume8.canEqual((java.lang.Object) objectMapper11);
        logic.RoundVolume roundVolume20 = new logic.RoundVolume((double) 1.0f, (int) 'a', (double) 'a');
        roundVolume20.setLength((double) 1.0f);
        boolean boolean23 = roundVolume8.equals((java.lang.Object) roundVolume20);
        boolean boolean24 = roundVolume3.canEqual((java.lang.Object) roundVolume20);
        double double25 = roundVolume20.getLength();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RoundVolume(length=-1.0, diameter=100, volume=1.0)" + "'", str4, "RoundVolume(length=-1.0, diameter=100, volume=1.0)");
// flaky:         org.junit.Assert.assertNull(objectMapper11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 1.0d + "'", double25 == 1.0d);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
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
        roundVolume3.setDiameter(0);
        logic.RoundVolume roundVolume21 = new logic.RoundVolume((double) 10L, 100, (double) (byte) -1);
        java.lang.String str22 = roundVolume21.toString();
        logic.RoundVolume roundVolume26 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume26.setLength((double) (-1.0f));
        java.lang.String str29 = roundVolume26.toString();
        roundVolume26.setLength(100.0d);
        roundVolume26.setLength((double) 100L);
        logic.YourWood yourWood34 = new logic.YourWood();
        yourWood34.lengthFirstSortWood();
        yourWood34.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList37 = yourWood34.getWood();
        boolean boolean38 = roundVolume26.canEqual((java.lang.Object) yourWood34);
        boolean boolean39 = roundVolume21.equals((java.lang.Object) yourWood34);
        yourWood34.diameterFirstSortWood();
        boolean boolean41 = roundVolume3.canEqual((java.lang.Object) yourWood34);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertNotNull(roundVolumeList14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "RoundVolume(length=10.0, diameter=100, volume=-1.0)" + "'", str22, "RoundVolume(length=10.0, diameter=100, volume=-1.0)");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str29, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertNotNull(roundVolumeList37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
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
        logic.YourWood yourWood33 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList34 = yourWood33.getWood();
        yourWood33.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList36 = yourWood33.getWood();
        boolean boolean37 = roundVolume3.canEqual((java.lang.Object) roundVolumeList36);
        java.lang.Class<?> wildcardClass38 = roundVolume3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str20, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(roundVolumeList34);
        org.junit.Assert.assertNotNull(roundVolumeList36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100.0f, (int) (byte) 10, (double) 32);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume3.setDiameter((int) (byte) 10);
        java.lang.Object obj6 = null;
        boolean boolean7 = roundVolume3.canEqual(obj6);
        boolean boolean9 = roundVolume3.canEqual((java.lang.Object) 10L);
        java.lang.String str10 = roundVolume3.toString();
        java.lang.Class<?> wildcardClass11 = roundVolume3.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RoundVolume(length=100.0, diameter=10, volume=10.0)" + "'", str10, "RoundVolume(length=100.0, diameter=10, volume=10.0)");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (short) 100, 10, (double) (byte) 100);
        logic.RoundVolume roundVolume7 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume7.setLength((double) (-1.0f));
        java.lang.String str10 = roundVolume7.toString();
        roundVolume7.setLength(100.0d);
        roundVolume7.setDiameter((int) (byte) 0);
        roundVolume7.setDiameter((int) (byte) 10);
        boolean boolean17 = roundVolume3.canEqual((java.lang.Object) (byte) 10);
        roundVolume3.setDiameter((int) ' ');
        double double20 = roundVolume3.getLength();
        java.lang.Class<?> wildcardClass21 = roundVolume3.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str10, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 100.0d + "'", double20 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        boolean boolean10 = roundVolume3.canEqual((java.lang.Object) (byte) -1);
        roundVolume3.setDiameter(100);
        roundVolume3.setVolume((double) 10.0f);
        roundVolume3.setDiameter((int) (short) 10);
        logic.YourWood yourWood17 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList18 = yourWood17.getWood();
// flaky:         yourWood17.addWood((double) 10, 10);
        java.util.ArrayList<logic.RoundVolume> roundVolumeList22 = yourWood17.getWood();
        yourWood17.diameterFirstSortWood();
        yourWood17.diameterFirstSortWood();
        yourWood17.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList26 = yourWood17.getWood();
        yourWood17.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList28 = yourWood17.getWood();
        boolean boolean29 = roundVolume3.canEqual((java.lang.Object) roundVolumeList28);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(roundVolumeList18);
        org.junit.Assert.assertNotNull(roundVolumeList22);
        org.junit.Assert.assertNotNull(roundVolumeList26);
        org.junit.Assert.assertNotNull(roundVolumeList28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        java.lang.String str7 = roundVolume3.toString();
        double double8 = roundVolume3.getLength();
        java.lang.Object obj9 = null;
        boolean boolean10 = roundVolume3.equals(obj9);
        roundVolume3.setVolume((double) (byte) 0);
        double double13 = roundVolume3.getVolume();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str7, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, 0, (double) 1);
        roundVolume3.setDiameter(100);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
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
        roundVolume3.setVolume((double) (byte) 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((-1.0d), 1, (double) (short) -1);
        logic.RoundVolume roundVolume7 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume7.setLength((double) (-1.0f));
        java.lang.String str10 = roundVolume7.toString();
        double double11 = roundVolume7.getVolume();
        double double12 = roundVolume7.getLength();
        boolean boolean14 = roundVolume7.equals((java.lang.Object) 0.0f);
        double double15 = roundVolume7.getVolume();
        double double16 = roundVolume7.getVolume();
        logic.RoundVolume roundVolume20 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume20.setLength((double) (-1.0f));
        java.lang.String str23 = roundVolume20.toString();
        double double24 = roundVolume20.getVolume();
        double double25 = roundVolume20.getLength();
        int int26 = roundVolume20.getDiameter();
        java.lang.String str27 = roundVolume20.toString();
        logic.RoundVolume roundVolume31 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume31.setDiameter((int) (byte) 10);
        java.lang.Object obj34 = null;
        boolean boolean35 = roundVolume31.canEqual(obj34);
        boolean boolean37 = roundVolume31.canEqual((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass38 = roundVolume31.getClass();
        boolean boolean39 = roundVolume20.equals((java.lang.Object) wildcardClass38);
        int int40 = roundVolume20.getDiameter();
        boolean boolean41 = roundVolume7.equals((java.lang.Object) roundVolume20);
        double double42 = roundVolume20.getVolume();
        boolean boolean43 = roundVolume3.canEqual((java.lang.Object) double42);
        int int44 = roundVolume3.getDiameter();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str10, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str23, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 10.0d + "'", double24 == 10.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + (-1.0d) + "'", double25 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str27, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
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
        double double24 = roundVolume3.getLength();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str13, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 100.0d + "'", double24 == 100.0d);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
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
        logic.RoundVolume roundVolume58 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume58.setLength((double) (-1.0f));
        java.lang.String str61 = roundVolume58.toString();
        double double62 = roundVolume58.getVolume();
        double double63 = roundVolume58.getLength();
        int int64 = roundVolume58.getDiameter();
        logic.RoundVolume roundVolume68 = new logic.RoundVolume((double) (byte) 100, 0, (double) 0.0f);
        boolean boolean69 = roundVolume58.equals((java.lang.Object) 0.0f);
        double double70 = roundVolume58.getLength();
        boolean boolean71 = roundVolume18.equals((java.lang.Object) roundVolume58);
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
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str61, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 10.0d + "'", double62 == 10.0d);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + (-1.0d) + "'", double63 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + (-1.0d) + "'", double70 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100L, (int) ' ', (-1.0d));
        roundVolume3.setLength((double) 0);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        roundVolume3.setVolume((double) 10.0f);
        roundVolume3.setLength((double) (short) 1);
        roundVolume3.setVolume((double) 10);
        logic.RoundVolume roundVolume18 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume18.setLength((double) (-1.0f));
        java.lang.String str21 = roundVolume18.toString();
        roundVolume18.setLength(100.0d);
        roundVolume18.setVolume(0.0d);
        roundVolume18.setDiameter((int) (short) 0);
        int int28 = roundVolume18.getDiameter();
        logic.YourWood yourWood29 = new logic.YourWood();
        yourWood29.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList31 = yourWood29.getWood();
        yourWood29.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList33 = yourWood29.getWood();
// flaky:         yourWood29.addWood((double) 1L, (int) (short) 100);
        boolean boolean37 = roundVolume18.equals((java.lang.Object) (short) 100);
        boolean boolean38 = roundVolume3.canEqual((java.lang.Object) boolean37);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str21, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(roundVolumeList31);
        org.junit.Assert.assertNotNull(roundVolumeList33);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume3.setDiameter((int) (byte) 10);
        roundVolume3.setDiameter((int) (byte) -1);
        boolean boolean9 = roundVolume3.canEqual((java.lang.Object) 1);
        int int10 = roundVolume3.getDiameter();
        roundVolume3.setLength((double) 1.0f);
        logic.RoundVolume roundVolume16 = new logic.RoundVolume((double) (short) 1, (int) (short) 0, (double) 0L);
        boolean boolean17 = roundVolume3.canEqual((java.lang.Object) roundVolume16);
        roundVolume3.setVolume((double) 0.0f);
        int int20 = roundVolume3.getDiameter();
        int int21 = roundVolume3.getDiameter();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        logic.YourWood yourWood0 = new logic.YourWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList5 = yourWood0.getWood();
        org.junit.Assert.assertNotNull(roundVolumeList5);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume3.setDiameter((int) (byte) 10);
        java.lang.String str6 = roundVolume3.toString();
        logic.RoundVolume roundVolume10 = new logic.RoundVolume(0.0d, (-1), (double) (byte) 100);
        double double11 = roundVolume10.getVolume();
        roundVolume10.setVolume((double) (short) 1);
        boolean boolean14 = roundVolume3.canEqual((java.lang.Object) roundVolume10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=100.0, diameter=10, volume=10.0)" + "'", str6, "RoundVolume(length=100.0, diameter=10, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 100.0d + "'", double11 == 100.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100L, 1, (double) 10.0f);
        double double4 = roundVolume3.getLength();
        double double5 = roundVolume3.getVolume();
        int int6 = roundVolume3.getDiameter();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        java.lang.String str7 = roundVolume3.toString();
        double double8 = roundVolume3.getVolume();
        logic.RoundVolume roundVolume12 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume12.setLength((double) (-1.0f));
        java.lang.String str15 = roundVolume12.toString();
        boolean boolean16 = roundVolume3.canEqual((java.lang.Object) str15);
        double double17 = roundVolume3.getLength();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str7, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str15, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + (-1.0d) + "'", double17 == (-1.0d));
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (short) -1, (int) '4', (double) (short) 1);
        roundVolume3.setDiameter(1);
        java.lang.String str6 = roundVolume3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=1.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=1.0)");
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        int int9 = roundVolume3.getDiameter();
        java.lang.String str10 = roundVolume3.toString();
        double double11 = roundVolume3.getVolume();
        double double12 = roundVolume3.getLength();
        roundVolume3.setLength((double) (byte) 0);
        roundVolume3.setDiameter((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str10, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-1.0d) + "'", double12 == (-1.0d));
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume3.setDiameter((int) (byte) 10);
        java.lang.Object obj6 = null;
        boolean boolean7 = roundVolume3.canEqual(obj6);
        int int8 = roundVolume3.getDiameter();
        double double9 = roundVolume3.getVolume();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        logic.RoundVolume roundVolume0 = new logic.RoundVolume();
        double double1 = roundVolume0.getVolume();
        logic.YourWood yourWood2 = new logic.YourWood();
        yourWood2.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList4 = yourWood2.getWood();
        boolean boolean5 = roundVolume0.canEqual((java.lang.Object) yourWood2);
        roundVolume0.setLength(0.0d);
        double double8 = roundVolume0.getLength();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roundVolumeList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
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
        roundVolume24.setLength(100.0d);
        roundVolume24.setVolume(0.0d);
        roundVolume24.setDiameter((int) (short) 0);
        java.lang.String str34 = roundVolume24.toString();
        int int35 = roundVolume24.getDiameter();
        boolean boolean37 = roundVolume24.equals((java.lang.Object) "RoundVolume(length=100.0, diameter=-1, volume=10.0)");
        logic.RoundVolume roundVolume41 = new logic.RoundVolume((double) (byte) 100, 0, (double) 0.0f);
        roundVolume41.setLength((double) (byte) 0);
        boolean boolean44 = roundVolume24.canEqual((java.lang.Object) (byte) 0);
        int int45 = roundVolume24.getDiameter();
        boolean boolean46 = roundVolume5.equals((java.lang.Object) int45);
        double double47 = roundVolume5.getVolume();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str8, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str27, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str34, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 0.0d + "'", double47 == 0.0d);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
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
        roundVolume3.setDiameter((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str8, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
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
        double double42 = roundVolume22.getVolume();
        boolean boolean43 = roundVolume3.canEqual((java.lang.Object) roundVolume22);
        roundVolume22.setDiameter((int) (byte) 1);
// flaky:         org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str25, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + (-1.0d) + "'", double27 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str29, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 1.0f, (int) '#', 100.0d);
        logic.YourWood yourWood4 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList5 = yourWood4.getWood();
// flaky:         yourWood4.addWood((double) 10, 10);
        java.util.ArrayList<logic.RoundVolume> roundVolumeList9 = yourWood4.getWood();
        yourWood4.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList11 = yourWood4.getWood();
        boolean boolean12 = roundVolume3.canEqual((java.lang.Object) roundVolumeList11);
        java.lang.Class<?> wildcardClass13 = roundVolume3.getClass();
        org.junit.Assert.assertNotNull(roundVolumeList5);
        org.junit.Assert.assertNotNull(roundVolumeList9);
        org.junit.Assert.assertNotNull(roundVolumeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        java.lang.String str10 = roundVolume3.toString();
        roundVolume3.setDiameter(10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str10, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
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
        yourWood10.diameterFirstSortWood();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(roundVolumeList11);
        org.junit.Assert.assertNotNull(roundVolumeList13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        logic.YourWood yourWood0 = new logic.YourWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList2 = yourWood0.getWood();
        yourWood0.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList4 = yourWood0.getWood();
// flaky:         yourWood0.addWood((double) 1L, (int) (short) 100);
        java.util.ArrayList<logic.RoundVolume> roundVolumeList8 = yourWood0.getWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList9 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList2);
        org.junit.Assert.assertNotNull(roundVolumeList4);
        org.junit.Assert.assertNotNull(roundVolumeList8);
        org.junit.Assert.assertNotNull(roundVolumeList9);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 10, (int) (short) -1, (double) (byte) 10);
        java.lang.Class<?> wildcardClass4 = roundVolume3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
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
        double double61 = roundVolume58.getVolume();
        roundVolume58.setLength((double) (-1.0f));
        roundVolume58.setVolume(100.0d);
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
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 10.0d + "'", double61 == 10.0d);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
// flaky:         yourWood0.addWood((double) 10, 10);
        yourWood0.lengthFirstSortWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.diameterFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList1);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        int int9 = roundVolume3.getDiameter();
        roundVolume3.setLength((double) (-1));
        roundVolume3.setDiameter((int) '4');
        roundVolume3.setLength((-1.0d));
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        logic.YourWood yourWood0 = new logic.YourWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.lengthFirstSortWood();
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
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
        logic.RoundVolume roundVolume38 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume38.setLength((double) (-1.0f));
        java.lang.String str41 = roundVolume38.toString();
        double double42 = roundVolume38.getVolume();
        double double43 = roundVolume38.getLength();
        boolean boolean45 = roundVolume38.equals((java.lang.Object) 0.0f);
        double double46 = roundVolume38.getVolume();
        double double47 = roundVolume38.getVolume();
        logic.RoundVolume roundVolume51 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume51.setLength((double) (-1.0f));
        java.lang.String str54 = roundVolume51.toString();
        double double55 = roundVolume51.getVolume();
        double double56 = roundVolume51.getLength();
        int int57 = roundVolume51.getDiameter();
        java.lang.String str58 = roundVolume51.toString();
        logic.RoundVolume roundVolume62 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume62.setDiameter((int) (byte) 10);
        java.lang.Object obj65 = null;
        boolean boolean66 = roundVolume62.canEqual(obj65);
        boolean boolean68 = roundVolume62.canEqual((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass69 = roundVolume62.getClass();
        boolean boolean70 = roundVolume51.equals((java.lang.Object) wildcardClass69);
        int int71 = roundVolume51.getDiameter();
        boolean boolean72 = roundVolume38.equals((java.lang.Object) roundVolume51);
        boolean boolean73 = roundVolume14.canEqual((java.lang.Object) boolean72);
        roundVolume14.setVolume((double) (short) 1);
        logic.RoundVolume roundVolume79 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume79.setLength((double) (-1.0f));
        java.lang.String str82 = roundVolume79.toString();
        double double83 = roundVolume79.getVolume();
        double double84 = roundVolume79.getLength();
        int int85 = roundVolume79.getDiameter();
        logic.YourWood yourWood86 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList87 = yourWood86.getWood();
        yourWood86.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList89 = yourWood86.getWood();
        yourWood86.lengthFirstSortWood();
        yourWood86.diameterFirstSortWood();
        boolean boolean92 = roundVolume79.equals((java.lang.Object) yourWood86);
        yourWood86.lengthFirstSortWood();
        boolean boolean94 = roundVolume14.equals((java.lang.Object) yourWood86);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str17, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(roundVolumeList27);
        org.junit.Assert.assertNotNull(roundVolumeList29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str41, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + (-1.0d) + "'", double43 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 10.0d + "'", double46 == 10.0d);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str54, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 10.0d + "'", double55 == 10.0d);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + (-1.0d) + "'", double56 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str58, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(wildcardClass69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1 + "'", int71 == 1);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str82, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double83 + "' != '" + 10.0d + "'", double83 == 10.0d);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + (-1.0d) + "'", double84 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertNotNull(roundVolumeList87);
        org.junit.Assert.assertNotNull(roundVolumeList89);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
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
        boolean boolean24 = roundVolume3.canEqual((java.lang.Object) "RoundVolume(length=0.0, diameter=1, volume=1.0)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(roundVolumeList16);
        org.junit.Assert.assertNotNull(roundVolumeList18);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
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
        int int16 = roundVolume3.getDiameter();
        logic.RoundVolume roundVolume20 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume20.setLength((double) (-1.0f));
        java.lang.String str23 = roundVolume20.toString();
        roundVolume20.setLength(100.0d);
        roundVolume20.setVolume(0.0d);
        logic.RoundVolume roundVolume31 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume31.setLength((double) 1L);
        boolean boolean34 = roundVolume20.canEqual((java.lang.Object) roundVolume31);
        double double35 = roundVolume20.getVolume();
        logic.RoundVolume roundVolume39 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume39.setLength((double) (-1.0f));
        java.lang.String str42 = roundVolume39.toString();
        roundVolume39.setLength(100.0d);
        roundVolume39.setVolume(0.0d);
        roundVolume39.setDiameter((int) (short) 0);
        java.lang.String str49 = roundVolume39.toString();
        double double50 = roundVolume39.getVolume();
        logic.RoundVolume roundVolume54 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume54.setLength((double) (-1.0f));
        java.lang.String str57 = roundVolume54.toString();
        double double58 = roundVolume54.getVolume();
        double double59 = roundVolume54.getLength();
        int int60 = roundVolume54.getDiameter();
        java.lang.String str61 = roundVolume54.toString();
        logic.RoundVolume roundVolume65 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume65.setDiameter((int) (byte) 10);
        java.lang.Object obj68 = null;
        boolean boolean69 = roundVolume65.canEqual(obj68);
        boolean boolean71 = roundVolume65.canEqual((java.lang.Object) 10L);
        java.lang.Class<?> wildcardClass72 = roundVolume65.getClass();
        boolean boolean73 = roundVolume54.equals((java.lang.Object) wildcardClass72);
        logic.RoundVolume roundVolume77 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume77.setLength((double) (-1.0f));
        java.lang.String str80 = roundVolume77.toString();
        double double81 = roundVolume77.getVolume();
        double double82 = roundVolume77.getLength();
        int int83 = roundVolume77.getDiameter();
        roundVolume77.setVolume((double) (-1));
        roundVolume77.setVolume((double) 10.0f);
        boolean boolean88 = roundVolume54.equals((java.lang.Object) 10.0f);
        boolean boolean89 = roundVolume39.canEqual((java.lang.Object) roundVolume54);
        int int90 = roundVolume54.getDiameter();
        double double91 = roundVolume54.getVolume();
        boolean boolean92 = roundVolume20.equals((java.lang.Object) roundVolume54);
        java.lang.String str93 = roundVolume20.toString();
        boolean boolean94 = roundVolume3.equals((java.lang.Object) str93);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=-1.0)" + "'", str15, "RoundVolume(length=-1.0, diameter=1, volume=-1.0)");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str23, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str42, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str49, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 0.0d + "'", double50 == 0.0d);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str57, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double58 + "' != '" + 10.0d + "'", double58 == 10.0d);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + (-1.0d) + "'", double59 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 1 + "'", int60 == 1);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str61, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(wildcardClass72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str80, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 10.0d + "'", double81 == 10.0d);
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + (-1.0d) + "'", double82 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 1 + "'", int83 == 1);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 1 + "'", int90 == 1);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 10.0d + "'", double91 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean92 + "' != '" + false + "'", boolean92 == false);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "RoundVolume(length=100.0, diameter=1, volume=0.0)" + "'", str93, "RoundVolume(length=100.0, diameter=1, volume=0.0)");
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setVolume(0.0d);
        roundVolume3.setDiameter((int) (short) 0);
        java.lang.String str13 = roundVolume3.toString();
        int int14 = roundVolume3.getDiameter();
        roundVolume3.setLength((double) '#');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str13, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume(1.0d, (int) (short) -1, (double) (byte) 10);
        roundVolume3.setDiameter((int) '4');
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setDiameter((int) (byte) 0);
        roundVolume3.setVolume(0.0d);
        java.lang.Class<?> wildcardClass13 = roundVolume3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 1.0f, 100, (double) 10L);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (-1), (int) ' ', (double) 100);
        double double4 = roundVolume3.getVolume();
        java.lang.Class<?> wildcardClass5 = roundVolume3.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (short) 100, 10, (double) (byte) 100);
        double double4 = roundVolume3.getLength();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 100.0d + "'", double4 == 100.0d);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setVolume(0.0d);
        roundVolume3.setDiameter((int) (short) 0);
        int int13 = roundVolume3.getDiameter();
        java.lang.String str14 = roundVolume3.toString();
        logic.RoundVolume roundVolume18 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume18.setLength((double) (-1.0f));
        java.lang.String str21 = roundVolume18.toString();
        roundVolume18.setLength(100.0d);
        roundVolume18.setVolume(0.0d);
        roundVolume18.setDiameter((int) (short) 0);
        java.lang.String str28 = roundVolume18.toString();
        int int29 = roundVolume18.getDiameter();
        logic.YourWood yourWood30 = new logic.YourWood();
        yourWood30.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList32 = yourWood30.getWood();
        boolean boolean33 = roundVolume18.equals((java.lang.Object) roundVolumeList32);
        boolean boolean34 = roundVolume3.canEqual((java.lang.Object) roundVolume18);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str14, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str21, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str28, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(roundVolumeList32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        roundVolume3.setVolume((double) 10.0f);
        double double11 = roundVolume3.getVolume();
        roundVolume3.setLength((double) (short) 0);
        logic.RoundVolume roundVolume17 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume17.setLength((double) (-1.0f));
        java.lang.String str20 = roundVolume17.toString();
        double double21 = roundVolume17.getVolume();
        double double22 = roundVolume17.getLength();
        boolean boolean24 = roundVolume17.equals((java.lang.Object) 0.0f);
        double double25 = roundVolume17.getVolume();
        double double26 = roundVolume17.getVolume();
        roundVolume17.setVolume((double) 100.0f);
        boolean boolean29 = roundVolume3.canEqual((java.lang.Object) roundVolume17);
        roundVolume3.setVolume((double) 0.0f);
        int int32 = roundVolume3.getDiameter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str20, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 10.0d + "'", double21 == 10.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + (-1.0d) + "'", double22 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 10.0d + "'", double25 == 10.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 10.0d + "'", double26 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (-1), (int) (short) 100, (double) 1);
        int int4 = roundVolume3.getDiameter();
        double double5 = roundVolume3.getVolume();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setVolume((double) (short) 1);
        roundVolume3.setLength(1.0d);
        double double8 = roundVolume3.getVolume();
        java.lang.String str9 = roundVolume3.toString();
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "RoundVolume(length=1.0, diameter=1, volume=1.0)" + "'", str9, "RoundVolume(length=1.0, diameter=1, volume=1.0)");
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        roundVolume3.setLength(100.0d);
        roundVolume3.setDiameter((int) (byte) 0);
        java.lang.String str11 = roundVolume3.toString();
        roundVolume3.setDiameter((int) (byte) -1);
        int int14 = roundVolume3.getDiameter();
        double double15 = roundVolume3.getLength();
        logic.YourWood yourWood16 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList17 = yourWood16.getWood();
        yourWood16.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList19 = yourWood16.getWood();
        boolean boolean20 = roundVolume3.equals((java.lang.Object) roundVolumeList19);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=10.0)" + "'", str11, "RoundVolume(length=100.0, diameter=0, volume=10.0)");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 100.0d + "'", double15 == 100.0d);
        org.junit.Assert.assertNotNull(roundVolumeList17);
        org.junit.Assert.assertNotNull(roundVolumeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
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
        logic.RoundVolume roundVolume35 = new logic.RoundVolume();
        double double36 = roundVolume35.getVolume();
        logic.RoundVolume roundVolume40 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume40.setLength((double) (-1.0f));
        java.lang.String str43 = roundVolume40.toString();
        roundVolume40.setLength(100.0d);
        roundVolume40.setVolume(0.0d);
        logic.RoundVolume roundVolume51 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume51.setLength((double) 1L);
        boolean boolean54 = roundVolume40.canEqual((java.lang.Object) roundVolume51);
        boolean boolean55 = roundVolume35.canEqual((java.lang.Object) roundVolume40);
        logic.RoundVolume roundVolume59 = new logic.RoundVolume((double) 1.0f, (int) 'a', (double) 'a');
        roundVolume59.setLength((double) 1.0f);
        double double62 = roundVolume59.getLength();
        java.lang.String str63 = roundVolume59.toString();
        boolean boolean64 = roundVolume40.canEqual((java.lang.Object) roundVolume59);
        boolean boolean65 = roundVolume3.equals((java.lang.Object) roundVolume40);
        roundVolume40.setVolume((double) '4');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str17, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(roundVolumeList27);
        org.junit.Assert.assertNotNull(roundVolumeList29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 0.0d + "'", double36 == 0.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str43, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 1.0d + "'", double62 == 1.0d);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "RoundVolume(length=1.0, diameter=97, volume=97.0)" + "'", str63, "RoundVolume(length=1.0, diameter=97, volume=97.0)");
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (byte) 100, 0, (double) 0.0f);
        roundVolume3.setLength((double) (byte) 0);
        double double6 = roundVolume3.getLength();
        java.lang.String str7 = roundVolume3.toString();
        roundVolume3.setDiameter((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "RoundVolume(length=0.0, diameter=0, volume=0.0)" + "'", str7, "RoundVolume(length=0.0, diameter=0, volume=0.0)");
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
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
        double double21 = roundVolume5.getVolume();
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str8, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
// flaky:         yourWood0.addWood((double) 10, 10);
        java.util.ArrayList<logic.RoundVolume> roundVolumeList5 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.diameterFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList1);
        org.junit.Assert.assertNotNull(roundVolumeList5);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume(97.0d, 10, (double) 100);
        roundVolume3.setLength(1.0d);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume(0.0d, (-1), (double) (byte) 100);
        roundVolume3.setVolume((double) (byte) -1);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        double double6 = roundVolume3.getVolume();
        double double7 = roundVolume3.getLength();
        int int8 = roundVolume3.getDiameter();
        double double9 = roundVolume3.getLength();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + (-1.0d) + "'", double9 == (-1.0d));
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
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
        roundVolume15.setDiameter((int) '4');
// flaky:         org.junit.Assert.assertNull(objectMapper6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) (short) 1, (int) (byte) 0, (double) (-1.0f));
        java.lang.String str4 = roundVolume3.toString();
        roundVolume3.setVolume((double) (byte) 0);
        logic.RoundVolume roundVolume10 = new logic.RoundVolume((double) 1.0f, (int) 'a', (double) 'a');
        roundVolume10.setLength((double) 1.0f);
        boolean boolean13 = roundVolume3.canEqual((java.lang.Object) 1.0f);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RoundVolume(length=1.0, diameter=0, volume=-1.0)" + "'", str4, "RoundVolume(length=1.0, diameter=0, volume=-1.0)");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume3.setDiameter((int) (byte) 10);
        java.lang.String str6 = roundVolume3.toString();
        int int7 = roundVolume3.getDiameter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=100.0, diameter=10, volume=10.0)" + "'", str6, "RoundVolume(length=100.0, diameter=10, volume=10.0)");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        java.lang.String str4 = roundVolume3.toString();
        roundVolume3.setLength((-1.0d));
        logic.RoundVolume roundVolume10 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume10.setLength((double) (-1.0f));
        java.lang.String str13 = roundVolume10.toString();
        double double14 = roundVolume10.getVolume();
        double double15 = roundVolume10.getLength();
        roundVolume10.setVolume((double) 10.0f);
        double double18 = roundVolume10.getVolume();
        roundVolume10.setLength((double) (short) 0);
        logic.RoundVolume roundVolume24 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume24.setLength((double) (-1.0f));
        double double27 = roundVolume24.getVolume();
        boolean boolean28 = roundVolume10.canEqual((java.lang.Object) double27);
        boolean boolean29 = roundVolume3.equals((java.lang.Object) roundVolume10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RoundVolume(length=0.0, diameter=1, volume=10.0)" + "'", str4, "RoundVolume(length=0.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str13, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 10.0d + "'", double14 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 10.0d + "'", double18 == 10.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 10.0d + "'", double27 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume3.setDiameter((int) (byte) 10);
        java.lang.Object obj6 = null;
        boolean boolean7 = roundVolume3.canEqual(obj6);
        boolean boolean9 = roundVolume3.canEqual((java.lang.Object) 10L);
        roundVolume3.setLength((double) 97);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
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
        logic.RoundVolume roundVolume33 = new logic.RoundVolume();
        double double34 = roundVolume33.getVolume();
        double double35 = roundVolume33.getVolume();
        logic.RoundVolume roundVolume39 = new logic.RoundVolume((double) 0.0f, 10, (-1.0d));
        java.lang.Class<?> wildcardClass40 = roundVolume39.getClass();
        boolean boolean41 = roundVolume33.canEqual((java.lang.Object) wildcardClass40);
        logic.RoundVolume roundVolume45 = new logic.RoundVolume((double) 1, (int) 'a', (double) (byte) -1);
        logic.YourWood yourWood46 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList47 = yourWood46.getWood();
        yourWood46.lengthFirstSortWood();
        boolean boolean49 = roundVolume45.equals((java.lang.Object) yourWood46);
        yourWood46.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList51 = yourWood46.getWood();
        boolean boolean52 = roundVolume33.canEqual((java.lang.Object) roundVolumeList51);
        boolean boolean53 = roundVolume15.equals((java.lang.Object) boolean52);
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
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 0.0d + "'", double34 == 0.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 0.0d + "'", double35 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(roundVolumeList47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(roundVolumeList51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume(100.0d, (int) (byte) -1, (double) 100.0f);
        roundVolume3.setLength((double) 10);
        double double6 = roundVolume3.getVolume();
        int int7 = roundVolume3.getDiameter();
        double double8 = roundVolume3.getVolume();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 100.0d + "'", double6 == 100.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 100.0d + "'", double8 == 100.0d);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 52, 32, (double) (byte) 0);
        roundVolume3.setLength(97.0d);
        logic.RoundVolume roundVolume6 = new logic.RoundVolume();
        double double7 = roundVolume6.getVolume();
        logic.YourWood yourWood8 = new logic.YourWood();
        yourWood8.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList10 = yourWood8.getWood();
        boolean boolean11 = roundVolume6.canEqual((java.lang.Object) yourWood8);
        roundVolume6.setLength((double) 100L);
        boolean boolean15 = roundVolume6.equals((java.lang.Object) "RoundVolume(length=100.0, diameter=1, volume=0.0)");
        double double16 = roundVolume6.getVolume();
        boolean boolean17 = roundVolume3.equals((java.lang.Object) double16);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertNotNull(roundVolumeList10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume(100.0d, (int) ' ', (double) (short) 100);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        logic.RoundVolume roundVolume0 = new logic.RoundVolume();
        double double1 = roundVolume0.getVolume();
        logic.YourWood yourWood2 = new logic.YourWood();
        yourWood2.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList4 = yourWood2.getWood();
        boolean boolean5 = roundVolume0.canEqual((java.lang.Object) yourWood2);
        roundVolume0.setLength((double) 100L);
        roundVolume0.setLength((double) (byte) 10);
        double double10 = roundVolume0.getLength();
        roundVolume0.setDiameter(0);
        logic.RoundVolume roundVolume16 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume16.setLength((double) (-1.0f));
        java.lang.String str19 = roundVolume16.toString();
        double double20 = roundVolume16.getVolume();
        double double21 = roundVolume16.getLength();
        int int22 = roundVolume16.getDiameter();
        roundVolume16.setVolume((double) (-1));
        roundVolume16.setVolume((double) 10.0f);
        logic.RoundVolume roundVolume30 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume30.setLength((double) (-1.0f));
        java.lang.String str33 = roundVolume30.toString();
        roundVolume30.setLength(100.0d);
        roundVolume30.setDiameter((int) (byte) 0);
        java.lang.Class<?> wildcardClass38 = roundVolume30.getClass();
        boolean boolean39 = roundVolume16.equals((java.lang.Object) wildcardClass38);
        boolean boolean40 = roundVolume0.canEqual((java.lang.Object) roundVolume16);
        roundVolume16.setVolume(10.0d);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roundVolumeList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 10.0d + "'", double10 == 10.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str19, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 10.0d + "'", double20 == 10.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str33, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertNotNull(wildcardClass38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
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
        logic.RoundVolume roundVolume42 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume42.setLength((double) (-1.0f));
        double double45 = roundVolume42.getVolume();
        boolean boolean46 = roundVolume3.equals((java.lang.Object) double45);
        int int47 = roundVolume3.getDiameter();
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
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 10.0d + "'", double45 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
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
        java.lang.String str22 = roundVolume3.toString();
        roundVolume3.setLength((double) (byte) 10);
        logic.YourWood yourWood25 = new logic.YourWood();
        yourWood25.diameterFirstSortWood();
        yourWood25.diameterFirstSortWood();
        yourWood25.lengthFirstSortWood();
        yourWood25.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList30 = yourWood25.getWood();
        boolean boolean31 = roundVolume3.equals((java.lang.Object) roundVolumeList30);
        logic.RoundVolume roundVolume35 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume35.setLength((double) (-1.0f));
        java.lang.String str38 = roundVolume35.toString();
        double double39 = roundVolume35.getVolume();
        double double40 = roundVolume35.getLength();
        roundVolume35.setVolume((double) 10.0f);
        double double43 = roundVolume35.getVolume();
        roundVolume35.setLength((double) (short) 0);
        java.lang.String str46 = roundVolume35.toString();
        boolean boolean47 = roundVolume3.equals((java.lang.Object) roundVolume35);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RoundVolume(length=10.0, diameter=100, volume=-1.0)" + "'", str4, "RoundVolume(length=10.0, diameter=100, volume=-1.0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str11, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertNotNull(roundVolumeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "RoundVolume(length=10.0, diameter=100, volume=-1.0)" + "'", str22, "RoundVolume(length=10.0, diameter=100, volume=-1.0)");
        org.junit.Assert.assertNotNull(roundVolumeList30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str38, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 10.0d + "'", double39 == 10.0d);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + (-1.0d) + "'", double40 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 10.0d + "'", double43 == 10.0d);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "RoundVolume(length=0.0, diameter=1, volume=10.0)" + "'", str46, "RoundVolume(length=0.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        boolean boolean10 = roundVolume3.canEqual((java.lang.Object) (byte) -1);
        roundVolume3.setDiameter(100);
        roundVolume3.setDiameter(1);
        roundVolume3.setLength((double) (short) 0);
        int int17 = roundVolume3.getDiameter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
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
        roundVolume3.setVolume((double) (byte) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str8, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
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
        java.lang.String str22 = roundVolume3.toString();
        roundVolume3.setLength((double) (byte) 10);
        java.lang.String str25 = roundVolume3.toString();
        java.lang.Class<?> wildcardClass26 = roundVolume3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "RoundVolume(length=10.0, diameter=100, volume=-1.0)" + "'", str4, "RoundVolume(length=10.0, diameter=100, volume=-1.0)");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str11, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertNotNull(roundVolumeList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "RoundVolume(length=10.0, diameter=100, volume=-1.0)" + "'", str22, "RoundVolume(length=10.0, diameter=100, volume=-1.0)");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "RoundVolume(length=10.0, diameter=100, volume=-1.0)" + "'", str25, "RoundVolume(length=10.0, diameter=100, volume=-1.0)");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
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
        java.lang.String str51 = roundVolume3.toString();
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
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "RoundVolume(length=100.0, diameter=10, volume=10.0)" + "'", str51, "RoundVolume(length=100.0, diameter=10, volume=10.0)");
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
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
        double double93 = roundVolume78.getLength();
        roundVolume78.setLength((double) 32);
        roundVolume78.setLength((double) 32);
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
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + (-1.0d) + "'", double93 == (-1.0d));
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList3 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
// flaky:         yourWood0.addWood((double) 1L, (int) (byte) 100);
        java.util.ArrayList<logic.RoundVolume> roundVolumeList8 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.diameterFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList1);
        org.junit.Assert.assertNotNull(roundVolumeList3);
        org.junit.Assert.assertNotNull(roundVolumeList8);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        boolean boolean10 = roundVolume3.equals((java.lang.Object) 0.0f);
        double double11 = roundVolume3.getVolume();
        java.lang.String str12 = roundVolume3.toString();
        logic.RoundVolume roundVolume16 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume16.setDiameter((int) (byte) 10);
        roundVolume16.setDiameter((int) (byte) -1);
        roundVolume16.setVolume(10.0d);
        roundVolume16.setLength((double) (short) 1);
        boolean boolean25 = roundVolume3.canEqual((java.lang.Object) roundVolume16);
        double double26 = roundVolume16.getLength();
        double double27 = roundVolume16.getLength();
        roundVolume16.setDiameter((int) (byte) 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str12, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 1.0d + "'", double26 == 1.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 1.0d + "'", double27 == 1.0d);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
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
        java.util.ArrayList<logic.RoundVolume> roundVolumeList41 = yourWood33.getWood();
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
        org.junit.Assert.assertNotNull(roundVolumeList41);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 10, (int) (short) -1, (double) (byte) 10);
        roundVolume3.setLength(0.0d);
        roundVolume3.setDiameter((int) (byte) 0);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0L, (int) '#', 10.0d);
        double double4 = roundVolume3.getVolume();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 10.0d + "'", double4 == 10.0d);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList3 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
// flaky:         yourWood0.addWood((double) 1L, (int) (byte) 100);
        java.util.ArrayList<logic.RoundVolume> roundVolumeList8 = yourWood0.getWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList9 = yourWood0.getWood();
        yourWood0.diameterFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList11 = yourWood0.getWood();
        org.junit.Assert.assertNotNull(roundVolumeList1);
        org.junit.Assert.assertNotNull(roundVolumeList3);
        org.junit.Assert.assertNotNull(roundVolumeList8);
        org.junit.Assert.assertNotNull(roundVolumeList9);
        org.junit.Assert.assertNotNull(roundVolumeList11);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        roundVolume3.setVolume((double) 10.0f);
        double double11 = roundVolume3.getVolume();
        double double12 = roundVolume3.getVolume();
        roundVolume3.setDiameter(1);
        double double15 = roundVolume3.getVolume();
        double double16 = roundVolume3.getVolume();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 10.0d + "'", double16 == 10.0d);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
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
        java.lang.String str20 = roundVolume3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 10.0d + "'", double17 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "RoundVolume(length=-1.0, diameter=52, volume=10.0)" + "'", str20, "RoundVolume(length=-1.0, diameter=52, volume=10.0)");
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
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
        double double44 = roundVolume28.getLength();
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
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 10.0d + "'", double44 == 10.0d);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        java.lang.String str7 = roundVolume3.toString();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        java.lang.Class<?> wildcardClass10 = roundVolume3.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str7, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList3 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList5 = yourWood0.getWood();
        yourWood0.diameterFirstSortWood();
        org.junit.Assert.assertNotNull(roundVolumeList1);
        org.junit.Assert.assertNotNull(roundVolumeList3);
        org.junit.Assert.assertNotNull(roundVolumeList5);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        logic.RoundVolume roundVolume0 = new logic.RoundVolume();
        logic.YourWood yourWood1 = new logic.YourWood();
        yourWood1.diameterFirstSortWood();
        yourWood1.diameterFirstSortWood();
        yourWood1.lengthFirstSortWood();
        yourWood1.lengthFirstSortWood();
        boolean boolean6 = roundVolume0.equals((java.lang.Object) yourWood1);
        logic.RoundVolume roundVolume10 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume10.setLength((double) (-1.0f));
        java.lang.String str13 = roundVolume10.toString();
        roundVolume10.setLength(100.0d);
        roundVolume10.setVolume(0.0d);
        roundVolume10.setDiameter((int) (short) 0);
        java.lang.String str20 = roundVolume10.toString();
        int int21 = roundVolume10.getDiameter();
        boolean boolean23 = roundVolume10.equals((java.lang.Object) "RoundVolume(length=100.0, diameter=-1, volume=10.0)");
        boolean boolean24 = roundVolume0.equals((java.lang.Object) boolean23);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str13, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "RoundVolume(length=100.0, diameter=0, volume=0.0)" + "'", str20, "RoundVolume(length=100.0, diameter=0, volume=0.0)");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        roundVolume3.setVolume((double) 10.0f);
        double double11 = roundVolume3.getLength();
        roundVolume3.setDiameter((int) (short) 100);
        roundVolume3.setDiameter(97);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getVolume();
        boolean boolean10 = roundVolume3.equals((java.lang.Object) "");
        double double11 = roundVolume3.getLength();
        roundVolume3.setLength((double) (byte) 100);
        roundVolume3.setDiameter((int) 'a');
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + (-1.0d) + "'", double11 == (-1.0d));
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        int int9 = roundVolume3.getDiameter();
        roundVolume3.setDiameter((int) (byte) 100);
        roundVolume3.setDiameter((int) (short) 10);
        roundVolume3.setDiameter((int) (short) 1);
        double double16 = roundVolume3.getLength();
        roundVolume3.setDiameter(1);
        roundVolume3.setDiameter(0);
        int int21 = roundVolume3.getDiameter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((-1.0d), (int) (byte) 1, (double) 10);
        java.lang.Class<?> wildcardClass4 = roundVolume3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
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
        int int23 = roundVolume3.getDiameter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(roundVolumeList16);
        org.junit.Assert.assertNotNull(roundVolumeList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        double double6 = roundVolume3.getVolume();
        java.lang.String str7 = roundVolume3.toString();
        logic.RoundVolume roundVolume11 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume11.setLength((double) (-1.0f));
        java.lang.String str14 = roundVolume11.toString();
        double double15 = roundVolume11.getVolume();
        double double16 = roundVolume11.getLength();
        int int17 = roundVolume11.getDiameter();
        roundVolume11.setDiameter((int) (byte) 100);
        double double20 = roundVolume11.getLength();
        logic.RoundVolume roundVolume21 = new logic.RoundVolume();
        double double22 = roundVolume21.getVolume();
        logic.YourWood yourWood23 = new logic.YourWood();
        yourWood23.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList25 = yourWood23.getWood();
        boolean boolean26 = roundVolume21.canEqual((java.lang.Object) yourWood23);
        roundVolume21.setLength((double) 100L);
        boolean boolean29 = roundVolume11.canEqual((java.lang.Object) 100L);
        boolean boolean30 = roundVolume3.equals((java.lang.Object) 100L);
        logic.YourWood yourWood31 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList32 = yourWood31.getWood();
// flaky:         yourWood31.addWood((double) 10, 10);
        java.util.ArrayList<logic.RoundVolume> roundVolumeList36 = yourWood31.getWood();
        yourWood31.diameterFirstSortWood();
        yourWood31.diameterFirstSortWood();
        yourWood31.diameterFirstSortWood();
        boolean boolean40 = roundVolume3.canEqual((java.lang.Object) yourWood31);
        logic.RoundVolume roundVolume44 = new logic.RoundVolume((double) (short) 0, (-1), (double) (byte) 0);
        double double45 = roundVolume44.getVolume();
        boolean boolean46 = roundVolume3.canEqual((java.lang.Object) double45);
        roundVolume3.setDiameter((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str7, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str14, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 10.0d + "'", double15 == 10.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + (-1.0d) + "'", double16 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertNotNull(roundVolumeList25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(roundVolumeList32);
        org.junit.Assert.assertNotNull(roundVolumeList36);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 0.0d + "'", double45 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 1, (int) 'a', (double) (byte) -1);
        logic.RoundVolume roundVolume7 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume7.setLength((double) (-1.0f));
        java.lang.String str10 = roundVolume7.toString();
        double double11 = roundVolume7.getVolume();
        double double12 = roundVolume7.getVolume();
        java.lang.Class<?> wildcardClass13 = roundVolume7.getClass();
        boolean boolean14 = roundVolume3.canEqual((java.lang.Object) roundVolume7);
        double double15 = roundVolume3.getLength();
        logic.RoundVolume roundVolume19 = new logic.RoundVolume((double) 1, (int) 'a', (double) (byte) -1);
        double double20 = roundVolume19.getVolume();
        double double21 = roundVolume19.getVolume();
        java.lang.String str22 = roundVolume19.toString();
        boolean boolean23 = roundVolume3.canEqual((java.lang.Object) roundVolume19);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str10, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 1.0d + "'", double15 == 1.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + (-1.0d) + "'", double20 == (-1.0d));
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + (-1.0d) + "'", double21 == (-1.0d));
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "RoundVolume(length=1.0, diameter=97, volume=-1.0)" + "'", str22, "RoundVolume(length=1.0, diameter=97, volume=-1.0)");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
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
        logic.YourWood yourWood23 = new logic.YourWood();
        yourWood23.diameterFirstSortWood();
        yourWood23.diameterFirstSortWood();
        yourWood23.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList27 = yourWood23.getWood();
        yourWood23.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList29 = yourWood23.getWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList30 = yourWood23.getWood();
        boolean boolean31 = roundVolume3.equals((java.lang.Object) yourWood23);
        double double32 = roundVolume3.getVolume();
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 10.0d + "'", double6 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertNotNull(roundVolumeList11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(roundVolumeList15);
        org.junit.Assert.assertNotNull(roundVolumeList17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(roundVolumeList27);
        org.junit.Assert.assertNotNull(roundVolumeList29);
        org.junit.Assert.assertNotNull(roundVolumeList30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 10.0d + "'", double32 == 10.0d);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 10L, 10, 0.0d);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 97, (int) 'a', (double) (-1.0f));
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume(32.0d, (int) (short) 100, 1.0d);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
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
        java.lang.Class<?> wildcardClass25 = roundVolume17.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(roundVolumeList19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume3.setDiameter((int) (byte) 10);
        roundVolume3.setDiameter((int) (byte) -1);
        roundVolume3.setVolume((double) 10);
        double double10 = roundVolume3.getLength();
        java.lang.String str11 = roundVolume3.toString();
        logic.RoundVolume roundVolume15 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume15.setDiameter((int) (byte) 10);
        java.lang.Object obj18 = null;
        boolean boolean19 = roundVolume15.canEqual(obj18);
        int int20 = roundVolume15.getDiameter();
        java.lang.String str21 = roundVolume15.toString();
        boolean boolean22 = roundVolume3.canEqual((java.lang.Object) roundVolume15);
        roundVolume3.setLength((double) 10L);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 100.0d + "'", double10 == 100.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "RoundVolume(length=100.0, diameter=-1, volume=10.0)" + "'", str11, "RoundVolume(length=100.0, diameter=-1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "RoundVolume(length=100.0, diameter=10, volume=10.0)" + "'", str21, "RoundVolume(length=100.0, diameter=10, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 1, (int) (byte) 10, (double) (-1L));
        roundVolume3.setLength((double) 0.0f);
        roundVolume3.setLength((double) 1);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
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
        int int35 = roundVolume3.getDiameter();
        logic.RoundVolume roundVolume39 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume39.setLength((double) 1L);
        double double42 = roundVolume39.getLength();
        boolean boolean43 = roundVolume3.canEqual((java.lang.Object) roundVolume39);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str17, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(roundVolumeList27);
        org.junit.Assert.assertNotNull(roundVolumeList29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 1.0d + "'", double42 == 1.0d);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getVolume();
        double double8 = roundVolume3.getLength();
        boolean boolean10 = roundVolume3.equals((java.lang.Object) 0.0f);
        double double11 = roundVolume3.getVolume();
        double double12 = roundVolume3.getVolume();
        roundVolume3.setVolume((double) (-1L));
        int int15 = roundVolume3.getDiameter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + (-1.0d) + "'", double8 == (-1.0d));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 10.0d + "'", double11 == 10.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 10.0d + "'", double12 == 10.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        java.lang.String str7 = roundVolume3.toString();
        double double8 = roundVolume3.getVolume();
        int int9 = roundVolume3.getDiameter();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str7, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 100.0f, (int) 'a', (double) (short) 10);
        roundVolume3.setDiameter((int) (byte) 10);
        roundVolume3.setDiameter((int) (byte) -1);
        java.lang.String str8 = roundVolume3.toString();
        double double9 = roundVolume3.getVolume();
        logic.YourWood yourWood10 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList11 = yourWood10.getWood();
// flaky:         yourWood10.addWood((double) 10, 10);
        java.util.ArrayList<logic.RoundVolume> roundVolumeList15 = yourWood10.getWood();
        yourWood10.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList17 = yourWood10.getWood();
        yourWood10.diameterFirstSortWood();
        boolean boolean19 = roundVolume3.canEqual((java.lang.Object) yourWood10);
        yourWood10.diameterFirstSortWood();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "RoundVolume(length=100.0, diameter=-1, volume=10.0)" + "'", str8, "RoundVolume(length=100.0, diameter=-1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 10.0d + "'", double9 == 10.0d);
        org.junit.Assert.assertNotNull(roundVolumeList11);
        org.junit.Assert.assertNotNull(roundVolumeList15);
        org.junit.Assert.assertNotNull(roundVolumeList17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        logic.YourWood yourWood0 = new logic.YourWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.lengthFirstSortWood();
        yourWood0.diameterFirstSortWood();
        yourWood0.lengthFirstSortWood();
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        logic.RoundVolume roundVolume0 = new logic.RoundVolume();
        double double1 = roundVolume0.getVolume();
        logic.YourWood yourWood2 = new logic.YourWood();
        yourWood2.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList4 = yourWood2.getWood();
        boolean boolean5 = roundVolume0.canEqual((java.lang.Object) yourWood2);
        roundVolume0.setLength((double) 100L);
        logic.RoundVolume roundVolume11 = new logic.RoundVolume((double) (short) -1, (int) (byte) 100, (double) 'a');
        boolean boolean12 = roundVolume0.equals((java.lang.Object) (byte) 100);
        org.junit.Assert.assertTrue("'" + double1 + "' != '" + 0.0d + "'", double1 == 0.0d);
        org.junit.Assert.assertNotNull(roundVolumeList4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getLength();
        int int8 = roundVolume3.getDiameter();
        roundVolume3.setLength((double) (-1));
        roundVolume3.setDiameter((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
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
        roundVolume3.setLength((double) (-1L));
        double double36 = roundVolume3.getVolume();
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
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 10.0d + "'", double36 == 10.0d);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume3.setLength((double) (-1.0f));
        java.lang.String str6 = roundVolume3.toString();
        double double7 = roundVolume3.getLength();
        int int8 = roundVolume3.getDiameter();
        roundVolume3.setLength((double) (-1));
        roundVolume3.setLength((double) (short) 10);
        logic.YourWood yourWood13 = new logic.YourWood();
        yourWood13.lengthFirstSortWood();
        yourWood13.lengthFirstSortWood();
        java.lang.Class<?> wildcardClass16 = yourWood13.getClass();
        boolean boolean17 = roundVolume3.canEqual((java.lang.Object) yourWood13);
        java.lang.String str18 = roundVolume3.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str6, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + (-1.0d) + "'", double7 == (-1.0d));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "RoundVolume(length=10.0, diameter=1, volume=10.0)" + "'", str18, "RoundVolume(length=10.0, diameter=1, volume=10.0)");
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        logic.YourWood yourWood0 = new logic.YourWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList1 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList3 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList5 = yourWood0.getWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList6 = yourWood0.getWood();
        yourWood0.lengthFirstSortWood();
        java.util.ArrayList<logic.RoundVolume> roundVolumeList8 = yourWood0.getWood();
        org.junit.Assert.assertNotNull(roundVolumeList1);
        org.junit.Assert.assertNotNull(roundVolumeList3);
        org.junit.Assert.assertNotNull(roundVolumeList5);
        org.junit.Assert.assertNotNull(roundVolumeList6);
        org.junit.Assert.assertNotNull(roundVolumeList8);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        logic.RoundVolume roundVolume3 = new logic.RoundVolume((double) 10, (int) (short) -1, (double) (byte) 10);
        roundVolume3.setLength(0.0d);
        java.lang.String str6 = roundVolume3.toString();
        logic.RoundVolume roundVolume10 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume10.setLength((double) 1L);
        int int13 = roundVolume10.getDiameter();
        logic.RoundVolume roundVolume17 = new logic.RoundVolume((double) 0, (int) (short) 1, (double) (byte) 10);
        roundVolume17.setLength((double) (-1.0f));
        java.lang.String str20 = roundVolume17.toString();
        roundVolume17.setLength(100.0d);
        roundVolume17.setLength((double) 100L);
        boolean boolean25 = roundVolume10.canEqual((java.lang.Object) roundVolume17);
        int int26 = roundVolume10.getDiameter();
        boolean boolean27 = roundVolume3.canEqual((java.lang.Object) int26);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "RoundVolume(length=0.0, diameter=-1, volume=10.0)" + "'", str6, "RoundVolume(length=0.0, diameter=-1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "RoundVolume(length=-1.0, diameter=1, volume=10.0)" + "'", str20, "RoundVolume(length=-1.0, diameter=1, volume=10.0)");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }
}
