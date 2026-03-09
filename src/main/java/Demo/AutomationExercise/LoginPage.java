package Demo.AutomationExercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

	public void login(String email, String pass) {
		emailId.sendKeys(email);
		password.sendKeys(pass);
		loginButton.click();
		
	}
	
	public String getLoggedInUsername() {
		String text = loggedInUserText.getText(); 
		return text.replace("Logged in as ", "").trim();
	}

}
