package com.railway.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPom {

	@FindBy(xpath = "//button[contains(text(),'Logout')]")
	public WebElement Logoutm;

	@FindBy(xpath = "//button[contains(text(),'Cancel')]")
	public WebElement Cancel;

	@FindBy(xpath = "//button[contains(text(),'Yes')]")
	public WebElement Yes;

	public LogoutPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement Logoutm() {
		return Logoutm;
	}

	public WebElement Cancel() {
		return Cancel;
	}

	public WebElement Yes() {
		return Yes;

	}

}
