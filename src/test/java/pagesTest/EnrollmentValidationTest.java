package pagesTest;

import org.testng.annotations.Test;


import baseUtil.BaseClass;

//EnthrallIT EnrollmentValidationTest
public class EnrollmentValidationTest extends BaseClass {
	
	@Test
	public void loginEnrollNowAndValidationTest() { 
		enrollmentValidation.loginEnrollNowAndValidation();
		
	}
	
	@Test
	public void first_name_validation_test() {
		enrollmentValidation.first_name_validation();
		
	}
	
	@Test
	public void middle_name_validation_test() {
		enrollmentValidation.middle_name_validation();
	}
	
	
	
	
	
	
}
