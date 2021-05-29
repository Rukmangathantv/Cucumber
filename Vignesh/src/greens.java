import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class greens {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Desktop\\selenium\\driver\\chromedriver.exe");
		WebDriver greens =new ChromeDriver();
		greens.get("https://www.google.com/");
		WebElement search = greens.findElement(By.name("q"));
		search.sendKeys("green technology");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);	
		r.keyRelease(KeyEvent.VK_DOWN);	Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_DOWN);Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);Thread.sleep(2000);
		
	}
}
