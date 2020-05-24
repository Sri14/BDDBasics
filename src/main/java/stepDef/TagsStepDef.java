package stepDef;

import static org.junit.Assert.assertEquals;



import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class TagsStepDef {
	@Before
	public void before() {
		System.out.println("****Before method******");
	}
	
	public void after() {
		System.out.println("*******After method******");
	}
	@Given("^I am on amazon$")
	public void i_am_on_amazon() throws Throwable {
		System.out.println("I am on amazon");
	}

	@Given("^I select an item$")
	public void i_select_an_item() throws Throwable {
		System.out.println("I select an item");
	}

	@Given("^I add another item$")
	public void i_add_another_item() throws Throwable {
		System.out.println("I add another item");
	}

	@Given("^I change quanity$")
	public void i_change_quanity() throws Throwable {
		System.out.println("I change quanity");
	}

	@Given("^I add my address$")
	public void i_add_my_address() throws Throwable {
		System.out.println("I add my address");
	}

	@Given("^I pay for it$")
	public void i_pay_for_it() throws Throwable {
		System.out.println("I pay for it");

	}

}
