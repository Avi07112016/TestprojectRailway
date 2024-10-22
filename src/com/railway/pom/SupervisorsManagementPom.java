package com.railway.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SupervisorsManagementPom {
	
	@FindBy(xpath = "//span[text()='Supervisors Management']")
	public WebElement SupervisorsManagement ;
	
	@FindBy(xpath = "//button[text()='Add Supervisor']")
	public WebElement AddSupervisor ;
	
	@FindBy(xpath = "//input[@name='fullName']")
	public WebElement EnterSupervisor ;
	
	@FindBy(xpath= "//input[@placeholder='Enter email address']")
	public WebElement EnterEmailAddress ;
	
	@FindBy(xpath= "//input[@placeholder='Enter phone number']")
	public WebElement EnterPhoneNumber ;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	public WebElement Checkbox;
	
	public SupervisorsManagementPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement SupervisorsManagement() {
		return SupervisorsManagement;
	}
	public WebElement AddSupervisor() {
		return AddSupervisor;
	}
	
	public WebElement EnterSupervisor() {
		return EnterSupervisor;
	}
	
	public WebElement EnterEmailAddress() {
		return EnterEmailAddress ;
	}
	
	public WebElement EnterPhoneNumber() {
		return EnterPhoneNumber ;
	}
	public WebElement Checkbox() {
		return Checkbox;
	}
}
