package StepDefinition;


import Locators.Locators;
import commonMethod.CommonAction;
import cucumber.api.java.en.Given;

public class StepDef extends CommonAction{

	Locators lo=new Locators();
		CommonAction ca= new CommonAction();

@Given("click createAccount")
public void click_createAccount() throws InterruptedException {
	
	ca.click(lo.getCreateacc());
   
}


}
