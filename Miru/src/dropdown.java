import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class dropdown {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Miru\\drivers\\chromedriver.exe");
		WebDriver dr =new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://portal.incometaxindiaefiling.gov.in/e-Filing/UserLogin/LoginHome.html?lang=eng");
		dr.findElement(By.xpath("//button[text()='Continue to Homepage']")).click();
		dr.findElement(By.xpath("(//input[@class='sec_btn'])[1]")).click();
		WebElement sel = dr.findElement(By.xpath("//select[@id='userTypeSel']"));
		Select sc = new Select(sel);
		sc.selectByVisibleText("Individual");
		dr.close();
		Thread.sleep(5000);
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Miru\\drivers\\chromedriver.exe");
		WebDriver dr1 =new ChromeDriver();
		dr1.get("https://www.gettyimages.in/");
		Thread.sleep(5000);
		WebElement aa = dr1.findElement(By.xpath("//div[@ng-click='showOverlay()']"));
		aa.click();
		Thread.sleep(5000);
		dr1.findElement(By.xpath("(//label[contains(text(),'Editorial')])[2]")).click();
		Thread.sleep(10000);
		dr1.close();
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Miru\\drivers\\chromedriver.exe");
		WebDriver dr2 =new ChromeDriver();
		dr2.get("https://www.icaionlineregistration.org/Admin_Module/login.aspx");
		Thread.sleep(5000);
		dr2.findElement(By.xpath("//a[contains(text(),'as Student')]")).click();
		dr2.findElement(By.id("txtDob")).click();
		Thread.sleep(5000);
		WebElement yr = dr2.findElement(By.xpath("(//select[@data-event='change'])[2]"));
		Select sc0 =new Select(yr);
		sc0.selectByVisibleText("1995");
		Thread.sleep(5000);
		WebElement mnth = dr2.findElement(By.xpath("(//select[@data-event='change'])[1]"));
		Select sc1 = new Select(mnth);
		sc1.selectByVisibleText("Sep");
		Thread.sleep(5000);
		dr2.findElement(By.xpath("//a[contains(text(),'5')]")).click();
		
	
	}

}
