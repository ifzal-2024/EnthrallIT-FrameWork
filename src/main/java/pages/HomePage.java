package pages;
// EnthrallIT HomePage


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static common.CommonActions.*;

public class HomePage {
	public WebDriver driver;

	// parameterized constructor initialized when class in instantiated [object
	// created]
	public HomePage(WebDriver driver) {
		this.driver = driver;

		// PageFactory class help to instantiate WebElements
		// Important interview question
		PageFactory.initElements(driver, this);

	}
 
	@FindBy(name = "logo-link")
	WebElement logo;

	@FindBy(xpath = "//a[@name='login-link']")
	WebElement login;

	@FindBy(xpath = "//li[@name='home']")
	WebElement homElement;

	@FindBy(xpath = "//input[@name='username' and @id='emails']")
	WebElement userEmailElement;
	
	@FindBy(xpath = "//a[text()='Enroll now']")
	WebElement enrollNoWebElement;
	
	//CSS Other attribute
	@FindBy (css = "input[name='password']")
	WebElement passwordCSSElement;
	
	//CSS Compound class
	@FindBy(css = "li.nav-item.active") // Pass Test but not visible if it clicked login button or not
	WebElement home;
	
	public void clickLogo() throws InterruptedException {
		Thread.sleep(3000);
		logo.click();
		Thread.sleep(3000);

	}

	public void clicklogin() throws InterruptedException {
		Thread.sleep(3000);
		login.click();
		Thread.sleep(3000);
		userEmailElement.sendKeys("75025");
		
	}
	
	public void clickpassword () {
		pause(3000);
		clickElement(login);
		pause(3000);
		elementDisplayed(passwordCSSElement); 
		pause(3000);
		clickElement(passwordCSSElement);
		pause(3000);
	}

//Common Actions Pause and Click Used Here
	public void clickHome() {
		pause(3000);
		clickElement(homElement);
		pause(3000);

	}
	

	//Using Common Actions pause, SendKeys, clickElement
	public void userEmailInput () {
		pause(3000);
		clickElement(login);
		pause(3000);		
		inputText(userEmailElement, "ifzal@gmail.com");
		pause(3000);
		
	
	}
	
	public void ClickEnrollNow() {
		pause(3000);
		elementDisplayed(enrollNoWebElement);
		pause(3000);
		clickElement(enrollNoWebElement);
		pause(3000);
	}
	
	public void ClickhomeCSS() {
		pause(3000);
		elementEnabled(home);
		pause(3000);
		clickElement(home);
		pause(3000);
	}
	
	// LinkText and Partial LinkText not available on EnthrallIT Web Page
	
}
