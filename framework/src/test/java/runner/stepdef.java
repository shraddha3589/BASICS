package runner;

public class stepdef {
	Webdriver driver;
	@Given("^I am a registered user on Magento$")
	public void i_am_a_registered_user_on_Magento() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   driver = new ChromeDriver();
	   
	}

	@When("^I update my user name and password$")
	public void i_update_my_user_name_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^I click on login button$")
	public void i_click_on_login_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^I should get access$")
	public void i_should_get_access() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

}
