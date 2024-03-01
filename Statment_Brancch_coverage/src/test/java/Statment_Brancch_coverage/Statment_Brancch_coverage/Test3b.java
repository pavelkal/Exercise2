package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test3b {

	@Test(expected = java.lang.ArithmeticException.class)
	public void Test1() {
		int a = 200;
		int b = 0;

		WeakClass.weakMethod3(a, b);
	}

}