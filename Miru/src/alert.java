import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Miru\\drivers\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		Thread.sleep(2000);
		dr.findElement(By.id("alertButton")).click();
		dr.switchTo().alert().accept();Thread.sleep(2000);
		dr.findElement(By.id("timerAlertButton")).click();Thread.sleep(6000);
		dr.switchTo().alert().accept();
		dr.findElement(By.id("confirmButton")).click();Thread.sleep(2000);
		dr.switchTo().alert().dismiss();Thread.sleep(2000);
		dr.findElement(By.id("promtButton")).click();Thread.sleep(2000);
		dr.switchTo().alert().sendKeys("miru");Thread.sleep(2000);
		dr.switchTo().alert().accept();Thread.sleep(2000);
		//sbi
		dr.navigate().to("https://retail.onlinesbi.com/retail/login.htm");Thread.sleep(4000);
		dr.findElement(By.xpath("(//a[text()='CONTINUE TO LOGIN'])[1]")).click();Thread.sleep(2000);
		dr.findElement(By.id("Button2")).click();Thread.sleep(2000);
		dr.switchTo().alert().accept();Thread.sleep(2000);
		//canara
		dr.navigate().to("https://netbanking.canarabank.in/entry/ENULogin.jsp");Thread.sleep(2000);
		dr.findElement(By.xpath("//input[@value='SIGN IN']")).click();Thread.sleep(2000);
		dr.switchTo().alert().accept();Thread.sleep(2000);
		//icici
		dr.navigate().to("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		Thread.sleep(2000);
		dr.findElement(By.id("user-id-goahead")).click();
		Thread.sleep(2000);
		dr.findElement(By.id("VALIDATE_CREDENTIALS1")).click();
		Thread.sleep(2000);
		dr.switchTo().alert().accept();
		dr.close();
	
	}

}
