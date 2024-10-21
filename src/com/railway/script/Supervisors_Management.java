package com.railway.script;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.railway.generic.Base;
import com.railway.pom.SupervisorsManagementPom;

public class Supervisors_Management extends Base {
	
	@Test(priority = 0)
	public void Admin() {
		SupervisorsManagementPom s= new SupervisorsManagementPom(driver);
		s.SupervisorsManagement().click();
		s.AddSupervisor().click();
		s.EnterSupervisor.click();
		wait.until(ExpectedConditions.visibilityOf(s.EnterSupervisor()));
		s.EnterSupervisor().sendKeys("TestDemo");
	}
	

}
