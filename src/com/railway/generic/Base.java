package com.railway.generic;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.railway.pom.LoginPom;
import com.railway.pom.LogoutPom;

public class Base {

	public WebDriver driver;
	public WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
	
	
	
	@BeforeClass
	public void OpenBrowser() throws IOException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://eastern-railway-admin-ui.dedicateddevelopers.us/login/");
	}

//	@BeforeMethod
//	public void Login() {
//		LoginPom l = new LoginPom(driver);
//		l.LoginID().sendKeys("eastern-railway@yopmail.com");
//		l.Password().sendKeys("Test@123");
//		l.Loginbutton().click();
//	}

//	@AfterMethod
//	public void Logout() {
//		LogoutCPom l = new LogoutCPom(driver);
//		l.Logoutm().click();
//		l.Yes().click();

//	}

	@AfterClass
	public void CloseBrowser() {
			driver.quit();

	}

}
