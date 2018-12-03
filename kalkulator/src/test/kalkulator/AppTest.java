package kalkulator;

//import junit.framework.Test;
import junit.framework.TestCase;
//import junit.framework.TestSuite;

public class AppTest extends TestCase {
	
    public void testDodawania() {
		App kalkulator = new App();
		assertEquals(15,kalkulator.dodaj(10, 5));
		assertEquals(0,kalkulator.dodaj(-1, 1));
		assertEquals(-2,kalkulator.dodaj(-1, -1));
    }
    public void testOdejmowania() {
		App kalkulator = new App();
		assertEquals(5,kalkulator.odejmij(10, 5));
		assertEquals(0,kalkulator.odejmij(-1, -1));
		assertEquals(-2,kalkulator.odejmij(-1, 1));
    }
    public void testMnozenia() {
		App kalkulator = new App();
		assertEquals(50,kalkulator.mnoz(10, 5));
		assertEquals(-1,kalkulator.mnoz(-1, 1));
		assertEquals(1,kalkulator.mnoz(-1, -1));
    }
    public void testDzielenia() {
		App kalkulator = new App();
		assertEquals(2,kalkulator.dziel(10, 5));
		assertEquals(-1,kalkulator.dziel(-1, 1));
		assertEquals(1,kalkulator.dziel(-1, -1));
    }
    
}
