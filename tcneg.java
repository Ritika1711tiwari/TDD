package Tcs;

import static org.junit.Assert.*;

import org.junit.Test;

public class tcneg {

	@Test
	public void test() {
		Test_Case t3=new Test_Case();
		int act=t3.isValid(" hkjfwh  jhkjhkj");
		assertEquals(0,act);
	}

}
