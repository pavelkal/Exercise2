package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test1b {
	@Test
	public void Test1() {
		int a = 10;
		int b = 120;

		int expected = 22;
		int result = WeakClass.weakMethod1(a, b);
		assertEquals(expected, result, 0.001);
	}

	@Test
	public void Test2() {
		int a = 4;
		int b = 100;

		int expected = 28;
		int result = WeakClass.weakMethod1(a, b);
		assertEquals(expected, result, 0.001);

	}

	@Test
	public void Test3() {
		int a = 6;
		int b = 80;

		int expected = 87;
		int result = WeakClass.weakMethod1(a, b);
		assertEquals(expected, result, 0.001);

	}

	@Test
	public void Test4() {
		int a = 3;
		int b = 130;

		int expected = 8;
		int result = WeakClass.weakMethod1(a, b);
		assertEquals(expected, result, 0.001);

	}

	@Test
	public void Test5() {
		int a = 5;
		int b = 100;

		int expected = 2;
		int result = WeakClass.weakMethod1(a, b);
		assertEquals(expected, result, 0.001);
	}

	@Test
	public void Test6() {
		int a = 7;
		int b = 70;

		int expected = 77;
		int result = WeakClass.weakMethod1(a, b);
		assertEquals(expected, result, 0.001);
	}

}