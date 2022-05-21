package org.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef extends BaseClass{
	WebDriver driver;
    AdacitBooking ab = new AdacitBooking();
	@Given("user should launch the browser and url {string}")
	public void userShouldLaunchTheBrowserAndUrl(String string) {
		Browser("chrome");
		getUrl (string);
		
	
	}

	@Given("user should enter the username {string} and password {string} and click the login")
	public void userShouldEnterTheUsernameAndPasswordAndClickTheLogin(String string, String string2) {
	    ab.getUsername().sendKeys(string);
	    ab.getPassword().sendKeys(string2);
	}

	@Given("user should validate the login by confirming the user details")
	public void userShouldValidateTheLoginByConfirmingTheUserDetails() {
	
	}
	

}
