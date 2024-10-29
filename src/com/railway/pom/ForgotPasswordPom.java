package com.railway.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPom {
	
	@FindBy(xpath = "//input[@placeholder='Enter your email address']")
	public WebElement EnterYourMail;
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement submitButton;
	@FindBy(xpath = "//div[text()='Please check your mail inbox for verification code.']")
	public WebElement verification;
	
	public ForgotPasswordPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement EnterYourMail() {
		return EnterYourMail;
	}
	public WebElement submitButton() {
		return submitButton;
	}
	public WebElement verification() {
		return verification;
	}

}
