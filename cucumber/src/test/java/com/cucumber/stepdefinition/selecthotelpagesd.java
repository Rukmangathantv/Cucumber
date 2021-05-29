package com.cucumber.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adacitin.helper.pomanager;
import com.cucumber.org.cucumber.baseclass;
import com.cucumber.runner.Adacitinwebsite_runner;

import cucumber.api.java.en.*;

public class selecthotelpagesd extends baseclass {
	public static WebDriver dr = Adacitinwebsite_runner.driver;
	pomanager pom = new pomanager(dr);
	@When("^Select the hotel$")
	public void select_the_hotel() throws Throwable {
	   clicking(pom.getShp1().getRadiobutton());
	}

	@Then("^click continue button$")
	public void click_continue_button() throws Throwable {
	    clicking(pom.getShp1().getContinu());
	}
}
