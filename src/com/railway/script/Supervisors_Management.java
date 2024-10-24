package com.railway.script;

import java.awt.Checkbox;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.railway.generic.Base;
import com.railway.pom.SupervisorsManagementPom;

public class Supervisors_Management extends Base {

	@Test(priority = 0)
	public void Admin() {
		SupervisorsManagementPom s = new SupervisorsManagementPom(driver);
		s.SupervisorsManagement().click();
		s.AddSupervisor().click();
		s.EnterSupervisor.click();
		wait.until(ExpectedConditions.visibilityOf(s.EnterSupervisor()));
		s.EnterSupervisor().sendKeys("TestDemo");
		wait.until(ExpectedConditions.visibilityOf(s.EnterEmailAddress()));
		s.EnterEmailAddress().sendKeys("ai@yopmail.com");
		wait.until(ExpectedConditions.visibilityOf(s.EnterPhoneNumber()));
		s.EnterPhoneNumber().sendKeys("8100026012");

	}

	@Test(priority = 1)
	public void StationA() {
		SupervisorsManagementPom s = new SupervisorsManagementPom(driver);
		s.Checkbox2().click();
//		wait.until(ExpectedConditions.visibilityOf(s.Checkbox3()));
		s.Checkbox3().click();
//		wait.until(ExpectedConditions.visibilityOf(s.Checkbox3()));
//		wait.until(ExpectedConditions.visibilityOf(s.Checkbox67()));
		s.Checkbox67().click();
//		wait.until(ExpectedConditions.visibilityOf(s.Checkbox67()));
//		wait.until(ExpectedConditions.visibilityOf(s.Continue()));
		s.Continue().click();
//		s.Preview().click();

	}

	@Test(priority = 2)
	public void ErrorMesaageValidation() {
		SupervisorsManagementPom s = new SupervisorsManagementPom(driver);

		s.Preview().click();

		if (s.Emailerror().isDisplayed() | s.Phonenumbererror().isDisplayed()) {
			Reporter.log("Email or phone number already exists. Clicking the back button");
			s.Backbutton().click();
		} else {
			System.out.println("new user");

		}
	}

	@Test(priority = 3)
	public void SupervisorManagementD() {
		SupervisorsManagementPom s = new SupervisorsManagementPom(driver);
		String email = "ai@yopmail.com";
		String actualValue = s.Validatemail().getText();
		System.out.println(actualValue);
		if (actualValue.equals(email)) {
			s.ActiveButton().click();

			if (s.StatusPopup().isDisplayed()) {
				s.YesButton().click();
				if (s.InactiveButton().isEnabled()) {
					s.StatusPopup().isDisplayed(); 
					s.YesButton().click();
				}
			}	
		}

		else {
			System.out.println("test case failed");

		}

	}
//	@Test(priority=1)
//	public void Submit() {
//		SupervisorsManagementPom s= new SupervisorsManagementPom(driver);
//		s.Continue().click();
//		}

//	@Test(priority=1)
//	public void StationsA() {
//		
//		driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
//		}
//		
//	}

}