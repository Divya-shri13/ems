package com.capgemini;



import static org.junit.Assert.*;

import org.junit.Test;
 public class Opereationtest {

	@Test
	public void testMessage() {
		Operation op=new Operation();
		String actualOutput = op.message("ANU");
		assertEquals("Hello: ANU",actualOutput);
		System.out.println("SUCESSFULLY PASSED THE MESSAGE");
	}
 }
