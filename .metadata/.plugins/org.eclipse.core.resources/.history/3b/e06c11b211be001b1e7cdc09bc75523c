package com.MiruCucumber.org.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.MiruCucumber.org.Adacitin.baseclass;
import com.MiruCucumber.org.pom.loginpg;
import com.MiruCucumber.org.runner.adactinrunner;

import cucumber.api.java.en.*;

public class loginpgsd extends baseclass {

	public static WebDriver dr = adactinrunner.driver;
	loginpg lp = new loginpg(dr);
	
	@Given("^enter url of adactin application$")
	public void enter_url_of_adactin_application() throws Throwable {
	    geturl("https://adactinhotelapp.com/");
	}

	@When("^user enter \"([^\"]*)\" as username$")
	public void user_enter_as_username(String arg1) throws Throwable {
	   sendkeys(lp.getUsername(),arg1);
	}

	@When("^user enter \"([^\"]*)\" as password$")
	public void user_enter_as_password(String arg1) throws Throwable {
	    sendkeys(lp.getPassword(),arg1);
	}

	@When("^user click login button$")
	public void user_click_login_button() throws Throwable {
	   clicking(lp.getLogin());
	}

	@Then("^user validate login button$")
	public void user_validate_login_button() throws Throwable {
	    
	}


}
