package maths;

import static org.junit.Assert.*;

public class SICITest {

	public void testSi() {
		SICI s = new SICI();
		assertEquals("Simple Interest is ",25000.0,s.si(50000,10,5),0);
	}

	public void testCi() {
		SICI c = new SICI();
		assertEquals("Compound Interest is ",31444.731338872094,c.ci(50000,10,5),0);
	}

}
