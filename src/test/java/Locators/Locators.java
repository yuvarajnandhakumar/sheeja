package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commonMethod.CommonAction;

public class Locators extends CommonAction{
	CommonAction ca= new CommonAction();

	public Locators()
	{
		PageFactory.initElements(driver, this);
	}
	

	public WebElement getCreateacc() {
		return createacc;
	}

	@FindBy(xpath = "//span[text()='Create Account']")
	private WebElement createacc;
	
	
	
	
}