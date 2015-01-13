package com.as.mockito.mockMethods;

import java.io.IOException;


public class User {

	public String getUserName() {
		return "Real User";
	}
	
	public int compareUser(String name) {
		return 1;
	}
	
	public void testException() throws IOException {
		System.out.println("Into testException");
	}
	
}