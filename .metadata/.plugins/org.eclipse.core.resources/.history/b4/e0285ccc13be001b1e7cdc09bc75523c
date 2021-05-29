package com.MiruCucumber.org.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.MiruCucumber.org.Adacitin.baseclass;
import com.MiruCucumber.org.pom.conformpg;
import com.MiruCucumber.org.runner.adactinrunner;

import cucumber.api.java.en.*;

public class conformsd extends baseclass{
	public static WebDriver dr= adactinrunner.driver;
	conformpg cp = new conformpg(dr);
	@When("^click logout button$")
	public void click_logout_button() throws Throwable {
	    clicking(cp.getLogout());
	}
}
