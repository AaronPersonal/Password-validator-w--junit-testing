package ca.beehooaa;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestValidate {

	@Test
	public void testValidateMinLength() {
		assertTrue("Password needs to be 8 or more characters",
				Validate.validateMinLength("12345678"));
	}

	@Test
	public void testValidateAlpha() {
		assertTrue("Password may only contain letters and digits",
				Validate.validateAlpha("aaronbeehoo12"));
	}

	@Test
	public void testValidateMinNum() {
		assertTrue("Password must contain atleast 2 digits",
				Validate.validateMinNum("aaronbeehoo12"));
	}

}
