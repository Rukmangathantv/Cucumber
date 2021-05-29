import org.openqa.selenium.By;

public class shopwithbaseclass extends baseclass {

	public static void main(String[] args) {
		openbrowser("chrome");
		geturl("http://automationpractice.com/index.php");
		clicking(dr.findElement(By.xpath("//a[@class='login']")));
		sendkeys(dr.findElement(By.id("email")), "mirunalini0506@gmail.com");
		sendkeys(dr.findElement(By.id("passwd")),"12345678");
		clicking(dr.findElement(By.xpath("//i[@class ='icon-lock left']")));
		clicking(dr.findElement(By.xpath("(//a[text()='T-shirts'])[2]")));
		scrolling(dr.findElement(By.xpath("//span[text()='Styles']")));
		actioning(dr.findElement(By.xpath("(//img[@class='replace-2x img-responsive'])[2]")), "movetoelement", null);
		clicking(dr.findElement(By.xpath("//span[text()='More']")));
		clicking(dr.findElement(By.xpath("//i[@class='icon-plus']")));
		dropdown(dr.findElement(By.id("group_1")), "byvalue", "2");
		clicking(dr.findElement(By.id("color_14")));
		clicking(dr.findElement(By.xpath("//button[@class='exclusive']")));
		clicking(dr.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[2]")));
		clicking(dr.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]")));
		clicking(dr.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[7]")));
		clicking(dr.findElement(By.name("cgv")));
		clicking(dr.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]")));
		clicking(dr.findElement(By.className("cheque")));
		clicking(dr.findElement(By.xpath("(//i[@class='icon-chevron-right right'])[3]")));
		scrolling(dr.findElement(By.xpath("//div[@class='breadcrumb clearfix']")));
		screenshot("C:\\Users\\User\\eclipse-workspace\\Miru\\screenshot pics\\shoping3.png");
		
	}

}
