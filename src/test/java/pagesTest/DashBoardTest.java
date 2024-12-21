package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class DashBoardTest extends BaseClass{
	
	@Test
	public void loginSubmitTest() {
		dashBoard.loginSubmit();
	}

	@Test
	public void clickReturnSiteTest() {
		loginSubmitTest();
		dashBoard.clickReturnSite();
	}
	
	@Test
	public void dashBoardLogOutTest() {
		loginSubmitTest();
		dashBoard.dashBoardLogOut();
	}
	
	
	@Test
	public void asideElementsTest() {
		loginSubmitTest();
		dashBoard.asideElements();
	}
	
	@Test
	public void automationValidationTest() {
		dashBoard.automationValidation();
	}
	
	
	@Test
	public void enrollNowtest() {
		dashBoard.enrollNow();
	}
	
	@Test
	public void click_on_back_button_enrollNowTest () {
		dashBoard.click_on_back_button_enrollNow();
	}
	
	@Test
	public void first_name_validation_test() {
		dashBoard.first_name_validation();
	}
	
	@Test
	public void middle_name_validation_test() {
		dashBoard.middle_name_validation();
	}
	
	@Test
	public void last_name_validation_test() {
		dashBoard.last_name_validation();
	}
	
	@Test
	public void selectProfession_validation_test() {
		dashBoard.selectProfession_validation();
	}
	
	
	@Test
	public void selectCourse_validation_test() {
		dashBoard.selectCourse_validation();
	}
	
	@Test
	public void phoneNumberValidationTest() {
		dashBoard.phoneNumberValidation();
	}
	
	
}
