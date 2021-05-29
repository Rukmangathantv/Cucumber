import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class browserLaunch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\User\\eclipse-workspace\\Miru\\drivers\\chromedriver.exe");
		WebDriver a = new ChromeDriver();
		
		a.get("http://www.google.com");
		a.manage().window().maximize();
		a.navigate().to("http://www.instagram.com");
		a.navigate().back();
		a.navigate().forward();
		a.navigate().refresh();
		String url = a.getCurrentUrl();
		System.out.println(url);
		a.quit();
		
		System.setProperty("webdriver.edge.driver", 
				"C:\\Users\\User\\eclipse-workspace\\Miru\\drivers\\msedgedriver.exe");
		WebDriver b = new EdgeDriver();
		
		b.get("http://www.facebook.com");
		String title = b.getTitle();
		System.out.println(title);
		b.close();
	}
}
