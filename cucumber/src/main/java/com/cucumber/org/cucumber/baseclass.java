package com.cucumber.org.cucumber;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class baseclass {
	public static  WebDriver dr;
	public static WebDriver openbrowser(String a) {
		if(a.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Vignesh\\driver\\chromedriver.exe");
			dr = new ChromeDriver();
		}
		else if(a.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\User\\eclipse-workspace\\Vignesh\\driver\\msedgedriver.exe");
			dr = new EdgeDriver();
		}
		else {
		System.out.println("invalid browser");
		}
		return dr;
	}
	public static void geturl(String b) {
		dr.get(b);
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	public static void sendkeys(WebElement ele, String c){
		ele.sendKeys(c);	
	}
	public static void clicking(WebElement ele1) {
		ele1.click();
	}
	public static void scrolling(WebElement ele2) {
		JavascriptExecutor js =(JavascriptExecutor) dr ;
		js.executeScript("arguments[0].scrollIntoView();" , ele2);	
	}
	public static void actioning(WebElement ele3,String value,WebElement ele4) {
		Actions ac = new Actions(dr);
		if(value.equalsIgnoreCase("movetoelement")) {
			ac.moveToElement(ele3).build().perform();
		}
		else if(value.equalsIgnoreCase("rightclick")){
			ac.contextClick(ele3).build().perform();
		}
		else if(value.equalsIgnoreCase("doubleclick")) {
			ac.doubleClick(ele3).build().perform();
		}
		else if(value.equalsIgnoreCase("draganddrop")) {
			ac.dragAndDrop(ele3, ele4).build().perform();
		} else {
			System.out.println("invalid action");
		}			
	}
	public static void alert(String d, String e) {
		if(d.equalsIgnoreCase("acceptalert")) {
			dr.switchTo().alert().accept();
			}
			else if(d.equalsIgnoreCase("dismissalert")){
			dr.switchTo().alert().dismiss();	
			}
			else if(d.equalsIgnoreCase("promptalert")) {
				dr.switchTo().alert().sendKeys(e);
				dr.switchTo().alert().accept();
		} else {
			System.out.println("invaid alert");
		}
	}
	public static void framing(String optn,WebElement ele5, String value) {
		if(optn.equalsIgnoreCase("index")) {
			int parseInt = Integer.parseInt(value);
			dr.switchTo().frame(parseInt);
		} else if(optn.equalsIgnoreCase("value")) {
			dr.switchTo().frame(value);
		}else if(optn.equalsIgnoreCase("webelement")) {
			dr.switchTo().frame(ele5);
		}else {
			System.out.println("invalid frame");
		}
	}
	public static void screenshot(String f) {
		TakesScreenshot ts = (TakesScreenshot) dr;
		File t =ts.getScreenshotAs(OutputType.FILE);
		File destn = new File(f);
		try {
			FileUtils.copyFile(t, destn);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static void dropdown(WebElement ele6,String optn,String value) {
		Select sc = new Select(ele6);
		if(optn.equalsIgnoreCase("byIndex")) {
			int parseInt = Integer.parseInt(value);
			sc.selectByIndex(parseInt);
		} else if(optn.equalsIgnoreCase("byvalue")) {
			sc.selectByValue(value);
		}else if(optn.equalsIgnoreCase("byvisibletext")) {
			sc.selectByVisibleText(value);
		}else {
			System.out.println("invalid dropdown");
		}
	}	
}
