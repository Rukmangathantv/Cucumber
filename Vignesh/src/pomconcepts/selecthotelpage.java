package pomconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class selecthotelpage {
public static WebDriver dr;
@FindBy(id = "radiobutton_0")
private WebElement radiobutton ;
@FindBy(id = "continue")
private WebElement continu ;
@FindBy(id ="cancel")
private WebElement cancel;

public selecthotelpage(WebDriver dr2) {
	this.dr =dr2;
	PageFactory.initElements(dr2, this);
}
public WebElement getRadiobutton() {
	return radiobutton;
}
public WebElement getContinu() {
	return continu;
}
public WebElement getCancel() {
	return cancel;
}

}

