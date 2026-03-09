package Demo.AutomationExercise;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import UtilProperties.AbstractComponents;

public class ProductsPage extends AbstractComponents {
	
	 WebDriver driver;
	 public ProductsPage(WebDriver driver) {
		 super(driver);
		 this.driver=driver;
		 PageFactory.initElements(driver,this);
	 }
	 
	 @FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")
	 WebElement searchProduct;
	 
	 @FindBy(xpath = "//a[normalize-space()='Women']")
	 WebElement Women;
	 
	 @FindBy(xpath = "//a[normalize-space()='Saree']")
	 WebElement Saree;
	 
	 @FindBy(xpath="//*[@id='accordian']/div[2]/div[1]/h4/a")
	 WebElement Men;
	 
	 @FindBy(xpath="//*[@id='Men']/div/ul/li[1]/a")
	 WebElement Tshirts;
	 
	 @FindBy(xpath="//*[@id=\'accordian\']/div[3]/div[1]/h4/a")
	 WebElement Kids;
	 
	 @FindBy(xpath = "//*[@id='Kids']/div/ul/li[1]/a")
	 WebElement dresses;
	 
	 @FindBy(css = "h2.title.text-center")
	 WebElement Title;
	 
	 @FindBy(xpath = "/html/body/section/div/div[2]/div[2]/div/div[2]/div/div[2]/ul/li/a")
	 WebElement viewProduct;
	 
	 @FindBy(css = "button.btn.btn-default.cart")
	 WebElement addToCart;
	 
	 @FindBy(xpath = "//u[text()='View Cart']")
	 WebElement viewCartLink;
	 

	 public void product() {
		 searchProduct.click();
	 }
	
	 
	 public void category() {
		 waitForElementToAppear(Women);
		 Women.click();
		 waitForElementToAppear(Saree);
		 Saree.click();	 
		 waitForElementToAppear(Title);

	 }
	 
	 public String getcategoryTitle() {
		 return Title.getText();
	 }
	 
	 public void productView() throws InterruptedException {
		 waitForElementToAppear(viewProduct);
		 //Thread.sleep(5000);
		 viewProduct.click();
		 
	 }
	 
	 public void cart() throws InterruptedException {
		 waitForElementToAppear(addToCart);
		 Thread.sleep(2000); //for Ads purpose
		 addToCart.click();
		 
		 waitForElementToAppear(viewCartLink);
	     viewCartLink.click();
	     
	     Thread.sleep(2000);

	 }
	
	 
}
