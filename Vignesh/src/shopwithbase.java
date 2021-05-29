import org.openqa.selenium.By;

public class shopwithbase extends baseclass {

	public static void main(String[] args) {
		
		openbrowser("edge");
		geturl("http://automationpractice.com/index.php");
		clicking(dr.findElement(By.xpath("//a[@class='login']")));
		sendkeys(dr.findElement(By.id("email")), "rukmangathan@weather-india.com");
		sendkeys(dr.findElement(By.id("passwd")),"87654321");
		clicking(dr.findElement(By.xpath("//i[@class ='icon-lock left']")));
		clicking(dr.findElement(By.xpath("(//a[text()='T-shirts'])[2]")));
		scrolling(dr.findElement(By.xpath("//span[text()='Styles']")));
		actioning(dr.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]")),"movetoelement",null);
		clicking(dr.findElement(By.xpath("//span[text()='Add to cart']")));
		clicking(dr.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[2]")));
		clicking(dr.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]")));
		clicking(dr.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[7]")));
		clicking(dr.findElement(By.name("cgv")));
		clicking(dr.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]")));
		clicking(dr.findElement(By.className("cheque")));
		clicking(dr.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]")));	
	}

}
