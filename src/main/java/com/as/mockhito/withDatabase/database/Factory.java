package com.as.mockhito.withDatabase.database;


public class Factory {

	 private static UserDao userDao = null;
	 private static Factory instance = null;

	    public static synchronized Factory getInstance(){
            if (instance == null){
              instance = new Factory();
            }
            return instance;
      }

      public UserDao getStudentDAO(){
            if (userDao == null){
              userDao = new UserDao();
            }
            return userDao;
      }  
}
