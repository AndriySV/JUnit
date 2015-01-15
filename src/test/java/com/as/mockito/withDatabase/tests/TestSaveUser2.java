package com.as.mockito.withDatabase.tests;

import static org.mockito.Mockito.*;

import org.testng.annotations.Test;

import com.as.mockito.withDatabase.database.User;
import com.as.mockito.withDatabase.database.UserDao;

import static org.testng.Assert.*;

public class TestSaveUser2 {
	private UserDao userDao = new UserDao();

	@Test
	public void testSaveUser() {
		User user = new User();
		user.setId(3);
		user.setName("User3");
		user.setAge(3);

		userDao.saveUser(user);

		//TODO delete Not
		assertNotEquals(user, userDao.findById(3));

		userDao.deleteUser(user);
	}

	@Test
	public void testMockitoSaveUser() {
		User user = mock(User.class);

		when(user.getName()).thenReturn("User1");

		assertEquals(user.getName(), userDao.findById(1).getName());
	}

}
