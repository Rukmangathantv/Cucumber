package pomconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_pg {
	
	public static WebDriver dr;
	
	@FindBy (id="email")
	private WebElement email;
	
	@FindBy(id="passwd")
	private WebElement password;
	
	@FindBy(id="SubmitLogin")
	private WebElement singin;
	
	public login_pg(WebDriver dr1) {
		this.dr=dr1;
		PageFactory.initElements(dr1, this);
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
		this.password = password;
	}

	public WebElement getSingin() {
		return singin;
	}

	public void setSingin(WebElement singin) {
		this.singin = singin;
	}
	
	

}
