import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPATH_1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Vignesh\\driver\\chromedriver.exe");
	WebDriver xp = new ChromeDriver();
	xp.get("http://www.greenstechnologys.com/");
	xp.findElement(By.xpath("//a[text()='CONTACT US']")).click();
	xp.findElement(By.xpath("//textarea[@name='comments']")).sendKeys("hi");
	xp.findElement(By.xpath("//span[text()='Submit Now']")).click();
}
}
