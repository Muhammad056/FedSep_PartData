package PartData;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import resourcesss.base;

public class landingPage extends base {

	@BeforeTest
	public void initialize() throws IOException, InterruptedException {
		driver = initializaDriver();
		driver.get(prop.getProperty("URL"));
		LoginPage l = new LoginPage(driver);
		assertEquals(l.VerifyTitle().getText(), "EQUAL EMPLOYMENT OPPORTUNITY COMMISSION (EEOC)");
		l.getEmail().sendKeys(prop.getProperty("Username"));
		l.getPassword().sendKeys(prop.getProperty("Password"));
		l.getLoginButton().click();
	}

	@Test()

	public void landingPage() throws IOException, InterruptedException {
		LandingPage l = new LandingPage(driver);
		l.getCont().click();
		assertEquals(l.getTitle().getText(), "WELCOME");
		l.getMD_715().click();
		l.getPartData().click();

	}

	@AfterTest
	public void tearDown() {
		driver.close();
		driver = null;
	}

}
