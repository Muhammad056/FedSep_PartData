package PartData;

import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import pageObject.partA;
import resourcesss.base;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class PartA extends base {
	
	static Logger logger = LogManager.getLogger(PartA.class);
	@BeforeTest
	public void initialize() throws IOException, InterruptedException {
		loginPage login = new loginPage();
		login.initialize();
		login.loginPages();
		LandingPage li = new LandingPage(driver);
		li.getCont().click();
		li.getMD_715().click();
		li.getPartData().click();
	}

	@Test(priority = 0)
	public void partA_NegativeTest() {
		
		logger.info("Start testing the part A Negative Testing ");
		partA l = new partA(driver);
		l.getPartA().click();
//		Assert.assertTrue(l.getAgency().isDisplayed());
		l.getSecondLevelComponent().clear();
		l.getAddress().clear();
		l.getCity().clear();
		l.getZipCode().clear();
		l.getFipsCode().clear();
		l.getaveButton().click();
		
	}

	@Test(priority = 1)
	public void partA() {

		logger.info("Start testing the part A Postive Testing ");
		partA l = new partA(driver);
//		Assert.assertTrue(l.getAgency().isDisplayed());
		l.getSecondLevelComponent().sendKeys("35");
		l.getAddress().sendKeys("1044 lexus way");
		l.getCity().sendKeys("herndon");
		l.getZipCode().sendKeys("20170");
		l.getFipsCode().sendKeys("HPOO");
		l.getaveButton().click();
		Assert.assertEquals(l.getScuessfulMessage().getText(), "Saved Part A");
		logger.info("Part A successfull passed ");

	}

	@AfterTest
	public void tearDown() {
		driver.close();
		driver = null;
	}

}
