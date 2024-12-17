package pages;



import static common.CommonActions.clickElement;
import static common.CommonActions.elementDisplayed;
import static common.CommonActions.elementEnabled;
import static common.CommonActions.inputText;
import static common.CommonActions.inputTextThenClickTab;
import static common.CommonActions.pause;
import static common.CommonActions.switchToChildWindow;
import static common.CommonActions.validationOfHeader;
import static common.CommonActions.validationOfOtherHeader;
import static common.CommonActions.validationOfSubHeader;
import static common.CommonActions.verifyCurrentUrl;
import static common.CommonActions.verifyTitle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Attribute;

import static common.CommonActions.*;

//EnthrallIT
public class EnrollmentValidation {
	
	public WebDriver driver;

	public EnrollmentValidation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[@name='login-link']")
	WebElement login;
	
	@FindBy(xpath = "//input[@name='username' and @id='emails']")
	WebElement userEmailElement;
	
	//CSS Other attribute
	@FindBy(css = "input[name='password']")
	WebElement passwordCSSElement;
	
	@FindBy(xpath = "//input[@id='login']")
	WebElement loginSubmitElement;
	
	// @FindBy(xpath = "//li[@class='submenu active']") Compound class with Xpath Do
		// not Work.
		@FindBy(xpath = "//span[text()='Automation']")
		WebElement automationElement;

		// Inner Enroll Now
		@FindBy(xpath = "//a[text()='Enroll Now']")
		WebElement enrollNowInner;
		
		@FindBy(xpath = "//button[text()='Mouse Hover Action']")
		WebElement mouseHover;

		@FindBy(xpath = "//h3[contains(text(), 'Select')]")
		WebElement enrollNowInnerHeader;

		@FindBy(xpath = "//h5[contains(text(),'Please')]")
		WebElement enrollNowInnerSubHeader;

		@FindBy(xpath = "//p[contains(text(), 'All')]")
		WebElement enrollNowInnerOtherHeader;

		@FindBy(xpath = "//input[@name='f_name']")
		WebElement firstname;

		@FindBy(xpath = "//input[@name='m_name']")
		WebElement middName;

		@FindBy(xpath = "//input[@name='l_name' and @class='form-control']")
		WebElement lastName;
		
		@FindBy(xpath ="//small[text()='Must be alphabetic characters.']" )
		WebElement alphabeticCharactersErrorMessageUnderTheField;
		
		
		@FindBy(xpath = "//small[text()='First Name is a required field.']")
		WebElement fNameRequiredFiledErrorMesssageElement;

		
		
		public void loginEnrollNowAndValidation() { 
			pause(2000);
			clickElement(login);
			pause(2000);
			inputTextThenClickTab(userEmailElement, "ifzal.java2024@gmail.com");
			pause(2000);
			inputText(passwordCSSElement, "Ifzal2024$");
			pause(2000);
			elementEnabled(loginSubmitElement);
			pause(2000);
			clickElement(loginSubmitElement);
			pause(2000);
			elementDisplayed(automationElement);
			pause(2000);
			clickElement(automationElement);
			pause(2000);
			switchToChildWindow(driver, mouseHover, enrollNowInner);
			pause(3000);
			validationOfHeader(enrollNowInnerHeader, "Select your course from the dropdown");
			validationOfSubHeader(enrollNowInnerSubHeader, "Please enter your personal and contact information.");
			validationOfOtherHeader(enrollNowInnerOtherHeader, "All fields are required unless marked (optional).");
			verifyTitle(driver, "Enthrall IT - Dashboard");
			verifyCurrentUrl(driver, "https://enthrallit.com/course/dashboard/enrolls/");
			}
		
		public void first_name_validation() {
			loginEnrollNowAndValidation();
			verifyLengthOfTheFieldContent(firstname, Attribute.MAX_LENGTH, "20");
			inputTextThenClickTab(firstname, "%&^%&^");
			pause(3000);
			verifyErrorMessageUnderTheField(alphabeticCharactersErrorMessageUnderTheField,Attribute.INNER_HTML , "Must be alphabetic characters.");
			clearTextFromTheField(firstname);
			pause(3000);
			verifyErrorMessageUnderTheField(fNameRequiredFiledErrorMesssageElement, Attribute.INNER_HTML, "First Name is a required field.");
			inputTextThenClickTab(firstname, "635462534");
			pause(3000);
			verifyErrorMessageUnderTheField(alphabeticCharactersErrorMessageUnderTheField, Attribute.INNER_HTML, "Must be alphabetic characters.");
			clearTextFromTheField(firstname);
			pause(3000);
			inputTextThenClickTab(firstname, "Muhammad ");
			pause(5000);
		}
		
		public void middle_name_validation() {
			loginEnrollNowAndValidation();
			verifyLengthOfTheFieldContent(middName, Attribute.MAX_LENGTH, "20");
			inputTextThenClickTab(middName, "*&^%$#");
			pause(3000);
			verifyErrorMessageUnderTheField(alphabeticCharactersErrorMessageUnderTheField, Attribute.INNER_HTML, "Must be alphabetic characters.");
			clearTextFromTheField(middName);
			pause(3000);
			inputTextThenClickTab(middName, "12365879");
			pause(3000);
			verifyErrorMessageUnderTheField(alphabeticCharactersErrorMessageUnderTheField, Attribute.INNER_HTML, "Must be alphabetic characters.");
			clearTextFromTheField(middName);
			pause(3000);
			inputTextThenClickTab(middName, "Abdul");
			pause(5000);
			
			
			
			
			
		}
		
		
		
}
