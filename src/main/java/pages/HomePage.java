package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.model.SystemEnvInfo;
import com.aventstack.extentreports.reporter.configuration.Theme;

import static common.CommonActions.*;

import java.time.Duration;
import java.util.List;

import javax.xml.xpath.XPath;

//EnthrallIT HomePage
public class HomePage {
	public WebDriver driver;
	Dimension dimension;

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

	// ENroll Now Xpath Having compoundCLass
	// Pass
	@FindBy(xpath = "//a[@class='btn navapply-btn']")
	WebElement enrlNowXpaCompoundClass;

	@FindBy(xpath = "//li[@name='home']")
	WebElement homElement;

	@FindBy(xpath = "//input[@name='username' and @id='emails']")
	WebElement userEmailElement;

	// OuterEnroll Now
	@FindBy(xpath = "//a[text()='Enroll now']")
	WebElement enrollNoWebElement;

	// CSS Other attribute
	@FindBy(css = "input[name='password']")
	WebElement passwordCSSElement;

	// CSS Compound class
	@FindBy(css = "a.btn.navapply-btn") // Passed
	WebElement cSSEnrollNow;

	@FindBy(xpath = "//input[@id='login']")
	WebElement loginSubmitElement;

//@FindBy(xpath = "//li[@class='submenu active']") Compound class with Xpath Do not Work.
	@FindBy(xpath = "//span[text()='Automation']")
	WebElement automationElement;

	// Inner Enroll Now
	@FindBy(xpath = "//a[text()='Enroll Now']")
	WebElement enrollNowInner;

	@FindBy(xpath = "//button[text()='Mouse Hover Action']")
	WebElement mouseHover;

	@FindBy(xpath = "//input[@name='f_name']")
	WebElement firstname;

	@FindBy(xpath = "//input[@name='m_name']")
	WebElement middName;

	@FindBy(xpath = "//input[@name='l_name' and @class='form-control']")
	WebElement lastName;

	@FindBy(xpath = "//select[@name='i_am']")
	WebElement selectProfession;

	@FindBy(xpath = "//select[@name='course_wish_to_enroll']")
	WebElement selectCourse;

	// @FindBy(xpath = "//select[@id='id_i_am']/option") works too
	@FindBy(xpath = "//select[@name='i_am']/option")
	List<WebElement> selectProfessionList;

	@FindBy(xpath = "//input[@name='phone']")
	WebElement phoneNum;

	@FindBy(xpath = "//input[@id='id_email' and @name='email']")
	WebElement emailAddInner;

	@FindBy(xpath = "//input[@id='id_password']")
	WebElement passwordInner;

	@FindBy(xpath = "//select[@id='id_gender']")
	WebElement gender;

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

	// Worked
	public void clickEnrlNowxpaClassCompund() {
		pause(3000);
		clickElement(enrlNowXpaCompoundClass);
		pause(3000);

	}

	public void clickEnrollNowActive() {
		pause(3000);
		clickElement(enrollNowInner);
		pause(3000);

	}

