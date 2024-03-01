package Statment_Brancch_coverage.Statment_Brancch_coverage;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Test1a {
	@Test(expected=java.lang.ArithmeticException.class)
	public void Test1(){
        int a = 0;
        int b = 120;
       
        
        WeakClass.weakMethod1(a,b);
    }
	
	@Test(expected=java.lang.ArithmeticException.class)
	public void Test2(){
        int a = 0;
        int b = 100;        
        WeakClass.weakMethod1(a,b);
  
	}
	@Test
	public void Test3(){
        int a = 6;
        int b = 80;        
       

        int expected =87;
        double result = WeakClass.weakMethod1(a,b);
        assertEquals(expected, result,0.001);
  
	}
	
	@Test
	public void Test4(){
        int a = 3;
        int b = 130;        
     

        int expected =8;
        double result = WeakClass.weakMethod1(a,b);
        assertEquals(expected, result,0.001);
  
	}
	
	
	
	
	
	
	
	
	
	
	
}