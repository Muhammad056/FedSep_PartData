package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class partA {

	public WebDriver driver;
	By partA = By.xpath("//span[contains(text(),'> Part A-Department or Agency Identifying Information')]");
	By agency = By.xpath(" //div[contains(text(),'Advisory Council on Historic Preserva')]");
	By second_level_component = By.id("partA:secondLevel");
	By address = By.id("partA:address");
	By city = By.id("partA:city");
	By zipCode = By.id("partA:zip");
	By fipsCode = By.id("partA:fipsCode");
	By saveButton = By.xpath("//span[contains(text(),'Save')]");
	By scuessfullyMessage = By.xpath("//span[@class='ui-growl-title']");
	 
	
	public partA (WebDriver driver) {
		
		this.driver = driver;
	}
	public WebElement getPartA()
	{
		return driver.findElement(partA);
	}
	
	public WebElement getAgency()
	{
		return driver.findElement(agency);
	}
	public WebElement getSecondLevelComponent()
	{
		return driver.findElement(second_level_component );
	}
	public WebElement getAddress()
	{
		return driver.findElement(address);
	}
	public WebElement getCity()
	{
		return driver.findElement(city);
	}
	public WebElement getZipCode()
	{
		return driver.findElement(zipCode);
	}
	public WebElement getFipsCode()
	{
		return driver.findElement(fipsCode);
	}
	public WebElement getaveButton()
	{
		return driver.findElement(saveButton);
	}
	public WebElement getScuessfulMessage()
	{
		return driver.findElement(scuessfullyMessage);
	}
	
	
}
