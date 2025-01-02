package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

//EnthrallIT LoginTest Page
public class LoginTest extends BaseClass {

	@Test
	public void loginValidation() {
		login.loginValidation();
	}

	@Test
	public void click_loginSubmit_direct_to_dashBoard_test() {
		login.click_loginSubmit_direct_to_dashBoard();
		;
	}

	@Test
	public void find_name_from_table_test() {
		login.click_loginSubmit_direct_to_dashBoard();
		login.find_name_from_table();

	}

}
