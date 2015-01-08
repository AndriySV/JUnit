package com.as.junit.testFramework;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit1 {

	String message = "Robert";

	@Test
	public void testPrintMessage() {
		System.out.println("Inside testPrintMessage()");
		assertEquals(message, message);
	}
}