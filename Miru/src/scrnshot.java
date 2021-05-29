import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrnshot {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Miru\\drivers\\chromedriver.exe");
		
		WebDriver dr = new ChromeDriver();
		dr.get("http://www.greenstechnologys.com/");
		dr.manage().window().maximize();
		
		TakesScreenshot ts =(TakesScreenshot) dr;
		File pic = ts.getScreenshotAs(OutputType.FILE);
		File destn = new File("C:\\Users\\User\\eclipse-workspace\\Miru\\screenshot pics\\img.png");
		FileUtils.copyFileToDirectory(pic, destn);
		dr.close();
		
		WebDriver dr1 = new ChromeDriver();
		dr1.get("https://www.amazon.in/");
		dr1.manage().window().maximize();
		WebElement se = dr1.findElement(By.id("twotabsearchtextbox"));
		se.sendKeys("motorola");
		Thread.sleep(5000);
		dr1.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[2]")).click();
		Thread.sleep(5000);
		dr1.findElement(By.xpath("//span[text()='Motorola E7 Plus (Misty Blue, 64 GB) (4 GB RAM)']")).click();
		
		TakesScreenshot ts1 = (TakesScreenshot) dr1;
		File pic1 = ts1.getScreenshotAs(OutputType.FILE);
		File destn1 = new File("C:\\Users\\User\\eclipse-workspace\\Miru\\screenshot pics\\img1.png");
		FileUtils.copyFileToDirectory(pic1, destn1);
		dr1.close();
		
		
		
	}
}
