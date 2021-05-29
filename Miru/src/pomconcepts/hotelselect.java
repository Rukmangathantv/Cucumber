package pomconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class hotelselect {
	public static WebDriver dr;
	public hotelselect(WebDriver dr2) {
		this.dr = dr2;
		PageFactory.initElements(dr2, this);
	}
	@FindBy (id = "radiobutton_0")
	private WebElement radiobutton_0;
	@FindBy (id ="continue")
	private WebElement continu;
	@FindBy (id = "cancel")
	private WebElement cancel;
	public WebElement getRadiobutton_0() {
		return radiobutton_0;
	}
	public WebElement getContinu() {
		return continu;
	}
	public WebElement getCancel() {
		return cancel;
	}
	
	
}
