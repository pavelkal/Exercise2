package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test2b {
	@Test
	public void Test1() {
		int a = -10;
		int b = 5;

		int expected = 6;
		int result = WeakClass.weakMethod2(a, b);
		assertEquals(expected, result, 0.001);
	}

	@Test
	public void Test2() {
		int a = -15;
		int b = 7;

		int expected = -22;
		int result = WeakClass.weakMethod2(a, b);
		assertEquals(expected, result, 0.001);

	}

	@Test
	public void Test3() {
		int a = -20;
		int b = 5;

		int expected = 6;
		int result = WeakClass.weakMethod2(a, b);
		assertEquals(expected, result, 0.001);

	}

	@Test
	public void Test4() {
		int a = 4;
		int b = 2;

		int expected = 8;
		int result = WeakClass.weakMethod2(a, b);
		assertEquals(expected, result, 0.001);

	}

	@Test
	public void Test5() {
		int a = 15;
		int b = 4;

		int expected = 20;
		int result = WeakClass.weakMethod2(a, b);
		assertEquals(expected, result, 0.001);
	}

	@Test
	public void Test6() {
		int a = 20;
		int b = 7;

		int expected = 25;
		int result = WeakClass.weakMethod2(a, b);
		assertEquals(expected, result, 0.001);
	}

}