	public void clickpassword() {
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

	// Using Common Actions pause, SendKeys, clickElement
	public void userEmailInput() {
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

	// CSS Compound Class (Passed)
	public void ClickEnrollNowCss() {
		pause(3000);
		elementEnabled(cSSEnrollNow);
		pause(3000);
		clickElement(cSSEnrollNow);
		pause(3000);
	}

	//Use of Assertion
	public void getMethodsOfThePage() {
		String actual = driver.getTitle();
		System.out.println("Title of the Page is: " + actual); // this line is not necessary
		String expected = "Enthrall IT";
		Assert.assertEquals(actual, expected, "Title doesn't match up");
		// if the Assertion [validation] fail, "Title doesn't match up" will show up

		// getCurrentUrl() is not used in homepage/landing page
		// if we direct to another page, then we have to use it
		String currentURL = driver.getCurrentUrl();
		System.out.println("Current URL: " + currentURL);
		String expectedURL = "https://enthrallit.com/";
		Assert.assertEquals(currentURL, expectedURL, "The driver failed to direct at right URL");

		// use of getText() in "login button"
		String actualTextPresntInTheWebElement = login.getText();
		System.out.println("Text Present as in Login ---> : " + actualTextPresntInTheWebElement);
		String expectedTextPresntInTheWebElement = "Login";
		Assert.assertEquals(actualTextPresntInTheWebElement, expectedTextPresntInTheWebElement,
				"The text present in the WebElement doesn't match");
	}

	// This is the first method used during automation framework
	// what is title?
	// what is the url?
	// is logo displayed?
	// here, method coming from common action
	public void loginValidation() {
		elementDisplayed(logo);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/");
		elementEnabled(login);
		verifyTextOfTheWebElement(login, "Login");
		pause(5000);
		clickElement(login);
		pause(5000);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/accounts/login/");
	}

	// Here We used User userEmailElement
	// getAttribute() method actually give us, the value of the Attribute,
	// raw use, in next method we will use from common action
	public void use_of_getAttribute_method() {
		pause(3000);
		elementEnabled(login);
		clickElement(login);
		pause(2000);
		elementSelected(userEmailElement);
		String ml = userEmailElement.getAttribute("maxlength");
		System.out.println("The value of the maxlength attribute is: " + ml);
		// another example
		String ac = userEmailElement.getAttribute("autocomplete");
		System.out.println("The value of the autocomplete attribute is: " + ac);
	}

	// use of clear(), use of Enter key
	public void use_of_enterKey_in_login() {
		pause(3000);
		clickElement(login);
		pause(3000);
		elementDisplayed(userEmailElement);
		inputText(userEmailElement, "shoma@jimshim");
		pause(3000);
		clearTextFromTheField(userEmailElement);
		pause(3000);
		inputText(userEmailElement, "ifzal.java2024@gmail.com");
		pause(3000);
		elementDisplayed(passwordCSSElement);
		inputText(passwordCSSElement, "Abul Biri");
		pause(3000);
		clearTextFromTheField(passwordCSSElement); // new here
		pause(3000);
		inputTextThenClickEnter(passwordCSSElement, "Ifzal2024$"); // Send Keys + Keys.enter TODO : Able to Login Directly
		pause(5000);

	}
	
	//Login USing JavascriptExecutor
	//Use javascriptExecutor for click and sendKeys
	public void login_by_javaScript() {
		elementDisplayed(login);
		clickUsingJavascriptExecutor(driver, login);
		pause(1000);
		inputTextUsingJavascriptExecutor(driver, "arguments[0].value='ifzal.java2024@gmail.com' ", userEmailElement);
		pause(3000);
		inputTextUsingJavascriptExecutor(driver, "arguments[0].value='Ifzal2024$' ", passwordCSSElement);
		pause(2000);
		clickUsingJavascriptExecutor(driver, loginSubmitElement);
		pause(2000);
		
	}

	public void use_of_navigate_method() { // navigate().back(), navigate().forward(),navigate().refrresh()
		pause(3000);
		driver.navigate().to("https://www.google.com/");
		pause(2000);
		driver.manage().window().fullscreen();
		pause(3000);
		driver.navigate().back();
		pause(2000);
		driver.navigate().forward();
		pause(2000);
		driver.navigate().refresh();
		pause(2000);
		driver.findElement(By.id("APjFqb")).sendKeys("Today's weather", Keys.ENTER);
		pause(3000);
		driver.manage().window().fullscreen();
		pause(5000);
	}

	public void enrollNowInner() {
		pause(2000);
		clickElement(login);
		pause(2000);
		inputText(userEmailElement, "ifzal.java2024@gmail.com");
		pause(2000);
		inputText(passwordCSSElement, "Ifzal2024$");
		pause(2000);
		clickElement(loginSubmitElement);
		pause(2000);
		clickElement(automationElement);
		pause(2000);
		switchToChildWindow(driver, mouseHover, enrollNowInner);
		pause(2000);
		inputTextThenClickTab(firstname, "John"); // Use of Tab Key
		pause(2000);
		inputTextThenClickTab(middName, "Alexander"); // Use of tab key
		pause(2000);
		inputTextThenClickTab(lastName, "Smith");
		pause(2000);
		selectElelementFromDropdownOnebyOne(selectProfession, selectProfessionList);
		pause(2000);
		selectDropdown(selectProfession, "a Student");
		pause(2000);
		selectDropdown(selectCourse, "Python");
		pause(2000);
		inputTextThenClickTab(phoneNum, "9894556458");
		pause(2000);
		inputTextThenClickTab(emailAddInner, "johnsmith@gmail.com");
		pause(2000);
		inputTextThenClickTab(passwordInner, "Passwordd1$");
		pause(2000);
		selectDropdown(gender, "Male");
		pause(2000);

	}
	
	public void firstName() {
		driver.get("https://enthrallit.com/course/dashboard/enrolls/");
	pause(3000);
	
	}
	
	//USe of Hover over, Navigate , Dimensions
	public void pennEnrollment() { // HoverOver, Navigate, verifyUrl, 
		pause(2000);
		driver.navigate().to("https://www.enrollnow.net/en");
		pause(2000);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		driver.manage().window().fullscreen();
		WebElement choose=driver.findElement(By.xpath("//span[text()='Choose']"));
		choose.isDisplayed();
		Actions actions = new Actions(driver);
		actions.moveToElement(choose).build().perform();
		pause(10000);
		driver.findElement(By.xpath("//a[text()='Find a hospital']")).click();
		pause(3000);
	verifyCurrentUrl(driver,"https://www.enrollnow.net/en/find-hospital");
		pause(2000);
		driver.findElement(By.xpath("//p[text()='Enroll in or change a health plan, or check your case']")).click();
		pause(2000);
		driver.findElement(By.xpath("//u[text()='Get started']")).click();
		pause(5000);
	}
	
	//Use of Dimension class
	public void set_specific_size_for_window() {
		pause(3000);
		System.out.println("The size of the Enthrall screen is: " + driver.manage().window().getSize());
		dimension=new Dimension(900, 600);
		driver.manage().window().setSize(dimension);
		pause(5000);
		System.out.println("The new set size for Enthrall Screen is: "+ driver.manage().window().getSize());
		
	}
	
	//Pushing to day06 - No changes
		

}
