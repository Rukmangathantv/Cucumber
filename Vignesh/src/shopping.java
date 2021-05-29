import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class shopping {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Vignesh\\driver\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://automationpractice.com/index.php");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		dr.findElement(By.xpath("//a[@class='login']")).click();
		
		dr.findElement(By.id("email")).sendKeys("rukmangathan@weather-india.com");
		dr.findElement(By.id("passwd")).sendKeys("87654321");
		dr.findElement(By.xpath("//i[@class ='icon-lock left']")).click();
		dr.findElement(By.xpath("(//a[text()='T-shirts'])[2]")).click();
		
		WebElement sc = dr.findElement(By.xpath("//span[text()='Styles']"));
		JavascriptExecutor js = (JavascriptExecutor) dr;
		js.executeScript("arguments[0].scrollIntoView();", sc);
		
		WebElement a = dr.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]"));
		Actions ac = new Actions(dr);
		ac.moveToElement(a).build().perform();
		
		dr.findElement(By.xpath("//span[text()='Add to cart']")).click();
		
		
		dr.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[2]")).click();
		dr.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]")).click();
		dr.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[7]")).click();
		dr.findElement(By.name("cgv")).click();
		dr.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]")).click();
		dr.findElement(By.className("cheque")).click();
		dr.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]")).click();
		
	}
}
