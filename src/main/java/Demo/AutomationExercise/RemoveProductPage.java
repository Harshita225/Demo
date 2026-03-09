package Demo.AutomationExercise;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RemoveProductPage {
	WebDriver driver;
	
	public RemoveProductPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".cart_delete a")
	List<WebElement> removeButton;
	
	public void removeProduct(int index) {
		removeButton.get(index).click();
	}
}
