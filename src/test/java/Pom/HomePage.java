package Pom;

import java.io.IOException;

import org.testng.annotations.Test;

import Resources.Base;

public class HomePage extends Base {
	
	@Test
	
	public void basePageNavigation() throws IOException
	{
		driver = InitializeDriver();
		driver.get("https://id.bookmyshow.com/jakarta");
	}

}
