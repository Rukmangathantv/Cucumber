import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Miru\\drivers\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		Actions ac = new Actions(dr);
		
	  	dr.get("http://demo.guru99.com/test/drag_drop.html");
		WebElement d1 = dr.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement d2 = dr.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		ac.dragAndDrop(d1, d2).build().perform();Thread.sleep(3000);
		WebElement d3 = dr.findElement(By.id("fourth"));
		WebElement d4 = dr.findElement(By.id("amt7"));
		ac.dragAndDrop(d3, d4).build().perform();Thread.sleep(3000);
		WebElement d5 = dr.findElement(By.id("credit1"));
		WebElement d6 = dr.findElement(By.id("loan"));
		ac.dragAndDrop(d5, d6).build().perform();Thread.sleep(3000);
		WebElement d7 = dr.findElement(By.id("fourth"));
		WebElement d8 = dr.findElement(By.id("amt8"));
		ac.dragAndDrop(d7, d8).build().perform();Thread.sleep(3000);
		
		dr.navigate().to("http://www.amazon.in");
		WebElement a1 = dr.findElement(By.id("nav-hamburger-menu"));
		ac.click(a1).build().perform();
		WebElement a2 = dr.findElement(By.xpath("(//a[@class='hmenu-item'])[10]"));
		ac.click(a2).build().perform();
		WebElement a3 = dr.findElement(By.xpath("//a[text()='Power Banks']"));
		ac.click(a3).build().perform();		Thread.sleep(3000);
		
		dr.navigate().to("http://www.flipkart.com");
		dr.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement f1 = dr.findElement(By.xpath("(//div[@class='_1psGvi SLyWEo'])[3]"));
		ac.moveToElement(f1).build().perform();
		WebElement f2 = dr.findElement(By.xpath("//a[text()='Living Room']"));
		ac.moveToElement(f2).build().perform();
		WebElement f3 = dr.findElement(By.xpath("//a[text()='Living Room Chairs']"));
		ac.click(f3).build().perform();		Thread.sleep(3000);
		//dr.close();		
		
		dr.navigate().to("http://www.flipkart.com");
		dr.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement f4 = dr.findElement(By.xpath("(//div[@class='_1psGvi SLyWEo'])[3]"));
		ac.contextClick(f4).build().perform();
		
		
	}

}
