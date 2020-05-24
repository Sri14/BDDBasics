package stepDef;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MapsStepDef {

	static WebDriver driver;

	@Given("^I am on CRM loginpage$")
	public void i_am_on_CRM_loginpage() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://ui.cogmento.com/");
	}

	@When("^I enter username and password$") //This Data Table is using by List
	public void i_enter_username_and_password(DataTable loginDetails) throws Throwable {
		List<List<String>> data = loginDetails.raw();

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(data.get(0).get(0));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data.get(0).get(1));
		Thread.sleep(3000);

	}

	@When("^I click on login button$")
	public void i_click_on_login_button() throws Throwable {
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		Thread.sleep(3000);
	}

	@Then("^I am click on companies tab$")
	public void i_am_click_on_companies_tab() throws Throwable {
		driver.findElement(By.xpath("//span[contains(text(),'Companies')]")).click();
		Thread.sleep(2000);
	}

	@Then("^I create a new company$")
	public void i_create_a_new_company() throws Throwable {
		driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
		Thread.sleep(2000);
	}

	@Then("^I fill in new company detilas$") // This DataTable is by using Maps
	public void i_fill_in_new_company_detilas(DataTable comDetials) throws Throwable {
		for (Map<String, String> details : comDetials.asMaps(String.class, String.class)) {

			driver.findElement(By
					.xpath("//div[@class='ui right corner labeled input']" + " //input[@autocomplete='new-password']"))
					.sendKeys(details.get("Company Name"));
			driver.findElement(By.xpath("//input[@name='address']")).sendKeys(details.get("Address"));
			driver.findElement(By.xpath("//input[@name='city']")).sendKeys(details.get("City"));
			driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys(details.get("Description"));
			Thread.sleep(2000);
			driver.findElement(By.xpath("//i[@class='save icon']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[contains(text(),'Companies')]")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//button[contains(text(),'New')]")).click();
			Thread.sleep(2000);
			
		}

	}

}
