import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Miru\\drivers\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		Thread.sleep(2000);
		WebElement frame1 = dr.findElement(By.xpath("//frame[@name='login_page']"));
		dr.switchTo().frame(frame1);
		dr.findElement(By.xpath("//img[@alt='continue'][1]")).click();
		Thread.sleep(2000);
		dr.switchTo().alert().accept();
		
		dr.navigate().to("https://www.lvbankonline.in/index.html?module=login");
		Thread.sleep(9000);
		dr.findElement(By.xpath("//span[@id='ui-id-13']")).click();
	}

}
