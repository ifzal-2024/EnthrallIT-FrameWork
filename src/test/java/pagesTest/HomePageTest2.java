package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

//EnthrallIT HomePageTest2
public class HomePageTest2 extends BaseClass {
	
	@Test
	public void homePageValidationTest() {
		homePage2.homePageValidation();
		}
	
	@Test
	public void validationOfAllButtonsInHeader() {
		homePage2.validationOfAllButtonsInHeader();
		}
	
	@Test
	public void validationOfAllButtonInFooterTest() {
		homePage2.validationOfAllButtonInFooter();
	}
	
	
	@Test
	public void contactUsTest() {
		homePage2.contactUs();
		}
	
	

}
