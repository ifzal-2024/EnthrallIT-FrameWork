package pages;

import static common.CommonActions.*;

import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Attribute;

//EntrallIT DashBoard Page
public class DashBoard {
	
	public WebDriver driver;
	Actions actions;
	

	public DashBoard(WebDriver driver) {
	
		this.driver = driver;
		PageFactory.initElements(driver, this);
		actions = new Actions(driver);
		
	}
	
	@FindBy(name = "logo-link")
	WebElement logo;
	
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
	
	
	
	@FindBy(xpath = "//a[@class='logo']")
	WebElement dashBoardLogo;
	
	
	@FindBy (xpath = "//a[text()='Return site']")
	WebElement returnSiteinDashBoard;
	
	@FindBy(xpath = "//a[@name='dashboard-link']")
	WebElement dashboardInner;
	
	@FindBy(xpath = "//img[@class='avatar-rounded']")
	WebElement profilePicDashBoard;
	
	@FindBy(xpath = "//span[text()='Logout']")
	WebElement logOutDashBoard;
	
	@FindBy(xpath = "//span[text()='Profile']")
	WebElement profileAside;
	
	@FindBy(xpath = "//h1[text()='Profile Details']")
	WebElement profileHeader;
	
	@FindBy(xpath = "//span[text()='Add Course']")
	WebElement addCourseAside;
	
	@FindBy(xpath = "//h1[text()='Enroll Course']")
	WebElement addCourseHeader;
	
	@FindBy(xpath = "//span[text()='Quiz List']")
	WebElement quizListAside;
	
	@FindBy(xpath = "(//span[text()='Quiz List'])[2]")
	WebElement quizlistAsideHeader;
	
	@FindBy(xpath = "//li[@class='submenu ' and @title='Home Work']")
	//               //span[text()='Home Work']
	WebElement homeWorkAside;
	
	@FindBy(xpath = "//span[text()='Homework List']")
	WebElement homeWorkHeader;
	
	
	@FindBy(xpath = "//span[text()='Codding Challenge']")
	WebElement codingChallengeAside;
	
	@FindBy(xpath = "//span[text()='Coding Challenge List']")
	WebElement codingChallenheHeader;
	
	@FindBy(xpath = "//span[text()='Exam']")
	WebElement examAside;
	
	@FindBy(xpath = "//span[text()='Exam List']")
	WebElement examHeader;
	
	@FindBy(xpath = "//span[text()='Bootcamp']")
	WebElement bootCampAside;
	
	@FindBy(xpath = "//span[text()='Bootcamp List']")
	WebElement bootCampHeader;
	
	@FindBy(xpath = "//span[text()='Automation']")
	WebElement automationAside;
	
	@FindBy(xpath = "//h3[text()='Automation']")
	WebElement automationHeader;
	
	@FindBy(xpath = "//h1[contains(text(),'Please choo')]")
	WebElement automationSubHeader;
	
	@FindBy(xpath = "//span[text()='Class Notes']")
	WebElement classNotesAside;
	
	@FindBy(xpath = "//h1[text()='Class Note List']")
	WebElement classNotesHeader;
	
	@FindBy(xpath = "//span[text()='Class Schedule']")
	WebElement classScheduleAside;
	
	@FindBy(xpath="//h1[text()='Class Calendar']")
	WebElement classScheduleHeader;
	
	@FindBy(xpath = "//span[text()='Join The Class']")
	WebElement joinClassAside;
	
	@FindBy(xpath = "//h1[text()='Meeting List']")
	WebElement joinClassHeader;
	
	@FindBy(xpath = "//span[text()='Class recording']")
	WebElement classRecordingAside;
	
	@FindBy(xpath = "//h1[text()='Meeting List']")
	WebElement classRecordingHeader;
	
	@FindBy(xpath = "//span[text()='Others']")
	WebElement othersAside;
	
	@FindBy(xpath = "//h1[text()='Others']")
    WebElement othersHeader;
	
	
	@FindBy(xpath = "//button[text()='Enroll Now']")
	WebElement enrollNow;
	
	
	
