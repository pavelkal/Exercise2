package Statment_Brancch_coverage.Statment_Brancch_coverage;

public class WeakClass {
	public static int weakMethod1(int a, int b) {
		int result;
		if (a % 2 == 0 && b > 100) {
			result = b / a + 10;
		} else if (a % 2 == 0 && b == 100) {
			result = b / a + 3;
		} else if (a % 2 == 0 && b < 100) {
			result = b + 7;
		} else if (a % 2 == 1 && b > 100) {
			result = a + 5;
		} else if (a % 2 == 1 && b == 100) {
			result = a - 3;
		} else {
			result = a + b;
		}
		return result;
	}

	public static int weakMethod2(int a, int b) {
		int result;
		if (a < 0 && b % 3 == 0) {
			result = a / b;
		} else if (a < 0 && b % 3 == 1) {
			result = a - b;
		} else if (a < 0 && b % 3 == 2) {
			result = b + 1;
		} else if (a >= 0 && b % 3 == 0) {
			result = b / a + 2;
		} else if (a >= 0 && b % 3 == 1) {
			result = a + 5;
		} else {
			result = b * a;
		}
		return result;
	}

	public static int weakMethod3(int a, int b) {
		int result = 0;
		if (a != 0 && b % 2 == 0) {
			if (a > 100) {
				result = a / b;
			}
		} else {
			result = b - a;
		}

		return result;
	}

	public static int weakMethod4(int a, int b) {
		int result;
		if (a < 10 && b < 0) {
			result = b / a;
		} else if (a < 10 && b == 0) {
			result = a / (b + a);
		} else if (a < 10 && b > 0) {
			result = a + b;
		} else if (a == 10 && b < 0) {
			result = a + 5;
		} else if (a == 10 && b == 0) {
			result = b - 2;
		} else if (a == 10 && b > 0) {
			result = a - b;
		} else if (a > 10 && b < 0) {
			result = a ^ b;
		} else if (a > 10 && b == 0) {
			result = a * b + 2;
		} else {
			result = 3 * a * b;
		}
		return result;

	}

}