package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test4b {
	@Test
	public void Test1() {
		int a = 8;
		int b = -8;

		int expected = -1;
		int result = WeakClass.weakMethod4(a, b);
		assertEquals(expected, result, 0.001);

	}

	@Test(expected = java.lang.ArithmeticException.class)
	public void Test2() {
		int a = 0;
		int b = 0;

		WeakClass.weakMethod4(a, b);
	}

	@Test
	public void Test3() {
		int a = 9;
		int b = 9;

		int expected = 18;
		int result = WeakClass.weakMethod4(a, b);
		assertEquals(expected, result, 0.001);

	}

	@Test
	public void Test4() {
		int a = 10;
		int b = -5;

		int expected = 15;
		int result = WeakClass.weakMethod4(a, b);
		assertEquals(expected, result, 0.001);

	}

}