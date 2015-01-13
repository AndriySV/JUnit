package com.as.mockito.mockObjects;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class CreateMockObjThrouthMethod {

	User userObject = Mockito.mock(User.class);

	@Test
	public void testCreateMockObject() {
		Mockito.when(userObject.getUserName()).thenReturn("Mock User");

		Assert.assertEquals("Mock User", userObject.getUserName());
	}

}