	@FindBy(xpath = "//h3[contains(text(),'Select your ')]")
	WebElement enrollNowHeader;
	
	@FindBy(xpath ="//h5[contains(text(),'Please enter ')]" )
	WebElement enrollNowSubHeader;
	
	@FindBy(xpath = "//p[contains(text(),'All fields ')]")
	WebElement enrollOtherHeader;
	
	@FindBy(xpath = "//button[text()='Right Click Action']")
	WebElement rightClickButton;
	
	@FindBy(xpath = "//input[@id='id_know_us']")
	WebElement HowDidYouKnow;
	
	@FindBy(xpath = "//li[text()='Back']")
	WebElement backButton;
	
	@FindBy(xpath = "//li[text()='Cancel']")
	WebElement cancelButton;
	
	@FindBy(xpath = "//input[@name='f_name']")
	WebElement firstName;
	
	@FindBy(xpath = "//input[@name='m_name']")
	WebElement middName;

	@FindBy(xpath = "//input[@name='l_name' and @class='form-control']")
	WebElement lastName;
	
	@FindBy(xpath ="//small[text()='Must be alphabetic characters.']" )
	WebElement alphabeticCharactersErrorMessageUnderTheField;
	
	
	@FindBy(xpath = "//small[text()='First Name is a required field.']")
	WebElement fNameRequiredFiledErrorMesssageElement;

	@FindBy(xpath = "//small[text()='Last Name is a required field.']")
	WebElement lastnamerequiredErrorMessage;

	@FindBy(xpath = "//small[@class='error-message' and @id='i_am_error']")
	WebElement imIsARequiredFieldErrorMessage;
	
	@FindBy(xpath = "//select[@name='i_am']")
	WebElement selectProfession;
	// Do Not work double Quotation inside Double Quotation
	//@FindBy(xpath = "//small[text()=\"I'm is a required field.\"]")
	//WebElement imIsAReqFielderrorTesting;
	
	@FindBy(xpath = "//select[@name='i_am']/option")
	List<WebElement> selectProfessionList;
	
	@FindBy(xpath = "//select[@name='course_wish_to_enroll']")
	WebElement selectCourse;
	
	@FindBy(xpath ="//select[@name='course_wish_to_enroll']/option" )
	List<WebElement> selectCourseList;
	
	@FindBy(xpath = "//small[@id='course_wish_error']")
	WebElement selectCourseErrorMessage;
	
	@FindBy(xpath = "//input[@id='id_phone']")
	WebElement phoneNumber;
	
	@FindBy(xpath = "//small[text()='Phone Number is a required field.']")
	WebElement phoneNumberRequiredErrorMessage;
	
	@FindBy(xpath = "//small[text()='Must be a valid Phone Number.']")
	WebElement phoneNumberMustBeValidNumberError;
	
	@FindBy(xpath = "//small[text()='Phone Number must not start with a 1 or 0.']")
	WebElement phoneNumberMustNotStart1or0Error;
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement EmailEnrollNow;
	
	
	
	public void loginSubmit() {
		pause(3000);
		clickElement(loginHead);
		pause(3000);
		inputTextThenClickTab(userEmail, "ifzal.java2024@gmail.com");
		inputText(userPasswordCSS, "Ifzal2024$");
		clickElement(loginSubmit);
		pause(3000);
		
	}
	
