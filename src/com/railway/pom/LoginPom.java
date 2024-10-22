package com.railway.pom;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	public class LoginPom{

public static final String SupervisorsManagement = null;
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
	}

