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
	public WebElement Checkbox2;
	@FindBy(xpath = "(//input[@type='checkbox'])[3]")
	public WebElement Checkbox3;
	@FindBy(xpath = "(//input[@type='checkbox'])[67]")
	public WebElement Checkbox67;
	@FindBy(xpath = "//button[contains(text(),'Continue')]")
	public WebElement Continue;
	@FindBy(xpath = "//button[contains(text(),'Preview & Submit')]")
	public WebElement Preview;
	@FindBy(xpath = "//p[contains(text(),'ai@yopmail.com')]")
	public WebElement Validatemail;
	@FindBy(xpath = "//div[text()='This Email Is Already Registered.']")
	public WebElement Emailerror;
	@FindBy(xpath = "//div[text()='This Email Is Already Registered.']")
	public WebElement Phonenumbererror;
	@FindBy(xpath = "//button[contains(text(),'Back')]")
	public WebElement Backbutton;
	@FindBy(xpath = "(//p[text()='Active'])[1]")
	public WebElement ActiveButton;
	@FindBy(xpath = "//p[contains(text(),'Are you sure you want to Change Status?')]")
	public WebElement StatusPopup;
	@FindBy(xpath = "//button[contains(text(),'Yes')]")
	public WebElement YesButton;
	@FindBy(xpath = "//p[contains(text(),'Inactive')]")
	public WebElement InactiveButton;
	
	
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
	public WebElement Checkbox2() {
		return Checkbox2;
	}
	public WebElement Checkbox3() {
		return Checkbox3;
	}
	public WebElement Checkbox67() {
		return Checkbox67;
	}
	public WebElement Continue() {
		return Continue;
	}
	public WebElement Preview() {
		return Preview;
	}
	public WebElement Validatemail() {
		return Validatemail;
	}
	public WebElement Emailerror() {
		return Emailerror;
	}
	public WebElement Phonenumbererror() {
		return Phonenumbererror;
	}
	public WebElement Backbutton() {
		return Backbutton;
	}
	public WebElement ActiveButton() {
		return ActiveButton;
	}
	public WebElement StatusPopup() {
		return StatusPopup;
	}
	public WebElement YesButton() {
		return YesButton;
	}
	public WebElement InactiveButton() {
		return InactiveButton;
	}
}
