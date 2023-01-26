package Tcs;

import static org.junit.Assert.*;

import org.junit.Test;

public class tc2 {

	@Test
	public void test() {
		Test_Case t1=new Test_Case();
		int act=t1.isValid("");
		assertEquals(0,act);
	}

}
