package pagesTest;
//EnthrallIT Test Page
import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {
	
	@Test (enabled = true)
	public void clickLogoTest() throws InterruptedException {
		homePage.clickLogo();
	}
	
	@Test(priority = 1)
	public void clickLoginTest() throws InterruptedException {  
		homePage.clicklogin();
		
	}
	
	

}

