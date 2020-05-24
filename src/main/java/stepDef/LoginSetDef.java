//package stepDef;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class LoginSetDef {
//
//	static WebDriver driver;
//	
//	@Given("^I am on CRM loginpage$")
//	public void i_am_on_CRM_loginpage() throws Throwable {
//	   WebDriverManager.chromedriver().setup();
//	   driver = new ChromeDriver();
//	   driver.get("https://ui.cogmento.com/");
//	   
//	}
//	
////	@When("^I enter username and password$")
////	public void i_enter_username_and_password() throws Throwable {
////	   driver.findElement(By.xpath("//input[@name='email']")).sendKeys(askbotta@gmail.com);
////	   driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Manoj123@);
////	   Thread.sleep(3000);
////	}
//	
////	\"(.*)\" is called regex 
//// 	\”([^\”]*)\” also achives the same result as above
//	
//
//	@When("^I enter \"(.*)\" and \"(.*)\"$")
//	public void i_enter_username_and_password(String username, String password) throws Throwable {
//	   driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
//	   driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
//	   Thread.sleep(3000);
		
//	}
//
//	@When("^I click on login button$")
//	public void i_click_on_login_button() throws Throwable {
//		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
//		
//	
//	}
//	
//	@Then("^I click on search and type \"(.*)\"$")
//	public void i_click_on_search_and_type_something(String typethis) throws Throwable {
//		Thread.sleep(2000);
//	   driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(typethis);;
//	   Thread.sleep(2000);
//	}
//
//
//	@Then("^I am able to login to homepage$")
//	public void i_am_able_to_login_to_homepage() throws Throwable {
//		String title = driver.getTitle();
//		Assert.assertEquals("Cogmento CRM", title);
//		Thread.sleep(2000);
//		driver.quit();
//		
//	}
//
//
//}
