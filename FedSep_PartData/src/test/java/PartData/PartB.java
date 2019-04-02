package PartData;

import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import pageObject.partA;
import pageObject.partB;
import resourcesss.base;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.KeyDownAction;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class PartB extends base {
	public WebDriverWait wait;
	
	static Logger logger = LogManager.getLogger(PartB.class);
	@BeforeTest
	public void initialize() throws IOException, InterruptedException {
		PartA A = new PartA();
		A.initialize();
	}
	

	@Test(priority = 0)
	public void partB_NegativeTest() throws InterruptedException {
		
		logger.info("Start testing the part B Negative Testing ");
		partB l = new partB(driver);
		l.getPartB().click();
		l.getPermEmpCount().clear();
		l.getTempEmpCount().clear();
		l.getTotalEmpCount().clear();
		Thread.sleep(1000);
		l.getSaveButton().click();

	}

	@Test(priority = 1)
	public void partB() throws InterruptedException {
		logger.info("Start testing the part B Postive Testing ");
		partB l = new partB(driver);
		l.getPermEmpCount().sendKeys("250");
		l.getTempEmpCount().sendKeys("300");
		Thread.sleep(7000);
		l.getSaveButton().click();
		Assert.assertEquals(l.getSuccessFullMessage().getText(), "Saved Part B");
		
		logger.info(driver.getCurrentUrl());
		logger.info("Part B successfull passed ");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
		driver = null;
	}

}
