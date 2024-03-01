package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test4a {
	@Test
	public void Test1(){
        int a = 1;
        int b = -120;
        int expected =-120;
        int result = WeakClass.weakMethod4(a,b);
        assertEquals(expected, result,0.001);
    }
	
	@Test
	public void Test2(){
        int a = 2;
        int b = 0;        

        int expected =1;
        int result = WeakClass.weakMethod4(a,b);
        assertEquals(expected, result,0.001);
  
	}
	@Test
	public void Test3(){
        int a = 6;
        int b = 80;        

        int expected =86;
        int result = WeakClass.weakMethod4(a,b);
        assertEquals(expected, result,0.001);
	}
	
	@Test
	public void Test4(){
        int a = 10;
        int b = -10;        

        int expected =15;
        int result = WeakClass.weakMethod4(a,b);
        assertEquals(expected, result,0.001);
  
  
	}

	@Test
	public void Test5(){
        int a = 10;
        int b = 0;        

        int expected =-2;
        int result = WeakClass.weakMethod4(a,b);
        assertEquals(expected, result,0.001);
	}
	
	

	@Test
	public void Test6(){
        int a = 10;
        int b = 70;        

        int expected =-60;
        int result = WeakClass.weakMethod4(a,b);
        assertEquals(expected, result,0.001);
	}
	@Test
	public void Test7(){
        int a = 11;
        int b = -1;        

        int expected =-12;
        int result = WeakClass.weakMethod4(a,b);
        assertEquals(expected, result,0.001);
	}
	@Test
	public void Test8(){
        int a = 15;
        int b = 0;        

        int expected =2;
        int result = WeakClass.weakMethod4(a,b);
        assertEquals(expected, result,0.001);
	}
	@Test
	public void Test9(){
        int a = 15;
        int b = 10;        

        int expected =450;
        int result = WeakClass.weakMethod4(a,b);
        assertEquals(expected, result,0.001);
	}
}