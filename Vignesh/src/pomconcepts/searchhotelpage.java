package pomconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchhotelpage {
	public static WebDriver dr ;
	@FindBy(id = "location")
	private WebElement location;
	@FindBy(id = "hotels")
	private WebElement hotels_type;
	@FindBy(id ="room_type")
	private WebElement room_type;
	@FindBy(id = "room_nos")
	private WebElement room_nos;
	@FindBy(id ="datepick_in")
	private WebElement datepick_in;
	@FindBy(id = "datepick_out")
	private WebElement datepick_out;
	@FindBy(id = "adult_room")
	private WebElement adult_room;
	@FindBy(id = "child_room")
	private WebElement child_room;
	@FindBy(id ="Submit")
	private WebElement submit;
	@FindBy(id = "reset")
	private WebElement reset;
	 
	public searchhotelpage(WebDriver dr2) {
		this.dr = dr2;
		PageFactory.initElements(dr2, this);
	}
	
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels_type() {
		return hotels_type;
	}
	public WebElement getRoom_type() {
		return room_type;
	}
	public WebElement getRoom_nos() {
		return room_nos;
	}
	public WebElement getDatepick_in() {
		return datepick_in;
	}
	public WebElement getDatepick_out() {
		return datepick_out;
	}
	public WebElement getAdult_room() {
		return adult_room;
	}
	public WebElement getChild_room() {
		return child_room;
	}
	public WebElement getSubmit() {
		return submit;
	}
	public WebElement getReset() {
		return reset;
	}

}
