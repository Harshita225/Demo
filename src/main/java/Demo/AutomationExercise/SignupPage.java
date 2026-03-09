package Demo.AutomationExercise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilProperties.AbstractComponents;

public class SignupPage extends AbstractComponents {
	WebDriver driver;
	
	public SignupPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="name")
	WebElement nameField;
	
	@FindBy(css="input[data-qa='signup-email']")
	WebElement emailField;
	
	
	@FindBy(css = "button[data-qa='signup-button']")
	WebElement signup;
	
	@FindBy(id="id_gender1")
	WebElement titleMr;
	
	@FindBy(id="id_gender2")
	WebElement titleMrs;
	
	@FindBy(css="input#name")
	WebElement Name;
	
	@FindBy(css = "input[data-qa='email']")
	WebElement EmailId;
	
	@FindBy(css="input[data-qa='password']")
	WebElement Password;
	
	@FindBy(css="select#days")
	WebElement DaysDropDown;
	
	@FindBy(css="select#months")
	WebElement MonthsDropDown;
	
	@FindBy(css="select#years")
	WebElement YearsDropDown;
	
	@FindBy(css="input#newsletter")
	WebElement newsletterCheckBox;
	
	@FindBy(css="input#optin")
	WebElement offersCheckBox;
	
	@FindBy(css = "input[data-qa='first_name']")
	WebElement FirstName;
	
	@FindBy(css="input[id='last_name']")
	WebElement LastName;
	
	@FindBy(css="input#company")
	WebElement Company;
	
	@FindBy(css="input#address1")
	WebElement address1;
	
	@FindBy(css="input#address2")
	WebElement address2;
	
	@FindBy(css="select#country")
	WebElement country;
	
	@FindBy(css="input#state")
	WebElement state;
	
	@FindBy(css="input#city")
	WebElement city;
	
	@FindBy(css="input#zipcode")
	WebElement zipcode;
	
	@FindBy(css="input#mobile_number")
	WebElement mobile;
	
	@FindBy(xpath="//button[text()=\"Create Account\"]")
	WebElement createAccountBtn;
	
	public void signup(String name, String email) {
		nameField.sendKeys(name);
		emailField.sendKeys(email);
		signup.click();
	}
	
	public void selectTitle() {
		titleMrs.click();
	}
	
	public void enterPswd(String pswd) {
		Password.sendKeys(pswd);
	}
	
	public void selectDOB(String Day, String Month, String Year) {
		selectByText(DaysDropDown, Day);
		selectByText(MonthsDropDown, Month);
		selectByText(YearsDropDown, Year);
	}
	
	public void selectNewsLetter() {
		newsletterCheckBox.click();
	}
	
	public void selectOffers() {
		offersCheckBox.click();
	}
	
	public void enterFirstName(String fname) {
		FirstName.sendKeys(fname);
	}
	
	public void enterLastName(String lname) {
		LastName.sendKeys(lname);
	}
	
	public void enterCompany(String compName) {
		Company.sendKeys(compName);
	}
	
	public void enterAddress(String add1, String add2) {
		address1.sendKeys(add1);
		address2.sendKeys(add2);
	}
	
	public void selectCountry(String countryName) {
		selectByText(country,countryName);
	}
	
	public void enterState(String stateName) {
		state.sendKeys(stateName);
	}
	 
	public void enterCity(String cityName) {
		 city.sendKeys(cityName);
	}
	
	public void enterZipCode(String zcode) {
		zipcode.sendKeys(zcode);
	}
	
	public void enterMobileNumber(String mob) {
		mobile.sendKeys(mob);
	}
	
	public void clickCreateAccount() {
		createAccountBtn.click();
	}
}
