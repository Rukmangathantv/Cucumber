package pomconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bookingconfirmationpage {
public static WebDriver dr ;
public bookingconfirmationpage(WebDriver dr2) {
	this.dr =dr2;
	PageFactory.initElements(dr2,this);
}
@FindBy (id = "search_hotel")
private WebElement search_hotel;
@FindBy (id = "my_itinerary")
private WebElement my_itinerary;
@FindBy (id = "logout")
private WebElement logout;
public WebElement getSearch_hotel() {
	return search_hotel;
	
}
public WebElement getMy_itinerary() {
	return my_itinerary;
}
public WebElement getLogout() {
	return logout;
}

}
