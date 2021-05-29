import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webtable {

	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\User\\eclipse-workspace\\Miru\\drivers\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(2000);
		List<WebElement> all = dr.findElements(By.xpath("//table[@id='customers']//tbody//tr[5]//td[2]"));
		for(WebElement d:all) {
			System.out.println(d.getText());
			
		}
	}

}
