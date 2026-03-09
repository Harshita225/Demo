package Demo.AutomationExercise;

import org.testng.annotations.Test;

public class SignupTest extends BaseTest{
	
	@Test(priority=1)
	public void validSignUp() {
		HomePage hp=new HomePage(driver);
		hp.clickSignupLogin();
		
		SignupPage sp=new SignupPage(driver);
		sp.signup("Apple", "abc894@gmail.com");
		sp.selectTitle();
		sp.enterPswd("1234567");
		sp.selectDOB("15","March","2004");
		sp.selectNewsLetter();
		sp.selectOffers();
		sp.enterFirstName("Apple");
		sp.enterLastName("Sony");
		sp.enterCompany("ABC Pvt Ltd");
		sp.enterAddress("Street 1","Apartment 5");
		sp.selectCountry("India");
		sp.enterState("Telangana");
		sp.enterCity("Hyderabad");
		sp.enterZipCode("5000213");
		sp.enterMobileNumber("9876543201");
		sp.clickCreateAccount();
	}
	
/*	@Test(priority=2)
	public void enterAccountInfo() {
		SignupPage sp=new SignupPage(driver);
		sp.selectTitle();
		sp.enterPswd("1234567");
		sp.selectDOB("15","March","2004");
		sp.selectNewsLetter();
		sp.selectOffers();
		sp.enterFirstName("Apple");
		sp.enterLastName("Sony");
		sp.enterCompany("ABC Pvt Ltd");
		sp.enterAddress("Street 1","Apartment 5");
		sp.selectCountry("India");
		sp.enterState("Telangana");
		sp.enterCity("Hyderabad");
		sp.enterZipCode("5000213");
		sp.enterMobileNumber("9876543201");
		sp.clickCreateAccount();
		
		
	}
*/	
}
