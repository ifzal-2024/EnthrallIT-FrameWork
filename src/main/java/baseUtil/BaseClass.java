package baseUtil;

import java.lang.reflect.Method;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;


import common.CommonActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.EnrollNowInner;
import pages.EnrollmentValidation;
import pages.HomePage;
import reports.ExtentReportManager;
import reports.TestManager;
import utils.Configuration;

import static utils.IConstant.*;


//EnthrallIT BaseClass
public class BaseClass {
	
	public WebDriver driver;
	public HomePage homePage;
  Configuration configuration;
  public EnrollNowInner enrollNowInner;
  ExtentReports extentReports;
  ExtentTest extentTest;
  public EnrollmentValidation enrollmentValidation; 
  
  @BeforeSuite
  public void ininitalReporting() {
	  extentReports = ExtentReportManager.initalReports();
	  }
  
  @BeforeClass
  public void beforeClassSetUp() {
	  configuration= new Configuration();
	   }
  
  @BeforeMethod
  public void initialTest(Method method) {
	  extentTest=TestManager.createTest(extentReports, method.getName());
	  extentTest.assignAuthor(method.getDeclaringClass().getName());
	  
  }
  
  @Parameters("browser") 
  //@Optional(EDGE)
  
	@BeforeMethod
	public void setUp(@Optional (CHROME) String browserName) {//
		initDriver(browserName);//
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); 
		
		driver.get(configuration.getProperties(URL));
		driver.manage().window().fullscreen();
		
		// How can we convert a String to Long type
		//Long.parseLong(configuration.getProperties(PAGELOAD_WAIT));
		long pageLoadWait = Long.parseLong(configuration.getProperties(PAGELOAD_WAIT));
		long implicitlyWait = Long.parseLong(configuration.getProperties(IMPLICITLY_WAIT));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(pageLoadWait));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitlyWait));	
		
		initClass();
		
	}
	
	public void initDriver(String browserName){
		//String browserName = configuration.getProperties(BROWSER);
		
		switch (browserName) {
		
		case CHROME:
			System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
			driver = new ChromeDriver();
			break;
			
		case FIREFOX:
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
		driver = new FirefoxDriver();
		break;
		
		case EDGE:
		System.setProperty("webdriver.edge.driver", "./driver/msedgedriver.exe");		
		driver = new EdgeDriver();
		break;
		
		
		default:
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			break;
			
			
		}
		
	}
	
	public void initClass() {
		homePage = new HomePage(driver);
		enrollNowInner = new EnrollNowInner(driver);
		enrollmentValidation= new EnrollmentValidation(driver);
		
	}
	
	@AfterMethod
	public void tearUp() {
		driver.quit();
	}


	@AfterMethod
	public void afterEachTest(Method method, ITestResult result) {
		for(String group: result.getMethod().getGroups()) {
			extentTest.assignCategory(group);
		}		
		if(result.getStatus() == ITestResult.SUCCESS) {
			extentTest.log(Status.PASS, "Test PASSED");
		}else if(result.getStatus() == ITestResult.FAILURE) {
			extentTest.addScreenCaptureFromPath(CommonActions.getSreenShot(method.getName(), driver));
			extentTest.log(Status.FAIL, "Test FAILED");
		}else if(result.getStatus() == ITestResult.SKIP) {
			extentTest.log(Status.SKIP, "Test SKIPPED");
		}
	}
	
	@AfterSuite
	public void publishReport() {
		extentReports.flush();
	}

	
}

