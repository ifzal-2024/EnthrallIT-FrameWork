package pages;

import static common.CommonActions.*;
import static common.CommonWaits.*;

import java.util.List;

import javax.xml.xpath.XPath;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.ElementClickInterceptedException;
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

	@FindBy(xpath = "//a[text()='Return site']")
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
	// //span[text()='Home Work']
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

	@FindBy(xpath = "//h1[text()='Class Calendar']")
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

	@FindBy(xpath = "//h5[contains(text(),'Please enter ')]")
	WebElement enrollNowSubHeader;

	@FindBy(xpath = "//p[contains(text(),'All fields ')]")
	WebElement enrollOtherHeader;

	@FindBy(xpath = "//button[text()='Right Click Action']")
	WebElement rightClickButton;

	@FindBy(xpath = "//li[text()='Back']")
	WebElement backButton;

	@FindBy(xpath = "//li[text()='Cancel']")
	WebElement cancelButton;

	@FindBy(xpath = "//button[text()='Accept']")
	WebElement backAndCancelAcceptButton;

	@FindBy(xpath = "//input[@name='f_name']")
	WebElement firstName;

	@FindBy(xpath = "//input[@name='m_name']")
	WebElement middName;

	@FindBy(xpath = "//input[@name='l_name' and @class='form-control']")
	WebElement lastName;

	@FindBy(xpath = "//small[text()='Must be alphabetic characters.']")
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
	// @FindBy(xpath = "//small[text()=\"I'm is a required field.\"]")
	// WebElement imIsAReqFielderrorTesting;

	@FindBy(xpath = "//select[@name='i_am']/option")
	List<WebElement> selectProfessionList;

	@FindBy(xpath = "//select[@name='course_wish_to_enroll']")
	WebElement selectCourse;

	@FindBy(xpath = "//select[@name='course_wish_to_enroll']/option")
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
	WebElement emailDashboard;

	// TODO Below Both Same ID value but its able to find it via the InnerText of
	// the WebElement.
	@FindBy(xpath = "//span[@id='email_error']")
	WebElement EmailAdressIsRequiredError;

	@FindBy(xpath = "//span[@id='email_error']")
	WebElement mustBeValidEmailerror;

	@FindBy(xpath = "//input[@id='id_password']")
	WebElement passwordDashboard;

	@FindBy(xpath = "//i[@id='password-icon']")
	WebElement passwordEyeIcon;

	@FindBy(xpath = "//div[@id='password-requirements']")
	WebElement passWordHelpMessage;

	@FindBy(xpath = "//span[@id='password_error']")
	WebElement passwordRequiredFieldError;

	@FindBy(xpath = "//span[@id='password_error']")
	WebElement PasswordMustContain8CharactersError;

	@FindBy(xpath = "//span[@id='password_error']")
	WebElement PleaseReferToPasswordReqError;

	@FindBy(xpath = "//select[@id='id_gender']")
	WebElement genderDashBoard;

	@FindBy(xpath = "//select[@id='id_gender']/option")
	List<WebElement> genderDashBoardList;

	@FindBy(xpath = "//input[@id='id_image']")
	WebElement personalImageDashBoard;

	@FindBy(xpath = "//span[@id='image_error']")
	WebElement personalImageRequiredError;

	@FindBy(xpath = "//input[@name='photo_id']")
	WebElement photoIdDashboard;

	@FindBy(xpath = "//span[@id='photo_id_error']")
	WebElement photoIdIsRequiredError;

	@FindBy(xpath = "//select[@id='id_birth_year']")
	WebElement selectBirthYearDashboard;

	@FindBy(xpath = "//select[@id='id_birth_year']/option")
	List<WebElement> selectBirthYearList;

	@FindBy(xpath = "//span[@id='birthYearError']")
	WebElement birthYearRequiredError;

	@FindBy(xpath = "//select[@id='id_birth_month']")
	WebElement selectbirthMonthDashboard;

	@FindBy(xpath = "//select[@id='id_birth_month']/option")
	List<WebElement> selectBirthMonthDashboardList;

	@FindBy(xpath = "//span[@id='birthMonthError']")
	WebElement birthMonthRequiredError;

	@FindBy(xpath = "//select[@name='birth_date']")
	WebElement selectBirthDate;

	@FindBy(xpath = "//select[@name='birth_date']/option")
	List<WebElement> selectBirthDateList;

	@FindBy(xpath = "//span[@id='birthDateError']")
	WebElement birthDateRequiredError;

	@FindBy(xpath = "//input[@id='id_home_address_line_1']")
	WebElement homeAddressLine1Dashboard;

	@FindBy(xpath = "//span[@id='home_address_error']")
	WebElement homeAddressLine1MustBeAlphaNumericCharactersError;

	@FindBy(xpath = "//span[@id='home_address_error']")
	WebElement homeAddressLine1RequiredFieldError;

	@FindBy(xpath = "//input[@id='id_home_address_line_2']")
	WebElement homeAddressLine2DashBoard;

	@FindBy(xpath = "//span[@id='home_address_line_2_error']")
	WebElement homeAddressLine2MustBeAlphaNumericCharactersError;

	@FindBy(xpath = "//input[@id='id_city']")
	WebElement cityDashBoad;

	@FindBy(xpath = "//span[@id='city_error']")
	WebElement cityisRequiredError;

	@FindBy(xpath = "//span[@id='city_error']")
	WebElement cityMustBeAlhpabeticCharError;

	@FindBy(xpath = "//select[@id='id_state']")
	WebElement selectState;

	@FindBy(xpath = "//select[@id='id_state']/option")
	List<WebElement> selectStateList;

	@FindBy(xpath = "//span[@id='stateerror']")
	WebElement stateIsRequiredError;

	@FindBy(xpath = "//input[@id='id_zip_code']")
	WebElement zipCodeDashBoard;

	@FindBy(xpath = "//span[@id='zip_code_error']")
	WebElement zipCodeMustBeAvalidNumericZipCodeError;

	@FindBy(xpath = "//span[@id='zip_code_error']")
	WebElement zipCodeRequiredFieldError;

	@FindBy(xpath = "//select[@id='id_immigration_status']")
	WebElement selectImmigrationStatus;

	@FindBy(xpath = "//select[@id='id_immigration_status']/option")
	List<WebElement> selectImmigrationStatusList;

	@FindBy(xpath = "//input[@id='id_arrival_date']")
	WebElement dateOfArrival;

	@FindBy(xpath = "//span[@id='arrival_date_error']")
	WebElement dateOfArrivalMustBeAlphaNumericError;

	@FindBy(xpath = "//input[@id='id_emergency_contact']")
	WebElement emergencyContact;

	@FindBy(xpath = "//span[@id='emergency_contact_error']")
	WebElement emergencyContactNusBeAlhpanumericError;

	@FindBy(xpath = "//input[@id='id_know_us']")
	WebElement howDidYouKNowAboutEnthrallIT;

	@FindBy(xpath = "//span[@id='how_did_you_know_error']")
	WebElement howDidYouKNowMustBeAlphabeticCharactErrorMessage;

	@FindBy(xpath = "//select[@id='id_highest_education']")
	WebElement highestEducation;

	@FindBy(xpath = "//select[@id='id_highest_education']/option")
	List<WebElement> highestEducationList;

	@FindBy(xpath = "//select[@id='id_country_of_origin']")
	WebElement selectCountryOfOrigin;

	@FindBy(xpath = "//select[@id='id_country_of_origin']/option")
	List<WebElement> selectCountryOfOriginList;

	@FindBy(xpath = "//input[@id='selected_language']")
	WebElement primaryLanguageHover;

	@FindBy(xpath = "//div[text()='English']")
	WebElement primaryLanguageEnglish;

	@FindBy(xpath = "//input[@id='id_sign_by_name']")
	WebElement signature;

	@FindBy(xpath = "//span[@id='signature_error']")
	WebElement signatureIsArequiredFieldErrorElement;

	@FindBy(xpath = "//span[@id='signature_error']")
	WebElement signaturePleaseProvideFullNameAsAboveErrorElement;

	@FindBy(xpath = "//a[text()='Terms and condition']")
	WebElement termsConditionDashboard;

	@FindBy(xpath = "//div[@id='termsModalBody']")
	WebElement termsConditionAlertMessage;

	@FindBy(xpath = "//button[@id='acceptButton']")
	WebElement termsConditionAcceptButton;

	@FindBy(xpath = "//button[@id='submit_button']")
	WebElement submitDashboard;

	@FindBy(xpath = "//p[contains(text(),'Thank you for registering')]")
	WebElement sucessMessage;

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
		verifyTextOfTheWebElement(examAside, "Exam");
		clickElement(examAside);
		pause(2000);
		verifyCurrentUrl(driver, "https://enthrallit.com/assessment/latest/exam/");
		verifyTitle(driver, "Enthrall IT - Dashboard");
		validationOfHeader(examHeader, "Exam List");

		pause(2000);
		elementDisplayed(bootCampAside);
		verifyTextOfTheWebElement(bootCampAside, "Bootcamp");
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
		validationOfHeader(classNotesHeader, "Class Note List");

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
		verifyTextOfTheWebElement(automationAside, "Automation");
		clickElement(automationAside);
		verifyCurrentUrl(driver, "https://enthrallit.com/dashboard/dashboard/automation/");
		verifyTitle(driver, "Enthrall IT - Dashboard");
		validationOfHeader(automationHeader, "Automation");
		validationOfSubHeader(automationSubHeader, "Please choose from below");
	}

	public void click_on_automation_then_enrollNow_direct_to_enrollNowPage() {
		clickElement(automationAside);
		pause(2000);
		clickElement(enrollNow);
		switchToChildWindow(driver, enrollNow);
		pause(2000);
		verifyCurrentUrl(driver, "https://enthrallit.com/course/dashboard/enrolls/");
		validationOfHeader(enrollNowHeader, "Select your course from the dropdown");
		validationOfSubHeader(enrollNowSubHeader, "Please enter your personal and contact information.");
		validationOfOtherHeader(enrollOtherHeader, "All fields are required unless marked (optional).");
		pause(3000);
	}

	public void first_name_validation() {
		verifyLengthOfTheFieldContent(firstName, Attribute.MAX_LENGTH, "20");
		inputTextThenClickTab(firstName, "%&^%&^");
		pause(3000);
		verifyErrorMessageUnderTheField(alphabeticCharactersErrorMessageUnderTheField, Attribute.INNER_HTML,
				"Must be alphabetic characters.");
		clearTextFromTheField(firstName);
		pause(3000);
		verifyErrorMessageUnderTheField(fNameRequiredFiledErrorMesssageElement, Attribute.INNER_HTML,
				"First Name is a required field.");
		inputTextThenClickTab(firstName, "635462534");
		pause(3000);
		verifyErrorMessageUnderTheField(alphabeticCharactersErrorMessageUnderTheField, Attribute.INNER_HTML,
				"Must be alphabetic characters.");
		clearTextFromTheField(firstName);
		pause(3000);
		inputTextThenClickTab(firstName, "MD ");
		pause(5000);
	}

	public void middle_name_validation() {
		verifyLengthOfTheFieldContent(middName, Attribute.MAX_LENGTH, "20");
		inputTextThenClickTab(middName, "*&^%$#");
		pause(3000);
		verifyErrorMessageUnderTheField(alphabeticCharactersErrorMessageUnderTheField, Attribute.INNER_HTML,
				"Must be alphabetic characters.");
		clearTextFromTheField(middName);
		pause(3000);
		inputTextThenClickTab(middName, "12365879");
		pause(3000);
		verifyErrorMessageUnderTheField(alphabeticCharactersErrorMessageUnderTheField, Attribute.INNER_HTML,
				"Must be alphabetic characters.");
		clearTextFromTheField(middName);
		pause(3000);
		inputTextThenClickTab(middName, "A");
		pause(5000);

	}

	public void last_name_validation() {
		verifyLengthOfTheFieldContent(lastName, Attribute.MAX_LENGTH, "25");
		inputTextThenClickTab(lastName, "$%^**^");
		pause(3000);
		verifyErrorMessageUnderTheField(alphabeticCharactersErrorMessageUnderTheField, Attribute.INNER_HTML,
				"Must be alphabetic characters.");
		clearTextFromTheField(lastName);
		pause(3000);
		verifyErrorMessageUnderTheField(lastnamerequiredErrorMessage, Attribute.INNER_HTML,
				"Last Name is a required field.");
		inputTextThenClickTab(lastName, "12345664");
		pause(3000);
		verifyErrorMessageUnderTheField(alphabeticCharactersErrorMessageUnderTheField, Attribute.INNER_HTML,
				"Must be alphabetic characters.");
		clearTextFromTheField(lastName);
		pause(3000);
		inputText(lastName, "Jaleel");

	}

	public void selectProfession_validation() {
		selectElelementFromDropdownOnebyOne(selectProfession, selectProfessionList);
		pause(3000);
		selectDropdown(selectProfession, "Select Profession");// Nothing Selected Thats why we take visible Text of
																// selectProfession
		pause(3000);
		clickElementThenTab(selectProfession);
		pause(3000);

		verifyErrorMessageUnderTheField(imIsARequiredFieldErrorMessage, Attribute.INNER_HTML,
				"I'm is a required field.");
		pause(3000);
		selectDropdown(selectProfession, "a Student");
		pause(3000);

	}

	public void selectCourse_validation() {
		selectElelementFromDropdownOnebyOne(selectCourse, selectCourseList);
		pause(3000);
		selectDropdown(selectCourse, "Select Course");
		pause(3000);
		clickElementThenTab(selectCourse);
		// TODO java.lang.AssertionError: Error Message doesn't match expected [Course
		// Wish to Enroll is a required field.] but found []
		verifyErrorMessageUnderTheField(selectCourseErrorMessage, Attribute.INNER_HTML,
				"Course Wish to Enroll is a required field. ");
		selectDropdown(selectCourse, "Python");
		pause(3000);
	}

	public void phoneNumberValidation() {
		verifyLengthOfTheFieldContent(phoneNumber, Attribute.MAX_LENGTH, "10");
		inputTextThenClickTab(phoneNumber, "@#$%^&*#$%");
		pause(3000);
		verifyErrorMessageUnderTheField(phoneNumberMustBeValidNumberError, Attribute.INNER_HTML,
				"Must be a valid Phone Number.");
		clearTextFromTheField(phoneNumber);
		pause(3000);
		clickElement(emailDashboard);
		pause(3000);
		verifyErrorMessageUnderTheField(phoneNumberRequiredErrorMessage, Attribute.INNER_HTML,
				"Phone Number is a required field.");
		pause(3000);
		inputTextThenClickTab(phoneNumber, "0122345566");
		pause(3000);
		verifyTextOfTheWebElement(phoneNumberMustNotStart1or0Error, "Phone Number must not start with a 1 or 0.");
		pause(3000);
		clearTextFromTheField(phoneNumber);
		inputTextThenClickTab(phoneNumber, "WrEYRtRTrR");
		verifyErrorMessageUnderTheField(phoneNumberMustBeValidNumberError, Attribute.INNER_HTML,
				"Must be a valid Phone Number.");
		pause(1000);
		clearTextFromTheField(phoneNumber);
		pause(2000);
		inputTextThenClickTab(phoneNumber, "2123456644");
		pause(3000);

	}

	public void emailDashboardValidation() {
		verifyLengthOfTheFieldContent(emailDashboard, Attribute.MAX_LENGTH, "74");
		clickElementThenTab(emailDashboard);
		pause(2000);
		verifyErrorMessageUnderTheField(EmailAdressIsRequiredError, Attribute.INNER_HTML,
				"Email Address is a required field.");
		inputTextThenClickTab(emailDashboard, "%^&&765757657");
		pause(2000);
		verifyErrorMessageUnderTheField(mustBeValidEmailerror, Attribute.INNER_HTML, "Must be a valid Email Address.");
		clearTextFromTheField(emailDashboard);
		pause(2000);
		inputText(emailDashboard, "johnjay@gmail.com");
		pause(3000);

	}

	public void passwordValidation() {
		verifyLengthOfTheFieldContent(passwordDashboard, Attribute.MAX_LENGTH, "74");
		clickElement(passwordEyeIcon);
		String initialType = passwordDashboard.getAttribute("type");
		// We can also write == for equal to, and != for not equal to
		if ("password".equals(initialType)) {
			System.out.println("Password field is not visible by default. Test Passed!");
		} else {
			System.out.println("Password field content is  visible. Test Failed!");
		}
		clickElement(passwordEyeIcon);
		pause(3000);
		String visibleType = passwordDashboard.getAttribute("type");
		if ("text".equals(visibleType)) {
			System.out.println("Password is visible after clicking toggle button. Test Passed!");
		} else {
			System.out.println("Password did not become visible. Test Failed!");
		}
		clickElement(passwordEyeIcon);
		String finalType = passwordDashboard.getAttribute("type");
		if ("password".equals(finalType)) {
			System.out.println("Password is hidden again after toggling. Test Passed!");
		} else {
			System.out.println("Password did not become hidden again. Test Failed!");
		}

		clickElement(passwordDashboard);
		pause(2000);
		String expectedMessage = "Password Requirements :Password must be a minimum of 8 characters. Password must contain: 1 upper case and 1 lower case letter, 1 number, and 1 special character. The following special characters may not be used ? < > ( ) ‘ “ / \\ & (space).  Password cannot contain: First Name, Last Name, common passwords, or Parts of email";
		String actualMessage = passWordHelpMessage.getText();

		if (actualMessage.contains("Password must be a minimum of 8 characters")) {
			System.out.println("Help message is displayed correctly. Test Passed!");
			System.out.println("Expected: " + expectedMessage);
			System.out.println("Actual: " + actualMessage);
		} else {
			System.out.println("Help message validation failed.");
			System.out.println("Expected: " + expectedMessage);
			System.out.println("Actual: " + actualMessage);
		}
		clickElementThenTab(passwordDashboard);
		verifyErrorMessageUnderTheField(passwordRequiredFieldError, Attribute.INNER_HTML,
				"Password is a required field.");
		inputTextThenClickTab(passwordDashboard, "()khlsjikjkjs()");
		verifyErrorMessageUnderTheField(PleaseReferToPasswordReqError, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		clearTextFromTheField(passwordDashboard);
		pause(3000);
		inputTextThenClickTab(passwordDashboard, "Ifzal8");
		verifyErrorMessageUnderTheField(PasswordMustContain8CharactersError, Attribute.INNER_HTML,
				"Must contain a minimum of 8 characters.");
		clearTextFromTheField(passwordDashboard);
		pause(3000);
		inputTextThenClickTab(passwordDashboard, "ifzalpass");
		verifyErrorMessageUnderTheField(PleaseReferToPasswordReqError, Attribute.INNER_HTML,
				"Please refer to Password requirements.");
		clearTextFromTheField(passwordDashboard);
		pause(3000);
		inputText(passwordDashboard, "Ifzal12020$");
		pause(3000);

	}

	public void genderValidation() {
		selectElelementFromDropdownOnebyOne(genderDashBoard, genderDashBoardList);
		pause(3000);
		selectDropdown(genderDashBoard, "Male");
		pause(3000);
	}

	public void personalImageValidation() {
		pause(3000);
		clickElement(submitDashboard);
		pause(3000);
		verifyErrorMessageUnderTheField(personalImageRequiredError, Attribute.INNER_HTML,
				"Personal Image is a required field.");
		pause(3000);
		uploadPhotoImage(personalImageDashBoard,
				"C:\\Users\\ifzal\\eclipse-workspace\\com.enthrallit\\image\\EnthrallIT_Persona_Image.jpg");
		try {
			String afterUploadValue = personalImageDashBoard.getAttribute("value");
			System.out.println("Actual Value of Attribute is: " + afterUploadValue);
			if (afterUploadValue.contains("Persona_Imag.jpg")) {
				System.out
						.println("After upload: File uploaded successfully.  Value of attribute : " + afterUploadValue);
			} else {
				System.out.println("After upload: File upload failed. Value of attribute : " + afterUploadValue);

			}
		} catch (Exception e) {
			System.out.println("An error occurred: " + e.getMessage());

		}

	}

	public void photoIdValidation() {
		pause(3000);
		clickElement(submitDashboard);
		verifyErrorMessageUnderTheField(photoIdIsRequiredError, Attribute.INNER_HTML, "Photo Id is a required field.");
		pause(3000);
		uploadPhotoImage(photoIdDashboard,
				"C:\\Users\\ifzal\\eclipse-workspace\\com.enthrallit\\image\\EnthrallIT_Photo_Id.jpg");
		try {
			String afterUploadValue = photoIdDashboard.getAttribute("value");
			System.out.println("Actual Value of Attribute is: " + afterUploadValue);
			if (afterUploadValue.contains("Photo_Id.jpg")) {
				System.out
						.println("After upload: File uploaded successfully.  Value of attribute : " + afterUploadValue);
			} else {
				System.out.println("After upload: File upload failed. Value of attribute : " + afterUploadValue);

			}
		} catch (Exception e) {
			System.out.println("An error occurred: " + e.getMessage());

		}
	}

	public void birth_year_validation() {
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, emailDashboard);
		pause(3000);
		selectElelementFromDropdownOnebyOne(selectBirthYearDashboard, selectBirthYearList);
		pause(3000);
		selectDropdownThenTab(selectBirthYearDashboard, "Select Birth Year");
		pause(3000);
		verifyErrorMessageUnderTheField(birthYearRequiredError, Attribute.INNER_HTML,
				"Birth Year is a required field.");
		pause(3000);
		selectDropdown(selectBirthYearDashboard, "1985");
		pause(3000);

	}

	public void birth_month_validation() {
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, emailDashboard);
		pause(3000);
		selectElelementFromDropdownOnebyOne(selectbirthMonthDashboard, selectBirthMonthDashboardList);
		pause(3000);
		selectDropdownThenTab(selectbirthMonthDashboard, "Select Birth Month");
		pause(3000);
		verifyErrorMessageUnderTheField(birthMonthRequiredError, Attribute.INNER_HTML,
				"Birth Month is a required field.");
		pause(3000);
		selectDropdown(selectbirthMonthDashboard, "May");
		pause(3000);

	}

	public void birth_date_validation() {
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, emailDashboard);
		pause(3000);
		selectElelementFromDropdownOnebyOne(selectBirthDate, selectBirthDateList);
		pause(3000);
		selectDropdownThenTab(selectBirthDate, "Select Birth Date");
		pause(3000);
		verifyErrorMessageUnderTheField(birthDateRequiredError, Attribute.INNER_HTML,
				"Birth Date is a required field.");
		pause(3000);
		selectDropdown(selectBirthYearDashboard, "1985");
		pause(3000);
		selectDropdown(selectbirthMonthDashboard, "May");
		pause(3000);
		// TODO: For BirthDate to work, You must select BirthYear & BirthMonth
		selectDropdown(selectBirthDate, "14");
		pause(5000);

	}

	public void homeAddress_validation() {
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, emailDashboard);
		pause(3000);
		verifyLengthOfTheFieldContent(homeAddressLine1Dashboard, Attribute.MAX_LENGTH, "60");
		clickElementThenTab(homeAddressLine1Dashboard);
		pause(3000);
		verifyErrorMessageUnderTheField(homeAddressLine1RequiredFieldError, Attribute.INNER_HTML,
				"Home Address Line 1 is a required field.");
		pause(3000);
		inputTextThenClickTab(homeAddressLine1Dashboard, "^&*%$#@@$$%$%%");
		pause(3000);
		verifyErrorMessageUnderTheField(homeAddressLine1MustBeAlphaNumericCharactersError, Attribute.INNER_HTML,
				"Must be alphanumeric characters.");
		pause(3000);
		clearTextFromTheField(homeAddressLine1Dashboard);
		pause(3000);
		inputText(homeAddressLine1Dashboard, "3145 Northgate Dr.  Apt No.2000");
		pause(3000);

		verifyLengthOfTheFieldContent(homeAddressLine2DashBoard, Attribute.MAX_LENGTH, "65");
		pause(3000);
		inputTextThenClickTab(homeAddressLine2DashBoard, "#$$%%^^#$%$%%");
		pause(3000);
		verifyErrorMessageUnderTheField(homeAddressLine2MustBeAlphaNumericCharactersError, Attribute.INNER_HTML,
				"Must be alphanumeric characters.");
		pause(3000);
		clearTextFromTheField(homeAddressLine2DashBoard);
		inputText(homeAddressLine2DashBoard, "Grapevine TX-75060");
		pause(3000);
	}

	public void city_validation() {
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, emailDashboard);
		pause(3000);
		verifyLengthOfTheFieldContent(cityDashBoad, Attribute.MAX_LENGTH, "30");
		pause(3000);
		inputTextThenClickTab(cityDashBoad, "!@#$%%%");
		pause(3000);
		verifyErrorMessageUnderTheField(cityMustBeAlhpabeticCharError, Attribute.INNER_HTML,
				"Must be alphabetic characters.");
		pause(3000);
		clearTextFromTheField(cityDashBoad);
		pause(3000);
		clickElementThenTab(cityDashBoad);
		pause(3000);
		verifyErrorMessageUnderTheField(cityisRequiredError, Attribute.INNER_HTML, "City is a required field.");
		pause(3000);
		inputText(cityDashBoad, "Grapevine");
		pause(3000);

	}

	public void selectState() {
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, emailDashboard);
		pause(3000);
		selectElelementFromDropdownOnebyOne(selectState, selectStateList);
		pause(3000);
		selectDropdownThenTab(selectState, "Select State");
		pause(3000);
		verifyErrorMessageUnderTheField(stateIsRequiredError, Attribute.INNER_HTML, "State is a required field.");
		pause(3000);
		selectDropdown(selectState, "Texas");
		pause(3000);

	}

	public void zipCode_validation() {
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, emailDashboard);
		pause(3000);
		verifyLengthOfTheFieldContent(zipCodeDashBoard, Attribute.MAX_LENGTH, "5");
		inputTextThenClickTab(zipCodeDashBoard, "1234");
		pause(3000);
		verifyErrorMessageUnderTheField(zipCodeMustBeAvalidNumericZipCodeError, Attribute.INNER_HTML,
				"Must be a valid numeric ZIP Code.");
		pause(3000);
		clearTextFromTheField(zipCodeDashBoard);
		pause(3000);
		clickElementThenTab(zipCodeDashBoard);
		verifyErrorMessageUnderTheField(zipCodeRequiredFieldError, Attribute.INNER_HTML,
				"ZIP Code is a required field.");
		inputTextThenClickTab(zipCodeDashBoard, "^$^%$");
		verifyErrorMessageUnderTheField(zipCodeMustBeAvalidNumericZipCodeError, Attribute.INNER_HTML,
				"Must be a valid numeric ZIP Code.");
		pause(3000);
		clearTextFromTheField(zipCodeDashBoard);
		pause(3000);
		inputText(zipCodeDashBoard, "48208");
		pause(3000);
	}

	public void slectImmigrationStatusValidation() {
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, cityDashBoad);
		pause(3000);
		selectElelementFromDropdownOnebyOne(selectImmigrationStatus, selectImmigrationStatusList);
		pause(3000);
		selectDropdown(selectImmigrationStatus, "Citizen");
		pause(3000);
	}

	public void dateOfArrivalValidation() {
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, cityDashBoad);
		pause(3000);
		inputTextThenClickTab(dateOfArrival, "&&%&%&^%");
		verifyErrorMessageUnderTheField(dateOfArrivalMustBeAlphaNumericError, Attribute.INNER_HTML,
				"Must be alphanumeric characters");
		pause(3000);
		clearTextFromTheField(dateOfArrival);
		pause(3000);
		inputText(dateOfArrival, "05/11/2000");
		pause(2000);

	}

	public void emergency_contact_validation() {
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, cityDashBoad);
		pause(3000);
		inputTextThenClickTab(emergencyContact, "^%$^$^$^$");
		pause(3000);
		verifyErrorMessageUnderTheField(emergencyContactNusBeAlhpanumericError, Attribute.INNER_HTML,
				"Must be alphanumeric characters");
		clearTextFromTheField(emergencyContact);
		pause(3000);
		inputText(emergencyContact, "Peter 3136650200");
		pause(3000);
	}

	public void how_did_you_enthall_it_validation() {
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, cityDashBoad);
		pause(3000);
		inputTextThenClickTab(howDidYouKNowAboutEnthrallIT, "#%$#^^#^%");
		verifyErrorMessageUnderTheField(howDidYouKNowMustBeAlphabeticCharactErrorMessage, Attribute.INNER_HTML,
				"Must be alphabetic characters.");
		clearTextFromTheField(howDidYouKNowAboutEnthrallIT);
		pause(3000);
		inputTextThenClickTab(howDidYouKNowAboutEnthrallIT, "1234567");
		verifyErrorMessageUnderTheField(howDidYouKNowMustBeAlphabeticCharactErrorMessage, Attribute.INNER_HTML,
				"Must be alphabetic characters.");
		clearTextFromTheField(howDidYouKNowAboutEnthrallIT);
		pause(3000);
		inputText(howDidYouKNowAboutEnthrallIT, "Facebook");
		pause(3000);

	}

	public void higest_education_validation() {
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, cityDashBoad);
		pause(3000);
		selectElelementFromDropdownOnebyOne(highestEducation, highestEducationList);
		pause(3000);
		selectDropdown(highestEducation, "Graduate");
		pause(3000);

	}

	public void country_of_origin_validation() {
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, cityDashBoad);
		pause(3000);
		selectElelementFromDropdownOnebyOne(selectCountryOfOrigin, selectCountryOfOriginList);
		pause(3000);
		selectDropdown(selectCountryOfOrigin, "Bangladesh");
		pause(3000);

	}

	public void language_mouse_hover_over_then_select_english_validation() {
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, cityDashBoad);
		pause(3000);
		mouseHoverAction(driver, primaryLanguageHover, primaryLanguageEnglish);
		pause(3000);

	}

	public void signature_validation() {
		inputText(firstName, "John");
		pause(3000);
		inputText(middName, "Allen");
		pause(3000);
		inputText(lastName, "Smith");
		pause(3000);
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, cityDashBoad);
		pause(3000);
		verifyLengthOfTheFieldContent(signature, Attribute.MAX_LENGTH, "150");
		clickElementThenTab(signature);
		verifyErrorMessageUnderTheField(signatureIsArequiredFieldErrorElement, Attribute.INNER_HTML,
				"Signature is a required field.");
		inputTextThenClickTab(signature, "John Smith");
		verifyErrorMessageUnderTheField(signaturePleaseProvideFullNameAsAboveErrorElement, Attribute.INNER_HTML,
				"Please provide your full name as above");
		clearTextFromTheField(signature);
		pause(3000);
		inputText(signature, "John Allen Smith");
		pause(3000);

	}

	public void terms_condition_validation() {
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, cityDashBoad);
		pause(3000);
		doubleClickActionWithoutAlert(driver, termsConditionDashboard);
		pause(3000);
		System.out.println("The message in TermsCondition is: " + termsConditionAlertMessage.getText());
		clickElement(termsConditionAcceptButton);
		pause(3000);
	}

	// Alert Not Working.
	//Giving Below Error.
	//org.openqa.selenium.UnhandledAlertException: unexpected alert open: {Alert text : Ok or cancel}.
	public void click_on_back_button_enrollNow() {
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, howDidYouKNowAboutEnthrallIT);
		elementEnabled(rightClickButton);
		rightClickActionAccept(driver, rightClickButton, backButton);
		pause(3000);

	}

	// Alert Not Working.
	//Giving Below Error.
	//org.openqa.selenium.UnhandledAlertException: unexpected alert open: {Alert text : Ok or cancel}.
	public void click_on_cancel_button_enrollNOw() {
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, howDidYouKNowAboutEnthrallIT);
		elementEnabled(rightClickButton);
		rightClickActionAccept(driver, rightClickButton, cancelButton);
		pause(3000);
	}

	public void submit_button_validation() {
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, cityDashBoad);
		pause(3000);
		clickElement(submitDashboard);
		pause(5000);
		verifyErrorMessageUnderTheField(fNameRequiredFiledErrorMesssageElement, Attribute.INNER_HTML,
				"First Name is a required field.");
		pause(3000);
		verifyErrorMessageUnderTheField(lastnamerequiredErrorMessage, Attribute.INNER_HTML,
				"Last Name is a required field.");
		pause(3000);
		verifyErrorMessageUnderTheField(imIsARequiredFieldErrorMessage, Attribute.INNER_HTML,
				"I'm is a required field.");
		pause(3000);
		verifyErrorMessageUnderTheField(selectCourseErrorMessage, Attribute.INNER_HTML,
				"Course Wish to Enroll is a required field. ");
		pause(3000);
		verifyErrorMessageUnderTheField(phoneNumberRequiredErrorMessage, Attribute.INNER_HTML,
				"Phone Number is a required field.");
		pause(3000);
		verifyErrorMessageUnderTheField(EmailAdressIsRequiredError, Attribute.INNER_HTML,
				"Email Address is a required field.");
		pause(3000);
		verifyErrorMessageUnderTheField(passwordRequiredFieldError, Attribute.INNER_HTML,
				"Password is a required field.");
		pause(3000);

		verifyErrorMessageUnderTheField(personalImageRequiredError, Attribute.INNER_HTML,
				"Personal Image is a required field.");
		pause(3000);
		verifyErrorMessageUnderTheField(photoIdIsRequiredError, Attribute.INNER_HTML, "Photo Id is a required field.");
		pause(3000);
		verifyErrorMessageUnderTheField(birthYearRequiredError, Attribute.INNER_HTML,
				"Birth Year is a required field.");
		pause(3000);

		verifyErrorMessageUnderTheField(birthMonthRequiredError, Attribute.INNER_HTML,
				"Birth Month is a required field.");
		pause(3000);

		verifyErrorMessageUnderTheField(birthDateRequiredError, Attribute.INNER_HTML,
				"Birth Date is a required field.");
		pause(3000);
		verifyErrorMessageUnderTheField(homeAddressLine1RequiredFieldError, Attribute.INNER_HTML,
				"Home Address Line 1 is a required field.");
		pause(3000);
		verifyErrorMessageUnderTheField(cityisRequiredError, Attribute.INNER_HTML, "City is a required field.");
		pause(3000);
		verifyErrorMessageUnderTheField(stateIsRequiredError, Attribute.INNER_HTML, "State is a required field.");
		verifyErrorMessageUnderTheField(zipCodeRequiredFieldError, Attribute.INNER_HTML,
				"ZIP Code is a required field.");
		pause(3000);
		verifyErrorMessageUnderTheField(signatureIsArequiredFieldErrorElement, Attribute.INNER_HTML,
				"Signature is a required field.");
		pause(3000);

	}

	public void happy_path_enrollNow_direct_to_sucessMessage() {
		pause(3000);
		inputText(firstName, "John");
		pause(3000);
		inputText(middName, "Allen");
		pause(3000);
		inputText(lastName, "Smith");
		pause(3000);
		selectDropdown(selectProfession, "a Student");
		pause(3000);
		selectDropdown(selectCourse, "Python");
		pause(3000);
		inputText(phoneNumber, "6463777827");
		pause(3000);
		inputText(emailDashboard, "ifzal.java2024@gmail.com");
		pause(3000);
		inputText(passwordDashboard, "Ifzal2020$");
		pause(3000);
		selectDropdown(genderDashBoard, "Male");
		pause(3000);
		uploadPhotoImage(personalImageDashBoard,
				"C:\\Users\\ifzal\\eclipse-workspace\\com.enthrallit\\image\\EnthrallIT_Persona_Image.jpg");
		pause(3000);
		uploadPhotoImage(photoIdDashboard,
				"C:\\Users\\ifzal\\eclipse-workspace\\com.enthrallit\\image\\EnthrallIT_Photo_Id.jpg");
		pause(3000);
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, emailDashboard);
		pause(3000);
		selectDropdown(selectBirthYearDashboard, "1990");
		pause(3000);
		selectDropdown(selectbirthMonthDashboard, "June");
		pause(3000);
		selectDropdown(selectBirthDate, "5");
		pause(3000);
		inputText(homeAddressLine1Dashboard, "3145 Northgate Dr.  Apt No.2000");
		pause(3000);
		inputText(homeAddressLine2DashBoard, "Grapevine TX-75060");
		pause(3000);
		inputText(cityDashBoad, "Grapevine");
		pause(3000);
		selectDropdown(selectState, "Texas");
		pause(3000);
		inputText(zipCodeDashBoard, "75060");
		pause(3000);
		selectDropdown(selectImmigrationStatus, "Citizen");
		pause(3000);
		inputText(dateOfArrival, "05072000");
		pause(3000);
		inputText(emergencyContact, "Peter 3136650200");
		pause(3000);
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, cityDashBoad);
		pause(3000);
		inputText(howDidYouKNowAboutEnthrallIT, "Facebook");
		pause(3000);
		selectDropdown(highestEducation, "Graduate");
		pause(3000);
		selectDropdown(selectCountryOfOrigin, "Bangladesh");
		pause(3000);
		mouseHoverAction(driver, primaryLanguageHover, primaryLanguageEnglish);
		pause(3000);
		inputText(signature, "John Allen Smith");
		pause(3000);
		doubleClickActionWithoutAlert(driver, termsConditionDashboard);
		pause(3000);
		clickElement(termsConditionAcceptButton);
		pause(3000);
		clickElement(submitDashboard);
		pause(3000);

	}

	public void success_message() {
		verifyTitle(driver, "Registration Success");
		verifyCurrentUrl(driver, "https://enthrallit.com/course/enroll/success/");
		pause(3000);
		verifyTextOfTheWebElement(sucessMessage,
				"Thank you for registering. You will receive a confirmation email shortly.");
		pause(3000);

	}

}
