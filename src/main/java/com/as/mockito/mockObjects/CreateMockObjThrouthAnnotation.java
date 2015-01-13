package com.as.mockito.mockObjects;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CreateMockObjThrouthAnnotation {
	// Really we create only mock object, not real object !
	@Mock
	User userObject;
	
	@Test
	public void testCreateMockObject() {
		Mockito.when(userObject.getUserName()).thenReturn("Mock User");
		
		Assert.assertEquals("Mock User", userObject.getUserName());
	}
}