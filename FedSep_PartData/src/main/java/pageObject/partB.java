package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class partB {

	public WebDriver driver;
	By partB = By.xpath("//span[contains(text(),'> Part B-Total Employment')]");
	By permEmpCount = By.id("partB:permEmpCount_input");
	By tempEmpCount = By.id("partB:tempEmpCount_input");
	By totalEmpCount = By.id("partB:totalEmpCount_input");
	By saveButton = By.xpath("//span[contains(text(),'Save')]");
	By successfullyMessage = By.xpath("//span[@class='ui-growl-title']");
	
	public partB (WebDriver driver) {
		
		this.driver = driver;
	}
	public WebElement getPartB()
	{
		return driver.findElement(partB);
	}
	public WebElement getPermEmpCount()
	{
		return driver.findElement(permEmpCount);
	}
	public WebElement getTempEmpCount()
	{
		return driver.findElement(tempEmpCount);
	}
	public WebElement getTotalEmpCount()
	{
		return driver.findElement(totalEmpCount);
	}
	public WebElement getSaveButton()
	{
		return driver.findElement(saveButton);
	}
	public WebElement getSuccessFullMessage()
	{
		return driver.findElement(successfullyMessage);
	}
	
	
}
