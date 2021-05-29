package com.cucumber.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adacitin.helper.FileReaderManager;
import com.cucumber.org.cucumber.baseclass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\com\\cucumber\\feature\\adactin.feature",
					glue="com\\cucumber\\stepdefinition",
					monochrome = true)
public class Adacitinwebsite_runner {
	public static WebDriver driver;
	
	@BeforeClass
	public static void open() throws IOException  {
		driver= baseclass.openbrowser(FileReaderManager.getcr().getbrowser());
		
	}
@AfterClass
public static void teardown() {
	driver.close();
}
}
