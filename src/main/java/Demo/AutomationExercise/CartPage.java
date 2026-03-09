package Demo.AutomationExercise;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilProperties.AbstractComponents;

public class CartPage extends AbstractComponents  {
	WebDriver driver;
	
	public CartPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//tr[starts-with(@id,'product')]")
	List<WebElement> cartRows;
	
	@FindBy(css=".cart_description h4 a")
	List<WebElement> productNames;
	
	@FindBy(css=".cart_price p")
	List<WebElement> productPrices;
	
	@FindBy(css=".cart_quantity button")
	List<WebElement> productQuantity;
	
	@FindBy(css=".cart_total p")
	List<WebElement> totalPrices;
	
//	@FindBy(css=".cart_delete a")
//	List<WebElement> removeButton;
	
	@FindBy(xpath="//a[text()='Proceed To Checkout']")
	WebElement checkOutButton;
	
	@FindBy(xpath="//a[text()='Place Order']")
	WebElement placeOrder;
	
	public int cartItemCount() {
		return cartRows.size();
	}
	
	public String getProductNames(int index) {
		return productNames.get(index).getText();
	}
	
	public String getProductPrices(int index) {
		return productPrices.get(index).getText();
	}
	
	public String getProductQunatity(int index) {
		return productQuantity.get(index).getText();
	}
	
	public String getTotalPrice(int index) {
		return totalPrices.get(index).getText();
	}
	
/*	
	public void removeProduct(int index) {
		removeButton.get(index).click();
	}
*/	
	public void checkOut() {
		waitForElementToAppear(checkOutButton);
		checkOutButton.click();
	}
	
	public void orderPlaced() throws InterruptedException {
		//waitForElementToAppear(placeOrder);
		Thread.sleep(5000);
		placeOrder.click();

	}

}
