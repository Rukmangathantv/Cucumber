import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class robot {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Miru\\drivers\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		Actions ac = new Actions(dr);
		Robot rd = new Robot();
		dr.get("https://www.amazon.in/");
		
		WebElement bs = dr.findElement(By.linkText("Best Sellers"));
		ac.contextClick(bs).build().perform();
		Thread.sleep(3000);
		rd.keyPress(KeyEvent.VK_DOWN);		rd.keyRelease(KeyEvent.VK_DOWN);
		rd.keyPress(KeyEvent.VK_ENTER);		rd.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement mob = dr.findElement(By.linkText("Mobiles"));
		ac.contextClick(mob).build().perform();
		Thread.sleep(3000);
		rd.keyPress(KeyEvent.VK_DOWN);
		rd.keyPress(KeyEvent.VK_ENTER);
		
		WebElement td = dr.findElement(By.linkText("Today's Deals"));
		ac.contextClick(td).build().perform();
		Thread.sleep(3000);
		rd.keyPress(KeyEvent.VK_DOWN);
		rd.keyPress(KeyEvent.VK_ENTER);
		
		WebElement fn = dr.findElement(By.linkText("Fashion"));
		ac.contextClick(fn).build().perform();
		Thread.sleep(3000);
		rd.keyPress(KeyEvent.VK_DOWN);
		rd.keyPress(KeyEvent.VK_ENTER);
		
		WebElement nr = dr.findElement(By.linkText("New Releases"));
		ac.contextClick(nr).build().perform();
		Thread.sleep(3000);
		rd.keyPress(KeyEvent.VK_DOWN);
		rd.keyPress(KeyEvent.VK_ENTER);
	}

}
