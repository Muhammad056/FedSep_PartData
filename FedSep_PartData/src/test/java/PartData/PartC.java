package PartData;

import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import pageObject.partA;
import pageObject.partB;
import pageObject.partC;
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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.SlowLoadableComponent;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class PartC extends base {
	static Logger logger = LogManager.getLogger(PartC.class);
	public WebDriverWait wait;

	@BeforeTest
	public void initialize() throws IOException, InterruptedException {
		PartB B = new PartB();
		B.initialize();

	}

	@Test(priority = 0, description = "Testing the Negative Part C")
	public void partC_NegativeTest() throws InterruptedException {
		logger.info("Start the negative test");
		partC l = new partC(driver);
		l.getPartC().click();
		l.getAdd().click();
		Thread.sleep(1000);
		l.getName().clear();
		l.getTitle().clear();
		l.getSaveButton().click();

	}

	@Test(priority = 1)
	public void partCErrorMessage() throws InterruptedException {
		partC l = new partC(driver);
		Thread.sleep(1000);
		Assert.assertEquals(l.getErrorMessageEnterName().getText(), "Enter Name");
		Assert.assertEquals(l.getErrorMessageEnterTitle().getText(), "Enter Title");
		logger.info("Passed the negative test and verfiy all the Error message");

	}

	@Test(priority = 2)
	public void partC() throws InterruptedException {
		logger.info("Start testing the postive testing");
		partC l = new partC(driver);
		Select headAgency = new Select(l.getDropDownAgency());
		headAgency.selectByVisibleText("Head of Agency");
		l.getName().sendKeys("Aqib");
		l.getTitle().sendKeys("Testing");
		Thread.sleep(1000);
		l.getSaveButton().click();
		Thread.sleep(1000);
		Assert.assertEquals(l.getSuccessFullMessage().getText(), "Saved Part C.");
		logger.info("Postive testing have passed");
	}

	@Test(priority = 3)
	public void VerifyContractAdded() throws InterruptedException {
		partC l = new partC(driver);
		Assert.assertEquals(l.verifyContactType().getText(), "Head of Agency");
		Assert.assertEquals(l.verifyContactTypeName().getText(), "Aqib");
		Assert.assertEquals(l.verifyContactTypeTitle().getText(), "Testing");
		logger.info("Verify the contract have been added");
	}

	@Test(priority = 4)
	public void deleteContract() {
		partC l = new partC(driver);
		l.getDeleteButton().click();
		Assert.assertEquals(l.getDeleteMessage().getText(), "Initiating Delete Process");
		l.getYes().click();
		Assert.assertEquals(l.getRemovedMessage().getText(), "Removed Part C.");
		logger.info("Contract have been delete");
	}

	@Test(priority = 5)
	public void addOffical() throws InterruptedException {
		partC l = new partC(driver);
		l.getAddOffical().click();
		Thread.sleep(1000);
		l.getAddOfficialSave().click();
		Assert.assertEquals(l.getErrorMessageEnterName().getText(), "Enter Name");
		Assert.assertEquals(l.getErrorMessageEnterTitle().getText(), "Enter Title");
		Assert.assertEquals(l.getErrorMessagePayPlan().getText(), "Enter Pay Plan");
		Assert.assertEquals(l.getErrorMessageGrade().getText(), "Enter Grade");
		Assert.assertEquals(l.getErrorMessagePhoneNumber().getText(), "Enter Phone Number");
		Assert.assertEquals(l.getErrorMessageEmailAddress().getText(), "Enter Email Address");
		logger.info("Verify all the error message for add official");
		
	}

	@Test(priority = 6)
	public void addOfficals() throws InterruptedException {
		partC l = new partC(driver);
		Thread.sleep(3000);
		l.getAddOfficialName().sendKeys("Aqib");
		l.getAddOfficialTitle().sendKeys("Tesing");
		l.getAddOfficialPayPlan().sendKeys("8");
		l.getAddOfficialGrade().sendKeys("20");
		l.getAddOfficialPhoneNumber().sendKeys("(213) 213-2132");
		l.getAddOfficialEmail().sendKeys("test0056@gmail.com");
		l.getAddOfficialSave().click();
		Thread.sleep(2000);
		Assert.assertEquals(l.getSuccessFullMessage().getText(), "Saved Part C.");
		logger.info("Successfully added the officials");
	}

	@Test(priority = 7)
	public void addOfficalss() throws InterruptedException {
		partC l = new partC(driver);
		Thread.sleep(3000);
		Assert.assertEquals(l.getAddOfficialContactListName().getText(), "Aqib");
		Assert.assertEquals(l.getAddOfficialContactListTitle().getText(), "Tesing");
		Assert.assertEquals(l.getAddOfficialContactListPayPlan().getText(), "8");
		Assert.assertEquals(l.getAddOfficialContactListGrade().getText(), "20");
		System.out.println("this just test " + l.getAddOfficialContactListPhone().getText());
		Assert.assertEquals(l.getAddOfficialContactListPhone().getText(), "(213) 213-2132");
		Assert.assertEquals(l.getAddOfficialContactListEmail().getText(), "test0056@gmail.com");
		logger.info("verify the add officals");
	}

	@Test(priority = 8)
	public void deleteContracts() {
		partC l = new partC(driver);
		l.getDeleteButton().click();
		Assert.assertEquals(l.getDeleteMessage().getText(), "Initiating Delete Process");
		l.getYes().click();
		Assert.assertEquals(l.getRemovedMessage().getText(), "Removed Part C.");
		logger.info("delete the contract");
	}

	@AfterTest
	public void tearDown() {
		driver.close();
		driver = null;
	}

}
