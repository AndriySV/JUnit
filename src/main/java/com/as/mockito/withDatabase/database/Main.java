package com.as.mockito.withDatabase.database;


public class Main {

	public static void main(String[] args) {
		User user = new User();
		user.setId(3);
		user.setName("User3");
		user.setAge(33);
		
		UserDao userDao = new UserDao();
		userDao.saveUser(user);
		
		System.out.println(userDao.findById(3));
		
		userDao.deleteUser(user);
	}
	
}