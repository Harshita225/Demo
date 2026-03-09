package UtilProperties;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponents {
	
	WebDriver driver;
	WebDriverWait wait;
	
	//WAITS
	public AbstractComponents(WebDriver driver) {
		this.driver=driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(20));	
	}
	
	public void waitForElementToAppear(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void waitForElementToBeClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	
	//DROPDOWN
	public void selectByText(WebElement element, String text) {
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
	
	public void selectByValue(WebElement element, String value) {
		Select select=new Select(element);
		select.selectByValue(value);
	}
	
}
