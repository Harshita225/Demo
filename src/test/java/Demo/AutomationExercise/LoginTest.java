package Demo.AutomationExercise;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{

	@Test(priority=1)
	public void validLogin() throws InterruptedException {
		//String expUser= "Priya";  
		HomePage hp=new HomePage(driver);
		hp.clickSignupLogin();
		
		LoginPage lp=new LoginPage(driver);
		lp.login("priya894@gmail.com", "1234567");
		
		 //String actualUser = lp.getLoggedInUsername();
		// System.out.println(actualUser);
		// Assert.assertEquals(actualUser,expUser);
	
	}
	
	@Test(priority=2)
	public void productsSearch() throws InterruptedException {
		
		ProductsPage pp=new ProductsPage(driver);
		pp.product();
		Thread.sleep(5000);
		pp.category();

		String actualTitle=pp.getcategoryTitle();
		System.out.println(actualTitle);
		Assert.assertTrue(actualTitle.contains("WOMEN - SAREE PRODUCTS"));
		Thread.sleep(10000);
		
		pp.productView();
		System.out.println("Product verified successfully");
		Thread.sleep(10000);
		
		pp.cart();
	
}
	

	@Test(priority=3)
	public void addProductToCartTest() throws InterruptedException {
		CartPage cp=new CartPage(driver);
		int count=cp.cartItemCount();
		Assert.assertTrue(count > 0);
		
		System.out.println("Product Name: " + cp.getProductNames(0));
		System.out.println("Price: " + cp.getProductPrices(0));
		System.out.println("Quantity: " + cp.getProductQunatity(0));
		System.out.println("Total: " + cp.getTotalPrice(0));
		cp.checkOut();
		if(cp.isLoginRequired()) {

	        cp.clickregloginBtn();

	        LoginPage lp = new LoginPage(driver);
	        lp.login("priya894@gmail.com","1234567");
	        
	        HomePage hp = new HomePage(driver);
	        hp.goToCart();
	        
	        cp.checkOut();
	    }
		cp.orderPlaced();
	}
	
	@Test(priority=4) 
	public void validPayments() throws InterruptedException {
		PaymentPage pp=new PaymentPage(driver);
		pp.getNameOnCard("Apple Sony");
		pp.getCardNumber("56789321");
		pp.getCVC("413");
		pp.getExpiration("05","2027");
		pp.payAndConfirmOrder();
		
		//String msg=pp.getSuccessMsg();
//		System.out.println(msg);
//		Assert.assertTrue(msg.contains("Your order has been placed successfully!"));
		Thread.sleep(5000);
		
		pp.getInvoice();
		Thread.sleep(5000);
		pp.clickContinue();
		Thread.sleep(5000);
	}
	
	@Test(priority=5)
	public void LoggedOutUser() {
		LogoutPage lp=new LogoutPage(driver);
		lp.LoggingOut();
	}
}

