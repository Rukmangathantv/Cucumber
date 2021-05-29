import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatrs {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Miru\\drivers\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
	
		dr.get("https://www.facebook.com/");
		WebElement login = dr.findElement(By.id("email"));
		login.sendKeys("9840781780");
		WebElement pswrd = dr.findElement(By.id("pass"));
		pswrd.sendKeys("2345th");
		dr.close();
		
		WebDriver dr1 = new ChromeDriver();
		dr1.get("https://www.redbus.in/");
		WebElement src = dr1.findElement(By.id("src"));
		src.sendKeys("chennai");
		WebElement destn = dr1.findElement(By.id("dest"));
		destn.sendKeys("Salem");
		dr1.close();
		
		dr.navigate().to(" https://www.google.com/");
		WebElement search = dr.findElement(By.name("q"));
		search.sendKeys("GreensTechnology");
	
		dr.navigate().to("https://www.lvbankonline.in/index.html?module=login");
		Thread.sleep(10000);
		dr.findElement(By.id("login_username|input")).sendKeys("354647892");
		dr.findElement(By.id("login_password|input")).sendKeys("dffgd");
		
		dr.navigate().to("https://infinity.icicibank.com/corp/Login.jsp");
		WebElement username = dr.findElement(By.xpath("//input[@id=\"DUMMY1\"]"));
		username.sendKeys("528577488");
		username.click();
		WebElement user = dr.findElement(By.xpath("//input[@id=\"AuthenticationFG.USER_PRINCIPAL\"]"));
		user.sendKeys("52857753478");
		WebElement pass = dr.findElement(By.xpath("//input[@id=\"AuthenticationFG.ACCESS_CODE\"]"));
		pass.sendKeys("dddddd");
	
		dr.get("https://www.instagram.com/accounts/login/?hl=en) login page");
		Thread.sleep(4000);
		dr.findElement(By.name("username")).sendKeys("683834454");
		dr.findElement(By.name("password")).sendKeys("jbchdvdsv");
		
		dr.navigate().to("https://www.snapdeal.com/login");
		WebElement z = dr.findElement(By.id("userName"));
		z.sendKeys("9840781780");
		
		dr.navigate().to("https://www.swiggy.com");
		WebElement y = dr.findElement(By.id("location"));
		y.sendKeys("chennai");
	
		dr.navigate().to("http://www.adactin.com/HotelApp/");
		WebElement aa = dr.findElement(By.id("username"));
		aa.sendKeys("sddsd");
		WebElement bb = dr.findElement(By.id("password"));
		bb.sendKeys("ffvef");
	
	}

}
