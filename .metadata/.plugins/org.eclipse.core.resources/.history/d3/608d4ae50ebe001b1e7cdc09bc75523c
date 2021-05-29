package com.MiruCucumber.org.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.MiruCucumber.org.Adacitin.baseclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\MiruCucumber\\org\\feature\\adactin.feature",
				glue ="com\\MiruCucumber\\org\\stepdefinitions")
public class adactinrunner {
	
	public static WebDriver driver;
	@BeforeClass
	public static void open() {
		driver =baseclass.openbrowser("chrome");
	}
	
	@AfterClass
	public static void teardown() {
		driver.close();
	}

}
