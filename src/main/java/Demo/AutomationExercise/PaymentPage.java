package Demo.AutomationExercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilProperties.AbstractComponents;

public class PaymentPage extends AbstractComponents{
	
	WebDriver driver;
	public PaymentPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "input[data-qa='name-on-card']")
	WebElement nameOnCard;
	
	@FindBy(css="input[data-qa=\"card-number\"]")
	WebElement cardNumber;
	
	@FindBy(css="input[data-qa=\"cvc\"]")
	WebElement cvc;
	
	@FindBy(css="input[data-qa=\"expiry-month\"]")
	WebElement Month;
	
	@FindBy(css="input[data-qa=\"expiry-year\"]")
	WebElement Year;
	
	@FindBy(css="button[data-qa=\"pay-button\"]")
	WebElement payButton;
	
	@FindBy(xpath="//div[contains(text(),'Your order has been placed successfully!')]")
	WebElement successMsg;
	
	@FindBy(xpath="//a[text()=\"Download Invoice\"]")
	WebElement downloadInvoice;
	
	@FindBy(xpath="//a[text()=\"Continue\"]")
	WebElement continueBtn;
	
	public void getNameOnCard(String name) throws InterruptedException {
		//waitForElementToAppear(nameOnCard);
		Thread.sleep(5000);
		nameOnCard.sendKeys(name);
	}
	
	public void getCardNumber(String Cnum) {
		cardNumber.sendKeys(Cnum);
	}
	
	public void getCVC(String cvcnum) {
		cvc.sendKeys(cvcnum);
	}
	
	public void getExpiration(String mon, String years) {
		Month.sendKeys(mon);
		Year.sendKeys(years);
	}
	
	public void payAndConfirmOrder() throws InterruptedException {
		Thread.sleep(5000);
		payButton.click();
	}
	
//	public String getSuccessMsg() {
//		waitForElementToAppear(successMsg);
//	    return successMsg.getText();
//	}
	
	public void getInvoice() {
		downloadInvoice.click();
	}
	
	public void clickContinue() {
		continueBtn.click();
	}
	
}
