package com.as.hamcrest;

import static org.hamcrest.beans.HasProperty.hasProperty;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class SampleTest {
	private static List<Integer> list;

	@BeforeClass
	public static void setUp() {
		list = Arrays.asList(5, 2, 4);
	}

	@Test
	public void listTest() {
		assertEquals(3, list.size());
		assertThat(3, is(list.size()));

		assertThat(list, containsInAnyOrder(2, 4, 5));

	}

	@Ignore
	@Test
	public void sampleTest() {
		assertThat(Long.valueOf(1), instanceOf(Integer.class));
		assertThat(1, is(1));
	}

	@Ignore
	@Test
	public void sampleTest1() {
		assertEquals(1, 1);

	}

	@Ignore
	@Test
	public void sampleTest2() {
		assertEquals(1, 1);

		// all statements test the same
		Integer a = 3;
		Integer b = 3;
		assertThat(a, equalTo(b));

		assertThat(a, is(equalTo(b)));
		assertThat(a, is(b));

		assertThat("test", anyOf(is("testing"), containsString("est")));
	}

}
