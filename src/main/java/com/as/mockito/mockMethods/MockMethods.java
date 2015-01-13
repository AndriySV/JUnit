package com.as.mockito.mockMethods;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mockito;

public class MockMethods {
	
	User userObject = Mockito.mock(User.class);
	
	/**
	 * Using mock methods:
	 *  - when(...).thenReturn(...)
	 *  - anyString()
	 */
	@Test
	public void testMockMethods1() {
		Mockito.when(userObject.getUserName()).thenReturn("Mock User1").thenReturn("Mock User2");
		
		Assert.assertEquals("Mock User1", userObject.getUserName());
		Assert.assertEquals("Mock User2", userObject.getUserName());
		
		Mockito.when(userObject.compareUser("Mock User3")).thenReturn(10);
		Assert.assertEquals(10, userObject.compareUser("Mock User3"));
		
		Mockito.when(userObject.compareUser(Mockito.anyString())).thenReturn(11);
		Assert.assertEquals(11, userObject.compareUser("Either Mock User"));
	}

	/**
	 * Using mock methods:
	 *  - doThrow(...)
	 */
	@Test(expected = IOException.class)
	public void testTestException() throws IOException{
		Mockito.doThrow(new IOException()).when(userObject).testException();
		userObject.testException();
	}
	
	@Test
	public void  testMethodVerify1() {
		userObject.getUserName();

		// Was the method getUserName() called ?
		Mockito.verify(userObject).getUserName();
	}
	
	@Test
	public void testMethodVerify2() {
		userObject.compareUser("Vika");
		
		// Check if the method compareUser() was called with parametr "Vika"
		Mockito.verify(userObject).compareUser(Matchers.eq("Vika"));
	}
	
	@Test
	public void testMethodVerify3() {
		userObject.getUserName();
		userObject.getUserName();
		
		// Check if the method getUserName() was called two times
		Mockito.verify(userObject, Mockito.times(2)).getUserName();
	}
	
	@SuppressWarnings("rawtypes")
	@Test
	public void testSpy() {
		List list = new LinkedList();
		List spyList = Mockito.spy(list);

		//You have to use doReturn() for stubbing
		Mockito.doReturn("foo").when(spyList).get(0);
		System.out.println(spyList.get(0));
	}

}