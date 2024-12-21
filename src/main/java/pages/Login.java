package pages;

import static common.CommonActions.clickElement;
import static common.CommonActions.elementEnabled;
import static common.CommonActions.pause;
import static common.CommonActions.validationOfHeader;
import static common.CommonActions.verifyCurrentUrl;
import static common.CommonActions.verifyTitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import static common.CommonActions.*;
/*
1) Click Login from header
2) The page will direct to Login Page, validate title, current url, header etc.
3) provide your email and password and click submit button
4) When click a button make sure, the button is enabled, verify text and them click, verify logo, current url, title, header
*/


// EnthrallIT Login Page
public class Login {
	

	public WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	
	@FindBy(xpath = "//a[@class='nav-link' and @id='login-link']")
	WebElement loginHead;
	
	@FindBy(xpath = "//h2[text()='Login into your account']")
	WebElement loginHeader;
	
	
	@FindBy(xpath = "//input[@name='username' and @id='emails']")
	WebElement userEmail;
	
	
	@FindBy(css = "input[name='password']")
	WebElement userPasswordCSS;
	
	@FindBy(xpath = "//button[@id='login' and @name='login']")
	WebElement loginSubmit;
	
	@FindBy(xpath = "//h1[text()='Dashboard']")
	WebElement dashBoardHeader;
	
	@FindBy(xpath = "//a[@class='logo']")
	WebElement dashBoardLogo;
	
	public void loginValidation() {
		pause(3000);
		elementEnabled(loginHead);
		verifyTextOfTheWebElement(loginHead, "Login");
		clickElement(loginHead);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/accounts/login/");
		validationOfHeader(loginHeader, "Login into your account");
	}
	
	public void clickLoginSubmit() {
		pause(3000);
		clickElement(loginHead);
		pause(3000);
		elementDisplayed(userEmail);
		inputTextThenClickTab(userEmail, "ifzal.java2024@gmail.com");
		elementDisplayed(userPasswordCSS);
		inputText(userPasswordCSS, "Ifzal2024$");
		elementEnabled(loginSubmit);
		verifyTextOfTheWebElement(loginSubmit, "LOGIN");
		clickElement(loginSubmit);
		pause(5000);
		verifyTitle(driver, "Enthrall IT - Dashboard");
		verifyCurrentUrl(driver, "https://enthrallit.com/dashboard/");
		validationOfHeader(dashBoardHeader, "Dashboard");
		elementDisplayed(dashBoardLogo);
		clickElement(dashBoardLogo);
		pause(3000);
		
	}
	
	

}
