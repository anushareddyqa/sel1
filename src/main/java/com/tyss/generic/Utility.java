package com.tyss.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	public static void captureScreenshot(WebDriver driver, String screenshotName){
		
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File ("./ScreenShot/"+screenshotName+".png"));
			System.out.println("screen shot captured");
		} catch (Exception e) {
			
			System.out.println("exception while taking screen shot");
				} 
	}

	/*public void captureCurrentDateTime(){
		
	}*/
	
	public static String readConfigPropertiesFile(String key) throws IOException{
		Properties properties = new Properties();
		FileInputStream fis = new FileInputStream("../Ashi_Selenium/src/main/resources/config.properties");
		properties.load(fis);
		String value = properties.getProperty(key);
		return value;
	}

}
