package com.as.testNG.groupTest;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTestExample2 {

	@Test(groups = { "first" })
	public void firstMethod() {
		System.out.println("--------START--------");

		Assert.assertTrue(true);
	}
	
	@Test(groups = { "end" })
	public void finalMethod() {
		System.out.println("--------END--------");

		Assert.assertTrue(true);
	}

}