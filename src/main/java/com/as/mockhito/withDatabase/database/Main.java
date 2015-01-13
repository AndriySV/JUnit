package com.as.mockhito.withDatabase.database;


public class Main {

	public static void main(String[] args) {
		User user = new User();
		user.setId(10);
		user.setName("User10");
		user.setAge(22);
		
		UserDao userDao = new UserDao();
		userDao.saveUser(user);
		
		System.out.println(userDao.findById(10));
		
		userDao.deleteUser(user);
	}
	
}