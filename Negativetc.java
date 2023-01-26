package Tcs;

import static org.junit.Assert.*;

import org.junit.Test;

public class Negativetc {

	@Test
	public void test() {
		Test_Case t1=new Test_Case();
		int testN=t1.isValid("");
		assertEquals(-1,testN);
		
	}

}
