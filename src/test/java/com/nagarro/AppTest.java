package com.nagarro;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.nagarro.controller.HomeController;

public class AppTest 
{
	@Test
    public void testApp()
    {
		HomeController hc = new HomeController();
		String result= hc.home();
		assertEquals(result,"hello its spring boot application");
    }
}
