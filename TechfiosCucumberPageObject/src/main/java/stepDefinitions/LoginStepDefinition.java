package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.LoginPage;
import util.BrowserFactory;

public class LoginStepDefinition {
	
	WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");

	
	
	@Given("^user is already on Login Page$")
	public void user_is_already_on_Login_Page() throws Throwable {
	    
	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) throws Throwable {
		
		LoginPage logintotechfios= PageFactory.initElements(driver, LoginPage.class);
		 logintotechfios.Login(username, password );
	    	
	}

	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
		
		driver.quit();
	    
	}



}
