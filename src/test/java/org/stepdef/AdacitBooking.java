package org.stepdef;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AdacitBooking extends BaseClass{

	public AdacitBooking() {
		PageFactory.initElements(driver, this);

	}
	@FindBy(id="username")
	private WebElement username;
	@FindBy(id="password")
	private WebElement password;
	@FindBy(id="login")
	private WebElement login;
	@FindBy(id="location")
	private WebElement location;
	@FindBy(xpath = "(//select[@class='search_combobox'])[1]")
	private WebElement specificloc;
	

	public WebElement getLocation() {
		return location;
	}

	public WebElement getSpecificloc() {
		return specificloc;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}


}
