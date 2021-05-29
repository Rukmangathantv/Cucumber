import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class shop {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Vignesh\\driver\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://automationpractice.com/index.php");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		dr.findElement(By.xpath("//a[@class='login']")).click();
	//creating account
/*		dr.findElement(By.id("email_create")).sendKeys("mirunalini0506@gmail.com");
		dr.findElement(By.id("SubmitCreate")).click();
		dr.findElement(By.id("uniform-id_gender2")).click();
		dr.findElement(By.id("customer_firstname")).sendKeys("Mirunalini");
		dr.findElement(By.id("customer_lastname")).sendKeys("K S");
		dr.findElement(By.id("passwd")).sendKeys("12345678");
		WebElement s = dr.findElement(By.id("days"));
		Select sc= new Select(s);
		sc.selectByValue("5");
		WebElement s1 = dr.findElement(By.id("months"));
		Select sc1 = new Select(s1);
		sc1.selectByValue("6");
		WebElement s2 = dr.findElement(By.id("years"));
		Select sc2 = new Select(s2);
		sc2.selectByValue("1995");
		dr.findElement(By.id("address1")).sendKeys("dshfbzfdbzd");
		dr.findElement(By.id("city")).sendKeys("chennai");
		WebElement s3 = dr.findElement(By.id("id_state"));
		Select sc3 = new Select(s3);
		sc3.selectByValue("14");
		dr.findElement(By.id("postcode")).sendKeys("00000");
		dr.findElement(By.id("other")).sendKeys("7010936606");
		dr.findElement(By.id("phone_mobile")).sendKeys("7010936606");
		dr.findElement(By.id("submitAccount")).click();
	 */	//shopping
		dr.findElement(By.id("email")).sendKeys("mirunalini0506@gmail.com");
		dr.findElement(By.id("passwd")).sendKeys("12345678");
		dr.findElement(By.xpath("//i[@class ='icon-lock left']")).click();
		dr.findElement(By.xpath("(//a[text()='T-shirts'])[2]")).click();
		WebElement sc = dr.findElement(By.xpath("//span[text()='Styles']"));
		JavascriptExecutor js = (JavascriptExecutor) dr;
		js.executeScript("arguments[0].scrollIntoView();", sc);	
		WebElement a = dr.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
		Actions ac = new Actions(dr);
		ac.moveToElement(a).build().perform();
		dr.findElement(By.xpath("//span[text()='More']")).click();
		dr.findElement(By.xpath("//i[@class='icon-plus']")).click();
		WebElement sel = dr.findElement(By.id("group_1"));
		Select sc4 = new Select(sel);
		sc4.selectByValue("2");
		dr.findElement(By.id("color_14")).click();
		dr.findElement(By.xpath("//button[@class='exclusive']")).click();
		dr.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[2]")).click();
		dr.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]")).click();
		dr.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[7]")).click();
		dr.findElement(By.name("cgv")).click();
		dr.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]")).click();
		dr.findElement(By.className("cheque")).click();
		dr.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]")).click();
		WebElement scroll = dr.findElement(By.xpath("//div[@class='breadcrumb clearfix']"));
		JavascriptExecutor js1 = (JavascriptExecutor) dr;
		js1.executeScript("arguments[0].scrollIntoView();",scroll);
		TakesScreenshot ts =(TakesScreenshot) dr;
		File pic = ts.getScreenshotAs(OutputType.FILE);
		File destn = new File("C:\\Users\\User\\eclipse-workspace\\Miru\\screenshot pics\\shoping1.png");
		FileUtils.copyFile(pic, destn);
	}

}
