
package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestStatusClass {

	@Test
	    public void test_1_2_4_17(){
	        boolean expected = true;
	        boolean result = CheckOut.checkOut(3000.00,500,statusClass.Status.gold);
	        assertEquals(expected, result);
	    }

	@Test
	    public void test_1_2_5_8_18(){
	        boolean expected = true;
	        boolean result = CheckOut.checkOut(3000.00,500,statusClass.Status.gold);
	        assertEquals(expected, result);
	    }

	@Test
	    public void test_1_2_5_9(){
	        boolean expected = true;
	        boolean result = CheckOut.checkOut(2000.00,500,statusClass.Status.gold);
	        assertEquals(expected, result);
	    }

	@Test
	    public void test_1_3_6_10_19(){
	        boolean expected = true;
	        boolean result = CheckOut.checkOut(1500.00,500,statusClass.Status.silver);
	        assertEquals(expected, result);
	    }

	@Test
		public void test_1_3_6_11_14_21(){
		    boolean expected = true;
		    boolean result = CheckOut.checkOut(1500.00,800,statusClass.Status.silver);
		        assertEquals(expected, result);
		    }

}
