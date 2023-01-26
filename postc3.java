package Tcs;

import static org.junit.Assert.*;

import org.junit.Test;

public class postc3 {

	@Test
	public void test() {
		Test_Case t4=new Test_Case();
		int actual_Out=t4.isValid("abc1234567");
		assertEquals(1,actual_Out);
	}

}
