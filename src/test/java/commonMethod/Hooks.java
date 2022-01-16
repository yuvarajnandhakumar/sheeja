package commonMethod;
import java.io.FileNotFoundException;
import java.io.IOException;

import commonMethod.CommonAction;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends CommonAction {
	
	CommonAction ca= new CommonAction();
	
	@Before
	public void launch(String string) throws FileNotFoundException, IOException
	{
		launch(ca.getproperty("url"));
	}

	@After
	public void close()
	{
		System.out.println("done");
	}
}
