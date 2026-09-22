package com.bits;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
public class AppTest extends TestCase {
    public AppTest(String testName) { super(testName); }
    public static Test suite() { return new TestSuite(AppTest.class); }
    public void testProductCreation() {
        Product p = new Product(101, "Laptop", 55000.0);
        assertEquals(101, p.getId());
        assertEquals("Laptop", p.getName());
        assertEquals(55000.0, p.getPrice());
    }
    public void testApp() { assertTrue(true); }
}
