package Tcs;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tests {

	@Test
	public void test() {
			Test_Case t1=new Test_Case();
	
	int test2=t1.isValid("123458910");
	assertEquals(1,test2);
	

	}

}
