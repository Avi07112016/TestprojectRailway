package com.railway.pom;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class LoginPom{

		//		@FindBy(xpath = "(//input[@name='row-radio-buttons-group'])[1]")
//		public WebElement Admin;
		@FindBy(xpath = "//input[@name='email']")
		public WebElement LoginID;
		@FindBy(xpath = "//input[@name='password']")
		public WebElement Password;
		@FindBy(xpath = "(//button[@type='button'])[2]")
		public WebElement Eyebutton;
		@FindBy(xpath = "//a[@class='frgt-pass']")
		public WebElement Frgtpassword;
		@FindBy(xpath = "//button[contains(text(),'Log In')]")
		public WebElement Loginbutton;
		@FindBy(xpath = "//div[text()='Oops! No user found.']")
		public WebElement Nouserfound;
		@FindBy(xpath = "//div[text()='Authentication failed!']")
		public WebElement AuthenticationFailed;
		@FindBy(xpath = "//p[text()='Please enter your email address.']")
		public WebElement EnterEmailError;
		@FindBy(xpath = "//p[text()='Please enter your password.']")
		public WebElement EnterPasswordError;

		public LoginPom(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
//		public WebElement Admin(){
//			return Admin;
//		}
		public WebElement LoginID(){
			return LoginID;
		}
		public WebElement Password() {
			return Password;
		}
		public WebElement Eyebutton() {
			return Eyebutton;
		}
		public WebElement Frgtpassword() {
			return Frgtpassword;
		}
		public WebElement Loginbutton() {
			return Loginbutton;
		}
		public WebElement Nouserfound() {
			return Nouserfound;
		}
		public WebElement AuthenticationFailed() {
			return AuthenticationFailed;
		}
		public WebElement EnterEmailError() {
			return EnterEmailError;
		}
		public WebElement EnterPasswordError() {
			return EnterPasswordError;
		}
	}

