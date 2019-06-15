package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject extends BasePage {

	@FindBy(id = "txtUsername")
	private WebElement userName1;
	
	
	public LoginPageObject(){
		PageFactory.initElements(driver, this);
	}	

	public void setTxtUserName(String name) {
		setText(userName1, name);
	}

	public String getEnteredUserName() {
		return userName1.getAttribute("value");
	}

}
