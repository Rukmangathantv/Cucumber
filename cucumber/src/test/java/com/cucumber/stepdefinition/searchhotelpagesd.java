package com.cucumber.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adacitin.helper.pomanager;
import com.cucumber.org.cucumber.baseclass;
import com.cucumber.runner.Adacitinwebsite_runner;

import cucumber.api.java.en.*;

public class searchhotelpagesd extends baseclass {
	public static WebDriver dr = Adacitinwebsite_runner.driver;
	pomanager pom = new pomanager(dr);
	@When("^select location of the hotel$")
	public void select_location_of_the_hotel() throws Throwable {
	    dropdown(pom.getShp().getLocation(), "byvalue", "London");
	}

	@When("^select hotel type$")
	public void select_hotel_type() throws Throwable {
	    dropdown(pom.getShp().getHotels_type(), "byvalue", "Hotel Cornice");
	}

	@When("^select room type$")
	public void select_room_type() throws Throwable {
	   dropdown(pom.getShp().getRoom_type(), "byvalue", "Double");
	}

	@When("^select number of rooms$")
	public void select_number_of_rooms() throws Throwable {
		dropdown(pom.getShp().getRoom_nos(), "byvalue", "3");
	}

	@When("^enter \"([^\"]*)\" as Check in date$")
	public void enter_as_Check_in_date(String arg1) throws Throwable {
	   sendkeys(pom.getShp().getDatepick_in(), arg1);
	}

	@When("^enter \"([^\"]*)\" as Check out date$")
	public void enter_as_Check_out_date(String arg1) throws Throwable {
	    sendkeys(pom.getShp().getDatepick_out(), arg1);
	}

	@When("^select no of adults$")
	public void select_no_of_adults() throws Throwable {
		dropdown(pom.getShp().getAdult_room(), "byvalue", "3");
	}

	@When("^select number of childrens$")
	public void select_number_of_childrens() throws Throwable {
		dropdown(pom.getShp().getChild_room(), "byvalue", "3");
	}

	@Then("^click search button$")
	public void click_search_button() throws Throwable {
	  clicking(pom.getShp().getSubmit());
	}
}
