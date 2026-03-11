package Demo.AutomationExercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

		WebDriver driver;
		
		public HomePage(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);	
		}
		
		@FindBy(linkText= "Signup / Login")
		WebElement signupLogin;
		
		@FindBy(xpath="//a[text()=' Cart']")
		WebElement cartBtn;
		
		public void clickSignupLogin() {
			signupLogin.click();
		}
		
		public void goToCart() {
		    cartBtn.click();
		}

	}


