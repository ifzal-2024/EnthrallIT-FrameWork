package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

//EnthrallIT HomePageTest2
public class HomePageTest2 extends BaseClass {

	@Test
	public void landing_on_homePage_test() {
		homePage2.landing_on_homePage();
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
