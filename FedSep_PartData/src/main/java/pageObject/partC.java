package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class partC {

	public WebDriver driver;
	By partC = By.xpath("//span[contains(text(),'> Part C-Agency Official(s) Responsible')]");
	By dropDown_Agency = By.id("partC1:partLookupIdnewPartCContact1");
	By add = By.xpath("//button[@title='Add Head Of Agency']//span[@class='ui-button-text ui-c'][contains(text(),'Add')]");
	By name = By.id("partC1:inNamenewPartCContact");
	By title= By.id("partC1:inTitlenewPartCContact");
	By saveButton = By.xpath("//span[contains(text(),'Save')]");
	By successfullyMessage = By.xpath("//span[@class='ui-growl-title']");
	By contacType= By.xpath("//tr[1]//td[1]");
	By contacTypeName= By.xpath("//div[@class='ui-cell-editor-output'][contains(text(),'Aqib')]");
	By contacTypeTitle= By.xpath("//div[@class='ui-cell-editor-output'][contains(text(),'Testing')]");
	By deleteButton = By.xpath("//tr[1]//td[8]//a[1]//img[1]");
	By deleteMessage = By.id("partC2:deleteDialog_title");
	By yes = By.xpath("//span[contains(text(),'Yes')]");
	By removeMessage = By.xpath("//div[@id='partC2:messages_container']//span[@class='ui-growl-title'][contains(text(),'Removed Part C.')]");
	By errorMessageEnterName = By.xpath("//span[contains(text(),'Enter Name')]");
	By errorMessageEnterTitle = By.xpath("//span[contains(text(),'Enter Title')]");
	By errorMessagePayPlan = By.xpath("//span[contains(text(),'Enter Pay Plan')]");
	By errorMessageGrade = By.xpath("//span[contains(text(),'Enter Grade')]");
	By errorMessagePhoneNumber = By.xpath("//span[contains(text(),'Enter Phone Number')]");
	By errorMessageEmailAddress = By.xpath("//span[contains(text(),'Enter Email Address')]");
	By Add2 = By.xpath("(//span[contains(text(),'Add')])[2]");
	By addOfficial = By.xpath("//span[contains(text(),'Save')]");
	By Name = By.id("partC2:inNamenewPartCContact");
	By Title = By.id("partC2:inTitlenewPartCContact");
	By payPlan = By.id("partC2:inPlannewPartCContact");
	By grade = By.id("partC2:inGradenewPartCContact");
	By phoneNumber = By.id("partC2:inPhonenewPartCContact");
	By email = By.id("partC2:inEmailnewPartCContact");
	By contactListName = By.xpath("//div[contains(text(),'Aqib')]");
	By contactListTitle = By.xpath("//div[contains(text(),'Tesing')]");
	By contactListPayPlan = By.xpath("//div[contains(text(),'8')]");
	By contactListGrade = By.xpath("//div[contains(text(),'20')]");
	By contactListPhone = By.xpath("//div[contains(text(),'(213) 213-2132')]");
	By contactListEmail = By.xpath("//div[contains(text(),'test0056@gmail.com')]");
	
	public partC (WebDriver driver) {
		
		this.driver = driver;
	}
	public WebElement getPartC()
	{
		return driver.findElement(partC);
	}
	public WebElement getDropDownAgency()
	{
		return driver.findElement(dropDown_Agency);
	}
	public WebElement getAdd()
	{
		return driver.findElement(add);
	}
	public WebElement getName()
	{
		return driver.findElement(name);
	}
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	public WebElement getSaveButton()
	{
		return driver.findElement(saveButton);
	}
	public WebElement getSuccessFullMessage()
	{
		return driver.findElement(successfullyMessage);
	}
	public WebElement verifyContactType()
	{
		return driver.findElement(contacType);
	}
	public WebElement verifyContactTypeName()
	{
		return driver.findElement(contacTypeName);
	}
	public WebElement verifyContactTypeTitle()
	{
		return driver.findElement(contacTypeTitle);
	}
	public WebElement getDeleteButton()
	{
		return driver.findElement(deleteButton);
	}
	public WebElement getDeleteMessage()
	{
		return driver.findElement(deleteMessage);
	}
	public WebElement getYes()
	{
		return driver.findElement(yes);
	}
	public WebElement getRemovedMessage()
	{
		return driver.findElement(removeMessage);
	}
	public WebElement getErrorMessageEnterName()
	{
		return driver.findElement(errorMessageEnterName);
	}
	public WebElement getErrorMessageEnterTitle()
	{
		return driver.findElement(errorMessageEnterTitle);
	}
	public WebElement getErrorMessagePayPlan()
	{
		return driver.findElement(errorMessagePayPlan);
	}
	public WebElement getErrorMessageGrade()
	{
		return driver.findElement(errorMessageGrade);
	}
	public WebElement getErrorMessagePhoneNumber()
	{
		return driver.findElement(errorMessagePhoneNumber);
	}
	public WebElement getErrorMessageEmailAddress()
	{
		return driver.findElement(errorMessageEmailAddress);
	}
	public WebElement getAddOffical()
	{
		return driver.findElement(Add2);
	}
	public WebElement getAddOfficialSave()
	{
		return driver.findElement(addOfficial);
	}
	public WebElement getAddOfficialName()
	{
		return driver.findElement(Name);
	}
	public WebElement getAddOfficialTitle()
	{
		return driver.findElement(Title);
	}
	public WebElement getAddOfficialPayPlan()
	{
		return driver.findElement(payPlan);
	}
	public WebElement getAddOfficialGrade()
	{
		return driver.findElement(grade);
	}
	public WebElement getAddOfficialPhoneNumber()
	{
		return driver.findElement(phoneNumber);
	}
	public WebElement getAddOfficialEmail()
	{
		return driver.findElement(email);
	}
	public WebElement getAddOfficialContactListName()
	{
		return driver.findElement(contactListName);
	}
	
	public WebElement getAddOfficialContactListTitle()
	{
		return driver.findElement(contactListTitle);
	}
	
	public WebElement getAddOfficialContactListPayPlan()
	{
		return driver.findElement(contactListPayPlan);
	}
	
	public WebElement getAddOfficialContactListGrade()
	{
		return driver.findElement(contactListGrade);
	}
	
	public WebElement getAddOfficialContactListPhone()
	{
		return driver.findElement(contactListPhone);
	}
	
	public WebElement getAddOfficialContactListEmail()
	{
		return driver.findElement(contactListEmail);
	}
	
	
}
