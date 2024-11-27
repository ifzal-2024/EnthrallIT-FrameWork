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
public void ClickHomeCSSTest() {
	homePage.clickHome();
	
}

@Test
public void ClickEnrollNow() {
	homePage.ClickEnrollNow();
}
	
}

