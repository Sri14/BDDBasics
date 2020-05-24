//package stepDef;
//
//import java.util.List;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class DataTableStepDef {
//
//	static WebDriver driver;
//
//	@Given("^I am on CRM loginpage$")
//	public void i_am_on_CRM_loginpage() throws Throwable {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("https://ui.cogmento.com/");
//	}
//
//	@When("^I enter  username and password$")
//	public void i_enter_username_and_password(DataTable loginDetails) throws Throwable {
//		List<List<String>> data	= loginDetails.raw();
//		
//		  	driver.findElement(By.xpath("//input[@name='email']")).sendKeys(data.get(0).get(0));
//		  	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data.get(0).get(1));
//		  	Thread.sleep(3000);
//	}
//
//	@When("^I click on login button$")
//	public void i_click_on_login_button() throws Throwable {
//
//	}
//
//	@Then("^I am able to login to homepage$")
//	public void i_am_able_to_login_to_homepage() throws Throwable {
//
//	}
//
//}
