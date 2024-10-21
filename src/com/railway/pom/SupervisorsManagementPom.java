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
	
	public SupervisorsManagementPom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement SupervisorsManagement() {
		return SupervisorsManagement;
	}
	public WebElement AddSupervisor() {
		return AddSupervisor;
	}
	
	

}
