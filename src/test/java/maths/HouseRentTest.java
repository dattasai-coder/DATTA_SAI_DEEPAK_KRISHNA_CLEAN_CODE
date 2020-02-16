package maths;

import static org.junit.Assert.*;

import org.junit.Test;

public class HouseRentTest {

	@Test
	public void testHouseRent() {
		HouseRent hr = new HouseRent();
		assertEquals("My house construction cost is ",375345.0,hr.houseRent("asm", 250.23),0);
		//fail("Not yet implemented");
	
	}
}
