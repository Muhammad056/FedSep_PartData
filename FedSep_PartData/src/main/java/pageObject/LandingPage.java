package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	
	public WebDriver driver;
	By cont = By.xpath("//span[@class='ui-button-text ui-c']");
	By title= By.xpath("//h1[contains(text(),'Welcome')]");
	By MD_715 = By.xpath("//a[@href='#']//span[contains(text(),'MD-715')]");
	By partData=By.xpath("//span[contains(text(),'PART Data')]");
	
	public LandingPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public WebElement getCont(){
		return driver.findElement(cont);
	}
	
	public WebElement getTitle(){
		return driver.findElement(title);
	}
	public WebElement getMD_715(){
		return driver.findElement(MD_715);
	}
	public WebElement getPartData(){
		return driver.findElement(partData);
	}
	
	
}
