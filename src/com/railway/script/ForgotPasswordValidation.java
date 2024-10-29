package com.railway.script;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.railway.generic.Base;
import com.railway.generic.FileLibrary;
import com.railway.pom.ForgotPasswordPom;
import com.railway.pom.LoginPom;

public class ForgotPasswordValidation extends Base {
	
	@Test(priority = 1)
	public void ForgotPasswordA() throws IOException {
		LoginPom l = new LoginPom(driver);
		FileLibrary f = new FileLibrary();
		ForgotPasswordPom fgp = new ForgotPasswordPom(driver);
		l.Frgtpassword().click();
//		wait.until(ExpectedConditions.urlContains("forgot-password"));
		String url="https://eastern-railway-admin-ui.dedicateddevelopers.us/forgot-password/";
		String currentUrl = driver.getCurrentUrl();
		if (currentUrl.equals(url)) {
			System.out.println("Successfully navigated to the Reset Password page.");
		} else {
			System.out.println("Failed to navigate to the Reset Password page.");
			return;
		}
		String usrname = f.getPropertyData("username");
		fgp.EnterYourMail().sendKeys(usrname);
		fgp.submitButton().click();
//		wait.until(ExpectedConditions.visibilityOf(fgp.verification()));
		if (fgp.verification().isDisplayed()) {
			System.out.println("verification code sent");
		} else {
			System.out.println("verification failed");

		}
	}

}
