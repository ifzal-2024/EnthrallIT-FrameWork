package pages;

import org.openqa.selenium.Alert;
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

import java.security.PublicKey;
import java.time.Duration;
import java.util.List;

import javax.xml.xpath.XPath;

/*
1) is the logo displayed?
2) What is the title?
3) Header validation for rest: All the button like Home, courses, Mentors, Alumni, About Us, Login
enroll Now button, phone number, Id. You have to find out the web element and click them to see
if they are redirecting to the page. 
4) When they redirect, please validate title, current url and header if present.
5) Validate Footer for Home, courses, Mentors, Alumni, About Us, Login, enroll Now button
6) Scroll down and go to Contact Us. Create method for "fill out the form and submit, validate the success or error message" and test
*/

//EnthrallIT HomepAge2
public class HomePage2 {

	public WebDriver driver;

	public HomePage2(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(name = "logo-link")
	WebElement logo;

	@FindBy(xpath = "//li[@name='home'and @id='home']")
	WebElement homeHead;

	@FindBy(xpath = "//a[@id='home']")
	WebElement homeFoot;

	@FindBy(xpath = "//li[@id='courses']")
	WebElement coursesHead;

	@FindBy(xpath = "//a[@id='courses']")
	WebElement coursesFoot;

	@FindBy(xpath = "//h1[text()='Our Courses']")
	WebElement coursesHeader;

	@FindBy(xpath = "//p[contains(text(), 'Expand your career opportunities')]")
	WebElement coursesSubHeader;

	@FindBy(xpath = "//li[@id='mentors' and @name='mentors']")
	WebElement mentorsHead;

	@FindBy(xpath = "//a[@id='mentor']")
	WebElement mentorsFoot;

	@FindBy(xpath = "//h1[text()='Our Mentors']")
	WebElement mentorsHeader;

	@FindBy(xpath = "//p[contains(text(),'Meet')]")
	WebElement mentorsSubHeader;

	@FindBy(xpath = "//li[@id='alumni']")
	WebElement alumniHead;

	@FindBy(xpath = "(//a[text()='Alumni'])[2]")
	WebElement alumniFoot;

	@FindBy(xpath = "//h1[text()='Alumni']")
	WebElement alumniHeader;

	@FindBy(xpath = "//li[@id='about us']")
	WebElement aboutUsHead;

	@FindBy(xpath = "//a[@id='about-us' and @name='about-us']")
	WebElement aboutUsFoot;

	@FindBy(xpath = "//h1[text()='About Us']")
	WebElement aboutUsHeader;

	@FindBy(xpath = "//p[contains(text(), 'coding makes ')]")
	WebElement aboutUsSubheader;

	@FindBy(xpath = "//a[@class='nav-link' and @id='login-link']")
	WebElement loginHead;

	@FindBy(xpath = "(//a[@name='login-link'])[2]")
	WebElement loginFoot;

	@FindBy(xpath = "//h2[text()='Login into your account']")
	WebElement loginHeader;

	@FindBy(xpath = "//a[text()='Enroll now']")
	WebElement enrollNowHead;

	@FindBy(id = "enroll_now")
	WebElement enrollNowFoot;

	@FindBy(xpath = "//h2[contains(text(),'Enroll to ')]")
	WebElement enrollNowHeader;

	@FindBy(xpath = "//h2[text()='Contact Us']")
	WebElement ScrolldownToContactUS;

	@FindBy(xpath = "//input[@name='name']")
	WebElement name_contactUs;

	@FindBy(xpath = "//input[@id='id_email']")
	WebElement email_contactUs;

	@FindBy(xpath = "//input[@name='subject']")
	WebElement subject_contactUs;

	@FindBy(xpath = "//input[@name='experiance']")
	WebElement experience_contactUs;

	@FindBy(xpath = "//textarea[@name='message']")
	WebElement message_contactUs;

	@FindBy(xpath = "//button[text()='send now']")
	WebElement sendNow_contactUs;

	@FindBy(xpath = "//button[@class='close']")
	WebElement something_went_wrongElement;

	@FindBy(xpath = "//button[text()='×']")
	WebElement something_swnet_wrong_alert;

	public void homePageValidation() {
		pause(2000);
		elementDisplayed(logo);
		verifyTitle(driver, "Enthrall IT");
		pause(3000);
	}

	public void validationOfAllButtonsInHeader() {
		pause(3000);
		elementEnabled(homeHead);
		clickElement(homeHead);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/");

		pause(3000);
		elementEnabled(coursesHead);
		clickElement(coursesHead);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/courses/");
		validationOfHeader(coursesHeader, "Our Courses");
		validationOfSubHeader(coursesSubHeader,
				"Expand your career opportunities by doing the most demanding courses offered by Enthrall IT. Choose the course you want to improve your career.");

		pause(3000);
		elementEnabled(mentorsHead);
		clickElement(mentorsHead);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/mentors/");
		validationOfHeader(mentorsHeader, "Our Mentors");
		validationOfSubHeader(mentorsSubHeader, "Meet Enthrall IT mentors who are experts in their fields.");

		pause(3000);
		elementEnabled(alumniHead);
		clickElement(alumniHead);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/alumni/");
		validationOfHeader(alumniHeader, "Alumni");

		pause(3000);
		elementEnabled(aboutUsHead);
		clickElement(aboutUsHead);
		verifyTitle(driver, "About us");
		verifyCurrentUrl(driver, "https://enthrallit.com/about/");
		validationOfHeader(aboutUsHeader, "About Us");
		validationOfSubHeader(aboutUsSubheader, "Coding Makes It Simpler For A Transition To A Rewarding Career Path!");

		pause(3000);
		elementEnabled(loginHead);
		clickElement(loginHead);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/accounts/login/");
		validationOfHeader(loginHeader, "Login into your account");

		pause(3000);
		elementDisplayed(enrollNowHead);
		clickElement(enrollNowHead);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/course/apply/");
		validationOfHeader(enrollNowHeader, "Enroll to EnthrallIT QA Bootcamp");
		pause(5000);

	}

	public void validationOfAllButtonInFooter() {
		pause(3000);
		elementEnabled(homeFoot);
		clickElement(homeFoot);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/");

		pause(3000);
		elementEnabled(coursesFoot);
		clickElement(coursesFoot);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/courses/");
		validationOfHeader(coursesHeader, "Our Courses");
		validationOfSubHeader(coursesSubHeader,
				"Expand your career opportunities by doing the most demanding courses offered by Enthrall IT. Choose the course you want to improve your career.");

		pause(3000);
		elementEnabled(mentorsFoot);
		clickElement(mentorsFoot);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/mentors/");
		validationOfOtherHeader(mentorsHeader, "Our Mentors");
		validationOfSubHeader(mentorsSubHeader, "Meet Enthrall IT mentors who are experts in their fields.");

		pause(3000);
		elementEnabled(alumniFoot);
		clickElement(alumniFoot);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/alumni/");
		validationOfHeader(alumniHeader, "Alumni");

		pause(3000);
		elementEnabled(aboutUsFoot);
		clickElement(aboutUsFoot);
		verifyTitle(driver, "About us");
		verifyCurrentUrl(driver, "https://enthrallit.com/about/");
		validationOfHeader(aboutUsHeader, "About Us");
		validationOfSubHeader(aboutUsSubheader, "Coding Makes It Simpler For A Transition To A Rewarding Career Path!");

		pause(3000);
		elementEnabled(loginFoot);
		clickElement(loginFoot);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/accounts/login/");
		validationOfHeader(loginHeader, "Login into your account");

		pause(3000);
		elementEnabled(enrollNowFoot);
		clickElement(enrollNowFoot);
		verifyTitle(driver, "Enthrall IT");
		verifyCurrentUrl(driver, "https://enthrallit.com/course/apply/");
		validationOfHeader(enrollNowHeader, "Enroll to EnthrallIT QA Bootcamp");
		pause(5000);

	}

	public void contactUs() {
		pause(3000);
		clickElement(homeHead);
		pause(3000);
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, ScrolldownToContactUS);
		pause(3000);
		inputTextThenClickTab(name_contactUs, "Muhmmad Ifzal");
		pause(3000);
		inputTextThenClickTab(email_contactUs, "ifzal@gmail.com");
		pause(3000);
		inputTextThenClickTab(subject_contactUs, "Inquiry about course");
		pause(3000);
		inputTextThenClickTab(experience_contactUs, "Intermediate");
		pause(5000);
		inputText(message_contactUs, "I am interested in Python Course");
		pause(3000);
		clickElement(sendNow_contactUs);
		pause(3000);
		scrollIntoViewTheElementUsingJavascriptExecutor(driver, ScrolldownToContactUS);
		System.out.println("The Text Present in the Alert is : " + something_swnet_wrong_alert.getText());
		pause(5000);
		clickElement(something_went_wrongElement);

	}

}
