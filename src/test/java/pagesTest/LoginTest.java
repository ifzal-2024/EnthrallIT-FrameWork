package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

//EnthrallIT LoginTest Page
public class LoginTest extends BaseClass {
	
	
	@Test
	public void loginValidationTest() {
		login.loginValidation();
	}

	@Test
	public void clickLoginSubmitTest() {
		login.clickLoginSubmit();
	}
	
	
}
