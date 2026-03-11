package Demo.AutomationExercise;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="email")
	WebElement emailId;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(css = "button[data-qa='login-button']")
	WebElement loginButton;
	
	@FindBy(xpath = "//a[contains(text(),'Logged in as')]")
	WebElement loggedInUserText;

	public void login(String email, String pass) throws InterruptedException {
		emailId.sendKeys(email);
		Thread.sleep(5000);
		password.sendKeys(pass);
		Thread.sleep(5000);
		loginButton.click();
		Thread.sleep(5000);
		
	}

	
/*	public void loginWithRetry(String email, String pass) {

	    emailId.sendKeys(email);
	    password.sendKeys(pass);
	    loginButton.click();

	    if(!isUserLoggedIn()) {

	        System.out.println("Login not successful, retrying...");

	        driver.navigate().refresh();

	        emailId.sendKeys(email);
	        password.sendKeys(pass);
	        loginButton.click();
	    }
	}
	
	public boolean isUserLoggedIn() {
	    try {
	        return loggedInUserText.isDisplayed();
	    } catch (Exception e) {
	        return false;
	    }
	}
	
/*	public String getLoggedInUsername() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
	    wait.until(ExpectedConditions.visibilityOf(loggedInUserText));
	    Thread.sleep(7000);
		String text = loggedInUserText.getText(); 
		Thread.sleep(5000);
		return text.replace("Logged in as ", "").trim();
	}
*/
}
