package com.railway.script;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.railway.generic.Base;
import com.railway.generic.FileLibrary;
import com.railway.pom.LoginPom;
import com.railway.pom.LogoutPom;

public class LoginValidation extends Base {

	@Test(priority = 1)
	public void ValidLogin() throws IOException {
		LoginPom l = new LoginPom(driver);
		FileLibrary f = new FileLibrary();
		l.LoginID().clear();
		l.Password().clear();
		String usrname = f.getPropertyData("username");
		l.LoginID().sendKeys(usrname);
		String Paswrd = f.getPropertyData("password");
		l.Password().sendKeys(Paswrd);
		l.Loginbutton().click();
		LogoutPom Lgout = new LogoutPom(driver);
		Lgout.Logoutm().click();
		Lgout.Yes().click();
	}

	@Test(priority = 2)
	public void InValidLogin() throws IOException {
		LoginPom l = new LoginPom(driver);
		FileLibrary f = new FileLibrary();
		l.LoginID().clear();
		l.Password().clear();
		String usrname = f.getPropertyData("wrongusername");
		l.LoginID().sendKeys(usrname);
		String Paswrd = f.getPropertyData("wrongpassword");
		l.Password().sendKeys(Paswrd);
		l.Loginbutton().click();
		WebElement errorMessage = wait.until(ExpectedConditions.visibilityOf(l.Nouserfound()));
		String expectedMessage = "Oops! No user found.";
		String actualMessage = errorMessage.getText();
		if (actualMessage.equalsIgnoreCase(expectedMessage)) {
			System.out.println("Test passed: Correct error message is displayed.");
		} else {
			System.out.println("Test failed: Incorrect error message. Found: " + actualMessage);
		}
	}

	@Test(priority = 3)
	public void InValidLoginA() throws IOException {
		LoginPom l = new LoginPom(driver);
		FileLibrary f = new FileLibrary();
		l.LoginID().clear();
		l.Password().clear();
		String usrname = f.getPropertyData("username");
		l.LoginID().sendKeys(usrname);
		String Paswrd = f.getPropertyData("wrongpassword");
		l.Password().sendKeys(Paswrd);
		l.Loginbutton().click();
		WebElement errorMessage = wait.until(ExpectedConditions.visibilityOf(l.AuthenticationFailed()));
		String expectedMessage = "Authentication failed!";
		String actualMessage = errorMessage.getText();
		if (actualMessage.equalsIgnoreCase(expectedMessage)) {
			System.out.println("Test passed: Correct error message is displayed.");
		} else {
			System.out.println("Test failed: Incorrect error message. Found: " + actualMessage);
		}
	}

	@Test(priority = 4)
	public void InValidLoginB() throws IOException {
		LoginPom l = new LoginPom(driver);
		l.LoginID().clear();
		l.Password().clear();
		l.Loginbutton().click();
		wait.until(ExpectedConditions.visibilityOf(l.EnterEmailError()));
		wait.until(ExpectedConditions.visibilityOf(l.EnterPasswordError()));
		String expectedEmailError = "Please enter your email address.";
		String actualEmailError = l.EnterEmailError().getText();

		if (actualEmailError.equalsIgnoreCase(expectedEmailError)) {
			System.out.println("Email validation passed: Correct error message is displayed.");
		} else {
			System.out.println("Email validation failed: Found message - " + actualEmailError);
		}
		String expectedPasswordError = "Please enter your password.";
		String actualPasswordError = l.EnterPasswordError().getText();

		if (actualPasswordError.equalsIgnoreCase(expectedPasswordError)) {
			System.out.println("Password validation passed: Correct error message is displayed.");
		} else {
			System.out.println("Password validation failed: Found message - " + actualPasswordError);
		}
	}

	@Test(priority = 5)
	public void InValidLoginC() throws IOException {
		LoginPom l = new LoginPom(driver);
		FileLibrary f = new FileLibrary();
		l.LoginID().clear();
		l.Password().clear();
		String usrname = f.getPropertyData("username");
		l.LoginID().sendKeys(usrname);
		l.Loginbutton().click();
		wait.until(ExpectedConditions.visibilityOf(l.EnterPasswordError()));
		String expectedPasswordError = "Please enter your password.";
		String actualPasswordError = l.EnterPasswordError().getText();

		if (actualPasswordError.equalsIgnoreCase(expectedPasswordError)) {
			System.out.println("Password validation passed: Correct error message is displayed.");
		} else {
			System.out.println("Password validation failed: Found message - " + actualPasswordError);
		}
	}

	@Test(priority = 6)
	public void InValidLoginD() throws IOException {
		LoginPom l = new LoginPom(driver);
		FileLibrary f = new FileLibrary();
		l.LoginID().clear();
		l.Password().clear();
		String Paswrd = f.getPropertyData("password");
		l.Password().sendKeys(Paswrd);
		l.Loginbutton().click();
		wait.until(ExpectedConditions.visibilityOf(l.EnterEmailError()));
		String expectedEmailError = "Please enter your email address.";
		String actualEmailError = l.EnterEmailError().getText();

		if (actualEmailError.equalsIgnoreCase(expectedEmailError)) {
			System.out.println("Email validation passed: Correct error message is displayed.");
		} else {
			System.out.println("Email validation failed: Found message - " + actualEmailError);
		}
	}

	@Test(priority = 6)
	public void InValidLoginE() throws IOException {
		LoginPom l = new LoginPom(driver);
		l.LoginID().clear();
		l.Password().clear();
		String usrname = "   eastern-railway@yopmail.com   ";
		String password = "   Test@123   ";
		l.LoginID().sendKeys(usrname);
		l.Password().sendKeys(password);
		l.Loginbutton().click();
	}
}
