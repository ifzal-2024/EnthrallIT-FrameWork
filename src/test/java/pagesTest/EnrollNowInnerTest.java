package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

//EnthrallIT EnrollNowInnerTest
public class EnrollNowInnerTest extends BaseClass {
	
	@Test
	public void validateEnrollNowInnerPageTest() {
		enrollNowInner.validateEnrollNowInnerPage();
		
	}

	
	@Test
	public void use_of_dropdown_selectByVisibleText_method_test() {
		enrollNowInner.validateEnrollNowInnerPage();
		enrollNowInner.use_of_dropdown_selectByVisibleText_method();
		enrollNowInner.use_of_dropdown_selectByIndex_method();
		enrollNowInner.use_of_dropdown_selectByValue_method();
		
	}
	
	@Test
	public void enrollNowInnerFillFormTest() {
	enrollNowInner.enrollNowInnerFillForm();
	}
	
	
}
