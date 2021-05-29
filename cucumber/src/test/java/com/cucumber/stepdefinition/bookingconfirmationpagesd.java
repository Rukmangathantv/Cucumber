package com.cucumber.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adacitin.helper.pomanager;
import com.cucumber.org.cucumber.baseclass;
import com.cucumber.runner.Adacitinwebsite_runner;

import cucumber.api.java.en.*;

public class bookingconfirmationpagesd extends baseclass{
	public static WebDriver dr=Adacitinwebsite_runner.driver;
	pomanager pom = new pomanager(dr);
	@When("^take screenshot after  confirmation done$")
	public void take_screenshot_after_confirmation_done() throws Throwable {
	   screenshot("adactin.png");
	}

	@Then("^click logout button$")
	public void click_logout_button() throws Throwable {
	    clicking(pom.getBcp().getLogout());
	}


}
