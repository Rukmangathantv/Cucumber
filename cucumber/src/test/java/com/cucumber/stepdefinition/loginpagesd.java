package com.cucumber.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adacitin.helper.FileReaderManager;
import com.adacitin.helper.pomanager;
import com.cucumber.org.cucumber.baseclass;
import com.cucumber.pom.loginpage;
import com.cucumber.runner.Adacitinwebsite_runner;

import cucumber.api.java.en.*;

public class loginpagesd extends baseclass{
	public static WebDriver dr= Adacitinwebsite_runner.driver;
	pomanager pom = new pomanager(dr);
	loginpage lp = new loginpage(dr);
	@Given("^enter the url of the website$")
	public void enter_the_url_of_the_website() throws Throwable {
	   geturl(FileReaderManager.getmanager().getcr().geturl());
	}

	@When("^user enters \"([^\"]*)\" as username$")
	public void user_enters_as_username(String arg1) throws Throwable {
	   sendkeys(pom.getLp().getUsername(), arg1);
	}

	@When("^user enters \"([^\"]*)\" as password$")
	public void user_enters_as_password(String arg1) throws Throwable {
	    sendkeys(pom.getLp().getPassword(), arg1);
	}

	@When("^user click login button$")
	public void user_click_login_button() throws Throwable {
	    clicking(pom.getLp().getLogin());
	}

	@Then("^user validate the login button$")
	public void user_validate_the_login_button() throws Throwable {
	   
	}
}
