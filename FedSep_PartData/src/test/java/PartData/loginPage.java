package PartData;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import pageObject.LoginPage;
import pageObject.LandingPage;
import resourcesss.base;

public class loginPage extends base {

	static Logger logger = LogManager.getLogger(loginPage.class);
	

	
	@BeforeTest
	public void initialize () throws IOException {
		driver=initializaDriver();
		
		driver.get(prop.getProperty("URL"));
		logger.info("driver is initialized");
		
		
	}
	
	
	@Test()
	
	public void loginPages() throws IOException, InterruptedException
	{
		LoginPage l = new LoginPage(driver);
		assertEquals(l.VerifyTitle().getText(), "EQUAL EMPLOYMENT OPPORTUNITY COMMISSION (EEOC)");
		l.getEmail().sendKeys(prop.getProperty("Username"));
		l.getPassword().sendKeys(prop.getProperty("Password"));
		l.getLoginButton().click();
		
		logger.info("Sucessfully login");	
	}

	@AfterTest
	public void tearDown()
	{
		driver.close();
		driver=null;
		
	}
//	@DataProvider
//	public Object[][] getData()
//	{
//		Object[][] data = new Object[1][2];
//		data[0][0]="fedseptest@yahoo.com";
//		data[0][1]="ML0000";
//		
//		return data;
//	}
//	
}
