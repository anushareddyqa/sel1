package com.tyss.pomRepo;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.tyss.generic.Constants;
import com.tyss.generic.Utility;
import com.tyss.generic.WebDriverCommanLib;

public class LoginPage {
	
	Logger log = Logger.getLogger(LoginPage.class);
	WebDriverCommanLib comLib = new WebDriverCommanLib();
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, LoginPage.class);
	}
	
	@FindBy (id="email")
	private WebElement emailTextBox;
	
	@FindBy (id="password")
	private WebElement passwordTextBox;
	
	@FindBy (id="submit-button")
	private WebElement loginButton;
	
	public void enterEmailId() throws IOException{
		emailTextBox.click();
		emailTextBox.sendKeys(Utility.readConfigPropertiesFile("Email"));
	}
	
	public void enterPassword() throws IOException{
		passwordTextBox.sendKeys(Utility.readConfigPropertiesFile("Password"));
	}
	
	public void clickLoginButton(){
		loginButton.click();
	}
	

}