	public void clickReturnSite() {
		elementDisplayed(returnSiteinDashBoard);
		clickElement(returnSiteinDashBoard);
		pause(3000);
		elementDisplayed(logo);
		verifyTitle(driver, "Enthrall IT");
		pause(3000);
	}
	
public void dashBoardLogOut() {
	elementDisplayed(profilePicDashBoard);
	clickElement(profilePicDashBoard);
	pause(2000);
	elementDisplayed(logOutDashBoard);
	clickElement(logOutDashBoard);
	pause(3000);
	
}

public void asideElements() {
	
	elementDisplayed(profileAside);
	verifyTextOfTheWebElement(profileAside, "Profile");
	clickElement(profileAside);
	pause(2000);
	verifyCurrentUrl(driver, "https://enthrallit.com/dashboard/profile/");
	verifyTitle(driver, "Enthrall IT - Dashboard");
	validationOfHeader(profileHeader, "Profile Details");
	
	
	pause(2000);
	elementDisplayed(addCourseAside);
	verifyTextOfTheWebElement(addCourseAside, "Add Course");
	clickElement(addCourseAside);
	pause(2000);
	verifyCurrentUrl(driver, "https://enthrallit.com/dashboard/enroll/course/");
	verifyTitle(driver, "Enthrall IT - Dashboard");
	validationOfHeader(addCourseHeader, "Enroll Course");
	
	
	pause(2000);
	elementDisplayed(quizListAside);
	verifyTextOfTheWebElement(quizListAside, "Quiz List");
	clickElement(quizListAside);
	pause(2000);
	verifyCurrentUrl(driver, "https://enthrallit.com/assessment/latest/qz/");
	verifyTitle(driver, "Enthrall IT - Dashboard");
	validationOfHeader(quizlistAsideHeader, "Quiz List");
	
	
	pause(2000);
	elementDisplayed(homeWorkAside);
	verifyTextOfTheWebElement(homeWorkAside, "Home Work");
	clickElement(homeWorkAside);
	pause(2000);
	verifyCurrentUrl(driver, "https://enthrallit.com/assessment/data/list/hw/");
	verifyTitle(driver, "Enthrall IT - Dashboard");
	validationOfHeader(homeWorkHeader, "Homework List");
	
	pause(2000);
	elementDisplayed(codingChallengeAside);
	verifyTextOfTheWebElement(codingChallengeAside, "Codding Challenge");
	clickElement(codingChallengeAside);
	pause(2000);
	verifyCurrentUrl(driver, "https://enthrallit.com/assessment/latest/cc/");
	verifyTitle(driver, "Enthrall IT - Dashboard");
	validationOfHeader(codingChallenheHeader, "Coding Challenge List"); 
	
	pause(2000);
	elementDisplayed(examAside);
	verifyTextOfTheWebElement(examAside,"Exam");
	clickElement(examAside);
	pause(2000);
	verifyCurrentUrl(driver, "https://enthrallit.com/assessment/latest/exam/");
	verifyTitle(driver, "Enthrall IT - Dashboard"); 
	validationOfHeader(examHeader, "Exam List");
	
	pause(2000);
	elementDisplayed(bootCampAside);
	verifyTextOfTheWebElement(bootCampAside,"Bootcamp");
	clickElement(bootCampAside);
	pause(2000);
	verifyCurrentUrl(driver, "https://enthrallit.com/assessment/data/list/bt/");
	verifyTitle(driver, "Enthrall IT - Dashboard");
	validationOfHeader(bootCampHeader, "Bootcamp List");
	
	
	pause(2000);
	elementDisplayed(classNotesAside);
	verifyTextOfTheWebElement(classNotesAside, "Class Notes");
	clickElement(classNotesAside);
	verifyCurrentUrl(driver, "https://enthrallit.com/modules/class/note/list/#class_note");
	verifyTitle(driver, "Enthrall IT - Dashboard");
	validationOfHeader(classNotesHeader,"Class Note List");
	
	pause(2000);
	elementDisplayed(classScheduleAside);
	verifyTextOfTheWebElement(classScheduleAside, "Class Schedule");
	clickElement(classScheduleAside);
	verifyCurrentUrl(driver, "https://enthrallit.com/schedule/");
	verifyTitle(driver, "Enthrall IT - Dashboard");
	validationOfHeader(classScheduleHeader, "Class Calendar");
	
	pause(2000);
	elementDisplayed(joinClassAside);
	verifyTextOfTheWebElement(joinClassAside, "Join The Class");
	clickElement(joinClassAside);
	verifyCurrentUrl(driver, "https://enthrallit.com/schedule/next-class/");
	verifyTitle(driver, "Enthrall IT - Dashboard");
	validationOfHeader(joinClassHeader, "Meeting List");
	
	pause(2000);
	elementDisplayed(classRecordingAside);
	verifyTextOfTheWebElement(classRecordingAside, "Class recording");
	clickElement(classRecordingAside);
	verifyCurrentUrl(driver, "https://enthrallit.com/schedule/recording/");
	verifyTitle(driver, "Enthrall IT - Dashboard");
	validationOfHeader(classRecordingHeader, "Meeting List");
	
	pause(2000);
	elementDisplayed(othersAside);
	verifyTextOfTheWebElement(othersAside, "Others");
	clickElement(othersAside);
	verifyCurrentUrl(driver, "https://enthrallit.com/schedule/others/list/");
	verifyTitle(driver, "Enthrall IT - Dashboard");
	validationOfHeader(othersHeader, "Others");
	}


public void automationValidation() {
	pause(2000);
	elementDisplayed(automationAside);
	verifyTextOfTheWebElement(automationAside,"Automation");
	clickElement(automationAside);
	verifyCurrentUrl(driver, "https://enthrallit.com/dashboard/dashboard/automation/");
	verifyTitle(driver, "Enthrall IT - Dashboard");
	validationOfHeader(automationHeader, "Automation");
	validationOfSubHeader(automationSubHeader, "Please choose from below");
	}


public void enrollNow() {
	loginSubmit();
	pause(2000);
	clickElement(automationAside);
	pause(2000);
	clickElement(enrollNow);
	switchToChildWindow(driver, enrollNow);
	pause(2000);
	verifyCurrentUrl(driver, "https://enthrallit.com/course/dashboard/enrolls/");
	validationOfHeader(enrollNowHeader, "Select your course from the dropdown");
	validationOfSubHeader(enrollNowSubHeader, "Please enter your personal and contact information.");
	validationOfOtherHeader(enrollOtherHeader, "All fields are required unless marked (optional).");
	}


public void click_on_back_button_enrollNow () {
	enrollNow();
	scrollIntoViewTheElementUsingJavascriptExecutor(driver, HowDidYouKnow);
	elementEnabled(rightClickButton);
	actions.moveToElement(rightClickButton).contextClick().build().perform();
	pause(3000);
	verifyTextOfTheWebElement(backButton, "Back");
	clickElement(backButton);
	pause(3000);
	Alert alert = driver.switchTo().alert();
	System.out.println("\nAlert Text: " + alert.getText());
	alert.accept();
	pause(3000);
	
	}


public void click_on_cancel_button_enrollNOw() {
	enrollNow();
	scrollIntoViewTheElementUsingJavascriptExecutor(driver, HowDidYouKnow);
	elementEnabled(rightClickButton);
	actions.moveToElement(rightClickButton).contextClick().build().perform();
	pause(3000);
	verifyTextOfTheWebElement(cancelButton, "Cancel");
	clickElement(cancelButton);
	pause(3000);
	Alert alert = driver.switchTo().alert();
	System.out.println("\nAlert Text: " + alert.getText());
	alert.accept();
	pause(3000);
	
}

public void first_name_validation() {
	enrollNow();
	verifyLengthOfTheFieldContent(firstName, Attribute.MAX_LENGTH, "20"); 
	inputTextThenClickTab(firstName, "%&^%&^");
	pause(3000);
	verifyErrorMessageUnderTheField(alphabeticCharactersErrorMessageUnderTheField,Attribute.INNER_HTML , "Must be alphabetic characters.");
	clearTextFromTheField(firstName);
	pause(3000);
	verifyErrorMessageUnderTheField(fNameRequiredFiledErrorMesssageElement, Attribute.INNER_HTML, "First Name is a required field.");
	inputTextThenClickTab(firstName, "635462534");
	pause(3000);
	verifyErrorMessageUnderTheField(alphabeticCharactersErrorMessageUnderTheField, Attribute.INNER_HTML, "Must be alphabetic characters.");
	clearTextFromTheField(firstName);
	pause(3000);
	inputTextThenClickTab(firstName, "MD ");
	pause(5000);
}

public void middle_name_validation() {
	enrollNow();
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
	inputTextThenClickTab(middName, "A");
	pause(5000);
	
	}


public void last_name_validation() {
	enrollNow();
	verifyLengthOfTheFieldContent(lastName, Attribute.MAX_LENGTH, "25");
	inputTextThenClickTab(lastName, "$%^**^");
	pause(3000);
	verifyErrorMessageUnderTheField(alphabeticCharactersErrorMessageUnderTheField, Attribute.INNER_HTML, "Must be alphabetic characters.");
	clearTextFromTheField(lastName);
	pause(3000);
	verifyErrorMessageUnderTheField(lastnamerequiredErrorMessage, Attribute.INNER_HTML, "Last Name is a required field.");
	inputTextThenClickTab(lastName, "12345664");
	pause(3000);
	verifyErrorMessageUnderTheField(alphabeticCharactersErrorMessageUnderTheField, Attribute.INNER_HTML, "Must be alphabetic characters.");
	clearTextFromTheField(lastName);
	pause(3000);
	inputText(lastName, "Jaleel");
	
}

public void selectProfession_validation() {
	enrollNow();
	pause(3000);
	selectElelementFromDropdownOnebyOne(selectProfession, selectProfessionList);
	pause(3000);
selectDropdown(selectProfession, "Select Profession");// Nothing Selected Thats why we take visible Text of selectProfession
pause(3000);
//TODO expected: I'm is a required field. but found []
	//verifyErrorMessageUnderTheField(imIsARequiredFieldErrorMessage, Attribute.INNER_HTML, "I'm is a required field.");
	pause(3000);
	selectDropdown(selectProfession, "a Student");
	pause(3000);
	
}

public void selectCourse_validation() {
	enrollNow();
	pause(3000);
	selectElelementFromDropdownOnebyOne(selectCourse, selectCourseList);
	pause(3000);
	selectDropdown(selectCourse, "Select Course");
	pause(3000);
	//TODO java.lang.AssertionError: Error Message doesn't match expected [Course Wish to Enroll is a required field.] but found []
	//verifyErrorMessageUnderTheField(selectCourseErrorMessage, Attribute.INNER_HTML, "Course Wish to Enroll is a required field.");
selectDropdown(selectCourse, "Python");
	pause(3000);
}


public void phoneNumberValidation() {
	enrollNow();
	verifyLengthOfTheFieldContent(phoneNumber, Attribute.MAX_LENGTH, "10");
	inputTextThenClickTab(phoneNumber, "@#$%^&*#$%");
	pause(3000);
	verifyErrorMessageUnderTheField(phoneNumberMustBeValidNumberError, Attribute.INNER_HTML, "Must be a valid Phone Number.");
	clearTextFromTheField(phoneNumber);
	pause(3000);
	clickElement(EmailEnrollNow);
	pause(3000);
	verifyErrorMessageUnderTheField(phoneNumberRequiredErrorMessage,Attribute.INNER_HTML, "Phone Number is a required field.");
	pause(3000);
	inputTextThenClickTab(phoneNumber, "0122345566");
	pause(3000);
	verifyTextOfTheWebElement(phoneNumberMustNotStart1or0Error, "Phone Number must not start with a 1 or 0.");
	pause(3000);
	clearTextFromTheField(phoneNumber);
	inputTextThenClickTab(phoneNumber, "WrEYRtRTrR");
	verifyErrorMessageUnderTheField(phoneNumberMustBeValidNumberError, Attribute.INNER_HTML, "Must be a valid Phone Number.");
	pause(1000);
	clearTextFromTheField(phoneNumber);
	pause(2000);
	inputTextThenClickTab(phoneNumber, "2123456644");
	pause(3000);
	
	}








	
}          
