package pagesTest;
//EnthrallIT Test Page
import org.testng.annotations.Test;

import baseUtil.BaseClass;
import net.bytebuddy.implementation.bind.annotation.RuntimeType;

public class HomePageTest extends BaseClass {
	
	@Test (enabled = true)
	public void clickLogoTest() throws InterruptedException {
		homePage.clickLogo();
	}
	
	@Test(priority = 1)
	public void clickLoginTest() throws InterruptedException {  
		homePage.clicklogin();
		
	}
	
	@Test
	public void clickHomeTest() {
		homePage.clickHome();
	}
	
@Test
public void userEmailInputTest () {
	homePage.userEmailInput();
}

@Test
public void clickPasswordTest () {
	homePage.clickpassword();
	
}
@Test
public void cSSEnrollNowTest() {
	homePage.ClickEnrollNowCss();;
	
}

// WOrked
@Test
public void clickEnrlNowxpaClassCompundTest() {
	homePage.clickEnrlNowxpaClassCompund();
}

@Test
public void ClickEnrollNow() {
	homePage.ClickEnrollNow();
}
	@Test
public void getMethodsOfThePageTest() {
		homePage.getMethodsOfThePage();
	}
	
	@Test
	public void loginValidationTest() {
		homePage.loginValidation();
		
	}
	
	
	@Test
	public void use_of_getAttribute_method_test () {
		homePage.use_of_getAttribute_method();
	}

	@Test
	public void use_of_clear_in_login_test() {
		homePage.use_of_enterKey_in_login();
	}
	
	
	@Test
	public void enrollNowInnerTest() {
		homePage.enrollNowInner();
		
	}
	
	@Test
	public void use_of_navigate_method_test () {
		homePage.use_of_navigate_method();
		
	}
	

	
	}
	


