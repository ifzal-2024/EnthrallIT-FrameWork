package pagesTest;
//EnthrallIT Test Page
import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {
	
	@Test 
	public void clickLogoTest() throws InterruptedException {
		homePage.clickLogo();
	}
	
	

}
