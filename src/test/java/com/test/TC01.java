package com.test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC01 {
	
	@Test
	public void tc01_1(){
	System.out.println("hello");
		//Assert.fail();
	}
	@Test
      public void tc01_2(){
		
		Assert.fail();
	}
	@Test
      public void tc01_3(){
		Assert.fail();
	
}


}
