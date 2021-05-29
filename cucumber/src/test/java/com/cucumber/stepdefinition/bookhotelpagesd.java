package com.cucumber.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adacitin.helper.pomanager;
import com.cucumber.org.cucumber.baseclass;
import com.cucumber.runner.Adacitinwebsite_runner;

import cucumber.api.java.en.*;

public class bookhotelpagesd extends baseclass{
	public static WebDriver dr = Adacitinwebsite_runner.driver;
	pomanager pom = new pomanager(dr);
	@When("^Enter \"([^\"]*)\" as firstname$")
	public void enter_as_firstname(String arg1) throws Throwable {
	   sendkeys(pom.getBhp().getFirst_name(), arg1);
	}

	@When("^enter \"([^\"]*)\" as lastname$")
	public void enter_as_lastname(String arg1) throws Throwable {
	    sendkeys(pom.getBhp().getLast_name(), arg1);
	}

	@When("^enter \"([^\"]*)\" as billing address$")
	public void enter_as_billing_address(String arg1) throws Throwable {
	    sendkeys(pom.getBhp().getAddress(), arg1);
	}

	@When("^enter \"([^\"]*)\" as card number$")
	public void enter_as_card_number(String arg1) throws Throwable {
	    sendkeys(pom.getBhp().getCc_num(), arg1);
	}

	@When("^select card type$")
	public void select_card_type() throws Throwable {
	   dropdown(pom.getBhp().getCc_type(), "byvalue", "VISA");
	}

	@When("^select exp month$")
	public void select_exp_month() throws Throwable {
		dropdown(pom.getBhp().getCc_exp_month(), "byvalue", "6");
	}

	@When("^select exp year$")
	public void select_exp_year() throws Throwable {
		dropdown(pom.getBhp().getCc_exp_year(), "byvalue", "2022");
	}

	@When("^enter  cvv num$")
	public void enter_cvv_num() throws Throwable {
	    sendkeys(pom.getBhp().getCc_cvv(), "123");
	}

	@Then("^click book now button$")
	public void click_book_now_button() throws Throwable {
	   clicking(pom.getBhp().getBook_now());
	}
}
