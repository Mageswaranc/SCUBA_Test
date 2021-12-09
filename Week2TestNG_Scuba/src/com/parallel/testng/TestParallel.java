package com.parallel.testng;

import org.testng.annotations.Test;

public class TestParallel {
	@Test
	public void TestRun1() {
		System.out.println("Test1");
	}
	@Test
	public void TestRun2() {
		System.out.println("Test2");
	}
	@Test
	public void TestRun3() {
		System.out.println("Test3");
	}
}

