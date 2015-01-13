package com.as.mockhito.withDatabase.tests;

import static org.mockito.Mockito.*;

import org.testng.annotations.Test;


import com.as.mockhito.withDatabase.database.User;
import com.as.mockhito.withDatabase.database.UserDao;

import static org.testng.Assert.*;

public class TestSaveUser {
	private UserDao userDao = new UserDao();
	
	@Test
	public void testSaveUser() {
		User user = new User();
		user.setId(3);
		user.setName("User3");
		user.setAge(3);
		
		userDao.saveUser(user);
		
		assertEquals(user, userDao.findById(3));
		
		userDao.deleteUser(user);
	}
	
	@Test
	public void testMockitoSaveUser() {
		User user1 = new User();
		
		User user = mock(User.class);
		
		when(user.getId()).thenReturn(5);
		when(user.getName()).thenReturn("User5");
		
		userDao.saveUser(user1);
	}
	
}
