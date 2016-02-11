package com.tyss.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Sample {
	
	@Test
	public void test()
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.gmail.com");
		System.out.println("done");
	}

}
