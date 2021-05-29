import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrolling {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Miru\\drivers\\chromedriver.exe");
		
		WebDriver dr =new ChromeDriver();
		dr.get("http://toolsqa.com/");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) dr;
		js.executeScript("window.scrollBy(0,5000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-2000)");
		Thread.sleep(2000);
		
		dr.navigate().to("http://www.greenstechnologys.com/");
		js.executeScript("window.scrollBy(0,1000)");
		TakesScreenshot ts = (TakesScreenshot) dr;
		File s1 = ts.getScreenshotAs(OutputType.FILE);
		File d1 = new File("C:\\Users\\User\\eclipse-workspace\\Miru\\screenshot pics\\s1.png");
		FileUtils.copyFile(s1, d1);
		dr.close();
		
		WebDriver dr1 =new ChromeDriver();
		dr1.get("https://www.snapdeal.com/");
		dr1.findElement(By.id("inputValEnter")).sendKeys("HP laptops");
		Thread.sleep(2000);
		dr1.findElement(By.xpath("//span[@class='searchTextSpan']")).click();
		Thread.sleep(2000);
		WebElement en = dr1.findElement(By.xpath("(//div[@class='filter-type-name lfloat'])[1]"));
		JavascriptExecutor js1 = (JavascriptExecutor) dr1;
		js1.executeScript("arguments[0].scrollIntoView();", en);
		Thread.sleep(2000);
		dr1.findElement(By.xpath("(//p[@class='product-title '])[1]")).click();
		Thread.sleep(2000);
		TakesScreenshot ts1 =(TakesScreenshot) dr1;
		File s2 = ts1.getScreenshotAs(OutputType.FILE);
		File d2 =new File("C:\\Users\\User\\eclipse-workspace\\Miru\\screenshot pics\\s2.png");
		FileUtils.copyFile(s2, d2);

	}

}
