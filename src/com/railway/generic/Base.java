package com.railway.generic;

	import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	import org.testng.annotations.BeforeMethod;


import com.railway.pom.LoginPom;
import com.railway.pom.LogoutCPom;
import com.railway.pom.SupervisorsManagementPom;

	public class Base {

		public WebDriver driver;

		@BeforeClass
		public void OpenBrowser() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://eastern-railway-admin-ui.dedicateddevelopers.us/login/");
		}

		@BeforeMethod
		public void Login() {
			LoginPom l=new LoginPom(driver);
			l.LoginID().sendKeys("eastern-railway@yopmail.com");
			l.Password().sendKeys("Test@123");
			l.Loginbutton().click();
			SupervisorsManagementPom s= new SupervisorsManagementPom(driver);
			s.SupervisorsManagement.click();
			s.AddSupervisor.click();
		}
	
		@AfterMethod
		public void Logout() {
			LogoutCPom l= new LogoutCPom(driver);
			l.Logoutm().click();
//			l.Yes().click();
			
		}

		@AfterClass
		public void CloseBrowser() {
//			driver.quit();

		}

	}
