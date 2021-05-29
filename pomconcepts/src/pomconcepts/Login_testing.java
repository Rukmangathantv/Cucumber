package pomconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_testing {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\User\\eclipse-workspace\\pomconcepts\\driver\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		
		login_pg pg = new login_pg(dr);
		pg.getEmail().sendKeys("rukmangathan@weather-india.com");
		pg.getPassword().sendKeys("87654321");
		pg.getSingin().click();
		
	}

}
