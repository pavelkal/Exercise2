package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test2a {
	@Test(expected = java.lang.ArithmeticException.class)
	public void Test1() {
		int a = -10;
		int b = 0;

		WeakClass.weakMethod2(a, b);
	}

	@Test
	public void Test2() {
		int a = -15;
		int b = 7;

		int expected = -22;
		int result = WeakClass.weakMethod2(a, b);
		assertEquals(expected, result, 0.01);

	}

	@Test(expected = java.lang.ArithmeticException.class)
	public void Test3() {
		int a = 0;
		int b = 3;

		WeakClass.weakMethod2(a, b);
	}

	@Test
	public void Test4() {
		int a = 15;
		int b = 4;

		int expected = 20;
		int result = WeakClass.weakMethod2(a, b);
		assertEquals(expected, result, 0.01);

	}

}