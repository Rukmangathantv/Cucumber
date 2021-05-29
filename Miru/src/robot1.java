import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class robot1 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Miru\\drivers\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		Actions ac = new Actions(dr);
		Robot r = new Robot();
		//task 2
		dr.get("https://www.google.co.in/webhp");
		Thread.sleep(3000);
		dr.findElement(By.xpath("//a[@class='gb_D']")).click();
		r.keyPress(KeyEvent.VK_TAB);		r.keyRelease(KeyEvent.VK_TAB);		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_TAB);		r.keyRelease(KeyEvent.VK_TAB);		Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_TAB);		r.keyRelease(KeyEvent.VK_TAB);		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_TAB);		r.keyRelease(KeyEvent.VK_TAB);		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_TAB);		r.keyRelease(KeyEvent.VK_TAB);		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_TAB);		r.keyRelease(KeyEvent.VK_TAB);		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_TAB);		r.keyRelease(KeyEvent.VK_TAB);		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_TAB);		r.keyRelease(KeyEvent.VK_TAB);		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_TAB);		r.keyRelease(KeyEvent.VK_TAB);		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_TAB);		r.keyRelease(KeyEvent.VK_TAB);		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);		r.keyRelease(KeyEvent.VK_ENTER);	Thread.sleep(3000);
		//task 1
		dr.navigate().to("https://www.facebook.com/");
		WebElement mail = dr.findElement(By.id("email"));
		mail.sendKeys("mirunalini0506@gmail.com");
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);	r.keyRelease(KeyEvent.VK_A);	Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_X);	r.keyRelease(KeyEvent.VK_X);	Thread.sleep(3000);
		r.keyRelease(KeyEvent.VK_CONTROL);	Thread.sleep(3000);
		dr.findElement(By.id("pass")).click();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);	r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);	Thread.sleep(3000);
		//TASK 6
		dr.navigate().to("http://www.greenstechnologys.com/selenium-course-content.html");
		Thread.sleep(3000);
		WebElement h1 = dr.findElement(By.xpath("//h1[@class='red']"));	Thread.sleep(3000);
		ac.contextClick(h1).build().perform();	Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);	r.keyRelease(KeyEvent.VK_DOWN);	Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);	r.keyRelease(KeyEvent.VK_DOWN);Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_DOWN);	r.keyRelease(KeyEvent.VK_DOWN);Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);	r.keyRelease(KeyEvent.VK_ENTER);
	}

}
