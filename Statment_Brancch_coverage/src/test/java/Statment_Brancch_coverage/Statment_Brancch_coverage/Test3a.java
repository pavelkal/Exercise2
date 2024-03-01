package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test3a {

	@Test
	public void Test1() {
		int a = 200;
		int b = 10;

		int expected = 20;
		int result = WeakClass.weakMethod3(a, b);
		assertEquals(expected, result, 0.001);

	}

	@Test
	public void Test2() {
		int a = 50;
		int b = 5;

		int expected = -45;
		int result = WeakClass.weakMethod3(a, b);
		assertEquals(expected, result, 0.001);

	}

}